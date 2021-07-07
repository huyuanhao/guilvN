package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.jinhui365.customer.CustomerServiceModule;
import com.jinhui365.customer.view.QiYuActivity;
import com.qiyukf.nimlib.sdk.NimIntent;
import com.qiyukf.unicorn.api.ConsultSource;
import com.qiyukf.unicorn.api.SavePowerConfig;
import com.qiyukf.unicorn.api.StatusBarNotificationConfig;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.api.Unicorn;
import com.qiyukf.unicorn.api.UnreadCountChangeListener;
import com.qiyukf.unicorn.api.YSFOptions;
import com.qiyukf.unicorn.api.YSFUserInfo;

/* renamed from: com.pd.sdk.oo0O0oo0  reason: case insensitive filesystem */
public class C8620oo0O0oo0 {
    public static YSFOptions OooO00o;

    /* renamed from: com.pd.sdk.oo0O0oo0$OooO00o */
    public class OooO00o implements UnreadCountChangeListener {
        public OooO00o() {
        }

        @Override // com.qiyukf.unicorn.api.UnreadCountChangeListener
        public void onUnreadCountChange(int i) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("__EVENT_TYPE__", "msgUnread");
            createMap.putInt(C8412oOoo0OoO.OooO0O0, i);
            CustomerServiceModule.sendEventMap("CustomerServiceReminder", createMap);
        }
    }

    /* renamed from: com.pd.sdk.oo0O0oo0$OooO0O0 */
    public static class OooO0O0 {
        public static final C8620oo0O0oo0 OooO00o = new C8620oo0O0oo0(null);
    }

    public /* synthetic */ C8620oo0O0oo0(OooO00o oooO00o) {
        this();
    }

    public static C8620oo0O0oo0 OooO00o() {
        return OooO0O0.OooO00o;
    }

    public C8620oo0O0oo0() {
    }

    public boolean OooO00o(String str, Context context) {
        if (OooO00o == null) {
            OooO00o = new YSFOptions();
        }
        OooO00o.statusBarNotificationConfig = new StatusBarNotificationConfig();
        OooO00o.savePowerConfig = new SavePowerConfig();
        OooO00o.uiCustomization = m20246OooO00o();
        boolean init = Unicorn.init(context, str, OooO00o, new C8619oo0O0oo(context));
        if (init) {
            OooO00o(true);
        }
        return init;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20249OooO00o() {
        return Unicorn.isInit();
    }

    public boolean OooO00o(YSFUserInfo ySFUserInfo) {
        return Unicorn.setUserInfo(ySFUserInfo);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20248OooO00o() {
        Unicorn.logout();
    }

    public boolean OooO00o(Intent intent) {
        if (intent == null || !intent.hasExtra(NimIntent.EXTRA_NOTIFY_CONTENT)) {
            return false;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("routerUrl", "/customer-service");
        CustomerServiceModule.sendEventMap("NotifyReminder", createMap);
        return true;
    }

    public void OooO00o(Context context, String str, String str2) {
        QiYuActivity.OooO00o(context, str, new ConsultSource("", "", ""), str2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m20247OooO00o() {
        return Unicorn.getUnreadCount();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private UICustomization m20246OooO00o() {
        UICustomization uICustomization = new UICustomization();
        uICustomization.titleBarStyle = 0;
        uICustomization.titleCenter = true;
        uICustomization.hideKeyboardOnEnterConsult = true;
        return uICustomization;
    }

    public void OooO00o(boolean z) {
        Unicorn.addUnreadCountChangeListener(new OooO00o(), z);
    }
}
