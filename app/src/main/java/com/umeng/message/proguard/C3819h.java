package com.umeng.message.proguard;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C8932ooOOO0o;
import com.taobao.accs.utl.C3178j;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.PushAgent;
import com.umeng.message.UmengMessageBootReceiver;
import com.umeng.message.entity.Ucode;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.StreamCorruptedException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.intent.IntentUtil;

/* renamed from: com.umeng.message.proguard.h */
public class C3819h {

    /* renamed from: a */
    public static final String f10346a = System.getProperty("line.separator");

    /* renamed from: b */
    public static final String f10347b = C3819h.class.getName();

    /* renamed from: c */
    public static final AtomicInteger f10348c = new AtomicInteger(1);

    /* renamed from: a */
    public static String m10542a(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes();
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bytes);
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < digest.length; i++) {
                stringBuffer.append(String.format("%02X", Byte.valueOf(digest[i])));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return str.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
        }
    }

    /* renamed from: b */
    public static String m10553b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(Integer.toHexString(b & 255));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10347b, 2, "getMD5 error");
            return "";
        }
    }

    /* renamed from: c */
    public static String m10560c(String str) {
        try {
            long longValue = Long.valueOf(str).longValue();
            if (longValue < 1024) {
                return ((int) longValue) + "B";
            } else if (longValue < 1048576) {
                DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                StringBuilder sb = new StringBuilder();
                double d = (double) ((float) longValue);
                Double.isNaN(d);
                sb.append(decimalFormat.format(d / 1024.0d));
                sb.append("K");
                return sb.toString();
            } else if (longValue < 1073741824) {
                DecimalFormat decimalFormat2 = new DecimalFormat("#0.00");
                StringBuilder sb2 = new StringBuilder();
                double d2 = (double) ((float) longValue);
                Double.isNaN(d2);
                sb2.append(decimalFormat2.format(d2 / 1048576.0d));
                sb2.append("M");
                return sb2.toString();
            } else {
                DecimalFormat decimalFormat3 = new DecimalFormat("#0.00");
                StringBuilder sb3 = new StringBuilder();
                double d3 = (double) ((float) longValue);
                Double.isNaN(d3);
                sb3.append(decimalFormat3.format(d3 / 1.073741824E9d));
                sb3.append("G");
                return sb3.toString();
            }
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    /* renamed from: e */
    public static boolean m10567e(String str) {
        if (m10566d(str)) {
            return false;
        }
        String lowerCase = str.trim().toLowerCase(Locale.US);
        if (lowerCase.startsWith("http://") || lowerCase.startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static Object m10568f(String str) {
        try {
            try {
                return new ObjectInputStream(new ByteArrayInputStream(C3815d.m10507h(str.getBytes()))).readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        } catch (StreamCorruptedException e2) {
            e2.printStackTrace();
            return null;
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public static List<Ucode> m10569g(String str) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(URLDecoder.decode(str, "UTF-8").getBytes("ISO-8859-1"));
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        List<Ucode> list = (List) objectInputStream.readObject();
        objectInputStream.close();
        byteArrayInputStream.close();
        return list;
    }

    /* renamed from: d */
    public static boolean m10566d(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: d */
    public static boolean m10565d(Context context) {
        String a = m10538a(context, Process.myPid());
        if (a != null) {
            return a.equals(context.getPackageName());
        }
        return false;
    }

    /* renamed from: d */
    public static String m10564d(Context context, String str) {
        String str2 = context.getCacheDir() + "/umeng_push_inapp/";
        if (str == null) {
            return str2;
        }
        return str2 + str + C8932ooOOO0o.OooO0OO;
    }

    /* renamed from: c */
    public static boolean m10561c(Context context) {
        return context.getPackageManager().checkPermission(MsgConstant.PERMISSION_GET_TASKS, context.getPackageName()) == 0;
    }

    /* renamed from: b */
    public static boolean m10558b(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static String m10540a(File file) {
        byte[] bArr = new byte[1024];
        try {
            if (!file.isFile()) {
                return "";
            }
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return String.format("%1$032x", new BigInteger(1, instance.digest()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m10562c(Context context, String str) {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningServices(Integer.MAX_VALUE);
        if (runningServices == null || runningServices.isEmpty()) {
            return false;
        }
        for (int i = 0; i < runningServices.size(); i++) {
            if (runningServices.get(i).service.getClassName().equals(str) && TextUtils.equals(runningServices.get(i).service.getPackageName(), context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m10556b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m10557b(Context context) {
        String packageName = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningTasks(1).get(0).topActivity.getPackageName();
        if (packageName == null || !packageName.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final void m10555b(Context context, Class<?> cls) {
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (cls != null) {
                    ComponentName componentName = new ComponentName(context, cls);
                    if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                        UMLog uMLog = UMConfigure.umDebugLog;
                        String str = f10347b;
                        UMLog.mutlInfo(str, 2, "rebootReceiver[" + componentName.toString() + "]--->[ENABLED]");
                        packageManager.setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public static int m10559c() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i = f10348c.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f10348c.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: a */
    public static String m10539a(Context context, long j) {
        if (j < 1000) {
            return ((int) j) + "B";
        } else if (j < 1000000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) ((float) j);
            Double.isNaN(d);
            sb.append(Math.round(d / 1000.0d));
            sb.append("K");
            return sb.toString();
        } else if (j < 1000000000) {
            DecimalFormat decimalFormat = new DecimalFormat("#0.0");
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) ((float) j);
            Double.isNaN(d2);
            sb2.append(decimalFormat.format(d2 / 1000000.0d));
            sb2.append("M");
            return sb2.toString();
        } else {
            DecimalFormat decimalFormat2 = new DecimalFormat("#0.00");
            StringBuilder sb3 = new StringBuilder();
            double d3 = (double) ((float) j);
            Double.isNaN(d3);
            sb3.append(decimalFormat2.format(d3 / 1.0E9d));
            sb3.append("G");
            return sb3.toString();
        }
    }

    /* renamed from: b */
    public static String m10551b() {
        return UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002d A[SYNTHETIC, Splitter:B:18:0x002d] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m10552b(java.io.File r3) throws java.io.IOException {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x002a }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x002a }
            r2.<init>(r3)     // Catch:{ all -> 0x002a }
            r1.<init>(r2)     // Catch:{ all -> 0x002a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r3.<init>()     // Catch:{ all -> 0x0027 }
        L_0x0010:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x001a
            r3.append(r0)     // Catch:{ all -> 0x0027 }
            goto L_0x0010
        L_0x001a:
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0027 }
            r1.close()     // Catch:{ IOException -> 0x0022 }
            goto L_0x0026
        L_0x0022:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0026:
            return r3
        L_0x0027:
            r3 = move-exception
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r3 = move-exception
        L_0x002b:
            if (r0 == 0) goto L_0x0035
            r0.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0035:
            goto L_0x0037
        L_0x0036:
            throw r3
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3819h.m10552b(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static void m10546a(Context context, String str) {
        context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
    }

    /* renamed from: a */
    public static String m10537a() {
        return m10543a(new Date());
    }

    /* renamed from: a */
    public static String m10543a(Date date) {
        if (date == null) {
            return "";
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

    /* renamed from: a */
    public static boolean m10548a(Context context) {
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m10554b(final Context context, final Handler handler) {
        MessageSharedPrefs.getInstance(context).setRegisterTimes(MessageSharedPrefs.getInstance(context).getRegisterTimes() + 1);
        if (m10565d(context)) {
            handler.postDelayed(new Runnable() {
                /* class com.umeng.message.proguard.C3819h.RunnableC382817 */

                public void run() {
                    if (MessageSharedPrefs.getInstance(context).getRegisterTimes() <= 1) {
                        UMLog uMLog = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(C3819h.f10347b, 0, "mPushAgent.register方法应该在主进程和channel进程中都被调用!");
                        UMLog uMLog2 = UMConfigure.umDebugLog;
                        UMLog.m9005aq(C3847k.f10377b, 0, "\\|");
                        for (int i = 0; i < 3; i++) {
                            handler.postDelayed(new Runnable() {
                                /* class com.umeng.message.proguard.C3819h.RunnableC382817.RunnableC38291 */

                                public void run() {
                                    Toast.makeText(context, "mPushAgent.register方法应该在主进程和channel进程中都被调用!", 1).show();
                                }
                            }, (long) (i * 3500));
                        }
                    }
                }
            }, 20000);
        }
    }

    /* renamed from: a */
    public static byte[] m10550a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    public static void m10547a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m10538a(Context context, int i) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == i) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    /* renamed from: a */
    public static void m10545a(Context context, Class<?> cls) {
        ComponentName componentName;
        int componentEnabledSetting;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && packageManager.getApplicationEnabledSetting(context.getPackageName()) > -1 && (componentEnabledSetting = packageManager.getComponentEnabledSetting((componentName = new ComponentName(context, cls)))) != 1) {
                if (componentEnabledSetting != 0) {
                    packageManager.setComponentEnabledSetting(componentName, 1, 1);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static String m10541a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
            return new String(C3815d.m10502c(byteArrayOutputStream.toByteArray()));
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m10549a(final Context context, Handler handler) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        if (!PushAgent.getInstance(context).isPushCheck()) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(PushAgent.getInstance(context).getMessageAppkey())) {
                handler.post(new Runnable() {
                    /* class com.umeng.message.proguard.C3819h.RunnableC38201 */

                    public void run() {
                        Toast.makeText(context, "Please set umeng appkey!", 1).show();
                    }
                });
                return false;
            } else if (TextUtils.isEmpty(PushAgent.getInstance(context).getMessageSecret())) {
                handler.post(new Runnable() {
                    /* class com.umeng.message.proguard.C3819h.RunnableC382312 */

                    public void run() {
                        Toast.makeText(context, "Please set umeng appsecret!", 1).show();
                    }
                });
                return false;
            } else {
                Intent intent = new Intent();
                intent.setPackage(context.getPackageName());
                intent.setAction("com.taobao.accs.intent.action.SERVICE");
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentServices(intent, 64).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    ResolveInfo next = it.next();
                    if (next.serviceInfo.name.equals(C3178j.channelService)) {
                        String str = next.serviceInfo.processName;
                        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, context.getPackageName()) && next.serviceInfo.exported) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC383018 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct ChannelService in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent2 = new Intent();
                intent2.setPackage(context.getPackageName());
                intent2.setAction("com.taobao.accs.intent.action.ELECTION");
                Iterator<ResolveInfo> it2 = context.getPackageManager().queryIntentServices(intent2, 64).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    }
                    ResolveInfo next2 = it2.next();
                    if (next2.serviceInfo.name.equals(C3178j.channelService)) {
                        String str2 = next2.serviceInfo.processName;
                        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2, context.getPackageName()) && next2.serviceInfo.exported) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (!z2) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC383119 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct ChannelService in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent3 = new Intent();
                intent3.setPackage(context.getPackageName());
                intent3.setAction(com.taobao.accs.common.Constants.ACTION_RECEIVE);
                Iterator<ResolveInfo> it3 = context.getPackageManager().queryIntentServices(intent3, 64).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z3 = false;
                        break;
                    }
                    ResolveInfo next3 = it3.next();
                    if (next3.serviceInfo.name.equals(C3178j.msgService) && next3.serviceInfo.exported) {
                        z3 = true;
                        break;
                    }
                }
                if (!z3) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC383320 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct MsgDistributeService in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent4 = new Intent();
                intent4.setPackage(context.getPackageName());
                intent4.setAction(UmengMessageBootReceiver.f9982c);
                Iterator<ResolveInfo> it4 = context.getPackageManager().queryBroadcastReceivers(intent4, 64).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z4 = false;
                        break;
                    }
                    ResolveInfo next4 = it4.next();
                    if (next4.activityInfo.name.equals("com.taobao.accs.EventReceiver")) {
                        String str3 = next4.activityInfo.processName;
                        if (!TextUtils.isEmpty(str3) && !TextUtils.equals(str3, context.getPackageName())) {
                            z4 = true;
                            break;
                        }
                    }
                }
                if (!z4) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC383421 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct EventReceiver in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent5 = new Intent();
                intent5.setPackage(context.getPackageName());
                intent5.setAction("android.net.conn.CONNECTIVITY_CHANGE");
                Iterator<ResolveInfo> it5 = context.getPackageManager().queryBroadcastReceivers(intent5, 64).iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        z5 = false;
                        break;
                    }
                    ResolveInfo next5 = it5.next();
                    if (next5.activityInfo.name.equals("com.taobao.accs.EventReceiver")) {
                        String str4 = next5.activityInfo.processName;
                        if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, context.getPackageName())) {
                            z5 = true;
                            break;
                        }
                    }
                }
                if (!z5) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC383522 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct EventReceiver in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent6 = new Intent();
                intent6.setPackage(context.getPackageName());
                intent6.setAction("android.intent.action.PACKAGE_REMOVED");
                intent6.setData(Uri.parse("package:"));
                Iterator<ResolveInfo> it6 = context.getPackageManager().queryBroadcastReceivers(intent6, 64).iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        z6 = false;
                        break;
                    }
                    ResolveInfo next6 = it6.next();
                    if (next6.activityInfo.name.equals("com.taobao.accs.EventReceiver")) {
                        String str5 = next6.activityInfo.processName;
                        if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, context.getPackageName())) {
                            z6 = true;
                            break;
                        }
                    }
                }
                if (!z6) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC383623 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct EventReceiver in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent7 = new Intent();
                intent7.setPackage(context.getPackageName());
                intent7.setAction("android.intent.action.USER_PRESENT");
                Iterator<ResolveInfo> it7 = context.getPackageManager().queryBroadcastReceivers(intent7, 64).iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        z7 = false;
                        break;
                    }
                    ResolveInfo next7 = it7.next();
                    if (next7.activityInfo.name.equals("com.taobao.accs.EventReceiver")) {
                        String str6 = next7.activityInfo.processName;
                        if (!TextUtils.isEmpty(str6) && !TextUtils.equals(str6, context.getPackageName())) {
                            z7 = true;
                            break;
                        }
                    }
                }
                if (!z7) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC383724 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct EventReceiver in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent8 = new Intent();
                intent8.setPackage(context.getPackageName());
                intent8.setAction(com.taobao.accs.common.Constants.ACTION_COMMAND);
                Iterator<ResolveInfo> it8 = context.getPackageManager().queryBroadcastReceivers(intent8, 64).iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        z8 = false;
                        break;
                    }
                    ResolveInfo next8 = it8.next();
                    if (next8.activityInfo.name.equals("com.taobao.accs.ServiceReceiver")) {
                        String str7 = next8.activityInfo.processName;
                        if (!TextUtils.isEmpty(str7) && !TextUtils.equals(str7, context.getPackageName())) {
                            z8 = true;
                            break;
                        }
                    }
                }
                if (!z8) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC38322 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct ServiceReceiver in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent9 = new Intent();
                intent9.setPackage(context.getPackageName());
                intent9.setAction(com.taobao.accs.common.Constants.ACTION_START_FROM_AGOO);
                Iterator<ResolveInfo> it9 = context.getPackageManager().queryBroadcastReceivers(intent9, 64).iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        z9 = false;
                        break;
                    }
                    ResolveInfo next9 = it9.next();
                    if (next9.activityInfo.name.equals("com.taobao.accs.ServiceReceiver")) {
                        String str8 = next9.activityInfo.processName;
                        if (!TextUtils.isEmpty(str8) && !TextUtils.equals(str8, context.getPackageName())) {
                            z9 = true;
                            break;
                        }
                    }
                }
                if (!z9) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC38383 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct ServiceReceiver in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent10 = new Intent();
                intent10.setPackage(context.getPackageName());
                intent10.setAction(com.taobao.accs.common.Constants.ACTION_RECEIVE);
                Iterator<ResolveInfo> it10 = context.getPackageManager().queryIntentServices(intent10, 64).iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        z10 = false;
                        break;
                    }
                    ResolveInfo next10 = it10.next();
                    if (next10.serviceInfo.name.equals("org.android.agoo.accs.AgooService") && next10.serviceInfo.exported) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC38394 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct AgooService in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent11 = new Intent();
                intent11.setPackage(context.getPackageName());
                intent11.setAction(AgooConstants.INTENT_FROM_AGOO_MESSAGE);
                Iterator<ResolveInfo> it11 = context.getPackageManager().queryIntentServices(intent11, 64).iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        z11 = false;
                        break;
                    }
                    ResolveInfo next11 = it11.next();
                    if (next11.serviceInfo.name.equals("com.umeng.message.UmengIntentService") && next11.serviceInfo.exported) {
                        z11 = true;
                        break;
                    }
                }
                if (!z11) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC38405 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct UmengIntentService in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent12 = new Intent();
                intent12.setPackage(context.getPackageName());
                intent12.setAction(context.getPackageName() + IntentUtil.INTENT_FROM_AGOO_COMMAND);
                Iterator<ResolveInfo> it12 = context.getPackageManager().queryBroadcastReceivers(intent12, 64).iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        z12 = false;
                        break;
                    }
                    ResolveInfo next12 = it12.next();
                    if (next12.activityInfo.name.equals("com.taobao.agoo.AgooCommondReceiver") && next12.activityInfo.exported) {
                        z12 = true;
                        break;
                    }
                }
                if (!z12) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC38416 */

                        public void run() {
                            Toast.makeText(context, "Please replace '${applicationId}.intent.action.COMMAND' with application's applicationId for AgooCommondReceiver in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent13 = new Intent();
                intent13.setPackage(context.getPackageName());
                intent13.setAction("android.intent.action.PACKAGE_REMOVED");
                intent13.setData(Uri.parse("package:"));
                Iterator<ResolveInfo> it13 = context.getPackageManager().queryBroadcastReceivers(intent13, 64).iterator();
                while (true) {
                    if (!it13.hasNext()) {
                        z13 = false;
                        break;
                    }
                    ResolveInfo next13 = it13.next();
                    if (next13.activityInfo.name.equals("com.taobao.agoo.AgooCommondReceiver") && next13.activityInfo.exported) {
                        z13 = true;
                        break;
                    }
                }
                if (!z13) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC38427 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct AgooCommondReceiver in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent14 = new Intent();
                intent14.setClassName(context.getPackageName(), "com.umeng.message.NotificationProxyBroadcastReceiver");
                Iterator<ResolveInfo> it14 = context.getPackageManager().queryBroadcastReceivers(intent14, 65536).iterator();
                while (true) {
                    if (!it14.hasNext()) {
                        z14 = false;
                        break;
                    }
                    ResolveInfo next14 = it14.next();
                    if (next14.activityInfo.name.equals("com.umeng.message.NotificationProxyBroadcastReceiver") && TextUtils.equals(next14.activityInfo.processName, context.getPackageName()) && !next14.activityInfo.exported) {
                        z14 = true;
                        break;
                    }
                }
                if (!z14) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC38438 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct NotificationProxyBroadcastReceiver in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent15 = new Intent();
                intent15.setPackage(context.getPackageName());
                intent15.setAction(MsgConstant.MESSAGE_REGISTER_CALLBACK_ACTION);
                Iterator<ResolveInfo> it15 = context.getPackageManager().queryIntentServices(intent15, 64).iterator();
                while (true) {
                    if (!it15.hasNext()) {
                        z15 = false;
                        break;
                    }
                    ResolveInfo next15 = it15.next();
                    if (next15.serviceInfo.name.equals("com.umeng.message.UmengMessageCallbackHandlerService") && TextUtils.equals(context.getPackageName(), next15.serviceInfo.processName) && !next15.serviceInfo.exported) {
                        z15 = true;
                        break;
                    }
                }
                if (!z15) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC38449 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct UmengMessageCallbackHandlerService in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent16 = new Intent();
                intent16.setPackage(context.getPackageName());
                intent16.setAction(MsgConstant.MESSAGE_ENABLE_CALLBACK_ACTION);
                Iterator<ResolveInfo> it16 = context.getPackageManager().queryIntentServices(intent16, 64).iterator();
                while (true) {
                    if (!it16.hasNext()) {
                        z16 = false;
                        break;
                    }
                    ResolveInfo next16 = it16.next();
                    if (next16.serviceInfo.name.equals("com.umeng.message.UmengMessageCallbackHandlerService") && !next16.serviceInfo.exported) {
                        z16 = true;
                        break;
                    }
                }
                if (!z16) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC382110 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct UmengMessageCallbackHandlerService in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent17 = new Intent();
                intent17.setPackage(context.getPackageName());
                intent17.setAction(MsgConstant.MESSAGE_DISABLE_CALLBACK_ACTION);
                Iterator<ResolveInfo> it17 = context.getPackageManager().queryIntentServices(intent17, 64).iterator();
                while (true) {
                    if (!it17.hasNext()) {
                        z17 = false;
                        break;
                    }
                    ResolveInfo next17 = it17.next();
                    if (next17.serviceInfo.name.equals("com.umeng.message.UmengMessageCallbackHandlerService") && !next17.serviceInfo.exported) {
                        z17 = true;
                        break;
                    }
                }
                if (!z17) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC382211 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct UmengMessageCallbackHandlerService in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent18 = new Intent();
                intent18.setPackage(context.getPackageName());
                intent18.setAction(MsgConstant.MESSAGE_MESSAGE_HANDLER_ACTION);
                Iterator<ResolveInfo> it18 = context.getPackageManager().queryIntentServices(intent18, 64).iterator();
                while (true) {
                    if (!it18.hasNext()) {
                        z18 = false;
                        break;
                    }
                    ResolveInfo next18 = it18.next();
                    if (next18.serviceInfo.name.equals("com.umeng.message.UmengMessageCallbackHandlerService") && !next18.serviceInfo.exported) {
                        z18 = true;
                        break;
                    }
                }
                if (!z18) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC382413 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct UmengMessageCallbackHandlerService in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent19 = new Intent();
                intent19.setClassName(context.getPackageName(), "com.umeng.message.UmengDownloadResourceService");
                Iterator<ResolveInfo> it19 = context.getPackageManager().queryIntentServices(intent19, 65536).iterator();
                while (true) {
                    if (it19.hasNext()) {
                        if (it19.next().serviceInfo.name.equals("com.umeng.message.UmengDownloadResourceService")) {
                            z19 = true;
                            break;
                        }
                    } else {
                        z19 = false;
                        break;
                    }
                }
                if (!z19) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC382514 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct UmengDownloadResourceService in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                Intent intent20 = new Intent();
                intent20.setPackage(context.getPackageName());
                intent20.setAction(AgooConstants.BINDER_MSGRECEIVER_ACTION);
                Iterator<ResolveInfo> it20 = context.getPackageManager().queryIntentServices(intent20, 64).iterator();
                while (true) {
                    if (!it20.hasNext()) {
                        z20 = false;
                        break;
                    }
                    ResolveInfo next19 = it20.next();
                    if (next19.serviceInfo.name.equals("com.umeng.message.UmengMessageIntentReceiverService") && next19.serviceInfo.exported) {
                        String str9 = next19.serviceInfo.processName;
                        if (!TextUtils.isEmpty(str9) && !TextUtils.equals(str9, context.getPackageName())) {
                            z20 = true;
                            break;
                        }
                    }
                }
                if (!z20) {
                    handler.post(new Runnable() {
                        /* class com.umeng.message.proguard.C3819h.RunnableC382615 */

                        public void run() {
                            Toast.makeText(context, "Please add or correct UmengMessageIntentReceiverService in AndroidManifest!", 1).show();
                        }
                    });
                    return false;
                }
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    z32 = false;
                    z31 = false;
                    z30 = false;
                    z29 = false;
                    z28 = false;
                    z27 = false;
                    z26 = false;
                    z25 = false;
                    z24 = false;
                    z23 = false;
                    z22 = false;
                    z21 = false;
                    for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                        if (MsgConstant.PERMISSION_INTERNET.equals(packageInfo.requestedPermissions[i])) {
                            z32 = true;
                        } else if (MsgConstant.PERMISSION_ACCESS_WIFI_STATE.equals(packageInfo.requestedPermissions[i])) {
                            z30 = true;
                        } else if ("android.permission.ACCESS_NETWORK_STATE".equals(packageInfo.requestedPermissions[i])) {
                            z31 = true;
                        } else if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(packageInfo.requestedPermissions[i])) {
                            z29 = true;
                        } else if (MsgConstant.PERMISSION_WAKE_LOCK.equals(packageInfo.requestedPermissions[i])) {
                            z28 = true;
                        } else if (MsgConstant.PERMISSION_READ_PHONE_STATE.equals(packageInfo.requestedPermissions[i])) {
                            z27 = true;
                        } else if (MsgConstant.PERMISSION_BROADCAST_PACKAGE_ADDED.equals(packageInfo.requestedPermissions[i])) {
                            z26 = true;
                        } else if (MsgConstant.PERMISSION_BROADCAST_PACKAGE_CHANGED.equals(packageInfo.requestedPermissions[i])) {
                            z25 = true;
                        } else if (MsgConstant.PERMISSION_BROADCAST_PACKAGE_INSTALL.equals(packageInfo.requestedPermissions[i])) {
                            z24 = true;
                        } else if (MsgConstant.PERMISSION_BROADCAST_PACKAGE_REPLACED.equals(packageInfo.requestedPermissions[i])) {
                            z23 = true;
                        } else if (MsgConstant.PERMISSION_GET_TASKS.equals(packageInfo.requestedPermissions[i])) {
                            z22 = true;
                        } else if (MsgConstant.PERMISSION_RECEIVE_BOOT_COMPLETED.equals(packageInfo.requestedPermissions[i])) {
                            z21 = true;
                        }
                    }
                } else {
                    z32 = false;
                    z31 = false;
                    z30 = false;
                    z29 = false;
                    z28 = false;
                    z27 = false;
                    z26 = false;
                    z25 = false;
                    z24 = false;
                    z23 = false;
                    z22 = false;
                    z21 = false;
                }
                if (z32 && z30 && z31 && z29 && z28 && z27 && z26 && z25 && z24 && z23 && z22 && z21) {
                    return true;
                }
                handler.post(new Runnable() {
                    /* class com.umeng.message.proguard.C3819h.RunnableC382716 */

                    public void run() {
                        Toast.makeText(context, "Please add required permission in AndroidManifest!", 1).show();
                    }
                });
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: a */
    public static String m10544a(List<Ucode> list) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        String encode = URLEncoder.encode(byteArrayOutputStream.toString("ISO-8859-1"), "UTF-8");
        objectOutputStream.close();
        byteArrayOutputStream.close();
        return encode;
    }
}
