package com.tencent.bugly.crashreport.common.info;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C8754oo0oo00O;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class AppInfo {

    /* renamed from: a */
    public static final String[] f7613a = "@buglyAllChannel@".split(Constants.ACCEPT_TIME_SEPARATOR_SP);

    /* renamed from: b */
    public static final String[] f7614b = "@buglyAllChannelPriority@".split(Constants.ACCEPT_TIME_SEPARATOR_SP);

    /* renamed from: c */
    public static ActivityManager f7615c;

    /* renamed from: a */
    public static String m7950a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName();
        } catch (Throwable th) {
            if (C3321an.m8350a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: b */
    public static PackageInfo m7955b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(m7950a(context), 0);
        } catch (Throwable th) {
            if (C3321an.m8350a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static String m7956c(Context context) {
        CharSequence applicationLabel;
        if (context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (!(packageManager == null || applicationInfo == null || (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) == null)) {
                return applicationLabel.toString();
            }
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: d */
    public static Map<String, String> m7957d(Context context) {
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Object obj = applicationInfo.metaData.get("BUGLY_DISABLE");
            if (obj != null) {
                hashMap.put("BUGLY_DISABLE", obj.toString());
            }
            Object obj2 = applicationInfo.metaData.get("BUGLY_APPID");
            if (obj2 != null) {
                hashMap.put("BUGLY_APPID", obj2.toString());
            }
            Object obj3 = applicationInfo.metaData.get("BUGLY_APP_CHANNEL");
            if (obj3 != null) {
                hashMap.put("BUGLY_APP_CHANNEL", obj3.toString());
            }
            Object obj4 = applicationInfo.metaData.get("BUGLY_APP_VERSION");
            if (obj4 != null) {
                hashMap.put("BUGLY_APP_VERSION", obj4.toString());
            }
            Object obj5 = applicationInfo.metaData.get("BUGLY_ENABLE_DEBUG");
            if (obj5 != null) {
                hashMap.put("BUGLY_ENABLE_DEBUG", obj5.toString());
            }
            Object obj6 = applicationInfo.metaData.get("com.tencent.rdm.uuid");
            if (obj6 != null) {
                hashMap.put("com.tencent.rdm.uuid", obj6.toString());
            }
            return hashMap;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: e */
    public static String m7958e(Context context) {
        Signature[] signatureArr;
        String a = m7950a(context);
        if (a == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(a, 64);
            if (!(packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0)) {
                return m7952a(signatureArr[0].toByteArray());
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m7959f(Context context) {
        if (context == null) {
            return false;
        }
        if (f7615c == null) {
            f7615c = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            f7615c.getMemoryInfo(memoryInfo);
            if (!memoryInfo.lowMemory) {
                return false;
            }
            C3321an.m8355c("Memory is low.", new Object[0]);
            return true;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: g */
    public static String m7960g(Context context) {
        if (context == null) {
            return "";
        }
        String h = m7961h(context);
        if (!C3325ap.m8404a(h)) {
            return h;
        }
        return m7962i(context);
    }

    /* renamed from: h */
    public static String m7961h(Context context) {
        String str = "";
        InputStream inputStream = null;
        try {
            String string = C3325ap.m8381a("DENGTA_META", context).getString("key_channelpath", str);
            if (C3325ap.m8404a(string)) {
                string = "channel.ini";
            }
            C3321an.m8349a("[AppInfo] Beacon channel file path: " + string, new Object[0]);
            if (!string.equals(str)) {
                inputStream = context.getAssets().open(string);
                Properties properties = new Properties();
                properties.load(inputStream);
                str = properties.getProperty(C8754oo0oo00O.OooO0o0, str);
                C3321an.m8349a("[AppInfo] Beacon channel read from assert: " + str, new Object[0]);
                if (!C3325ap.m8404a(str)) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            C3321an.m8350a(e);
                        }
                    }
                    return str;
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    C3321an.m8350a(e2);
                }
            }
        } catch (Exception unused) {
            C3321an.m8356d("[AppInfo] Failed to get get beacon channel", new Object[0]);
            if (0 != 0) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    C3321an.m8350a(e3);
                }
            }
            throw th;
        }
        return str;
    }

    /* renamed from: i */
    public static String m7962i(Context context) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("CHANNEL_DENGTA");
            if (obj != null) {
                return obj.toString();
            }
            return "";
        } catch (Throwable th) {
            C3321an.m8356d("[AppInfo] Failed to read beacon channel from manifest.", new Object[0]);
            C3321an.m8350a(th);
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m7954a(Context context, String str) {
        if (!(context == null || str == null || str.trim().length() <= 0)) {
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (str.equals(str2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048 A[Catch:{ all -> 0x0055, all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051 A[SYNTHETIC, Splitter:B:25:0x0051] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m7951a(android.content.Context r6, int r7) {
        /*
            r6 = 0
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x003e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003e }
            r1.<init>()     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "/proc/"
            r1.append(r2)     // Catch:{ all -> 0x003e }
            r1.append(r7)     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "/cmdline"
            r1.append(r2)     // Catch:{ all -> 0x003e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003e }
            r0.<init>(r1)     // Catch:{ all -> 0x003e }
            r6 = 512(0x200, float:7.175E-43)
            char[] r1 = new char[r6]     // Catch:{ all -> 0x003c }
            r0.read(r1)     // Catch:{ all -> 0x003c }
            r2 = 0
            r3 = 0
        L_0x0025:
            if (r3 >= r6) goto L_0x002f
            char r4 = r1[r3]     // Catch:{ all -> 0x003c }
            if (r4 != 0) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x0025
        L_0x002f:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x003c }
            r6.<init>(r1)     // Catch:{ all -> 0x003c }
            java.lang.String r6 = r6.substring(r2, r3)     // Catch:{ all -> 0x003c }
            r0.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            return r6
        L_0x003c:
            r6 = move-exception
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
        L_0x0042:
            boolean r1 = com.tencent.bugly.proguard.C3321an.m8350a(r6)     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x004b
            r6.printStackTrace()     // Catch:{ all -> 0x0055 }
        L_0x004b:
            java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0054
            r0.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            return r6
        L_0x0055:
            r6 = move-exception
            if (r0 == 0) goto L_0x005b
            r0.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            goto L_0x005d
        L_0x005c:
            throw r6
        L_0x005d:
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.AppInfo.m7951a(android.content.Context, int):java.lang.String");
    }

    /* renamed from: a */
    public static List<String> m7953a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            String str = map.get("BUGLY_DISABLE");
            if (str != null) {
                if (str.length() != 0) {
                    String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    for (int i = 0; i < split.length; i++) {
                        split[i] = split[i].trim();
                    }
                    return Arrays.asList(split);
                }
            }
            return null;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m7952a(byte[] bArr) {
        X509Certificate x509Certificate;
        StringBuilder sb = new StringBuilder();
        if (bArr != null && bArr.length > 0) {
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                if (instance == null || (x509Certificate = (X509Certificate) instance.generateCertificate(new ByteArrayInputStream(bArr))) == null) {
                    return null;
                }
                sb.append("Issuer|");
                Principal issuerDN = x509Certificate.getIssuerDN();
                if (issuerDN != null) {
                    sb.append(issuerDN.toString());
                } else {
                    sb.append("unknown");
                }
                sb.append("\n");
                sb.append("SerialNumber|");
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                if (issuerDN != null) {
                    sb.append(serialNumber.toString(16));
                } else {
                    sb.append("unknown");
                }
                sb.append("\n");
                sb.append("NotBefore|");
                Date notBefore = x509Certificate.getNotBefore();
                if (issuerDN != null) {
                    sb.append(notBefore.toString());
                } else {
                    sb.append("unknown");
                }
                sb.append("\n");
                sb.append("NotAfter|");
                Date notAfter = x509Certificate.getNotAfter();
                if (issuerDN != null) {
                    sb.append(notAfter.toString());
                } else {
                    sb.append("unknown");
                }
                sb.append("\n");
                sb.append("SHA1|");
                String a = C3325ap.m8393a(MessageDigest.getInstance("SHA1").digest(x509Certificate.getEncoded()));
                if (a == null || a.length() <= 0) {
                    sb.append("unknown");
                } else {
                    sb.append(a.toString());
                }
                sb.append("\n");
                sb.append("MD5|");
                String a2 = C3325ap.m8393a(MessageDigest.getInstance("MD5").digest(x509Certificate.getEncoded()));
                if (a2 == null || a2.length() <= 0) {
                    sb.append("unknown");
                } else {
                    sb.append(a2.toString());
                }
            } catch (CertificateException e) {
                if (!C3321an.m8350a(e)) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
            }
        }
        if (sb.length() == 0) {
            return "unknown";
        }
        return sb.toString();
    }
}
