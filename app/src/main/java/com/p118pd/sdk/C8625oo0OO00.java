package com.p118pd.sdk;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.pd.sdk.oo0OO00  reason: case insensitive filesystem */
public class C8625oo0OO00 {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f21745OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public HostnameVerifier f21746OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SSLSocketFactory f21747OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21748OooO00o;

    /* renamed from: com.pd.sdk.oo0OO00$OooO0O0 */
    public static class OooO0O0 {
        public static final C8625oo0OO00 OooO00o = new C8625oo0OO00();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public HostnameVerifier m20251OooO00o() {
        return this.f21746OooO00o;
    }

    public C8625oo0OO00 OooO0O0(String str) {
        C8630oo0OO0OO.OooO00o().OooO00o = str;
        return this;
    }

    public C8625oo0OO00 OooO0OO(String str) {
        C8630oo0OO0OO.OooO00o().OooO0oo = str;
        return this;
    }

    public C8625oo0OO00 OooO0Oo(String str) {
        C8630oo0OO0OO.OooO00o().OooO0OO(str);
        return this;
    }

    public C8625oo0OO00() {
        this.f21745OooO00o = new HashMap();
        this.f21748OooO00o = false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public SSLSocketFactory m20252OooO00o() {
        return this.f21747OooO00o;
    }

    public C8625oo0OO00 OooO0O0(boolean z) {
        C8630oo0OO0OO.OooO00o().f21751OooO00o = z;
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20253OooO00o() {
        return this.f21748OooO00o;
    }

    public C8625oo0OO00 OooO0O0(String str, String str2) {
        C8630oo0OO0OO.OooO00o().OooO0Oo = str;
        C8630oo0OO0OO.OooO00o().OooO0o0 = str2;
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, String> m20250OooO00o() {
        return this.f21745OooO00o;
    }

    public static C8625oo0OO00 OooO00o() {
        return OooO0O0.OooO00o;
    }

    public C8625oo0OO00 OooO00o(String str, String str2) {
        C8630oo0OO0OO.OooO00o().OooO00o(str);
        C8630oo0OO0OO.OooO00o().OooO0O0(str2);
        return this;
    }

    public C8625oo0OO00 OooO00o(String str) {
        C8630oo0OO0OO.OooO00o().OooO0o = str;
        return this;
    }

    public C8625oo0OO00 OooO00o(Map<String, String> map) {
        this.f21745OooO00o = map;
        return this;
    }

    public C8625oo0OO00 OooO00o(boolean z) {
        this.f21748OooO00o = z;
        return this;
    }

    public C8625oo0OO00 OooO00o(SSLSocketFactory sSLSocketFactory) {
        this.f21747OooO00o = sSLSocketFactory;
        return this;
    }

    public C8625oo0OO00 OooO00o(HostnameVerifier hostnameVerifier) {
        this.f21746OooO00o = hostnameVerifier;
        return this;
    }

    public void OooO00o(Context context) {
        this.OooO00o = context;
        C8635oo0OO0oo.OooO00o().OooO00o(context);
        C8950ooOOOo.OooO00o().OooO00o(context);
    }

    public void OooO00o(long j) {
        C8645oo0OOo0o.OooO00o(j);
    }
}
