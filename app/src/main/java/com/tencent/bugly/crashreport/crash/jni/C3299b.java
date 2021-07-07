package com.tencent.bugly.crashreport.crash.jni;

import android.content.Context;
import com.bumptech.glide.load.engine.GlideException;
import com.p118pd.sdk.C8932ooOOO0o;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.crashreport.crash.jni.b */
public class C3299b {

    /* renamed from: a */
    public static List<File> f7936a = new ArrayList();

    /* renamed from: a */
    public static Map<String, Integer> m8216a(String str) {
        if (str == null) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            for (String str2 : split) {
                String[] split2 = str2.split(Constants.COLON_SEPARATOR);
                if (split2.length != 2) {
                    C3321an.m8357e("error format at %s", str2);
                    return null;
                }
                hashMap.put(split2[0], Integer.valueOf(Integer.parseInt(split2[1])));
            }
            return hashMap;
        } catch (Exception e) {
            C3321an.m8357e("error format intStateStr %s", str);
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static String m8218b(String str) {
        if (str == null) {
            return "";
        }
        String[] split = str.split("\n");
        if (split == null || split.length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (!str2.contains("java.lang.Thread.getStackTrace(")) {
                sb.append(str2);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m8221c(String str, String str2) {
        BufferedReader a = C3325ap.m8383a(str, "map_record.txt");
        if (a == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String readLine = a.readLine();
            if (readLine != null) {
                if (readLine.startsWith(str2)) {
                    while (true) {
                        String readLine2 = a.readLine();
                        if (readLine2 == null) {
                            break;
                        }
                        sb.append(GlideException.OooO00o.o0ooOoO);
                        sb.append(readLine2);
                        sb.append("\n");
                    }
                    String sb2 = sb.toString();
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Exception e) {
                            C3321an.m8350a(e);
                        }
                    }
                    return sb2;
                }
            }
            if (a != null) {
                try {
                    a.close();
                } catch (Exception e2) {
                    C3321an.m8350a(e2);
                }
            }
            return null;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception e3) {
                    C3321an.m8350a(e3);
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    public static void m8222d(String str) {
        File[] listFiles;
        if (str != null) {
            try {
                File file = new File(str);
                if (file.canRead() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2.canRead() && file2.canWrite() && file2.length() == 0) {
                            file2.delete();
                            C3321an.m8355c("Delete empty record file %s", file2.getAbsoluteFile());
                        }
                    }
                }
            } catch (Throwable th) {
                C3321an.m8350a(th);
            }
        }
    }

    /* renamed from: b */
    public static String m8219b(String str, String str2) {
        BufferedReader a = C3325ap.m8383a(str, "reg_record.txt");
        if (a == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String readLine = a.readLine();
            if (readLine != null) {
                if (readLine.startsWith(str2)) {
                    int i = 18;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        String readLine2 = a.readLine();
                        if (readLine2 == null) {
                            break;
                        }
                        if (i2 % 4 == 0) {
                            if (i2 > 0) {
                                sb.append("\n");
                            }
                            sb.append(GlideException.OooO00o.o0ooOoO);
                        } else {
                            if (readLine2.length() > 16) {
                                i = 28;
                            }
                            sb.append("                ".substring(0, i - i3));
                        }
                        i3 = readLine2.length();
                        sb.append(readLine2);
                        i2++;
                    }
                    sb.append("\n");
                    String sb2 = sb.toString();
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Exception e) {
                            C3321an.m8350a(e);
                        }
                    }
                    return sb2;
                }
            }
            if (a != null) {
                try {
                    a.close();
                } catch (Exception e2) {
                    C3321an.m8350a(e2);
                }
            }
            return null;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception e3) {
                    C3321an.m8350a(e3);
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static CrashDetailBean m8212a(Context context, Map<String, String> map, NativeExceptionHandler nativeExceptionHandler) {
        String str;
        String str2;
        HashMap hashMap;
        if (map == null) {
            return null;
        }
        if (C3269a.m7965a(context) == null) {
            C3321an.m8357e("abnormal com info not created", new Object[0]);
            return null;
        }
        String str3 = map.get("intStateStr");
        if (str3 == null || str3.trim().length() <= 0) {
            C3321an.m8357e("no intStateStr", new Object[0]);
            return null;
        }
        Map<String, Integer> a = m8216a(str3);
        if (a == null) {
            C3321an.m8357e("parse intSateMap fail", Integer.valueOf(map.size()));
            return null;
        }
        try {
            a.get("sino").intValue();
            a.get("sud").intValue();
            String str4 = map.get("soVersion");
            if (str4 == null) {
                C3321an.m8357e("error format at version", new Object[0]);
                return null;
            }
            String str5 = map.get("errorAddr");
            String str6 = "unknown";
            String str7 = str5 == null ? str6 : str5;
            String str8 = map.get("codeMsg");
            if (str8 == null) {
                str8 = str6;
            }
            String str9 = map.get("tombPath");
            String str10 = str9 == null ? str6 : str9;
            String str11 = map.get("signalName");
            if (str11 == null) {
                str11 = str6;
            }
            map.get("errnoMsg");
            String str12 = map.get("stack");
            if (str12 == null) {
                str12 = str6;
            }
            String str13 = map.get("jstack");
            if (str13 != null) {
                str12 = str12 + "java:\n" + str13;
            }
            Integer num = a.get("sico");
            if (num == null || num.intValue() <= 0) {
                str = str8;
                str2 = str11;
            } else {
                str2 = str11 + C3848l.f10401s + str8 + C3848l.f10402t;
                str = "KERNEL";
            }
            String str14 = map.get("nativeLog");
            byte[] a2 = (str14 == null || str14.isEmpty()) ? null : C3325ap.m8408a((File) null, str14, "BuglyNativeLog.txt");
            String str15 = map.get("sendingProcess");
            if (str15 == null) {
                str15 = str6;
            }
            Integer num2 = a.get("spd");
            if (num2 != null) {
                str15 = str15 + C3848l.f10401s + num2 + C3848l.f10402t;
            }
            String str16 = map.get("threadName");
            if (str16 == null) {
                str16 = str6;
            }
            Integer num3 = a.get("et");
            if (num3 != null) {
                str16 = str16 + C3848l.f10401s + num3 + C3848l.f10402t;
            }
            String str17 = map.get("processName");
            if (str17 != null) {
                str6 = str17;
            }
            Integer num4 = a.get("ep");
            if (num4 != null) {
                str6 = str6 + C3848l.f10401s + num4 + C3848l.f10402t;
            }
            String str18 = map.get("key-value");
            if (str18 != null) {
                HashMap hashMap2 = new HashMap();
                String[] split = str18.split("\n");
                int length = split.length;
                int i = 0;
                while (i < length) {
                    String[] split2 = split[i].split(C8932ooOOO0o.OooO0Oo);
                    if (split2.length == 2) {
                        hashMap2.put(split2[0], split2[1]);
                    }
                    i++;
                    split = split;
                }
                hashMap = hashMap2;
            } else {
                hashMap = null;
            }
            CrashDetailBean packageCrashDatas = nativeExceptionHandler.packageCrashDatas(str6, str16, (((long) a.get("etms").intValue()) / 1000) + (((long) a.get("ets").intValue()) * 1000), str2, str7, m8218b(str12), str, str15, str10, map.get("sysLogPath"), map.get("jniLogPath"), str4, a2, hashMap, false, false);
            if (packageCrashDatas != null) {
                String str19 = map.get("userId");
                if (str19 != null) {
                    C3321an.m8355c("[Native record info] userId: %s", str19);
                    packageCrashDatas.f7785m = str19;
                }
                String str20 = map.get("sysLog");
                if (str20 != null) {
                    packageCrashDatas.f7795w = str20;
                }
                String str21 = map.get("appVersion");
                if (str21 != null) {
                    C3321an.m8355c("[Native record info] appVersion: %s", str21);
                    packageCrashDatas.f7778f = str21;
                }
                String str22 = map.get("isAppForeground");
                if (str22 != null) {
                    C3321an.m8355c("[Native record info] isAppForeground: %s", str22);
                    packageCrashDatas.f7764O = str22.equalsIgnoreCase("true");
                }
                String str23 = map.get("launchTime");
                if (str23 != null) {
                    C3321an.m8355c("[Native record info] launchTime: %s", str23);
                    try {
                        packageCrashDatas.f7763N = Long.parseLong(str23);
                    } catch (NumberFormatException e) {
                        if (!C3321an.m8350a(e)) {
                            e.printStackTrace();
                        }
                    }
                }
                packageCrashDatas.f7798z = null;
                packageCrashDatas.f7783k = true;
            }
            return packageCrashDatas;
        } catch (Throwable th) {
            C3321an.m8357e("error format", new Object[0]);
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static String m8220c(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str, "backup_record.txt");
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: a */
    public static String m8213a(BufferedInputStream bufferedInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        if (bufferedInputStream == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(1024);
            while (true) {
                try {
                    int read = bufferedInputStream.read();
                    if (read == -1) {
                        break;
                    } else if (read == 0) {
                        String str = new String(byteArrayOutputStream.toByteArray(), "UTf-8");
                        byteArrayOutputStream.close();
                        return str;
                    } else {
                        byteArrayOutputStream.write(read);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        C3321an.m8350a(th);
                    } finally {
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            C3321an.m8350a(th);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x008b A[SYNTHETIC, Splitter:B:49:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098 A[SYNTHETIC, Splitter:B:57:0x0098] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.bugly.crashreport.crash.CrashDetailBean m8211a(android.content.Context r6, java.lang.String r7, com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler r8) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.jni.C3299b.m8211a(android.content.Context, java.lang.String, com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler):com.tencent.bugly.crashreport.crash.CrashDetailBean");
    }

    /* renamed from: a */
    public static String m8215a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String b = m8219b(str, str2);
        if (b != null && !b.isEmpty()) {
            sb.append("Register infos:\n");
            sb.append(b);
        }
        String c = m8221c(str, str2);
        if (c != null && !c.isEmpty()) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append("System SO infos:\n");
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m8217a(boolean z, String str) {
        if (str != null) {
            f7936a.add(new File(str, "rqd_record.eup"));
            f7936a.add(new File(str, "reg_record.txt"));
            f7936a.add(new File(str, "map_record.txt"));
            f7936a.add(new File(str, "backup_record.txt"));
            if (z) {
                m8222d(str);
            }
        }
        List<File> list = f7936a;
        if (list != null && list.size() > 0) {
            for (File file : f7936a) {
                if (file.exists() && file.canWrite()) {
                    file.delete();
                    C3321an.m8355c("Delete record file %s", file.getAbsoluteFile());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m8214a(java.lang.String r6, int r7, java.lang.String r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.jni.C3299b.m8214a(java.lang.String, int, java.lang.String, boolean):java.lang.String");
    }
}
