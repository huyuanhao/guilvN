package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.lL丨1i  reason: invalid class name and case insensitive filesystem */
public class C6627lL1i extends C6196iLl {
    public AbstractC5842L1 OooO00o = null;

    public C6627lL1i(int i, Vector vector, C6017i1Il i1il) {
        super(i, vector, i1il);
    }

    public AbstractC93171I1 OooO00o(L1Illl1i l1Illl1i, II1LLIl iI1LLIl, C6107iIiL iiil) {
        AbstractC93171I1 OooO0O0 = l1Illl1i.OooO0O0(iI1LLIl, ((C6196iLl) this).f17798OooO00o);
        byte[] bArr = iiil.f17564OooO0O0;
        OooO0O0.update(bArr, 0, bArr.length);
        byte[] bArr2 = iiil.f17566OooO0OO;
        OooO0O0.update(bArr2, 0, bArr2.length);
        return OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o(ll1iiLI ll1iili) throws IOException {
        if (ll1iili instanceof AbstractC5842L1) {
            OooO00o(ll1iili.OooO00o());
            this.OooO00o = (AbstractC5842L1) ll1iili;
            return;
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.C6196iLl
    public void OooO00o(InputStream inputStream) throws IOException {
        C6107iIiL OooO00o2 = ((ILiliLL) this).f15654OooO00o.m17074OooO00o();
        i11i1Il1 i11i1il1 = new i11i1Il1();
        C6343il11l OooO00o3 = C6343il11l.OooO00o(new LllI11(inputStream, i11i1il1));
        iLlLiLll OooO00o4 = OooO00o(inputStream);
        AbstractC93171I1 OooO00o5 = OooO00o(((C6196iLl) this).f17795OooO00o, OooO00o4.OooO00o(), OooO00o2);
        i11i1il1.OooO00o(OooO00o5);
        if (OooO00o5.OooO00o(OooO00o4.m17161OooO00o())) {
            LiIiLii OooO00o6 = C6053i1lii.OooO00o(OooO00o3.OooO00o());
            ((C6196iLl) this).f17796OooO00o = OooO00o6;
            ((C6196iLl) this).f17797OooO00o = OooO00o(OooO00o6.OooO00o());
            return;
        }
        throw new TlsFatalAlert(51);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.C6196iLl
    public byte[] OooO0O0() throws IOException {
        if (((C6196iLl) this).f17797OooO00o != null) {
            C9812LL1I r0 = new C9812LL1I();
            ((C6196iLl) this).f17799OooO00o = C6053i1lii.OooO0O0(((ILiliLL) this).f15654OooO00o.m17078OooO00o(), ((C6196iLl) this).f17797OooO00o, r0);
            II1LLIl OooO00o2 = L1LL1Ii.OooO00o(((ILiliLL) this).f15654OooO00o, this.OooO00o);
            AbstractC6436l11LI OooO00o3 = L1LL1Ii.OooO00o(OooO00o2);
            C6107iIiL OooO00o4 = ((ILiliLL) this).f15654OooO00o.m17074OooO00o();
            byte[] bArr = OooO00o4.f17564OooO0O0;
            OooO00o3.update(bArr, 0, bArr.length);
            byte[] bArr2 = OooO00o4.f17566OooO0OO;
            OooO00o3.update(bArr2, 0, bArr2.length);
            r0.OooO00o(OooO00o3);
            byte[] bArr3 = new byte[OooO00o3.OooO0O0()];
            OooO00o3.OooO00o(bArr3, 0);
            new iLlLiLll(OooO00o2, this.OooO00o.OooO00o(bArr3)).OooO00o(r0);
            return r0.toByteArray();
        }
        throw new TlsFatalAlert(80);
    }
}
