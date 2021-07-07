package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.p291ec.BCECPublicKey;

/* renamed from: com.pd.sdk.丨ILIIIlI  reason: invalid class name */
public class ILIIIlI {
    public static C6213iL11I OooO00o(PublicKey publicKey) throws InvalidKeyException {
        return publicKey instanceof BCECPublicKey ? ((BCECPublicKey) publicKey).engineGetKeyParameters() : IlllII1.OooO00o(publicKey);
    }

    public static C6620lLlliL OooO00o(ECParameterSpec eCParameterSpec, boolean z) {
        if (eCParameterSpec instanceof L1L1l) {
            L1L1l l1L1l = (L1L1l) eCParameterSpec;
            LlLI1 OooO00o = IlllII1.OooO00o(l1L1l.OooO00o());
            if (OooO00o == null) {
                OooO00o = new LlLI1(l1L1l.OooO00o());
            }
            return new C6620lLlliL(OooO00o);
        } else if (eCParameterSpec == null) {
            return new C6620lLlliL((AbstractC5335ILl) C6452l1Lll.OooO00o);
        } else {
            IIiLIli OooO00o2 = C6631lLlI.OooO00o(eCParameterSpec.getCurve());
            return new C6620lLlliL(new C9387Iill(OooO00o2, C6631lLlI.OooO00o(OooO00o2, eCParameterSpec.getGenerator(), z), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
    }

    public static C9387Iill OooO00o(String str) {
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                return IlllII1.OooO00o(new LlLI1(str));
            }
            if (str.indexOf(32) > 0) {
                str = str.substring(str.indexOf(32) + 1);
            }
            return IlllII1.m15715OooO00o(str);
        } catch (IllegalArgumentException unused) {
            return IlllII1.m15715OooO00o(str);
        }
    }

    public static C9387Iill OooO00o(ECGenParameterSpec eCGenParameterSpec) {
        return OooO00o(eCGenParameterSpec.getName());
    }
}
