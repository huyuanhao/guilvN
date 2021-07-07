package com.p118pd.sdk;

import com.bumptech.glide.load.engine.GlideException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Vector;

/* renamed from: com.pd.sdk.I1I1LI丨l  reason: invalid class name */
public class I1I1LIl {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f15296OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f15297OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15298OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15299OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Vector f15300OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f15301OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15302OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f15303OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f15304OooO0OO;

    public I1I1LIl(AbstractC6436l11LI r6, byte[][] bArr, int[] iArr) {
        this.f15296OooO00o = r6;
        this.OooO00o = iArr[0];
        this.OooO0O0 = iArr[1];
        this.OooO0OO = iArr[2];
        if (iArr[3] == 1) {
            this.f15301OooO0O0 = true;
        } else {
            this.f15301OooO0O0 = false;
        }
        if (iArr[4] == 1) {
            this.f15298OooO00o = true;
        } else {
            this.f15298OooO00o = false;
        }
        if (iArr[5] == 1) {
            this.f15303OooO0OO = true;
        } else {
            this.f15303OooO0OO = false;
        }
        this.f15300OooO0O0 = new Vector();
        for (int i = 0; i < this.OooO0O0; i++) {
            this.f15300OooO0O0.addElement(I11I.OooO00o(iArr[i + 6]));
        }
        this.f15299OooO00o = bArr[0];
        this.f15302OooO0O0 = bArr[1];
        this.f15304OooO0OO = bArr[2];
        this.f15297OooO00o = new Vector();
        for (int i2 = 0; i2 < this.OooO0O0; i2++) {
            this.f15297OooO00o.addElement(bArr[i2 + 3]);
        }
    }

    public I1I1LIl(Vector vector, int i, AbstractC6436l11LI r3) {
        this.f15297OooO00o = vector;
        this.OooO00o = i;
        this.f15299OooO00o = null;
        this.f15298OooO00o = false;
        this.f15301OooO0O0 = false;
        this.f15303OooO0OO = false;
        this.f15296OooO00o = r3;
        this.f15304OooO0OO = new byte[r3.OooO0O0()];
        this.f15302OooO0O0 = new byte[this.f15296OooO00o.OooO0O0()];
    }

    public int OooO00o() {
        return this.f15299OooO00o == null ? this.OooO00o : this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Vector m15240OooO00o() {
        return this.f15297OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15241OooO00o() {
        this.f15298OooO00o = false;
        this.f15301OooO0O0 = false;
        this.f15299OooO00o = null;
        this.OooO0O0 = 0;
        this.OooO0OO = -1;
    }

    public void OooO00o(C6237iiL iil) {
        iil.m17248OooO00o(this.f15304OooO0OO);
    }

    public void OooO00o(C6237iiL iil, byte[] bArr) {
        PrintStream printStream;
        String str;
        if (this.f15301OooO0O0) {
            printStream = System.err;
            str = "No more update possible for treehash instance!";
        } else if (!this.f15298OooO00o) {
            printStream = System.err;
            str = "Treehash instance not initialized before update";
        } else {
            byte[] bArr2 = new byte[this.f15296OooO00o.OooO0O0()];
            iil.m17248OooO00o(this.f15302OooO0O0);
            if (this.f15299OooO00o == null) {
                this.f15299OooO00o = bArr;
                this.OooO0OO = 0;
            } else {
                int i = 0;
                while (this.OooO0O0 > 0 && i == ((Integer) this.f15300OooO0O0.lastElement()).intValue()) {
                    int OooO0O02 = this.f15296OooO00o.OooO0O0() << 1;
                    byte[] bArr3 = new byte[OooO0O02];
                    System.arraycopy(this.f15297OooO00o.lastElement(), 0, bArr3, 0, this.f15296OooO00o.OooO0O0());
                    Vector vector = this.f15297OooO00o;
                    vector.removeElementAt(vector.size() - 1);
                    Vector vector2 = this.f15300OooO0O0;
                    vector2.removeElementAt(vector2.size() - 1);
                    System.arraycopy(bArr, 0, bArr3, this.f15296OooO00o.OooO0O0(), this.f15296OooO00o.OooO0O0());
                    this.f15296OooO00o.update(bArr3, 0, OooO0O02);
                    bArr = new byte[this.f15296OooO00o.OooO0O0()];
                    this.f15296OooO00o.OooO00o(bArr, 0);
                    i++;
                    this.OooO0O0--;
                }
                this.f15297OooO00o.addElement(bArr);
                this.f15300OooO0O0.addElement(I11I.OooO00o(i));
                this.OooO0O0++;
                if (((Integer) this.f15300OooO0O0.lastElement()).intValue() == this.OooO0OO) {
                    int OooO0O03 = this.f15296OooO00o.OooO0O0() << 1;
                    byte[] bArr4 = new byte[OooO0O03];
                    System.arraycopy(this.f15299OooO00o, 0, bArr4, 0, this.f15296OooO00o.OooO0O0());
                    System.arraycopy(this.f15297OooO00o.lastElement(), 0, bArr4, this.f15296OooO00o.OooO0O0(), this.f15296OooO00o.OooO0O0());
                    Vector vector3 = this.f15297OooO00o;
                    vector3.removeElementAt(vector3.size() - 1);
                    Vector vector4 = this.f15300OooO0O0;
                    vector4.removeElementAt(vector4.size() - 1);
                    this.f15296OooO00o.update(bArr4, 0, OooO0O03);
                    byte[] bArr5 = new byte[this.f15296OooO00o.OooO0O0()];
                    this.f15299OooO00o = bArr5;
                    this.f15296OooO00o.OooO00o(bArr5, 0);
                    this.OooO0OO++;
                    this.OooO0O0 = 0;
                }
            }
            if (this.OooO0OO == this.OooO00o) {
                this.f15301OooO0O0 = true;
                return;
            }
            return;
        }
        printStream.println(str);
    }

    public void OooO00o(byte[] bArr) {
        System.arraycopy(bArr, 0, this.f15304OooO0OO, 0, this.f15296OooO00o.OooO0O0());
        this.f15303OooO0OO = true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15242OooO00o() {
        return this.f15301OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15243OooO00o() {
        return this.f15299OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m15244OooO00o() {
        int i = this.OooO0O0;
        int[] iArr = new int[(i + 6)];
        iArr[0] = this.OooO00o;
        iArr[1] = i;
        iArr[2] = this.OooO0OO;
        if (this.f15301OooO0O0) {
            iArr[3] = 1;
        } else {
            iArr[3] = 0;
        }
        if (this.f15298OooO00o) {
            iArr[4] = 1;
        } else {
            iArr[4] = 0;
        }
        if (this.f15303OooO0OO) {
            iArr[5] = 1;
        } else {
            iArr[5] = 0;
        }
        for (int i2 = 0; i2 < this.OooO0O0; i2++) {
            iArr[i2 + 6] = ((Integer) this.f15300OooO0O0.elementAt(i2)).intValue();
        }
        return iArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[][] m15245OooO00o() {
        int[] iArr = new int[2];
        iArr[1] = this.f15296OooO00o.OooO0O0();
        iArr[0] = this.OooO0O0 + 3;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        bArr[0] = this.f15299OooO00o;
        bArr[1] = this.f15302OooO0O0;
        bArr[2] = this.f15304OooO0OO;
        for (int i = 0; i < this.OooO0O0; i++) {
            bArr[i + 3] = (byte[]) this.f15297OooO00o.elementAt(i);
        }
        return bArr;
    }

    public int OooO0O0() {
        return this.f15299OooO00o == null ? this.OooO00o : this.OooO0O0 == 0 ? this.OooO0OO : Math.min(this.OooO0OO, ((Integer) this.f15300OooO0O0.lastElement()).intValue());
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m15246OooO0O0() {
        if (!this.f15303OooO0OO) {
            PrintStream printStream = System.err;
            printStream.println("Seed " + this.OooO00o + " not initialized");
            return;
        }
        this.f15300OooO0O0 = new Vector();
        this.OooO0O0 = 0;
        this.f15299OooO00o = null;
        this.OooO0OO = -1;
        this.f15298OooO00o = true;
        System.arraycopy(this.f15304OooO0OO, 0, this.f15302OooO0O0, 0, this.f15296OooO00o.OooO0O0());
    }

    public void OooO0O0(byte[] bArr) {
        if (!this.f15298OooO00o) {
            m15246OooO0O0();
        }
        this.f15299OooO00o = bArr;
        this.OooO0OO = this.OooO00o;
        this.f15301OooO0O0 = true;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15247OooO0O0() {
        return this.f15298OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m15248OooO0O0() {
        return this.f15302OooO0O0;
    }

    public String toString() {
        StringBuilder sb;
        String str = "Treehash    : ";
        for (int i = 0; i < this.OooO0O0 + 6; i++) {
            str = str + m15244OooO00o()[i] + " ";
        }
        for (int i2 = 0; i2 < this.OooO0O0 + 3; i2++) {
            if (m15245OooO00o()[i2] != null) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(new String(C6472l1l1l.OooO0O0(m15245OooO00o()[i2])));
                sb.append(" ");
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append("null ");
            }
            str = sb.toString();
        }
        return str + GlideException.OooO00o.o0ooOoO + this.f15296OooO00o.OooO0O0();
    }
}
