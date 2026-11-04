package com.zentraedi.outreader.util;

import com.zentraedi.basic.function.utils.k0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class f {
    public static final int a = 11;
    public static final int b = 20;
    public static final int c = 1;

    public static int a(int speedMode) {
        int iJ = k0.j(com.zentraedi.basic.function.utils.a.a());
        switch (speedMode) {
            case 1:
                return iJ / 350;
            case 2:
                return iJ / 280;
            case 3:
                return iJ / 210;
            case 4:
                return iJ / 140;
            case 5:
                return iJ / 120;
            case 6:
                return iJ / 100;
            case 7:
                return iJ / 90;
            case 8:
                return iJ / 80;
            case 9:
                return iJ / 75;
            case 10:
                return iJ / 70;
            case 11:
            default:
                return iJ / 65;
            case 12:
                return iJ / 60;
            case 13:
                return iJ / 55;
            case 14:
                return iJ / 50;
            case 15:
                return iJ / 45;
            case 16:
                return iJ / 40;
            case 17:
                return iJ / 35;
            case 18:
                return iJ / 30;
            case 19:
                return iJ / 25;
            case 20:
                return iJ / 20;
        }
    }

    public static int b(int speedMode) {
        float f;
        switch (speedMode) {
            case 1:
                f = 50.0f;
                break;
            case 2:
                f = 47.5f;
                break;
            case 3:
                f = 45.0f;
                break;
            case 4:
                f = 42.5f;
                break;
            case 5:
                f = 40.0f;
                break;
            case 6:
                f = 37.5f;
                break;
            case 7:
                f = 35.0f;
                break;
            case 8:
                f = 32.5f;
                break;
            case 9:
                f = 30.0f;
                break;
            case 10:
                f = 27.5f;
                break;
            case 11:
            default:
                f = 25.0f;
                break;
            case 12:
                f = 22.5f;
                break;
            case 13:
                f = 20.0f;
                break;
            case 14:
                f = 17.5f;
                break;
            case 15:
                f = 15.0f;
                break;
            case 16:
                f = 12.5f;
                break;
            case 17:
                f = 10.0f;
                break;
            case 18:
                f = 7.5f;
                break;
            case 19:
                f = 5.0f;
                break;
            case 20:
                f = 2.5f;
                break;
        }
        return (int) (f * 1000.0f);
    }
}
