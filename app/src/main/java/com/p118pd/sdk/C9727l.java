package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Exception;

/* renamed from: com.pd.sdk.丨l丨  reason: invalid class name and case insensitive filesystem */
public class C9727l {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final InputStream f23359OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[][] f23360OooO00o;

    public C9727l(InputStream inputStream) {
        this(inputStream, L1li1.OooO00o(inputStream));
    }

    public C9727l(InputStream inputStream, int i) {
        this.f23359OooO00o = inputStream;
        this.OooO00o = i;
        this.f23360OooO00o = new byte[11][];
    }

    public C9727l(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    private void OooO00o(boolean z) {
        InputStream inputStream = this.f23359OooO00o;
        if (inputStream instanceof C9637ili) {
            ((C9637ili) inputStream).OooO0O0(z);
        }
    }

    public AbstractC6122iIlLiL OooO00o(boolean z, int i) throws IOException {
        if (!z) {
            return new ILI1Ll(false, i, new C6487lIIiIlL(((iI1L1Ll) this.f23359OooO00o).m16938OooO0O0()));
        }
        iILLL1 OooO00o2 = OooO00o();
        return this.f23359OooO00o instanceof C9637ili ? OooO00o2.OooO00o() == 1 ? new C6881lliiI1(true, i, OooO00o2.OooO00o(0)) : new C6881lliiI1(false, i, C6745llI.m17844OooO00o(OooO00o2)) : OooO00o2.OooO00o() == 1 ? new ILI1Ll(true, i, OooO00o2.OooO00o(0)) : new ILI1Ll(false, i, C1678I.m15724OooO00o(OooO00o2));
    }

    public iILLL1 OooO00o() throws IOException {
        iILLL1 r0 = new iILLL1();
        while (true) {
            AbstractC6854lLi1LL OooO00o2 = m21778OooO00o();
            if (OooO00o2 == null) {
                return r0;
            }
            r0.OooO00o(OooO00o2 instanceof AbstractC6181iLiLI ? ((AbstractC6181iLiLI) OooO00o2).OooO00o() : OooO00o2.OooO0O0());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL m21778OooO00o() throws IOException {
        int read = this.f23359OooO00o.read();
        if (read == -1) {
            return null;
        }
        boolean z = false;
        OooO00o(false);
        int OooO0O0 = C5805Ll1.OooO0O0(this.f23359OooO00o, read);
        if ((read & 32) != 0) {
            z = true;
        }
        int OooO00o2 = C5805Ll1.OooO00o(this.f23359OooO00o, this.OooO00o);
        if (OooO00o2 >= 0) {
            iI1L1Ll r4 = new iI1L1Ll(this.f23359OooO00o, OooO00o2);
            if ((read & 64) != 0) {
                return new ILLIi(z, OooO0O0, r4.m16938OooO0O0());
            }
            if ((read & 128) != 0) {
                return new LLL(z, OooO0O0, new C9727l(r4));
            }
            if (z) {
                if (OooO0O0 == 4) {
                    return new C5508IIi(new C9727l(r4));
                }
                if (OooO0O0 == 8) {
                    return new LlLiLL(new C9727l(r4));
                }
                if (OooO0O0 == 16) {
                    return new C1681LL(new C9727l(r4));
                }
                if (OooO0O0 == 17) {
                    return new C6133iI1LI(new C9727l(r4));
                }
                throw new IOException("unknown tag " + OooO0O0 + " encountered");
            } else if (OooO0O0 == 4) {
                return new C9579i11LL(r4);
            } else {
                try {
                    return C5805Ll1.OooO00o(OooO0O0, r4, this.f23360OooO00o);
                } catch (IllegalArgumentException e) {
                    throw new ASN1Exception("corrupted stream detected", e);
                }
            }
        } else if (z) {
            C9727l r3 = new C9727l(new C9637ili(this.f23359OooO00o, this.OooO00o), this.OooO00o);
            return (read & 64) != 0 ? new C9819LLlI1(OooO0O0, r3) : (read & 128) != 0 ? new LLL(true, OooO0O0, r3) : r3.OooO00o(OooO0O0);
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    public AbstractC6854lLi1LL OooO00o(int i) throws IOException {
        if (i == 4) {
            return new C5508IIi(this);
        }
        if (i == 8) {
            return new LlLiLL(this);
        }
        if (i == 16) {
            return new C5578L11(this);
        }
        if (i == 17) {
            return new C5232IIiI(this);
        }
        throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL m21779OooO00o(boolean z, int i) throws IOException {
        InputStream inputStream = this.f23359OooO00o;
        if (!(inputStream instanceof C9637ili)) {
            if (z) {
                if (i == 4) {
                    return new C5508IIi(this);
                }
                if (i == 16) {
                    return new C1681LL(this);
                }
                if (i == 17) {
                    return new C6133iI1LI(this);
                }
            } else if (i == 4) {
                return new C9579i11LL((iI1L1Ll) inputStream);
            } else {
                if (i == 16) {
                    throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
                } else if (i == 17) {
                    throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
                }
            }
            throw new ASN1Exception("implicit tagging not implemented");
        } else if (z) {
            return OooO00o(i);
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }
}
