package com.qiyukf.unicorn;

import android.app.Instrumentation;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1877b;
import com.qiyukf.nim.uikit.session.emoji.C1995i;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2191c;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.SDKOptions;
import com.qiyukf.nimlib.sdk.auth.AuthService;
import com.qiyukf.unicorn.analytics.C2379a;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.api.StatusBarNotificationConfig;
import com.qiyukf.unicorn.api.Unicorn;
import com.qiyukf.unicorn.api.UnicornImageLoader;
import com.qiyukf.unicorn.api.YSFOptions;
import com.qiyukf.unicorn.api.YSFUserInfo;
import com.qiyukf.unicorn.apicloud.QYResUtils;
import com.qiyukf.unicorn.p209b.C2436a;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p210c.C2447a;
import com.qiyukf.unicorn.p211d.C2460a;
import com.qiyukf.unicorn.p213f.C2484a;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2613i;
import com.qiyukf.unicorn.p213f.p223b.C2632a;
import com.qiyukf.unicorn.p228g.C2657d;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p229h.C2670d;
import com.qiyukf.unicorn.p230i.C2683b;
import com.qiyukf.unicorn.p230i.InstrumentationC2682a;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p232k.AbstractC2694b;
import com.qiyukf.unicorn.p232k.C2711j;
import com.qiyukf.unicorn.p232k.C2713k;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.d */
public final class C2452d {

    /* renamed from: h */
    public static boolean f4804h;

    /* renamed from: i */
    public static boolean f4805i;

    /* renamed from: j */
    public static final Object f4806j = new Object();

    /* renamed from: k */
    public static C2452d f4807k;

    /* renamed from: l */
    public static List<AbstractC2459a> f4808l = new ArrayList();

    /* renamed from: a */
    public Context f4809a;

    /* renamed from: b */
    public String f4810b;

    /* renamed from: c */
    public YSFOptions f4811c;

    /* renamed from: d */
    public UnicornImageLoader f4812d;

    /* renamed from: e */
    public C2670d f4813e;

    /* renamed from: f */
    public C2438c f4814f;

    /* renamed from: g */
    public C2484a f4815g;

    /* renamed from: com.qiyukf.unicorn.d$a */
    public interface AbstractC2459a {
        /* renamed from: a */
        void mo34456a();
    }

    /* renamed from: a */
    public static C2452d m5353a() {
        C2452d dVar = f4807k;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("QIYU not initialized!");
    }

    /* renamed from: a */
    public static C2452d m5354a(Context context, final String str, final YSFOptions ySFOptions, final UnicornImageLoader unicornImageLoader) {
        final Context applicationContext = context.getApplicationContext();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m5369c(applicationContext, str, ySFOptions, unicornImageLoader);
        } else {
            C2713k.m6274b(new Runnable() {
                /* class com.qiyukf.unicorn.C2452d.RunnableC24531 */

                public final void run() {
                    C2452d.m5369c(applicationContext, str, ySFOptions, unicornImageLoader);
                    synchronized (C2452d.f4806j) {
                        C2452d.f4806j.notifyAll();
                    }
                }
            });
            try {
                synchronized (f4806j) {
                    f4806j.wait();
                }
            } catch (InterruptedException unused) {
                C1709a.m3020e(Unicorn.TAG, "init in background thread interrupt");
            }
        }
        return f4807k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r0 = com.qiyukf.unicorn.p209b.C2436a.m5232a(r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5355a(final android.content.Context r2) {
        /*
            boolean r0 = com.qiyukf.unicorn.C2452d.f4805i
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            com.qiyukf.unicorn.b.a r0 = com.qiyukf.unicorn.p209b.C2436a.m5232a(r2)
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            com.qiyukf.unicorn.d$3 r1 = new com.qiyukf.unicorn.d$3
            r1.<init>(r2, r0)
            com.qiyukf.unicorn.p232k.C2713k.m6274b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.C2452d.m5355a(android.content.Context):void");
    }

    /* renamed from: a */
    public static void m5358a(AbstractC2459a aVar) {
        if (!f4808l.contains(aVar)) {
            f4808l.add(aVar);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m5359a(C2452d dVar, Context context) {
        C2447a.m5340a(context);
        dVar.f4813e = new C2670d(context);
        dVar.f4814f = new C2438c();
        dVar.f4815g = new C2484a();
        C1995i.m3963a().mo34441b();
        C2683b.m6190a();
        if (m5353a().f4811c.autoTrackUser) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(cls, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInstrumentation");
                declaredField.setAccessible(true);
                declaredField.set(invoke, new InstrumentationC2682a((Instrumentation) declaredField.get(invoke)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C2690a a = C2690a.m6219a();
        C1709a.m3011a("UIConfigManager", "is init...");
        a.mo36460b();
        C1877b.m3579a(context, dVar.f4813e.mo36329a());
    }

    /* renamed from: a */
    public static void m5360a(String str, long j) {
        ((AuthService) NIMClient.getService(AuthService.class)).changeSaverMode(1);
        C2667c.m6115a((AbstractC2597e) new C2613i(C2437b.m5267d(), j), str, true);
    }

    /* renamed from: b */
    public static /* synthetic */ void m5361b(Context context, String str, YSFOptions ySFOptions) {
        StatusBarNotificationConfig statusBarNotificationConfig = ySFOptions.statusBarNotificationConfig;
        SDKOptions sDKOptions = new SDKOptions();
        sDKOptions.appKey = str;
        sDKOptions.statusBarNotificationConfig = statusBarNotificationConfig;
        sDKOptions.userInfoProvider = null;
        NIMClient.init(context, C2484a.m5470b(), sDKOptions, ySFOptions.logSwitch);
    }

    /* renamed from: b */
    public static void m5363b(Context context, Throwable th) {
        C1709a.m3019d(Unicorn.TAG, "init error.", th);
        if (C2205d.m4583f()) {
            C2460a.m5392a(th);
        }
        C2379a.m5198a(context);
        C2379a.m5200a(th);
    }

    /* renamed from: b */
    public static void m5365b(AbstractC2459a aVar) {
        f4808l.remove(aVar);
    }

    /* renamed from: b */
    public static boolean m5366b() {
        return f4805i;
    }

    /* renamed from: c */
    public static Context m5367c() {
        return m5353a().f4809a;
    }

    /* renamed from: c */
    public static void m5368c(final Context context, final String str, final YSFOptions ySFOptions) {
        try {
            if (f4804h) {
                C1709a.m3020e(Unicorn.TAG, "initialize has started");
                return;
            }
            f4804h = true;
            C2205d.m4569a(context);
            C2711j.m6271a(context);
            C2437b.m5241a(context, str);
            if (C2205d.m4583f()) {
                C1865f.m3556a(context);
                C1862c.m3541a(context);
                QYResUtils.init(context);
                C2452d dVar = new C2452d();
                f4807k = dVar;
                dVar.f4809a = context;
                dVar.f4810b = str;
                dVar.f4811c = ySFOptions == null ? YSFOptions.DEFAULT : ySFOptions;
            }
            C2713k.m6273a(new Runnable() {
                /* class com.qiyukf.unicorn.C2452d.RunnableC24575 */

                public final void run() {
                    try {
                        if (C2205d.m4583f()) {
                            C2436a.m5233a(context, str, ySFOptions);
                        }
                        C2452d.m5361b(context, str, ySFOptions == null ? YSFOptions.DEFAULT : ySFOptions);
                        if (C2205d.m4583f()) {
                            C2452d.m5359a(C2452d.f4807k, context);
                            C2460a.m5392a((Throwable) null);
                        }
                        boolean unused = C2452d.f4805i = true;
                        C2713k.m6274b(new Runnable() {
                            /* class com.qiyukf.unicorn.C2452d.RunnableC24575.RunnableC24581 */

                            public final void run() {
                                for (AbstractC2459a aVar : C2452d.f4808l) {
                                    if (aVar != null) {
                                        aVar.mo34456a();
                                    }
                                }
                            }
                        });
                    } catch (Throwable th) {
                        C2452d.m5363b(context, th);
                    }
                }
            });
        } catch (Throwable th) {
            m5363b(context, th);
        }
    }

    /* renamed from: c */
    public static void m5369c(Context context, String str, final YSFOptions ySFOptions, final UnicornImageLoader unicornImageLoader) {
        try {
            if (f4805i) {
                m5370c(ySFOptions);
            } else {
                m5368c(context, str, ySFOptions);
            }
            C2713k.m6273a(new Runnable() {
                /* class com.qiyukf.unicorn.C2452d.RunnableC24542 */

                public final void run() {
                    try {
                        if (C2205d.m4583f()) {
                            C2452d.m5372d(ySFOptions);
                            C2452d.f4807k.f4812d = unicornImageLoader;
                        }
                        if (C2205d.m4584g()) {
                            C2657d.m6078a().mo36296a(ySFOptions.savePowerConfig);
                        }
                    } catch (Throwable th) {
                        C1709a.m3019d(Unicorn.TAG, "init error", th);
                    }
                }
            });
        } catch (Throwable th) {
            C1709a.m3019d(Unicorn.TAG, "init error", th);
        }
    }

    /* renamed from: c */
    public static void m5370c(YSFOptions ySFOptions) {
        if (ySFOptions == null) {
            return;
        }
        if (C2205d.m4583f() || C2205d.m4584g()) {
            C2180b.m4479d().statusBarNotificationConfig = ySFOptions.statusBarNotificationConfig;
            C2191c.m4524a(ySFOptions.logSwitch);
            if (C2205d.m4583f()) {
                f4807k.f4811c = ySFOptions;
            }
        }
    }

    /* renamed from: d */
    public static String m5371d() {
        return m5353a().f4810b;
    }

    /* renamed from: d */
    public static void m5372d(YSFOptions ySFOptions) {
        if (ySFOptions != null && ySFOptions.savePowerConfig != null && !TextUtils.equals(C2437b.m5291m(), ySFOptions.savePowerConfig.deviceIdentifier)) {
            C2437b.m5265c(false);
            C2437b.m5292n(ySFOptions.savePowerConfig.deviceIdentifier);
        }
    }

    /* renamed from: e */
    public static YSFOptions m5373e() {
        return m5353a().f4811c;
    }

    /* renamed from: f */
    public static UnicornImageLoader m5374f() {
        return m5353a().f4812d;
    }

    /* renamed from: g */
    public static C2670d m5375g() {
        return m5353a().f4813e;
    }

    /* renamed from: h */
    public static C2438c m5376h() {
        C2452d dVar = f4807k;
        if (dVar == null) {
            return null;
        }
        return dVar.f4814f;
    }

    /* renamed from: a */
    public final void mo35675a(YSFOptions ySFOptions) {
        if (f4805i && ySFOptions != null) {
            try {
                m5370c(ySFOptions);
                if (C2205d.m4583f()) {
                    C2436a.m5233a(this.f4809a, this.f4810b, ySFOptions);
                    m5372d(ySFOptions);
                    ((AuthService) NIMClient.getService(AuthService.class)).updateSavePowerConfig(ySFOptions.savePowerConfig);
                }
            } catch (Throwable th) {
                C1709a.m3019d(Unicorn.TAG, "update options error.", th);
            }
        }
    }

    /* renamed from: a */
    public final void mo35676a(final String str, final String str2) {
        new AbstractC2694b<Void, Void>("Unicorn-HTTP") {
            /* class com.qiyukf.unicorn.C2452d.C24564 */

            /* access modifiers changed from: private */
            /* renamed from: b */
            public Void mo34446a() {
                String d = C2437b.m5267d();
                String d2 = C2452d.m5371d();
                String str = str;
                String str2 = str2;
                HashMap hashMap = new HashMap(4);
                hashMap.put("appkey", d2);
                hashMap.put("deviceid", d);
                hashMap.put("uri", str);
                hashMap.put("title", str2);
                try {
                    C2632a.m5993a("/webapi/user/accesshistory.action", hashMap);
                    return null;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return null;
                }
            }
        }.mo36463a((Object[]) new Void[0]);
    }

    /* renamed from: a */
    public final boolean mo35677a(YSFUserInfo ySFUserInfo, RequestCallback<Void> requestCallback) {
        try {
            ((AuthService) NIMClient.getService(AuthService.class)).changeSaverMode(1);
            return this.f4815g.mo35754a(ySFUserInfo, requestCallback);
        } catch (Throwable th) {
            C1709a.m3019d(Unicorn.TAG, "setUserInfo exception.", th);
            return false;
        }
    }

    /* renamed from: i */
    public final boolean mo35678i() {
        return this.f4815g.mo35753a();
    }
}
