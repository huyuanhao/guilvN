package com.qiyukf.nimlib.p155a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.ExecutorC1854d;
import com.qiyukf.basesdk.sdk.ResponseCode;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p155a.p157b.C2117b;
import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p175f.AbstractC2177c;
import com.qiyukf.nimlib.p155a.p175f.C2175a;
import com.qiyukf.nimlib.p155a.p175f.C2176b;
import com.qiyukf.nimlib.p155a.p175f.C2178d;
import com.qiyukf.nimlib.p177c.C2204c;
import com.qiyukf.nimlib.p179d.C2206a;
import com.qiyukf.nimlib.p179d.C2218i;
import com.qiyukf.nimlib.p180e.C2232b;
import com.qiyukf.nimlib.p180e.p181a.C2227a;
import com.qiyukf.nimlib.p180e.p181a.C2231b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2299f;
import com.qiyukf.nimlib.p195h.C2314b;
import com.qiyukf.nimlib.p196i.C2327a;
import com.qiyukf.nimlib.sdk.StatusCode;
import com.qiyukf.nimlib.sdk.auth.AuthServiceObserver;
import com.qiyukf.nimlib.sdk.auth.LoginInfo;
import com.qiyukf.unicorn.api.SavePowerConfig;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import java.util.ArrayList;

/* renamed from: com.qiyukf.nimlib.a.c */
public class C2130c {

    /* renamed from: f */
    public static C2130c f4275f;

    /* renamed from: h */
    public static long f4276h;

    /* renamed from: a */
    public C2178d f4277a = new C2178d();

    /* renamed from: b */
    public ExecutorC1854d f4278b;

    /* renamed from: c */
    public C2117b f4279c;

    /* renamed from: d */
    public C2232b f4280d;

    /* renamed from: e */
    public C2218i f4281e;

    /* renamed from: g */
    public StatusCode f4282g;

    public C2130c() {
        ExecutorC1854d dVar = new ExecutorC1854d("Response", ExecutorC1854d.f3415c, false);
        this.f4278b = dVar;
        this.f4279c = new C2117b(false, dVar, this.f4277a);
        this.f4280d = new C2232b(C2180b.m4471a());
        this.f4282g = StatusCode.UNLOGIN;
    }

    /* renamed from: a */
    public static C2130c m4323a() {
        if (f4275f == null) {
            synchronized (C2130c.class) {
                if (f4275f == null) {
                    f4275f = new C2130c();
                }
            }
        }
        return f4275f;
    }

    /* renamed from: a */
    public static void m4324a(ArrayList<C2107a> arrayList) {
        C2205d.m4572a(arrayList);
        C2206a.m4590a(AuthServiceObserver.class.getSimpleName() + "/observeOtherClients", arrayList);
    }

    /* renamed from: e */
    private void m4325e() {
        C2180b.m4475a((LoginInfo) null);
        C2314b.m4972a().mo35040b();
        this.f4278b.mo34122b();
        this.f4277a.mo34760b();
        C2204c.m4563a().mo34814c();
        mo34664b();
    }

    /* renamed from: f */
    private synchronized void m4326f() {
        if (!TextUtils.isEmpty(C2180b.m4477b()) && !C2204c.m4563a().mo34813b()) {
            C2204c.m4563a().mo34812a(C2180b.m4471a(), C2180b.m4477b());
        }
    }

    /* renamed from: a */
    public final AbstractC2131a mo34653a(AbstractC2148a aVar) {
        return this.f4277a.mo34761c(aVar);
    }

    /* renamed from: a */
    public final void mo34654a(int i) {
        this.f4280d.mo34854a(i);
    }

    /* renamed from: a */
    public final void mo34655a(AbstractC2148a.C2149a aVar) {
        this.f4279c.mo34640a(aVar);
    }

    /* renamed from: a */
    public final void mo34656a(C2218i iVar, LoginInfo loginInfo) {
        if (C2205d.m4582e() == StatusCode.LOGINED) {
            iVar.mo34830b(C2180b.m4480e());
            C2206a.m4593c(iVar);
            return;
        }
        C2180b.m4475a(loginInfo);
        this.f4281e = iVar;
        this.f4280d.mo34856a(loginInfo);
    }

    /* renamed from: a */
    public final void mo34657a(C2227a aVar) {
        AbstractC2148a.C2149a aVar2 = new AbstractC2148a.C2149a();
        aVar2.f4312a = aVar.mo34847b();
        if (aVar.mo34848c() != null) {
            aVar2.f4313b = new C2299f(aVar.mo34848c());
        }
        this.f4279c.mo34640a(aVar2);
    }

    /* renamed from: a */
    public final void mo34658a(C2231b bVar) {
        StatusCode statusCode;
        C2205d.m4568a(bVar.f4443c);
        C2180b.m4475a(bVar.f4442b);
        C1709a.m3011a("uicore", "set status from " + this.f4282g + " to " + bVar.f4441a);
        StatusCode statusCode2 = bVar.f4441a;
        if ((statusCode2 != StatusCode.CONNECTING && statusCode2 != StatusCode.LOGINING) || this.f4282g != StatusCode.LOGINED) {
            C2205d.m4570a(bVar.f4441a);
            if (bVar.f4441a.logined()) {
                m4326f();
            } else if (bVar.f4441a.wontAutoLogin()) {
                m4325e();
            } else if (this.f4281e != null && !this.f4282g.shouldReLogin() && bVar.f4441a.shouldReLogin()) {
                mo34660a(ResponseCode.RES_ECONNECTION);
            }
            if ((!this.f4282g.logined() || bVar.f4441a.logined()) && this.f4282g != (statusCode = bVar.f4441a) && statusCode == StatusCode.LOGINED) {
                this.f4277a.mo34762c();
                C2327a.m5058a().mo35077a(C2180b.m4471a());
            }
            StatusCode statusCode3 = bVar.f4441a;
            this.f4282g = statusCode3;
            C2206a.m4590a(AuthServiceObserver.class.getSimpleName() + "/observeOnlineStatus", statusCode3);
        }
    }

    /* renamed from: a */
    public final void mo34659a(SavePowerConfig savePowerConfig) {
        this.f4280d.mo34857a(savePowerConfig);
    }

    /* renamed from: a */
    public final void mo34660a(short s) {
        C2218i iVar = this.f4281e;
        if (iVar != null) {
            iVar.mo34825a(s);
            if (s == 200) {
                m4326f();
                this.f4281e.mo34826a(C2180b.m4480e());
            } else {
                C2180b.m4475a((LoginInfo) null);
            }
            C2206a.m4593c(this.f4281e);
            this.f4281e = null;
        }
    }

    /* renamed from: a */
    public final boolean mo34661a(AbstractC2131a aVar) {
        return mo34662a(aVar, C2175a.f4335a);
    }

    /* renamed from: a */
    public final boolean mo34662a(AbstractC2131a aVar, C2175a aVar2) {
        return mo34663a(new C2176b(aVar, aVar2));
    }

    /* renamed from: a */
    public final boolean mo34663a(AbstractC2177c cVar) {
        boolean z = false;
        if (cVar == null) {
            return false;
        }
        AbstractC2131a b = cVar.mo34752b();
        b.mo34667a().mo34939a(C2110b.m4281a(false));
        if (C2205d.m4582e() == StatusCode.LOGINED) {
            z = true;
        }
        boolean a = cVar.mo34755d() > 0 ? this.f4277a.mo34759a(cVar) : z;
        mo34666d();
        if (z) {
            this.f4280d.mo34855a(new C2227a(b));
        }
        if (!a) {
            cVar.mo34753a(ResponseCode.RES_ECONNECTION);
        }
        return a;
    }

    /* renamed from: b */
    public final void mo34664b() {
        this.f4278b.mo34120a();
        this.f4277a.mo34758a();
        m4326f();
    }

    /* renamed from: c */
    public final void mo34665c() {
        this.f4281e = null;
        this.f4280d.mo34853a();
        C2205d.m4570a(StatusCode.UNLOGIN);
        m4325e();
    }

    /* renamed from: d */
    public final void mo34666d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f4276h > TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE) {
            f4276h = elapsedRealtime;
            this.f4280d.mo34858b();
        }
    }
}
