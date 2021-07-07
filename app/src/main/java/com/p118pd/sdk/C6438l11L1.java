package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.l11丨L1  reason: invalid class name and case insensitive filesystem */
public class C6438l11L1 implements AbstractC5563Il, AbstractC5361Iii {
    public final LlLI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f18249OooO00o;

    public C6438l11L1(LlLI1 llLI1, byte[] bArr) {
        this.OooO00o = llLI1;
        this.f18249OooO00o = bArr;
    }

    public C6438l11L1(byte[] bArr) {
        this(new LlLI1(AbstractC6252iiLl.OooO00o.m16387OooO0O0()), bArr);
    }

    @Override // com.p118pd.sdk.AbstractC5361Iii, com.p118pd.sdk.AbstractC5563Il, com.p118pd.sdk.AbstractC5808Ll1I
    public LlLI1 OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5361Iii, com.p118pd.sdk.AbstractC5563Il, com.p118pd.sdk.AbstractC5808Ll1I
    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m17555OooO00o() {
        return new ByteArrayInputStream(this.f18249OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5361Iii, com.p118pd.sdk.AbstractC5563Il, com.p118pd.sdk.AbstractC5808Ll1I
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m17556OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f18249OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5808Ll1I
    public void write(OutputStream outputStream) throws IOException, CMSException {
        outputStream.write(this.f18249OooO00o);
    }
}
