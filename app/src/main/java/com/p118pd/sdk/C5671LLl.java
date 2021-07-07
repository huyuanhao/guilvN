package com.p118pd.sdk;

import java.io.IOException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: com.pd.sdk.LLl丨  reason: invalid class name and case insensitive filesystem */
public class C5671LLl implements C111<SSLSession>, LI1ILl, AbstractC6007i11i {
    public final LL1iLii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Long f16512OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SSLSocket f16513OooO00o;

    public C5671LLl(SSLSocket sSLSocket, LL1iLii r2, Long l) {
        this.f16513OooO00o = sSLSocket;
        this.OooO00o = r2;
        this.f16512OooO00o = l;
    }

    /* Return type fixed from 'java.io.InputStream' to match base method */
    @Override // com.p118pd.sdk.AbstractC6007i11i, com.p118pd.sdk.C111, com.p118pd.sdk.C111, com.p118pd.sdk.C111, com.p118pd.sdk.LI1ILl, com.p118pd.sdk.LI1ILl
    public SSLSession OooO00o() throws IOException {
        return this.f16513OooO00o.getInputStream();
    }

    /* Return type fixed from 'java.io.OutputStream' to match base method */
    @Override // com.p118pd.sdk.AbstractC6007i11i, com.p118pd.sdk.C111, com.p118pd.sdk.C111, com.p118pd.sdk.C111, com.p118pd.sdk.LI1ILl, com.p118pd.sdk.LI1ILl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public SSLSession m16245OooO00o() throws IOException {
        return this.f16513OooO00o.getOutputStream();
    }

    /* Return type fixed from 'java.lang.Long' to match base method */
    @Override // com.p118pd.sdk.AbstractC6007i11i, com.p118pd.sdk.C111, com.p118pd.sdk.C111, com.p118pd.sdk.C111, com.p118pd.sdk.LI1ILl, com.p118pd.sdk.LI1ILl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public SSLSession m16246OooO00o() {
        return this.f16512OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6007i11i, com.p118pd.sdk.C111, com.p118pd.sdk.C111, com.p118pd.sdk.C111, com.p118pd.sdk.LI1ILl, com.p118pd.sdk.LI1ILl
    public SSLSession OooO00o() {
        return this.f16513OooO00o.getSession();
    }

    /* Return type fixed from 'boolean' to match base method */
    @Override // com.p118pd.sdk.AbstractC6007i11i, com.p118pd.sdk.C111, com.p118pd.sdk.C111, com.p118pd.sdk.C111, com.p118pd.sdk.LI1ILl, com.p118pd.sdk.LI1ILl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public SSLSession m16248OooO00o() {
        return this.OooO00o.OooO00o(this.f16513OooO00o);
    }

    /* Return type fixed from 'byte[]' to match base method */
    @Override // com.p118pd.sdk.AbstractC6007i11i, com.p118pd.sdk.C111, com.p118pd.sdk.C111, com.p118pd.sdk.C111, com.p118pd.sdk.LI1ILl, com.p118pd.sdk.LI1ILl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public SSLSession m16249OooO00o() {
        if (m16248OooO00o()) {
            return this.OooO00o.OooO00o(this.f16513OooO00o, "tls-unique");
        }
        throw new IllegalStateException("No binding provider.");
    }

    @Override // com.p118pd.sdk.C111
    public void close() throws IOException {
        this.f16513OooO00o.close();
    }
}
