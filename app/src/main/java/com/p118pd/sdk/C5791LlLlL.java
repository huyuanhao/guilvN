package com.p118pd.sdk;

import java.io.OutputStream;
import org.bouncycastle.dvcs.DVCSException;

/* renamed from: com.pd.sdk.LlLlL  reason: case insensitive filesystem */
public class C5791LlLlL {
    public final I111LIL OooO00o;

    public C5791LlLlL(I111LIL r1) {
        this.OooO00o = r1;
    }

    public C9536Lll OooO00o(byte[] bArr) throws DVCSException {
        try {
            OutputStream OooO00o2 = this.OooO00o.m21370OooO00o();
            OooO00o2.write(bArr);
            OooO00o2.close();
            return new C9536Lll(new C6052i1l(this.OooO00o.OooO00o(), this.OooO00o.m21371OooO00o()));
        } catch (Exception e) {
            throw new DVCSException("unable to build MessageImprint: " + e.getMessage(), e);
        }
    }
}
