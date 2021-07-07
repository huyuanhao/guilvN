package com.p118pd.sdk;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;

/* renamed from: com.pd.sdk.ILL丨丨l丨  reason: invalid class name */
public interface ILLl {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 0;
    public static final int OooO0o = 2;
    public static final int OooO0o0 = 1;
    public static final int OooO0oO = 3;

    /* renamed from: com.pd.sdk.ILL丨丨l丨$OooO00o */
    public static class OooO00o {
        public static AbstractC6370iIIIl OooO00o(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i, int i2, int i3) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            lLLL1iL OooO00o = OooO00o(i, i2);
            byte[] encoded = bCPBEKey.getEncoded();
            OooO00o.OooO00o(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            AbstractC6370iIIIl OooO00o2 = OooO00o.OooO00o(i3);
            for (int i4 = 0; i4 != encoded.length; i4++) {
                encoded[i4] = 0;
            }
            return OooO00o2;
        }

        public static AbstractC6370iIIIl OooO00o(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i, int i2, String str, int i3, int i4) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            lLLL1iL OooO00o = OooO00o(i, i2);
            byte[] encoded = bCPBEKey.getEncoded();
            OooO00o.OooO00o(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            AbstractC6370iIIIl OooO00o2 = i4 != 0 ? OooO00o.OooO00o(i3, i4) : OooO00o.OooO0O0(i3);
            if (str.startsWith("DES")) {
                if (OooO00o2 instanceof C6274iilL1L) {
                    OooO00o(((C6642li1LI) ((C6274iilL1L) OooO00o2).OooO00o()).OooO00o());
                } else {
                    OooO00o(((C6642li1LI) OooO00o2).OooO00o());
                }
            }
            for (int i5 = 0; i5 != encoded.length; i5++) {
                encoded[i5] = 0;
            }
            return OooO00o2;
        }

        public static lLLL1iL OooO00o(int i, int i2) {
            if (i == 0) {
                if (i2 == 0) {
                    return new C6399iil1I(new i1l11II());
                }
                if (i2 == 1) {
                    return new C6399iil1I(new C6461l1liI());
                }
                throw new IllegalStateException("PKCS5 scheme 1 only supports only MD5 and SHA1.");
            } else if (i == 1) {
                return new C6928llIL();
            } else {
                if (i == 3) {
                    if (i2 == 0) {
                        return new L1i1(new i1l11II());
                    }
                    if (i2 == 1) {
                        return new L1i1(new C6461l1liI());
                    }
                    if (i2 == 2) {
                        return new L1i1(new C9706liLi());
                    }
                    throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                } else if (i2 == 0) {
                    return new Ii1LiIL(new i1l11II());
                } else {
                    if (i2 == 1) {
                        return new Ii1LiIL(new C6461l1liI());
                    }
                    if (i2 == 2) {
                        return new Ii1LiIL(new C9706liLi());
                    }
                    throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                }
            }
        }

        public static void OooO00o(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                bArr[i] = (byte) ((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) | (b & 254));
            }
        }
    }
}
