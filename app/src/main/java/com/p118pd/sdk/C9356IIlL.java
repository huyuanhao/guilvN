package com.p118pd.sdk;

import com.bumptech.glide.load.engine.GlideException;
import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Vector;

/* renamed from: com.pd.sdk.丨IIl丨L  reason: invalid class name and case insensitive filesystem */
public class C9356IIlL {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f22890OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9696lLl1 f22891OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f22892OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22893OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f22894OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f22895OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1I1LIl[] f22896OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector[] f22897OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[][] f22898OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Vector f22899OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f22900OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o0;

    public C9356IIlL(int i, int i2, AbstractC9696lLl1 r5) {
        this.OooO00o = i;
        this.f22891OooO00o = r5;
        AbstractC6436l11LI OooO00o2 = r5.OooO00o();
        this.f22890OooO00o = OooO00o2;
        int OooO0O02 = OooO00o2.OooO0O0();
        this.OooO0O0 = OooO0O02;
        this.OooO0OO = i2;
        this.f22895OooO00o = new int[i];
        int[] iArr = new int[2];
        iArr[1] = OooO0O02;
        iArr[0] = i;
        this.f22898OooO00o = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f22894OooO00o = new byte[this.OooO0O0];
        this.f22897OooO00o = new Vector[(this.OooO0OO - 1)];
        for (int i3 = 0; i3 < i2 - 1; i3++) {
            this.f22897OooO00o[i3] = new Vector();
        }
    }

    public C9356IIlL(AbstractC6436l11LI r7, byte[][] bArr, int[] iArr, I1I1LIl[] r10, Vector[] vectorArr) {
        this.f22890OooO00o = this.f22891OooO00o.OooO00o();
        this.f22891OooO00o = this.f22891OooO00o;
        this.OooO00o = iArr[0];
        this.OooO0O0 = iArr[1];
        this.OooO0OO = iArr[2];
        this.OooO0Oo = iArr[3];
        this.OooO0o0 = iArr[4];
        if (iArr[5] == 1) {
            this.f22900OooO0O0 = true;
        } else {
            this.f22900OooO0O0 = false;
        }
        if (iArr[6] == 1) {
            this.f22893OooO00o = true;
        } else {
            this.f22893OooO00o = false;
        }
        int i = iArr[7];
        this.f22895OooO00o = new int[this.OooO00o];
        for (int i2 = 0; i2 < this.OooO00o; i2++) {
            this.f22895OooO00o[i2] = iArr[i2 + 8];
        }
        this.f22899OooO0O0 = new Vector();
        for (int i3 = 0; i3 < i; i3++) {
            this.f22899OooO0O0.addElement(I11I.OooO00o(iArr[this.OooO00o + 8 + i3]));
        }
        this.f22894OooO00o = bArr[0];
        int i4 = this.OooO00o;
        int[] iArr2 = new int[2];
        iArr2[1] = this.OooO0O0;
        iArr2[0] = i4;
        this.f22898OooO00o = (byte[][]) Array.newInstance(byte.class, iArr2);
        int i5 = 0;
        while (i5 < this.OooO00o) {
            int i6 = i5 + 1;
            this.f22898OooO00o[i5] = bArr[i6];
            i5 = i6;
        }
        this.f22892OooO00o = new Vector();
        for (int i7 = 0; i7 < i; i7++) {
            this.f22892OooO00o.addElement(bArr[this.OooO00o + 1 + i7]);
        }
        this.f22896OooO00o = C9339I1LLi.OooO00o(r10);
        this.f22897OooO00o = C9339I1LLi.OooO00o(vectorArr);
    }

    public Vector OooO00o() {
        Vector vector = new Vector();
        Enumeration elements = this.f22892OooO00o.elements();
        while (elements.hasMoreElements()) {
            vector.addElement(elements.nextElement());
        }
        return vector;
    }

    public void OooO00o(Vector vector) {
        int i;
        this.f22896OooO00o = new I1I1LIl[(this.OooO00o - this.OooO0OO)];
        int i2 = 0;
        while (true) {
            i = this.OooO00o;
            if (i2 >= i - this.OooO0OO) {
                break;
            }
            this.f22896OooO00o[i2] = new I1I1LIl(vector, i2, this.f22891OooO00o.OooO00o());
            i2++;
        }
        this.f22895OooO00o = new int[i];
        int[] iArr = new int[2];
        iArr[1] = this.OooO0O0;
        iArr[0] = i;
        this.f22898OooO00o = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f22894OooO00o = new byte[this.OooO0O0];
        this.f22892OooO00o = new Vector();
        this.f22899OooO0O0 = new Vector();
        this.f22893OooO00o = true;
        this.f22900OooO0O0 = false;
        for (int i3 = 0; i3 < this.OooO00o; i3++) {
            this.f22895OooO00o[i3] = -1;
        }
        this.f22897OooO00o = new Vector[(this.OooO0OO - 1)];
        for (int i4 = 0; i4 < this.OooO0OO - 1; i4++) {
            this.f22897OooO00o[i4] = new Vector();
        }
        this.OooO0Oo = 3;
        this.OooO0o0 = 0;
    }

    public void OooO00o(byte[] bArr) {
        if (this.f22900OooO0O0) {
            System.out.print("Too much updates for Tree!!");
        } else if (!this.f22893OooO00o) {
            System.err.println("GMSSRootCalc not initialized!");
        } else {
            int[] iArr = this.f22895OooO00o;
            iArr[0] = iArr[0] + 1;
            if (iArr[0] == 1) {
                System.arraycopy(bArr, 0, this.f22898OooO00o[0], 0, this.OooO0O0);
            } else if (iArr[0] == 3 && this.OooO00o > this.OooO0OO) {
                this.f22896OooO00o[0].OooO0O0(bArr);
            }
            int[] iArr2 = this.f22895OooO00o;
            if ((iArr2[0] - 3) % 2 == 0 && iArr2[0] >= 3 && this.OooO00o == this.OooO0OO) {
                this.f22897OooO00o[0].insertElementAt(bArr, 0);
            }
            if (this.f22895OooO00o[0] == 0) {
                this.f22892OooO00o.addElement(bArr);
                this.f22899OooO0O0.addElement(I11I.OooO00o(0));
                return;
            }
            int i = this.OooO0O0;
            byte[] bArr2 = new byte[i];
            int i2 = i << 1;
            byte[] bArr3 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i3 = 0;
            while (this.f22892OooO00o.size() > 0 && i3 == ((Integer) this.f22899OooO0O0.lastElement()).intValue()) {
                System.arraycopy(this.f22892OooO00o.lastElement(), 0, bArr3, 0, this.OooO0O0);
                Vector vector = this.f22892OooO00o;
                vector.removeElementAt(vector.size() - 1);
                Vector vector2 = this.f22899OooO0O0;
                vector2.removeElementAt(vector2.size() - 1);
                int i4 = this.OooO0O0;
                System.arraycopy(bArr2, 0, bArr3, i4, i4);
                this.f22890OooO00o.update(bArr3, 0, i2);
                bArr2 = new byte[this.f22890OooO00o.OooO0O0()];
                this.f22890OooO00o.OooO00o(bArr2, 0);
                i3++;
                if (i3 < this.OooO00o) {
                    int[] iArr3 = this.f22895OooO00o;
                    iArr3[i3] = iArr3[i3] + 1;
                    if (iArr3[i3] == 1) {
                        System.arraycopy(bArr2, 0, this.f22898OooO00o[i3], 0, this.OooO0O0);
                    }
                    if (i3 >= this.OooO00o - this.OooO0OO) {
                        if (i3 == 0) {
                            System.out.println("M���P");
                        }
                        int[] iArr4 = this.f22895OooO00o;
                        if ((iArr4[i3] - 3) % 2 == 0 && iArr4[i3] >= 3) {
                            this.f22897OooO00o[i3 - (this.OooO00o - this.OooO0OO)].insertElementAt(bArr2, 0);
                        }
                    } else if (this.f22895OooO00o[i3] == 3) {
                        this.f22896OooO00o[i3].OooO0O0(bArr2);
                    }
                }
            }
            this.f22892OooO00o.addElement(bArr2);
            this.f22899OooO0O0.addElement(I11I.OooO00o(i3));
            if (i3 == this.OooO00o) {
                this.f22900OooO0O0 = true;
                this.f22893OooO00o = false;
                this.f22894OooO00o = (byte[]) this.f22892OooO00o.lastElement();
            }
        }
    }

    public void OooO00o(byte[] bArr, int i) {
        this.f22896OooO00o[i].OooO00o(bArr);
    }

    public void OooO00o(byte[] bArr, byte[] bArr2) {
        int i = this.OooO0o0;
        if (i < this.OooO00o - this.OooO0OO && this.OooO0Oo - 2 == this.f22895OooO00o[0]) {
            OooO00o(bArr, i);
            this.OooO0o0++;
            this.OooO0Oo *= 2;
        }
        OooO00o(bArr2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21413OooO00o() {
        return this.f22900OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21414OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f22894OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m21415OooO00o() {
        Vector vector = this.f22892OooO00o;
        int size = vector == null ? 0 : vector.size();
        int i = this.OooO00o;
        int[] iArr = new int[(i + 8 + size)];
        iArr[0] = i;
        iArr[1] = this.OooO0O0;
        iArr[2] = this.OooO0OO;
        iArr[3] = this.OooO0Oo;
        iArr[4] = this.OooO0o0;
        if (this.f22900OooO0O0) {
            iArr[5] = 1;
        } else {
            iArr[5] = 0;
        }
        if (this.f22893OooO00o) {
            iArr[6] = 1;
        } else {
            iArr[6] = 0;
        }
        iArr[7] = size;
        for (int i2 = 0; i2 < this.OooO00o; i2++) {
            iArr[i2 + 8] = this.f22895OooO00o[i2];
        }
        for (int i3 = 0; i3 < size; i3++) {
            iArr[this.OooO00o + 8 + i3] = ((Integer) this.f22899OooO0O0.elementAt(i3)).intValue();
        }
        return iArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public I1I1LIl[] m21416OooO00o() {
        return C9339I1LLi.OooO00o(this.f22896OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Vector[] m21417OooO00o() {
        return C9339I1LLi.OooO00o(this.f22897OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[][] m21418OooO00o() {
        return C9339I1LLi.OooO00o(this.f22898OooO00o);
    }

    public boolean OooO0O0() {
        return this.f22893OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[][] m21419OooO0O0() {
        Vector vector = this.f22892OooO00o;
        int size = vector == null ? 0 : vector.size();
        int[] iArr = new int[2];
        iArr[1] = 64;
        iArr[0] = this.OooO00o + 1 + size;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        bArr[0] = this.f22894OooO00o;
        int i = 0;
        while (i < this.OooO00o) {
            int i2 = i + 1;
            bArr[i2] = this.f22898OooO00o[i];
            i = i2;
        }
        for (int i3 = 0; i3 < size; i3++) {
            bArr[this.OooO00o + 1 + i3] = (byte[]) this.f22892OooO00o.elementAt(i3);
        }
        return bArr;
    }

    public String toString() {
        Vector vector = this.f22892OooO00o;
        int size = vector == null ? 0 : vector.size();
        String str = "";
        for (int i = 0; i < this.OooO00o + 8 + size; i++) {
            str = str + m21415OooO00o()[i] + " ";
        }
        for (int i2 = 0; i2 < this.OooO00o + 1 + size; i2++) {
            str = str + new String(C6472l1l1l.OooO0O0(m21419OooO0O0()[i2])) + " ";
        }
        return str + GlideException.OooO00o.o0ooOoO + this.f22891OooO00o.OooO00o().OooO0O0();
    }
}
