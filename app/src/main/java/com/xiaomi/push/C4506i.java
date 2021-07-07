package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.umeng.message.MsgConstant;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;

/* renamed from: com.xiaomi.push.i */
public class C4506i {

    /* renamed from: a */
    public static String f12468a = null;

    /* renamed from: a */
    public static volatile boolean f12469a = false;

    /* renamed from: a */
    public static final String[] f12470a = {"--", "a-", "u-", "v-", "o-", "g-"};

    /* renamed from: b */
    public static String f12471b = "";

    /* renamed from: c */
    public static String f12472c;

    /* renamed from: d */
    public static String f12473d;

    /* renamed from: e */
    public static final String f12474e = String.valueOf((char) 2);

    /* renamed from: f */
    public static String f12475f = null;

    /* renamed from: a */
    public static double m13027a(double d) {
        int i = 1;
        while (true) {
            double d2 = (double) i;
            if (d2 >= d) {
                return d2;
            }
            i <<= 1;
        }
    }

    @TargetApi(17)
    /* renamed from: a */
    public static int m13028a() {
        Object a;
        if (Build.VERSION.SDK_INT >= 17 && (a = C4278ba.m11774a("android.os.UserHandle", "myUserId", new Object[0])) != null) {
            return ((Integer) Integer.class.cast(a)).intValue();
        }
        return -1;
    }

    /* renamed from: a */
    public static int m13029a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + str.charAt(i2);
        }
        return i;
    }

    /* renamed from: a */
    public static long m13030a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
    }

    /* renamed from: a */
    public static String m13031a() {
        int i = Build.VERSION.SDK_INT;
        if (i > 8 && i < 26) {
            return Build.SERIAL;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return (String) C4278ba.m11774a("android.os.Build", "getSerial", (Object[]) null);
        }
        return null;
    }

    /* renamed from: a */
    public static String m13032a(int i) {
        if (i > 0) {
            String[] strArr = f12470a;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return f12470a[0];
    }

    /* renamed from: a */
    public static String m13033a(Context context) {
        String e = m13047e(context);
        return "a-" + C4285bf.m11809b(((String) null) + e + ((String) null));
    }

    /* renamed from: a */
    public static String m13034a(Context context, boolean z) {
        if (f12472c == null) {
            String e = m13047e(context);
            String f = !C4563l.m13731d() ? z ? m13048f(context) : m13058p(context) : "";
            String a = m13031a();
            int i = 1;
            if ((Build.VERSION.SDK_INT < 26) || !TextUtils.isEmpty(f) || !TextUtils.isEmpty(a)) {
                e = f + e + a;
            } else {
                String a2 = C4269au.m11702a(context).mo41492a();
                if (!TextUtils.isEmpty(a2)) {
                    e = a2 + e;
                    i = 2;
                } else {
                    String o = m13057o(context);
                    if (!TextUtils.isEmpty(o)) {
                        e = o;
                        i = 3;
                    } else {
                        String b = C4269au.m11702a(context).mo41493b();
                        if (!TextUtils.isEmpty(b)) {
                            i = 4;
                            e = b;
                        } else {
                            i = 5;
                        }
                    }
                }
            }
            AbstractC4163b.m11304b("devid rule select:" + i);
            if (i == 3) {
                f12472c = e;
            } else {
                f12472c = m13032a(i) + C4285bf.m11809b(e);
            }
            m13041b(context, f12472c);
        }
        return f12472c;
    }

    /* renamed from: a */
    public static void m13035a(Context context, String str) {
        AbstractC4163b.m11305c("update vdevid = " + str);
        if (!TextUtils.isEmpty(str)) {
            f12475f = str;
            C4689u uVar = null;
            try {
                if (m13036a(context)) {
                    File file = new File(Environment.getExternalStorageDirectory(), "/.vdevdir/");
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                    File file2 = new File(file, ".vdevid");
                    uVar = C4689u.m14229a(context, file2);
                    C4693y.m14237a(file2);
                    C4693y.m14239a(file2, f12475f);
                }
                C4693y.m14239a(new File(context.getFilesDir(), ".vdevid"), f12475f);
                if (uVar == null) {
                    return;
                }
            } catch (IOException e) {
                AbstractC4163b.m11301a("update vdevid failure :" + e.getMessage());
                if (0 == 0) {
                    return;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    uVar.mo42755a();
                }
                throw th;
            }
            uVar.mo42755a();
        }
    }

    /* renamed from: a */
    public static boolean m13036a(Context context) {
        boolean z = false;
        if (!C4564m.m13732a(context, "android.permission.WRITE_EXTERNAL_STORAGE") || C4563l.m13726a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z = true;
        }
        return !z ? C4688t.m14224a(context) : z;
    }

    /* renamed from: a */
    public static boolean m13037a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = f12470a;
            if (i >= strArr.length) {
                return false;
            }
            if (str.startsWith(strArr[i])) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: b */
    public static int m13038b() {
        return Build.VERSION.SDK_INT < 29 ? 10 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c A[Catch:{ IOException -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A[SYNTHETIC, Splitter:B:29:0x0072] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13039b() {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4506i.m13039b():java.lang.String");
    }

    /* renamed from: b */
    public static String m13040b(Context context) {
        try {
            return C4533j.m13593a(context).mo42559a();
        } catch (Exception e) {
            AbstractC4163b.m11301a("failure to get gaid:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static void m13041b(Context context, String str) {
        AbstractC4163b.m11305c("write lvdd = " + str);
        if (!TextUtils.isEmpty(str)) {
            C4689u uVar = null;
            try {
                if (m13036a(context)) {
                    File file = new File(Environment.getExternalStorageDirectory(), "/.vdevdir/");
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                    File file2 = new File(file, ".vdevidlocal");
                    if (!file2.exists() || !file2.isFile()) {
                        uVar = C4689u.m14229a(context, file2);
                        C4693y.m14237a(file2);
                        C4693y.m14239a(file2, f12472c + f12474e + m13029a(f12472c));
                        AbstractC4163b.m11304b("lvdd write succ.");
                    } else {
                        AbstractC4163b.m11304b("vdr exists, not rewrite.");
                        return;
                    }
                } else {
                    AbstractC4163b.m11301a("not support write lvdd.");
                }
                if (uVar == null) {
                    return;
                }
            } catch (IOException e) {
                AbstractC4163b.m11301a("write lvdd failure :" + e.getMessage());
                if (0 == 0) {
                    return;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    uVar.mo42755a();
                }
                throw th;
            }
            uVar.mo42755a();
        }
    }

    /* renamed from: b */
    public static boolean m13042b(Context context) {
        return context.getPackageManager().checkPermission(MsgConstant.PERMISSION_READ_PHONE_STATE, context.getPackageName()) == 0;
    }

    /* renamed from: b */
    public static boolean m13043b(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 15 && str.length() >= 14 && C4285bf.m11810b(str) && !C4285bf.m11811c(str);
    }

    /* renamed from: c */
    public static String m13044c() {
        double a = (double) m13030a(Environment.getDataDirectory());
        Double.isNaN(a);
        double a2 = m13027a(((a / 1024.0d) / 1024.0d) / 1024.0d);
        return a2 + "GB";
    }

    /* renamed from: c */
    public static String m13045c(Context context) {
        C4689u uVar = null;
        if (!m13036a(context)) {
            return null;
        }
        if (!TextUtils.isEmpty(f12475f)) {
            return f12475f;
        }
        String a = C4693y.m14235a(new File(context.getFilesDir(), ".vdevid"));
        f12475f = a;
        if (!TextUtils.isEmpty(a)) {
            return f12475f;
        }
        try {
            File file = new File(new File(Environment.getExternalStorageDirectory(), "/.vdevdir/"), ".vdevid");
            C4689u a2 = C4689u.m14229a(context, file);
            f12475f = "";
            String a3 = C4693y.m14235a(file);
            if (a3 != null) {
                f12475f = a3;
            }
            String str = f12475f;
            if (a2 != null) {
                a2.mo42755a();
            }
            return str;
        } catch (IOException e) {
            AbstractC4163b.m11301a("getVDevID failure :" + e.getMessage());
            if (0 != 0) {
                uVar.mo42755a();
            }
            return f12475f;
        } catch (Throwable th) {
            if (0 != 0) {
                uVar.mo42755a();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13046d(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4506i.m13046d(android.content.Context):java.lang.String");
    }

    /* renamed from: e */
    public static String m13047e(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            AbstractC4163b.m11303a(th);
            return null;
        }
    }

    /* renamed from: f */
    public static String m13048f(Context context) {
        int b = m13038b();
        String g = m13049g(context);
        while (g == null) {
            int i = b - 1;
            if (b <= 0) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            g = m13049g(context);
            b = i;
        }
        return g;
    }

    /* renamed from: g */
    public static String m13049g(Context context) {
        Object a;
        Object a2;
        Object a3;
        if (C4563l.m13731d()) {
            return "";
        }
        String str = f12468a;
        if (str != null) {
            return str;
        }
        try {
            String str2 = (!C4563l.m13726a() || (a2 = C4278ba.m11774a("miui.telephony.TelephonyManager", "getDefault", new Object[0])) == null || (a3 = C4278ba.m11772a(a2, "getMiuiDeviceId", new Object[0])) == null || !(a3 instanceof String)) ? null : (String) String.class.cast(a3);
            if (str2 == null && m13042b(context)) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (Build.VERSION.SDK_INT < 26) {
                    str2 = telephonyManager.getDeviceId();
                } else {
                    if (1 == telephonyManager.getPhoneType()) {
                        a = C4278ba.m11772a(telephonyManager, "getImei", (Object[]) null);
                    } else if (2 == telephonyManager.getPhoneType()) {
                        a = C4278ba.m11772a(telephonyManager, "getMeid", (Object[]) null);
                    }
                    str2 = (String) a;
                }
            }
            if (!m13043b(str2)) {
                return "";
            }
            f12468a = str2;
            return str2;
        } catch (Throwable th) {
            AbstractC4163b.m11303a(th);
            return null;
        }
    }

    /* renamed from: h */
    public static String m13050h(Context context) {
        int b = m13038b();
        String j = m13052j(context);
        while (j == null) {
            int i = b - 1;
            if (b <= 0) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            j = m13052j(context);
            b = i;
        }
        return j;
    }

    /* renamed from: i */
    public static String m13051i(Context context) {
        Object a;
        if (C4563l.m13731d() || Build.VERSION.SDK_INT < 22) {
            return "";
        }
        if (!TextUtils.isEmpty(f12471b)) {
            return f12471b;
        }
        if (!m13042b(context)) {
            return "";
        }
        m13049g(context);
        if (TextUtils.isEmpty(f12468a)) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            Integer num = (Integer) C4278ba.m11772a(telephonyManager, "getPhoneCount", new Object[0]);
            if (num == null || num.intValue() <= 1) {
                return "";
            }
            String str = null;
            for (int i = 0; i < num.intValue(); i++) {
                if (Build.VERSION.SDK_INT < 26) {
                    a = C4278ba.m11772a(telephonyManager, "getDeviceId", Integer.valueOf(i));
                } else if (1 == telephonyManager.getPhoneType()) {
                    a = C4278ba.m11772a(telephonyManager, "getImei", Integer.valueOf(i));
                } else {
                    if (2 == telephonyManager.getPhoneType()) {
                        a = C4278ba.m11772a(telephonyManager, "getMeid", Integer.valueOf(i));
                    }
                    if (!TextUtils.isEmpty(str) && !TextUtils.equals(f12468a, str) && m13043b(str)) {
                        f12471b += str + Constants.ACCEPT_TIME_SEPARATOR_SP;
                    }
                }
                str = (String) a;
                f12471b += str + Constants.ACCEPT_TIME_SEPARATOR_SP;
            }
            int length = f12471b.length();
            if (length > 0) {
                f12471b = f12471b.substring(0, length - 1);
            }
            return f12471b;
        } catch (Exception e) {
            AbstractC4163b.m11306d(e.toString());
            return "";
        }
    }

    /* renamed from: j */
    public static String m13052j(Context context) {
        m13051i(context);
        String str = "";
        if (TextUtils.isEmpty(f12471b)) {
            return str;
        }
        String[] split = f12471b.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        for (String str2 : split) {
            if (m13043b(str2)) {
                str = str + C4285bf.m11800a(str2) + Constants.ACCEPT_TIME_SEPARATOR_SP;
            }
        }
        int length = str.length();
        return length > 0 ? str.substring(0, length - 1) : str;
    }

    /* renamed from: k */
    public static synchronized String m13053k(Context context) {
        synchronized (C4506i.class) {
            if (f12473d != null) {
                return f12473d;
            }
            String e = m13047e(context);
            String a = m13031a();
            String b = C4285bf.m11809b(e + a);
            f12473d = b;
            return b;
        }
    }

    /* renamed from: l */
    public static synchronized String m13054l(Context context) {
        String b;
        synchronized (C4506i.class) {
            String e = m13047e(context);
            b = C4285bf.m11809b(e + ((String) null));
        }
        return b;
    }

    /* renamed from: m */
    public static String m13055m(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    /* renamed from: n */
    public static String m13056n(Context context) {
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        r1 = r6;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r1 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        r1.mo42755a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (r1 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0099, code lost:
        return r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13057o(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4506i.m13057o(android.content.Context):java.lang.String");
    }

    /* renamed from: p */
    public static String m13058p(Context context) {
        int b = m13038b();
        String g = m13049g(context);
        while (TextUtils.isEmpty(g)) {
            int i = b - 1;
            if (b <= 0) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            g = m13049g(context);
            b = i;
        }
        return g;
    }
}
