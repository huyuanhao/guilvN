package com.taobao.accs.utl;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import com.p118pd.sdk.C6996o000OOo0;
import com.p254ta.utdid2.device.UTDevice;
import com.taobao.accs.AbstractC3122e;
import com.taobao.accs.IProcessName;
import com.taobao.accs.client.C3103a;
import com.umeng.message.entity.UMessage;
import java.io.File;
import java.lang.reflect.Method;

/* renamed from: com.taobao.accs.utl.j */
public class C3178j {

    /* renamed from: a */
    public static String f7225a = "";

    /* renamed from: b */
    public static String f7226b = null;

    /* renamed from: c */
    public static AbstractC3122e f7227c = null;
    public static final String channelService = "com.taobao.accs.ChannelService";

    /* renamed from: d */
    public static String f7228d = "";

    /* renamed from: e */
    public static String f7229e = "";

    /* renamed from: f */
    public static boolean f7230f = true;

    /* renamed from: g */
    public static boolean f7231g = false;
    public static final String msgService = "com.taobao.accs.data.MsgDistributeService";

    /* renamed from: a */
    public static boolean m7661a(Context context) {
        String str;
        if (f7231g) {
            return f7230f;
        }
        try {
            if (TextUtils.isEmpty(C3103a.f6874d)) {
                if (TextUtils.isEmpty(f7228d)) {
                    f7228d = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.processName;
                }
                str = f7228d;
            } else {
                str = C3103a.f6874d;
            }
            if (TextUtils.isEmpty(f7229e)) {
                f7229e = m7659a(context, Process.myPid());
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(f7229e)) {
                f7230f = str.equalsIgnoreCase(f7229e);
                f7231g = true;
            }
        } catch (Throwable th) {
            ALog.m7598e("AdapterUtilityImpl", "isMainProcess", th, new Object[0]);
        }
        return f7230f;
    }

    /* renamed from: b */
    public static String m7663b(Context context) {
        AbstractC3122e eVar = f7227c;
        if (eVar == null) {
            return UTDevice.getUtdid(context);
        }
        return eVar.mo37616a();
    }

    /* renamed from: c */
    public static boolean m7664c(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = C3103a.m7295a(context).mo37526b().getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    public static String m7665d(Context context) {
        boolean z = true;
        if (C3194w.m7715a(context)) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
                Method declaredMethod = notificationManager.getClass().getDeclaredMethod("getService", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(notificationManager, new Object[0]);
                Method declaredMethod2 = invoke.getClass().getDeclaredMethod("areNotificationsEnabledForPackage", String.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return String.valueOf(declaredMethod2.invoke(invoke, packageName, Integer.valueOf(i)));
            } catch (Throwable th) {
                ALog.m7598e("AdapterUtilityImpl", "Android O isNotificationEnabled", th, new Object[0]);
                return "unknown";
            }
        } else {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                String packageName2 = context.getApplicationContext().getPackageName();
                int i2 = applicationInfo2.uid;
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                if (((Integer) cls.getMethod(C6996o000OOo0.f19223OooO0O0, Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField(C6996o000OOo0.f19224OooO0OO).get(appOpsManager)).intValue()), Integer.valueOf(i2), packageName2)).intValue() != 0) {
                    z = false;
                }
                return String.valueOf(z);
            } catch (Throwable th2) {
                ALog.m7598e("AdapterUtilityImpl", "isNotificationEnabled", th2, new Object[0]);
                return "unknown";
            }
        }
    }

    /* renamed from: a */
    public static String m7659a(Context context, int i) {
        IProcessName iProcessName = C3103a.f6876f;
        if (iProcessName != null) {
            return iProcessName.getCurrProcessName();
        }
        String str = "";
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : C3103a.m7295a(context).mo37525a().getRunningAppProcesses()) {
            try {
                if (runningAppProcessInfo.pid == i) {
                    str = runningAppProcessInfo.processName;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    /* renamed from: a */
    public static long m7658a() {
        try {
            File dataDirectory = Environment.getDataDirectory();
            if (dataDirectory == null) {
                return -1;
            }
            if (Build.VERSION.SDK_INT >= 9) {
                return dataDirectory.getUsableSpace();
            }
            if (!dataDirectory.exists()) {
                return -1;
            }
            StatFs statFs = new StatFs(dataDirectory.getPath());
            return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (Throwable th) {
            ALog.m7598e("AdapterUtilityImpl", "getUsableSpace", th, new Object[0]);
            return -1;
        }
    }

    /* renamed from: a */
    public static String m7660a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null && stackTrace.length > 0) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append("\n");
                }
            }
        } catch (Exception unused) {
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final boolean m7662a(String str, int i) {
        if (str == null) {
            return false;
        }
        StatFs statFs = new StatFs(str);
        int blockSize = statFs.getBlockSize();
        long availableBlocks = (long) statFs.getAvailableBlocks();
        StringBuilder sb = new StringBuilder();
        sb.append("st.getAvailableBlocks()=");
        sb.append(statFs.getAvailableBlocks());
        sb.append(",st.getAvailableBlocks() * blockSize=");
        long j = (long) blockSize;
        sb.append(((long) statFs.getAvailableBlocks()) * j);
        sb.toString();
        if (statFs.getAvailableBlocks() <= 10 || availableBlocks * j <= ((long) i)) {
            return false;
        }
        return true;
    }
}
