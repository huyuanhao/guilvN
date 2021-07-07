package com.qiyukf.unicorn.p212e;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.qiyukf.nim.uikit.C1877b;
import com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.p210c.C2447a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.qiyukf.unicorn.e.p */
public final class C2481p implements UserInfoProvider {

    /* renamed from: a */
    public Map<String, C2483r> f4921a = new HashMap();

    /* renamed from: a */
    public static String m5460a(String str) {
        return "QIYU_ROBOT" + str;
    }

    /* renamed from: b */
    public static String m5461b(String str) {
        return "STAFF_GROUP" + str;
    }

    /* renamed from: a */
    public final void mo35749a(String str, String str2, String str3) {
        mo35750a(str, str2, str3, "");
    }

    /* renamed from: a */
    public final void mo35750a(String str, String str2, String str3, String str4) {
        Map<String, C2483r> map;
        C2483r rVar = new C2483r(str + str4, str2, str3);
        C2447a.m5342a(rVar);
        if (TextUtils.isEmpty(str4)) {
            map = this.f4921a;
        } else {
            map = this.f4921a;
            str = str + str4;
        }
        map.put(str, rVar);
    }

    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider
    public final int getDefaultIconResId() {
        return C2452d.m5367c().getApplicationInfo().icon;
    }

    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider
    public final Bitmap getTeamIcon(String str) {
        return null;
    }

    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider
    public final UserInfoProvider.UserInfo getUserInfo(String str) {
        C2483r rVar = this.f4921a.get(str);
        if (rVar == null) {
            if (TextUtils.equals(str, C1877b.m3581b())) {
                rVar = new C2483r(C1877b.m3581b(), "", "");
            } else {
                rVar = C2447a.m5339a(str);
                if (rVar == null) {
                    rVar = new C2483r(str, "", "");
                }
            }
            this.f4921a.put(str, rVar);
        }
        return rVar;
    }
}
