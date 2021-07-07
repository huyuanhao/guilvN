package com.qiyukf.unicorn.p213f;

import android.os.Handler;
import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import com.p118pd.sdk.C7383o0OOO0O;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nim.uikit.C1877b;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.StatusCode;
import com.qiyukf.nimlib.sdk.auth.AuthService;
import com.qiyukf.nimlib.sdk.auth.AuthServiceObserver;
import com.qiyukf.nimlib.sdk.auth.LoginInfo;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.model.CustomNotification;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.api.YSFUserInfo;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2566b;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2607c;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2626v;
import com.qiyukf.unicorn.p213f.p223b.C2632a;
import com.qiyukf.unicorn.p228g.C2651b;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p232k.AbstractC2694b;
import com.qiyukf.unicorn.p232k.C2716n;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.f.a */
public final class C2484a {

    /* renamed from: a */
    public String f4934a = C2437b.m5278g();

    /* renamed from: b */
    public AtomicBoolean f4935b = new AtomicBoolean(false);

    /* renamed from: c */
    public Handler f4936c = C1805a.m3404b();

    /* renamed from: d */
    public RequestCallback<Void> f4937d;

    /* renamed from: e */
    public int f4938e = 1;

    /* renamed from: f */
    public RunnableC2497a f4939f = new RunnableC2497a(this, (byte) 0);

    /* renamed from: g */
    public Observer<StatusCode> f4940g = new Observer<StatusCode>() {
        /* class com.qiyukf.unicorn.p213f.C2484a.C24925 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(StatusCode statusCode) {
            StatusCode statusCode2 = statusCode;
            if (statusCode2 == StatusCode.LOGINED) {
                C2484a.this.f4938e = 0;
                C2484a.this.f4936c.removeCallbacks(C2484a.this.f4939f);
                C2484a.this.f4935b.set(false);
                C2452d.m5376h().mo35660b();
                C2452d.m5375g().mo36356f();
                C2651b.m6069a();
                C2484a.m5484j(C2484a.this);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - C2437b.m5300r() >= 86400000) {
                    C2667c.m6115a((AbstractC2597e) new C2626v(C2452d.m5367c()), C2667c.m6116a(), true);
                    C2437b.m5239a(currentTimeMillis);
                }
            } else if (statusCode2.wontAutoLogin()) {
                C2484a.this.m5480f();
            }
        }
    };

    /* renamed from: h */
    public Observer<CustomNotification> f4941h = new Observer<CustomNotification>() {
        /* class com.qiyukf.unicorn.p213f.C2484a.C24936 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(CustomNotification customNotification) {
            AbstractC2597e attachment = customNotification.getAttachment();
            if (attachment.getCmdId() != 41) {
                return;
            }
            if (((C2566b) attachment).mo36018a() == 1) {
                C2484a.this.m5472b((C2484a) 200);
            } else {
                C2484a.this.m5472b((C2484a) 414);
            }
        }
    };

    /* renamed from: i */
    public Runnable f4942i = new Runnable() {
        /* class com.qiyukf.unicorn.p213f.C2484a.RunnableC24947 */

        public final void run() {
            C2484a.this.m5472b((C2484a) 408);
        }
    };

    /* renamed from: com.qiyukf.unicorn.f.a$a */
    public class RunnableC2497a implements Runnable {
        public RunnableC2497a() {
        }

        public /* synthetic */ RunnableC2497a(C2484a aVar, byte b) {
            this();
        }

        public final void run() {
            new AbstractC2694b<Void, C2631b>("Unicorn-HTTP", C2452d.m5371d()) {
                /* class com.qiyukf.unicorn.p213f.C2484a.C24914 */

                /* renamed from: a */
                public final /* synthetic */ String f4956a;

                {
                    this.f4956a = r3;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.qiyukf.unicorn.p232k.AbstractC2694b
                /* renamed from: a */
                public final /* synthetic */ C2631b mo34446a() {
                    return C2634c.m5999a(this.f4956a, C2437b.m5267d());
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.qiyukf.unicorn.p232k.AbstractC2694b
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo34447a(C2631b bVar) {
                    C2484a.this.mo35752a(bVar);
                }
            }.mo36463a((Object[]) new Void[0]);
            C2484a.m5482h(C2484a.this);
        }
    }

    public C2484a() {
        JSONObject a;
        ((AuthServiceObserver) NIMClient.getService(AuthServiceObserver.class)).observeOnlineStatus(this.f4940g, true);
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeCustomNotification(this.f4941h, true);
        if (m5470b() == null) {
            m5465a(0);
            String q = C2437b.m5298q();
            if (!TextUtils.isEmpty(q) && (a = C1810b.m3420a(q)) != null) {
                C1810b.m3432e(a, "foreignid");
                mo35753a();
                return;
            }
            return;
        }
        m5478e();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m5465a(int i) {
        C2437b.m5274e();
        m5466a((LoginInfo) null);
        this.f4935b.set(true);
        this.f4936c.removeCallbacks(this.f4939f);
        this.f4936c.postDelayed(this.f4939f, (long) i);
    }

    /* renamed from: a */
    public static void m5466a(LoginInfo loginInfo) {
        String token;
        if (loginInfo == null) {
            token = null;
            C2437b.m5243a((String) null);
        } else {
            C2437b.m5243a(loginInfo.getAccount());
            token = loginInfo.getToken();
        }
        C2437b.m5253b(token);
    }

    /* renamed from: a */
    public static /* synthetic */ void m5468a(C2484a aVar, String str, String str2) {
        aVar.f4934a = str;
        C2437b.m5277f(str);
        if (!TextUtils.isEmpty(str)) {
            C2437b.m5247a(str, str2);
        }
        if (C2452d.m5373e().isPullMessageFromServer) {
            C2716n.m6281a((Boolean) true);
        }
    }

    /* renamed from: a */
    private boolean m5469a(final YSFUserInfo ySFUserInfo) {
        String str = ySFUserInfo.data;
        if (!(TextUtils.isEmpty(str) || C1810b.m3428b(str) != null)) {
            C1709a.m3011a("AM", "user data is not json array");
            return false;
        }
        if (TextUtils.isEmpty(ySFUserInfo.userId)) {
            ySFUserInfo.userId = this.f4934a;
        }
        C2607c cVar = new C2607c();
        cVar.mo36155a(ySFUserInfo.userId);
        cVar.mo36157c(ySFUserInfo.authToken);
        cVar.mo36156b(ySFUserInfo.data);
        final String json = cVar.toJson(true);
        C2437b.m5299q(json);
        if (!mo35753a()) {
            return true;
        }
        final String d = C2452d.m5371d();
        final String d2 = C2437b.m5267d();
        final C24851 r10 = new RequestCallback<C2631b>() {
            /* class com.qiyukf.unicorn.p213f.C2484a.C24851 */

            @Override // com.qiyukf.unicorn.api.RequestCallback
            public final void onException(Throwable th) {
                if (TextUtils.isEmpty(ySFUserInfo.authToken) || !TextUtils.isEmpty(ySFUserInfo.authToken)) {
                    C1805a.m3404b().post(new Runnable() {
                        /* class com.qiyukf.unicorn.p213f.C2484a.C24851.RunnableC24883 */

                        public final void run() {
                            C2484a.this.m5472b((C2484a) 1000);
                        }
                    });
                }
            }

            @Override // com.qiyukf.unicorn.api.RequestCallback
            public final void onFailed(final int i) {
                if (TextUtils.isEmpty(ySFUserInfo.authToken) || (!TextUtils.isEmpty(ySFUserInfo.authToken) && i != 200)) {
                    C2484a.this.m5472b((C2484a) i);
                    C1805a.m3404b().post(new Runnable() {
                        /* class com.qiyukf.unicorn.p213f.C2484a.C24851.RunnableC24872 */

                        public final void run() {
                            C2484a.this.m5472b((C2484a) i);
                        }
                    });
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.qiyukf.unicorn.api.RequestCallback
            public final /* synthetic */ void onSuccess(C2631b bVar) {
                C2631b bVar2 = bVar;
                if (!bVar2.mo36240a().getAccount().equals(C2437b.m5237a())) {
                    C2484a.this.f4935b.set(true);
                    C2484a.this.f4936c.removeCallbacks(C2484a.this.f4939f);
                    C2484a.m5476d(C2484a.this);
                    C2484a.this.mo35752a(bVar2);
                }
                if (TextUtils.isEmpty(C2484a.this.f4934a) && !TextUtils.isEmpty(ySFUserInfo.userId)) {
                    String c = C2437b.m5261c(ySFUserInfo.userId);
                    if (!TextUtils.isEmpty(c)) {
                        ((MsgService) NIMClient.getService(MsgService.class)).migrateMessages(c, C1877b.m3581b(), true);
                    }
                }
                if (json.equals(C2437b.m5298q())) {
                    C2437b.m5299q(null);
                }
                C2484a.m5468a(C2484a.this, ySFUserInfo.userId, C1877b.m3581b());
                C2437b.m5279g(ySFUserInfo.data);
                String str = ySFUserInfo.authToken;
                if (str != null) {
                    C2437b.m5281h(str);
                }
                if (TextUtils.isEmpty(ySFUserInfo.authToken)) {
                    C1805a.m3404b().post(new Runnable() {
                        /* class com.qiyukf.unicorn.p213f.C2484a.C24851.RunnableC24861 */

                        public final void run() {
                            C2484a.this.m5472b((C2484a) 200);
                        }
                    });
                }
            }
        };
        new AbstractC2694b<Void, Void>("Unicorn-HTTP") {
            /* class com.qiyukf.unicorn.p213f.C2484a.C24892 */

            /* access modifiers changed from: private */
            /* renamed from: b */
            public Void mo34446a() {
                String str = d;
                String str2 = d2;
                YSFUserInfo ySFUserInfo = ySFUserInfo;
                String str3 = ySFUserInfo.userId;
                String str4 = ySFUserInfo.data;
                String str5 = ySFUserInfo.authToken;
                RequestCallback requestCallback = r10;
                HashMap hashMap = new HashMap(2);
                hashMap.put("appKey", str);
                hashMap.put("deviceid", str2);
                hashMap.put("foreignid", str3);
                hashMap.put("crminfo", str4);
                hashMap.put("authtoken", str5);
                try {
                    JSONObject a = C1810b.m3420a(C2632a.m5995b("/webapi/user/create.action", hashMap));
                    C2631b bVar = new C2631b();
                    int b = C1810b.m3427b(a, "code");
                    if (b == 200) {
                        JSONObject f = C1810b.m3433f(a, "info");
                        C1709a.m3014b(C7383o0OOO0O.OooOOO0, f.toString());
                        bVar.mo36241a(new LoginInfo(f.getString("accid"), f.getString("token")));
                        boolean z = true;
                        if (C1810b.m3427b(f, "push") != 1) {
                            z = false;
                        }
                        bVar.mo36242a(z);
                        C2437b.m5269d(C1810b.m3432e(f, "bid"));
                        requestCallback.onSuccess(bVar);
                        return null;
                    }
                    C1709a.m3011a("fetchCrmData", "fetch login data error, code: " + b);
                    requestCallback.onFailed(b);
                    return null;
                } catch (Throwable th) {
                    C1709a.m3015b("fetchCrmData", "is catch", th);
                    requestCallback.onException(th);
                    return null;
                }
            }
        }.mo36463a((Object[]) new Void[0]);
        return true;
    }

    /* renamed from: b */
    public static LoginInfo m5470b() {
        LoginInfo loginInfo = new LoginInfo(C2437b.m5237a(), C2437b.m5251b());
        C1877b.m3580a(loginInfo.getAccount());
        if (loginInfo.valid()) {
            return loginInfo;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m5472b(int i) {
        RequestCallback<Void> requestCallback = this.f4937d;
        this.f4937d = null;
        if (requestCallback != null) {
            this.f4936c.removeCallbacks(this.f4942i);
            if (i == 200) {
                requestCallback.onSuccess(null);
            } else {
                requestCallback.onFailed(i);
            }
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m5476d(C2484a aVar) {
        C2452d.m5375g().mo36335a(new RequestCallback() {
            /* class com.qiyukf.unicorn.p213f.C2484a.C24969 */

            @Override // com.qiyukf.unicorn.api.RequestCallback
            public final void onException(Throwable th) {
            }

            @Override // com.qiyukf.unicorn.api.RequestCallback
            public final void onFailed(int i) {
            }

            @Override // com.qiyukf.unicorn.api.RequestCallback
            public final void onSuccess(Object obj) {
            }
        });
        ((AuthService) NIMClient.getService(AuthService.class)).logout();
        m5466a((LoginInfo) null);
        C2205d.m4570a(StatusCode.UNLOGIN);
        C1709a.m3011a("setUserLogout status:", "UNLOGIN");
        aVar.f4934a = null;
        C2437b.m5274e();
        C2437b.m5277f(null);
        C2437b.m5279g(null);
        C2437b.m5281h(null);
        if (C2452d.m5376h() != null) {
            C2452d.m5376h().mo35662c();
        }
    }

    /* renamed from: e */
    public static void m5478e() {
        C2452d.m5353a();
        C2452d.m5376h().mo35654a();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m5480f() {
        m5465a(this.f4938e * 10 * 1000);
    }

    /* renamed from: h */
    public static /* synthetic */ int m5482h(C2484a aVar) {
        int i = aVar.f4938e;
        aVar.f4938e = i + 1;
        return i;
    }

    /* renamed from: j */
    public static /* synthetic */ void m5484j(C2484a aVar) {
        JSONObject a;
        String q = C2437b.m5298q();
        if (!TextUtils.isEmpty(q) && (a = C1810b.m3420a(q)) != null) {
            YSFUserInfo ySFUserInfo = new YSFUserInfo();
            ySFUserInfo.userId = C1810b.m3432e(a, "foreignid");
            ySFUserInfo.authToken = C1810b.m3432e(a, "authToken");
            ySFUserInfo.data = C1810b.m3432e(a, "userinfo");
            aVar.m5469a(ySFUserInfo);
        }
    }

    /* renamed from: a */
    public final void mo35752a(C2631b bVar) {
        if (this.f4935b.get()) {
            if (bVar == null || bVar.mo36240a() == null) {
                m5480f();
                return;
            }
            m5466a(bVar.mo36240a());
            if (bVar.mo36243b()) {
                ((AuthService) NIMClient.getService(AuthService.class)).openLocalCache(bVar.mo36240a().getAccount());
            }
            C1877b.m3580a(bVar.mo36240a().getAccount());
            ((AuthService) NIMClient.getService(AuthService.class)).login(bVar.mo36240a()).setCallback(new RequestCallbackWrapper<LoginInfo>() {
                /* class com.qiyukf.unicorn.p213f.C2484a.C24958 */

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
                @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                public final /* synthetic */ void onResult(int i, LoginInfo loginInfo, Throwable th) {
                    if (i == 200) {
                        C2484a.m5478e();
                    }
                }
            });
            ((AuthService) NIMClient.getService(AuthService.class)).changeSaverMode(0);
            C2651b.m6070a(false);
        }
    }

    /* renamed from: a */
    public final boolean mo35753a() {
        if (C2180b.m4480e() != null) {
            return true;
        }
        if (!this.f4935b.get()) {
            m5465a(0);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo35754a(YSFUserInfo ySFUserInfo, RequestCallback<Void> requestCallback) {
        String str;
        if (ySFUserInfo == null) {
            if (this.f4935b.compareAndSet(true, false)) {
                this.f4936c.removeCallbacks(this.f4939f);
            }
            if (!TextUtils.isEmpty(this.f4934a)) {
                C2452d.m5375g().mo36335a(new RequestCallback() {
                    /* class com.qiyukf.unicorn.p213f.C2484a.C24903 */

                    @Override // com.qiyukf.unicorn.api.RequestCallback
                    public final void onException(Throwable th) {
                    }

                    @Override // com.qiyukf.unicorn.api.RequestCallback
                    public final void onFailed(int i) {
                    }

                    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                        java.lang.IndexOutOfBoundsException: Index: 0
                        	at java.util.Collections$EmptyList.get(Collections.java:4456)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.replaceUnknownTypes(MethodInvokeVisitor.java:299)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:258)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                        */
                    @Override // com.qiyukf.unicorn.api.RequestCallback
                    public final void onSuccess(java.lang.Object r2) {
                        /*
                            r1 = this;
                            java.lang.Class<com.qiyukf.nimlib.sdk.auth.AuthService> r2 = com.qiyukf.nimlib.sdk.auth.AuthService.class
                            java.lang.Object r2 = com.qiyukf.nimlib.sdk.NIMClient.getService(r2)
                            com.qiyukf.nimlib.sdk.auth.AuthService r2 = (com.qiyukf.nimlib.sdk.auth.AuthService) r2
                            r2.logout()
                            com.qiyukf.unicorn.p213f.C2484a.m5474c()
                            com.qiyukf.nimlib.sdk.StatusCode r2 = com.qiyukf.nimlib.sdk.StatusCode.UNLOGIN
                            com.qiyukf.nimlib.C2205d.m4570a(r2)
                            java.lang.String r2 = "onForeignLogout status:"
                            java.lang.String r0 = "UNLOGIN"
                            com.qiyukf.basesdk.p119a.C1709a.m3011a(r2, r0)
                            com.qiyukf.unicorn.f.a r2 = com.qiyukf.unicorn.p213f.C2484a.this
                            com.qiyukf.unicorn.p213f.C2484a.m5479f(r2)
                            com.qiyukf.unicorn.p209b.C2437b.m5274e()
                            r2 = 0
                            com.qiyukf.unicorn.p209b.C2437b.m5277f(r2)
                            com.qiyukf.unicorn.p209b.C2437b.m5279g(r2)
                            com.qiyukf.unicorn.p209b.C2437b.m5281h(r2)
                            com.qiyukf.unicorn.c r2 = com.qiyukf.unicorn.C2452d.m5376h()
                            r2.mo35662c()
                            com.qiyukf.unicorn.f.a r2 = com.qiyukf.unicorn.p213f.C2484a.this
                            com.qiyukf.unicorn.p213f.C2484a.m5481g(r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p213f.C2484a.C24903.onSuccess(java.lang.Object):void");
                    }
                });
            }
            if (requestCallback != null) {
                requestCallback.onSuccess(null);
            }
            return true;
        }
        String str2 = ySFUserInfo.userId;
        if (TextUtils.isEmpty(this.f4934a) && TextUtils.isEmpty(str2)) {
            str = "anonymous user can not update user info";
        } else if (TextUtils.isEmpty(this.f4934a) || TextUtils.isEmpty(str2) || str2.equals(this.f4934a)) {
            if (requestCallback != null) {
                this.f4936c.postDelayed(this.f4942i, 15000);
                this.f4937d = requestCallback;
            }
            JSONObject jSONObject = new JSONObject();
            C1810b.m3425a(jSONObject, "key", "sdk_version");
            C1810b.m3425a(jSONObject, "value", "73");
            C1810b.m3424a(jSONObject, ViewProps.HIDDEN, (Object) true);
            JSONArray b = C1810b.m3428b(ySFUserInfo.data);
            JSONArray jSONArray = new JSONArray();
            if (b != null) {
                for (int i = 0; i < b.length(); i++) {
                    JSONObject b2 = C1810b.m3429b(b, i);
                    if (!"sdk_version".equals(C1810b.m3432e(b2, "key"))) {
                        C1810b.m3421a(jSONArray, b2);
                    }
                }
            }
            C1810b.m3421a(jSONArray, jSONObject);
            ySFUserInfo.data = jSONArray.toString();
            String h = C2437b.m5280h();
            String i2 = C2437b.m5283i();
            if (TextUtils.isEmpty(this.f4934a) || !TextUtils.equals(h, ySFUserInfo.data) || !TextUtils.equals(i2, ySFUserInfo.authToken)) {
                return m5469a(ySFUserInfo);
            }
            m5472b(200);
            return true;
        } else {
            str = "should logout first before switch userId";
        }
        C1709a.m3011a("AM", str);
        return false;
    }
}
