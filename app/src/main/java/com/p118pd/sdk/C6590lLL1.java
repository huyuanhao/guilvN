package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.lLL丨1丨  reason: invalid class name and case insensitive filesystem */
public class C6590lLL1 implements AbstractC5563Il, AbstractC5361Iii {
    public final LlLI1 OooO00o;

    public C6590lLL1() {
        this(AbstractC6252iiLl.OooO00o);
    }

    public C6590lLL1(LlLI1 llLI1) {
        this.OooO00o = llLI1;
    }

    @Override // com.p118pd.sdk.AbstractC5361Iii, com.p118pd.sdk.AbstractC5563Il, com.p118pd.sdk.AbstractC5808Ll1I
    public LlLI1 OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5361Iii, com.p118pd.sdk.AbstractC5563Il, com.p118pd.sdk.AbstractC5808Ll1I
    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m17687OooO00o() {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5361Iii, com.p118pd.sdk.AbstractC5563Il, com.p118pd.sdk.AbstractC5808Ll1I
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m17688OooO00o() {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5808Ll1I
    public void write(OutputStream outputStream) throws IOException, CMSException {
    }
}
