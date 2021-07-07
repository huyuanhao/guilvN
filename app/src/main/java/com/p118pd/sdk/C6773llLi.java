package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Map;
import org.bouncycastle.est.HttpUtil;

/* renamed from: com.pd.sdk.llLi丨  reason: invalid class name and case insensitive filesystem */
public class C6773llLi {
    public final AbstractC5174I1Ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final iLIlLI f18787OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final iLL11Ll1 f18788OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f18789OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final URL f18790OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public HttpUtil.Headers f18791OooO00o = new HttpUtil.Headers();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f18792OooO00o;

    public C6773llLi(String str, URL url, byte[] bArr, AbstractC5174I1Ii i1Ii, iLIlLI r6, HttpUtil.Headers headers, iLL11Ll1 ill11ll1) {
        this.f18789OooO00o = str;
        this.f18790OooO00o = url;
        this.f18792OooO00o = bArr;
        this.OooO00o = i1Ii;
        this.f18787OooO00o = r6;
        this.f18791OooO00o = headers;
        this.f18788OooO00o = ill11ll1;
    }

    public AbstractC5174I1Ii OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iLIlLI m17890OooO00o() {
        return this.f18787OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iLL11Ll1 m17891OooO00o() {
        return this.f18788OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17892OooO00o() {
        return this.f18789OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public URL m17893OooO00o() {
        return this.f18790OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, String[]> m17894OooO00o() {
        return (Map) this.f18791OooO00o.clone();
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        byte[] bArr = this.f18792OooO00o;
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }
}
