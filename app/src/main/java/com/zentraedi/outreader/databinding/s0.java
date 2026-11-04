package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.zentraedi.outreader.widget.TypeFaceTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class s0 extends r0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i v6 = null;

    @androidx.annotation.p0
    private static final SparseIntArray w6;
    private long u6;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        w6 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.Xy, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Wy, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.DL, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.FL, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Vj, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.mz, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.nz, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.nj, 8);
        sparseIntArray.put(com.zentraedi.outreader.d.i.vC, 9);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ej, 10);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Lz, 11);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Fn, 12);
        sparseIntArray.put(com.zentraedi.outreader.d.i.aN, 13);
        sparseIntArray.put(com.zentraedi.outreader.d.i.jL, 14);
        sparseIntArray.put(com.zentraedi.outreader.d.i.iz, 15);
        sparseIntArray.put(com.zentraedi.outreader.d.i.xM, 16);
        sparseIntArray.put(com.zentraedi.outreader.d.i.cj, 17);
        sparseIntArray.put(com.zentraedi.outreader.d.i.zM, 18);
        sparseIntArray.put(com.zentraedi.outreader.d.i.dj, 19);
        sparseIntArray.put(com.zentraedi.outreader.d.i.yM, 20);
        sparseIntArray.put(com.zentraedi.outreader.d.i.lz, 21);
        sparseIntArray.put(com.zentraedi.outreader.d.i.TM, 22);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ak, 23);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ck, 24);
        sparseIntArray.put(com.zentraedi.outreader.d.i.dk, 25);
        sparseIntArray.put(com.zentraedi.outreader.d.i.bk, 26);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Pz, 27);
        sparseIntArray.put(com.zentraedi.outreader.d.i.yO, 28);
        sparseIntArray.put(com.zentraedi.outreader.d.i.pN, 29);
        sparseIntArray.put(com.zentraedi.outreader.d.i.uN, 30);
        sparseIntArray.put(com.zentraedi.outreader.d.i.sN, 31);
        sparseIntArray.put(com.zentraedi.outreader.d.i.tN, 32);
        sparseIntArray.put(com.zentraedi.outreader.d.i.rN, 33);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Yy, 34);
        sparseIntArray.put(com.zentraedi.outreader.d.i.IL, 35);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ni, 36);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ny, 37);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Di, 38);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Mz, 39);
        sparseIntArray.put(com.zentraedi.outreader.d.i.kz, 40);
        sparseIntArray.put(com.zentraedi.outreader.d.i.RM, 41);
        sparseIntArray.put(com.zentraedi.outreader.d.i.lj, 42);
        sparseIntArray.put(com.zentraedi.outreader.d.i.RA, 43);
        sparseIntArray.put(com.zentraedi.outreader.d.i.mj, 44);
        sparseIntArray.put(com.zentraedi.outreader.d.i.mO, 45);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Xn, 46);
        sparseIntArray.put(com.zentraedi.outreader.d.i.oO, 47);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Yn, 48);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ti, 49);
        sparseIntArray.put(com.zentraedi.outreader.d.i.pO, 50);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Zn, 51);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ej, 52);
        sparseIntArray.put(com.zentraedi.outreader.d.i.qO, 53);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ao, 54);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Tj, 55);
        sparseIntArray.put(com.zentraedi.outreader.d.i.rO, 56);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Qy, 57);
        sparseIntArray.put(com.zentraedi.outreader.d.i.pL, 58);
        sparseIntArray.put(com.zentraedi.outreader.d.i.se, 59);
        sparseIntArray.put(com.zentraedi.outreader.d.i.QB, 60);
        sparseIntArray.put(com.zentraedi.outreader.d.i.sG, 61);
        sparseIntArray.put(com.zentraedi.outreader.d.i.cf, 62);
        sparseIntArray.put(com.zentraedi.outreader.d.i.be, 63);
        sparseIntArray.put(com.zentraedi.outreader.d.i.mn, 64);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Oy, 65);
        sparseIntArray.put(com.zentraedi.outreader.d.i.nL, 66);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ek, 67);
        sparseIntArray.put(com.zentraedi.outreader.d.i.gO, 68);
        sparseIntArray.put(com.zentraedi.outreader.d.i.fk, 69);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Py, 70);
        sparseIntArray.put(com.zentraedi.outreader.d.i.oL, 71);
        sparseIntArray.put(com.zentraedi.outreader.d.i.kL, 72);
        sparseIntArray.put(com.zentraedi.outreader.d.i.lL, 73);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ai, 74);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Mn, 75);
        sparseIntArray.put(com.zentraedi.outreader.d.i.KN, 76);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Jz, 77);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Vy, 78);
        sparseIntArray.put(com.zentraedi.outreader.d.i.QM, 79);
        sparseIntArray.put(com.zentraedi.outreader.d.i.pt, 80);
        sparseIntArray.put(com.zentraedi.outreader.d.i.jN, 81);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Kz, 82);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Xj, 83);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Zy, 84);
        sparseIntArray.put(com.zentraedi.outreader.d.i.rz, 85);
        sparseIntArray.put(com.zentraedi.outreader.d.i.tj, 86);
        sparseIntArray.put(com.zentraedi.outreader.d.i.WM, 87);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ga, 88);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Si, 89);
        sparseIntArray.put(com.zentraedi.outreader.d.i.SM, 90);
        sparseIntArray.put(com.zentraedi.outreader.d.i.sj, 91);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Cz, 92);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Qj, 93);
        sparseIntArray.put(com.zentraedi.outreader.d.i.bO, 94);
        sparseIntArray.put(com.zentraedi.outreader.d.i.In, 95);
        sparseIntArray.put(com.zentraedi.outreader.d.i.wz, 96);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Hj, 97);
        sparseIntArray.put(com.zentraedi.outreader.d.i.xN, 98);
        sparseIntArray.put(com.zentraedi.outreader.d.i.zt, 99);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Gj, 100);
        sparseIntArray.put(com.zentraedi.outreader.d.i.wN, 101);
        sparseIntArray.put(com.zentraedi.outreader.d.i.xz, 102);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ij, 103);
        sparseIntArray.put(com.zentraedi.outreader.d.i.yN, 104);
    }

    public s0(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 105, v6, w6));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.u6 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.u6 = 1L;
        }
        C0();
    }

    public boolean l1(int variableId, @androidx.annotation.p0 Object variable) {
        return true;
    }

    protected boolean o0(int localFieldId, Object object, int fieldId) {
        return false;
    }

    protected void r() {
        synchronized (this) {
            this.u6 = 0L;
        }
    }

    private s0(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (RelativeLayout) bindings[88], (ImageView) bindings[63], (ImageView) bindings[59], (ImageView) bindings[62], (ImageView) bindings[74], (ImageView) bindings[38], (ImageView) bindings[36], (ImageView) bindings[89], (ImageView) bindings[49], (ImageView) bindings[17], (ImageView) bindings[19], (ImageView) bindings[10], (ImageView) bindings[42], (ImageView) bindings[44], (ImageView) bindings[8], (ImageView) bindings[91], (ImageView) bindings[86], (ImageView) bindings[52], (ImageView) bindings[100], (ImageView) bindings[97], (ImageView) bindings[103], (ImageView) bindings[93], (ImageView) bindings[55], (ImageView) bindings[5], (ImageView) bindings[83], (ImageView) bindings[23], (ImageView) bindings[26], (ImageView) bindings[24], (ImageView) bindings[25], (ImageView) bindings[67], (ImageView) bindings[69], (LinearLayout) bindings[64], (RelativeLayout) bindings[12], (LinearLayout) bindings[95], (RelativeLayout) bindings[75], (LinearLayout) bindings[0], (RelativeLayout) bindings[46], (RelativeLayout) bindings[48], (RelativeLayout) bindings[51], (RelativeLayout) bindings[54], (SeekBar) bindings[80], (RelativeLayout) bindings[99], (RelativeLayout) bindings[37], (LinearLayout) bindings[65], (LinearLayout) bindings[70], (LinearLayout) bindings[57], (RelativeLayout) bindings[78], (RelativeLayout) bindings[2], (RelativeLayout) bindings[1], (RelativeLayout) bindings[34], (LinearLayout) bindings[84], (LinearLayout) bindings[15], (LinearLayout) bindings[40], (LinearLayout) bindings[21], (RelativeLayout) bindings[6], (RelativeLayout) bindings[7], (RelativeLayout) bindings[85], (RelativeLayout) bindings[96], (RelativeLayout) bindings[102], (RelativeLayout) bindings[92], (RelativeLayout) bindings[77], (RelativeLayout) bindings[82], (LinearLayout) bindings[11], (LinearLayout) bindings[39], (LinearLayout) bindings[27], (SeekBar) bindings[43], (ImageView) bindings[60], (View) bindings[9], (ImageView) bindings[61], (TextView) bindings[14], (TextView) bindings[72], (TextView) bindings[73], (TextView) bindings[66], (TextView) bindings[71], (TextView) bindings[58], (TextView) bindings[3], (TextView) bindings[4], (TextView) bindings[35], (TextView) bindings[16], (TextView) bindings[20], (TextView) bindings[18], (TextView) bindings[79], (TextView) bindings[41], (TextView) bindings[90], (TextView) bindings[22], (TextView) bindings[87], (TextView) bindings[13], (TextView) bindings[81], (TextView) bindings[29], (TextView) bindings[33], (TextView) bindings[31], (TextView) bindings[32], (TextView) bindings[30], (TextView) bindings[101], (TextView) bindings[98], (TextView) bindings[104], (TextView) bindings[76], (TextView) bindings[94], (TextView) bindings[68], (TextView) bindings[45], (TextView) bindings[47], (TypeFaceTextView) bindings[50], (TypeFaceTextView) bindings[53], (TypeFaceTextView) bindings[56], (TextView) bindings[28]);
        this.u6 = -1L;
        this.n0.setTag(null);
        P0(root);
        i0();
    }
}
