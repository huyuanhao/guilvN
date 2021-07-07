package com.xiaomi.channel.commonutils.logger;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.xiaomi.channel.commonutils.logger.b */
public abstract class AbstractC4163b {

    /* renamed from: a */
    public static int f11163a = 2;

    /* renamed from: a */
    public static LoggerInterface f11164a = new C4162a();

    /* renamed from: a */
    public static final Integer f11165a = -1;

    /* renamed from: a */
    public static final HashMap<Integer, Long> f11166a = new HashMap<>();

    /* renamed from: a */
    public static AtomicInteger f11167a = new AtomicInteger(1);

    /* renamed from: b */
    public static final HashMap<Integer, String> f11168b = new HashMap<>();

    /* renamed from: a */
    public static int m11293a() {
        return f11163a;
    }

    /* renamed from: a */
    public static Integer m11294a(String str) {
        if (f11163a > 1) {
            return f11165a;
        }
        Integer valueOf = Integer.valueOf(f11167a.incrementAndGet());
        f11166a.put(valueOf, Long.valueOf(System.currentTimeMillis()));
        f11168b.put(valueOf, str);
        LoggerInterface loggerInterface = f11164a;
        loggerInterface.log(str + " starts");
        return valueOf;
    }

    /* renamed from: a */
    public static void m11295a(int i) {
        if (i < 0 || i > 5) {
            m11296a(2, "set log level as " + i);
        }
        f11163a = i;
    }

    /* renamed from: a */
    public static void m11296a(int i, String str) {
        if (i >= f11163a) {
            f11164a.log(str);
        }
    }

    /* renamed from: a */
    public static void m11297a(int i, String str, Throwable th) {
        if (i >= f11163a) {
            f11164a.log(str, th);
        }
    }

    /* renamed from: a */
    public static void m11298a(int i, Throwable th) {
        if (i >= f11163a) {
            f11164a.log("", th);
        }
    }

    /* renamed from: a */
    public static void m11299a(LoggerInterface loggerInterface) {
        f11164a = loggerInterface;
    }

    /* renamed from: a */
    public static void m11300a(Integer num) {
        if (f11163a <= 1 && f11166a.containsKey(num)) {
            long currentTimeMillis = System.currentTimeMillis() - f11166a.remove(num).longValue();
            LoggerInterface loggerInterface = f11164a;
            loggerInterface.log(f11168b.remove(num) + " ends in " + currentTimeMillis + " ms");
        }
    }

    /* renamed from: a */
    public static void m11301a(String str) {
        m11296a(2, "[Thread:" + Thread.currentThread().getId() + "] " + str);
    }

    /* renamed from: a */
    public static void m11302a(String str, Throwable th) {
        m11297a(4, str, th);
    }

    /* renamed from: a */
    public static void m11303a(Throwable th) {
        m11298a(4, th);
    }

    /* renamed from: b */
    public static void m11304b(String str) {
        m11296a(0, str);
    }

    /* renamed from: c */
    public static void m11305c(String str) {
        m11296a(1, "[Thread:" + Thread.currentThread().getId() + "] " + str);
    }

    /* renamed from: d */
    public static void m11306d(String str) {
        m11296a(4, str);
    }
}
