package anet.channel.strategy.dispatch;

import android.content.Context;
import anet.channel.util.ALog;
import com.p118pd.sdk.C8912ooOO0o0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: anet.channel.strategy.dispatch.a */
public class C0185a {

    /* renamed from: a */
    public static volatile double f381a;

    /* renamed from: b */
    public static volatile double f382b;

    /* renamed from: c */
    public static volatile String f383c;

    /* renamed from: d */
    public static volatile String f384d;

    /* renamed from: e */
    public static volatile String f385e;

    /* renamed from: f */
    public static volatile Context f386f;

    /* renamed from: g */
    public static volatile int f387g;

    /* renamed from: h */
    public static volatile long f388h;

    /* renamed from: i */
    public static IAmdcSign f389i;

    /* renamed from: j */
    public static Map<String, String> f390j;

    /* renamed from: a */
    public static void m240a(int i, int i2) {
        ALog.m290i("awcn.AmdcRuntimeInfo", "set amdc limit", null, C8912ooOO0o0.OooO0O0, Integer.valueOf(i), "time", Integer.valueOf(i2));
        if (i >= 0 && i <= 3) {
            f387g = i;
            f388h = System.currentTimeMillis() + (((long) i2) * 1000);
        }
    }

    /* renamed from: b */
    public static IAmdcSign m244b() {
        return f389i;
    }

    /* renamed from: c */
    public static synchronized Map<String, String> m245c() {
        synchronized (C0185a.class) {
            if (f390j == null) {
                return Collections.EMPTY_MAP;
            }
            return new HashMap(f390j);
        }
    }

    /* renamed from: a */
    public static int m239a() {
        if (f387g > 0 && System.currentTimeMillis() - f388h > 0) {
            f388h = 0;
            f387g = 0;
        }
        return f387g;
    }

    /* renamed from: a */
    public static void m241a(Context context) {
        f386f = context;
    }

    /* renamed from: a */
    public static void m242a(IAmdcSign iAmdcSign) {
        f389i = iAmdcSign;
    }

    /* renamed from: a */
    public static void m243a(String str, String str2, String str3) {
        f384d = str;
        f385e = str2;
        f383c = str3;
    }
}
