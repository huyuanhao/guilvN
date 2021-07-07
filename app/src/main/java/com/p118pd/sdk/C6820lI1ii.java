package com.p118pd.sdk;

import java.net.URL;
import org.bouncycastle.est.HttpUtil;

/* renamed from: com.pd.sdk.l丨I1ii  reason: invalid class name and case insensitive filesystem */
public class C6820lI1ii {
    public AbstractC5174I1Ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iLIlLI f18870OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iLL11Ll1 f18871OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f18872OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public URL f18873OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public HttpUtil.Headers f18874OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18875OooO00o;

    public C6820lI1ii(C6773llLi r2) {
        this.f18872OooO00o = r2.f18789OooO00o;
        this.f18873OooO00o = r2.f18790OooO00o;
        this.f18870OooO00o = r2.f18787OooO00o;
        this.f18875OooO00o = r2.f18792OooO00o;
        this.OooO00o = r2.OooO00o;
        this.f18874OooO00o = (HttpUtil.Headers) r2.f18791OooO00o.clone();
        this.f18871OooO00o = r2.m17891OooO00o();
    }

    public C6820lI1ii(String str, URL url) {
        this.f18872OooO00o = str;
        this.f18873OooO00o = url;
        this.f18874OooO00o = new HttpUtil.Headers();
    }

    public C6773llLi OooO00o() {
        return new C6773llLi(this.f18872OooO00o, this.f18873OooO00o, this.f18875OooO00o, this.OooO00o, this.f18870OooO00o, this.f18874OooO00o, this.f18871OooO00o);
    }

    public C6820lI1ii OooO00o(AbstractC5174I1Ii i1Ii) {
        this.OooO00o = i1Ii;
        return this;
    }

    public C6820lI1ii OooO00o(iLIlLI r1) {
        this.f18870OooO00o = r1;
        return this;
    }

    public C6820lI1ii OooO00o(iLL11Ll1 ill11ll1) {
        this.f18871OooO00o = ill11ll1;
        return this;
    }

    public C6820lI1ii OooO00o(String str, String str2) {
        this.f18874OooO00o.add(str, str2);
        return this;
    }

    public C6820lI1ii OooO00o(URL url) {
        this.f18873OooO00o = url;
        return this;
    }

    public C6820lI1ii OooO00o(byte[] bArr) {
        this.f18875OooO00o = C9586iIILl.m21630OooO00o(bArr);
        return this;
    }

    public C6820lI1ii OooO0O0(String str, String str2) {
        this.f18874OooO00o.set(str, str2);
        return this;
    }
}
