package com.xiaomi.push.service;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4339cz;
import com.xiaomi.push.C4385el;
import com.xiaomi.push.C4483hg;
import com.xiaomi.push.C4693y;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.xiaomi.push.service.ad */
public class C4599ad {

    /* renamed from: a */
    public static long f13152a = 0;

    /* renamed from: a */
    public static ThreadPoolExecutor f13153a = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a */
    public static final Pattern f13154a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");

    /* renamed from: a */
    public static String m13905a(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append("\n");
                        sb.append(readLine);
                    } else {
                        String sb2 = sb.toString();
                        C4693y.m14236a(bufferedReader);
                        return sb2;
                    }
                }
            } catch (Exception unused) {
                C4693y.m14236a(bufferedReader);
                return null;
            } catch (Throwable th2) {
                th = th2;
                C4693y.m14236a(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
            C4693y.m14236a(bufferedReader);
            return null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
            C4693y.m14236a(bufferedReader);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m13906a() {
        C4385el.C4386a a;
        long currentTimeMillis = System.currentTimeMillis();
        if ((f13153a.getActiveCount() <= 0 || currentTimeMillis - f13152a >= 1800000) && C4483hg.m12882a().m12889a() && (a = C4635bb.mo42697a().m14036a()) != null && a.mo41697e() > 0) {
            f13152a = currentTimeMillis;
            m13907a(a.m12206a(), true);
        }
    }

    /* renamed from: a */
    public static void m13907a(List<String> list, boolean z) {
        f13153a.execute(new RunnableC4600ae(list, z));
    }

    /* renamed from: b */
    public static void m13909b() {
        String a = m13905a("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(a)) {
            AbstractC4163b.m11301a("dump tcp for uid = " + Process.myUid());
            AbstractC4163b.m11301a(a);
        }
        String a2 = m13905a("/proc/self/net/tcp6");
        if (!TextUtils.isEmpty(a2)) {
            AbstractC4163b.m11301a("dump tcp6 for uid = " + Process.myUid());
            AbstractC4163b.m11301a(a2);
        }
    }

    /* renamed from: b */
    public static boolean m13910b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AbstractC4163b.m11301a("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(C4339cz.m12016a(str, 5222), 5000);
            socket.setTcpNoDelay(true);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            AbstractC4163b.m11301a("ConnectivityTest: connect to " + str + " in " + currentTimeMillis2);
            socket.close();
            return true;
        } catch (Throwable th) {
            AbstractC4163b.m11306d("ConnectivityTest: could not connect to:" + str + " exception: " + th.getClass().getSimpleName() + " description: " + th.getMessage());
            return false;
        }
    }
}
