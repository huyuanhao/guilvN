package com.p118pd.sdk;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Vector;

/* renamed from: com.pd.sdk.丨I11  reason: invalid class name and case insensitive filesystem */
public class C9326I11 implements AbstractC5599L1Ii {
    public static final String OooO00o = "1.3.6.1.4.1.8301.3.1.3.3";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f22832OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILl1Il f22833OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5673LLll f22834OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6237iiL f22835OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f22836OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9696lLl1 f22837OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22838OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f22839OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[][] f22840OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f22841OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[][] f22842OooO0O0;
    public int[] OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[][] f22843OooO0OO;

    public C9326I11(AbstractC9696lLl1 r2) {
        this.f22837OooO00o = r2;
        AbstractC6436l11LI OooO00o2 = r2.OooO00o();
        this.f22836OooO00o = OooO00o2;
        this.f22832OooO00o = OooO00o2.OooO0O0();
        this.f22835OooO00o = new C6237iiL(this.f22836OooO00o);
    }

    private C9356IIlL OooO00o(Vector vector, byte[] bArr, int i) {
        byte[] bArr2 = new byte[this.OooO0O0];
        C9356IIlL r0 = new C9356IIlL(this.f22839OooO00o[i], this.OooO0OO[i], this.f22837OooO00o);
        r0.OooO00o(vector);
        int i2 = 0;
        int i3 = 0;
        int i4 = 3;
        while (true) {
            int[] iArr = this.f22839OooO00o;
            if (i2 >= (1 << iArr[i])) {
                break;
            }
            if (i2 == i4 && i3 < iArr[i] - this.OooO0OO[i]) {
                r0.OooO00o(bArr, i3);
                i4 *= 2;
                i3++;
            }
            r0.OooO00o(new C6094iILI1(this.f22835OooO00o.m17248OooO00o(bArr), this.f22837OooO00o.OooO00o(), this.f22841OooO0O0[i]).OooO00o());
            i2++;
        }
        if (r0.m21413OooO00o()) {
            return r0;
        }
        System.err.println("N�chster Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private C9356IIlL OooO00o(byte[] bArr, Vector vector, byte[] bArr2, int i) {
        byte[] bArr3;
        int i2 = this.f22832OooO00o;
        byte[] bArr4 = new byte[i2];
        byte[] bArr5 = new byte[i2];
        byte[] OooO00o2 = this.f22835OooO00o.m17248OooO00o(bArr2);
        C9356IIlL r1 = new C9356IIlL(this.f22839OooO00o[i], this.OooO0OO[i], this.f22837OooO00o);
        r1.OooO00o(vector);
        if (i == this.OooO0O0 - 1) {
            bArr3 = new C6094iILI1(OooO00o2, this.f22837OooO00o.OooO00o(), this.f22841OooO0O0[i]).OooO00o();
        } else {
            this.f22843OooO0OO[i] = new C6094iILI1(OooO00o2, this.f22837OooO00o.OooO00o(), this.f22841OooO0O0[i]).OooO00o(bArr);
            bArr3 = new C5735LiiII(this.f22837OooO00o.OooO00o(), this.f22841OooO0O0[i]).OooO00o(bArr, this.f22843OooO0OO[i]);
        }
        r1.OooO00o(bArr3);
        int i3 = 3;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            int[] iArr = this.f22839OooO00o;
            if (i5 >= (1 << iArr[i])) {
                break;
            }
            if (i5 == i3 && i4 < iArr[i] - this.OooO0OO[i]) {
                r1.OooO00o(bArr2, i4);
                i3 *= 2;
                i4++;
            }
            r1.OooO00o(new C6094iILI1(this.f22835OooO00o.m17248OooO00o(bArr2), this.f22837OooO00o.OooO00o(), this.f22841OooO0O0[i]).OooO00o());
            i5++;
        }
        if (r1.m21413OooO00o()) {
            return r1;
        }
        System.err.println("Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    private void OooO00o() {
        OooO0O0(new ILl1Il(IIllii.OooO00o(), new C5673LLll(4, new int[]{10, 10, 10, 10}, new int[]{3, 3, 3, 3}, new int[]{2, 2, 2, 2})));
    }

    private i1LLl1L OooO0O0() {
        int i;
        int i2;
        if (!this.f22838OooO00o) {
            OooO00o();
        }
        int i3 = this.OooO0O0;
        byte[][][] bArr = new byte[i3][][];
        byte[][][] bArr2 = new byte[(i3 - 1)][][];
        I1I1LIl[][] r8 = new I1I1LIl[i3][];
        I1I1LIl[][] r9 = new I1I1LIl[(i3 - 1)][];
        Vector[] vectorArr = new Vector[i3];
        Vector[] vectorArr2 = new Vector[(i3 - 1)];
        Vector[][] vectorArr3 = new Vector[i3][];
        int i4 = 1;
        Vector[][] vectorArr4 = new Vector[(i3 - 1)][];
        int i5 = 0;
        while (true) {
            i = this.OooO0O0;
            if (i5 >= i) {
                break;
            }
            int i6 = this.f22839OooO00o[i5];
            int[] iArr = new int[2];
            iArr[1] = this.f22832OooO00o;
            iArr[0] = i6;
            bArr[i5] = (byte[][]) Array.newInstance(byte.class, iArr);
            int[] iArr2 = this.f22839OooO00o;
            r8[i5] = new I1I1LIl[(iArr2[i5] - this.OooO0OO[i5])];
            if (i5 > 0) {
                int i7 = i5 - 1;
                int i8 = iArr2[i5];
                int[] iArr3 = new int[2];
                iArr3[1] = this.f22832OooO00o;
                iArr3[0] = i8;
                bArr2[i7] = (byte[][]) Array.newInstance(byte.class, iArr3);
                r9[i7] = new I1I1LIl[(this.f22839OooO00o[i5] - this.OooO0OO[i5])];
            }
            vectorArr[i5] = new Vector();
            if (i5 > 0) {
                vectorArr2[i5 - 1] = new Vector();
            }
            i5++;
            vectorArr4 = vectorArr4;
        }
        int[] iArr4 = new int[2];
        iArr4[1] = this.f22832OooO00o;
        iArr4[0] = i;
        byte[][] bArr3 = (byte[][]) Array.newInstance(byte.class, iArr4);
        int[] iArr5 = new int[2];
        iArr5[1] = this.f22832OooO00o;
        iArr5[0] = this.OooO0O0 - 1;
        byte[][] bArr4 = (byte[][]) Array.newInstance(byte.class, iArr5);
        int i9 = this.OooO0O0;
        int[] iArr6 = new int[2];
        iArr6[1] = this.f22832OooO00o;
        iArr6[0] = i9;
        byte[][] bArr5 = (byte[][]) Array.newInstance(byte.class, iArr6);
        int i10 = 0;
        while (true) {
            i2 = this.OooO0O0;
            if (i10 >= i2) {
                break;
            }
            System.arraycopy(this.f22840OooO00o[i10], 0, bArr5[i10], 0, this.f22832OooO00o);
            i10++;
            i4 = 1;
        }
        int[] iArr7 = new int[2];
        iArr7[i4] = this.f22832OooO00o;
        iArr7[0] = i2 - i4;
        this.f22843OooO0OO = (byte[][]) Array.newInstance(byte.class, iArr7);
        int i11 = this.OooO0O0 - i4;
        while (i11 >= 0) {
            C9356IIlL OooO00o2 = i11 == this.OooO0O0 - i4 ? OooO00o(null, vectorArr[i11], bArr5[i11], i11) : OooO00o(bArr3[i11 + 1], vectorArr[i11], bArr5[i11], i11);
            for (int i12 = 0; i12 < this.f22839OooO00o[i11]; i12++) {
                System.arraycopy(OooO00o2.m21418OooO00o()[i12], 0, bArr[i11][i12], 0, this.f22832OooO00o);
            }
            vectorArr3[i11] = OooO00o2.m21417OooO00o();
            r8[i11] = OooO00o2.m21416OooO00o();
            System.arraycopy(OooO00o2.m21414OooO00o(), 0, bArr3[i11], 0, this.f22832OooO00o);
            i11--;
            i4 = 1;
        }
        int i13 = this.OooO0O0 - 2;
        while (i13 >= 0) {
            int i14 = i13 + 1;
            C9356IIlL OooO00o3 = OooO00o(vectorArr2[i13], bArr5[i14], i14);
            int i15 = 0;
            while (i15 < this.f22839OooO00o[i14]) {
                System.arraycopy(OooO00o3.m21418OooO00o()[i15], 0, bArr2[i13][i15], 0, this.f22832OooO00o);
                i15++;
                vectorArr3 = vectorArr3;
            }
            vectorArr4[i13] = OooO00o3.m21417OooO00o();
            r9[i13] = OooO00o3.m21416OooO00o();
            System.arraycopy(OooO00o3.m21414OooO00o(), 0, bArr4[i13], 0, this.f22832OooO00o);
            System.arraycopy(bArr5[i14], 0, this.f22842OooO0O0[i13], 0, this.f22832OooO00o);
            i13--;
            vectorArr3 = vectorArr3;
        }
        return new i1LLl1L((C6213iL11I) new II11(bArr3[0], this.f22834OooO00o), (C6213iL11I) new C6772llLil(this.f22840OooO00o, this.f22842OooO0O0, bArr, bArr2, r8, r9, vectorArr, vectorArr2, vectorArr3, vectorArr4, bArr4, this.f22843OooO0OO, this.f22834OooO00o, this.f22837OooO00o));
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public i1LLl1L m21369OooO00o() {
        return OooO0O0();
    }

    public void OooO00o(int i, SecureRandom secureRandom) {
        ILl1Il r1;
        if (i <= 10) {
            r1 = new ILl1Il(secureRandom, new C5673LLll(1, new int[]{10}, new int[]{3}, new int[]{2}));
        } else {
            r1 = i <= 20 ? new ILl1Il(secureRandom, new C5673LLll(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2})) : new ILl1Il(secureRandom, new C5673LLll(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2}));
        }
        OooO0O0(r1);
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public void OooO00o(C6470l1i r1) {
        OooO0O0(r1);
    }

    public void OooO0O0(C6470l1i r6) {
        ILl1Il r62 = (ILl1Il) r6;
        this.f22833OooO00o = r62;
        C5673LLll r1 = new C5673LLll(r62.OooO00o().OooO00o(), this.f22833OooO00o.OooO00o().m16250OooO00o(), this.f22833OooO00o.OooO00o().OooO0OO(), this.f22833OooO00o.OooO00o().OooO0O0());
        this.f22834OooO00o = r1;
        this.OooO0O0 = r1.OooO00o();
        this.f22839OooO00o = this.f22834OooO00o.m16250OooO00o();
        this.f22841OooO0O0 = this.f22834OooO00o.OooO0OO();
        this.OooO0OO = this.f22834OooO00o.OooO0O0();
        int i = this.OooO0O0;
        int[] iArr = new int[2];
        iArr[1] = this.f22832OooO00o;
        iArr[0] = i;
        this.f22840OooO00o = (byte[][]) Array.newInstance(byte.class, iArr);
        int[] iArr2 = new int[2];
        iArr2[1] = this.f22832OooO00o;
        iArr2[0] = this.OooO0O0 - 1;
        this.f22842OooO0O0 = (byte[][]) Array.newInstance(byte.class, iArr2);
        SecureRandom OooO00o2 = IIllii.OooO00o();
        for (int i2 = 0; i2 < this.OooO0O0; i2++) {
            OooO00o2.nextBytes(this.f22840OooO00o[i2]);
            this.f22835OooO00o.m17248OooO00o(this.f22840OooO00o[i2]);
        }
        this.f22838OooO00o = true;
    }
}
