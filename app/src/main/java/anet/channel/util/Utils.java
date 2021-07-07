package anet.channel.util;

import android.content.Context;
import android.content.pm.PackageManager;
import anet.channel.monitor.C0147b;
import anet.channel.monitor.NetworkSpeed;
import anet.channel.status.NetworkStatusHelper;
import com.p254ta.utdid2.device.UTDevice;
import java.lang.reflect.Method;

public class Utils {
    public static final String TAG = "awcn.Utils";
    public static Context context;

    public static Context getAppContext() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        synchronized (Utils.class) {
            if (context != null) {
                return context;
            }
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
                context = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e) {
                ALog.m291w(TAG, "getAppContext", null, e, new Object[0]);
            }
            return context;
        }
    }

    public static String getDeviceId(Context context2) {
        return UTDevice.getUtdid(context2);
    }

    public static String getMainProcessName(Context context2) {
        if (context2 == null) {
            return "";
        }
        try {
            return context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).applicationInfo.processName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static float getNetworkTimeFactor() {
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        float f = (status == NetworkStatusHelper.NetworkStatus.G4 || status == NetworkStatusHelper.NetworkStatus.WIFI) ? 0.8f : 1.0f;
        return C0147b.m101a().mo3511b() == NetworkSpeed.Fast.getCode() ? f * 0.75f : f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getProcessName(android.content.Context r5, int r6) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.Utils.getProcessName(android.content.Context, int):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd A[SYNTHETIC, Splitter:B:37:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c5 A[Catch:{ IOException -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d4 A[SYNTHETIC, Splitter:B:46:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dc A[Catch:{ IOException -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getProcessNameNew(int r10) {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.Utils.getProcessNameNew(int):java.lang.String");
    }

    public static String getStackMsg(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null && stackTrace.length > 0) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString() + "\n");
                }
            }
        } catch (Exception e) {
            ALog.m288e(TAG, "getStackMsg", null, e, new Object[0]);
        }
        return stringBuffer.toString();
    }

    public static Object invokeStaticMethodThrowException(String str, String str2, Class<?>[] clsArr, Object... objArr) throws Exception {
        Method method;
        if (str == null || str2 == null) {
            return null;
        }
        Class<?> cls = Class.forName(str);
        if (clsArr != null) {
            method = cls.getDeclaredMethod(str2, clsArr);
        } else {
            method = cls.getDeclaredMethod(str2, new Class[0]);
        }
        if (method == null) {
            return null;
        }
        method.setAccessible(true);
        if (objArr != null) {
            return method.invoke(cls, objArr);
        }
        return method.invoke(cls, new Object[0]);
    }
}
