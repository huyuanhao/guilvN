package com.p118pd.sdk;

import android.content.Context;
import com.jinhui365.router.core.InterceptorLifeCycle;
import com.jinhui365.router.core.InterceptorState;
import com.jinhui365.router.core.RouteRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0o00oo  reason: case insensitive filesystem */
public class C8700oo0o00oo {
    public static final String OooO00o = "RouteContext";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f21850OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21851OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RouteRequest f21852OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8696oo0o00OO f21853OooO00o = new C8696oo0o00OO(this);

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8697oo0o00Oo f21854OooO00o = new C8697oo0o00Oo(this);

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8699oo0o00o0 f21855OooO00o = new C8699oo0o00o0(this);

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8700oo0o00oo f21856OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<AbstractC8692oo0o000O> f21857OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21858OooO00o = false;
    public List<C8700oo0o00oo> OooO0O0 = new ArrayList();

    public C8700oo0o00oo(RouteRequest routeRequest, Context context) {
        this.f21852OooO00o = routeRequest;
        this.f21851OooO00o = context;
        this.f21857OooO00o = routeRequest.getInterceptors();
    }

    private void OooO0OO() {
        OooO0Oo();
        if (this.f21856OooO00o != null) {
            String str = "current: " + this.f21852OooO00o.getUrl() + "'s parent: " + this.f21856OooO00o.m20311OooO00o().getUrl();
        } else {
            String str2 = "current: " + this.f21852OooO00o.getUrl() + "'s parent: null";
        }
        if (this.f21856OooO00o == null || this.OooO0O0.size() <= 0 || this.f21858OooO00o) {
            this.f21852OooO00o.getTask().execute(this);
            return;
        }
        this.f21858OooO00o = true;
        AbstractC8692oo0o000O OooO00o2 = this.f21856OooO00o.m20312OooO00o();
        if (OooO00o2 != null) {
            OooO00o2.OooO00o(this.f21854OooO00o);
        } else {
            this.f21852OooO00o.getTask().execute(this);
        }
    }

    private void OooO0Oo() {
        C8703oo0o0O00.OooO00o().OooO0O0(this.f21856OooO00o);
        C8703oo0o0O00.OooO00o().OooO00o(this);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8700oo0o00oo m20313OooO00o() {
        return this.f21856OooO00o;
    }

    public void OooO0O0(C8700oo0o00oo oo0o00oo) {
        this.f21856OooO00o = oo0o00oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public RouteRequest m20311OooO00o() {
        return this.f21852OooO00o;
    }

    public void OooO0O0() {
        if (m20316OooO00o()) {
            List<AbstractC8692oo0o000O> list = this.f21857OooO00o;
            int i = this.f21850OooO00o + 1;
            this.f21850OooO00o = i;
            AbstractC8692oo0o000O oo0o000o = list.get(i);
            if (oo0o000o != null) {
                oo0o000o.f21845OooO00o = this;
                oo0o000o.OooO00o(this.f21853OooO00o);
                return;
            }
            return;
        }
        OooO0OO();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<C8700oo0o00oo> m20314OooO00o() {
        return this.OooO0O0;
    }

    public void OooO00o(C8700oo0o00oo oo0o00oo) {
        this.OooO0O0.add(oo0o00oo);
    }

    public int OooO00o() {
        return this.OooO0O0.size();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Context m20310OooO00o() {
        return this.f21851OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20316OooO00o() {
        if (this.f21857OooO00o.isEmpty() || this.f21850OooO00o >= this.f21857OooO00o.size() - 1) {
            return false;
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8692oo0o000O m20312OooO00o() {
        int i = this.f21850OooO00o;
        if (-1 == i || i >= this.f21857OooO00o.size()) {
            return null;
        }
        return this.f21857OooO00o.get(this.f21850OooO00o);
    }

    public void OooO00o(InterceptorState interceptorState, Map<String, Object> map) {
        AbstractC8692oo0o000O OooO00o2 = m20312OooO00o();
        if (OooO00o2 != null) {
            if (map != null && !map.isEmpty()) {
                OooO00o2.m20303OooO00o().putAll(map);
            }
            if (InterceptorState.SUCCESS.equals(interceptorState)) {
                OooO00o2.OooO00o(this.f21855OooO00o);
            } else {
                this.f21855OooO00o.OooO00o(interceptorState);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20315OooO00o() {
        OooO0Oo();
        AbstractC8692oo0o000O OooO00o2 = m20312OooO00o();
        if (OooO00o2 != null) {
            OooO00o2.OooO00o(InterceptorLifeCycle.CANCEL);
            OooO00o2.m20304OooO00o();
        }
    }
}
