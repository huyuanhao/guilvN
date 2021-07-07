package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;

/* renamed from: com.pd.sdk.l丨I丨丨  reason: invalid class name and case insensitive filesystem */
public interface AbstractC6840lI {
    public static final int OoooOo0 = 0;
    public static final int OoooOoO = 1;
    public static final int OoooOoo = 2;
    public static final int Ooooo00 = 3;
    public static final int Ooooo0o = 4;
    public static final int OooooO0 = 5;
    public static final int OooooOO = 6;
    public static final int OooooOo = 7;
    public static final int Oooooo = 9;
    public static final int Oooooo0 = 8;
    public static final int OoooooO = 10;
    public static final int Ooooooo = 11;
    public static final int o00O0O = 0;
    public static final int o00Oo0 = 1;
    public static final int o00Ooo = 2;
    public static final int o00o0O = 3;
    public static final int o00ooo = 4;
    public static final int o0OoOo0 = 12;
    public static final int oo000o = 5;
    public static final int ooOO = 13;

    /* renamed from: com.pd.sdk.l丨I丨丨$OooO00o */
    public static class OooO00o {
        public static AbstractC6370iIIIl OooO00o(SecretKey secretKey, int i, int i2, int i3, PBEParameterSpec pBEParameterSpec) {
            lLLL1iL OooO00o = OooO00o(i, i2);
            byte[] encoded = secretKey.getEncoded();
            OooO00o.OooO00o(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            AbstractC6370iIIIl OooO00o2 = OooO00o.OooO00o(i3);
            for (int i4 = 0; i4 != encoded.length; i4++) {
                encoded[i4] = 0;
            }
            return OooO00o2;
        }

        public static AbstractC6370iIIIl OooO00o(PBEKeySpec pBEKeySpec, int i, int i2, int i3) {
            lLLL1iL OooO00o = OooO00o(i, i2);
            byte[] OooO00o2 = OooO00o(i, pBEKeySpec);
            OooO00o.OooO00o(OooO00o2, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            AbstractC6370iIIIl OooO00o3 = OooO00o.OooO00o(i3);
            for (int i4 = 0; i4 != OooO00o2.length; i4++) {
                OooO00o2[i4] = 0;
            }
            return OooO00o3;
        }

        public static AbstractC6370iIIIl OooO00o(PBEKeySpec pBEKeySpec, int i, int i2, int i3, int i4) {
            lLLL1iL OooO00o = OooO00o(i, i2);
            byte[] OooO00o2 = OooO00o(i, pBEKeySpec);
            OooO00o.OooO00o(OooO00o2, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            AbstractC6370iIIIl OooO00o3 = i4 != 0 ? OooO00o.OooO00o(i3, i4) : OooO00o.OooO0O0(i3);
            for (int i5 = 0; i5 != OooO00o2.length; i5++) {
                OooO00o2[i5] = 0;
            }
            return OooO00o3;
        }

        public static AbstractC6370iIIIl OooO00o(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            lLLL1iL OooO00o = OooO00o(bCPBEKey.getType(), bCPBEKey.getDigest());
            OooO00o.OooO00o(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            return OooO00o.OooO00o(bCPBEKey.getKeySize());
        }

        public static AbstractC6370iIIIl OooO00o(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            lLLL1iL OooO00o = OooO00o(bCPBEKey.getType(), bCPBEKey.getDigest());
            byte[] encoded = bCPBEKey.getEncoded();
            if (bCPBEKey.shouldTryWrongPKCS12()) {
                encoded = new byte[2];
            }
            OooO00o.OooO00o(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            AbstractC6370iIIIl OooO00o2 = bCPBEKey.getIvSize() != 0 ? OooO00o.OooO00o(bCPBEKey.getKeySize(), bCPBEKey.getIvSize()) : OooO00o.OooO0O0(bCPBEKey.getKeySize());
            if (str.startsWith("DES")) {
                if (OooO00o2 instanceof C6274iilL1L) {
                    C9841ill1Ii.OooO00o(((C6642li1LI) ((C6274iilL1L) OooO00o2).OooO00o()).OooO00o());
                } else {
                    C9841ill1Ii.OooO00o(((C6642li1LI) OooO00o2).OooO00o());
                }
            }
            return OooO00o2;
        }

        public static AbstractC6370iIIIl OooO00o(byte[] bArr, int i, int i2, int i3, int i4, AlgorithmParameterSpec algorithmParameterSpec, String str) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            lLLL1iL OooO00o = OooO00o(i, i2);
            OooO00o.OooO00o(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            AbstractC6370iIIIl OooO00o2 = i4 != 0 ? OooO00o.OooO00o(i3, i4) : OooO00o.OooO0O0(i3);
            if (str.startsWith("DES")) {
                if (OooO00o2 instanceof C6274iilL1L) {
                    C9841ill1Ii.OooO00o(((C6642li1LI) ((C6274iilL1L) OooO00o2).OooO00o()).OooO00o());
                } else {
                    C9841ill1Ii.OooO00o(((C6642li1LI) OooO00o2).OooO00o());
                }
            }
            return OooO00o2;
        }

        public static lLLL1iL OooO00o(int i, int i2) {
            if (i == 0 || i == 4) {
                if (i2 == 0) {
                    return new C6399iil1I(C5427IlI1.OooO00o());
                }
                if (i2 == 1) {
                    return new C6399iil1I(C5427IlI1.OooO0O0());
                }
                if (i2 == 5) {
                    return new C6399iil1I(new LLli1i());
                }
                throw new IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
            } else if (i == 1 || i == 5) {
                switch (i2) {
                    case 0:
                        return new C6928llIL(C5427IlI1.OooO00o());
                    case 1:
                        return new C6928llIL(C5427IlI1.OooO0O0());
                    case 2:
                        return new C6928llIL(new C9706liLi());
                    case 3:
                        return new C6928llIL(new iIlLIll());
                    case 4:
                        return new C6928llIL(C5427IlI1.OooO0Oo());
                    case 5:
                        return new C6928llIL(new LLli1i());
                    case 6:
                        return new C6928llIL(new C6846lLIlii());
                    case 7:
                        return new C6928llIL(C5427IlI1.OooO0OO());
                    case 8:
                        return new C6928llIL(C5427IlI1.OooO0o0());
                    case 9:
                        return new C6928llIL(C5427IlI1.OooOO0());
                    case 10:
                        return new C6928llIL(C5427IlI1.OooO0o());
                    case 11:
                        return new C6928llIL(C5427IlI1.OooO0oO());
                    case 12:
                        return new C6928llIL(C5427IlI1.OooO0oo());
                    case 13:
                        return new C6928llIL(C5427IlI1.OooO());
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
                }
            } else if (i != 2) {
                return new C9695lLlLL();
            } else {
                switch (i2) {
                    case 0:
                        return new Ii1LiIL(C5427IlI1.OooO00o());
                    case 1:
                        return new Ii1LiIL(C5427IlI1.OooO0O0());
                    case 2:
                        return new Ii1LiIL(new C9706liLi());
                    case 3:
                        return new Ii1LiIL(new iIlLIll());
                    case 4:
                        return new Ii1LiIL(C5427IlI1.OooO0Oo());
                    case 5:
                        return new Ii1LiIL(new LLli1i());
                    case 6:
                        return new Ii1LiIL(new C6846lLIlii());
                    case 7:
                        return new Ii1LiIL(C5427IlI1.OooO0OO());
                    case 8:
                        return new Ii1LiIL(C5427IlI1.OooO0o0());
                    case 9:
                        return new Ii1LiIL(C5427IlI1.OooOO0());
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                }
            }
        }

        public static byte[] OooO00o(int i, PBEKeySpec pBEKeySpec) {
            return i == 2 ? lLLL1iL.OooO00o(pBEKeySpec.getPassword()) : (i == 5 || i == 4) ? lLLL1iL.OooO0OO(pBEKeySpec.getPassword()) : lLLL1iL.OooO0O0(pBEKeySpec.getPassword());
        }
    }
}
