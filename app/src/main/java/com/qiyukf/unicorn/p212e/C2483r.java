package com.qiyukf.unicorn.p212e;

import android.text.TextUtils;
import com.qiyukf.nim.uikit.C1877b;
import com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider;
import com.qiyukf.unicorn.C2452d;

/* renamed from: com.qiyukf.unicorn.e.r */
public final class C2483r implements UserInfoProvider.UserInfo {

    /* renamed from: a */
    public String f4931a;

    /* renamed from: b */
    public String f4932b;

    /* renamed from: c */
    public String f4933c;

    public C2483r(String str, String str2, String str3) {
        this.f4931a = str;
        this.f4932b = str2;
        this.f4933c = str3;
    }

    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider.UserInfo
    public final String getAccount() {
        return this.f4931a;
    }

    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider.UserInfo
    public final String getAvatar() {
        if (this.f4931a.equals(C1877b.m3581b())) {
            String str = null;
            if (C2452d.m5373e().uiCustomization != null) {
                str = C2452d.m5373e().uiCustomization.rightAvatar;
            }
            return TextUtils.isEmpty(str) ? "selfDefault" : str;
        }
        if (TextUtils.isEmpty(this.f4933c)) {
            this.f4933c = (C2452d.m5373e().uiCustomization == null || TextUtils.isEmpty(C2452d.m5373e().uiCustomization.leftAvatar)) ? "staffDefault" : C2452d.m5373e().uiCustomization.leftAvatar;
        }
        return this.f4933c;
    }

    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider.UserInfo
    public final String getName() {
        return this.f4932b;
    }
}
