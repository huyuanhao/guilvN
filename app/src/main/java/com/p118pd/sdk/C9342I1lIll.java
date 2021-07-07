package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.丨I1lIll  reason: invalid class name and case insensitive filesystem */
public class C9342I1lIll extends ILiliLL {
    public I1ILILI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1Illl1i f22869OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LL1ii1l f22870OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6213iL11I f22871OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6512lIilLl f22872OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f22873OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[] f22874OooO00o;
    public short[] OooO0O0;

    public C9342I1lIll(int i, Vector vector, int[] iArr, short[] sArr, short[] sArr2) {
        super(i, vector);
        L1Illl1i l1Illl1i;
        switch (i) {
            case 16:
            case 18:
            case 20:
                l1Illl1i = null;
                break;
            case 17:
                l1Illl1i = new C6341il1();
                break;
            case 19:
                l1Illl1i = new C6191iLlLIl1();
                break;
            default:
                throw new IllegalArgumentException("unsupported key exchange algorithm");
        }
        this.f22869OooO00o = l1Illl1i;
        this.f22873OooO00o = iArr;
        this.f22874OooO00o = sArr;
        this.OooO0O0 = sArr2;
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o() throws IOException {
        if (((ILiliLL) this).OooO00o != 20) {
            throw new TlsFatalAlert(10);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o(iL1liI il1lii) {
        super.OooO00o(il1lii);
        L1Illl1i l1Illl1i = this.f22869OooO00o;
        if (l1Illl1i != null) {
            l1Illl1i.OooO00o(il1lii);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO00o(lilLii1 r4) throws IOException {
        if (((ILiliLL) this).OooO00o != 20) {
            short[] OooO00o2 = r4.m17791OooO00o();
            for (short s : OooO00o2) {
                if (!(s == 1 || s == 2)) {
                    switch (s) {
                        default:
                            throw new TlsFatalAlert(47);
                        case 64:
                        case 65:
                        case 66:
                            break;
                    }
                }
            }
            return;
        }
        throw new TlsFatalAlert(40);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o(C6827lIIi1I1 r5) throws IOException {
        int i;
        if (((ILiliLL) this).OooO00o == 20) {
            throw new TlsFatalAlert(10);
        } else if (!r5.m17955OooO00o()) {
            LilIiIl OooO00o2 = r5.OooO00o(0);
            try {
                C6213iL11I OooO00o3 = IILLl.OooO00o(OooO00o2.m16321OooO00o());
                this.f22871OooO00o = OooO00o3;
                L1Illl1i l1Illl1i = this.f22869OooO00o;
                if (l1Illl1i == null) {
                    try {
                        this.f22870OooO00o = C5234IIllL.OooO00o((LL1ii1l) OooO00o3);
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
        if (m21387OooO00o()) {
            this.f22870OooO00o = C5234IIllL.OooO00o(C5234IIllL.OooO00o(this.f22874OooO00o, C5234IIllL.OooO00o(this.f22873OooO00o, this.f22874OooO00o, inputStream), L1LL1Ii.m15946OooO0OO(inputStream)));
            return;
        }
        throw new TlsFatalAlert(10);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO00o(OutputStream outputStream) throws IOException {
        if (this.OooO00o == null) {
            this.f22872OooO00o = C5234IIllL.OooO00o(((ILiliLL) this).f15654OooO00o.m17078OooO00o(), this.OooO0O0, this.f22870OooO00o.OooO00o(), outputStream);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21387OooO00o() {
        int i = ((ILiliLL) this).OooO00o;
        return i == 17 || i == 19 || i == 20;
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21388OooO00o() throws IOException {
        I1ILILI i1ilili = this.OooO00o;
        if (i1ilili != null) {
            return i1ilili.OooO00o(this.f22870OooO00o);
        }
        C6512lIilLl r0 = this.f22872OooO00o;
        if (r0 != null) {
            return C5234IIllL.OooO00o(this.f22870OooO00o, r0);
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO0O0(ll1iiLI ll1iili) throws IOException {
        if (((ILiliLL) this).OooO00o == 20) {
            throw new TlsFatalAlert(80);
        } else if (ll1iili instanceof I1ILILI) {
            this.OooO00o = (I1ILILI) ll1iili;
        } else if (!(ll1iili instanceof AbstractC5842L1)) {
            throw new TlsFatalAlert(80);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO0O0(C6827lIIi1I1 r2) throws IOException {
        if (((ILiliLL) this).OooO00o == 20) {
            throw new TlsFatalAlert(10);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO0O0(InputStream inputStream) throws IOException {
        if (this.f22870OooO00o == null) {
            byte[] OooO0OO = L1LL1Ii.m15946OooO0OO(inputStream);
            this.f22870OooO00o = C5234IIllL.OooO00o(C5234IIllL.OooO00o(this.OooO0O0, this.f22872OooO00o.OooO00o(), OooO0OO));
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.ILiliLL
    public byte[] OooO0O0() throws IOException {
        if (!m21387OooO00o()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f22872OooO00o = C5234IIllL.OooO00o(((ILiliLL) this).f15654OooO00o.m17078OooO00o(), this.f22873OooO00o, this.f22874OooO00o, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
