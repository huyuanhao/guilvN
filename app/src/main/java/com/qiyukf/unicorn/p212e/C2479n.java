package com.qiyukf.unicorn.p212e;

import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.api.pop.ShopInfo;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.e.n */
public final class C2479n implements ShopInfo {

    /* renamed from: a */
    public String f4917a;

    /* renamed from: b */
    public String f4918b;

    /* renamed from: c */
    public String f4919c;

    public C2479n() {
    }

    public C2479n(String str, String str2, String str3) {
        this.f4917a = str;
        this.f4918b = str2;
        this.f4919c = str3;
    }

    /* renamed from: a */
    public final void mo35746a(String str) {
        JSONObject a = C1810b.m3420a(str);
        if (a != null) {
            this.f4917a = C1810b.m3432e(a, "id");
            this.f4918b = C1810b.m3432e(a, "name");
            this.f4919c = C1810b.m3432e(a, "logo");
        }
    }

    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider.UserInfo, com.qiyukf.unicorn.api.pop.ShopInfo
    public final String getAccount() {
        return this.f4917a;
    }

    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider.UserInfo, com.qiyukf.unicorn.api.pop.ShopInfo
    public final String getAvatar() {
        return this.f4919c;
    }

    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider.UserInfo, com.qiyukf.unicorn.api.pop.ShopInfo
    public final String getName() {
        return this.f4918b;
    }
}
