package com.tencent.bugly.proguard;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C7491o0OoOOO;
import com.p118pd.sdk.LL1i;
import com.p118pd.sdk.oOO0OO0O;
import com.tencent.bugly.crashreport.common.info.AppInfo;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.umeng.message.proguard.C3848l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.tencent.bugly.proguard.ap */
public class C3325ap {

    /* renamed from: a */
    public static Map<String, String> f8073a;

    /* renamed from: b */
    public static boolean f8074b;

    /* renamed from: a */
    public static String m8391a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.getBuffer().toString();
        } catch (Throwable th2) {
            if (C3321an.m8350a(th2)) {
                return "fail";
            }
            th2.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: b */
    public static byte[] m8425b(byte[] bArr, int i, String str) {
        if (bArr == null || i == -1) {
            return bArr;
        }
        try {
            AbstractC3333ax a = C3332aw.m8448a(i);
            if (a == null) {
                return null;
            }
            a.mo38407a(str);
            return a.mo38408a(bArr);
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            C3321an.m8356d("encrytype %d %s", Integer.valueOf(i), str);
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m8430c(long j) {
        try {
            return ("" + j).getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static Parcel m8431d(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        return obtain;
    }

    /* renamed from: c */
    public static long m8426c(byte[] bArr) {
        if (bArr == null) {
            return -1;
        }
        try {
            return Long.parseLong(new String(bArr, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: c */
    public static boolean m8428c(Context context, String str) {
        C3321an.m8355c("[Util] Try to unlock file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            File file = new File(context.getFilesDir() + File.separator + str);
            if (!file.exists()) {
                return true;
            }
            if (!file.delete()) {
                return false;
            }
            C3321an.m8355c("[Util] Successfully unlocked file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return true;
        } catch (Throwable th) {
            C3321an.m8350a(th);
            return false;
        }
    }

    /* renamed from: a */
    public static String m8386a() {
        return m8387a(System.currentTimeMillis());
    }

    /* renamed from: a */
    public static String m8387a(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(j));
        } catch (Exception unused) {
            return new Date().toString();
        }
    }

    /* renamed from: b */
    public static byte[] m8423b(byte[] bArr, int i) {
        if (bArr == null || i == -1) {
            return bArr;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(bArr.length);
        objArr[1] = i == 2 ? "Gzip" : "zip";
        C3321an.m8355c("[Util] Unzip %d bytes data with type %s", objArr);
        try {
            AbstractC3327ar a = C3326aq.m8433a(i);
            if (a == null) {
                return null;
            }
            return a.mo38406b(bArr);
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m8392a(Date date) {
        if (date == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(date);
        } catch (Exception unused) {
            return new Date().toString();
        }
    }

    /* renamed from: b */
    public static byte[] m8424b(byte[] bArr, int i, int i2, String str) {
        try {
            return m8423b(m8425b(bArr, i2, str), i);
        } catch (Exception e) {
            if (C3321an.m8350a(e)) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m8411a(byte[] bArr, int i, String str) {
        if (bArr == null || i == -1) {
            return bArr;
        }
        C3321an.m8355c("rqdp{  enD:} %d %d", Integer.valueOf(bArr.length), Integer.valueOf(i));
        try {
            AbstractC3333ax a = C3332aw.m8448a(i);
            if (a == null) {
                return null;
            }
            a.mo38407a(str);
            return a.mo38409b(bArr);
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m8429c(String str) {
        if (m8404a(str)) {
            return false;
        }
        if (str.length() > 255) {
            C3321an.m8349a("URL(%s)'s length is larger than 255.", str);
            return false;
        } else if (str.toLowerCase().startsWith("http")) {
            return true;
        } else {
            C3321an.m8349a("URL(%s) is not start with \"http\".", str);
            return false;
        }
    }

    /* renamed from: b */
    public static long m8412b() {
        try {
            return (((System.currentTimeMillis() + ((long) TimeZone.getDefault().getRawOffset())) / 86400000) * 86400000) - ((long) TimeZone.getDefault().getRawOffset());
        } catch (Throwable th) {
            if (C3321an.m8350a(th)) {
                return -1;
            }
            th.printStackTrace();
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061 A[Catch:{ all -> 0x009a }, LOOP:0: B:26:0x0061->B:28:0x0067, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[Catch:{ all -> 0x009a }, LOOP:1: B:29:0x006b->B:31:0x0071, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0084 A[SYNTHETIC, Splitter:B:34:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a8 A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ad A[SYNTHETIC, Splitter:B:54:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b7 A[SYNTHETIC, Splitter:B:59:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0075 A[EDGE_INSN: B:80:0x0075->B:32:0x0075 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m8408a(java.io.File r7, java.lang.String r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3325ap.m8408a(java.io.File, java.lang.String, java.lang.String):byte[]");
    }

    /* renamed from: c */
    public static String m8427c(String str, String str2) {
        return (C3269a.m7966b() == null || C3269a.m7966b().f7633N == null) ? "" : C3269a.m7966b().f7633N.getString(str, str2);
    }

    /* renamed from: b */
    public static String m8415b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "NULL";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(LL1i.OooO0O0);
            instance.update(bArr);
            return m8393a(instance.digest());
        } catch (Throwable th) {
            if (C3321an.m8350a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static String m8413b(Context context, String str) {
        if (str == null || str.trim().equals("")) {
            return "";
        }
        if (f8073a == null) {
            f8073a = new HashMap();
            ArrayList<String> a = m8395a(context, "getprop");
            if (a != null && a.size() > 0) {
                C3321an.m8351b(C3325ap.class, "Successfully get 'getprop' list.", new Object[0]);
                Pattern compile = Pattern.compile("\\[(.+)\\]: \\[(.*)\\]");
                for (String str2 : a) {
                    Matcher matcher = compile.matcher(str2);
                    if (matcher.find()) {
                        f8073a.put(matcher.group(1), matcher.group(2));
                    }
                }
                C3321an.m8351b(C3325ap.class, "System properties number: %d.", Integer.valueOf(f8073a.size()));
            }
        }
        return f8073a.containsKey(str) ? f8073a.get(str) : "fail";
    }

    /* renamed from: b */
    public static void m8417b(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m8419b(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.isFile() && file.exists() && file.canWrite()) {
                file.delete();
            }
        }
    }

    /* renamed from: b */
    public static String m8414b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: b */
    public static void m8418b(Parcel parcel, Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            parcel.writeBundle(null);
            return;
        }
        int size = map.size();
        ArrayList<String> arrayList = new ArrayList<>(size);
        ArrayList<String> arrayList2 = new ArrayList<>(size);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(oOO0OO0O.OooO0oo, arrayList);
        bundle.putStringArrayList("values", arrayList2);
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    public static byte[] m8409a(byte[] bArr, int i) {
        if (bArr == null || i == -1) {
            return bArr;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(bArr.length);
        objArr[1] = i == 2 ? "Gzip" : "zip";
        C3321an.m8355c("[Util] Zip %d bytes data with type %s", objArr);
        try {
            AbstractC3327ar a = C3326aq.m8433a(i);
            if (a == null) {
                return null;
            }
            return a.mo38405a(bArr);
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m8410a(byte[] bArr, int i, int i2, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return m8411a(m8409a(bArr, i), i2, str);
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: b */
    public static Map<String, String> m8416b(Parcel parcel) {
        Bundle readBundle = parcel.readBundle();
        HashMap hashMap = null;
        if (readBundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = readBundle.getStringArrayList(oOO0OO0O.OooO0oo);
        ArrayList<String> stringArrayList2 = readBundle.getStringArrayList("values");
        if (stringArrayList == null || stringArrayList2 == null || stringArrayList.size() != stringArrayList2.size()) {
            C3321an.m8357e("map parcel error!", new Object[0]);
        } else {
            hashMap = new HashMap(stringArrayList.size());
            for (int i = 0; i < stringArrayList.size(); i++) {
                hashMap.put(stringArrayList.get(i), stringArrayList2.get(i));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m8393a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString().toUpperCase();
    }

    /* renamed from: b */
    public static boolean m8421b(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 14) {
                return C3269a.m7966b().mo38149a();
            }
            String packageName = context.getPackageName();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
            if (activityManager != null) {
                List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                return runningTasks != null && !runningTasks.isEmpty() && runningTasks.get(0).topActivity.getPackageName().equals(packageName);
            }
            return true;
        } catch (SecurityException unused) {
            C3321an.m8357e("无法获取GET_TASK权限，将在通知栏提醒升级，如需弹窗提醒，请在AndroidManifest.xml中添加GET_TASKS权限：\n<uses-permission android:name=\"android.permission.GET_TASKS\" />\n", new Object[0]);
        } catch (Exception e) {
            if (!C3321an.m8353b(e)) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004a A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f A[SYNTHETIC, Splitter:B:29:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006d A[SYNTHETIC, Splitter:B:44:0x006d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m8390a(java.io.File r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3325ap.m8390a(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static byte[] m8422b(int i, byte[] bArr, byte[] bArr2) {
        Key key;
        try {
            KeyFactory instance = KeyFactory.getInstance(C7491o0OoOOO.OooO00o);
            if (i == 1) {
                key = instance.generatePublic(new X509EncodedKeySpec(bArr2));
            } else {
                key = instance.generatePrivate(new PKCS8EncodedKeySpec(bArr2));
            }
            Cipher instance2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance2.init(i, key);
            return instance2.doFinal(bArr);
        } catch (Exception e) {
            if (C3321an.m8353b(e)) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static void m8420b(String str, String str2) {
        if (C3269a.m7966b() != null && C3269a.m7966b().f7633N != null) {
            C3269a.m7966b().f7633N.edit().putString(str, str2).apply();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c1 A[Catch:{ all -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c6 A[SYNTHETIC, Splitter:B:64:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d0 A[SYNTHETIC, Splitter:B:69:0x00d0] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m8402a(java.io.File r7, java.io.File r8, int r9) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3325ap.m8402a(java.io.File, java.io.File, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b2 A[SYNTHETIC, Splitter:B:40:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bc A[SYNTHETIC, Splitter:B:45:0x00bc] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<java.lang.String> m8395a(android.content.Context r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3325ap.m8395a(android.content.Context, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (0 != 0) goto L_0x0056;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8398a(android.content.Context r6, java.lang.String r7, java.lang.String r8, int r9) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3325ap.m8398a(android.content.Context, java.lang.String, java.lang.String, int):void");
    }

    /* renamed from: a */
    public static boolean m8404a(String str) {
        return str == null || str.trim().length() <= 0;
    }

    /* renamed from: a */
    public static Context m8380a(Context context) {
        Context applicationContext;
        return (context == null || (applicationContext = context.getApplicationContext()) == null) ? context : applicationContext;
    }

    /* renamed from: a */
    public static void m8400a(Class<?> cls, String str, Object obj, Object obj2) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj2, obj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static Object m8384a(String str, String str2, Object obj, Class<?>[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m8399a(Parcel parcel, Map<String, PlugInBean> map) {
        if (map == null || map.size() <= 0) {
            parcel.writeBundle(null);
            return;
        }
        int size = map.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        for (Map.Entry<String, PlugInBean> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        Bundle bundle = new Bundle();
        bundle.putInt("pluginNum", arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            bundle.putString("pluginKey" + i, (String) arrayList.get(i));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            bundle.putString("pluginVal" + i2 + "plugInId", ((PlugInBean) arrayList2.get(i2)).f7616a);
            bundle.putString("pluginVal" + i2 + "plugInUUID", ((PlugInBean) arrayList2.get(i2)).f7618c);
            bundle.putString("pluginVal" + i2 + "plugInVersion", ((PlugInBean) arrayList2.get(i2)).f7617b);
        }
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    public static Map<String, PlugInBean> m8397a(Parcel parcel) {
        Bundle readBundle = parcel.readBundle();
        HashMap hashMap = null;
        if (readBundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int intValue = ((Integer) readBundle.get("pluginNum")).intValue();
        for (int i = 0; i < intValue; i++) {
            arrayList.add(readBundle.getString("pluginKey" + i));
        }
        for (int i2 = 0; i2 < intValue; i2++) {
            String string = readBundle.getString("pluginVal" + i2 + "plugInId");
            String string2 = readBundle.getString("pluginVal" + i2 + "plugInUUID");
            arrayList2.add(new PlugInBean(string, readBundle.getString("pluginVal" + i2 + "plugInVersion"), string2));
        }
        if (arrayList.size() == arrayList2.size()) {
            hashMap = new HashMap(arrayList.size());
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                hashMap.put(arrayList.get(i3), PlugInBean.class.cast(arrayList2.get(i3)));
            }
        } else {
            C3321an.m8357e("map plugin parcel error!", new Object[0]);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static byte[] m8407a(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: a */
    public static <T> T m8385a(byte[] bArr, Parcelable.Creator<T> creator) {
        Parcel d = m8431d(bArr);
        try {
            T createFromParcel = creator.createFromParcel(d);
            if (d != null) {
                d.recycle();
            }
            return createFromParcel;
        } catch (Throwable th) {
            if (d != null) {
                d.recycle();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static String m8388a(Context context, int i, String str) {
        String[] strArr;
        Process process = null;
        if (!AppInfo.m7954a(context, "android.permission.READ_LOGS")) {
            C3321an.m8356d("no read_log permission!", new Object[0]);
            return null;
        }
        if (str == null) {
            strArr = new String[]{"logcat", "-d", "-v", "threadtime"};
        } else {
            strArr = new String[]{"logcat", "-d", "-v", "threadtime", "-s", str};
        }
        StringBuilder sb = new StringBuilder();
        try {
            Process exec = Runtime.getRuntime().exec(strArr);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
                if (i > 0 && sb.length() > i) {
                    sb.delete(0, sb.length() - i);
                }
            }
            String sb2 = sb.toString();
            if (exec != null) {
                try {
                    exec.getOutputStream().close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    exec.getInputStream().close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                try {
                    exec.getErrorStream().close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            return sb2;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    process.getOutputStream().close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                try {
                    process.getInputStream().close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                try {
                    process.getErrorStream().close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m8396a(int i, boolean z) {
        HashMap hashMap = new HashMap(12);
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null) {
            return null;
        }
        Thread thread = Looper.getMainLooper().getThread();
        if (!allStackTraces.containsKey(thread)) {
            allStackTraces.put(thread, thread.getStackTrace());
        }
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            if (!z || id != entry.getKey().getId()) {
                int i2 = 0;
                sb.setLength(0);
                if (!(entry.getValue() == null || entry.getValue().length == 0)) {
                    StackTraceElement[] value = entry.getValue();
                    int length = value.length;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        StackTraceElement stackTraceElement = value[i2];
                        if (i > 0 && sb.length() >= i) {
                            sb.append("\n[Stack over limit size :" + i + " , has been cut!]");
                            break;
                        }
                        sb.append(stackTraceElement.toString());
                        sb.append("\n");
                        i2++;
                    }
                    hashMap.put(entry.getKey().getName() + C3848l.f10401s + entry.getKey().getId() + C3848l.f10402t, sb.toString());
                }
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized byte[] m8405a(int r7) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3325ap.m8405a(int):byte[]");
    }

    @TargetApi(19)
    /* renamed from: a */
    public static byte[] m8406a(int i, byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            if (Build.VERSION.SDK_INT >= 21) {
                if (!f8074b) {
                    try {
                        instance.init(i, secretKeySpec, new GCMParameterSpec(instance.getBlockSize() * 8, bArr2));
                        return instance.doFinal(bArr);
                    } catch (InvalidAlgorithmParameterException e) {
                        f8074b = true;
                        throw e;
                    }
                }
            }
            instance.init(i, secretKeySpec, new IvParameterSpec(bArr2));
            return instance.doFinal(bArr);
        } catch (Exception e2) {
            if (C3321an.m8353b(e2)) {
                return null;
            }
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m8401a(Context context, String str, long j) {
        C3321an.m8355c("[Util] Try to lock file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            File file = new File(context.getFilesDir() + File.separator + str);
            if (file.exists()) {
                if (System.currentTimeMillis() - file.lastModified() < j) {
                    return false;
                }
                C3321an.m8355c("[Util] Lock file (%s) is expired, unlock it.", str);
                m8428c(context, str);
            }
            if (file.createNewFile()) {
                C3321an.m8355c("[Util] Successfully locked file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                return true;
            }
            C3321an.m8355c("[Util] Failed to locked file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return false;
        } catch (Throwable th) {
            C3321an.m8350a(th);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067 A[SYNTHETIC, Splitter:B:30:0x0067] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m8389a(java.io.File r5, int r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3325ap.m8389a(java.io.File, int, boolean):java.lang.String");
    }

    /* renamed from: a */
    public static BufferedReader m8382a(File file) {
        if (file != null && file.exists() && file.canRead()) {
            try {
                return new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            } catch (Throwable th) {
                C3321an.m8350a(th);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static BufferedReader m8383a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            File file = new File(str, str2);
            if (file.exists()) {
                if (file.canRead()) {
                    return m8382a(file);
                }
            }
            return null;
        } catch (NullPointerException e) {
            C3321an.m8350a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static Thread m8394a(Runnable runnable, String str) {
        try {
            Thread thread = new Thread(runnable);
            thread.setName(str);
            thread.start();
            return thread;
        } catch (Throwable th) {
            C3321an.m8357e("[Util] Failed to start a thread to execute task with message: %s", th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m8403a(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        C3319am a = C3319am.m8340a();
        if (a != null) {
            return a.mo38398a(runnable);
        }
        String[] split = runnable.getClass().getName().split("\\.");
        return m8394a(runnable, split[split.length - 1]) != null;
    }

    /* renamed from: a */
    public static SharedPreferences m8381a(String str, Context context) {
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }
}
