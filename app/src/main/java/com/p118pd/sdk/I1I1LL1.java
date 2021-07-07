package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.I1I1LL1 */
public class I1I1LL1 extends AbstractC5738Lil {
    public static final int o000OOo = 13;
    public static final int o0O0O00 = 127;
    public static final int o0OO00O = 32;
    public static final int o0OOO0o = 8;
    public static final int o0Oo0oo = 16;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public static final int o0ooOoO = 4;
    public static final int oo0o0Oo = 64;
    public ILLIi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LLLlI11 f15305OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5805Ll1 f15306OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9710lilli f15307OooO00o;
    public ILLIi OooO0O0;
    public ILLIi OooO0OO;
    public ILLIi OooO0Oo;
    public ILLIi OooO0o0;
    public int o00oO0O = 0;

    public I1I1LL1(ILLIi r3, C5238IIL r4, AbstractC9710lilli r5, C9758ILI r6, LLLlI11 r7, LLil1iI r8, LLil1iI r9) {
        OooO0Oo(r3);
        OooO0o0(new ILLIi(2, r4.m21888OooO00o()));
        OooO00o(r5);
        OooO0OO(new ILLIi(32, r6.m21888OooO00o()));
        OooO00o(r7);
        try {
            OooO00o(new ILLIi(false, 37, (AbstractC6854lLi1LL) new C6487lIIiIlL(r8.m16269OooO00o())));
            OooO0O0(new ILLIi(false, 36, (AbstractC6854lLi1LL) new C6487lIIiIlL(r9.m16269OooO00o())));
        } catch (IOException e) {
            throw new IllegalArgumentException("unable to encode dates: " + e.getMessage());
        }
    }

    public I1I1LL1(AbstractC8947ooOOOOo0 ooooooo0) throws IOException {
        OooO00o(ooooooo0);
    }

    public static I1I1LL1 OooO00o(Object obj) throws IOException {
        if (obj instanceof I1I1LL1) {
            return (I1I1LL1) obj;
        }
        if (obj != null) {
            return new I1I1LL1(AbstractC8947ooOOOOo0.OooO00o(obj));
        }
        return null;
    }

    private void OooO00o(ILLIi r4) throws IllegalArgumentException {
        if (r4.OooO0OO() == 37) {
            this.OooO0Oo = r4;
            this.o00oO0O |= 32;
            return;
        }
        throw new IllegalArgumentException("Not an Iso7816Tags.APPLICATION_EFFECTIVE_DATE tag :" + C9520Lilil.OooO00o(r4));
    }

    private void OooO00o(LLLlI11 r1) {
        this.f15305OooO00o = r1;
        this.o00oO0O |= 16;
    }

    private void OooO00o(AbstractC8947ooOOOOo0 ooooooo0) throws IOException {
        if (ooooooo0.OooO0OO() == 78) {
            C5805Ll1 r1 = new C5805Ll1(ooooooo0.m20621OooO00o());
            while (true) {
                AbstractC6122iIlLiL OooO00o2 = r1.OooO00o();
                if (OooO00o2 == null) {
                    r1.close();
                    return;
                } else if (OooO00o2 instanceof ILLIi) {
                    ILLIi r0 = (ILLIi) OooO00o2;
                    int OooO0OO2 = r0.OooO0OO();
                    if (OooO0OO2 == 2) {
                        OooO0o0(r0);
                    } else if (OooO0OO2 == 32) {
                        OooO0OO(r0);
                    } else if (OooO0OO2 == 41) {
                        OooO0Oo(r0);
                    } else if (OooO0OO2 == 73) {
                        OooO00o(AbstractC9710lilli.OooO00o(r0.OooO00o(16)));
                    } else if (OooO0OO2 == 76) {
                        OooO00o(new LLLlI11(r0));
                    } else if (OooO0OO2 == 36) {
                        OooO0O0(r0);
                    } else if (OooO0OO2 == 37) {
                        OooO00o(r0);
                    } else {
                        this.o00oO0O = 0;
                        throw new IOException("Not a valid iso7816 DERApplicationSpecific tag " + r0.OooO0OO());
                    }
                } else {
                    throw new IOException("Not a valid iso7816 content : not a DERApplicationSpecific Object :" + C9520Lilil.OooO00o(ooooooo0) + OooO00o2.getClass());
                }
            }
        } else {
            throw new IOException("Bad tag : not an iso7816 CERTIFICATE_CONTENT_TEMPLATE");
        }
    }

    private void OooO00o(AbstractC9710lilli r1) {
        this.f15307OooO00o = AbstractC9710lilli.OooO00o(r1);
        this.o00oO0O |= 4;
    }

    private void OooO0O0(ILLIi r3) throws IllegalArgumentException {
        if (r3.OooO0OO() == 36) {
            this.OooO0o0 = r3;
            this.o00oO0O |= 64;
            return;
        }
        throw new IllegalArgumentException("Not an Iso7816Tags.APPLICATION_EXPIRATION_DATE tag");
    }

    private void OooO0OO(ILLIi r3) throws IllegalArgumentException {
        if (r3.OooO0OO() == 32) {
            this.OooO0OO = r3;
            this.o00oO0O |= 8;
            return;
        }
        throw new IllegalArgumentException("Not an Iso7816Tags.CARDHOLDER_NAME tag");
    }

    private AbstractC6122iIlLiL OooO0Oo() throws IOException {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(new ILLIi(false, 73, (AbstractC6854lLi1LL) this.f15307OooO00o));
        r0.OooO00o(this.OooO0OO);
        r0.OooO00o(this.f15305OooO00o);
        r0.OooO00o(this.OooO0Oo);
        r0.OooO00o(this.OooO0o0);
        return new ILLIi(78, r0);
    }

    private void OooO0Oo(ILLIi r4) throws IllegalArgumentException {
        if (r4.OooO0OO() == 41) {
            this.OooO00o = r4;
            this.o00oO0O |= 1;
            return;
        }
        throw new IllegalArgumentException("Not an Iso7816Tags.INTERCHANGE_PROFILE tag :" + C9520Lilil.OooO00o(r4));
    }

    private AbstractC6122iIlLiL OooO0o0() throws IOException {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(new ILLIi(false, 73, (AbstractC6854lLi1LL) this.f15307OooO00o));
        r0.OooO00o(this.OooO0OO);
        return new ILLIi(78, r0);
    }

    private void OooO0o0(ILLIi r3) throws IllegalArgumentException {
        if (r3.OooO0OO() == 2) {
            this.OooO0O0 = r3;
            this.o00oO0O |= 2;
            return;
        }
        throw new IllegalArgumentException("Not an Iso7816Tags.ISSUER_IDENTIFICATION_NUMBER tag");
    }

    public C5238IIL OooO00o() throws IOException {
        if ((this.o00oO0O & 2) == 2) {
            return new C5238IIL(this.OooO0O0.m20621OooO00o());
        }
        throw new IOException("Certification authority reference not set");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ILLIi m15249OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LLLlI11 m15250OooO00o() throws IOException {
        if ((this.o00oO0O & 16) == 16) {
            return this.f15305OooO00o;
        }
        throw new IOException("Certificate Holder Authorisation not set");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LLil1iI m15251OooO00o() {
        if ((this.o00oO0O & 32) == 32) {
            return new LLil1iI(this.OooO0Oo.m20621OooO00o());
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9710lilli m15252OooO00o() {
        return this.f15307OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9758ILI m15253OooO00o() {
        return new C9758ILI(this.OooO0OO.m20621OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public LLil1iI m15254OooO0O0() throws IOException {
        if ((this.o00oO0O & 64) == 64) {
            return new LLil1iI(this.OooO0o0.m20621OooO00o());
        }
        throw new IOException("certificate Expiration Date not set");
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15255OooO0O0() {
        try {
            if (this.o00oO0O == 127) {
                return OooO0Oo();
            }
            if (this.o00oO0O == 13) {
                return OooO0o0();
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }
}
