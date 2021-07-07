package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* renamed from: com.pd.sdk.L1L1l */
public class L1L1l extends ECParameterSpec {
    public String OooO00o;

    public L1L1l(String str, IIiLIli r3, AbstractC9738llL1L r4, BigInteger bigInteger) {
        super(OooO00o(r3, null), C6631lLlI.OooO00o(r4), bigInteger, 1);
        this.OooO00o = str;
    }

    public L1L1l(String str, IIiLIli r3, AbstractC9738llL1L r4, BigInteger bigInteger, BigInteger bigInteger2) {
        super(OooO00o(r3, null), C6631lLlI.OooO00o(r4), bigInteger, bigInteger2.intValue());
        this.OooO00o = str;
    }

    public L1L1l(String str, IIiLIli r2, AbstractC9738llL1L r3, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(OooO00o(r2, bArr), C6631lLlI.OooO00o(r3), bigInteger, bigInteger2.intValue());
        this.OooO00o = str;
    }

    public L1L1l(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger) {
        super(ellipticCurve, eCPoint, bigInteger, 1);
        this.OooO00o = str;
    }

    public L1L1l(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.OooO00o = str;
    }

    public static ECField OooO00o(AbstractC6047i1lLI i1lli) {
        if (Lii1I.OooO0O0(i1lli)) {
            return new ECFieldFp(i1lli.OooO00o());
        }
        AbstractC9760IiI OooO00o2 = ((LiliILiI) i1lli).OooO00o();
        int[] OooO00o3 = OooO00o2.m21891OooO00o();
        return new ECFieldF2m(OooO00o2.OooO00o(), C9586iIILl.OooO0O0(C9586iIILl.m21637OooO00o(OooO00o3, 1, OooO00o3.length - 1)));
    }

    public static EllipticCurve OooO00o(IIiLIli r3, byte[] bArr) {
        return new EllipticCurve(OooO00o(r3.m15391OooO00o()), r3.m15394OooO00o().m21859OooO00o(), r3.m15400OooO0O0().m21859OooO00o(), bArr);
    }

    public String OooO00o() {
        return this.OooO00o;
    }
}
