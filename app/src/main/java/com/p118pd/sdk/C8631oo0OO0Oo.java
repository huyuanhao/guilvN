package com.p118pd.sdk;

import android.content.Context;
import com.jinhui365.hotsources.bean.HotSourceVO;
import com.rxhui.android_log_sdk.LogCollectorManager;

/* renamed from: com.pd.sdk.oo0OO0Oo  reason: case insensitive filesystem */
public class C8631oo0OO0Oo {
    public static C8631oo0OO0Oo OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21752OooO00o = "RouterUtil";

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8626oo0OO000 f21753OooO00o = new OooO00o(C8653oo0Oo0.OooO0o0);

    /* renamed from: com.pd.sdk.oo0OO0Oo$OooO00o */
    public class OooO00o extends AbstractC8626oo0OO000 {
        public OooO00o(String str) {
            super(str);
        }

        @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
        public void OooO00o(String str) {
            super.OooO00o(str);
        }

        @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
        public void OooO0O0(String str, String str2, HotSourceVO hotSourceVO) {
            if (C8653oo0Oo0.OooO0o0.equals(hotSourceVO.getCategory())) {
                C8631oo0OO0Oo.this.OooO00o(str2);
            }
        }

        @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
        public void onFailure(String str, String str2) {
            String str3 = str + "::" + str2;
        }

        @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
        public void OooO00o(String str, String str2, HotSourceVO hotSourceVO) {
            if (C8653oo0Oo0.OooO0o0.equals(hotSourceVO.getCategory())) {
                C8631oo0OO0Oo.this.OooO00o(str2);
            }
        }
    }

    public static C8631oo0OO0Oo OooO00o() {
        if (OooO00o == null) {
            synchronized (C8631oo0OO0Oo.class) {
                OooO00o = new C8631oo0OO0Oo();
            }
        }
        return OooO00o;
    }

    public void OooO00o(Context context) {
        C8653oo0Oo0 OooO00o2 = C8653oo0Oo0.OooO00o(context);
        OooO00o2.OooO00o(this.f21753OooO00o);
        OooO00o2.OooO00o(C8653oo0Oo0.OooO0o0, 1);
    }

    public void OooO00o(String str) {
        try {
            C8703oo0o0O00.OooO00o().m20323OooO00o(C8640oo0OOOoo.OooO00o(str));
        } catch (Exception e) {
            e.printStackTrace();
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            sharedInstance.recordWarn("RouteManager initialize " + e.getLocalizedMessage());
        }
    }
}
