package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.Ii丨Ll丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5397IiLl extends Li1II {
    public AbstractC5397IiLl() {
    }

    public AbstractC5397IiLl(II1liII r1) {
        super(r1);
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    public AbstractC97431Llli OooO00o() throws IOException {
        int OooO0OO = L1LL1Ii.OooO0OO(((Li1II) this).OooO00o);
        if (OooO0OO == 1) {
            return OooO0O0();
        }
        if (OooO0OO == 3 || OooO0OO == 5) {
            return OooO00o(OooO0OO);
        }
        if (OooO0OO == 7 || OooO0OO == 9 || OooO0OO == 11) {
            return OooO0O0(OooO0OO);
        }
        switch (OooO0OO) {
            case 16:
            case 18:
            case 20:
                return OooO0Oo(OooO0OO);
            case 17:
            case 19:
                return OooO0OO(OooO0OO);
            default:
                throw new TlsFatalAlert(80);
        }
    }

    @Override // com.p118pd.sdk.Li1II, com.p118pd.sdk.AbstractC5653LL1lI
    public AbstractC97431Llli OooO00o(int i) {
        return new C6627lL1i(i, ((Li1II) this).f16551OooO00o, null);
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m15636OooO00o() {
        return new int[]{Lillilli.o000o00o, Lillilli.o000OoOO, Lillilli.o0000Ooo, Lillilli.o000o0OO, Lillilli.o000Oooo, Lillilli.o0000O, 162, 64, 50, 158, 103, 51, 156, 60, 47};
    }

    @Override // com.p118pd.sdk.AbstractC9646iI, com.p118pd.sdk.Li1II, com.p118pd.sdk.Li1II, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC5653LL1lI, com.p118pd.sdk.AbstractC6333illiL
    public AbstractC97431Llli OooO0O0() {
        return new C5581L1Ii(((Li1II) this).f16551OooO00o);
    }

    public AbstractC97431Llli OooO0O0(int i) {
        return new C6196iLl(i, ((Li1II) this).f16551OooO00o, null);
    }

    public AbstractC97431Llli OooO0OO(int i) {
        return new C9535LlilI(i, ((Li1II) this).f16551OooO00o, ((Li1II) this).f16553OooO00o, ((Li1II) this).f16554OooO00o, this.OooO0O0);
    }

    public AbstractC97431Llli OooO0Oo(int i) {
        return new C9342I1lIll(i, ((Li1II) this).f16551OooO00o, ((Li1II) this).f16553OooO00o, ((Li1II) this).f16554OooO00o, this.OooO0O0);
    }
}
