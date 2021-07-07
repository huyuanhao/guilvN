package com.qiyukf.unicorn.analytics;

import android.content.Context;
import android.util.Log;
import com.facebook.react.uimanager.ViewProps;
import com.p118pd.sdk.C8783oo0oooOO;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p119a.C1713c;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.unicorn.p213f.C2634c;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.analytics.a */
public final class C2379a {

    /* renamed from: a */
    public static final String f4765a;

    /* renamed from: b */
    public static Context f4766b;

    /* renamed from: com.qiyukf.unicorn.analytics.a$a */
    public static abstract class AbstractRunnableC2382a implements Runnable {
        public AbstractRunnableC2382a() {
        }

        public /* synthetic */ AbstractRunnableC2382a(byte b) {
            this();
        }

        /* renamed from: a */
        public abstract void mo35279a();

        public final void run() {
            try {
                mo35279a();
            } catch (Throwable th) {
                C1709a.m3015b("Analytics", "run is error", th);
                th.printStackTrace();
            }
        }
    }

    /* renamed from: com.qiyukf.unicorn.analytics.a$b */
    public enum EnumC2383b {
        invite,
        crash,
        exception
    }

    static {
        String str = C2205d.m4583f() ? C8783oo0oooOO.OooO0OO : C2205d.m4584g() ? "core" : null;
        f4765a = "Analytics-" + str;
    }

    /* renamed from: a */
    public static void m5198a(Context context) {
        try {
            if (!m5202a()) {
                f4766b = context.getApplicationContext();
                C1709a.m3011a(f4765a, "init");
                if (C2205d.m4584g()) {
                    C2384b.m5212a(f4766b);
                    String str = f4765a;
                    StringBuilder sb = new StringBuilder("log analytics switch is ");
                    sb.append(C2384b.m5214a() ? ViewProps.f984ON : "off");
                    C1709a.m3011a(str, sb.toString());
                    if (C2384b.m5217b()) {
                        m5199a(new AbstractRunnableC2382a() {
                            /* class com.qiyukf.unicorn.analytics.C2379a.C23801 */

                            @Override // com.qiyukf.unicorn.analytics.C2379a.AbstractRunnableC2382a
                            /* renamed from: a */
                            public final void mo35279a() {
                                C2379a.m5206c();
                            }
                        });
                    }
                    AnalyticsService.m5196a(context);
                }
            }
        } catch (Throwable th) {
            C1709a.m3015b("Analytics", "init is error", th);
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m5199a(Runnable runnable) {
        new Thread(runnable).start();
    }

    /* renamed from: a */
    public static void m5200a(Throwable th) {
        m5205b(th, EnumC2383b.exception);
    }

    /* renamed from: a */
    public static void m5201a(Throwable th, EnumC2383b bVar) {
        C1713c a = C1709a.m3009a();
        if (a != null) {
            String str = a.mo33864a() + "analytics/" + C1852c.m3511a(Log.getStackTraceString(th).trim()) + C8932ooOOO0o.OooO0OO;
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            C2385c.m5225a(str, th, bVar);
        }
    }

    /* renamed from: a */
    public static boolean m5202a() {
        return f4766b != null;
    }

    /* renamed from: b */
    public static void m5203b() {
        try {
            if (C2205d.m4583f()) {
                m5199a(new AbstractRunnableC2382a() {
                    /* class com.qiyukf.unicorn.analytics.C2379a.C23812 */

                    @Override // com.qiyukf.unicorn.analytics.C2379a.AbstractRunnableC2382a
                    /* renamed from: a */
                    public final void mo35279a() {
                        C2385c.m5226b();
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
            C1709a.m3015b("Analytics", "inviteUpload is error", th);
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m5204b(Throwable th) {
        m5205b(th, EnumC2383b.crash);
    }

    /* renamed from: b */
    public static void m5205b(Throwable th, EnumC2383b bVar) {
        try {
            if (m5202a()) {
                if (C2205d.m4584g() && bVar == EnumC2383b.crash) {
                    m5201a(th, bVar);
                } else if (C2205d.m4583f() || (C2205d.m4584g() && bVar != EnumC2383b.crash)) {
                    AnalyticsService.m5197a(f4766b, th, bVar);
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            C1709a.m3015b("Analytics", "error", th2);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m5206c() {
        JSONObject a = C2634c.m6001a();
        if (a != null) {
            long c = C1810b.m3430c(a, "distinctPeriod");
            String str = f4765a;
            C1709a.m3011a(str, "fetch config: " + a.toString());
            C2384b.m5211a(c);
            C2384b.m5210a((float) C1810b.m3431d(a, "samplingRate"));
            C2384b.m5218c();
        }
    }
}
