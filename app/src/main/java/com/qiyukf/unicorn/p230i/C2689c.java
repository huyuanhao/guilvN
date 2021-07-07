package com.qiyukf.unicorn.p230i;

import android.text.TextUtils;
import android.util.Base64;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p213f.C2634c;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.i.c */
public final class C2689c {
    /* renamed from: a */
    public static String m6213a(String str, CharSequence charSequence, String str2, int i, long j, String str3, JSONObject jSONObject) {
        String d = C2452d.m5371d();
        String g = C2437b.m5278g();
        if (TextUtils.isEmpty(g)) {
            g = C2437b.m5267d();
        }
        String valueOf = String.valueOf(j);
        String charSequence2 = charSequence != null ? charSequence.toString() : "";
        String str4 = i == 0 ? "0" : "1";
        String format = jSONObject != null ? String.format(Locale.getDefault(), "ak=%s&dv=%s&cup=%s&tm=%s&ct=%s&lt=%s&tp=%s&desc=%s&u=%s", d, g, str, valueOf, charSequence2, str4, str3, jSONObject.toString(), str2) : String.format(Locale.getDefault(), "ak=%s&dv=%s&cup=%s&tm=%s&ct=%s&lt=%s&tp=%s&u=%s", d, g, str, valueOf, charSequence2, str4, str3, str2);
        C1709a.m3011a("StatisticsManager", "track record: " + format);
        return Base64.encodeToString(format.getBytes(), 2);
    }

    /* renamed from: a */
    public static void m6214a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m6215a(String str, String str2) {
        if (m6216a(str)) {
            int a = C2634c.m5998a(str2);
            if (a != 200) {
                C1709a.m3011a("StatisticsUtils", "upload error" + a);
                m6217b(str, str2);
                return;
            }
            return;
        }
        m6217b(str, str2);
    }

    /* renamed from: a */
    public static boolean m6216a(String str) {
        Throwable th;
        IOException e;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        File file = new File(str);
        if (!file.exists() || file.length() == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        if (sb.length() >= 6000) {
                            sb.deleteCharAt(sb.length() - 1);
                            if (C2634c.m5998a(sb.toString()) == 200) {
                                sb = new StringBuilder();
                            } else {
                                m6214a(bufferedReader2);
                                return false;
                            }
                        }
                    } else if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                        if (C2634c.m5998a(sb.toString()) == 200) {
                            file.delete();
                            m6214a(bufferedReader2);
                            return true;
                        }
                        m6214a(bufferedReader2);
                        return false;
                    } else {
                        m6214a(bufferedReader2);
                        return true;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedReader = bufferedReader2;
                    try {
                        C1709a.m3015b("StatisticsUtil", "reportRecords is error", e);
                        m6214a(bufferedReader);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        m6214a(bufferedReader);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                    m6214a(bufferedReader);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            C1709a.m3015b("StatisticsUtil", "reportRecords is error", e);
            m6214a(bufferedReader);
            return false;
        }
    }

    /* renamed from: b */
    public static void m6217b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
            } else if (!file.isFile()) {
                C2349d.m5125a(file);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            if (file.length() > 0) {
                bufferedWriter.append((CharSequence) "\n");
            }
            bufferedWriter.append((CharSequence) str2);
            bufferedWriter.flush();
            bufferedWriter.close();
            if (file.length() >= 6000) {
                m6216a(str);
            }
        }
    }
}
