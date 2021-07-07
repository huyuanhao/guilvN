package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import okhttp3.internal.p288ws.WebSocketProtocol;
import org.bouncycastle.crypto.tls.TlsFatalAlert;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.L1LL1I丨i  reason: invalid class name */
public class L1LL1Ii {
    public static final Integer OooO00o = I11I.OooO00o(13);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final byte[] f16174OooO00o = new byte[0];

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f16175OooO00o = new int[0];

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long[] f16176OooO00o = new long[0];

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final short[] f16177OooO00o = new short[0];

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final byte[][] f16178OooO00o = m15936OooO00o();
    public static final byte[] OooO0O0 = {67, 76, 78, 84};
    public static final byte[] OooO0OO = {83, 82, 86, 82};

    public static int OooO00o(int i) throws IOException {
        int OooO0O02 = OooO0O0(i);
        if (OooO0O02 == 103 || OooO0O02 == 104) {
            return 2;
        }
        switch (OooO0O02) {
            case 0:
            case 1:
            case 2:
                return 0;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
                return 1;
            case 10:
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return 2;
            default:
                throw new TlsFatalAlert(80);
        }
    }

    public static int OooO00o(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 >= 0) {
            return read2 | (read << 8);
        }
        throw new EOFException();
    }

    public static int OooO00o(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m15913OooO00o(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if (read4 >= 0) {
            return ((long) (read4 | (read << 24) | (read2 << 16) | (read3 << 8))) & 4294967295L;
        }
        throw new EOFException();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m15914OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return ((long) ((bArr[i3 + 1] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8))) & 4294967295L;
    }

    public static II1LLIl OooO00o(iL1liI il1lii, AbstractC5842L1 r1) throws IOException {
        if (!OooO0OO(il1lii)) {
            return null;
        }
        II1LLIl OooO00o2 = r1.OooO00o();
        if (OooO00o2 != null) {
            return OooO00o2;
        }
        throw new TlsFatalAlert(80);
    }

    public static L1Illl1i OooO00o(short s) {
        if (s == 1) {
            return new C6191iLlLIl1();
        }
        if (s == 2) {
            return new C5302ILI();
        }
        if (s == 64) {
            return new C6341il1();
        }
        throw new IllegalArgumentException("'clientCertificateType' is not a type with signing capability");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static LlLI1 m15915OooO00o(short s) {
        switch (s) {
            case 1:
                return AbstractC5711LiLli.Oooooo0;
            case 2:
                return AbstractC5855LLl.o00O0000;
            case 3:
                return AbstractC5905LllI.OooO0o;
            case 4:
                return AbstractC5905LllI.OooO0OO;
            case 5:
                return AbstractC5905LllI.OooO0Oo;
            case 6:
                return AbstractC5905LllI.OooO0o0;
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static i1iiIl m15916OooO00o(int i) {
        switch (i) {
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                break;
            default:
                switch (i) {
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                        break;
                    default:
                        switch (i) {
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                            case 160:
                            case 161:
                            case 162:
                            case 163:
                            case 164:
                            case 165:
                            case 166:
                            case 167:
                            case 168:
                            case 169:
                            case 170:
                            case 171:
                            case 172:
                            case 173:
                                break;
                            default:
                                switch (i) {
                                    case Lillilli.OoooOoo /*{ENCODED_INT: 186}*/:
                                    case 187:
                                    case 188:
                                    case 189:
                                    case Lillilli.OooooOO /*{ENCODED_INT: 190}*/:
                                    case Lillilli.OooooOo /*{ENCODED_INT: 191}*/:
                                    case 192:
                                    case Lillilli.Oooooo /*{ENCODED_INT: 193}*/:
                                    case Lillilli.OoooooO /*{ENCODED_INT: 194}*/:
                                    case Lillilli.Ooooooo /*{ENCODED_INT: 195}*/:
                                    case Lillilli.o0OoOo0 /*{ENCODED_INT: 196}*/:
                                    case Lillilli.ooOO /*{ENCODED_INT: 197}*/:
                                        break;
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
                                                break;
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
                                                    case Lillilli.oo0o0O0 /*{ENCODED_INT: 49274}*/:
                                                    case Lillilli.o00O0OO /*{ENCODED_INT: 49275}*/:
                                                    case Lillilli.o00O0OOO /*{ENCODED_INT: 49276}*/:
                                                    case Lillilli.o00O0OOo /*{ENCODED_INT: 49277}*/:
                                                    case Lillilli.o00O0Oo0 /*{ENCODED_INT: 49278}*/:
                                                    case Lillilli.oo0oOO0 /*{ENCODED_INT: 49279}*/:
                                                    case Lillilli.o00O0Oo /*{ENCODED_INT: 49280}*/:
                                                    case Lillilli.o00O0OoO /*{ENCODED_INT: 49281}*/:
                                                    case Lillilli.o00O0Ooo /*{ENCODED_INT: 49282}*/:
                                                    case Lillilli.o00O0o00 /*{ENCODED_INT: 49283}*/:
                                                    case Lillilli.o00oOOo /*{ENCODED_INT: 49284}*/:
                                                    case Lillilli.o00O0o0 /*{ENCODED_INT: 49285}*/:
                                                    case Lillilli.o00O0o0O /*{ENCODED_INT: 49286}*/:
                                                    case Lillilli.o00O0o0o /*{ENCODED_INT: 49287}*/:
                                                    case Lillilli.o00O0o /*{ENCODED_INT: 49288}*/:
                                                    case Lillilli.o00O0oO /*{ENCODED_INT: 49289}*/:
                                                    case Lillilli.o00O0oOO /*{ENCODED_INT: 49290}*/:
                                                    case Lillilli.o00O0oOo /*{ENCODED_INT: 49291}*/:
                                                    case Lillilli.o00O0oo0 /*{ENCODED_INT: 49292}*/:
                                                    case Lillilli.o00O0oo /*{ENCODED_INT: 49293}*/:
                                                    case Lillilli.o00O0ooo /*{ENCODED_INT: 49294}*/:
                                                    case Lillilli.o00O /*{ENCODED_INT: 49295}*/:
                                                    case Lillilli.o00OO000 /*{ENCODED_INT: 49296}*/:
                                                    case Lillilli.o00OO00O /*{ENCODED_INT: 49297}*/:
                                                    case Lillilli.o00OO00o /*{ENCODED_INT: 49298}*/:
                                                    case Lillilli.o00OO0 /*{ENCODED_INT: 49299}*/:
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case Lillilli.o00OO /*{ENCODED_INT: 49308}*/:
                                                            case Lillilli.o00OOO00 /*{ENCODED_INT: 49309}*/:
                                                            case Lillilli.o00OOO0 /*{ENCODED_INT: 49310}*/:
                                                            case Lillilli.o00OOO0O /*{ENCODED_INT: 49311}*/:
                                                            case Lillilli.o0o0Oo /*{ENCODED_INT: 49312}*/:
                                                            case Lillilli.o00OOO /*{ENCODED_INT: 49313}*/:
                                                            case Lillilli.o00OOOO0 /*{ENCODED_INT: 49314}*/:
                                                            case Lillilli.o00OOOO /*{ENCODED_INT: 49315}*/:
                                                            case Lillilli.o00OOOOo /*{ENCODED_INT: 49316}*/:
                                                            case Lillilli.oOooo0o /*{ENCODED_INT: 49317}*/:
                                                            case Lillilli.o00OOOo0 /*{ENCODED_INT: 49318}*/:
                                                            case Lillilli.o00OOOo /*{ENCODED_INT: 49319}*/:
                                                            case Lillilli.o00OOOoO /*{ENCODED_INT: 49320}*/:
                                                            case Lillilli.o00OOoo /*{ENCODED_INT: 49321}*/:
                                                            case Lillilli.o00OOooO /*{ENCODED_INT: 49322}*/:
                                                            case Lillilli.o00OOooo /*{ENCODED_INT: 49323}*/:
                                                            case Lillilli.o00OoOoO /*{ENCODED_INT: 49324}*/:
                                                            case Lillilli.o00Oo000 /*{ENCODED_INT: 49325}*/:
                                                            case Lillilli.o00Oo00 /*{ENCODED_INT: 49326}*/:
                                                            case Lillilli.o00Oo00o /*{ENCODED_INT: 49327}*/:
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case Lillilli.o00Oo0O /*{ENCODED_INT: 52392}*/:
                                                                    case Lillilli.o00Oo0Oo /*{ENCODED_INT: 52393}*/:
                                                                    case Lillilli.o00Oo0o0 /*{ENCODED_INT: 52394}*/:
                                                                    case Lillilli.o00Oo0o /*{ENCODED_INT: 52395}*/:
                                                                    case Lillilli.o00Oo0oO /*{ENCODED_INT: 52396}*/:
                                                                    case Lillilli.o00Oo0oo /*{ENCODED_INT: 52397}*/:
                                                                    case Lillilli.o0oOO /*{ENCODED_INT: 52398}*/:
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case 65280:
                                                                            case 65281:
                                                                            case 65282:
                                                                            case Lillilli.o00OoO0o /*{ENCODED_INT: 65283}*/:
                                                                            case Lillilli.o00OoO /*{ENCODED_INT: 65284}*/:
                                                                            case Lillilli.o00OoOO0 /*{ENCODED_INT: 65285}*/:
                                                                                break;
                                                                            default:
                                                                                switch (i) {
                                                                                    case Lillilli.o00OoOO /*{ENCODED_INT: 65296}*/:
                                                                                    case Lillilli.o00OoOOO /*{ENCODED_INT: 65297}*/:
                                                                                    case Lillilli.o00OoOOo /*{ENCODED_INT: 65298}*/:
                                                                                    case Lillilli.o00OoOo0 /*{ENCODED_INT: 65299}*/:
                                                                                    case Lillilli.o00OoOo /*{ENCODED_INT: 65300}*/:
                                                                                    case Lillilli.o00OoOoo /*{ENCODED_INT: 65301}*/:
                                                                                        break;
                                                                                    default:
                                                                                        return i1iiIl.OooO00o;
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
        return i1iiIl.OooO0Oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static i1iiIl m15917OooO00o(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 >= 0) {
            return i1iiIl.OooO00o(read, read2);
        }
        throw new EOFException();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static i1iiIl m15918OooO00o(byte[] bArr, int i) throws IOException {
        return i1iiIl.OooO00o(bArr[i] & 255, bArr[i + 1] & 255);
    }

    public static AbstractC6122iIlLiL OooO00o(byte[] bArr) throws IOException {
        C5805Ll1 r0 = new C5805Ll1(bArr);
        AbstractC6122iIlLiL OooO00o2 = r0.OooO00o();
        if (OooO00o2 == null) {
            throw new TlsFatalAlert(50);
        } else if (r0.OooO00o() == null) {
            return OooO00o2;
        } else {
            throw new TlsFatalAlert(50);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC6436l11LI m15919OooO00o(int i) {
        return i != 0 ? m15920OooO00o(m15922OooO00o(i)) : new C6352ili();
    }

    public static AbstractC6436l11LI OooO00o(int i, AbstractC6436l11LI r1) {
        return i != 0 ? OooO00o(m15922OooO00o(i), r1) : new C6352ili((C6352ili) r1);
    }

    public static AbstractC6436l11LI OooO00o(II1LLIl iI1LLIl) {
        return iI1LLIl == null ? new C6352ili() : m15920OooO00o(iI1LLIl.OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC6436l11LI m15920OooO00o(short s) {
        switch (s) {
            case 1:
                return new i1l11II();
            case 2:
                return new C6461l1liI();
            case 3:
                return new C9495LLIl();
            case 4:
                return new I1li1Ll();
            case 5:
                return new i1iLLll();
            case 6:
                return new C5622LILlL();
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static AbstractC6436l11LI OooO00o(short s, AbstractC6436l11LI r1) {
        switch (s) {
            case 1:
                return new i1l11II((i1l11II) r1);
            case 2:
                return new C6461l1liI((C6461l1liI) r1);
            case 3:
                return new C9495LLIl((C9495LLIl) r1);
            case 4:
                return new I1li1Ll((I1li1Ll) r1);
            case 5:
                return new i1iLLll((i1iLLll) r1);
            case 6:
                return new C5622LILlL((C5622LILlL) r1);
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static AbstractC6830lILl1 OooO00o(byte[] bArr, C5495I1I1 r2) {
        return new IL1ll1(bArr, r2);
    }

    public static Vector OooO00o() {
        Vector vector = new Vector(4);
        vector.addElement(C6732ll1i1.OooO00o(0));
        vector.addElement(C6732ll1i1.OooO00o(1));
        vector.addElement(C6732ll1i1.OooO00o(2));
        vector.addElement(C6732ll1i1.OooO00o(3));
        return vector;
    }

    public static Vector OooO00o(Object obj) {
        Vector vector = new Vector(1);
        vector.addElement(obj);
        return vector;
    }

    public static Vector OooO00o(Hashtable hashtable) throws IOException {
        byte[] OooO00o2 = OooO00o(hashtable, OooO00o);
        if (OooO00o2 == null) {
            return null;
        }
        return m15921OooO00o(OooO00o2);
    }

    public static Vector OooO00o(Vector vector) {
        if (vector == null) {
            return OooO00o();
        }
        Vector vector2 = new Vector(4);
        vector2.addElement(C6732ll1i1.OooO00o(0));
        for (int i = 0; i < vector.size(); i++) {
            Short OooO00o2 = C6732ll1i1.OooO00o(((II1LLIl) vector.elementAt(i)).OooO0O0());
            if (!vector2.contains(OooO00o2)) {
                vector2.addElement(OooO00o2);
            }
        }
        return vector2;
    }

    public static Vector OooO00o(boolean z, InputStream inputStream) throws IOException {
        int OooO00o2 = OooO00o(inputStream);
        if (OooO00o2 < 2 || (OooO00o2 & 1) != 0) {
            throw new TlsFatalAlert(50);
        }
        int i = OooO00o2 / 2;
        Vector vector = new Vector(i);
        for (int i2 = 0; i2 < i; i2++) {
            II1LLIl OooO00o3 = II1LLIl.OooO00o(inputStream);
            if (z || OooO00o3.OooO0O0() != 0) {
                vector.addElement(OooO00o3);
            } else {
                throw new TlsFatalAlert(47);
            }
        }
        return vector;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Vector m15921OooO00o(byte[] bArr) throws IOException {
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            Vector OooO00o2 = OooO00o(false, (InputStream) byteArrayInputStream);
            AbstractC6892l1.OooO0O0(byteArrayInputStream);
            return OooO00o2;
        }
        throw new IllegalArgumentException("'extensionData' cannot be null");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static short m15922OooO00o(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("legacy PRF not a valid algorithm");
        } else if (i == 1) {
            return 4;
        } else {
            if (i == 2) {
                return 5;
            }
            throw new IllegalArgumentException("unknown PRFAlgorithm");
        }
    }

    public static short OooO00o(C6827lIIi1I1 r3, C6827lIIi1I1 r4) throws IOException {
        if (r3.m17955OooO00o()) {
            return -1;
        }
        LilIiIl OooO00o2 = r3.OooO00o(0);
        try {
            C6213iL11I OooO00o3 = IILLl.OooO00o(OooO00o2.m16321OooO00o());
            if (OooO00o3.OooO00o()) {
                throw new TlsFatalAlert(80);
            } else if (OooO00o3 instanceof liLI1l1i) {
                OooO00o(OooO00o2, 128);
                return 1;
            } else if (OooO00o3 instanceof C5242IIl) {
                OooO00o(OooO00o2, 128);
                return 2;
            } else if (OooO00o3 instanceof LL1ii1l) {
                OooO00o(OooO00o2, 128);
                return 64;
            } else {
                throw new TlsFatalAlert(43);
            }
        } catch (Exception e) {
            throw new TlsFatalAlert(43, e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static short m15923OooO00o(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read >= 0) {
            return (short) read;
        }
        throw new EOFException();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static short m15924OooO00o(byte[] bArr, int i) {
        return (short) (bArr[i] & 255);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m15925OooO00o(int i) throws IOException {
        if (!m15947OooO0Oo(i)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void OooO00o(int i, OutputStream outputStream) throws IOException {
        outputStream.write(i >>> 8);
        outputStream.write(i);
    }

    public static void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    public static void OooO00o(long j) throws IOException {
        if (!m15929OooO00o(j)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void OooO00o(long j, OutputStream outputStream) throws IOException {
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) j));
    }

    public static void OooO00o(long j, byte[] bArr, int i) {
        bArr[i] = (byte) ((int) (j >>> 24));
        bArr[i + 1] = (byte) ((int) (j >>> 16));
        bArr[i + 2] = (byte) ((int) (j >>> 8));
        bArr[i + 3] = (byte) ((int) j);
    }

    public static void OooO00o(LilIiIl lilIiIl, int i) throws IOException {
        C5387Ii OooO00o2;
        iI11IL OooO00o3 = lilIiIl.OooO00o().m15514OooO00o();
        if (OooO00o3 != null && (OooO00o2 = C5387Ii.OooO00o(OooO00o3)) != null && (OooO00o2.OooO00o()[0] & 255 & i) != i) {
            throw new TlsFatalAlert(46);
        }
    }

    public static void OooO00o(i1iiIl i1iiil, OutputStream outputStream) throws IOException {
        outputStream.write(i1iiil.OooO0O0());
        outputStream.write(i1iiil.OooO0OO());
    }

    public static void OooO00o(i1iiIl i1iiil, byte[] bArr, int i) {
        bArr[i] = (byte) i1iiil.OooO0O0();
        bArr[i + 1] = (byte) i1iiil.OooO0OO();
    }

    public static void OooO00o(AbstractC6436l11LI r8, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C6383iLl1 r0 = new C6383iLl1(r8);
        r0.OooO00o(new C6642li1LI(bArr));
        int OooO0O02 = r8.OooO0O0();
        int length = ((bArr3.length + OooO0O02) - 1) / OooO0O02;
        int OooO00o2 = r0.OooO00o();
        byte[] bArr4 = new byte[OooO00o2];
        byte[] bArr5 = new byte[r0.OooO00o()];
        byte[] bArr6 = bArr2;
        int i = 0;
        while (i < length) {
            r0.update(bArr6, 0, bArr6.length);
            r0.OooO00o(bArr4, 0);
            r0.update(bArr4, 0, OooO00o2);
            r0.update(bArr2, 0, bArr2.length);
            r0.OooO00o(bArr5, 0);
            int i2 = OooO0O02 * i;
            System.arraycopy(bArr5, 0, bArr3, i2, Math.min(OooO0O02, bArr3.length - i2));
            i++;
            bArr6 = bArr4;
        }
    }

    public static void OooO00o(AbstractC9439IL r3, Vector vector) {
        if (vector != null) {
            for (int i = 0; i < vector.size(); i++) {
                short OooO00o2 = ((II1LLIl) vector.elementAt(i)).OooO00o();
                if (!C6259iii1.m17267OooO00o(OooO00o2)) {
                    r3.OooO00o(OooO00o2);
                }
            }
        }
    }

    public static void OooO00o(Hashtable hashtable, Vector vector) throws IOException {
        hashtable.put(OooO00o, m15932OooO00o(vector));
    }

    public static void OooO00o(Vector vector, II1LLIl iI1LLIl) throws IOException {
        if (vector == null || vector.size() < 1 || vector.size() >= 32768) {
            throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
        } else if (iI1LLIl != null) {
            if (iI1LLIl.OooO0O0() != 0) {
                for (int i = 0; i < vector.size(); i++) {
                    II1LLIl iI1LLIl2 = (II1LLIl) vector.elementAt(i);
                    if (iI1LLIl2.OooO00o() == iI1LLIl.OooO00o() && iI1LLIl2.OooO0O0() == iI1LLIl.OooO0O0()) {
                        return;
                    }
                }
            }
            throw new TlsFatalAlert(47);
        } else {
            throw new IllegalArgumentException("'signatureAlgorithm' cannot be null");
        }
    }

    public static void OooO00o(Vector vector, boolean z, OutputStream outputStream) throws IOException {
        if (vector == null || vector.size() < 1 || vector.size() >= 32768) {
            throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
        }
        int size = vector.size() * 2;
        m15925OooO00o(size);
        OooO00o(size, outputStream);
        for (int i = 0; i < vector.size(); i++) {
            II1LLIl iI1LLIl = (II1LLIl) vector.elementAt(i);
            if (z || iI1LLIl.OooO0O0() != 0) {
                iI1LLIl.OooO00o(outputStream);
            } else {
                throw new IllegalArgumentException("SignatureAlgorithm.anonymous MUST NOT appear in the signature_algorithms extension");
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m15926OooO00o(short s) throws IOException {
        if (!OooO0O0(s)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void OooO00o(short s, OutputStream outputStream) throws IOException {
        outputStream.write(s);
    }

    public static void OooO00o(short s, byte[] bArr, int i) {
        bArr[i] = (byte) s;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m15927OooO00o(byte[] bArr, int i) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        bArr[i] = (byte) (currentTimeMillis >>> 24);
        bArr[i + 1] = (byte) (currentTimeMillis >>> 16);
        bArr[i + 2] = (byte) (currentTimeMillis >>> 8);
        bArr[i + 3] = (byte) currentTimeMillis;
    }

    public static void OooO00o(byte[] bArr, InputStream inputStream) throws IOException {
        int length = bArr.length;
        if (length > 0 && length != C6304ilIi1.OooO00o(inputStream, bArr)) {
            throw new EOFException();
        }
    }

    public static void OooO00o(byte[] bArr, OutputStream outputStream) throws IOException {
        m15925OooO00o(bArr.length);
        OooO00o(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void OooO00o(int[] iArr, OutputStream outputStream) throws IOException {
        for (int i : iArr) {
            OooO00o(i, outputStream);
        }
    }

    public static void OooO00o(int[] iArr, byte[] bArr, int i) throws IOException {
        for (int i2 : iArr) {
            OooO00o(i2, bArr, i);
            i += 2;
        }
    }

    public static void OooO00o(short[] sArr, OutputStream outputStream) throws IOException {
        for (short s : sArr) {
            OooO00o(s, outputStream);
        }
    }

    public static void OooO00o(short[] sArr, byte[] bArr, int i) throws IOException {
        for (short s : sArr) {
            OooO00o(s, bArr, i);
            i++;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15928OooO00o(int i) throws IOException {
        return 2 == OooO00o(i);
    }

    public static boolean OooO00o(int i, i1iiIl i1iiil) {
        return m15916OooO00o(i).OooO0O0(i1iiil.m16891OooO00o());
    }

    public static boolean OooO00o(int i, Vector vector) {
        short s;
        Short OooO00o2;
        try {
            int OooO0OO2 = OooO0OO(i);
            if (!(OooO0OO2 == 3 || OooO0OO2 == 4)) {
                if (!(OooO0OO2 == 5 || OooO0OO2 == 6)) {
                    if (!(OooO0OO2 == 11 || OooO0OO2 == 12)) {
                        if (OooO0OO2 == 17) {
                            OooO00o2 = C6732ll1i1.OooO00o(3);
                            return vector.contains(OooO00o2);
                        } else if (OooO0OO2 != 19) {
                            if (OooO0OO2 != 20) {
                                if (OooO0OO2 != 22) {
                                    if (OooO0OO2 != 23) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                    s = 0;
                    OooO00o2 = C6732ll1i1.OooO00o(s);
                    return vector.contains(OooO00o2);
                }
                OooO00o2 = C6732ll1i1.OooO00o(1);
                return vector.contains(OooO00o2);
            }
            s = 2;
            OooO00o2 = C6732ll1i1.OooO00o(s);
            return vector.contains(OooO00o2);
        } catch (IOException unused) {
            return true;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15929OooO00o(long j) {
        return (WebSocketProtocol.PAYLOAD_SHORT_MAX & j) == j;
    }

    public static boolean OooO00o(i1iiIl i1iiil) {
        return i1iiIl.OooO0Oo.OooO0O0(i1iiil.m16891OooO00o());
    }

    public static boolean OooO00o(iL1liI il1lii) {
        return il1lii.OooO0O0().m16893OooO0O0();
    }

    public static boolean OooO00o(Hashtable hashtable, Integer num, short s) throws IOException {
        byte[] OooO00o2 = OooO00o(hashtable, num);
        if (OooO00o2 == null) {
            return false;
        }
        if (OooO00o2.length == 0) {
            return true;
        }
        throw new TlsFatalAlert(s);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15930OooO00o(short s) {
        return s == 1 || s == 2 || s == 64;
    }

    public static byte[] OooO00o(int i, InputStream inputStream) throws IOException {
        if (i < 1) {
            return f16174OooO00o;
        }
        byte[] bArr = new byte[i];
        int OooO00o2 = C6304ilIi1.OooO00o(inputStream, bArr);
        if (OooO00o2 == 0) {
            return null;
        }
        if (OooO00o2 == i) {
            return bArr;
        }
        throw new EOFException();
    }

    public static byte[] OooO00o(iL1liI il1lii, int i) {
        C6107iIiL OooO00o2 = il1lii.m17074OooO00o();
        byte[] OooO0O02 = OooO00o2.m16976OooO0O0();
        byte[] OooO0O03 = OooO0O0(OooO00o2.OooO0o(), OooO00o2.m16975OooO00o());
        return OooO00o(il1lii) ? OooO00o(OooO0O02, OooO0O03, i) : OooO00o(il1lii, OooO0O02, "key expansion", OooO0O03, i);
    }

    public static byte[] OooO00o(iL1liI il1lii, String str, byte[] bArr) {
        if (OooO00o(il1lii)) {
            return bArr;
        }
        C6107iIiL OooO00o2 = il1lii.m17074OooO00o();
        return OooO00o(il1lii, OooO00o2.m16976OooO0O0(), str, bArr, OooO00o2.OooO0Oo());
    }

    public static byte[] OooO00o(iL1liI il1lii, byte[] bArr) {
        C6107iIiL OooO00o2 = il1lii.m17074OooO00o();
        byte[] OooO0oO = OooO00o2.f17565OooO0OO ? OooO00o2.OooO0oO() : OooO0O0(OooO00o2.m16975OooO00o(), OooO00o2.OooO0o());
        if (OooO00o(il1lii)) {
            return OooO00o(bArr, OooO0oO);
        }
        return OooO00o(il1lii, bArr, OooO00o2.f17565OooO0OO ? LiLLlii.OooO : "master secret", OooO0oO, 48);
    }

    public static byte[] OooO00o(iL1liI il1lii, byte[] bArr, String str, byte[] bArr2, int i) {
        if (!il1lii.OooO0O0().m16893OooO0O0()) {
            byte[] OooO00o2 = Strings.m22985OooO00o(str);
            byte[] OooO0O02 = OooO0O0(OooO00o2, bArr2);
            int OooO0OO2 = il1lii.m17074OooO00o().OooO0OO();
            if (OooO0OO2 == 0) {
                return OooO00o(bArr, OooO00o2, OooO0O02, i);
            }
            byte[] bArr3 = new byte[i];
            OooO00o(m15919OooO00o(OooO0OO2), bArr, OooO0O02, bArr3);
            return bArr3;
        }
        throw new IllegalStateException("No PRF available for SSLv3 session");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m15931OooO00o(InputStream inputStream) throws IOException {
        return OooO0O0(OooO00o(inputStream), inputStream);
    }

    public static byte[] OooO00o(Hashtable hashtable, Integer num) {
        if (hashtable == null) {
            return null;
        }
        return (byte[]) hashtable.get(num);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m15932OooO00o(Vector vector) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OooO00o(vector, false, (OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m15933OooO00o(byte[] bArr) throws IOException {
        m15943OooO0OO(bArr.length);
        return C9586iIILl.OooO0O0(bArr, (byte) bArr.length);
    }

    public static byte[] OooO00o(byte[] bArr, String str, byte[] bArr2, int i) {
        byte[] OooO00o2 = Strings.m22985OooO00o(str);
        return OooO00o(bArr, OooO00o2, OooO0O0(OooO00o2, bArr2), i);
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        AbstractC6436l11LI OooO00o2 = m15920OooO00o((short) 1);
        AbstractC6436l11LI OooO00o3 = m15920OooO00o((short) 2);
        int OooO0O02 = OooO00o2.OooO0O0();
        int OooO0O03 = OooO00o3.OooO0O0();
        byte[] bArr3 = new byte[OooO0O03];
        byte[] bArr4 = new byte[(OooO0O02 * 3)];
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            byte[] bArr5 = f16178OooO00o[i2];
            OooO00o3.update(bArr5, 0, bArr5.length);
            OooO00o3.update(bArr, 0, bArr.length);
            OooO00o3.update(bArr2, 0, bArr2.length);
            OooO00o3.OooO00o(bArr3, 0);
            OooO00o2.update(bArr, 0, bArr.length);
            OooO00o2.update(bArr3, 0, OooO0O03);
            OooO00o2.OooO00o(bArr4, i);
            i += OooO0O02;
        }
        return bArr4;
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2, int i) {
        AbstractC6436l11LI OooO00o2 = m15920OooO00o((short) 1);
        AbstractC6436l11LI OooO00o3 = m15920OooO00o((short) 2);
        int OooO0O02 = OooO00o2.OooO0O0();
        int OooO0O03 = OooO00o3.OooO0O0();
        byte[] bArr3 = new byte[OooO0O03];
        byte[] bArr4 = new byte[(i + OooO0O02)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            byte[] bArr5 = f16178OooO00o[i3];
            OooO00o3.update(bArr5, 0, bArr5.length);
            OooO00o3.update(bArr, 0, bArr.length);
            OooO00o3.update(bArr2, 0, bArr2.length);
            OooO00o3.OooO00o(bArr3, 0);
            OooO00o2.update(bArr, 0, bArr.length);
            OooO00o2.update(bArr3, 0, OooO0O03);
            OooO00o2.OooO00o(bArr4, i2);
            i2 += OooO0O02;
            i3++;
        }
        return C9586iIILl.m21632OooO00o(bArr4, 0, i);
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int length = (bArr.length + 1) / 2;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr, 0, bArr4, 0, length);
        System.arraycopy(bArr, bArr.length - length, bArr5, 0, length);
        byte[] bArr6 = new byte[i];
        byte[] bArr7 = new byte[i];
        OooO00o(m15920OooO00o((short) 1), bArr4, bArr3, bArr6);
        OooO00o(m15920OooO00o((short) 2), bArr5, bArr3, bArr7);
        for (int i2 = 0; i2 < i; i2++) {
            bArr6[i2] = (byte) (bArr6[i2] ^ bArr7[i2]);
        }
        return bArr6;
    }

    public static byte[] OooO00o(int[] iArr) throws IOException {
        byte[] bArr = new byte[((iArr.length * 2) + 2)];
        OooO0O0(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] OooO00o(short[] sArr) throws IOException {
        byte[] bArr = new byte[(sArr.length + 1)];
        OooO0O0(sArr, bArr, 0);
        return bArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m15934OooO00o(int i, InputStream inputStream) throws IOException {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = OooO00o(inputStream);
        }
        return iArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static short[] m15935OooO00o(int i, InputStream inputStream) throws IOException {
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = m15923OooO00o(inputStream);
        }
        return sArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[][] m15936OooO00o() {
        byte[][] bArr = new byte[10][];
        int i = 0;
        while (i < 10) {
            int i2 = i + 1;
            byte[] bArr2 = new byte[i2];
            C9586iIILl.OooO00o(bArr2, (byte) (i + 65));
            bArr[i] = bArr2;
            i = i2;
        }
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int OooO0O0(int r3) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 768
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.L1LL1Ii.OooO0O0(int):int");
    }

    public static int OooO0O0(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        if (read3 >= 0) {
            return read3 | (read << 16) | (read2 << 8);
        }
        throw new EOFException();
    }

    public static int OooO0O0(byte[] bArr, int i) {
        int i2 = i + 1;
        return (bArr[i2 + 1] & 255) | ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static long m15937OooO0O0(InputStream inputStream) throws IOException {
        return ((((long) OooO0O0(inputStream)) & 4294967295L) << 24) | (4294967295L & ((long) OooO0O0(inputStream)));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static long m15938OooO0O0(byte[] bArr, int i) {
        int OooO0O02 = OooO0O0(bArr, i);
        return (((long) OooO0O0(bArr, i + 3)) & 4294967295L) | ((((long) OooO0O02) & 4294967295L) << 24);
    }

    public static AbstractC6122iIlLiL OooO0O0(byte[] bArr) throws IOException {
        AbstractC6122iIlLiL OooO00o2 = OooO00o(bArr);
        if (C9586iIILl.m21627OooO00o(OooO00o2.OooO00o(AbstractC5533IiL.OooO00o), bArr)) {
            return OooO00o2;
        }
        throw new TlsFatalAlert(50);
    }

    public static Vector OooO0O0() {
        return OooO00o((Object) new II1LLIl(2, 2));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m15939OooO0O0(int i) throws IOException {
        if (!OooO0o0(i)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void OooO0O0(int i, OutputStream outputStream) throws IOException {
        outputStream.write((byte) (i >>> 16));
        outputStream.write((byte) (i >>> 8));
        outputStream.write((byte) i);
    }

    public static void OooO0O0(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) i;
    }

    public static void OooO0O0(long j) throws IOException {
        if (!m15941OooO0O0(j)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void OooO0O0(long j, OutputStream outputStream) throws IOException {
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) j));
    }

    public static void OooO0O0(long j, byte[] bArr, int i) {
        bArr[i] = (byte) ((int) (j >>> 40));
        bArr[i + 1] = (byte) ((int) (j >>> 32));
        bArr[i + 2] = (byte) ((int) (j >>> 24));
        bArr[i + 3] = (byte) ((int) (j >>> 16));
        bArr[i + 4] = (byte) ((int) (j >>> 8));
        bArr[i + 5] = (byte) ((int) j);
    }

    public static void OooO0O0(byte[] bArr, OutputStream outputStream) throws IOException {
        m15939OooO0O0(bArr.length);
        OooO0O0(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void OooO0O0(int[] iArr, OutputStream outputStream) throws IOException {
        int length = iArr.length * 2;
        m15925OooO00o(length);
        OooO00o(length, outputStream);
        OooO00o(iArr, outputStream);
    }

    public static void OooO0O0(int[] iArr, byte[] bArr, int i) throws IOException {
        int length = iArr.length * 2;
        m15925OooO00o(length);
        OooO00o(length, bArr, i);
        OooO00o(iArr, bArr, i + 2);
    }

    public static void OooO0O0(short[] sArr, OutputStream outputStream) throws IOException {
        m15943OooO0OO(sArr.length);
        OooO0OO(sArr.length, outputStream);
        OooO00o(sArr, outputStream);
    }

    public static void OooO0O0(short[] sArr, byte[] bArr, int i) throws IOException {
        m15943OooO0OO(sArr.length);
        OooO0OO(sArr.length, bArr, i);
        OooO00o(sArr, bArr, i + 1);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m15940OooO0O0(int i) throws IOException {
        return 1 == OooO00o(i);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m15941OooO0O0(long j) {
        return (16777215 & j) == j;
    }

    public static boolean OooO0O0(i1iiIl i1iiil) {
        return i1iiIl.OooO0OO.OooO0O0(i1iiil.m16891OooO00o());
    }

    public static boolean OooO0O0(iL1liI il1lii) {
        return OooO0O0(il1lii.OooO0O0());
    }

    public static boolean OooO0O0(short s) {
        return (s & 255) == s;
    }

    public static byte[] OooO0O0(int i, InputStream inputStream) throws IOException {
        if (i < 1) {
            return f16174OooO00o;
        }
        byte[] bArr = new byte[i];
        if (i == C6304ilIi1.OooO00o(inputStream, bArr)) {
            return bArr;
        }
        throw new EOFException();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static byte[] m15942OooO0O0(InputStream inputStream) throws IOException {
        return OooO0O0(OooO0O0(inputStream), inputStream);
    }

    public static byte[] OooO0O0(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:786)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:130)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:825)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:130)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:825)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:130)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:696)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:88)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:50)
        */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053 A[RETURN] */
    public static int OooO0OO(int r2) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 762
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.L1LL1Ii.OooO0OO(int):int");
    }

    public static int OooO0OO(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 >= 0) {
            return read2 | (read << 8);
        }
        throw new EOFException();
    }

    public static int OooO0OO(byte[] bArr, int i) throws IOException {
        return bArr[i + 1] | (bArr[i] << 8);
    }

    public static Vector OooO0OO() {
        return OooO00o((Object) new II1LLIl(2, 3));
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static void m15943OooO0OO(int i) throws IOException {
        if (!OooO0o(i)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void OooO0OO(int i, OutputStream outputStream) throws IOException {
        outputStream.write(i);
    }

    public static void OooO0OO(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
    }

    public static void OooO0OO(long j) throws IOException {
        if (!m15945OooO0OO(j)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void OooO0OO(long j, OutputStream outputStream) throws IOException {
        outputStream.write((byte) ((int) (j >>> 56)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) j));
    }

    public static void OooO0OO(long j, byte[] bArr, int i) {
        bArr[i] = (byte) ((int) (j >>> 56));
        bArr[i + 1] = (byte) ((int) (j >>> 48));
        bArr[i + 2] = (byte) ((int) (j >>> 40));
        bArr[i + 3] = (byte) ((int) (j >>> 32));
        bArr[i + 4] = (byte) ((int) (j >>> 24));
        bArr[i + 5] = (byte) ((int) (j >>> 16));
        bArr[i + 6] = (byte) ((int) (j >>> 8));
        bArr[i + 7] = (byte) ((int) j);
    }

    public static void OooO0OO(byte[] bArr, OutputStream outputStream) throws IOException {
        m15943OooO0OO(bArr.length);
        OooO0OO(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static boolean m15944OooO0OO(int i) throws IOException {
        return OooO00o(i) == 0;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static boolean m15945OooO0OO(long j) {
        return (4294967295L & j) == j;
    }

    public static boolean OooO0OO(i1iiIl i1iiil) {
        return i1iiIl.OooO0Oo.OooO0O0(i1iiil.m16891OooO00o());
    }

    public static boolean OooO0OO(iL1liI il1lii) {
        return OooO0OO(il1lii.OooO0O0());
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static byte[] m15946OooO0OO(InputStream inputStream) throws IOException {
        return OooO0O0(m15923OooO00o(inputStream), inputStream);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:786)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:130)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:825)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:130)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:825)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:130)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:825)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:130)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:825)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:130)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:696)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:696)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:696)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:696)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:88)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:50)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c A[RETURN] */
    public static int OooO0Oo(int r4) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 722
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.L1LL1Ii.OooO0Oo(int):int");
    }

    public static Vector OooO0Oo() {
        return OooO00o((Object) new II1LLIl(2, 1));
    }

    public static void OooO0Oo(long j) throws IOException {
        if (!m15948OooO0Oo(j)) {
            throw new TlsFatalAlert(80);
        }
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static boolean m15947OooO0Oo(int i) {
        return (65535 & i) == i;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static boolean m15948OooO0Oo(long j) {
        return (C6440l1I.OooO0OO & j) == j;
    }

    public static void OooO0o(long j) throws IOException {
        if (!m15949OooO0o(j)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static boolean OooO0o(int i) {
        return (i & 255) == i;
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public static boolean m15949OooO0o(long j) {
        return (255 & j) == j;
    }

    public static Vector OooO0o0() {
        short[] sArr = {2, 3, 4, 5, 6};
        short[] sArr2 = {1, 2, 3};
        Vector vector = new Vector();
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                vector.addElement(new II1LLIl(sArr[i2], sArr2[i]));
            }
        }
        return vector;
    }

    public static void OooO0o0(long j) throws IOException {
        if (!m15950OooO0o0(j)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static boolean OooO0o0(int i) {
        return (16777215 & i) == i;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public static boolean m15950OooO0o0(long j) {
        return true;
    }
}
