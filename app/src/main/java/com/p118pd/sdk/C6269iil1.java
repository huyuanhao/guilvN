package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.iil1丨  reason: invalid class name and case insensitive filesystem */
public class C6269iil1 extends C6103iIi1 {
    public C6269iil1(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.p118pd.sdk.C6103iIi1
    public void OooO00o(AbstractC6854lLi1LL r2) throws IOException {
        if (r2 != null) {
            r2.OooO0O0().OooO0o0().OooO00o(this);
            return;
        }
        throw new IOException("null object detected");
    }
}
