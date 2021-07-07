package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* renamed from: com.pd.sdk.I1l1L */
public class I1l1L {
    public static ECPoint OooO00o(EllipticCurve ellipticCurve, byte[] bArr) {
        IIiLIli r0;
        if (ellipticCurve.getField() instanceof ECFieldFp) {
            r0 = new IIiLIli.OooO0o(((ECFieldFp) ellipticCurve.getField()).getP(), ellipticCurve.getA(), ellipticCurve.getB());
        } else {
            int[] midTermsOfReductionPolynomial = ((ECFieldF2m) ellipticCurve.getField()).getMidTermsOfReductionPolynomial();
            r0 = midTermsOfReductionPolynomial.length == 3 ? new IIiLIli.C5231OooO0o0(((ECFieldF2m) ellipticCurve.getField()).getM(), midTermsOfReductionPolynomial[2], midTermsOfReductionPolynomial[1], midTermsOfReductionPolynomial[0], ellipticCurve.getA(), ellipticCurve.getB()) : new IIiLIli.C5231OooO0o0(((ECFieldF2m) ellipticCurve.getField()).getM(), midTermsOfReductionPolynomial[0], ellipticCurve.getA(), ellipticCurve.getB());
        }
        return C6631lLlI.OooO00o(r0.OooO00o(bArr));
    }
}
