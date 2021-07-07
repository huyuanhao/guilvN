package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.ILL丨  reason: invalid class name and case insensitive filesystem */
public class C5303ILL implements i11ILLIi {
    public C5753LiI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6761llIl f15595OooO00o;

    public C5303ILL(C5753LiI1 r3) throws CMSException {
        this.OooO00o = r3;
        try {
            this.f15595OooO00o = C6761llIl.OooO00o(r3.m16341OooO0O0());
        } catch (ClassCastException e) {
            throw new CMSException("Malformed content.", e);
        } catch (IllegalArgumentException e2) {
            throw new CMSException("Malformed content.", e2);
        }
    }

    public C5303ILL(InputStream inputStream) throws CMSException {
        this(C5799LllI.OooO00o(inputStream));
    }

    public C5303ILL(byte[] bArr) throws CMSException {
        this(C5799LllI.OooO00o(bArr));
    }

    public C5753LiI1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m15502OooO00o() {
        return this.OooO00o.OooO00o();
    }

    public byte[] OooO00o(AbstractC9660l1il r3) throws CMSException {
        try {
            return C5799LllI.m16401OooO00o(r3.OooO00o(this.f15595OooO00o.m17866OooO00o()).OooO00o(((AbstractC6804llL1ii) this.f15595OooO00o.OooO00o().m16341OooO0O0()).m17937OooO00o()));
        } catch (IOException e) {
            throw new CMSException("exception reading compressed stream.", e);
        }
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        return this.OooO00o.getEncoded();
    }
}
