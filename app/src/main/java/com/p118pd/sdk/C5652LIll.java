package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.LI丨丨l丨l  reason: invalid class name and case insensitive filesystem */
public class C5652LIll extends C6119iIl1il {
    public C5652LIll(OutputStream outputStream) {
        super(outputStream);
    }

    public void OooO00o(Object obj) throws IOException {
        AbstractC6122iIlLiL OooO0O0;
        if (obj == null) {
            OooO0OO();
            return;
        }
        if (obj instanceof AbstractC6122iIlLiL) {
            OooO0O0 = (AbstractC6122iIlLiL) obj;
        } else if (obj instanceof AbstractC6854lLi1LL) {
            OooO0O0 = ((AbstractC6854lLi1LL) obj).OooO0O0();
        } else {
            throw new IOException("object not BEREncodable");
        }
        OooO0O0.OooO00o(this);
    }
}
