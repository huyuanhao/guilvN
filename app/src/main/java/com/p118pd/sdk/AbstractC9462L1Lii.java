package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.丨L1L丨ii  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9462L1Lii implements iL1liI {
    public static long OooO00o = C5751Li1iL.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public i1iiIl f23026OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6107iIiL f23027OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iiIi11 f23028OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6830lILl1 f23029OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f23030OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23031OooO00o;
    public i1iiIl OooO0O0 = null;

    public AbstractC9462L1Lii(SecureRandom secureRandom, C6107iIiL iiil) {
        AbstractC6436l11LI OooO00o2 = L1LL1Ii.m15920OooO00o((short) 4);
        byte[] bArr = new byte[OooO00o2.OooO0O0()];
        secureRandom.nextBytes(bArr);
        lL1iii r2 = new lL1iii(OooO00o2);
        this.f23028OooO00o = r2;
        r2.OooO00o(OooO00o());
        this.f23028OooO00o.OooO00o(C5751Li1iL.OooO00o());
        this.f23028OooO00o.OooO00o(bArr);
        this.f23031OooO00o = secureRandom;
        this.f23027OooO00o = iiil;
    }

    public static synchronized long OooO00o() {
        long j;
        synchronized (AbstractC9462L1Lii.class) {
            j = OooO00o + 1;
            OooO00o = j;
        }
        return j;
    }

    @Override // com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public i1iiIl m21512OooO00o() {
        return this.f23026OooO00o;
    }

    @Override // com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6107iIiL m21513OooO00o() {
        return this.f23027OooO00o;
    }

    @Override // com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public iiIi11 m21514OooO00o() {
        return this.f23028OooO00o;
    }

    @Override // com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6830lILl1 m21515OooO00o() {
        return this.f23029OooO00o;
    }

    @Override // com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m21516OooO00o() {
        return this.f23030OooO00o;
    }

    @Override // com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI, com.p118pd.sdk.iL1liI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public SecureRandom m21517OooO00o() {
        return this.f23031OooO00o;
    }

    public void OooO00o(i1iiIl i1iiil) {
        this.f23026OooO00o = i1iiil;
    }

    public void OooO00o(AbstractC6830lILl1 r1) {
        this.f23029OooO00o = r1;
    }

    @Override // com.p118pd.sdk.iL1liI
    public void OooO00o(Object obj) {
        this.f23030OooO00o = obj;
    }

    @Override // com.p118pd.sdk.iL1liI
    public byte[] OooO00o(String str, byte[] bArr, int i) {
        if (bArr == null || L1LL1Ii.m15947OooO0Oo(bArr.length)) {
            C6107iIiL OooO00o2 = m21513OooO00o();
            byte[] OooO00o3 = OooO00o2.m16975OooO00o();
            byte[] OooO0o = OooO00o2.OooO0o();
            int length = OooO00o3.length + OooO0o.length;
            if (bArr != null) {
                length += bArr.length + 2;
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(OooO00o3, 0, bArr2, 0, OooO00o3.length);
            int length2 = OooO00o3.length + 0;
            System.arraycopy(OooO0o, 0, bArr2, length2, OooO0o.length);
            int length3 = length2 + OooO0o.length;
            if (bArr != null) {
                L1LL1Ii.OooO00o(bArr.length, bArr2, length3);
                int i2 = length3 + 2;
                System.arraycopy(bArr, 0, bArr2, i2, bArr.length);
                length3 = i2 + bArr.length;
            }
            if (length3 == length) {
                return L1LL1Ii.OooO00o(this, OooO00o2.m16976OooO0O0(), str, bArr2, i);
            }
            throw new IllegalStateException("error in calculation of seed for export");
        }
        throw new IllegalArgumentException("'context_value' must have length less than 2^16 (or be null)");
    }

    @Override // com.p118pd.sdk.iL1liI
    public i1iiIl OooO0O0() {
        return this.OooO0O0;
    }

    public void OooO0O0(i1iiIl i1iiil) {
        this.OooO0O0 = i1iiil;
    }
}
