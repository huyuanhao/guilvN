package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.AbstractC4532iz;
import com.xiaomi.push.C4498hs;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.service.C4609ak;
import com.xiaomi.push.service.C4641bf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.android.agoo.xiaomi.MiPushRegistar;

public class MiTinyDataClient {
    public static final String PENDING_REASON_APPID = "com.xiaomi.xmpushsdk.tinydataPending.appId";
    public static final String PENDING_REASON_CHANNEL = "com.xiaomi.xmpushsdk.tinydataPending.channel";
    public static final String PENDING_REASON_INIT = "com.xiaomi.xmpushsdk.tinydataPending.init";

    /* renamed from: com.xiaomi.mipush.sdk.MiTinyDataClient$a */
    public static class C4178a {

        /* renamed from: a */
        public static C4178a f11199a;

        /* renamed from: a */
        public Context f11200a;

        /* renamed from: a */
        public C4179a f11201a = new C4179a();

        /* renamed from: a */
        public Boolean f11202a;

        /* renamed from: a */
        public String f11203a;

        /* renamed from: a */
        public final ArrayList<C4498hs> f11204a = new ArrayList<>();

        /* renamed from: com.xiaomi.mipush.sdk.MiTinyDataClient$a$a */
        public class C4179a {

            /* renamed from: a */
            public final Runnable f11206a = new RunnableC4192ak(this);

            /* renamed from: a */
            public final ArrayList<C4498hs> f11207a = new ArrayList<>();

            /* renamed from: a */
            public ScheduledFuture<?> f11208a;

            /* renamed from: a */
            public ScheduledThreadPoolExecutor f11209a = new ScheduledThreadPoolExecutor(1);

            public C4179a() {
            }

            /* renamed from: a */
            private void m11378a() {
                if (this.f11208a == null) {
                    this.f11208a = this.f11209a.scheduleAtFixedRate(this.f11206a, 1000, 1000, TimeUnit.MILLISECONDS);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void m11380b() {
                C4498hs remove = this.f11207a.remove(0);
                for (C4520in inVar : C4641bf.m14055a(Arrays.asList(remove), C4178a.this.f11200a.getPackageName(), C4209b.m11491a(C4178a.this.f11200a).m11495a(), 30720)) {
                    AbstractC4163b.m11305c("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification)." + remove.mo42029d());
                    C4204aw.m11444a(C4178a.this.f11200a).mo41404a((AbstractC4532iz) inVar, EnumC4494ho.Notification, true, (C4508ib) null);
                }
            }

            /* renamed from: a */
            public void mo41345a(C4498hs hsVar) {
                this.f11209a.execute(new RunnableC4191aj(this, hsVar));
            }
        }

        /* renamed from: a */
        public static C4178a mo41342a() {
            if (f11199a == null) {
                synchronized (C4178a.class) {
                    if (f11199a == null) {
                        f11199a = new C4178a();
                    }
                }
            }
            return f11199a;
        }

        /* renamed from: a */
        private void mo41343a(C4498hs hsVar) {
            synchronized (this.f11204a) {
                if (!this.f11204a.contains(hsVar)) {
                    this.f11204a.add(hsVar);
                    if (this.f11204a.size() > 100) {
                        this.f11204a.remove(0);
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean mo41340a(Context context) {
            if (!C4204aw.m11444a(context).m11482a()) {
                return true;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(MiPushRegistar.PACKAGE_XIAOMI, 4);
                return packageInfo != null && packageInfo.versionCode >= 108;
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: b */
        private boolean m11369b(Context context) {
            return C4209b.m11491a(context).m11495a() == null && !mo41340a(this.f11200a);
        }

        /* renamed from: b */
        private boolean m11370b(C4498hs hsVar) {
            if (C4641bf.m14057a(hsVar, false)) {
                return false;
            }
            if (this.f11202a.booleanValue()) {
                AbstractC4163b.m11305c("MiTinyDataClient Send item by PushServiceClient.sendTinyData(ClientUploadDataItem)." + hsVar.mo42029d());
                C4204aw.m11444a(this.f11200a).mo41399a(hsVar);
                return true;
            }
            this.f11201a.mo41345a(hsVar);
            return true;
        }

        /* renamed from: a */
        public void m11371a(Context context) {
            if (context == null) {
                AbstractC4163b.m11301a("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.f11200a = context;
            this.f11202a = Boolean.valueOf(mo41340a(context));
            mo41344b(MiTinyDataClient.PENDING_REASON_INIT);
        }

        /* renamed from: a */
        public synchronized void mo41341a(String str) {
            if (TextUtils.isEmpty(str)) {
                AbstractC4163b.m11301a("channel is null, MiTinyDataClientImp.setChannel(String) failed.");
                return;
            }
            this.f11203a = str;
            mo41344b(MiTinyDataClient.PENDING_REASON_CHANNEL);
        }

        /* renamed from: a */
        public boolean m11373a() {
            return this.f11200a != null;
        }

        /* renamed from: a */
        public synchronized boolean m11374a(C4498hs hsVar) {
            String str;
            boolean z = false;
            if (hsVar == null) {
                return false;
            }
            if (C4641bf.m14057a(hsVar, true)) {
                return false;
            }
            boolean z2 = TextUtils.isEmpty(hsVar.m12945a()) && TextUtils.isEmpty(this.f11203a);
            boolean z3 = !m11373a();
            if (this.f11200a == null || m11369b(this.f11200a)) {
                z = true;
            }
            if (z3 || z2 || z) {
                if (z2) {
                    str = "MiTinyDataClient Pending " + hsVar.mo42022b() + " reason is " + MiTinyDataClient.PENDING_REASON_CHANNEL;
                } else if (z3) {
                    str = "MiTinyDataClient Pending " + hsVar.mo42022b() + " reason is " + MiTinyDataClient.PENDING_REASON_INIT;
                } else {
                    if (z) {
                        str = "MiTinyDataClient Pending " + hsVar.mo42022b() + " reason is " + MiTinyDataClient.PENDING_REASON_APPID;
                    }
                    mo41343a(hsVar);
                    return true;
                }
                AbstractC4163b.m11305c(str);
                mo41343a(hsVar);
                return true;
            }
            AbstractC4163b.m11305c("MiTinyDataClient Send item immediately." + hsVar.mo42029d());
            if (TextUtils.isEmpty(hsVar.mo42029d())) {
                hsVar.mo42033f(C4609ak.m13938a());
            }
            if (TextUtils.isEmpty(hsVar.m12945a())) {
                hsVar.mo42018a(this.f11203a);
            }
            if (TextUtils.isEmpty(hsVar.mo42025c())) {
                hsVar.mo42030e(this.f11200a.getPackageName());
            }
            if (hsVar.mo42016a() <= 0) {
                hsVar.mo42020b(System.currentTimeMillis());
            }
            return m11370b(hsVar);
        }

        /* renamed from: b */
        public void mo41344b(String str) {
            AbstractC4163b.m11305c("MiTinyDataClient.processPendingList(" + str + C3848l.f10402t);
            ArrayList arrayList = new ArrayList();
            synchronized (this.f11204a) {
                arrayList.addAll(this.f11204a);
                this.f11204a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m11374a((C4498hs) it.next());
            }
        }
    }

    public static void init(Context context, String str) {
        if (context == null) {
            AbstractC4163b.m11301a("context is null, MiTinyDataClient.init(Context, String) failed.");
            return;
        }
        C4178a.mo41342a().m11371a(context);
        if (TextUtils.isEmpty(str)) {
            AbstractC4163b.m11301a("channel is null or empty, MiTinyDataClient.init(Context, String) failed.");
        } else {
            C4178a.mo41342a().mo41341a(str);
        }
    }

    public static boolean upload(Context context, C4498hs hsVar) {
        AbstractC4163b.m11305c("MiTinyDataClient.upload " + hsVar.mo42029d());
        if (!C4178a.mo41342a().m11373a()) {
            C4178a.mo41342a().m11371a(context);
        }
        return C4178a.mo41342a().m11374a(hsVar);
    }

    public static boolean upload(Context context, String str, String str2, long j, String str3) {
        C4498hs hsVar = new C4498hs();
        hsVar.mo42028d(str);
        hsVar.mo42024c(str2);
        hsVar.mo42017a(j);
        hsVar.mo42021b(str3);
        hsVar.mo42019a(true);
        hsVar.mo42018a("push_sdk_channel");
        return upload(context, hsVar);
    }

    public static boolean upload(String str, String str2, long j, String str3) {
        C4498hs hsVar = new C4498hs();
        hsVar.mo42028d(str);
        hsVar.mo42024c(str2);
        hsVar.mo42017a(j);
        hsVar.mo42021b(str3);
        return C4178a.mo41342a().m11374a(hsVar);
    }
}
