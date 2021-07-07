package com.p118pd.sdk;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.丨il丨II  reason: invalid class name and case insensitive filesystem */
public class C9640ilII extends Li1II {
    public L1l1I111 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23224OooO00o;
    public byte[] OooO0O0;

    public C9640ilII(II1liII r1, L1l1I111 l1l1I111, byte[] bArr, byte[] bArr2) {
        super(r1);
        this.OooO00o = l1l1I111;
        this.f23224OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.OooO0O0 = C9586iIILl.m21630OooO00o(bArr2);
    }

    public C9640ilII(II1liII r2, byte[] bArr, byte[] bArr2) {
        this(r2, new C6335illii(), bArr, bArr2);
    }

    public C9640ilII(byte[] bArr, byte[] bArr2) {
        this(new C6867lill1i(), new C6335illii(), bArr, bArr2);
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    public L1ILiLl OooO00o() throws IOException {
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC97431Llli m21698OooO00o() throws IOException {
        int OooO0OO = L1LL1Ii.OooO0OO(((Li1II) this).OooO00o);
        switch (OooO0OO) {
            case 21:
            case 22:
            case 23:
                return OooO00o(OooO0OO);
            default:
                throw new TlsFatalAlert(80);
        }
    }

    @Override // com.p118pd.sdk.Li1II, com.p118pd.sdk.AbstractC5653LL1lI
    public AbstractC97431Llli OooO00o(int i) {
        return new LiII11L(i, ((Li1II) this).f16551OooO00o, this.OooO00o, this.f23224OooO00o, this.OooO0O0);
    }

    @Override // com.p118pd.sdk.Li1II, com.p118pd.sdk.AbstractC5653LL1lI
    public void OooO00o(Hashtable hashtable) throws IOException {
        if (L1LL1Ii.OooO00o(hashtable, iILl11.OooO00o, (short) 47) || !OooO0OO()) {
            super.OooO00o(hashtable);
            return;
        }
        throw new TlsFatalAlert(47);
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m21699OooO00o() {
        return new int[]{49182};
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL
    public Hashtable OooO0O0() throws IOException {
        Hashtable OooO00o2 = C6115iIiL.m17002OooO00o(super.OooO0O0());
        iILl11.OooO00o(OooO00o2, this.f23224OooO00o);
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.Li1II, com.p118pd.sdk.AbstractC5653LL1lI
    public boolean OooO0OO() {
        return false;
    }
}
