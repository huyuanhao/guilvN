package anetwork.channel.http;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.SessionCenter;
import anet.channel.entity.ENV;
import anet.channel.util.ALog;
import anet.channel.util.Utils;
import com.p118pd.sdk.C7348o0O0oo;
import com.p118pd.sdk.C7354o0O0ooO0;
import com.p118pd.sdk.C7441o0OOooO0;
import com.taobao.accs.common.Constants;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class NetworkSdkSetting implements Serializable {
    public static ENV CURRENT_ENV = ENV.ONLINE;
    public static Context OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static HashMap<String, Object> f14724OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static AtomicBoolean f14725OooO00o = new AtomicBoolean(false);
    public static final String o0ooOOo = "anet.NetworkSdkSetting";

    public static void OooO00o() {
        try {
            Utils.invokeStaticMethodThrowException("anet.channel.TaobaoNetworkAdapter", "init", new Class[]{Context.class, HashMap.class}, OooO00o, f14724OooO00o);
            ALog.m290i(o0ooOOo, "init taobao adapter success", null, new Object[0]);
        } catch (Exception e) {
            ALog.m290i(o0ooOOo, "initTaobaoAdapter failed. maybe not taobao app", null, e);
        }
    }

    public static Context getContext() {
        return OooO00o;
    }

    public static void init(Context context) {
        if (context != null) {
            try {
                if (f14725OooO00o.compareAndSet(false, true)) {
                    ALog.m289e(o0ooOOo, "NetworkSdkSetting init", null, new Object[0]);
                    OooO00o = context;
                    GlobalAppRuntimeInfo.setContext(context);
                    OooO00o();
                    C7441o0OOooO0.m19062OooO00o();
                    C7348o0O0oo.m18854OooO00o();
                    C7354o0O0ooO0.OooO00o(context);
                    SessionCenter.init(context);
                }
            } catch (Throwable th) {
                ALog.m288e(o0ooOOo, "Network SDK initial failed!", null, th, new Object[0]);
            }
        }
    }

    public static void setTtid(String str) {
        GlobalAppRuntimeInfo.setTtid(str);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        try {
            GlobalAppRuntimeInfo.setTtid((String) hashMap.get(Constants.KEY_TTID));
            GlobalAppRuntimeInfo.setUtdid((String) hashMap.get("deviceId"));
            String str = (String) hashMap.get(UMModuleRegister.PROCESS);
            if (!TextUtils.isEmpty(str)) {
                GlobalAppRuntimeInfo.setCurrentProcess(str);
            }
            f14724OooO00o = new HashMap<>(hashMap);
            init(application.getApplicationContext());
            f14724OooO00o = null;
        } catch (Exception e) {
            ALog.m288e(o0ooOOo, "Network SDK initial failed!", null, e, new Object[0]);
        }
    }
}
