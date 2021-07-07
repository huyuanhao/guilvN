package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pd.sdk.oo00O00  reason: case insensitive filesystem */
public abstract class AbstractC8521oo00O00 {
    public static SharedPreferences OooO00o(Context context, String str) {
        return C8592oo0O00O0.OooO00o(context, str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static File m20191OooO00o(Context context, String str) {
        String str2 = "hianalytics_" + str + "_" + context.getPackageName() + C5982OoooOoO.OooO;
        return new File(context.getFilesDir(), "../shared_prefs/" + str2);
    }

    public static Object OooO00o(SharedPreferences sharedPreferences, String str, Object obj) {
        return C8592oo0O00O0.OooO00o(sharedPreferences, str, obj);
    }

    public static String OooO00o(Context context) {
        return (String) OooO00o(OooO00o(context, "global_v2"), "app_ver", (Object) "");
    }

    public static String OooO00o(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences == null) {
            return null;
        }
        String str2 = (String) OooO00o(sharedPreferences, str, (Object) "");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(str);
        edit.apply();
        return str2;
    }

    public static Map<String, String> OooO00o(SharedPreferences sharedPreferences) {
        Set<String> OooO00o = m20192OooO00o(sharedPreferences);
        HashMap hashMap = new HashMap(OooO00o.size());
        OooO00o(sharedPreferences, OooO00o, hashMap);
        return hashMap;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Set<String> m20192OooO00o(SharedPreferences sharedPreferences) {
        return sharedPreferences.getAll().keySet();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20193OooO00o(Context context, String str) {
        m20194OooO00o(OooO00o(context, "global_v2"), "app_ver", (Object) str);
    }

    public static void OooO00o(Context context, String str, String str2) {
        File filesDir = context.getFilesDir();
        File file = new File(filesDir, str + C8592oo0O00O0.m20237OooO00o(context, str2) + C5982OoooOoO.OooO);
        if (file.exists() && file.delete()) {
            AbstractC8536oo00OO0O.OooO0OO("SharedPreferenceUtil", "delete sp file");
        }
    }

    public static void OooO00o(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor edit = OooO00o(context, str2).edit();
        edit.putString(str3, str);
        edit.commit();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20194OooO00o(SharedPreferences sharedPreferences, String str, Object obj) {
        C8592oo0O00O0.m20238OooO00o(sharedPreferences, str, obj);
    }

    public static void OooO00o(SharedPreferences sharedPreferences, Set<String> set, Map<String, String> map) {
        for (String str : set) {
            map.put(str, (String) OooO00o(sharedPreferences, str, (Object) ""));
        }
    }

    public static void OooO00o(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            AbstractC8536oo00OO0O.OooO0OO("SharedPreferenceUtil", "clearTypeDataByTag() eventTag is null or empty!");
            return;
        }
        if (!"_default_config_tag".equals(str)) {
            String str2 = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + "oper";
            String str3 = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + "maint";
            str = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + "diffprivacy";
            OooO00o(str2, false, context);
            OooO00o(str3, false, context);
        }
        OooO00o(str, false, context);
    }

    @SuppressLint({"ApplySharedPref"})
    public static synchronized void OooO00o(String str, boolean z, Context context) {
        synchronized (AbstractC8521oo00O00.class) {
            AbstractC8536oo00OO0O.OooO0O0("SharedPreferenceUtil", "clear data file : eventTag : " + str);
            SharedPreferences OooO00o = OooO00o(context, "stat_v2_1");
            if (OooO00o != null) {
                SharedPreferences.Editor edit = OooO00o.edit();
                if (z) {
                    edit.clear();
                } else {
                    edit.remove(str);
                }
                edit.commit();
            }
            SharedPreferences OooO00o2 = OooO00o(context, "cached_v2_1");
            if (OooO00o2 != null) {
                SharedPreferences.Editor edit2 = OooO00o2.edit();
                if (z) {
                    edit2.clear();
                } else {
                    edit2.remove(str);
                }
                edit2.commit();
            }
        }
    }

    public static void OooO00o(Set<String> set, Set<String> set2, Context context) {
        for (String str : set2) {
            if (!set.contains(str)) {
                OooO00o(str, false, context);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20195OooO00o(Context context) {
        long longValue = ((Long) OooO00o(OooO00o(context, "analytics_key"), "flashKeyTime", (Object) -1L)).longValue();
        if (longValue == -1) {
            longValue = ((Long) OooO00o(OooO00o(context, "Privacy_MY"), "flashKeyTime", (Object) -1L)).longValue();
        }
        return System.currentTimeMillis() - longValue > 43200000;
    }

    public static boolean OooO00o(Context context, String str, int i) {
        long length = m20191OooO00o(context, str).length();
        if (length <= ((long) i)) {
            return false;
        }
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "reach local file limited size - file len: %d limitedSize: %d", Long.valueOf(length), Integer.valueOf(i));
        return true;
    }

    public static boolean OooO00o(SharedPreferences sharedPreferences, int i, String str) {
        return ((String) OooO00o(sharedPreferences, str, "")).length() > i;
    }

    public static void OooO0O0(Context context, String str) {
        SharedPreferences OooO00o = OooO00o(context, "backup_event");
        if (OooO00o != null && OooO00o.contains(str)) {
            AbstractC8536oo00OO0O.OooO0O0("SharedPreferenceUtil", "begin clear backup data! spKey:" + str);
            SharedPreferences.Editor edit = OooO00o.edit();
            edit.remove(str);
            edit.commit();
        }
    }
}
