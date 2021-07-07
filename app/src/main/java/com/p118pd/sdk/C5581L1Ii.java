package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.L1I丨i  reason: invalid class name and case insensitive filesystem */
public class C5581L1Ii extends ILiliLL {
    public iLiLiIi1 OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6213iL11I f16171OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public liLI1l1i f16172OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16173OooO00o;

    public C5581L1Ii(Vector vector) {
        super(1, vector);
    }

    public liLI1l1i OooO00o(liLI1l1i lili1l1i) throws IOException {
        if (lili1l1i.OooO00o().isProbablePrime(2)) {
            return lili1l1i;
        }
        throw new TlsFatalAlert(47);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o() throws IOException {
        throw new TlsFatalAlert(10);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
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
        if (ll1iili instanceof iLiLiIi1) {
            OooO00o(ll1iili.OooO00o());
            this.OooO00o = (iLiLiIi1) ll1iili;
            return;
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO00o(C6827lIIi1I1 r3) throws IOException {
        if (!r3.m17955OooO00o()) {
            LilIiIl OooO00o2 = r3.OooO00o(0);
            try {
                C6213iL11I OooO00o3 = IILLl.OooO00o(OooO00o2.m16321OooO00o());
                this.f16171OooO00o = OooO00o3;
                if (!OooO00o3.OooO00o()) {
                    this.f16172OooO00o = OooO00o((liLI1l1i) this.f16171OooO00o);
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

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO00o(OutputStream outputStream) throws IOException {
        this.f16173OooO00o = C6063i1iIL.OooO00o(((ILiliLL) this).f15654OooO00o, this.f16172OooO00o, outputStream);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15904OooO00o() throws IOException {
        byte[] bArr = this.f16173OooO00o;
        if (bArr != null) {
            this.f16173OooO00o = null;
            return bArr;
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO0O0(ll1iiLI ll1iili) throws IOException {
        if (!(ll1iili instanceof AbstractC5842L1)) {
            throw new TlsFatalAlert(80);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.ILiliLL
    public void OooO0O0(InputStream inputStream) throws IOException {
        this.f16173OooO00o = this.OooO00o.OooO0O0(L1LL1Ii.OooO00o(((ILiliLL) this).f15654OooO00o) ? C6304ilIi1.m17339OooO00o(inputStream) : L1LL1Ii.m15931OooO00o(inputStream));
    }
}
