package com.p118pd.sdk;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.l1lIl  reason: case insensitive filesystem */
public class C6459l1lIl extends IIlLl1i {
    public C6142iIlI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6806llL f18302OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18303OooO00o;

    public C6459l1lIl(II1liII r1, AbstractC6806llL r2) {
        super(r1);
        this.f18303OooO00o = null;
        this.OooO00o = null;
        this.f18302OooO00o = r2;
    }

    public C6459l1lIl(AbstractC6806llL r2) {
        this(new C6867lill1i(), r2);
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i
    public int OooO00o() throws IOException {
        int OooO00o2 = super.OooO00o();
        if (iILl11.OooO00o(OooO00o2)) {
            byte[] bArr = this.f18303OooO00o;
            if (bArr != null) {
                this.OooO00o = this.f18302OooO00o.OooO00o(bArr);
            }
            if (this.OooO00o == null) {
                throw new TlsFatalAlert(C6728ll11.OooOooO);
            }
        }
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC5842L1 m17590OooO00o() throws IOException {
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ll1iiLI m17591OooO00o() throws IOException {
        switch (L1LL1Ii.OooO0OO(((IIlLl1i) this).OooO00o)) {
            case 21:
                return null;
            case 22:
                return m17590OooO00o();
            case 23:
                return OooO0O0();
            default:
                throw new TlsFatalAlert(80);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC97431Llli m17592OooO00o() throws IOException {
        int OooO0OO = L1LL1Ii.OooO0OO(((IIlLl1i) this).OooO00o);
        switch (OooO0OO) {
            case 21:
            case 22:
            case 23:
                return OooO00o(OooO0OO);
            default:
                throw new TlsFatalAlert(80);
        }
    }

    public AbstractC97431Llli OooO00o(int i) {
        return new LiII11L(i, ((IIlLl1i) this).f15994OooO00o, this.f18303OooO00o, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i, com.p118pd.sdk.IIlLl1i
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m17593OooO00o() {
        return new int[]{Lillilli.o000O000, Lillilli.o0000oo0, Lillilli.o000, Lillilli.o0000oOo, Lillilli.o0000ooO, Lillilli.o0000oOO};
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.LIiillil, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.IIlLl1i
    public AbstractC5842L1 OooO0O0() throws IOException {
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.LIiillil, com.p118pd.sdk.IIlLl1i
    public void OooO0O0(Hashtable hashtable) throws IOException {
        super.OooO0O0(hashtable);
        this.f18303OooO00o = iILl11.OooO00o(hashtable);
    }
}
