package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.iLl丨  reason: invalid class name and case insensitive filesystem */
public class C6196iLl extends ILiliLL {
    public I1ILILI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1Illl1i f17795OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LiIiLii f17796OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6017i1Il f17797OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6213iL11I f17798OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6389ii f17799OooO00o;

    public C6196iLl(int i, Vector vector, C6017i1Il i1il) {
        super(i, vector);
        L1Illl1i l1Illl1i;
        if (i == 3) {
            l1Illl1i = new C5302ILI();
        } else if (i == 5) {
            l1Illl1i = new C6191iLlLIl1();
        } else if (i == 7 || i == 9 || i == 11) {
            l1Illl1i = null;
        } else {
            throw new IllegalArgumentException("unsupported key exchange algorithm");
        }
        this.f17795OooO00o = l1Illl1i;
        this.f17797OooO00o = i1il;
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public int OooO00o() {
        return 1024;
    }

    public C6017i1Il OooO00o(C6017i1Il i1il) throws IOException {
        if (i1il.OooO0OO().bitLength() >= OooO00o()) {
            return C6053i1lii.OooO00o(i1il);
        }
        throw new TlsFatalAlert(71);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17168OooO00o() throws IOException {
        if (((ILiliLL) this).OooO00o != 11) {
            throw new TlsFatalAlert(10);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o(iL1liI il1lii) {
        super.OooO00o(il1lii);
        L1Illl1i l1Illl1i = this.f17795OooO00o;
        if (l1Illl1i != null) {
            l1Illl1i.OooO00o(il1lii);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO00o(lilLii1 r4) throws IOException {
        if (((ILiliLL) this).OooO00o != 11) {
            short[] OooO00o2 = r4.m17791OooO00o();
            for (short s : OooO00o2) {
                if (s != 1 && s != 2 && s != 3 && s != 4 && s != 64) {
                    throw new TlsFatalAlert(47);
                }
            }
            return;
        }
        throw new TlsFatalAlert(40);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o(C6827lIIi1I1 r5) throws IOException {
        int i;
        if (((ILiliLL) this).OooO00o == 11) {
            throw new TlsFatalAlert(10);
        } else if (!r5.m17955OooO00o()) {
            LilIiIl OooO00o2 = r5.OooO00o(0);
            try {
                C6213iL11I OooO00o3 = IILLl.OooO00o(OooO00o2.m16321OooO00o());
                this.f17798OooO00o = OooO00o3;
                L1Illl1i l1Illl1i = this.f17795OooO00o;
                if (l1Illl1i == null) {
                    try {
                        LiIiLii OooO00o4 = C6053i1lii.OooO00o((LiIiLii) OooO00o3);
                        this.f17796OooO00o = OooO00o4;
                        this.f17797OooO00o = OooO00o(OooO00o4.OooO00o());
                        i = 8;
                    } catch (ClassCastException e) {
                        throw new TlsFatalAlert(46, e);
                    }
                } else if (l1Illl1i.m15903OooO00o(OooO00o3)) {
                    i = 128;
                } else {
                    throw new TlsFatalAlert(46);
                }
                L1LL1Ii.OooO00o(OooO00o2, i);
                super.OooO00o(r5);
            } catch (RuntimeException e2) {
                throw new TlsFatalAlert(43, e2);
            }
        } else {
            throw new TlsFatalAlert(42);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.ILiliLL
    public void OooO00o(InputStream inputStream) throws IOException {
        if (m17169OooO00o()) {
            LiIiLii OooO00o2 = C6053i1lii.OooO00o(C6343il11l.OooO00o(inputStream).OooO00o());
            this.f17796OooO00o = OooO00o2;
            this.f17797OooO00o = OooO00o(OooO00o2.OooO00o());
            return;
        }
        throw new TlsFatalAlert(10);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO00o(OutputStream outputStream) throws IOException {
        if (this.OooO00o == null) {
            this.f17799OooO00o = C6053i1lii.OooO00o(((ILiliLL) this).f15654OooO00o.m17078OooO00o(), this.f17797OooO00o, outputStream);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17169OooO00o() {
        int i = ((ILiliLL) this).OooO00o;
        return i == 3 || i == 5 || i == 11;
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17170OooO00o() throws IOException {
        I1ILILI i1ilili = this.OooO00o;
        if (i1ilili != null) {
            return i1ilili.OooO00o(this.f17796OooO00o);
        }
        C6389ii r0 = this.f17799OooO00o;
        if (r0 != null) {
            return C6053i1lii.OooO00o(this.f17796OooO00o, r0);
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO0O0(ll1iiLI ll1iili) throws IOException {
        if (((ILiliLL) this).OooO00o == 11) {
            throw new TlsFatalAlert(80);
        } else if (ll1iili instanceof I1ILILI) {
            this.OooO00o = (I1ILILI) ll1iili;
        } else if (!(ll1iili instanceof AbstractC5842L1)) {
            throw new TlsFatalAlert(80);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO0O0(C6827lIIi1I1 r2) throws IOException {
        if (((ILiliLL) this).OooO00o == 11) {
            throw new TlsFatalAlert(10);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO0O0(InputStream inputStream) throws IOException {
        if (this.f17796OooO00o == null) {
            this.f17796OooO00o = C6053i1lii.OooO00o(new LiIiLii(C6053i1lii.OooO00o(inputStream), this.f17797OooO00o));
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.ILiliLL
    public byte[] OooO0O0() throws IOException {
        if (!m17169OooO00o()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f17799OooO00o = C6053i1lii.OooO0O0(((ILiliLL) this).f15654OooO00o.m17078OooO00o(), this.f17797OooO00o, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
