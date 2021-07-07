package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.iIl1il丨  reason: invalid class name and case insensitive filesystem */
public class C6119iIl1il extends C6103iIi1 {
    public C6119iIl1il(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.p118pd.sdk.C6103iIi1, com.p118pd.sdk.C6103iIi1
    public C6103iIi1 OooO00o() {
        return this;
    }

    @Override // com.p118pd.sdk.C6103iIi1
    public void OooO00o(AbstractC6854lLi1LL r2) throws IOException {
        if (r2 != null) {
            r2.OooO0O0().OooO0Oo().OooO00o(this);
            return;
        }
        throw new IOException("null object detected");
    }

    @Override // com.p118pd.sdk.C6103iIi1, com.p118pd.sdk.C6103iIi1
    public C6103iIi1 OooO0O0() {
        return this;
    }
}
