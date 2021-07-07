package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.L11LI */
public class L11LI implements AbstractC5808Ll1I, AbstractC5361Iii {
    public InputStream OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16120OooO00o = false;

    public L11LI(InputStream inputStream) {
        this.OooO00o = inputStream;
    }

    @Override // com.p118pd.sdk.AbstractC5361Iii, com.p118pd.sdk.AbstractC5808Ll1I
    private synchronized void OooO00o() {
        if (!this.f16120OooO00o) {
            this.f16120OooO00o = true;
        } else {
            throw new IllegalStateException("CMSProcessableInputStream can only be used once");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5361Iii, com.p118pd.sdk.AbstractC5808Ll1I
    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m15878OooO00o() {
        OooO00o();
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5361Iii, com.p118pd.sdk.AbstractC5808Ll1I
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m15879OooO00o() {
        return m15878OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5808Ll1I
    public void write(OutputStream outputStream) throws IOException, CMSException {
        OooO00o();
        C6304ilIi1.OooO00o(this.OooO00o, outputStream);
        this.OooO00o.close();
    }
}
