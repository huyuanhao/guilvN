package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.ChannelService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.OrangeConfigListenerV1;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.taobao.accs.utl.t */
public class C3190t {
    public static final String NAMESPACE = "accs";

    /* renamed from: a */
    public static boolean f7252a;

    /* renamed from: b */
    public static volatile Long f7253b = null;

    /* renamed from: c */
    public static Boolean f7254c = null;

    /* renamed from: d */
    public static boolean f7255d;

    /* renamed from: com.taobao.accs.utl.t$a */
    public static class C3191a implements OrangeConfigListenerV1 {
        public void onConfigUpdate(String str, boolean z) {
            if (GlobalClientInfo.getContext() == null) {
                ALog.m7599e("OrangeAdapter", "onConfigUpdate context null", new Object[0]);
                return;
            }
            try {
                ALog.m7600i("OrangeAdapter", "onConfigUpdate", "namespace", str);
                if ("accs".equals(str)) {
                    C3190t.m7709i();
                    C3190t.m7708h();
                }
            } catch (Throwable th) {
                ALog.m7598e("OrangeAdapter", "onConfigUpdate", th, new Object[0]);
            }
        }
    }

    static {
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
            f7252a = true;
        } catch (Exception unused) {
            f7252a = false;
        }
    }

    /* renamed from: a */
    public static void m7697a(String[] strArr, OrangeConfigListenerV1 orangeConfigListenerV1) {
        if (f7252a) {
            OrangeConfig.getInstance().registerListener(strArr, orangeConfigListenerV1);
        } else {
            ALog.m7603w("OrangeAdapter", "no orange sdk", new Object[0]);
        }
    }

    /* renamed from: b */
    public static boolean m7702b() {
        boolean z;
        try {
            z = m7699a(GlobalClientInfo.getContext(), Constants.SP_KEY_HB_SMART_ENABLE, true);
        } catch (Throwable th) {
            ALog.m7598e("OrangeAdapter", "isSmartHb", th, new Object[0]);
            z = true;
        }
        ALog.m7597d("OrangeAdapter", "isSmartHb", "result", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: c */
    public static boolean m7703c() {
        boolean z;
        try {
            z = m7699a(GlobalClientInfo.getContext(), Constants.SP_KEY_BIND_SERVICE_ENABLE, true);
        } catch (Throwable th) {
            ALog.m7598e("OrangeAdapter", "isBindService", th, new Object[0]);
            z = true;
        }
        ALog.m7597d("OrangeAdapter", "isBindService", "result", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: d */
    public static boolean m7704d() {
        boolean z;
        try {
            z = m7699a(GlobalClientInfo.getContext(), Constants.SP_KEY_KEEP_ALIVE_ENABLE, true);
        } catch (Throwable th) {
            ALog.m7598e("OrangeAdapter", "isKeepAlive", th, new Object[0]);
            z = true;
        }
        ALog.m7597d("OrangeAdapter", "isKeepAlive", "result", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: e */
    public static boolean m7705e() {
        boolean z;
        try {
            z = m7699a(GlobalClientInfo.getContext(), Constants.SP_KEY_PULL_UP_ENABLE, true);
        } catch (Throwable th) {
            ALog.m7598e("OrangeAdapter", "isPullUp", th, new Object[0]);
            z = true;
        }
        ALog.m7597d("OrangeAdapter", "isPullUp", "result", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: f */
    public static void m7706f() {
        f7255d = true;
        f7254c = false;
        m7701b(GlobalClientInfo.getContext(), Constants.SP_KEY_CHANNEL_MODE_ENABLE, false);
    }

    /* renamed from: g */
    public static boolean m7707g() {
        if (f7254c == null) {
            try {
                f7254c = Boolean.valueOf(m7699a(GlobalClientInfo.getContext(), Constants.SP_KEY_CHANNEL_MODE_ENABLE, false));
            } catch (Throwable th) {
                ALog.m7598e("OrangeAdapter", "isChannelModeEnable", th, new Object[0]);
            }
            ALog.m7597d("OrangeAdapter", "isChannelModeEnable", "result", f7254c);
        }
        return f7254c.booleanValue();
    }

    /* renamed from: h */
    public static void m7708h() {
        HashMap hashMap = new HashMap();
        String str = "false";
        hashMap.put(Constants.SP_KEY_TNET_LOG_OFF, Boolean.valueOf(m7692a("accs", Constants.SP_KEY_TNET_LOG_OFF, str)));
        hashMap.put(Constants.SP_KEY_ELECTION_ENABLE, Boolean.valueOf(m7692a("accs", Constants.SP_KEY_ELECTION_ENABLE, String.valueOf(GlobalClientInfo.f6861d))));
        hashMap.put(Constants.SP_KEY_HB_SMART_ENABLE, Boolean.valueOf(m7692a("accs", "heartbeat_smart_enable", "true")));
        hashMap.put(Constants.SP_KEY_BIND_SERVICE_ENABLE, Boolean.valueOf(m7692a("accs", Constants.SP_KEY_BIND_SERVICE_ENABLE, "true")));
        if (!f7255d) {
            str = m7692a("accs", Constants.SP_KEY_CHANNEL_MODE_ENABLE, str);
        }
        hashMap.put(Constants.SP_KEY_CHANNEL_MODE_ENABLE, Boolean.valueOf(str));
        hashMap.put(Constants.SP_KEY_KEEP_ALIVE_ENABLE, Boolean.valueOf(m7692a("accs", Constants.SP_KEY_KEEP_ALIVE_ENABLE, "true")));
        hashMap.put(Constants.SP_KEY_PULL_UP_ENABLE, Boolean.valueOf(m7692a("accs", Constants.SP_KEY_PULL_UP_ENABLE, "true")));
        m7695a(GlobalClientInfo.getContext(), hashMap);
        m7694a(GlobalClientInfo.getContext(), ChannelService.SUPPORT_FOREGROUND_VERSION_KEY, UtilityImpl.m7622b(m7692a("accs", ChannelService.SUPPORT_FOREGROUND_VERSION_KEY, String.valueOf(21))));
        m7696a(m7692a("accs", "pullup", (String) null));
    }

    /* renamed from: i */
    public static void m7709i() {
        if (!m7698a()) {
            ALog.m7599e("OrangeAdapter", "force disable service", new Object[0]);
            ACCSManager.forceDisableService(GlobalClientInfo.getContext());
        } else if (UtilityImpl.m7634d(GlobalClientInfo.getContext())) {
            ALog.m7600i("OrangeAdapter", "force enable service", new Object[0]);
            ACCSManager.forceEnableService(GlobalClientInfo.getContext());
        }
    }

    /* renamed from: a */
    public static String m7692a(String str, String str2, String str3) {
        if (f7252a) {
            return OrangeConfig.getInstance().getConfig(str, str2, str3);
        }
        ALog.m7603w("OrangeAdapter", "no orange sdk", new Object[0]);
        return str3;
    }

    /* renamed from: b */
    public static void m7701b(Context context, String str, boolean z) {
        if (context == null) {
            try {
                ALog.m7599e("OrangeAdapter", "saveTLogOffToSP context null", new Object[0]);
            } catch (Exception e) {
                ALog.m7598e("OrangeAdapter", "saveConfigToSP fail:", e, "key", str, "value", Boolean.valueOf(z));
            }
        } else {
            SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            edit.putBoolean(str, z);
            edit.apply();
            ALog.m7600i("OrangeAdapter", "saveConfigToSP", "key", str, "value", Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public static boolean m7698a() {
        boolean z;
        try {
            z = Boolean.valueOf(m7692a("accs", "main_function_enable", "true")).booleanValue();
        } catch (Throwable th) {
            ALog.m7598e("OrangeAdapter", "isAccsEnabled", th, new Object[0]);
            z = true;
        }
        ALog.m7600i("OrangeAdapter", "isAccsEnabled", "enable", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: a */
    public static long m7691a(Context context) {
        if (f7253b == null) {
            try {
                f7253b = Long.valueOf(context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getLong(Constants.SP_KEY_LAST_LAUNCH_TIME, 0));
            } catch (Throwable th) {
                ALog.m7598e("OrangeAdapter", "getLastActiveTime", th, new Object[0]);
            }
            ALog.m7597d("OrangeAdapter", "getLastActiveTime", "result", f7253b);
        }
        return f7253b.longValue();
    }

    /* renamed from: a */
    public static void m7693a(Context context, long j) {
        try {
            f7253b = Long.valueOf(j);
            SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            edit.putLong(Constants.SP_KEY_LAST_LAUNCH_TIME, j);
            edit.apply();
        } catch (Throwable th) {
            ALog.m7598e("OrangeAdapter", "saveLastActiveTime fail:", th, "lastLaunchTime", Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public static boolean m7700a(boolean z) {
        boolean z2;
        Throwable th;
        boolean z3;
        String str;
        if (z) {
            try {
                str = m7692a("accs", Constants.SP_KEY_TNET_LOG_OFF, AccsClientConfig.DEFAULT_CONFIGTAG);
            } catch (Throwable th2) {
                th = th2;
                z3 = true;
                ALog.m7598e("OrangeAdapter", "isTnetLogOff", th, new Object[0]);
                z2 = z3;
                ALog.m7600i("OrangeAdapter", "isTnetLogOff", "result", Boolean.valueOf(z2));
                return z2;
            }
        } else {
            str = AccsClientConfig.DEFAULT_CONFIGTAG;
        }
        if (str.equals(AccsClientConfig.DEFAULT_CONFIGTAG)) {
            z2 = m7699a(GlobalClientInfo.getContext(), Constants.SP_KEY_TNET_LOG_OFF, true);
        } else {
            z2 = Boolean.valueOf(str).booleanValue();
            try {
                m7701b(GlobalClientInfo.getContext(), Constants.SP_KEY_TNET_LOG_OFF, z2);
            } catch (Throwable th3) {
                z3 = z2;
                th = th3;
            }
        }
        ALog.m7600i("OrangeAdapter", "isTnetLogOff", "result", Boolean.valueOf(z2));
        return z2;
    }

    /* renamed from: a */
    public static boolean m7699a(Context context, String str, boolean z) {
        try {
            return context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getBoolean(str, z);
        } catch (Exception e) {
            ALog.m7598e("OrangeAdapter", "getConfigFromSP fail:", e, "key", str);
            return z;
        }
    }

    /* renamed from: a */
    public static void m7694a(Context context, String str, int i) {
        if (context == null) {
            try {
                ALog.m7599e("OrangeAdapter", "saveTLogOffToSP context null", new Object[0]);
            } catch (Exception e) {
                ALog.m7598e("OrangeAdapter", "saveConfigToSP fail:", e, "key", str, "value", Integer.valueOf(i));
            }
        } else {
            SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            edit.putInt(str, i);
            edit.apply();
            ALog.m7600i("OrangeAdapter", "saveConfigToSP", "key", str, "value", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static void m7695a(Context context, Map<String, Boolean> map) {
        if (map != null) {
            try {
                if (map.size() != 0) {
                    SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                    for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                        edit.putBoolean(entry.getKey(), entry.getValue().booleanValue());
                    }
                    edit.apply();
                    ALog.m7600i("OrangeAdapter", "saveConfigsToSP", "configs", map.toString());
                }
            } catch (Exception e) {
                ALog.m7598e("OrangeAdapter", "saveConfigsToSP fail:", e, "configs", map.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m7696a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                SharedPreferences.Editor edit = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                edit.putString("pullup", str);
                edit.apply();
            } catch (Throwable th) {
                ALog.m7598e("OrangeAdapter", "savePullupInfo fail:", th, "pullup", str);
            }
            ALog.m7600i("OrangeAdapter", "savePullupInfo", "pullup", str);
        }
    }
}
