package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.LLIL丨  reason: invalid class name and case insensitive filesystem */
public class C5655LLIL extends ILiliLL {
    public LL1ii1l OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LiIiLii f16428OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6017i1Il f16429OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6080iII f16430OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6109iIiLiLi f16431OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iLiLiIi1 f16432OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6213iL11I f16433OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6389ii f16434OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6512lIilLl f16435OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public liLI1l1i f16436OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16437OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f16438OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[] f16439OooO00o;
    public byte[] OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public short[] f16440OooO0O0;
    public byte[] OooO0OO;

    public C5655LLIL(int i, Vector vector, AbstractC6109iIiLiLi r3, AbstractC6080iII iii, C6017i1Il i1il, int[] iArr, short[] sArr, short[] sArr2) {
        super(i, vector);
        if (i != 24) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException("unsupported key exchange algorithm");
            }
        }
        this.f16431OooO00o = r3;
        this.f16430OooO00o = iii;
        this.f16429OooO00o = i1il;
        this.f16438OooO00o = iArr;
        this.f16439OooO00o = sArr;
        this.f16440OooO0O0 = sArr2;
    }

    public liLI1l1i OooO00o(liLI1l1i lili1l1i) throws IOException {
        if (lili1l1i.OooO00o().isProbablePrime(2)) {
            return lili1l1i;
        }
        throw new TlsFatalAlert(47);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o() throws IOException {
        if (((ILiliLL) this).OooO00o == 15) {
            throw new TlsFatalAlert(10);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO00o(lilLii1 r2) throws IOException {
        throw new TlsFatalAlert(10);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o(ll1iiLI ll1iili) throws IOException {
        if (ll1iili instanceof iLiLiIi1) {
            OooO00o(ll1iili.OooO00o());
            this.f16432OooO00o = (iLiLiIi1) ll1iili;
            return;
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o(C6827lIIi1I1 r3) throws IOException {
        if (((ILiliLL) this).OooO00o != 15) {
            throw new TlsFatalAlert(10);
        } else if (!r3.m17955OooO00o()) {
            LilIiIl OooO00o2 = r3.OooO00o(0);
            try {
                C6213iL11I OooO00o3 = IILLl.OooO00o(OooO00o2.m16321OooO00o());
                this.f16433OooO00o = OooO00o3;
                if (!OooO00o3.OooO00o()) {
                    this.f16436OooO00o = OooO00o((liLI1l1i) this.f16433OooO00o);
                    L1LL1Ii.OooO00o(OooO00o2, 32);
                    super.OooO00o(r3);
                    return;
                }
                throw new TlsFatalAlert(80);
            } catch (RuntimeException e) {
                throw new TlsFatalAlert(43, e);
            }
        } else {
            throw new TlsFatalAlert(42);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.ILiliLL
    public void OooO00o(InputStream inputStream) throws IOException {
        this.f16437OooO00o = L1LL1Ii.m15931OooO00o(inputStream);
        int i = ((ILiliLL) this).OooO00o;
        if (i == 14) {
            LiIiLii OooO00o2 = C6053i1lii.OooO00o(C6343il11l.OooO00o(inputStream).OooO00o());
            this.f16428OooO00o = OooO00o2;
            this.f16429OooO00o = OooO00o2.OooO00o();
        } else if (i == 24) {
            this.OooO00o = C5234IIllL.OooO00o(C5234IIllL.OooO00o(this.f16439OooO00o, C5234IIllL.OooO00o(this.f16438OooO00o, this.f16439OooO00o, inputStream), L1LL1Ii.m15946OooO0OO(inputStream)));
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO00o(OutputStream outputStream) throws IOException {
        byte[] bArr = this.f16437OooO00o;
        if (bArr == null) {
            this.f16431OooO00o.OooO00o();
        } else {
            this.f16431OooO00o.OooO00o(bArr);
        }
        byte[] OooO00o2 = this.f16431OooO00o.m16981OooO00o();
        if (OooO00o2 != null) {
            byte[] OooO0O02 = this.f16431OooO00o.OooO0O0();
            this.OooO0O0 = OooO0O02;
            if (OooO0O02 != null) {
                L1LL1Ii.OooO00o(OooO00o2, outputStream);
                ((ILiliLL) this).f15654OooO00o.m17074OooO00o().OooO0o0 = C9586iIILl.m21630OooO00o(OooO00o2);
                int i = ((ILiliLL) this).OooO00o;
                if (i == 14) {
                    this.f16434OooO00o = C6053i1lii.OooO00o(((ILiliLL) this).f15654OooO00o.m17078OooO00o(), this.f16429OooO00o, outputStream);
                } else if (i == 24) {
                    this.f16435OooO00o = C5234IIllL.OooO00o(((ILiliLL) this).f15654OooO00o.m17078OooO00o(), this.f16440OooO0O0, this.OooO00o.OooO00o(), outputStream);
                } else if (i == 15) {
                    this.OooO0OO = C6063i1iIL.OooO00o(((ILiliLL) this).f15654OooO00o, this.f16436OooO00o, outputStream);
                }
            } else {
                throw new TlsFatalAlert(80);
            }
        } else {
            throw new TlsFatalAlert(80);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16199OooO00o() {
        int i = ((ILiliLL) this).OooO00o;
        return i == 14 || i == 24;
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16200OooO00o() throws IOException {
        byte[] OooO00o2 = OooO00o(this.OooO0O0.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(OooO00o2.length + 4 + this.OooO0O0.length);
        L1LL1Ii.OooO00o(OooO00o2, (OutputStream) byteArrayOutputStream);
        L1LL1Ii.OooO00o(this.OooO0O0, (OutputStream) byteArrayOutputStream);
        C9586iIILl.OooO00o(this.OooO0O0, (byte) 0);
        this.OooO0O0 = null;
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] OooO00o(int i) throws IOException {
        int i2 = ((ILiliLL) this).OooO00o;
        if (i2 == 14) {
            C6389ii r4 = this.f16434OooO00o;
            if (r4 != null) {
                return C6053i1lii.OooO00o(this.f16428OooO00o, r4);
            }
            throw new TlsFatalAlert(80);
        } else if (i2 != 24) {
            return i2 == 15 ? this.OooO0OO : new byte[i];
        } else {
            C6512lIilLl r42 = this.f16435OooO00o;
            if (r42 != null) {
                return C5234IIllL.OooO00o(this.OooO00o, r42);
            }
            throw new TlsFatalAlert(80);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO0O0(ll1iiLI ll1iili) throws IOException {
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO0O0(InputStream inputStream) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.m15931OooO00o(inputStream);
        byte[] OooO00o3 = this.f16430OooO00o.OooO00o(OooO00o2);
        this.OooO0O0 = OooO00o3;
        if (OooO00o3 != null) {
            ((ILiliLL) this).f15654OooO00o.m17074OooO00o().OooO0o0 = OooO00o2;
            int i = ((ILiliLL) this).OooO00o;
            if (i == 14) {
                this.f16428OooO00o = C6053i1lii.OooO00o(new LiIiLii(C6053i1lii.OooO00o(inputStream), this.f16429OooO00o));
            } else if (i == 24) {
                this.OooO00o = C5234IIllL.OooO00o(C5234IIllL.OooO00o(this.f16440OooO0O0, this.f16435OooO00o.OooO00o(), L1LL1Ii.m15946OooO0OO(inputStream)));
            } else if (i == 15) {
                this.OooO0OO = this.f16432OooO00o.OooO0O0(L1LL1Ii.OooO00o(((ILiliLL) this).f15654OooO00o) ? C6304ilIi1.m17339OooO00o(inputStream) : L1LL1Ii.m15931OooO00o(inputStream));
            }
        } else {
            throw new TlsFatalAlert(C6728ll11.OooOooO);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.ILiliLL
    public byte[] OooO0O0() throws IOException {
        byte[] OooO00o2 = this.f16430OooO00o.OooO00o();
        this.f16437OooO00o = OooO00o2;
        if (OooO00o2 == null && !m16199OooO00o()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = this.f16437OooO00o;
        if (bArr == null) {
            L1LL1Ii.OooO00o(L1LL1Ii.f16174OooO00o, (OutputStream) byteArrayOutputStream);
        } else {
            L1LL1Ii.OooO00o(bArr, (OutputStream) byteArrayOutputStream);
        }
        int i = ((ILiliLL) this).OooO00o;
        if (i == 14) {
            if (this.f16429OooO00o != null) {
                this.f16434OooO00o = C6053i1lii.OooO0O0(((ILiliLL) this).f15654OooO00o.m17078OooO00o(), this.f16429OooO00o, byteArrayOutputStream);
            } else {
                throw new TlsFatalAlert(80);
            }
        } else if (i == 24) {
            this.f16435OooO00o = C5234IIllL.OooO00o(((ILiliLL) this).f15654OooO00o.m17078OooO00o(), this.f16438OooO00o, this.f16439OooO00o, byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
