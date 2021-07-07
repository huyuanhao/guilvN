package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Exception;

/* renamed from: com.pd.sdk.Ll丨1  reason: invalid class name and case insensitive filesystem */
public class C5805Ll1 extends FilterInputStream implements iI1iI {
    public final byte[][] OooO00o;
    public final boolean OooO0O0;
    public final int o00oO0O;

    public C5805Ll1(InputStream inputStream) {
        this(inputStream, L1li1.OooO00o(inputStream));
    }

    public C5805Ll1(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public C5805Ll1(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.o00oO0O = i;
        this.OooO0O0 = z;
        this.OooO00o = new byte[11][];
    }

    public C5805Ll1(InputStream inputStream, boolean z) {
        this(inputStream, L1li1.OooO00o(inputStream), z);
    }

    public C5805Ll1(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public C5805Ll1(byte[] bArr, boolean z) {
        this(new ByteArrayInputStream(bArr), bArr.length, z);
    }

    public static int OooO00o(InputStream inputStream, int i) throws IOException {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read == 128) {
            return -1;
        } else {
            if (read <= 127) {
                return read;
            }
            int i2 = read & 127;
            if (i2 <= 4) {
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    int read2 = inputStream.read();
                    if (read2 >= 0) {
                        i3 = (i3 << 8) + read2;
                    } else {
                        throw new EOFException("EOF found reading length");
                    }
                }
                if (i3 < 0) {
                    throw new IOException("corrupted stream - negative length found");
                } else if (i3 < i) {
                    return i3;
                } else {
                    throw new IOException("corrupted stream - out of bounds length found");
                }
            } else {
                throw new IOException("DER length more than 4 bytes: " + i2);
            }
        }
    }

    public static AbstractC6122iIlLiL OooO00o(int i, iI1L1Ll r2, byte[][] bArr) throws IOException {
        if (i == 10) {
            return C5841L11I.OooO00o(OooO00o(r2, bArr));
        }
        if (i == 12) {
            return new LII(r2.m16938OooO0O0());
        }
        if (i == 30) {
            return new C6901li11(OooO00o(r2));
        }
        switch (i) {
            case 1:
                return C5514IL.OooO00o(OooO00o(r2, bArr));
            case 2:
                return new C6513lIiI(r2.m16938OooO0O0(), false);
            case 3:
                return IL1Iii.OooO00o(r2.OooO0O0(), r2);
            case 4:
                return new C6487lIIiIlL(r2.m16938OooO0O0());
            case 5:
                return C6452l1Lll.OooO00o;
            case 6:
                return LlLI1.OooO00o(OooO00o(r2, bArr));
            default:
                switch (i) {
                    case 18:
                        return new I1IILIIL(r2.m16938OooO0O0());
                    case 19:
                        return new LI11(r2.m16938OooO0O0());
                    case 20:
                        return new C17021(r2.m16938OooO0O0());
                    case 21:
                        return new C6478lI1I1(r2.m16938OooO0O0());
                    case 22:
                        return new L1iI1(r2.m16938OooO0O0());
                    case 23:
                        return new LL1IL(r2.m16938OooO0O0());
                    case 24:
                        return new C9623il(r2.m16938OooO0O0());
                    case 25:
                        return new C9578i11i(r2.m16938OooO0O0());
                    case 26:
                        return new C1695li(r2.m16938OooO0O0());
                    case 27:
                        return new iiIIi11(r2.m16938OooO0O0());
                    case 28:
                        return new LIlLi(r2.m16938OooO0O0());
                    default:
                        throw new IOException("unknown tag " + i + " encountered");
                }
        }
    }

    public static byte[] OooO00o(iI1L1Ll r3, byte[][] bArr) throws IOException {
        int OooO0O02 = r3.OooO0O0();
        if (r3.OooO0O0() >= bArr.length) {
            return r3.m16938OooO0O0();
        }
        byte[] bArr2 = bArr[OooO0O02];
        if (bArr2 == null) {
            bArr2 = new byte[OooO0O02];
            bArr[OooO0O02] = bArr2;
        }
        C6304ilIi1.OooO00o(r3, bArr2);
        return bArr2;
    }

    public static char[] OooO00o(iI1L1Ll r6) throws IOException {
        int read;
        int OooO0O02 = r6.OooO0O0() / 2;
        char[] cArr = new char[OooO0O02];
        for (int i = 0; i < OooO0O02; i++) {
            int read2 = r6.read();
            if (read2 < 0 || (read = r6.read()) < 0) {
                break;
            }
            cArr[i] = (char) ((read2 << 8) | (read & 255));
        }
        return cArr;
    }

    public static int OooO0O0(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = 0;
        int read = inputStream.read();
        if ((read & 127) != 0) {
            while (read >= 0 && (read & 128) != 0) {
                i3 = (i3 | (read & 127)) << 7;
                read = inputStream.read();
            }
            if (read >= 0) {
                return i3 | (read & 127);
            }
            throw new EOFException("EOF found inside tag value.");
        }
        throw new IOException("corrupted stream - invalid high tag number found");
    }

    public AbstractC6122iIlLiL OooO00o() throws IOException {
        int read = read();
        if (read > 0) {
            int OooO0O02 = OooO0O0(this, read);
            boolean z = (read & 32) != 0;
            int OooO0Oo = OooO0Oo();
            if (OooO0Oo >= 0) {
                try {
                    return OooO00o(read, OooO0O02, OooO0Oo);
                } catch (IllegalArgumentException e) {
                    throw new ASN1Exception("corrupted stream detected", e);
                }
            } else if (z) {
                C9727l r4 = new C9727l(new C9637ili(this, this.o00oO0O), this.o00oO0O);
                if ((read & 64) != 0) {
                    return new C9819LLlI1(OooO0O02, r4).OooO00o();
                }
                if ((read & 128) != 0) {
                    return new LLL(true, OooO0O02, r4).m16215OooO00o();
                }
                if (OooO0O02 == 4) {
                    return new C5508IIi(r4).OooO00o();
                }
                if (OooO0O02 == 8) {
                    return new LlLiLL(r4).OooO00o();
                }
                if (OooO0O02 == 16) {
                    return new C5578L11(r4).OooO00o();
                }
                if (OooO0O02 == 17) {
                    return new C5232IIiI(r4).OooO00o();
                }
                throw new IOException("unknown BER object encountered");
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (read != 0) {
            return null;
        } else {
            throw new IOException("unexpected end-of-contents marker");
        }
    }

    public AbstractC6122iIlLiL OooO00o(int i, int i2, int i3) throws IOException {
        boolean z = (i & 32) != 0;
        iI1L1Ll r2 = new iI1L1Ll(this, i3);
        if ((i & 64) != 0) {
            return new ILLIi(z, i2, r2.m16938OooO0O0());
        }
        if ((i & 128) != 0) {
            return new C9727l(r2).OooO00o(z, i2);
        }
        if (!z) {
            return OooO00o(i2, r2, this.OooO00o);
        }
        if (i2 == 4) {
            iILLL1 OooO00o2 = m16410OooO00o(r2);
            int OooO00o3 = OooO00o2.OooO00o();
            AbstractC6804llL1ii[] r6 = new AbstractC6804llL1ii[OooO00o3];
            for (int i4 = 0; i4 != OooO00o3; i4++) {
                r6[i4] = (AbstractC6804llL1ii) OooO00o2.OooO00o(i4);
            }
            return new C5837L1l(r6);
        } else if (i2 == 8) {
            return new C1687iI(m16410OooO00o(r2));
        } else {
            if (i2 == 16) {
                return this.OooO0O0 ? new C6348iliiL(r2.m16938OooO0O0()) : C1678I.m15724OooO00o(m16410OooO00o(r2));
            }
            if (i2 == 17) {
                return C1678I.OooO00o(m16410OooO00o(r2));
            }
            throw new IOException("unknown tag " + i2 + " encountered");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iILLL1 m16409OooO00o() throws IOException {
        iILLL1 r0 = new iILLL1();
        while (true) {
            AbstractC6122iIlLiL OooO00o2 = OooO00o();
            if (OooO00o2 == null) {
                return r0;
            }
            r0.OooO00o(OooO00o2);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iILLL1 m16410OooO00o(iI1L1Ll r2) throws IOException {
        return new C5805Ll1(r2).m16409OooO00o();
    }

    public int OooO0O0() {
        return this.o00oO0O;
    }

    public int OooO0Oo() throws IOException {
        return OooO00o(this, this.o00oO0O);
    }

    public void readFully(byte[] bArr) throws IOException {
        if (C6304ilIi1.OooO00o(this, bArr) != bArr.length) {
            throw new EOFException("EOF encountered in middle of object");
        }
    }
}
