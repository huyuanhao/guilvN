package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.丨LlilI  reason: invalid class name and case insensitive filesystem */
public class C9535LlilI extends C9342I1lIll {
    public AbstractC5842L1 OooO00o = null;

    public C9535LlilI(int i, Vector vector, int[] iArr, short[] sArr, short[] sArr2) {
        super(i, vector, iArr, sArr, sArr2);
    }

    public AbstractC93171I1 OooO00o(L1Illl1i l1Illl1i, II1LLIl iI1LLIl, C6107iIiL iiil) {
        AbstractC93171I1 OooO0O0 = l1Illl1i.OooO0O0(iI1LLIl, ((C9342I1lIll) this).f22871OooO00o);
        byte[] bArr = iiil.f17564OooO0O0;
        OooO0O0.update(bArr, 0, bArr.length);
        byte[] bArr2 = iiil.f17566OooO0OO;
        OooO0O0.update(bArr2, 0, bArr2.length);
        return OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.C9342I1lIll
    public void OooO00o(lilLii1 r4) throws IOException {
        short[] OooO00o2 = r4.m17791OooO00o();
        for (short s : OooO00o2) {
            if (s != 1 && s != 2 && s != 64) {
                throw new TlsFatalAlert(47);
            }
        }
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

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.C9342I1lIll
    public void OooO00o(InputStream inputStream) throws IOException {
        C6107iIiL OooO00o2 = ((ILiliLL) this).f15654OooO00o.m17074OooO00o();
        i11i1Il1 i11i1il1 = new i11i1Il1();
        LllI11 lllI11 = new LllI11(inputStream, i11i1il1);
        C5600L1iLL OooO00o3 = C5234IIllL.OooO00o(((C9342I1lIll) this).f22873OooO00o, ((C9342I1lIll) this).f22874OooO00o, lllI11);
        byte[] OooO0OO = L1LL1Ii.m15946OooO0OO((InputStream) lllI11);
        iLlLiLll OooO00o4 = OooO00o(inputStream);
        AbstractC93171I1 OooO00o5 = OooO00o(((C9342I1lIll) this).f22869OooO00o, OooO00o4.OooO00o(), OooO00o2);
        i11i1il1.OooO00o(OooO00o5);
        if (OooO00o5.OooO00o(OooO00o4.m17161OooO00o())) {
            ((C9342I1lIll) this).f22870OooO00o = C5234IIllL.OooO00o(C5234IIllL.OooO00o(((C9342I1lIll) this).f22874OooO00o, OooO00o3, OooO0OO));
            return;
        }
        throw new TlsFatalAlert(51);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.C9342I1lIll
    public void OooO0O0(ll1iiLI ll1iili) throws IOException {
        if (!(ll1iili instanceof AbstractC5842L1)) {
            throw new TlsFatalAlert(80);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.ILiliLL, com.p118pd.sdk.C9342I1lIll
    public byte[] OooO0O0() throws IOException {
        C9812LL1I r0 = new C9812LL1I();
        ((C9342I1lIll) this).f22872OooO00o = C5234IIllL.OooO00o(((ILiliLL) this).f15654OooO00o.m17078OooO00o(), ((C9342I1lIll) this).f22873OooO00o, ((C9342I1lIll) this).f22874OooO00o, r0);
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
}
