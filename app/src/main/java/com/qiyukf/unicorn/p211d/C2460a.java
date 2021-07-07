package com.qiyukf.unicorn.p211d;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.qiyukf.basesdk.p120b.p121a.p130c.C1757a;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.basesdk.p138c.p143d.C1861b;
import com.qiyukf.basesdk.p138c.p143d.C1863d;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p176b.C2190f;
import com.qiyukf.nimlib.sdk.auth.LoginInfo;
import com.qiyukf.nimlib.service.NimService;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p213f.C2631b;
import com.qiyukf.unicorn.p213f.C2634c;
import com.qiyukf.unicorn.p229h.C2670d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.qiyukf.unicorn.d.a */
public final class C2460a {

    /* renamed from: a */
    public static Throwable f4831a;

    /* renamed from: b */
    public static AtomicBoolean f4832b = new AtomicBoolean(false);

    /* renamed from: com.qiyukf.unicorn.d.a$a */
    public enum EnumC2462a {
        f4834a,
        IN_WRONG_PROCESS,
        INIT_EXCEPTION,
        INIT_BUT_NET_BROKEN,
        INVALID_APP_KEY,
        ASSETS_ABSENT,
        SERVICE_NOT_DECLARED,
        NET_NOT_CONNECTED,
        CAN_NOT_CREATE_USER,
        STATUS_NOT_LOGIN,
        SESSION_STATUS,
        NOTIFICATION_NULL,
        NOTIFICATION_OFF,
        NOTIFICATION_NIM,
        IMAGE_LOADER_NULL
    }

    /* renamed from: com.qiyukf.unicorn.d.a$b */
    public static class C2463b {

        /* renamed from: a */
        public EnumC2462a f4850a;

        /* renamed from: b */
        public String f4851b;

        public C2463b(EnumC2462a aVar, String str) {
            this.f4850a = aVar;
            this.f4851b = str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089 A[SYNTHETIC, Splitter:B:43:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0091 A[Catch:{ IOException -> 0x008d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m5388a(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p211d.C2460a.m5388a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m5389a(List<C2463b> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("problems found: ");
        sb.append(System.getProperty("line.separator"));
        for (C2463b bVar : list) {
            sb.append("**" + bVar.f4850a + "** " + bVar.f4851b);
            sb.append(System.getProperty("line.separator"));
        }
        sb.append("============================");
        sb.append(System.getProperty("line.separator"));
        sb.append(C2464b.m5397a());
        sb.append(System.getProperty("line.separator"));
        return m5388a(sb.toString());
    }

    /* renamed from: a */
    public static void m5391a(final Context context) {
        if (!f4832b.getAndSet(true)) {
            C1805a.m3403a().mo34073c().post(new Runnable() {
                /* class com.qiyukf.unicorn.p211d.C2460a.RunnableC24611 */

                public final void run() {
                    String c = C2460a.m5394c(context);
                    String str = "log path: " + c;
                    Toast.makeText(context, "dump log to: " + c, 1).show();
                    C2460a.f4832b.set(false);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m5392a(Throwable th) {
        f4831a = th;
    }

    /* renamed from: c */
    public static String m5394c(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            ArrayList arrayList = new ArrayList();
            C2463b bVar = null;
            try {
                C2452d.m5353a();
            } catch (Throwable unused) {
                bVar = !C1863d.m3549b(applicationContext) ? new C2463b(EnumC2462a.IN_WRONG_PROCESS, C1863d.m3546a(applicationContext)) : f4831a != null ? new C2463b(EnumC2462a.INIT_EXCEPTION, Log.getStackTraceString(f4831a)) : new C2463b(EnumC2462a.f4834a, "unknown problem in initialization");
            }
            if (bVar == null) {
                bVar = m5395d(applicationContext);
            }
            if (bVar == null) {
                bVar = m5396e(applicationContext);
            }
            if (bVar != null) {
                arrayList.add(bVar);
                return m5389a(arrayList);
            }
            if (!C2205d.m4582e().logined()) {
                EnumC2462a aVar = EnumC2462a.STATUS_NOT_LOGIN;
                arrayList.add(new C2463b(aVar, "status is " + C2205d.m4582e()));
            }
            EnumC2462a aVar2 = EnumC2462a.SESSION_STATUS;
            C2670d g = C2452d.m5375g();
            arrayList.add(new C2463b(aVar2, "queue: " + g.mo36328a("-1") + ", type: " + g.mo36355f("-1") + ", isSelecting: " + C2670d.m6139j("-1")));
            if (C2452d.m5373e().statusBarNotificationConfig == null) {
                arrayList.add(new C2463b(EnumC2462a.NOTIFICATION_NULL, "notify config is not set"));
            }
            if (!C2437b.m5289l()) {
                arrayList.add(new C2463b(EnumC2462a.NOTIFICATION_OFF, "notify toggle is off now"));
            }
            try {
                Class.forName("com.netease.nim.sdk.NimClient");
                arrayList.add(new C2463b(EnumC2462a.NOTIFICATION_NIM, "maybe confusing with nim"));
            } catch (Exception unused2) {
            }
            if (C2452d.m5374f() == null) {
                arrayList.add(new C2463b(EnumC2462a.IMAGE_LOADER_NULL, "ImageLoader is null"));
            }
            return m5389a(arrayList);
        }
        throw new NullPointerException("diagnose context is null");
    }

    /* renamed from: d */
    public static C2463b m5395d(Context context) {
        if (new LoginInfo(C2437b.m5237a(), C2437b.m5251b()).valid()) {
            return null;
        }
        if (!C1861b.m3529b(context)) {
            return new C2463b(EnumC2462a.INIT_BUT_NET_BROKEN, "init when network is not available");
        }
        String d = C2452d.m5371d();
        if (TextUtils.isEmpty(d) || !d.toLowerCase().equals(d)) {
            return new C2463b(EnumC2462a.INVALID_APP_KEY, d);
        }
        try {
            C1757a.m3231a(C2190f.m4522a(), "GET", "Diagnose");
            try {
                C2631b a = C2634c.m5999a(d, C2437b.m5267d());
                if (a != null && a.mo36240a() != null && a.mo36240a().valid()) {
                    return new C2463b(EnumC2462a.f4834a, "unknown error when create nim user");
                }
                EnumC2462a aVar = EnumC2462a.CAN_NOT_CREATE_USER;
                return new C2463b(aVar, "appkey: " + d + ", response: " + a);
            } catch (Exception e) {
                EnumC2462a aVar2 = EnumC2462a.CAN_NOT_CREATE_USER;
                return new C2463b(aVar2, "appkey: " + d + ", " + Log.getStackTraceString(e));
            }
        } catch (Exception e2) {
            return new C2463b(EnumC2462a.NET_NOT_CONNECTED, Log.getStackTraceString(e2));
        }
    }

    /* renamed from: e */
    public static C2463b m5396e(Context context) {
        try {
            context.getAssets().open("keystore_unicorn");
            try {
                context.getPackageManager().getServiceInfo(new ComponentName(context.getPackageName(), NimService.class.getName()), 0);
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return new C2463b(EnumC2462a.SERVICE_NOT_DECLARED, "NimService not found in AndroidManifest");
            }
        } catch (IOException unused2) {
            return new C2463b(EnumC2462a.ASSETS_ABSENT, "assets folder is absent");
        }
    }
}
