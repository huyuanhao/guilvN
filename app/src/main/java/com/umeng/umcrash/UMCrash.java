package com.umeng.umcrash;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.p118pd.sdk.AbstractC9118oooO00o;
import com.p118pd.sdk.C9114oooO00O;
import com.p118pd.sdk.C9268ooooOo;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class UMCrash {
    public static final String KEY_CALLBACK_PAGE_ACTION = "um_action_log";
    public static final String KEY_CALLBACK_UMID = "um_umid";
    public static final String KEY_HEADER_APPKEY = "um_app_key";
    public static final String KEY_HEADER_CHANNEL = "um_app_channel";
    public static final String KEY_HEADER_CRASH_VERSION = "um_crash_sdk_version";
    public static final String KEY_HEADER_OS = "um_os";
    public static final String TAG = "UMCrash";
    public static String crashSdkVersion = "v0.0.4";
    public static boolean isDebug = true;
    public static boolean isEncrypt = false;
    public static boolean isZip = true;
    public static ArrayList<String> mArrayList = new ArrayList<>(10);
    public static Context mContext;
    public static Object pageArrayLock = new Object();

    public static class CrashClientImpl implements AbstractC9118oooO00o {
        public CrashClientImpl() {
        }

        @Override // com.p118pd.sdk.AbstractC9118oooO00o
        public void onAddCrashStats(String str, int i, int i2) {
        }

        @Override // com.p118pd.sdk.AbstractC9118oooO00o
        public File onBeforeUploadLog(File file) {
            return file;
        }

        @Override // com.p118pd.sdk.AbstractC9118oooO00o
        public void onClientProcessLogGenerated(String str, File file, String str2) {
        }

        @Override // com.p118pd.sdk.AbstractC9118oooO00o
        public void onCrashRestarting(boolean z) {
        }

        @Override // com.p118pd.sdk.AbstractC9118oooO00o
        public String onGetCallbackInfo(String str, boolean z) {
            String str2 = null;
            if (UMCrash.KEY_CALLBACK_PAGE_ACTION.equals(str)) {
                try {
                    synchronized (UMCrash.pageArrayLock) {
                        if (UMCrash.mArrayList != null && UMCrash.mArrayList.size() > 0) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("source", 0);
                            jSONObject.put("action_name", "page_view");
                            JSONArray jSONArray = new JSONArray();
                            for (int i = 0; i < UMCrash.mArrayList.size(); i++) {
                                String str3 = (String) UMCrash.mArrayList.get(i);
                                if (str3 != null) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("name", str3);
                                    jSONArray.put(jSONObject2);
                                }
                            }
                            jSONObject.put("action_parameter", jSONArray);
                            str2 = jSONObject.toString();
                            if (UMCrash.isDebug) {
                                String str4 = UMCrash.TAG;
                                Log.i(str4, "page json is " + str2);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
                return str2;
            } else if (UMCrash.KEY_CALLBACK_UMID.equals(str)) {
                return UMCrash.getUMID(UMCrash.mContext);
            } else {
                return null;
            }
        }

        @Override // com.p118pd.sdk.AbstractC9118oooO00o
        public void onLogGenerated(File file, String str) {
        }
    }

    public static void generateCustomLog(Throwable th, String str) {
        if (th != null && !TextUtils.isEmpty(str)) {
            try {
                C9114oooO00O build = new UMCustomLogInfoBuilder(str).stack(th).build();
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(KEY_CALLBACK_UMID);
                arrayList.add(KEY_CALLBACK_PAGE_ACTION);
                build.OooO0O0 = arrayList;
                C9268ooooOo OooO00o = C9268ooooOo.OooO00o();
                if (OooO00o != null) {
                    OooO00o.OooO00o(build);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        r2 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String getUMID(android.content.Context r8) {
        /*
            java.lang.Class<com.umeng.umcrash.UMCrash> r0 = com.umeng.umcrash.UMCrash.class
            monitor-enter(r0)
            r1 = 0
            if (r8 != 0) goto L_0x0008
            monitor-exit(r0)
            return r1
        L_0x0008:
            java.lang.String r2 = "com.umeng.commonsdk.UMConfigure"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0011, all -> 0x000f }
            goto L_0x0012
        L_0x000f:
            r8 = move-exception
            goto L_0x0036
        L_0x0011:
            r2 = r1
        L_0x0012:
            if (r2 == 0) goto L_0x0038
            r3 = 0
            r4 = 1
            java.lang.String r5 = "getUMIDString"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0023, all -> 0x000f }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch:{ NoSuchMethodException -> 0x0023, all -> 0x000f }
            java.lang.reflect.Method r2 = r2.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0023, all -> 0x000f }
            goto L_0x0024
        L_0x0023:
            r2 = r1
        L_0x0024:
            if (r2 == 0) goto L_0x0038
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0038, all -> 0x000f }
            r4[r3] = r8     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0038, all -> 0x000f }
            java.lang.Object r8 = r2.invoke(r1, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0038, all -> 0x000f }
            if (r8 == 0) goto L_0x0038
            java.lang.String r8 = r8.toString()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0038, all -> 0x000f }
            r1 = r8
            goto L_0x0038
        L_0x0036:
            monitor-exit(r0)
            throw r8
        L_0x0038:
            monitor-exit(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umcrash.UMCrash.getUMID(android.content.Context):java.lang.String");
    }

    public static void init(Context context, String str, String str2) {
        if (context != null && str != null) {
            mContext = context;
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("mDebug", isDebug);
                bundle.putBoolean("mEncryptLog", isEncrypt);
                bundle.putBoolean("mZipLog", isZip);
                C9268ooooOo OooO00o = C9268ooooOo.OooO00o(context, str, isDebug, bundle, new CrashClientImpl());
                if (OooO00o != null) {
                    OooO00o.m21156OooO00o(KEY_HEADER_APPKEY, str);
                    OooO00o.m21156OooO00o(KEY_HEADER_CHANNEL, str2);
                    OooO00o.m21156OooO00o(KEY_HEADER_OS, "android");
                    OooO00o.m21156OooO00o(KEY_HEADER_CRASH_VERSION, crashSdkVersion);
                    if (context instanceof Application) {
                        ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                            /* class com.umeng.umcrash.UMCrash.C40251 */

                            public void onActivityCreated(Activity activity, Bundle bundle) {
                            }

                            public void onActivityDestroyed(Activity activity) {
                            }

                            public void onActivityPaused(Activity activity) {
                            }

                            public void onActivityResumed(Activity activity) {
                                synchronized (UMCrash.pageArrayLock) {
                                    if (UMCrash.mArrayList != null) {
                                        if (UMCrash.mArrayList.size() >= 10) {
                                            UMCrash.mArrayList.remove(0);
                                        }
                                        ArrayList arrayList = UMCrash.mArrayList;
                                        arrayList.add(activity.getLocalClassName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + System.currentTimeMillis());
                                    }
                                }
                            }

                            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                            }

                            public void onActivityStarted(Activity activity) {
                            }

                            public void onActivityStopped(Activity activity) {
                            }
                        });
                        OooO00o.OooO00o(KEY_CALLBACK_UMID, 1048593);
                        OooO00o.OooO00o(KEY_CALLBACK_PAGE_ACTION, 1048593);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void setDebug(boolean z) {
        isDebug = z;
    }

    public static void generateCustomLog(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                C9114oooO00O oooo00o = new C9114oooO00O(null, "exception");
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(KEY_CALLBACK_UMID);
                arrayList.add(KEY_CALLBACK_PAGE_ACTION);
                oooo00o.OooO0O0 = arrayList;
                HashMap hashMap = new HashMap(20);
                hashMap.put(UMCustomLogInfoBuilder.LOG_KEY_CT, "exception");
                hashMap.put(UMCustomLogInfoBuilder.LOG_KEY_AC, str2);
                StringBuffer stringBuffer = new StringBuffer();
                for (Map.Entry entry : hashMap.entrySet()) {
                    stringBuffer.append((String) entry.getKey());
                    stringBuffer.append(Constants.COLON_SEPARATOR);
                    stringBuffer.append((String) entry.getValue());
                    stringBuffer.append("\n");
                }
                String str3 = "Exception message:\nBack traces starts.\n" + str + "\n" + "Back traces ends.";
                if (!TextUtils.isEmpty(str3)) {
                    stringBuffer.append(str3);
                    stringBuffer.append("\n");
                }
                oooo00o.f22522OooO00o = stringBuffer;
                C9268ooooOo OooO00o = C9268ooooOo.OooO00o();
                if (OooO00o != null) {
                    OooO00o.OooO00o(oooo00o);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
