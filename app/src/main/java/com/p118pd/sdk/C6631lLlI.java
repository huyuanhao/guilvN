package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.lL丨l丨丨I  reason: invalid class name and case insensitive filesystem */
public class C6631lLlI {
    public static Map OooO00o = new HashMap();

    static {
        Enumeration OooO00o2 = C6907lliLi.OooO00o();
        while (OooO00o2.hasMoreElements()) {
            String str = (String) OooO00o2.nextElement();
            C9387Iill OooO00o3 = C9857liL1l.m21940OooO00o(str);
            if (OooO00o3 != null) {
                OooO00o.put(OooO00o3.OooO00o(), C6907lliLi.m18071OooO00o(str).OooO00o());
            }
        }
        C9387Iill OooO00o4 = C6907lliLi.m18071OooO00o("Curve25519");
        OooO00o.put(new IIiLIli.OooO0o(OooO00o4.OooO00o().m15391OooO00o().OooO00o(), OooO00o4.OooO00o().m15394OooO00o().m21859OooO00o(), OooO00o4.OooO00o().m15400OooO0O0().m21859OooO00o()), OooO00o4.OooO00o());
    }

    public static IIiLIli OooO00o(AbstractC9477LILlL r2, C6620lLlliL llllil) {
        Set OooO00o2 = r2.m21533OooO00o();
        if (llllil.m17705OooO0O0()) {
            LlLI1 OooO00o3 = LlLI1.OooO00o((Object) llllil.OooO0Oo());
            if (OooO00o2.isEmpty() || OooO00o2.contains(OooO00o3)) {
                C9387Iill OooO00o4 = IlllII1.OooO00o(OooO00o3);
                if (OooO00o4 == null) {
                    OooO00o4 = (C9387Iill) r2.m21532OooO00o().get(OooO00o3);
                }
                return OooO00o4.OooO00o();
            }
            throw new IllegalStateException("named curve not acceptable");
        } else if (llllil.OooO00o()) {
            return r2.OooO00o().OooO00o();
        } else {
            if (OooO00o2.isEmpty()) {
                return C9387Iill.OooO00o(llllil.OooO0Oo()).OooO00o();
            }
            throw new IllegalStateException("encoded parameters not acceptable");
        }
    }

    public static IIiLIli OooO00o(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            IIiLIli.OooO0o oooO0o = new IIiLIli.OooO0o(((ECFieldFp) field).getP(), a, b);
            return OooO00o.containsKey(oooO0o) ? (IIiLIli) OooO00o.get(oooO0o) : oooO0o;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] OooO00o2 = IlllII1.OooO00o(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new IIiLIli.C5231OooO0o0(m, OooO00o2[0], OooO00o2[1], OooO00o2[2], a, b);
    }

    public static C5600L1iLL OooO00o(AbstractC9477LILlL r6, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return IlllII1.OooO00o(r6, OooO00o(eCParameterSpec, false));
        }
        C6106iIiIl OooO00o2 = r6.OooO00o();
        return new C5600L1iLL(OooO00o2.OooO00o(), OooO00o2.m16969OooO00o(), OooO00o2.OooO0O0(), OooO00o2.m16970OooO00o(), OooO00o2.m16971OooO00o());
    }

    public static C6106iIiIl OooO00o(ECParameterSpec eCParameterSpec, boolean z) {
        IIiLIli OooO00o2 = OooO00o(eCParameterSpec.getCurve());
        return new C6106iIiIl(OooO00o2, OooO00o(OooO00o2, eCParameterSpec.getGenerator(), z), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    public static AbstractC9738llL1L OooO00o(IIiLIli r0, ECPoint eCPoint, boolean z) {
        return r0.OooO00o(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static AbstractC9738llL1L OooO00o(ECParameterSpec eCParameterSpec, ECPoint eCPoint, boolean z) {
        return OooO00o(OooO00o(eCParameterSpec.getCurve()), eCPoint, z);
    }

    public static ECField OooO00o(AbstractC6047i1lLI i1lli) {
        if (Lii1I.OooO0O0(i1lli)) {
            return new ECFieldFp(i1lli.OooO00o());
        }
        AbstractC9760IiI OooO00o2 = ((LiliILiI) i1lli).OooO00o();
        int[] OooO00o3 = OooO00o2.m21891OooO00o();
        return new ECFieldF2m(OooO00o2.OooO00o(), C9586iIILl.OooO0O0(C9586iIILl.m21637OooO00o(OooO00o3, 1, OooO00o3.length - 1)));
    }

    public static ECParameterSpec OooO00o(C6620lLlliL llllil, IIiLIli r9) {
        if (llllil.m17705OooO0O0()) {
            LlLI1 llLI1 = (LlLI1) llllil.OooO0Oo();
            C9387Iill OooO00o2 = IlllII1.OooO00o(llLI1);
            if (OooO00o2 == null) {
                Map OooO00o3 = BouncyCastleProvider.CONFIGURATION.m21532OooO00o();
                if (!OooO00o3.isEmpty()) {
                    OooO00o2 = (C9387Iill) OooO00o3.get(llLI1);
                }
            }
            return new L1L1l(IlllII1.m15716OooO00o(llLI1), OooO00o(r9, OooO00o2.m21459OooO00o()), OooO00o(OooO00o2.m21457OooO00o()), OooO00o2.m21460OooO0O0(), OooO00o2.m21458OooO00o());
        } else if (llllil.OooO00o()) {
            return null;
        } else {
            C9387Iill OooO00o4 = C9387Iill.OooO00o(llllil.OooO0Oo());
            EllipticCurve OooO00o5 = OooO00o(r9, OooO00o4.m21459OooO00o());
            return OooO00o4.m21458OooO00o() != null ? new ECParameterSpec(OooO00o5, OooO00o(OooO00o4.m21457OooO00o()), OooO00o4.m21460OooO0O0(), OooO00o4.m21458OooO00o().intValue()) : new ECParameterSpec(OooO00o5, OooO00o(OooO00o4.m21457OooO00o()), OooO00o4.m21460OooO0O0(), 1);
        }
    }

    public static ECParameterSpec OooO00o(C9387Iill r4) {
        return new ECParameterSpec(OooO00o(r4.OooO00o(), (byte[]) null), OooO00o(r4.m21457OooO00o()), r4.m21460OooO0O0(), r4.m21458OooO00o().intValue());
    }

    public static ECParameterSpec OooO00o(EllipticCurve ellipticCurve, C6106iIiIl iiiil) {
        return iiiil instanceof IL1i1 ? new L1L1l(((IL1i1) iiiil).OooO00o(), ellipticCurve, OooO00o(iiiil.m16969OooO00o()), iiiil.OooO0O0(), iiiil.m16970OooO00o()) : new ECParameterSpec(ellipticCurve, OooO00o(iiiil.m16969OooO00o()), iiiil.OooO0O0(), iiiil.m16970OooO00o().intValue());
    }

    public static ECPoint OooO00o(AbstractC9738llL1L r2) {
        AbstractC9738llL1L OooO0Oo = r2.OooO0Oo();
        return new ECPoint(OooO0Oo.m21802OooO00o().m21859OooO00o(), OooO0Oo.m21810OooO0O0().m21859OooO00o());
    }

    public static EllipticCurve OooO00o(IIiLIli r3, byte[] bArr) {
        return new EllipticCurve(OooO00o(r3.m15391OooO00o()), r3.m15394OooO00o().m21859OooO00o(), r3.m15400OooO0O0().m21859OooO00o(), null);
    }
}
