package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iil1iLIl */
public class iil1iLIl {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6237iiL f17918OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f17919OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17920OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f17921OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f17922OooO0OO;
    public int OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public byte[] f17923OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;

    public iil1iLIl(iil1iLIl iil1ilil) {
        this.f17919OooO00o = iil1ilil.f17919OooO00o;
        this.OooO00o = iil1ilil.OooO00o;
        this.OooO0O0 = iil1ilil.OooO0O0;
        this.f17918OooO00o = iil1ilil.f17918OooO00o;
        this.f17920OooO00o = C9586iIILl.m21630OooO00o(iil1ilil.f17920OooO00o);
        this.f17921OooO0O0 = C9586iIILl.m21630OooO00o(iil1ilil.f17921OooO0O0);
        this.OooO0OO = iil1ilil.OooO0OO;
        this.OooO0Oo = iil1ilil.OooO0Oo;
        this.OooO0o0 = iil1ilil.OooO0o0;
        this.OooO0o = iil1ilil.OooO0o;
        this.OooO0oO = iil1ilil.OooO0oO;
        this.f17922OooO0OO = C9586iIILl.m21630OooO00o(iil1ilil.f17922OooO0OO);
        this.f17923OooO0Oo = C9586iIILl.m21630OooO00o(iil1ilil.f17923OooO0Oo);
    }

    public iil1iLIl(AbstractC6436l11LI r7, int i, int i2) {
        this.OooO0o = i;
        this.f17919OooO00o = r7;
        this.f17918OooO00o = new C6237iiL(r7);
        int OooO0O02 = this.f17919OooO00o.OooO0O0();
        this.OooO00o = OooO0O02;
        double d = (double) (OooO0O02 << 3);
        double d2 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d2);
        int ceil = (int) Math.ceil(d / d2);
        double OooO00o2 = (double) OooO00o((ceil << i) + 1);
        Double.isNaN(OooO00o2);
        Double.isNaN(d2);
        int ceil2 = ceil + ((int) Math.ceil(OooO00o2 / d2));
        this.OooO0O0 = ceil2;
        int i3 = 1 << i;
        this.OooO0o0 = i3;
        double d3 = (double) (((i3 - 1) * ceil2) + 1 + ceil2);
        double d4 = (double) i2;
        Double.isNaN(d3);
        Double.isNaN(d4);
        this.OooO0oO = (int) Math.ceil(d3 / d4);
        int i4 = this.OooO00o;
        this.f17922OooO0OO = new byte[i4];
        this.f17920OooO00o = new byte[i4];
        this.f17923OooO0Oo = new byte[i4];
        this.f17921OooO0O0 = new byte[(i4 * this.OooO0O0)];
    }

    public iil1iLIl(AbstractC6436l11LI r7, int i, int i2, byte[] bArr) {
        this.OooO0o = i;
        this.f17919OooO00o = r7;
        this.f17918OooO00o = new C6237iiL(r7);
        int OooO0O02 = this.f17919OooO00o.OooO0O0();
        this.OooO00o = OooO0O02;
        double d = (double) (OooO0O02 << 3);
        double d2 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d2);
        int ceil = (int) Math.ceil(d / d2);
        double OooO00o2 = (double) OooO00o((ceil << i) + 1);
        Double.isNaN(OooO00o2);
        Double.isNaN(d2);
        int ceil2 = ceil + ((int) Math.ceil(OooO00o2 / d2));
        this.OooO0O0 = ceil2;
        int i3 = 1 << i;
        this.OooO0o0 = i3;
        double d3 = (double) (((i3 - 1) * ceil2) + 1 + ceil2);
        double d4 = (double) i2;
        Double.isNaN(d3);
        Double.isNaN(d4);
        this.OooO0oO = (int) Math.ceil(d3 / d4);
        int i4 = this.OooO00o;
        this.f17922OooO0OO = new byte[i4];
        this.f17920OooO00o = new byte[i4];
        this.f17923OooO0Oo = new byte[i4];
        this.f17921OooO0O0 = new byte[(i4 * this.OooO0O0)];
        OooO00o(bArr);
    }

    public iil1iLIl(AbstractC6436l11LI r9, byte[][] bArr, int[] iArr) {
        this.OooO0OO = iArr[0];
        this.OooO0Oo = iArr[1];
        this.OooO0oO = iArr[2];
        this.OooO0o = iArr[3];
        this.f17919OooO00o = r9;
        this.f17918OooO00o = new C6237iiL(r9);
        int OooO0O02 = this.f17919OooO00o.OooO0O0();
        this.OooO00o = OooO0O02;
        double d = (double) (OooO0O02 << 3);
        double d2 = (double) this.OooO0o;
        Double.isNaN(d);
        Double.isNaN(d2);
        int ceil = (int) Math.ceil(d / d2);
        double OooO00o2 = (double) OooO00o((ceil << this.OooO0o) + 1);
        double d3 = (double) this.OooO0o;
        Double.isNaN(OooO00o2);
        Double.isNaN(d3);
        this.OooO0O0 = ceil + ((int) Math.ceil(OooO00o2 / d3));
        this.OooO0o0 = 1 << this.OooO0o;
        this.f17923OooO0Oo = bArr[0];
        this.f17922OooO0OO = bArr[1];
        this.f17921OooO0O0 = bArr[2];
        this.f17920OooO00o = bArr[3];
    }

    private int OooO00o(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    private void OooO00o() {
        byte[] bArr = new byte[this.f17919OooO00o.OooO0O0()];
        for (int i = 0; i < this.OooO0oO + 10000; i++) {
            if (this.OooO0OO == this.OooO0O0 && this.OooO0Oo == this.OooO0o0 - 1) {
                AbstractC6436l11LI r0 = this.f17919OooO00o;
                byte[] bArr2 = this.f17921OooO0O0;
                r0.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.f17919OooO00o.OooO0O0()];
                this.f17920OooO00o = bArr3;
                this.f17919OooO00o.OooO00o(bArr3, 0);
                return;
            }
            if (this.OooO0OO == 0 || this.OooO0Oo == this.OooO0o0 - 1) {
                this.OooO0OO++;
                this.OooO0Oo = 0;
                this.f17923OooO0Oo = this.f17918OooO00o.m17248OooO00o(this.f17922OooO0OO);
            } else {
                AbstractC6436l11LI r3 = this.f17919OooO00o;
                byte[] bArr4 = this.f17923OooO0Oo;
                r3.update(bArr4, 0, bArr4.length);
                this.f17923OooO0Oo = bArr;
                this.f17919OooO00o.OooO00o(bArr, 0);
                int i2 = this.OooO0Oo + 1;
                this.OooO0Oo = i2;
                if (i2 == this.OooO0o0 - 1) {
                    byte[] bArr5 = this.f17923OooO0Oo;
                    byte[] bArr6 = this.f17921OooO0O0;
                    int i3 = this.OooO00o;
                    System.arraycopy(bArr5, 0, bArr6, (this.OooO0OO - 1) * i3, i3);
                }
            }
        }
        throw new IllegalStateException("unable to updateLeaf in steps: " + this.OooO0oO + " " + this.OooO0OO + " " + this.OooO0Oo);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iil1iLIl m17294OooO00o() {
        iil1iLIl iil1ilil = new iil1iLIl(this);
        iil1ilil.OooO00o();
        return iil1ilil;
    }

    public void OooO00o(byte[] bArr) {
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        byte[] bArr2 = new byte[this.OooO00o];
        System.arraycopy(bArr, 0, bArr2, 0, this.f17922OooO0OO.length);
        this.f17922OooO0OO = this.f17918OooO00o.m17248OooO00o(bArr2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17295OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f17920OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m17296OooO00o() {
        return new int[]{this.OooO0OO, this.OooO0Oo, this.OooO0oO, this.OooO0o};
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[][] m17297OooO00o() {
        int i = this.OooO00o;
        byte[][] bArr = {new byte[i], new byte[i], new byte[(this.OooO0O0 * i)], new byte[i]};
        bArr[0] = this.f17923OooO0Oo;
        bArr[1] = this.f17922OooO0OO;
        bArr[2] = this.f17921OooO0O0;
        bArr[3] = this.f17920OooO00o;
        return bArr;
    }

    public String toString() {
        StringBuilder sb;
        String str = "";
        for (int i = 0; i < 4; i++) {
            str = str + m17296OooO00o()[i] + " ";
        }
        String str2 = str + " " + this.OooO00o + " " + this.OooO0O0 + " " + this.OooO0o0 + " ";
        byte[][] OooO00o2 = m17297OooO00o();
        for (int i2 = 0; i2 < 4; i2++) {
            if (OooO00o2[i2] != null) {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(new String(C6472l1l1l.OooO0O0(OooO00o2[i2])));
                sb.append(" ");
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append("null ");
            }
            str2 = sb.toString();
        }
        return str2;
    }
}
