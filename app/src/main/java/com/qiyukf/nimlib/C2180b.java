package com.qiyukf.nimlib;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.p118pd.sdk.C8783oo0oooOO;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.basesdk.AbstractC1717b;
import com.qiyukf.basesdk.C1708a;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1863d;
import com.qiyukf.basesdk.sdk.ServerAddresses;
import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.C2147d;
import com.qiyukf.nimlib.p155a.p162c.p163a.C2133a;
import com.qiyukf.nimlib.p179d.C2206a;
import com.qiyukf.nimlib.p179d.C2216g;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.sdk.SDKOptions;
import com.qiyukf.nimlib.sdk.auth.LoginInfo;
import com.qiyukf.nimlib.service.NimService;
import com.qiyukf.unicorn.analytics.C2379a;
import com.qiyukf.unicorn.api.StatusBarNotificationConfig;
import com.qiyukf.unicorn.p228g.C2654c;
import java.io.File;

/* renamed from: com.qiyukf.nimlib.b */
public final class C2180b {

    /* renamed from: i */
    public static C2180b f4351i;

    /* renamed from: j */
    public static AbstractC1717b f4352j = new AbstractC1717b() {
        /* class com.qiyukf.nimlib.C2180b.C21811 */

        @Override // com.qiyukf.basesdk.AbstractC1717b
        /* renamed from: a */
        public final String mo33870a() {
            return C2180b.m4482g();
        }

        @Override // com.qiyukf.basesdk.AbstractC1717b
        /* renamed from: b */
        public final int mo33871b() {
            return C2180b.m4479d().thumbnailSize;
        }

        @Override // com.qiyukf.basesdk.AbstractC1717b
        /* renamed from: c */
        public final ServerAddresses mo33872c() {
            return C2180b.m4484i();
        }

        @Override // com.qiyukf.basesdk.AbstractC1717b
        /* renamed from: d */
        public final String mo33873d() {
            String str = C1708a.m3005d() == null ? null : C1708a.m3005d().lbs;
            return TextUtils.isEmpty(str) ? "https://wanproxy.127.net/lbs" : str;
        }

        @Override // com.qiyukf.basesdk.AbstractC1717b
        /* renamed from: e */
        public final String mo33874e() {
            String str = C1708a.m3005d() == null ? null : C1708a.m3005d().nosUpload;
            return TextUtils.isEmpty(str) ? "nosup-hz1.127.net" : str;
        }

        @Override // com.qiyukf.basesdk.AbstractC1717b
        /* renamed from: f */
        public final void mo33875f() {
            C2133a aVar = new C2133a();
            aVar.mo34673f();
            C2130c.m4323a().mo34661a(aVar);
        }
    };

    /* renamed from: a */
    public Context f4353a;

    /* renamed from: b */
    public LoginInfo f4354b;

    /* renamed from: c */
    public Integer f4355c;

    /* renamed from: d */
    public SDKOptions f4356d;

    /* renamed from: e */
    public ServerAddresses f4357e;

    /* renamed from: f */
    public C2216g f4358f;

    /* renamed from: g */
    public String f4359g;

    /* renamed from: h */
    public String f4360h;

    /* renamed from: a */
    public static Context m4471a() {
        C2180b bVar = f4351i;
        if (bVar == null) {
            return null;
        }
        return bVar.f4353a;
    }

    /* renamed from: a */
    public static <T> T m4472a(Class<T> cls) {
        C2216g gVar;
        C2180b bVar = f4351i;
        if (bVar != null && (gVar = bVar.f4358f) != null) {
            return (T) gVar.mo34824a(cls);
        }
        throw new IllegalStateException("SDK not initialized or invoked in wrong process!");
    }

    /* renamed from: a */
    public static String m4473a(Context context) {
        C2180b bVar;
        String trim;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                return null;
            }
            if (TextUtils.isEmpty(m4479d().appKey)) {
                bVar = f4351i;
                trim = applicationInfo.metaData.getString("com.qiyukf.nim.appKey").trim();
            } else {
                bVar = f4351i;
                trim = m4479d().appKey.trim();
            }
            bVar.f4360h = trim;
            f4351i.f4359g = applicationInfo.packageName;
            return null;
        } catch (Exception e) {
            C1709a.m3015b("readAppKey is error", "", e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m4474a(Context context, LoginInfo loginInfo, SDKOptions sDKOptions, boolean z) {
        if (C2205d.m4583f() || C2205d.m4584g()) {
            C2180b bVar = new C2180b();
            f4351i = bVar;
            bVar.f4353a = context.getApplicationContext();
            C2180b bVar2 = f4351i;
            bVar2.f4356d = sDKOptions;
            bVar2.f4354b = loginInfo;
            m4473a(context);
            C1708a.m3002a(context, f4352j);
            C2349d.m5124a(context);
            C2191c.m4524a(z);
            String str = f4351i.f4360h;
            try {
                String str2 = context.getApplicationInfo().dataDir;
                C2106a.f4240a = str2;
                if (TextUtils.isEmpty(str2)) {
                    C2106a.f4240a = "/data/data/" + context.getPackageName();
                }
                if (context.getCacheDir() == null) {
                    C2106a.f4241b = "/data/data/" + context.getPackageName() + "/cache";
                    File file = new File(C2106a.f4241b);
                    if (!file.exists()) {
                        file.mkdir();
                    }
                } else {
                    C2106a.f4241b = context.getCacheDir().getAbsolutePath();
                }
            } catch (Exception e) {
                C1709a.m3015b("AppDir init is error", "", e);
            }
            C2106a.f4240a += C8932ooOOO0o.OooO0OO + str;
            C2106a.f4241b += C8932ooOOO0o.OooO0OO + str;
            C1709a.m3018d("AppDir", "DATA " + C2106a.f4240a);
            C1709a.m3018d("AppDir", "CACHE " + C2106a.f4241b);
            String a = C1863d.m3546a(context);
            C1709a.m3011a(C2205d.m4583f() ? C8783oo0oooOO.OooO0OO : "core", "SDK init, processName=" + a);
            if (C2205d.m4583f()) {
                C1709a.m3011a("NIM", "**** SDK Start " + context.getPackageName() + " **** Version: 5.7.1/73/6c24da4f ****");
                f4351i.f4358f = new C2216g();
                C2206a.m4589a();
                C2130c.m4323a().mo34664b();
                NimService.m5142a(context, 1);
            }
            if (C2205d.m4584g()) {
                C2654c.m6072a(context).mo36291a();
                if (!C2205d.m4583f()) {
                    f4351i.f4356d = null;
                }
            }
            C2379a.m5198a(context);
        }
    }

    /* renamed from: a */
    public static void m4475a(LoginInfo loginInfo) {
        m4485j().f4354b = loginInfo;
    }

    /* renamed from: a */
    public static void m4476a(StatusBarNotificationConfig statusBarNotificationConfig) {
        if (statusBarNotificationConfig != null) {
            m4479d().statusBarNotificationConfig = statusBarNotificationConfig;
        }
    }

    /* renamed from: b */
    public static String m4477b() {
        LoginInfo loginInfo;
        C2180b bVar = f4351i;
        if (bVar == null || (loginInfo = bVar.f4354b) == null) {
            return null;
        }
        return loginInfo.getAccount();
    }

    /* renamed from: c */
    public static Integer m4478c() {
        return m4485j().f4355c;
    }

    /* renamed from: d */
    public static SDKOptions m4479d() {
        return m4485j().f4356d == null ? SDKOptions.DEFAULT : f4351i.f4356d;
    }

    /* renamed from: e */
    public static LoginInfo m4480e() {
        C2180b bVar = f4351i;
        if (bVar == null) {
            return null;
        }
        return bVar.f4354b;
    }

    /* renamed from: f */
    public static String m4481f() {
        return m4485j().f4359g;
    }

    /* renamed from: g */
    public static String m4482g() {
        return m4485j().f4360h;
    }

    /* renamed from: h */
    public static String m4483h() {
        return C2147d.m4400b();
    }

    /* renamed from: i */
    public static ServerAddresses m4484i() {
        return m4485j().f4357e;
    }

    /* renamed from: j */
    public static C2180b m4485j() {
        C2180b bVar = f4351i;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("SDK not initialized, call NimClient.init() first!");
    }
}
