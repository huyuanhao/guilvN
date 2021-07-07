package com.alipay.apmobilesecuritysdk.p020b;

import com.p118pd.sdk.C7559o0o00OOo;
import com.p118pd.sdk.C7581o0o0O00o;

/* renamed from: com.alipay.apmobilesecuritysdk.b.a */
public final class C0382a {

    /* renamed from: b */
    public static C0382a f867b = new C0382a();

    /* renamed from: a */
    public int f868a = 0;

    /* renamed from: a */
    public static C0382a m738a() {
        return f867b;
    }

    /* renamed from: a */
    public final void mo4185a(int i) {
        this.f868a = i;
    }

    /* renamed from: b */
    public final int mo4186b() {
        return this.f868a;
    }

    /* renamed from: c */
    public final String mo4187c() {
        String OooO00o = C7581o0o0O00o.OooO00o();
        if (C7559o0o00OOo.m19212OooO0O0(OooO00o)) {
            return OooO00o;
        }
        int i = this.f868a;
        return i != 1 ? i != 3 ? i != 4 ? "https://mobilegw.alipay.com/mgw.htm" : "http://mobilegw.aaa.alipay.net/mgw.htm" : "http://mobilegw-1-64.test.alipay.net/mgw.htm" : "http://mobilegw.stable.alipay.net/mgw.htm";
    }
}
