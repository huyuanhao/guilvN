package com.p118pd.sdk;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.pd.sdk.oo0oOo00  reason: case insensitive filesystem */
public class C8742oo0oOo00 {
    public static final String OooO00o = "PackageUtils";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final X500Principal f21908OooO00o = new X500Principal("CN=Android Debug,O=Android,C=US");

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f21909OooO00o = true;

    /* renamed from: com.pd.sdk.oo0oOo00$OooO00o */
    public static class OooO00o implements FileFilter {
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public C8742oo0oOo00() {
        throw new Error("Do not need instantiate!");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20365OooO00o(Context context, String str) {
        ApplicationInfo applicationInfo;
        Object obj = null;
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || applicationInfo.metaData == null)) {
                obj = applicationInfo.metaData.get(str);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.getMessage();
        }
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    public static int OooO0O0(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static String OooO0OO(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static synchronized String OooO0Oo(Context context) {
        String str;
        synchronized (C8742oo0oOo00.class) {
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return str;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m20374OooO0O0(Context context, String str) {
        boolean z = false;
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningServices(Integer.MAX_VALUE)) {
            if (str.equals(runningServiceInfo.service.getClassName())) {
                z = true;
            }
        }
        return z;
    }

    public static boolean OooO0OO(Context context, String str) {
        Intent intent;
        try {
            intent = new Intent(context, Class.forName(str));
        } catch (Exception e) {
            e.printStackTrace();
            intent = null;
        }
        if (intent != null) {
            return context.stopService(intent);
        }
        return false;
    }

    public static File OooO00o(Context context, String str) {
        File file;
        if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            file = context.getExternalCacheDir();
        } else {
            file = context.getCacheDir();
        }
        if (TextUtils.isEmpty(str)) {
            return file;
        }
        return new File(file, File.separator + str);
    }

    public static String OooO0O0(Context context, String str) {
        try {
            return OooO00o(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int OooO0O0() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m20361OooO00o() {
        return Runtime.getRuntime().maxMemory() / 1024;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m20372OooO0O0() {
        return "Dalvik".equals(m20363OooO00o());
    }

    public static void OooO00o(Context context, File file, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(CommonNetImpl.FLAG_AUTH);
        if (Build.VERSION.SDK_INT < 24) {
            Uri.fromFile(file).toString();
            intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        } else {
            intent.addFlags(1);
            intent.setDataAndType(FileProvider.getUriForFile(context, str, file), "application/vnd.android.package-archive");
        }
        context.startActivity(intent);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m20373OooO0O0(Context context) {
        Signature[] signatureArr;
        boolean z = false;
        try {
            boolean z2 = false;
            for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                try {
                    z2 = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getSubjectX500Principal().equals(f21908OooO00o);
                    if (z2) {
                        return z2;
                    }
                } catch (PackageManager.NameNotFoundException | CertificateException unused) {
                    z = z2;
                    return z;
                }
            }
            return z2;
        } catch (PackageManager.NameNotFoundException | CertificateException unused2) {
            return z;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static synchronized String m20371OooO0O0(Context context) {
        String str;
        synchronized (C8742oo0oOo00.class) {
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20367OooO00o(Context context, String str) {
        Intent intent = new Intent("android.intent.action.DELETE");
        intent.setData(Uri.parse("package:" + str));
        context.startActivity(intent);
    }

    public static int OooO00o() {
        try {
            return new File(C7748o0oooOOo.OooO0OO).listFiles(new OooO00o()).length;
        } catch (Exception unused) {
            return 1;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20370OooO00o(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
            if (activityManager.getRunningAppProcesses() == null) {
                return true;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid && str.equalsIgnoreCase(runningAppProcessInfo.processName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20369OooO00o(Context context) {
        ComponentName componentName;
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningTasks(1);
        if (runningTasks == null || runningTasks.isEmpty() || (componentName = runningTasks.get(0).topActivity) == null || componentName.getPackageName().equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    public static String OooO00o(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr2 = new char[32];
            int i = 0;
            int i2 = 0;
            while (i < 16) {
                byte b = digest[i];
                cArr2[i2] = cArr[(b >>> 4) & 15];
                int i3 = i2 + 1;
                cArr2[i3] = cArr[b & 15];
                i++;
                i2 = i3 + 1;
            }
            return new String(cArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static int OooO00o(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.availMem / 1048576);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static List<PackageInfo> m20366OooO00o(Context context) {
        ArrayList arrayList = new ArrayList();
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        for (int i = 0; i < installedPackages.size(); i++) {
            PackageInfo packageInfo = installedPackages.get(i);
            if ((packageInfo.applicationInfo.flags & 1) <= 0) {
                arrayList.add(packageInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20368OooO00o() {
        String OooO00o2 = m20363OooO00o();
        return "ART".equals(OooO00o2) || "ART debug build".equals(OooO00o2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20363OooO00o() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            try {
                Method method = cls.getMethod("get", String.class, String.class);
                if (method == null) {
                    return "WTF?!";
                }
                try {
                    String str = (String) method.invoke(cls, "persist.sys.dalvik.vm.lib", "Dalvik");
                    if ("libdvm.so".equals(str)) {
                        return "Dalvik";
                    }
                    if ("libart.so".equals(str)) {
                        return "ART";
                    }
                    return "libartd.so".equals(str) ? "ART debug build" : str;
                } catch (IllegalAccessException unused) {
                    return "IllegalAccessException";
                } catch (IllegalArgumentException unused2) {
                    return "IllegalArgumentException";
                } catch (InvocationTargetException unused3) {
                    return "InvocationTargetException";
                }
            } catch (NoSuchMethodException unused4) {
                return "SystemProperties.get(String key, String def) method is not found";
            }
        } catch (ClassNotFoundException unused5) {
            return "SystemProperties class is not found";
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static synchronized String m20364OooO00o(Context context) {
        String charSequence;
        synchronized (C8742oo0oOo00.class) {
            try {
                charSequence = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return charSequence;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0019 */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized android.graphics.Bitmap m20362OooO00o(android.content.Context r4) {
        /*
            java.lang.Class<com.pd.sdk.oo0oOo00> r0 = com.p118pd.sdk.C8742oo0oOo00.class
            monitor-enter(r0)
            r1 = 0
            android.content.Context r2 = r4.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x0018 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0018 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0019 }
            r3 = 0
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x0019 }
            goto L_0x0019
        L_0x0016:
            r4 = move-exception
            goto L_0x0025
        L_0x0018:
            r2 = r1
        L_0x0019:
            android.graphics.drawable.Drawable r4 = r2.getApplicationIcon(r1)     // Catch:{ all -> 0x0016 }
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4     // Catch:{ all -> 0x0016 }
            android.graphics.Bitmap r4 = r4.getBitmap()     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)
            return r4
        L_0x0025:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8742oo0oOo00.m20362OooO00o(android.content.Context):android.graphics.Bitmap");
    }
}
