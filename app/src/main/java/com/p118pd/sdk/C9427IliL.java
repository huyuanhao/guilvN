package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.丨IliL  reason: invalid class name and case insensitive filesystem */
public class C9427IliL implements IiLLiIL {
    public LL1ii1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f22967OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f22968OooO00o;

    @Override // com.p118pd.sdk.ILIlii
    public C6238iiL1 OooO00o(C6238iiL1 iil1) {
        LL1ii1l r0 = this.OooO00o;
        if (r0 != null) {
            C5600L1iLL OooO00o2 = r0.OooO00o();
            BigInteger OooO0OO = OooO00o2.OooO0OO();
            AbstractC6615lLl1Ii OooO00o3 = OooO00o();
            BigInteger OooO00o4 = C5429IlIi.OooO00o(OooO0OO, this.f22968OooO00o);
            AbstractC9738llL1L[] r3 = {OooO00o3.OooO00o(OooO00o2.m16003OooO00o(), OooO00o4).OooO00o(Lii1I.OooO00o(OooO00o2.OooO00o(), iil1.OooO00o())), this.OooO00o.OooO00o().OooO00o(OooO00o4).OooO00o(Lii1I.OooO00o(OooO00o2.OooO00o(), iil1.OooO0O0()))};
            OooO00o2.OooO00o().OooO0O0(r3);
            this.f22967OooO00o = OooO00o4;
            return new C6238iiL1(r3[0], r3[1]);
        }
        throw new IllegalStateException("ECNewRandomnessTransform not initialised");
    }

    @Override // com.p118pd.sdk.IiLLiIL
    public AbstractC6615lLl1Ii OooO00o() {
        return new C9372Ii1();
    }

    @Override // com.p118pd.sdk.IiLLiIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21469OooO00o() {
        return this.f22967OooO00o;
    }

    @Override // com.p118pd.sdk.ILIlii
    public void OooO00o(AbstractC6370iIIIl r3) {
        SecureRandom secureRandom;
        if (r3 instanceof liLL1l) {
            liLL1l r32 = (liLL1l) r3;
            if (r32.OooO00o() instanceof LL1ii1l) {
                this.OooO00o = (LL1ii1l) r32.OooO00o();
                secureRandom = r32.m17752OooO00o();
            } else {
                throw new IllegalArgumentException("ECPublicKeyParameters are required for new randomness transform.");
            }
        } else if (r3 instanceof LL1ii1l) {
            this.OooO00o = (LL1ii1l) r3;
            secureRandom = IIllii.OooO00o();
        } else {
            throw new IllegalArgumentException("ECPublicKeyParameters are required for new randomness transform.");
        }
        this.f22968OooO00o = secureRandom;
    }
}
