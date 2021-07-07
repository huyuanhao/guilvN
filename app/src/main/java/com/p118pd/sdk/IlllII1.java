package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Enumeration;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.IlllII丨1  reason: invalid class name */
public class IlllII1 {
    public static int OooO00o(AbstractC9477LILlL r0, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        C6106iIiIl OooO00o = r0.OooO00o();
        return OooO00o == null ? bigInteger2.bitLength() : OooO00o.OooO0O0().bitLength();
    }

    public static C5600L1iLL OooO00o(AbstractC9477LILlL r12, C6106iIiIl iiiil) {
        if (iiiil instanceof IL1i1) {
            IL1i1 iL1i1 = (IL1i1) iiiil;
            return new C9811LL(OooO00o(iL1i1.OooO00o()), iL1i1.OooO00o(), iL1i1.m16969OooO00o(), iL1i1.OooO0O0(), iL1i1.m16970OooO00o(), iL1i1.m16971OooO00o());
        } else if (iiiil != null) {
            return new C5600L1iLL(iiiil.OooO00o(), iiiil.m16969OooO00o(), iiiil.OooO0O0(), iiiil.m16970OooO00o(), iiiil.m16971OooO00o());
        } else {
            C6106iIiIl OooO00o = r12.OooO00o();
            return new C5600L1iLL(OooO00o.OooO00o(), OooO00o.m16969OooO00o(), OooO00o.OooO0O0(), OooO00o.m16970OooO00o(), OooO00o.m16971OooO00o());
        }
    }

    public static C5600L1iLL OooO00o(AbstractC9477LILlL r7, C6620lLlliL llllil) {
        C5600L1iLL r8;
        if (llllil.m17705OooO0O0()) {
            LlLI1 OooO00o = LlLI1.OooO00o((Object) llllil.OooO0Oo());
            C9387Iill OooO00o2 = OooO00o(OooO00o);
            if (OooO00o2 == null) {
                OooO00o2 = (C9387Iill) r7.m21532OooO00o().get(OooO00o);
            }
            return new C9811LL(OooO00o, OooO00o2.OooO00o(), OooO00o2.m21457OooO00o(), OooO00o2.m21460OooO0O0(), OooO00o2.m21458OooO00o(), OooO00o2.m21459OooO00o());
        }
        if (llllil.OooO00o()) {
            C6106iIiIl OooO00o3 = r7.OooO00o();
            r8 = new C5600L1iLL(OooO00o3.OooO00o(), OooO00o3.m16969OooO00o(), OooO00o3.OooO0O0(), OooO00o3.m16970OooO00o(), OooO00o3.m16971OooO00o());
        } else {
            C9387Iill OooO00o4 = C9387Iill.OooO00o(llllil.OooO0Oo());
            r8 = new C5600L1iLL(OooO00o4.OooO00o(), OooO00o4.m21457OooO00o(), OooO00o4.m21460OooO0O0(), OooO00o4.m21458OooO00o(), OooO00o4.m21459OooO00o());
        }
        return r8;
    }

    public static LlLI1 OooO00o(C6106iIiIl iiiil) {
        Enumeration OooO00o = C9857liL1l.OooO00o();
        while (OooO00o.hasMoreElements()) {
            String str = (String) OooO00o.nextElement();
            C9387Iill OooO00o2 = C9857liL1l.m21940OooO00o(str);
            if (OooO00o2.m21460OooO0O0().equals(iiiil.OooO0O0()) && OooO00o2.m21458OooO00o().equals(iiiil.m16970OooO00o()) && OooO00o2.OooO00o().OooO00o(iiiil.OooO00o()) && OooO00o2.m21457OooO00o().m21806OooO00o(iiiil.m16969OooO00o())) {
                return C9857liL1l.OooO00o(str);
            }
        }
        return null;
    }

    public static LlLI1 OooO00o(String str) {
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                return new LlLI1(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return C9857liL1l.OooO00o(str);
    }

    public static C6213iL11I OooO00o(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            C6106iIiIl parameters = eCPrivateKey.getParameters();
            if (parameters == null) {
                parameters = BouncyCastleProvider.CONFIGURATION.OooO00o();
            }
            return new C6512lIilLl(eCPrivateKey.getD(), new C5600L1iLL(parameters.OooO00o(), parameters.m16969OooO00o(), parameters.OooO0O0(), parameters.m16970OooO00o(), parameters.m16971OooO00o()));
        } else if (privateKey instanceof java.security.interfaces.ECPrivateKey) {
            java.security.interfaces.ECPrivateKey eCPrivateKey2 = (java.security.interfaces.ECPrivateKey) privateKey;
            C6106iIiIl OooO00o = C6631lLlI.OooO00o(eCPrivateKey2.getParams(), false);
            return new C6512lIilLl(eCPrivateKey2.getS(), new C5600L1iLL(OooO00o.OooO00o(), OooO00o.m16969OooO00o(), OooO00o.OooO0O0(), OooO00o.m16970OooO00o(), OooO00o.m16971OooO00o()));
        } else {
            try {
                byte[] encoded = privateKey.getEncoded();
                if (encoded != null) {
                    PrivateKey privateKey2 = BouncyCastleProvider.getPrivateKey(C5464IlilIi.OooO00o(encoded));
                    if (privateKey2 instanceof java.security.interfaces.ECPrivateKey) {
                        return OooO00o(privateKey2);
                    }
                    throw new InvalidKeyException("can't identify EC private key.");
                }
                throw new InvalidKeyException("no encoding for EC private key");
            } catch (Exception e) {
                throw new InvalidKeyException("cannot identify EC private key: " + e.toString());
            }
        }
    }

    public static C6213iL11I OooO00o(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            C6106iIiIl parameters = eCPublicKey.getParameters();
            return new LL1ii1l(eCPublicKey.getQ(), new C5600L1iLL(parameters.OooO00o(), parameters.m16969OooO00o(), parameters.OooO0O0(), parameters.m16970OooO00o(), parameters.m16971OooO00o()));
        } else if (publicKey instanceof java.security.interfaces.ECPublicKey) {
            java.security.interfaces.ECPublicKey eCPublicKey2 = (java.security.interfaces.ECPublicKey) publicKey;
            C6106iIiIl OooO00o = C6631lLlI.OooO00o(eCPublicKey2.getParams(), false);
            return new LL1ii1l(C6631lLlI.OooO00o(eCPublicKey2.getParams(), eCPublicKey2.getW(), false), new C5600L1iLL(OooO00o.OooO00o(), OooO00o.m16969OooO00o(), OooO00o.OooO0O0(), OooO00o.m16970OooO00o(), OooO00o.m16971OooO00o()));
        } else {
            try {
                byte[] encoded = publicKey.getEncoded();
                if (encoded != null) {
                    PublicKey publicKey2 = BouncyCastleProvider.getPublicKey(C6888ll.OooO00o(encoded));
                    if (publicKey2 instanceof java.security.interfaces.ECPublicKey) {
                        return OooO00o(publicKey2);
                    }
                    throw new InvalidKeyException("cannot identify EC public key.");
                }
                throw new InvalidKeyException("no encoding for EC public key");
            } catch (Exception e) {
                throw new InvalidKeyException("cannot identify EC public key: " + e.toString());
            }
        }
    }

    public static C9387Iill OooO00o(LlLI1 llLI1) {
        C9387Iill OooO00o = C6907lliLi.OooO00o(llLI1);
        return OooO00o == null ? C9857liL1l.OooO00o(llLI1) : OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C9387Iill m15715OooO00o(String str) {
        C9387Iill OooO00o = C6907lliLi.m18071OooO00o(str);
        return OooO00o == null ? C9857liL1l.m21940OooO00o(str) : OooO00o;
    }

    public static AbstractC9738llL1L OooO00o(BigInteger bigInteger, C6106iIiIl iiiil) {
        return iiiil.m16969OooO00o().OooO00o(bigInteger).OooO0Oo();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m15716OooO00o(LlLI1 llLI1) {
        return C9857liL1l.m21941OooO00o(llLI1);
    }

    public static String OooO00o(AbstractC9738llL1L r4, C6106iIiIl iiiil) {
        IIiLIli OooO00o = iiiil.OooO00o();
        return OooO00o != null ? new IiiiL1(C9586iIILl.OooO00o(r4.m21808OooO00o(false), OooO00o.m15394OooO00o().m21861OooO00o(), OooO00o.m15400OooO0O0().m21861OooO00o(), iiiil.m16969OooO00o().m21808OooO00o(false))).toString() : new IiiiL1(r4.m21808OooO00o(false)).toString();
    }

    public static String OooO00o(String str, AbstractC9738llL1L r3, C6106iIiIl iiiil) {
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o = Strings.m22984OooO00o();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(OooO00o(r3, iiiil));
        stringBuffer.append("]");
        stringBuffer.append(OooO00o);
        stringBuffer.append("            X: ");
        stringBuffer.append(r3.m21802OooO00o().m21859OooO00o().toString(16));
        stringBuffer.append(OooO00o);
        stringBuffer.append("            Y: ");
        stringBuffer.append(r3.m21810OooO0O0().m21859OooO00o().toString(16));
        stringBuffer.append(OooO00o);
        return stringBuffer.toString();
    }

    public static String OooO00o(String str, BigInteger bigInteger, C6106iIiIl iiiil) {
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o = Strings.m22984OooO00o();
        AbstractC9738llL1L OooO00o2 = OooO00o(bigInteger, iiiil);
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(OooO00o(OooO00o2, iiiil));
        stringBuffer.append("]");
        stringBuffer.append(OooO00o);
        stringBuffer.append("            X: ");
        stringBuffer.append(OooO00o2.m21802OooO00o().m21859OooO00o().toString(16));
        stringBuffer.append(OooO00o);
        stringBuffer.append("            Y: ");
        stringBuffer.append(OooO00o2.m21810OooO0O0().m21859OooO00o().toString(16));
        stringBuffer.append(OooO00o);
        return stringBuffer.toString();
    }

    public static int[] OooO00o(int[] iArr) {
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
        } else if (iArr.length != 3) {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        } else if (iArr[0] < iArr[1] && iArr[0] < iArr[2]) {
            iArr2[0] = iArr[0];
            if (iArr[1] < iArr[2]) {
                iArr2[1] = iArr[1];
                iArr2[2] = iArr[2];
            } else {
                iArr2[1] = iArr[2];
                iArr2[2] = iArr[1];
            }
        } else if (iArr[1] < iArr[2]) {
            iArr2[0] = iArr[1];
            if (iArr[0] < iArr[2]) {
                iArr2[1] = iArr[0];
                iArr2[2] = iArr[2];
            } else {
                iArr2[1] = iArr[2];
                iArr2[2] = iArr[0];
            }
        } else {
            iArr2[0] = iArr[2];
            if (iArr[0] < iArr[1]) {
                iArr2[1] = iArr[0];
                iArr2[2] = iArr[1];
            } else {
                iArr2[1] = iArr[1];
                iArr2[2] = iArr[0];
            }
        }
        return iArr2;
    }
}
