package com.qiyukf.nimlib.p155a.p174e;

import android.text.TextUtils;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p155a.C2107a;
import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.p162c.p165c.C2139a;
import com.qiyukf.nimlib.p177c.C2204c;
import com.qiyukf.nimlib.p179d.AbstractC2215f;
import com.qiyukf.nimlib.p179d.AbstractC2217h;
import com.qiyukf.nimlib.p179d.C2206a;
import com.qiyukf.nimlib.sdk.AbortableFuture;
import com.qiyukf.nimlib.sdk.InvocationFuture;
import com.qiyukf.nimlib.sdk.auth.AuthService;
import com.qiyukf.nimlib.sdk.auth.LoginInfo;
import com.qiyukf.nimlib.sdk.auth.OnlineClient;
import com.qiyukf.unicorn.api.SavePowerConfig;

/* renamed from: com.qiyukf.nimlib.a.e.a */
public class C2167a extends AbstractC2217h implements AuthService {
    @Override // com.qiyukf.nimlib.sdk.auth.AuthService
    public void changeSaverMode(int i) {
        C2130c.m4323a().mo34654a(i);
    }

    @Override // com.qiyukf.nimlib.sdk.auth.AuthService
    public int getKickedClientType() {
        return C2205d.m4585h();
    }

    @Override // com.qiyukf.nimlib.sdk.auth.AuthService
    public InvocationFuture<Void> kickOtherClient(OnlineClient onlineClient) {
        if (!(onlineClient instanceof C2107a)) {
            return null;
        }
        C2139a aVar = new C2139a(((C2107a) onlineClient).mo34631a());
        aVar.mo34668a(AbstractC2217h.m4611b());
        C2130c.m4323a().mo34661a(aVar);
        return null;
    }

    @Override // com.qiyukf.nimlib.sdk.auth.AuthService
    public AbortableFuture<LoginInfo> login(LoginInfo loginInfo) {
        C2130c.m4323a().mo34656a(AbstractC2217h.m4611b(), loginInfo);
        return new AbstractC2215f<LoginInfo>(loginInfo) {
            /* class com.qiyukf.nimlib.p155a.p174e.C2167a.C21681 */

            @Override // com.qiyukf.nimlib.sdk.AbortableFuture
            public final boolean abort() {
                C2167a.this.logout();
                return false;
            }
        };
    }

    @Override // com.qiyukf.nimlib.sdk.auth.AuthService
    public InvocationFuture<Void> logout() {
        C2130c.m4323a().mo34665c();
        C2206a.m4593c(AbstractC2217h.m4611b().mo34830b((Object) null));
        return null;
    }

    @Override // com.qiyukf.nimlib.sdk.auth.AuthService
    public boolean openLocalCache(String str) {
        if (C2204c.m4563a().mo34813b()) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C2204c.m4563a().mo34812a(C2180b.m4471a(), str);
    }

    @Override // com.qiyukf.nimlib.sdk.auth.AuthService
    public void updateSavePowerConfig(SavePowerConfig savePowerConfig) {
        C2130c.m4323a().mo34659a(savePowerConfig);
    }
}
