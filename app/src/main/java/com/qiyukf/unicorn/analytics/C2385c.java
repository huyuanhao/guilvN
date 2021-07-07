package com.qiyukf.unicorn.analytics;

import android.text.TextUtils;
import android.util.Log;
import com.p118pd.sdk.C8412oOoo0OoO;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p119a.C1713c;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.analytics.C2379a;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.analytics.c */
public final class C2385c {
    /* renamed from: a */
    public static String m5221a(File file) {
        return m5222a(file, file.length());
    }

    /* renamed from: a */
    public static String m5222a(File file, long j) {
        Throwable th;
        IOException e;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                long length = file.length() - j;
                if (length < 0) {
                    length = 0;
                }
                byte[] bArr = new byte[((int) (file.length() - length))];
                fileInputStream.skip(length);
                fileInputStream.read(bArr);
                String str = new String(bArr, "UTF-8");
                m5224a(fileInputStream);
                return str;
            } catch (IOException e2) {
                e = e2;
                try {
                    C1709a.m3015b("AnalyticsUtils", "getTextFromFile is error", e);
                    m5224a(fileInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    m5224a(fileInputStream2);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            fileInputStream = null;
            C1709a.m3015b("AnalyticsUtils", "getTextFromFile is error", e);
            m5224a(fileInputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            m5224a(fileInputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m5223a() {
        File[] listFiles;
        C1713c a = C1709a.m3009a();
        if (a != null) {
            File file = new File(a.mo33864a() + "analytics/");
            if (!(!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0)) {
                C1709a.m3011a(C2379a.f4765a, "auto upload log start");
                int i = 0;
                for (File file2 : listFiles) {
                    if (C2384b.m5215a(file2.getName())) {
                        if (file2.isDirectory()) {
                            File file3 = new File(file2.getPath() + "/msg.log");
                            if (file3.exists()) {
                                JSONObject a2 = C1810b.m3420a(m5221a(file3));
                                C1810b.m3430c(a2, "time");
                                String e = C1810b.m3432e(a2, "stack");
                                C1810b.m3432e(a2, "type");
                                C1810b.m3432e(a2, "version");
                                C1810b.m3427b(a2, C8412oOoo0OoO.OooO0O0);
                                if (!TextUtils.isEmpty(e)) {
                                    m5221a(new File(file2.getPath() + "/log.log"));
                                    i++;
                                    m5227b(file2);
                                    C2384b.m5213a(file2.getName(), System.currentTimeMillis());
                                }
                            }
                        }
                        m5227b(file2);
                    }
                }
                C1709a.m3011a(C2379a.f4765a, "auto upload " + i + " logs");
            }
        }
    }

    /* renamed from: a */
    public static void m5224a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C1709a.m3015b("AnalyticsUtils", "close is error", e);
            }
        }
    }

    /* renamed from: a */
    public static void m5225a(String str, Throwable th, C2379a.EnumC2383b bVar) {
        Throwable th2;
        BufferedWriter bufferedWriter;
        IOException e;
        JSONObject jSONObject;
        BufferedWriter bufferedWriter2 = null;
        try {
            File file = new File(str + "msg.log");
            if (file.exists()) {
                jSONObject = C1810b.m3420a(m5221a(file));
                C1810b.m3422a(jSONObject, C8412oOoo0OoO.OooO0O0, C1810b.m3427b(jSONObject, C8412oOoo0OoO.OooO0O0) + 1);
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                C1810b.m3423a(jSONObject, "time", System.currentTimeMillis());
                C1810b.m3425a(jSONObject, "stack", Log.getStackTraceString(th).trim());
                C1810b.m3425a(jSONObject, "type", bVar.toString());
                C1810b.m3425a(jSONObject, "version", "5.7.1");
                C1810b.m3422a(jSONObject, C8412oOoo0OoO.OooO0O0, 1);
            }
            BufferedWriter bufferedWriter3 = new BufferedWriter(new FileWriter(file));
            try {
                bufferedWriter3.write(jSONObject.toString());
                bufferedWriter3.flush();
                File file2 = new File(str + "log.log");
                if (!file2.exists()) {
                    String a = m5222a(new File(C1709a.m3009a().mo33867b()), 51200);
                    bufferedWriter = new BufferedWriter(new FileWriter(file2));
                    try {
                        bufferedWriter.write(a);
                        bufferedWriter.flush();
                        bufferedWriter2 = bufferedWriter;
                    } catch (IOException e2) {
                        e = e2;
                        bufferedWriter2 = bufferedWriter3;
                        try {
                            C1709a.m3015b("AnalyticsUtils", "saveErrorLog is error", e);
                            m5224a(bufferedWriter2);
                            m5224a(bufferedWriter);
                        } catch (Throwable th3) {
                            th2 = th3;
                            m5224a(bufferedWriter2);
                            m5224a(bufferedWriter);
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        bufferedWriter2 = bufferedWriter3;
                        m5224a(bufferedWriter2);
                        m5224a(bufferedWriter);
                        throw th2;
                    }
                }
                C1709a.m3011a(C2379a.f4765a, "save error log: " + th.getMessage());
                m5224a(bufferedWriter3);
                m5224a(bufferedWriter2);
            } catch (IOException e3) {
                e = e3;
                bufferedWriter = null;
                bufferedWriter2 = bufferedWriter3;
                C1709a.m3015b("AnalyticsUtils", "saveErrorLog is error", e);
                m5224a(bufferedWriter2);
                m5224a(bufferedWriter);
            } catch (Throwable th5) {
                th2 = th5;
                bufferedWriter = null;
                bufferedWriter2 = bufferedWriter3;
                m5224a(bufferedWriter2);
                m5224a(bufferedWriter);
                throw th2;
            }
        } catch (IOException e4) {
            e = e4;
            bufferedWriter = null;
            C1709a.m3015b("AnalyticsUtils", "saveErrorLog is error", e);
            m5224a(bufferedWriter2);
            m5224a(bufferedWriter);
        } catch (Throwable th6) {
            th2 = th6;
            bufferedWriter = null;
            m5224a(bufferedWriter2);
            m5224a(bufferedWriter);
            throw th2;
        }
    }

    /* renamed from: b */
    public static void m5226b() {
        String str;
        String str2;
        C1713c a = C1709a.m3009a();
        if (a != null) {
            C1709a.m3011a(C2379a.f4765a, "invite upload log start");
            File file = new File(a.mo33867b());
            if (!file.exists()) {
                str = C2379a.f4765a;
                str2 = "invite upload log cancel because log file not exist";
            } else {
                m5222a(file, 1048576);
                C2379a.EnumC2383b.invite.toString();
                System.currentTimeMillis();
                str = C2379a.f4765a;
                str2 = "invite upload log success";
            }
            C1709a.m3011a(str, str2);
        }
    }

    /* renamed from: b */
    public static void m5227b(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        m5227b(file2);
                    }
                }
                file.delete();
                return;
            }
            file.delete();
        }
    }
}
