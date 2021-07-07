package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Vector;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.LiII11L */
public class LiII11L extends ILiliLL {
    public L1Illl1i OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1l1I111 f16584OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5776LlIiLI f16585OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5842L1 f16586OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6057i1L f16587OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6213iL11I f16588OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public lLlLIlIi f16589OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f16590OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16591OooO00o;
    public BigInteger OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f16592OooO0O0;
    public byte[] OooO0OO;

    public LiII11L(int i, Vector vector, L1l1I111 l1l1I111, byte[] bArr, byte[] bArr2) {
        super(i, vector);
        this.f16588OooO00o = null;
        this.f16587OooO00o = null;
        this.f16589OooO00o = null;
        this.f16585OooO00o = null;
        this.f16590OooO00o = null;
        this.OooO0O0 = null;
        this.OooO0OO = null;
        this.f16586OooO00o = null;
        this.OooO00o = OooO00o(i);
        this.f16584OooO00o = l1l1I111;
        this.f16591OooO00o = bArr;
        this.f16592OooO0O0 = bArr2;
        this.f16589OooO00o = new lLlLIlIi();
    }

    public LiII11L(int i, Vector vector, byte[] bArr, C6142iIlI r4) {
        super(i, vector);
        this.f16588OooO00o = null;
        this.f16587OooO00o = null;
        this.f16589OooO00o = null;
        this.f16585OooO00o = null;
        this.f16590OooO00o = null;
        this.OooO0O0 = null;
        this.OooO0OO = null;
        this.f16586OooO00o = null;
        this.OooO00o = OooO00o(i);
        this.f16591OooO00o = bArr;
        this.f16585OooO00o = new C5776LlIiLI();
        this.f16587OooO00o = r4.OooO00o();
        this.OooO0O0 = r4.m17043OooO00o();
        this.OooO0OO = r4.m17044OooO00o();
    }

    public LiII11L(int i, Vector vector, byte[] bArr, byte[] bArr2) {
        this(i, vector, new C6335illii(), bArr, bArr2);
    }

    public static L1Illl1i OooO00o(int i) {
        switch (i) {
            case 21:
                return null;
            case 22:
                return new C5302ILI();
            case 23:
                return new C6191iLlLIl1();
            default:
                throw new IllegalArgumentException("unsupported key exchange algorithm");
        }
    }

    public AbstractC93171I1 OooO00o(L1Illl1i l1Illl1i, II1LLIl iI1LLIl, C6107iIiL iiil) {
        AbstractC93171I1 OooO0O02 = l1Illl1i.OooO0O0(iI1LLIl, this.f16588OooO00o);
        byte[] bArr = iiil.f17564OooO0O0;
        OooO0O02.update(bArr, 0, bArr.length);
        byte[] bArr2 = iiil.f17566OooO0OO;
        OooO0O02.update(bArr2, 0, bArr2.length);
        return OooO0O02;
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o() throws IOException {
        if (this.OooO00o != null) {
            throw new TlsFatalAlert(10);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o(iL1liI il1lii) {
        super.OooO00o(il1lii);
        L1Illl1i l1Illl1i = this.OooO00o;
        if (l1Illl1i != null) {
            l1Illl1i.OooO00o(il1lii);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO00o(lilLii1 r2) throws IOException {
        throw new TlsFatalAlert(10);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o(ll1iiLI ll1iili) throws IOException {
        if (((ILiliLL) this).OooO00o == 21 || !(ll1iili instanceof AbstractC5842L1)) {
            throw new TlsFatalAlert(80);
        }
        OooO00o(ll1iili.OooO00o());
        this.f16586OooO00o = (AbstractC5842L1) ll1iili;
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o(C6827lIIi1I1 r4) throws IOException {
        if (this.OooO00o == null) {
            throw new TlsFatalAlert(10);
        } else if (!r4.m17955OooO00o()) {
            LilIiIl OooO00o2 = r4.OooO00o(0);
            try {
                C6213iL11I OooO00o3 = IILLl.OooO00o(OooO00o2.m16321OooO00o());
                this.f16588OooO00o = OooO00o3;
                if (this.OooO00o.m15903OooO00o(OooO00o3)) {
                    L1LL1Ii.OooO00o(OooO00o2, 128);
                    super.OooO00o(r4);
                    return;
                }
                throw new TlsFatalAlert(46);
            } catch (RuntimeException e) {
                throw new TlsFatalAlert(43, e);
            }
        } else {
            throw new TlsFatalAlert(42);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.ILiliLL
    public void OooO00o(InputStream inputStream) throws IOException {
        InputStream inputStream2;
        i11i1Il1 i11i1il1;
        C6107iIiL OooO00o2 = ((ILiliLL) this).f15654OooO00o.m17074OooO00o();
        if (this.OooO00o != null) {
            i11i1il1 = new i11i1Il1();
            inputStream2 = new LllI11(inputStream, i11i1il1);
        } else {
            i11i1il1 = null;
            inputStream2 = inputStream;
        }
        C5425Il1 OooO00o3 = C5425Il1.OooO00o(inputStream2);
        if (i11i1il1 != null) {
            iLlLiLll OooO00o4 = OooO00o(inputStream);
            AbstractC93171I1 OooO00o5 = OooO00o(this.OooO00o, OooO00o4.OooO00o(), OooO00o2);
            i11i1il1.OooO00o(OooO00o5);
            if (!OooO00o5.OooO00o(OooO00o4.m17161OooO00o())) {
                throw new TlsFatalAlert(51);
            }
        }
        C6057i1L r6 = new C6057i1L(OooO00o3.OooO0OO(), OooO00o3.OooO0O0());
        this.f16587OooO00o = r6;
        if (this.f16584OooO00o.OooO00o(r6)) {
            this.OooO0OO = OooO00o3.m15658OooO00o();
            try {
                this.f16590OooO00o = LLII.OooO00o(this.f16587OooO00o.OooO0O0(), OooO00o3.OooO00o());
                this.f16589OooO00o.OooO00o(this.f16587OooO00o, L1LL1Ii.m15920OooO00o((short) 2), ((ILiliLL) this).f15654OooO00o.m17078OooO00o());
            } catch (CryptoException e) {
                throw new TlsFatalAlert(47, e);
            }
        } else {
            throw new TlsFatalAlert(71);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO00o(OutputStream outputStream) throws IOException {
        iILl11.OooO00o(this.f16589OooO00o.OooO00o(this.OooO0OO, this.f16591OooO00o, this.f16592OooO0O0), outputStream);
        ((ILiliLL) this).f15654OooO00o.m17074OooO00o().OooO0o = C9586iIILl.m21630OooO00o(this.f16591OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16300OooO00o() {
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16301OooO00o() throws IOException {
        try {
            return IIiL.OooO00o(this.f16585OooO00o != null ? this.f16585OooO00o.OooO00o(this.f16590OooO00o) : this.f16589OooO00o.OooO00o(this.f16590OooO00o));
        } catch (CryptoException e) {
            throw new TlsFatalAlert(47, e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO0O0(ll1iiLI ll1iili) throws IOException {
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO0O0(InputStream inputStream) throws IOException {
        try {
            this.f16590OooO00o = LLII.OooO00o(this.f16587OooO00o.OooO0O0(), iILl11.OooO00o(inputStream));
            ((ILiliLL) this).f15654OooO00o.m17074OooO00o().OooO0o = C9586iIILl.m21630OooO00o(this.f16591OooO00o);
        } catch (CryptoException e) {
            throw new TlsFatalAlert(47, e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.ILiliLL
    public byte[] OooO0O0() throws IOException {
        this.f16585OooO00o.OooO00o(this.f16587OooO00o, this.OooO0O0, L1LL1Ii.m15920OooO00o((short) 2), ((ILiliLL) this).f15654OooO00o.m17078OooO00o());
        C5425Il1 r1 = new C5425Il1(this.f16587OooO00o.OooO0O0(), this.f16587OooO00o.OooO00o(), this.OooO0OO, this.f16585OooO00o.OooO0OO());
        C9812LL1I r0 = new C9812LL1I();
        r1.OooO00o(r0);
        AbstractC5842L1 r12 = this.f16586OooO00o;
        if (r12 != null) {
            II1LLIl OooO00o2 = L1LL1Ii.OooO00o(((ILiliLL) this).f15654OooO00o, r12);
            AbstractC6436l11LI OooO00o3 = L1LL1Ii.OooO00o(OooO00o2);
            C6107iIiL OooO00o4 = ((ILiliLL) this).f15654OooO00o.m17074OooO00o();
            byte[] bArr = OooO00o4.f17564OooO0O0;
            OooO00o3.update(bArr, 0, bArr.length);
            byte[] bArr2 = OooO00o4.f17566OooO0OO;
            OooO00o3.update(bArr2, 0, bArr2.length);
            r0.OooO00o(OooO00o3);
            byte[] bArr3 = new byte[OooO00o3.OooO0O0()];
            OooO00o3.OooO00o(bArr3, 0);
            new iLlLiLll(OooO00o2, this.f16586OooO00o.OooO00o(bArr3)).OooO00o(r0);
        }
        return r0.toByteArray();
    }
}
