package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.IL丨iliLL  reason: invalid class name */
public abstract class ILiliLL implements AbstractC97431Llli {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iL1liI f15654OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f15655OooO00o;

    public ILiliLL(int i, Vector vector) {
        this.OooO00o = i;
        this.f15655OooO00o = vector;
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public iLlLiLll OooO00o(InputStream inputStream) throws IOException {
        iLlLiLll OooO00o2 = iLlLiLll.OooO00o(this.f15654OooO00o, inputStream);
        II1LLIl OooO00o3 = OooO00o2.OooO00o();
        if (OooO00o3 != null) {
            L1LL1Ii.OooO00o(this.f15655OooO00o, OooO00o3);
        }
        return OooO00o2;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO00o(iL1liI il1lii) {
        Vector vector;
        this.f15654OooO00o = il1lii;
        i1iiIl OooO00o2 = il1lii.OooO00o();
        if (L1LL1Ii.OooO00o(OooO00o2)) {
            if (this.f15655OooO00o == null) {
                int i = this.OooO00o;
                if (i != 1) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 7) {
                                if (i != 9) {
                                    switch (i) {
                                        case 13:
                                        case 14:
                                            return;
                                        case 15:
                                        case 18:
                                        case 19:
                                            break;
                                        case 16:
                                        case 17:
                                            vector = L1LL1Ii.OooO0OO();
                                            break;
                                        default:
                                            switch (i) {
                                                case 21:
                                                case 24:
                                                    return;
                                                case 22:
                                                    break;
                                                case 23:
                                                    break;
                                                default:
                                                    throw new IllegalStateException("unsupported key exchange algorithm");
                                            }
                                    }
                                    this.f15655OooO00o = vector;
                                }
                            }
                        }
                    }
                    vector = L1LL1Ii.OooO0O0();
                    this.f15655OooO00o = vector;
                }
                vector = L1LL1Ii.OooO0Oo();
                this.f15655OooO00o = vector;
            }
        } else if (this.f15655OooO00o != null) {
            throw new IllegalStateException("supported_signature_algorithms not allowed for " + OooO00o2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO00o(ll1iiLI ll1iili) throws IOException {
        OooO00o(ll1iili.OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO00o(C6827lIIi1I1 r1) throws IOException {
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15540OooO00o(InputStream inputStream) throws IOException {
        if (!OooO00o()) {
            throw new TlsFatalAlert(10);
        }
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli
    public boolean OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli
    public void OooO0O0() throws IOException {
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO0O0(C6827lIIi1I1 r1) throws IOException {
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO0O0(InputStream inputStream) throws IOException {
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli, com.p118pd.sdk.AbstractC97431Llli
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m15541OooO0O0() throws IOException {
        if (!OooO00o()) {
            return null;
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC97431Llli
    public void OooO0OO() throws IOException {
        if (OooO00o()) {
            throw new TlsFatalAlert(10);
        }
    }
}
