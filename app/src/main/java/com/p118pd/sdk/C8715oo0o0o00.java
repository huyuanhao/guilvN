package com.p118pd.sdk;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.support.api.push.PushReceiver;
import com.jinhui365.template.C1423R;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;
import com.umeng.message.UTrack;
import com.umeng.message.UmengNotificationClickHandler;
import com.umeng.message.entity.UMessage;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.huawei.HuaWeiRegister;
import org.android.agoo.oppo.OppoRegister;
import org.android.agoo.vivo.VivoRegister;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.pd.sdk.oo0o0o00  reason: case insensitive filesystem */
public class C8715oo0o0o00 {
    public static C8715oo0o0o00 OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21885OooO00o = "com.huawei.hms.client.appid";
    public static final String OooO0O0 = "__notification_page_url";
    public static final String OooO0OO = "__notification_page_params";
    public static final String OooO0Oo = "PushManager";
    public static final String OooO0o = "PUSH_ALIAS";
    public static final String OooO0o0 = "PUSH_SP";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21886OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PushAgent f21887OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, Object> f21888OooO00o;

    /* renamed from: com.pd.sdk.oo0o0o00$OooO00o */
    public class OooO00o extends UmengNotificationClickHandler {
        public OooO00o() {
        }

        @Override // com.umeng.message.UmengNotificationClickHandler
        public void dealWithCustomAction(Context context, UMessage uMessage) {
            if (uMessage != null) {
                C8715oo0o0o00.this.OooO00o(context, uMessage.title, uMessage.text, uMessage.extra);
            }
        }
    }

    /* renamed from: com.pd.sdk.oo0o0o00$OooO0O0 */
    public class OooO0O0 implements IUmengRegisterCallback {
        public OooO0O0() {
        }

        @Override // com.umeng.message.IUmengRegisterCallback
        public void onFailure(String str, String str2) {
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "友盟推送服务注册失败");
            hashMap.put("vars1", str);
            hashMap.put("vars2", str2);
            LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        }

        @Override // com.umeng.message.IUmengRegisterCallback
        public void onSuccess(String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "友盟推送服务注册成功");
            hashMap.put(PushReceiver.BOUND_KEY.deviceTokenKey, str);
            LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        }
    }

    /* renamed from: com.pd.sdk.oo0o0o00$OooO0OO */
    public class OooO0OO implements UTrack.ICallBack {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f21889OooO00o;
        public final /* synthetic */ String OooO0O0;

        public OooO0OO(String str, String str2) {
            this.f21889OooO00o = str;
            this.OooO0O0 = str2;
        }

        @Override // com.umeng.message.UTrack.ICallBack
        public void onMessage(boolean z, String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("alias", this.f21889OooO00o);
            hashMap.put("aliasType", this.OooO0O0);
            if (z) {
                C8643oo0OOo00.m20264OooO00o(C8715oo0o0o00.this.f21886OooO00o, C8715oo0o0o00.OooO0o0, C8715oo0o0o00.OooO0o, this.f21889OooO00o);
                return;
            }
            hashMap.put("desc", "友盟添加别名(Alias)失败");
            hashMap.put("errMessage", str);
            LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        }
    }

    /* renamed from: com.pd.sdk.oo0o0o00$OooO0Oo  reason: case insensitive filesystem */
    public class C8716OooO0Oo implements UTrack.ICallBack {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f21890OooO00o;
        public final /* synthetic */ String OooO0O0;

        public C8716OooO0Oo(String str, String str2) {
            this.f21890OooO00o = str;
            this.OooO0O0 = str2;
        }

        @Override // com.umeng.message.UTrack.ICallBack
        public void onMessage(boolean z, String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("alias", this.f21890OooO00o);
            hashMap.put("aliasType", this.OooO0O0);
            if (z) {
                C8643oo0OOo00.m20264OooO00o(C8715oo0o0o00.this.f21886OooO00o, C8715oo0o0o00.OooO0o0, C8715oo0o0o00.OooO0o, "");
                return;
            }
            hashMap.put("desc", "友盟删除别名(Alias)失败");
            hashMap.put("errMessage", str);
            LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        }
    }

    public C8715oo0o0o00(Context context) {
        this.f21886OooO00o = context;
    }

    private void OooO0Oo() {
        Map<String, Object> OooO0oO = C8706oo0o0OO0.OooO00o().OooO0oO();
        if (OooO0oO.containsKey("huaweiAppId")) {
            String str = (String) OooO0oO.get("huaweiAppId");
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "华为推送初始化");
            hashMap.put("huaweiAppId", str);
            LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
            if (C8741oo0oOo0.OooO0Oo(str)) {
                HuaWeiRegister.register((Application) this.f21886OooO00o);
            }
        }
    }

    private void OooO0o() {
        Map<String, Object> OooO0oO = C8706oo0o0OO0.OooO00o().OooO0oO();
        if (OooO0oO.containsKey("oppoAppKey") && OooO0oO.containsKey("oppoAppSecret")) {
            String str = (String) OooO0oO.get("oppoAppKey");
            String str2 = (String) OooO0oO.get("oppoAppSecret");
            if (!C8741oo0oOo0.OooO0OO(str) && !C8741oo0oOo0.OooO0OO(str2)) {
                HashMap hashMap = new HashMap();
                hashMap.put("desc", "oppo推送初始化");
                hashMap.put("oppoAppSecret", str2);
                hashMap.put("oppoAppKey", str);
                LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
                OppoRegister.register(this.f21886OooO00o, str, str2);
            }
        }
    }

    private void OooO0o0() {
        Context context = this.f21886OooO00o;
        if (C8742oo0oOo00.m20370OooO00o(context, context.getPackageName())) {
            Map<String, Object> OooO0oO = C8706oo0o0OO0.OooO00o().OooO0oO();
            if (OooO0oO.containsKey("miAppId") && OooO0oO.containsKey("miAppKey")) {
                String str = (String) OooO0oO.get("miAppId");
                String str2 = (String) OooO0oO.get("miAppKey");
                HashMap hashMap = new HashMap();
                hashMap.put("desc", "小米推送初始化");
                hashMap.put("miAppId", str);
                hashMap.put("miAppKey", str2);
                LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
                if (!C8741oo0oOo0.OooO0OO(str) && !C8741oo0oOo0.OooO0OO(str2)) {
                    MiPushRegistar.register(this.f21886OooO00o, str, str2);
                }
            }
        }
    }

    private void OooO0oO() {
        PushAgent instance = PushAgent.getInstance(this.f21886OooO00o);
        this.f21887OooO00o = instance;
        instance.setResourcePackageName(C1423R.class.getPackage().getName());
        this.f21887OooO00o.setPushCheck(((Boolean) C8706oo0o0OO0.OooO00o().OooO0o().get("debugLog")).booleanValue());
        this.f21887OooO00o.setDisplayNotificationNumber(3);
        this.f21887OooO00o.setNotificationClickHandler(new OooO00o());
        this.f21887OooO00o.register(new OooO0O0());
    }

    private void OooO0oo() {
        Map<String, Object> OooO0oO = C8706oo0o0OO0.OooO00o().OooO0oO();
        if (OooO0oO.containsKey("vivoAppId") && OooO0oO.containsKey("vivoAppKey")) {
            String str = (String) OooO0oO.get("vivoAppId");
            String str2 = (String) OooO0oO.get("vivoAppKey");
            if (!C8741oo0oOo0.OooO0OO(str) && !C8741oo0oOo0.OooO0OO(str2)) {
                HashMap hashMap = new HashMap();
                hashMap.put("desc", "vivo推送初始化");
                hashMap.put("vivoAppId", str);
                hashMap.put("vivoAppKey", str2);
                LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
                VivoRegister.register(this.f21886OooO00o);
            }
        }
    }

    public void OooO0O0() {
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "初始化推送通知");
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "initPush");
        LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        OooO0oO();
        OooO0o0();
        OooO0Oo();
        OooO0oo();
        OooO0o();
        String OooO00o2 = C8643oo0OOo00.OooO00o(this.f21886OooO00o, OooO0o0, OooO0o, "");
        if (C8741oo0oOo0.OooO0Oo(OooO00o2)) {
            OooO00o(OooO00o2, "uid");
        }
    }

    public void OooO0OO() {
        PushAgent pushAgent = this.f21887OooO00o;
        if (pushAgent != null) {
            pushAgent.onAppStart();
        }
    }

    public Map<String, Object> OooO00o() {
        return this.f21888OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20336OooO00o() {
        this.f21888OooO00o = null;
    }

    public static C8715oo0o0o00 OooO00o(Context context) {
        if (OooO00o == null) {
            synchronized (C8715oo0o0o00.class) {
                OooO00o = new C8715oo0o0o00(context);
            }
        }
        return OooO00o;
    }

    public void OooO00o(String str, String str2) {
        PushAgent pushAgent = this.f21887OooO00o;
        if (pushAgent != null) {
            pushAgent.addAlias(str, str2, new OooO0OO(str, str2));
        }
    }

    public void OooO00o(Context context, String str, String str2, Map<String, String> map) {
        Map<String, Object> OooO00o2 = OooO00o(str, str2, map);
        this.f21888OooO00o = OooO00o2;
        C8703oo0o0O00.OooO00o().OooO00o(C8932ooOOO0o.OooO0OO).OooO00o(OooO00o2).OooO00o(CommonNetImpl.FLAG_AUTH).OooO00o(context);
    }

    public void OooO0O0(String str, String str2) {
        PushAgent pushAgent = this.f21887OooO00o;
        if (pushAgent != null) {
            pushAgent.deleteAlias(str, str2, new C8716OooO0Oo(str, str2));
        }
    }

    public Map<String, Object> OooO00o(String str, String str2, Map<String, String> map) {
        String str3;
        HashMap hashMap = new HashMap();
        if (map == null || map.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putString("notificationTitle", str);
            bundle.putString("notificationContent", str2);
            hashMap.put("__notification_page_url", "/notification");
            hashMap.put("__notification_page_params", bundle);
        } else {
            if (map.containsKey("routerUrl")) {
                str3 = map.get("routerUrl");
                map.remove("routerUrl");
            } else {
                str3 = "";
            }
            Bundle bundle2 = new Bundle();
            for (String str4 : map.keySet()) {
                bundle2.putAll(C8701oo0o0O.OooO00o(bundle2, str4, map.get(str4)));
            }
            hashMap.put("__notification_page_url", str3);
            hashMap.put("__notification_page_params", bundle2);
        }
        return hashMap;
    }
}
