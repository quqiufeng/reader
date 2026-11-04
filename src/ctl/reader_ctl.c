#include <sys/socket.h>
#include <sys/un.h>
#include <sys/time.h>
#include <unistd.h>
#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <errno.h>

#ifndef MSG_NOSIGNAL
#define MSG_NOSIGNAL 0x4000
#endif

typedef struct rdctl_t {
    int fd;
} rdctl_t;

rdctl_t *rdctl_open(const char *path)
{
    if (!path) return NULL;
    int fd = socket(AF_UNIX, SOCK_STREAM, 0);
    if (fd < 0) return NULL;

    struct sockaddr_un addr;
    memset(&addr, 0, sizeof(addr));
    addr.sun_family = AF_UNIX;
    strncpy(addr.sun_path, path, sizeof(addr.sun_path) - 1);

    if (connect(fd, (struct sockaddr *)&addr, sizeof(addr)) != 0) {
        close(fd);
        return NULL;
    }

    struct timeval tv;
    tv.tv_sec = 2;
    tv.tv_usec = 0;
    setsockopt(fd, SOL_SOCKET, SO_RCVTIMEO, &tv, sizeof(tv));
    setsockopt(fd, SOL_SOCKET, SO_SNDTIMEO, &tv, sizeof(tv));

    rdctl_t *c = (rdctl_t *)calloc(1, sizeof(rdctl_t));
    if (!c) {
        close(fd);
        return NULL;
    }
    c->fd = fd;
    return c;
}

void rdctl_close(rdctl_t *c)
{
    if (!c) return;
    close(c->fd);
    free(c);
}

static int exchange(rdctl_t *c, const char *req, char *out, int outlen)
{
    if (!c || !req || !out || outlen <= 0) return -1;

    size_t len = strlen(req);
    if (send(c->fd, req, len, MSG_NOSIGNAL) != (ssize_t)len) return -2;
    if (send(c->fd, "\n", 1, MSG_NOSIGNAL) != 1) return -3;

    int total = 0;
    while (total < outlen - 1) {
        ssize_t r = recv(c->fd, out + total, (size_t)(outlen - 1 - total), 0);
        if (r <= 0) break;
        total += (int)r;
        if (out[total - 1] == '\n') break;
    }
    out[total] = 0;
    if (total > 0 && out[total - 1] == '\n') out[total - 1] = 0;
    return (int)strlen(out);
}

int rdctl_call(rdctl_t *c, const char *req, char *out, int outlen)
{
    return exchange(c, req, out, outlen);
}

int rdctl_list(rdctl_t *c, char *out, int outlen)
{
    return exchange(c, "{\"cmd\":\"list\"}", out, outlen);
}

int rdctl_state(rdctl_t *c, char *out, int outlen)
{
    return exchange(c, "{\"cmd\":\"state\"}", out, outlen);
}

int rdctl_ping(rdctl_t *c, char *out, int outlen)
{
    return exchange(c, "{\"cmd\":\"ping\"}", out, outlen);
}

int rdctl_click(rdctl_t *c, const char *id, char *out, int outlen)
{
    if (!id) return -1;
    char req[512];
    snprintf(req, sizeof(req), "{\"cmd\":\"click\",\"id\":\"%s\"}", id);
    return exchange(c, req, out, outlen);
}
