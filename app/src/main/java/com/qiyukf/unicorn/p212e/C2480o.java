package com.qiyukf.unicorn.p212e;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.pop.ShopInfo;
import com.qiyukf.unicorn.p210c.C2447a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.qiyukf.unicorn.e.o */
public final class C2480o implements UserInfoProvider {

    /* renamed from: a */
    public Map<String, ShopInfo> f4920a = new HashMap();

    /* renamed from: a */
    public final ShopInfo getUserInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        ShopInfo shopInfo = this.f4920a.get(lowerCase);
        if (shopInfo == null && (shopInfo = C2447a.m5343b(lowerCase)) != null) {
            this.f4920a.put(lowerCase, shopInfo);
        }
        return shopInfo;
    }

    /* renamed from: a */
    public final void mo35748a(C2479n nVar) {
        if (nVar != null && !TextUtils.isEmpty(nVar.getAccount())) {
            this.f4920a.put(nVar.getAccount(), nVar);
            C2447a.m5341a(nVar);
        }
    }

    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider
    public final int getDefaultIconResId() {
        return C2452d.m5367c().getApplicationInfo().icon;
    }

    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider
    public final Bitmap getTeamIcon(String str) {
        return null;
    }
}
