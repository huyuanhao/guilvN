package com.qiyukf.unicorn.p213f;

import com.qiyukf.nimlib.sdk.auth.LoginInfo;

/* renamed from: com.qiyukf.unicorn.f.b */
public final class C2631b {

    /* renamed from: a */
    public LoginInfo f5404a;

    /* renamed from: b */
    public String f5405b;

    /* renamed from: c */
    public boolean f5406c;

    /* renamed from: d */
    public boolean f5407d;

    /* renamed from: a */
    public final LoginInfo mo36240a() {
        return this.f5404a;
    }

    /* renamed from: a */
    public final void mo36241a(LoginInfo loginInfo) {
        this.f5404a = loginInfo;
    }

    /* renamed from: a */
    public final void mo36242a(boolean z) {
        this.f5406c = z;
    }

    /* renamed from: b */
    public final boolean mo36243b() {
        return this.f5407d;
    }

    public final String toString() {
        return "auth: " + this.f5404a + "\r\nexchanges: " + this.f5405b + "\r\npush: " + this.f5406c + "\r\nisHisAccount: " + this.f5407d;
    }
}
