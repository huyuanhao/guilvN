package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.IIllL丨  reason: invalid class name and case insensitive filesystem */
public class C5234IIllL {
    public static final Integer OooO00o = I11I.OooO00o(10);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f15517OooO00o = {"sect163k1", "sect163r1", "sect163r2", "sect193r1", "sect193r2", "sect233k1", "sect233r1", "sect239k1", "sect283k1", "sect283r1", "sect409k1", "sect409r1", "sect571k1", "sect571r1", "secp160k1", "secp160r1", "secp160r2", "secp192k1", "secp192r1", "secp224k1", "secp224r1", "secp256k1", "secp256r1", "secp384r1", "secp521r1", "brainpoolP256r1", "brainpoolP384r1", "brainpoolP512r1"};
    public static final Integer OooO0O0 = I11I.OooO00o(11);

    public static int OooO00o(int i, InputStream inputStream) throws IOException {
        int intValue;
        BigInteger OooO00o2 = OooO00o(inputStream);
        if (OooO00o2.bitLength() < 32 && (intValue = OooO00o2.intValue()) > 0 && intValue < i) {
            return intValue;
        }
        throw new TlsFatalAlert(47);
    }

    public static C5600L1iLL OooO00o(int i) {
        String OooO00o2 = m15418OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        C9387Iill OooO00o3 = C6907lliLi.m18071OooO00o(OooO00o2);
        if (OooO00o3 == null && (OooO00o3 = C9857liL1l.m21940OooO00o(OooO00o2)) == null) {
            return null;
        }
        return new C5600L1iLL(OooO00o3.OooO00o(), OooO00o3.m21457OooO00o(), OooO00o3.m21460OooO0O0(), OooO00o3.m21458OooO00o(), OooO00o3.m21459OooO00o());
    }

    public static C5600L1iLL OooO00o(int[] iArr, short[] sArr, InputStream inputStream) throws IOException {
        int i;
        int i2;
        BigInteger bigInteger;
        IIiLIli.C5231OooO0o0 oooO0o0;
        try {
            short OooO00o2 = L1LL1Ii.m15923OooO00o(inputStream);
            if (OooO00o2 == 1) {
                OooO00o(iArr, 65281);
                BigInteger OooO00o3 = OooO00o(inputStream);
                BigInteger OooO00o4 = m15419OooO00o(OooO00o3.bitLength(), inputStream);
                BigInteger OooO00o5 = m15419OooO00o(OooO00o3.bitLength(), inputStream);
                byte[] OooO0OO = L1LL1Ii.m15946OooO0OO(inputStream);
                BigInteger OooO00o6 = OooO00o(inputStream);
                BigInteger OooO00o7 = OooO00o(inputStream);
                IIiLIli.OooO0o oooO0o = new IIiLIli.OooO0o(OooO00o3, OooO00o4, OooO00o5, OooO00o6, OooO00o7);
                return new C5600L1iLL(oooO0o, OooO00o(sArr, oooO0o, OooO0OO), OooO00o6, OooO00o7);
            } else if (OooO00o2 == 2) {
                OooO00o(iArr, 65282);
                int OooO00o8 = L1LL1Ii.OooO00o(inputStream);
                short OooO00o9 = L1LL1Ii.m15923OooO00o(inputStream);
                if (LILlII.OooO00o(OooO00o9)) {
                    int OooO00o10 = OooO00o(OooO00o8, inputStream);
                    if (OooO00o9 == 2) {
                        i2 = OooO00o(OooO00o8, inputStream);
                        i = OooO00o(OooO00o8, inputStream);
                    } else {
                        i2 = -1;
                        i = -1;
                    }
                    BigInteger OooO00o11 = m15419OooO00o(OooO00o8, inputStream);
                    BigInteger OooO00o12 = m15419OooO00o(OooO00o8, inputStream);
                    byte[] OooO0OO2 = L1LL1Ii.m15946OooO0OO(inputStream);
                    BigInteger OooO00o13 = OooO00o(inputStream);
                    BigInteger OooO00o14 = OooO00o(inputStream);
                    if (OooO00o9 == 2) {
                        bigInteger = OooO00o13;
                        oooO0o0 = new IIiLIli.C5231OooO0o0(OooO00o8, OooO00o10, i2, i, OooO00o11, OooO00o12, OooO00o13, OooO00o14);
                    } else {
                        bigInteger = OooO00o13;
                        oooO0o0 = new IIiLIli.C5231OooO0o0(OooO00o8, OooO00o10, OooO00o11, OooO00o12, bigInteger, OooO00o14);
                    }
                    return new C5600L1iLL(oooO0o0, OooO00o(sArr, oooO0o0, OooO0OO2), bigInteger, OooO00o14);
                }
                throw new TlsFatalAlert(47);
            } else if (OooO00o2 == 3) {
                int OooO00o15 = L1LL1Ii.OooO00o(inputStream);
                if (C6038i1ii1il.OooO0O0(OooO00o15)) {
                    OooO00o(iArr, OooO00o15);
                    return OooO00o(OooO00o15);
                }
                throw new TlsFatalAlert(47);
            } else {
                throw new TlsFatalAlert(47);
            }
        } catch (RuntimeException e) {
            throw new TlsFatalAlert(47, e);
        }
    }

    public static LL1ii1l OooO00o(LL1ii1l r0) throws IOException {
        return r0;
    }

    public static LL1ii1l OooO00o(short[] sArr, C5600L1iLL r2, byte[] bArr) throws IOException {
        try {
            return new LL1ii1l(OooO00o(sArr, r2.OooO00o(), bArr), r2);
        } catch (RuntimeException e) {
            throw new TlsFatalAlert(47, e);
        }
    }

    public static i1LLl1L OooO00o(SecureRandom secureRandom, C5600L1iLL r3) {
        LI111l r0 = new LI111l();
        r0.OooO00o(new iL1ilL1(r3, secureRandom));
        return r0.OooO00o();
    }

    public static C6512lIilLl OooO00o(SecureRandom secureRandom, int[] iArr, short[] sArr, OutputStream outputStream) throws IOException {
        int i;
        if (iArr != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr.length) {
                    i = -1;
                    break;
                }
                i = iArr[i2];
                if (C6038i1ii1il.OooO00o(i) && OooO0O0(i)) {
                    break;
                }
                i2++;
            }
        } else {
            i = 23;
        }
        C5600L1iLL r1 = null;
        if (i >= 0) {
            r1 = OooO00o(i);
        } else if (C9586iIILl.m21628OooO00o(iArr, 65281)) {
            r1 = OooO00o(23);
        } else if (C9586iIILl.m21628OooO00o(iArr, 65282)) {
            r1 = OooO00o(10);
        }
        if (r1 != null) {
            if (i < 0) {
                OooO00o(sArr, r1, outputStream);
            } else {
                OooO0O0(i, outputStream);
            }
            return OooO00o(secureRandom, sArr, r1, outputStream);
        }
        throw new TlsFatalAlert(80);
    }

    public static C6512lIilLl OooO00o(SecureRandom secureRandom, short[] sArr, C5600L1iLL r2, OutputStream outputStream) throws IOException {
        i1LLl1L OooO00o2 = OooO00o(secureRandom, r2);
        OooO00o(sArr, ((LL1ii1l) OooO00o2.OooO0O0()).OooO00o(), outputStream);
        return (C6512lIilLl) OooO00o2.OooO00o();
    }

    public static AbstractC9738llL1L OooO00o(short[] sArr, IIiLIli r7, byte[] bArr) throws IOException {
        if (bArr != null) {
            short s = 1;
            if (bArr.length >= 1) {
                byte b = bArr[0];
                if (b == 2 || b == 3) {
                    if (Lii1I.OooO00o(r7)) {
                        s = 2;
                    } else if (!Lii1I.OooO0O0(r7)) {
                        throw new TlsFatalAlert(47);
                    }
                } else if (b == 4) {
                    s = 0;
                } else {
                    throw new TlsFatalAlert(47);
                }
                if (s == 0 || (sArr != null && C9586iIILl.m21629OooO00o(sArr, s))) {
                    return r7.OooO00o(bArr);
                }
                throw new TlsFatalAlert(47);
            }
        }
        throw new TlsFatalAlert(47);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m15418OooO00o(int i) {
        if (OooO0O0(i)) {
            return f15517OooO00o[i - 1];
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static BigInteger m15419OooO00o(int i, InputStream inputStream) throws IOException {
        return OooO00o(i, L1LL1Ii.m15946OooO0OO(inputStream));
    }

    public static BigInteger OooO00o(int i, byte[] bArr) throws IOException {
        if (bArr.length == (i + 7) / 8) {
            return new BigInteger(1, bArr);
        }
        throw new TlsFatalAlert(50);
    }

    public static BigInteger OooO00o(InputStream inputStream) throws IOException {
        return new BigInteger(1, L1LL1Ii.m15946OooO0OO(inputStream));
    }

    public static void OooO00o(int i, OutputStream outputStream) throws IOException {
        OooO00o(BigInteger.valueOf((long) i), outputStream);
    }

    public static void OooO00o(int i, BigInteger bigInteger, OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO0OO(OooO00o(i, bigInteger), outputStream);
    }

    public static void OooO00o(AbstractC97441iIIL r0, OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO0OO(r0.m21861OooO00o(), outputStream);
    }

    public static void OooO00o(BigInteger bigInteger, OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO0OO(IIiL.OooO00o(bigInteger), outputStream);
    }

    public static void OooO00o(Hashtable hashtable, int[] iArr) throws IOException {
        hashtable.put(OooO00o, m15421OooO00o(iArr));
    }

    public static void OooO00o(Hashtable hashtable, short[] sArr) throws IOException {
        hashtable.put(OooO0O0, OooO00o(sArr));
    }

    public static void OooO00o(int[] iArr, int i) throws IOException {
        if (iArr != null && !C9586iIILl.m21628OooO00o(iArr, i)) {
            throw new TlsFatalAlert(47);
        }
    }

    public static void OooO00o(short[] sArr, C5600L1iLL r8, OutputStream outputStream) throws IOException {
        int i;
        IIiLIli OooO00o2 = r8.OooO00o();
        if (Lii1I.OooO0O0(OooO00o2)) {
            L1LL1Ii.OooO00o((short) 1, outputStream);
            OooO00o(OooO00o2.m15391OooO00o().OooO00o(), outputStream);
        } else if (Lii1I.OooO00o(OooO00o2)) {
            int[] OooO00o3 = ((LiliILiI) OooO00o2.m15391OooO00o()).OooO00o().m21891OooO00o();
            L1LL1Ii.OooO00o((short) 2, outputStream);
            int i2 = OooO00o3[OooO00o3.length - 1];
            L1LL1Ii.m15925OooO00o(i2);
            L1LL1Ii.OooO00o(i2, outputStream);
            if (OooO00o3.length == 3) {
                L1LL1Ii.OooO00o((short) 1, outputStream);
                i = OooO00o3[1];
            } else if (OooO00o3.length == 5) {
                L1LL1Ii.OooO00o((short) 2, outputStream);
                OooO00o(OooO00o3[1], outputStream);
                OooO00o(OooO00o3[2], outputStream);
                i = OooO00o3[3];
            } else {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
            OooO00o(i, outputStream);
        } else {
            throw new IllegalArgumentException("'ecParameters' not a known curve type");
        }
        OooO00o(OooO00o2.m15394OooO00o(), outputStream);
        OooO00o(OooO00o2.m15400OooO0O0(), outputStream);
        L1LL1Ii.OooO0OO(OooO00o(sArr, r8.m16003OooO00o()), outputStream);
        OooO00o(r8.OooO0OO(), outputStream);
        OooO00o(r8.m16004OooO00o(), outputStream);
    }

    public static void OooO00o(short[] sArr, AbstractC9738llL1L r1, OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO0OO(OooO00o(sArr, r1), outputStream);
    }

    public static boolean OooO00o() {
        return f15517OooO00o.length > 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15420OooO00o(int i) {
        if (i == 52396) {
            return true;
        }
        switch (i) {
            case Lillilli.o000000O /*{ENCODED_INT: 49153}*/:
            case Lillilli.o000000o /*{ENCODED_INT: 49154}*/:
            case Lillilli.o00000 /*{ENCODED_INT: 49155}*/:
            case Lillilli.o00000O0 /*{ENCODED_INT: 49156}*/:
            case Lillilli.o00000O /*{ENCODED_INT: 49157}*/:
            case Lillilli.o00000OO /*{ENCODED_INT: 49158}*/:
            case Lillilli.o00000Oo /*{ENCODED_INT: 49159}*/:
            case Lillilli.o00000o0 /*{ENCODED_INT: 49160}*/:
            case Lillilli.o0000Ooo /*{ENCODED_INT: 49161}*/:
            case Lillilli.o00000oO /*{ENCODED_INT: 49162}*/:
            case Lillilli.o00000oo /*{ENCODED_INT: 49163}*/:
            case Lillilli.o0000 /*{ENCODED_INT: 49164}*/:
            case Lillilli.o0000O00 /*{ENCODED_INT: 49165}*/:
            case Lillilli.o0000oo /*{ENCODED_INT: 49166}*/:
            case Lillilli.o0000oO /*{ENCODED_INT: 49167}*/:
            case Lillilli.o0000O0 /*{ENCODED_INT: 49168}*/:
            case Lillilli.o0000O0O /*{ENCODED_INT: 49169}*/:
            case Lillilli.o000OO /*{ENCODED_INT: 49170}*/:
            case Lillilli.o0000O /*{ENCODED_INT: 49171}*/:
            case Lillilli.o0000OO0 /*{ENCODED_INT: 49172}*/:
            case Lillilli.o0000OO /*{ENCODED_INT: 49173}*/:
            case Lillilli.o0000OOO /*{ENCODED_INT: 49174}*/:
            case Lillilli.o0000OOo /*{ENCODED_INT: 49175}*/:
            case Lillilli.o0000Oo0 /*{ENCODED_INT: 49176}*/:
            case Lillilli.o0000Oo /*{ENCODED_INT: 49177}*/:
                return true;
            default:
                switch (i) {
                    case Lillilli.o000OoOO /*{ENCODED_INT: 49187}*/:
                    case Lillilli.o000OoOo /*{ENCODED_INT: 49188}*/:
                    case Lillilli.o000Ooo0 /*{ENCODED_INT: 49189}*/:
                    case Lillilli.o000OooO /*{ENCODED_INT: 49190}*/:
                    case Lillilli.o000Oooo /*{ENCODED_INT: 49191}*/:
                    case Lillilli.o000o000 /*{ENCODED_INT: 49192}*/:
                    case Lillilli.o000o00 /*{ENCODED_INT: 49193}*/:
                    case Lillilli.o000o00O /*{ENCODED_INT: 49194}*/:
                    case Lillilli.o000o00o /*{ENCODED_INT: 49195}*/:
                    case Lillilli.oooo00o /*{ENCODED_INT: 49196}*/:
                    case Lillilli.o000o0O0 /*{ENCODED_INT: 49197}*/:
                    case Lillilli.o000o0O /*{ENCODED_INT: 49198}*/:
                    case Lillilli.o000o0OO /*{ENCODED_INT: 49199}*/:
                    case Lillilli.o000o0Oo /*{ENCODED_INT: 49200}*/:
                    case Lillilli.o000o0o0 /*{ENCODED_INT: 49201}*/:
                    case Lillilli.o000o0o /*{ENCODED_INT: 49202}*/:
                    case Lillilli.o00oOoo /*{ENCODED_INT: 49203}*/:
                    case Lillilli.o00O000 /*{ENCODED_INT: 49204}*/:
                    case Lillilli.o00O000o /*{ENCODED_INT: 49205}*/:
                    case Lillilli.o00O00 /*{ENCODED_INT: 49206}*/:
                    case Lillilli.o00O00O /*{ENCODED_INT: 49207}*/:
                    case Lillilli.oOO00O /*{ENCODED_INT: 49208}*/:
                    case Lillilli.o00O00OO /*{ENCODED_INT: 49209}*/:
                    case Lillilli.o00O00Oo /*{ENCODED_INT: 49210}*/:
                    case Lillilli.o00O00o0 /*{ENCODED_INT: 49211}*/:
                        return true;
                    default:
                        switch (i) {
                            case Lillilli.o00O00oO /*{ENCODED_INT: 49266}*/:
                            case Lillilli.oo00o /*{ENCODED_INT: 49267}*/:
                            case Lillilli.o00O0 /*{ENCODED_INT: 49268}*/:
                            case Lillilli.o00O0O00 /*{ENCODED_INT: 49269}*/:
                            case Lillilli.o00O0O0 /*{ENCODED_INT: 49270}*/:
                            case Lillilli.o00O0O0O /*{ENCODED_INT: 49271}*/:
                            case Lillilli.o00O0O0o /*{ENCODED_INT: 49272}*/:
                            case Lillilli.o00O0OO0 /*{ENCODED_INT: 49273}*/:
                                return true;
                            default:
                                switch (i) {
                                    case Lillilli.o00O0o0O /*{ENCODED_INT: 49286}*/:
                                    case Lillilli.o00O0o0o /*{ENCODED_INT: 49287}*/:
                                    case Lillilli.o00O0o /*{ENCODED_INT: 49288}*/:
                                    case Lillilli.o00O0oO /*{ENCODED_INT: 49289}*/:
                                    case Lillilli.o00O0oOO /*{ENCODED_INT: 49290}*/:
                                    case Lillilli.o00O0oOo /*{ENCODED_INT: 49291}*/:
                                    case Lillilli.o00O0oo0 /*{ENCODED_INT: 49292}*/:
                                    case Lillilli.o00O0oo /*{ENCODED_INT: 49293}*/:
                                        return true;
                                    default:
                                        switch (i) {
                                            case Lillilli.o00OO0oo /*{ENCODED_INT: 49306}*/:
                                            case Lillilli.oo0O /*{ENCODED_INT: 49307}*/:
                                                return true;
                                            default:
                                                switch (i) {
                                                    case Lillilli.o00OoOoO /*{ENCODED_INT: 49324}*/:
                                                    case Lillilli.o00Oo000 /*{ENCODED_INT: 49325}*/:
                                                    case Lillilli.o00Oo00 /*{ENCODED_INT: 49326}*/:
                                                    case Lillilli.o00Oo00o /*{ENCODED_INT: 49327}*/:
                                                        return true;
                                                    default:
                                                        switch (i) {
                                                            case Lillilli.o00Oo0O /*{ENCODED_INT: 52392}*/:
                                                            case Lillilli.o00Oo0Oo /*{ENCODED_INT: 52393}*/:
                                                                return true;
                                                            default:
                                                                switch (i) {
                                                                    case 65282:
                                                                    case Lillilli.o00OoO0o /*{ENCODED_INT: 65283}*/:
                                                                    case Lillilli.o00OoO /*{ENCODED_INT: 65284}*/:
                                                                    case Lillilli.o00OoOO0 /*{ENCODED_INT: 65285}*/:
                                                                        return true;
                                                                    default:
                                                                        switch (i) {
                                                                            case Lillilli.o00OoOo /*{ENCODED_INT: 65300}*/:
                                                                            case Lillilli.o00OoOoo /*{ENCODED_INT: 65301}*/:
                                                                                return true;
                                                                            default:
                                                                                return false;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static boolean OooO00o(C5600L1iLL r0, C5600L1iLL r1) {
        return r0 != null && r0.equals(r1);
    }

    public static boolean OooO00o(int[] iArr) {
        for (int i : iArr) {
            if (m15420OooO00o(i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean OooO00o(short[] sArr, short s) {
        short s2;
        if (sArr == null) {
            return false;
        }
        int i = 0;
        while (i < sArr.length && (s2 = sArr[i]) != 0) {
            if (s2 == s) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static byte[] OooO00o(int i, BigInteger bigInteger) throws IOException {
        return IIiL.OooO00o((i + 7) / 8, bigInteger);
    }

    public static byte[] OooO00o(LL1ii1l r1, C6512lIilLl r2) {
        C5822L1 r0 = new C5822L1();
        r0.m16416OooO00o((AbstractC6370iIIIl) r2);
        return IIiL.OooO00o(r0.OooO00o(), r0.OooO00o((AbstractC6370iIIIl) r1));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m15421OooO00o(int[] iArr) throws IOException {
        if (iArr != null && iArr.length >= 1) {
            return L1LL1Ii.OooO00o(iArr);
        }
        throw new TlsFatalAlert(80);
    }

    public static byte[] OooO00o(short[] sArr) throws IOException {
        if (sArr == null || !C9586iIILl.m21629OooO00o(sArr, (short) 0)) {
            sArr = C9586iIILl.m21643OooO00o(sArr, (short) 0);
        }
        return L1LL1Ii.OooO00o(sArr);
    }

    public static byte[] OooO00o(short[] sArr, LL1ii1l r1) throws IOException {
        return OooO00o(sArr, r1.OooO00o());
    }

    public static byte[] OooO00o(short[] sArr, AbstractC9738llL1L r3) throws IOException {
        boolean z;
        short s;
        IIiLIli OooO00o2 = r3.m21800OooO00o();
        if (Lii1I.OooO0O0(OooO00o2)) {
            s = 1;
        } else if (Lii1I.OooO00o(OooO00o2)) {
            s = 2;
        } else {
            z = false;
            return r3.m21808OooO00o(z);
        }
        z = OooO00o(sArr, s);
        return r3.m21808OooO00o(z);
    }

    public static int[] OooO00o(Hashtable hashtable) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(hashtable, OooO00o);
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o(OooO00o2);
    }

    public static int[] OooO00o(byte[] bArr) throws IOException {
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            int OooO00o2 = L1LL1Ii.OooO00o((InputStream) byteArrayInputStream);
            if (OooO00o2 < 2 || (OooO00o2 & 1) != 0) {
                throw new TlsFatalAlert(50);
            }
            int[] OooO00o3 = L1LL1Ii.m15934OooO00o(OooO00o2 / 2, (InputStream) byteArrayInputStream);
            AbstractC6892l1.OooO0O0(byteArrayInputStream);
            return OooO00o3;
        }
        throw new IllegalArgumentException("'extensionData' cannot be null");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static short[] m15422OooO00o(Hashtable hashtable) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(hashtable, OooO0O0);
        if (OooO00o2 == null) {
            return null;
        }
        return m15423OooO00o(OooO00o2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static short[] m15423OooO00o(byte[] bArr) throws IOException {
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            short OooO00o2 = L1LL1Ii.m15923OooO00o((InputStream) byteArrayInputStream);
            if (OooO00o2 >= 1) {
                short[] OooO00o3 = L1LL1Ii.m15935OooO00o((int) OooO00o2, (InputStream) byteArrayInputStream);
                AbstractC6892l1.OooO0O0(byteArrayInputStream);
                if (C9586iIILl.m21629OooO00o(OooO00o3, (short) 0)) {
                    return OooO00o3;
                }
                throw new TlsFatalAlert(47);
            }
            throw new TlsFatalAlert(50);
        }
        throw new IllegalArgumentException("'extensionData' cannot be null");
    }

    public static void OooO0O0(int i, OutputStream outputStream) throws IOException {
        if (C6038i1ii1il.OooO0O0(i)) {
            L1LL1Ii.OooO00o((short) 3, outputStream);
            L1LL1Ii.m15925OooO00o(i);
            L1LL1Ii.OooO00o(i, outputStream);
            return;
        }
        throw new TlsFatalAlert(80);
    }

    public static boolean OooO0O0(int i) {
        return i > 0 && i <= f15517OooO00o.length;
    }
}
