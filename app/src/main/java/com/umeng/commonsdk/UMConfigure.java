package com.umeng.commonsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.views.text.FontMetricsUtil;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3523a;
import com.umeng.commonsdk.internal.C3524b;
import com.umeng.commonsdk.internal.C3525c;
import com.umeng.commonsdk.proguard.C3606f;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.stateless.C3640a;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.C3656a;
import com.umeng.commonsdk.statistics.C3657b;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.C3681i;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.PushAgent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UMConfigure {
    public static final int DEVICE_TYPE_BOX = 2;
    public static final int DEVICE_TYPE_PHONE = 1;
    public static final String KEY_FILE_NAME_APPKEY = "APPKEY";
    public static final String KEY_FILE_NAME_LOG = "LOG";
    public static final String KEY_METHOD_NAME_PUSH_SETCHANNEL = "setMessageChannel";
    public static final String KEY_METHOD_NAME_PUSH_SET_SECRET = "setSecret";
    public static final String KEY_METHOD_NAME_SETAPPKEY = "setAppkey";
    public static final String KEY_METHOD_NAME_SETCHANNEL = "setChannel";
    public static final String KEY_METHOD_NAME_SETDEBUGMODE = "setDebugMode";
    public static final String TAG = "UMConfigure";
    public static final String WRAPER_TYPE_COCOS2DX_X = "Cocos2d-x";
    public static final String WRAPER_TYPE_COCOS2DX_XLUA = "Cocos2d-x_lua";
    public static final String WRAPER_TYPE_FLUTTER = "flutter";
    public static final String WRAPER_TYPE_HYBRID = "hybrid";
    public static final String WRAPER_TYPE_NATIVE = "native";
    public static final String WRAPER_TYPE_PHONEGAP = "phonegap";
    public static final String WRAPER_TYPE_REACTNATIVE = "react-native";
    public static final String WRAPER_TYPE_UNITY = "Unity";
    public static final String WRAPER_TYPE_WEEX = "weex";
    public static boolean debugLog;
    public static boolean isFinish = false;
    public static boolean isInit = false;
    public static Object lockObject = new Object();
    public static boolean sShouldCollectZData = false;
    public static UMLog umDebugLog = new UMLog();

    public static Class<?> getClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Object getDecInstanceObject(Class<?> cls) {
        Constructor<?> constructor;
        if (cls == null) {
            return null;
        }
        try {
            constructor = cls.getDeclaredConstructor(new Class[0]);
        } catch (NoSuchMethodException unused) {
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        constructor.setAccessible(true);
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused2) {
            return null;
        }
    }

    public static Method getDecMethod(Class<?> cls, String str, Class<?>[] clsArr) {
        Method method = null;
        if (cls != null) {
            try {
                method = cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
            if (method != null) {
                method.setAccessible(true);
            }
        }
        return method;
    }

    public static boolean getInitStatus() {
        boolean z;
        synchronized (lockObject) {
            z = isFinish;
        }
        return z;
    }

    private Object getInstanceObject(Class<?> cls) {
        if (cls != null) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return null;
    }

    public static String[] getTestDeviceInfo(Context context) {
        String[] strArr = new String[2];
        if (context != null) {
            try {
                strArr[0] = DeviceConfig.getDeviceIdForGeneral(context);
                strArr[1] = DeviceConfig.getMac(context);
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    public static String getUMIDString(Context context) {
        if (context != null) {
            return UMUtils.getUMId(context.getApplicationContext());
        }
        return null;
    }

    public static String getUmengToken(Context context) {
        if (context != null) {
            return UMUtils.getUmengToken(context.getApplicationContext());
        }
        return null;
    }

    public static void init(Context context, int i, String str) {
        init(context, null, null, i, str);
    }

    public static void initOaid(final Context context) {
        new Thread(new Runnable() {
            /* class com.umeng.commonsdk.UMConfigure.RunnableC34863 */

            public void run() {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(C3681i.f9649a, 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    String a = C3606f.m9485a(context);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(a) && sharedPreferences != null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString(C3681i.f9651c, (currentTimeMillis2 - currentTimeMillis) + "");
                        edit.commit();
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                        edit2.putString(C3681i.f9650b, a);
                        edit2.commit();
                    }
                    UMConfigureImpl.removeInterruptFlag();
                } catch (Exception unused) {
                }
            }
        }).start();
    }

    public static void invoke(Method method, Object obj, Object[] objArr) {
        if (method != null && obj != null) {
            try {
                method.invoke(obj, objArr);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public static boolean isDebugLog() {
        return debugLog;
    }

    public static void readZData(Context context) {
        UMWorkDispatch.sendEvent(context, C3523a.f9037n, C3524b.m9071a(context).mo38849a(), null);
    }

    public static void saveSDKComponent() {
        StringBuffer stringBuffer = new StringBuffer();
        if (getClass("com.umeng.analytics.vismode.V") != null) {
            stringBuffer.append(DispatchConstants.VERSION);
        } else if (getClass("com.umeng.analytics.MobclickAgent") != null) {
            stringBuffer.append("a");
        }
        if (getClass("com.umeng.visual.UMVisualAgent") != null) {
            stringBuffer.append(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT);
        }
        if (getClass(PushAgent.TAG) != null) {
            stringBuffer.append(C3617o.f9365as);
        }
        if (getClass("com.umeng.socialize.UMShareAPI") != null) {
            stringBuffer.append(C3617o.f9366at);
        }
        if (getClass("com.umeng.error.UMError") != null) {
            stringBuffer.append("e");
        }
        if (getClass(C3525c.f9056j) != null) {
            stringBuffer.append("z");
        }
        stringBuffer.append(C3617o.f9367au);
        if (!(SdkVersion.SDK_TYPE == 1 || getClass("com.umeng.commonsdk.internal.UMOplus") == null)) {
            stringBuffer.append("o");
        }
        if (!TextUtils.isEmpty(stringBuffer)) {
            C3657b.f9559a = stringBuffer.toString();
            UMSLEnvelopeBuild.module = stringBuffer.toString();
        }
    }

    public static void setCheckDevice(boolean z) {
        AnalyticsConstants.CHECK_DEVICE = z;
    }

    public static void setEncryptEnabled(boolean z) {
        C3657b.m9780a(z);
        UMSLEnvelopeBuild.setEncryptEnabled(z);
    }

    public static void setFile(Class<?> cls, String str, String str2) {
        if (cls != null) {
            try {
                cls.getField(str).set(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    public static void setLatencyWindow(long j) {
        C3656a.f9557c = ((int) j) * 1000;
    }

    public static void setLogEnabled(boolean z) {
        try {
            debugLog = z;
            MLog.DEBUG = z;
            Class<?> cls = getClass(PushAgent.TAG);
            invoke(getDecMethod(cls, KEY_METHOD_NAME_SETDEBUGMODE, new Class[]{Boolean.TYPE}), getDecInstanceObject(cls), new Object[]{Boolean.valueOf(z)});
            setFile(getClass("com.umeng.socialize.Config"), "DEBUG", z);
        } catch (Exception e) {
            if (debugLog) {
                String str = "set log enabled e is " + e;
            }
        } catch (Throwable th) {
            if (debugLog) {
                String str2 = "set log enabled e is " + th;
            }
        }
    }

    public static void setProcessEvent(boolean z) {
        AnalyticsConstants.SUB_PROCESS_EVENT = z;
    }

    public static void setWraperType(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(WRAPER_TYPE_NATIVE)) {
                C3640a.f9472a = WRAPER_TYPE_NATIVE;
                C3656a.f9555a = WRAPER_TYPE_NATIVE;
            } else if (str.equals(WRAPER_TYPE_COCOS2DX_X)) {
                C3640a.f9472a = WRAPER_TYPE_COCOS2DX_X;
                C3656a.f9555a = WRAPER_TYPE_COCOS2DX_X;
            } else if (str.equals(WRAPER_TYPE_COCOS2DX_XLUA)) {
                C3640a.f9472a = WRAPER_TYPE_COCOS2DX_XLUA;
                C3656a.f9555a = WRAPER_TYPE_COCOS2DX_XLUA;
            } else if (str.equals(WRAPER_TYPE_UNITY)) {
                C3640a.f9472a = WRAPER_TYPE_UNITY;
                C3656a.f9555a = WRAPER_TYPE_UNITY;
            } else if (str.equals(WRAPER_TYPE_REACTNATIVE)) {
                C3640a.f9472a = WRAPER_TYPE_REACTNATIVE;
                C3656a.f9555a = WRAPER_TYPE_REACTNATIVE;
            } else if (str.equals(WRAPER_TYPE_PHONEGAP)) {
                C3640a.f9472a = WRAPER_TYPE_PHONEGAP;
                C3656a.f9555a = WRAPER_TYPE_PHONEGAP;
            } else if (str.equals(WRAPER_TYPE_WEEX)) {
                C3640a.f9472a = WRAPER_TYPE_WEEX;
                C3656a.f9555a = WRAPER_TYPE_WEEX;
            } else if (str.equals(WRAPER_TYPE_HYBRID)) {
                C3640a.f9472a = WRAPER_TYPE_HYBRID;
                C3656a.f9555a = WRAPER_TYPE_HYBRID;
            } else if (str.equals(WRAPER_TYPE_FLUTTER)) {
                C3640a.f9472a = WRAPER_TYPE_FLUTTER;
                C3656a.f9555a = WRAPER_TYPE_FLUTTER;
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            C3640a.f9473b = str2;
            C3656a.f9556b = str2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0372, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0375, code lost:
        if (com.umeng.commonsdk.UMConfigure.debugLog != false) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0377, code lost:
        r0 = "init e is " + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0388, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x038b, code lost:
        if (com.umeng.commonsdk.UMConfigure.debugLog != false) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x038d, code lost:
        r0 = "init e is " + r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0372 A[ExcHandler: all (r10v3 'th' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void init(android.content.Context r10, java.lang.String r11, java.lang.String r12, int r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 932
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.UMConfigure.init(android.content.Context, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    public static void invoke(Method method, Object[] objArr) {
        if (method != null) {
            try {
                method.invoke(null, objArr);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public static void setFile(Class<?> cls, String str, boolean z) {
        if (cls != null) {
            try {
                cls.getField(str).set(str, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }
}
