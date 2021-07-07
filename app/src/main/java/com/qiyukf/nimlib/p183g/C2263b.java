package com.qiyukf.nimlib.p183g;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1861b;
import com.qiyukf.basesdk.sdk.ResponseCode;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p180e.C2238d;
import com.qiyukf.nimlib.p183g.C2301d;
import com.qiyukf.nimlib.p183g.p184a.p186b.C2255c;
import com.qiyukf.nimlib.p183g.p184a.p186b.C2256d;
import com.qiyukf.nimlib.p183g.p188b.C2268b;
import com.qiyukf.nimlib.p183g.p188b.p190b.C2275a;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import com.qiyukf.nimlib.p198j.p202d.C2351b;
import com.qiyukf.nimlib.sdk.StatusCode;
import com.qiyukf.nimlib.sdk.auth.LoginInfo;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.qiyukf.nimlib.g.b */
public final class C2263b implements C2301d.AbstractC2305a {

    /* renamed from: a */
    public AtomicReference<StatusCode> f4503a = new AtomicReference<>(StatusCode.UNLOGIN);

    /* renamed from: b */
    public Context f4504b;

    /* renamed from: c */
    public C2268b f4505c;

    /* renamed from: d */
    public C2301d f4506d;

    /* renamed from: e */
    public C2255c f4507e;

    /* renamed from: f */
    public Handler f4508f;

    /* renamed from: g */
    public Runnable f4509g = new Runnable() {
        /* class com.qiyukf.nimlib.p183g.C2263b.RunnableC22641 */

        public final void run() {
            AbstractC2148a.C2149a a;
            if (C2263b.this.f4503a.get() == StatusCode.LOGINING && C2263b.this.f4507e != null && (a = AbstractC2148a.C2149a.m4409a(C2263b.this.f4507e.mo34667a(), ResponseCode.RES_ETIMEOUT)) != null) {
                C2307f.m4934a().mo34994a(a);
            }
        }
    };

    /* renamed from: a */
    private void m4747a(StatusCode statusCode) {
        if (this.f4503a.get() != statusCode && !this.f4503a.get().wontAutoLogin()) {
            if (statusCode.wontAutoLogin()) {
                this.f4506d.mo34985a();
            }
            this.f4503a.set(statusCode);
            this.f4506d.mo34987a(statusCode);
            C2205d.m4570a(statusCode);
            C2238d.m4683a(statusCode);
            C1709a.m3018d("AuthManager", "status change to: " + statusCode);
        }
    }

    /* renamed from: e */
    private boolean m4749e() {
        if (!m4750f()) {
            return false;
        }
        this.f4505c.mo34903a();
        m4747a(StatusCode.CONNECTING);
        this.f4506d.mo34986a(this.f4504b);
        this.f4505c.mo34906a(C2275a.m4806a().mo34912b());
        return true;
    }

    /* renamed from: f */
    public static boolean m4750f() {
        LoginInfo e = C2180b.m4480e();
        return e != null && e.valid();
    }

    /* renamed from: g */
    private Handler m4751g() {
        if (this.f4508f == null) {
            this.f4508f = new Handler(this.f4504b.getMainLooper());
        }
        return this.f4508f;
    }

    /* renamed from: h */
    public static final String m4752h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("PRODUCT", Build.PRODUCT);
            jSONObject.put("DEVICE", Build.DEVICE);
            jSONObject.put("MANUFACTURER", Build.MANUFACTURER);
            jSONObject.put("BRAND", Build.BRAND);
            jSONObject.put("MODEL", Build.MODEL);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public final void mo34892a() {
        m4747a(StatusCode.UNLOGIN);
        C2301d dVar = this.f4506d;
        if (dVar != null) {
            dVar.mo34985a();
            this.f4506d = null;
        }
        this.f4504b = null;
        this.f4505c = null;
    }

    /* renamed from: a */
    public final void mo34893a(int i) {
        C1709a.m3018d("core", "on connect change " + i);
        if (i == 0) {
            boolean c = C1861b.m3530c(this.f4504b);
            C1709a.m3011a("core", "on connection broken, network connected=" + c);
            C1709a.m3011a("connection Tag", "network connected=" + c);
            m4747a(c ? StatusCode.UNLOGIN : StatusCode.NET_BROKEN);
            if (!m4750f()) {
                this.f4506d.mo34985a();
            }
        } else if (i == 2 && m4750f()) {
            m4747a(StatusCode.LOGINING);
            C2255c cVar = new C2255c();
            this.f4507e = cVar;
            C2293b bVar = new C2293b();
            if (C2180b.m4478c() != null) {
                bVar.mo34954a(1, C2180b.m4478c().intValue());
            }
            bVar.mo34954a(3, 1);
            bVar.mo34955a(19, C2180b.m4480e().getAccount());
            bVar.mo34955a(18, C2180b.m4482g());
            bVar.mo34955a(1000, C2180b.m4480e().getToken());
            bVar.mo34954a(6, 16);
            bVar.mo34955a(25, C2180b.m4481f());
            bVar.mo34954a(9, 1);
            bVar.mo34955a(4, Build.PRODUCT + "$$" + Build.MODEL + "$$" + Build.VERSION.SDK_INT);
            bVar.mo34955a(13, C2306e.m4923a());
            String g = C1861b.m3534g(this.f4504b);
            if (!TextUtils.isEmpty(g)) {
                bVar.mo34955a(5, g);
            }
            bVar.mo34955a(14, C1861b.m3537j(this.f4504b));
            String a = C2351b.m5135a();
            if (!TextUtils.isEmpty(a)) {
                bVar.mo34955a(28, a);
            }
            String b = C2351b.m5136b();
            if (!TextUtils.isEmpty(b)) {
                bVar.mo34955a(29, b);
            }
            bVar.mo34955a(31, C2351b.m5137c());
            bVar.mo34955a(32, m4752h());
            bVar.mo34954a(8, 1);
            cVar.mo34880a(bVar);
            C2307f.m4934a().mo34993a(this.f4507e);
            m4751g().removeCallbacks(this.f4509g);
            m4751g().postDelayed(this.f4509g, 30000);
        }
    }

    /* renamed from: a */
    public final void mo34894a(int i, int i2) {
        StatusCode statusCode = StatusCode.KICKOUT;
        if (i == 2) {
            statusCode = StatusCode.FORBIDDEN;
        } else if (i == 3) {
            statusCode = StatusCode.KICK_BY_OTHER_CLIENT;
        }
        C2205d.m4568a(i2);
        C2180b.m4475a((LoginInfo) null);
        C1709a.m3011a("connection Tag", "AuthManager onKickOut");
        m4747a(statusCode);
    }

    /* renamed from: a */
    public final void mo34895a(Context context, C2268b bVar) {
        this.f4504b = context;
        this.f4505c = bVar;
        this.f4506d = new C2301d(this);
        if (m4750f()) {
            mo34896a(C2180b.m4480e());
        }
    }

    /* renamed from: a */
    public final void mo34896a(LoginInfo loginInfo) {
        if (!this.f4503a.get().logined()) {
            if (loginInfo == null || !loginInfo.valid()) {
                throw new IllegalArgumentException("LoginInfo is invalid!");
            }
            this.f4503a.set(StatusCode.UNLOGIN);
            C2180b.m4475a(loginInfo);
            m4749e();
        }
    }

    /* renamed from: a */
    public final void mo34897a(boolean z) {
        if (z) {
            C2180b.m4475a((LoginInfo) null);
        }
        C2307f.m4934a().mo34993a(new C2256d());
        C1709a.m3011a("connection Tag", "AuthManage logout");
        m4747a(StatusCode.UNLOGIN);
    }

    @Override // com.qiyukf.nimlib.p183g.C2301d.AbstractC2305a
    /* renamed from: b */
    public final void mo34898b() {
        if (this.f4503a.get() != StatusCode.LOGINING && this.f4503a.get() != StatusCode.LOGINED) {
            m4749e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r3 != 404) goto L_0x0030;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34899b(int r3) {
        /*
            r2 = this;
            android.os.Handler r0 = r2.m4751g()
            java.lang.Runnable r1 = r2.f4509g
            r0.removeCallbacks(r1)
            r0 = 0
            r2.f4507e = r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r3 == r1) goto L_0x003f
            r1 = 302(0x12e, float:4.23E-43)
            if (r3 == r1) goto L_0x003c
            r1 = 317(0x13d, float:4.44E-43)
            if (r3 == r1) goto L_0x0039
            r1 = 414(0x19e, float:5.8E-43)
            if (r3 == r1) goto L_0x003c
            r1 = 417(0x1a1, float:5.84E-43)
            if (r3 == r1) goto L_0x0036
            r1 = 422(0x1a6, float:5.91E-43)
            if (r3 == r1) goto L_0x0033
            r1 = 431(0x1af, float:6.04E-43)
            if (r3 == r1) goto L_0x0030
            r1 = 403(0x193, float:5.65E-43)
            if (r3 == r1) goto L_0x0033
            r1 = 404(0x194, float:5.66E-43)
            if (r3 == r1) goto L_0x003c
        L_0x0030:
            com.qiyukf.nimlib.sdk.StatusCode r3 = com.qiyukf.nimlib.sdk.StatusCode.UNLOGIN
            goto L_0x0041
        L_0x0033:
            com.qiyukf.nimlib.sdk.StatusCode r3 = com.qiyukf.nimlib.sdk.StatusCode.FORBIDDEN
            goto L_0x0041
        L_0x0036:
            com.qiyukf.nimlib.sdk.StatusCode r3 = com.qiyukf.nimlib.sdk.StatusCode.KICKOUT
            goto L_0x0041
        L_0x0039:
            com.qiyukf.nimlib.sdk.StatusCode r3 = com.qiyukf.nimlib.sdk.StatusCode.VER_ERROR
            goto L_0x0041
        L_0x003c:
            com.qiyukf.nimlib.sdk.StatusCode r3 = com.qiyukf.nimlib.sdk.StatusCode.PWD_ERROR
            goto L_0x0041
        L_0x003f:
            com.qiyukf.nimlib.sdk.StatusCode r3 = com.qiyukf.nimlib.sdk.StatusCode.LOGINED
        L_0x0041:
            boolean r1 = r3.wontAutoLogin()
            if (r1 == 0) goto L_0x004f
            com.qiyukf.nimlib.g.b.b r1 = r2.f4505c
            r1.mo34903a()
            com.qiyukf.nimlib.C2180b.m4475a(r0)
        L_0x004f:
            java.lang.String r0 = "connection Tag"
            java.lang.String r1 = "on loginDone"
            com.qiyukf.basesdk.p119a.C1709a.m3011a(r0, r1)
            r2.m4747a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p183g.C2263b.mo34899b(int):void");
    }

    @Override // com.qiyukf.nimlib.p183g.C2301d.AbstractC2305a
    /* renamed from: c */
    public final void mo34900c() {
        C1709a.m3011a("core", "on network unavailable");
        C1709a.m3011a("connection Tag", "on network unavailable");
        this.f4505c.mo34903a();
        m4747a(StatusCode.NET_BROKEN);
    }

    /* renamed from: d */
    public final void mo34901d() {
        if (C2205d.m4582e().shouldReLogin()) {
            this.f4506d.mo34988b();
        }
    }
}
