package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.Liil1L1l */
public class Liil1L1l extends AbstractC1673I1 {
    public final ByteArrayOutputStream OooO00o = new ByteArrayOutputStream();

    public Liil1L1l(OutputStream outputStream) throws IOException {
        super(outputStream);
    }

    public Liil1L1l(OutputStream outputStream, int i, boolean z) throws IOException {
        super(outputStream, i, z);
    }

    @Override // com.p118pd.sdk.ILL
    public OutputStream OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.ILL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16314OooO00o() throws IOException {
        OooO00o(48, this.OooO00o.toByteArray());
    }

    public void OooO00o(AbstractC6854lLi1LL r3) throws IOException {
        r3.OooO0O0().OooO00o(new C6119iIl1il(this.OooO00o));
    }
}
