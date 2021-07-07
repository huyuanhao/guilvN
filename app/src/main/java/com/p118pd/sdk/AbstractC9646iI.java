package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.丨i丨I丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9646iI implements AbstractC6333illiL {
    @Override // com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL, com.p118pd.sdk.AbstractC6333illiL
    public void OooO00o() throws IOException {
    }

    @Override // com.p118pd.sdk.AbstractC6333illiL
    public void OooO00o(short s, short s2) {
    }

    @Override // com.p118pd.sdk.AbstractC6333illiL
    public void OooO00o(short s, short s2, String str, Throwable th) {
    }

    @Override // com.p118pd.sdk.AbstractC6333illiL
    public void OooO0O0(boolean z) throws IOException {
        if (!z) {
            throw new TlsFatalAlert(40);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6333illiL
    public boolean OooO0O0() {
        return false;
    }
}
