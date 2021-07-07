package com.p118pd.sdk;

import com.jinhui365.router.core.InterceptorLifeCycle;
import com.jinhui365.router.core.InterceptorState;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0o000O  reason: case insensitive filesystem */
public abstract class AbstractC8692oo0o000O {
    public InterceptorLifeCycle OooO00o = InterceptorLifeCycle.DEFAULT;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8700oo0o00oo f21845OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, Object> f21846OooO00o;

    public AbstractC8692oo0o000O(Map<String, Object> map) {
        this.f21846OooO00o = map;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8700oo0o00oo m20302OooO00o() {
        return this.f21845OooO00o;
    }

    public abstract void OooO00o(AbstractC8694oo0o00O oo0o00o);

    public abstract void OooO0O0();

    public void OooO0O0(InterceptorState interceptorState) {
        this.f21845OooO00o.m20311OooO00o().getCallback().OooO0O0(new C8705oo0o0O0o(202, this.f21845OooO00o.m20311OooO00o().getUrl() + "：" + AbstractC8692oo0o000O.class.getName() + " == " + interceptorState, this.f21845OooO00o));
    }

    public void OooO00o(C8700oo0o00oo oo0o00oo) {
        this.f21845OooO00o = oo0o00oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, Object> m20303OooO00o() {
        return this.f21846OooO00o;
    }

    public void OooO00o(Map<String, Object> map) {
        this.f21846OooO00o = map;
    }

    public InterceptorLifeCycle OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(InterceptorLifeCycle interceptorLifeCycle) {
        this.OooO00o = interceptorLifeCycle;
    }

    public void OooO00o(InterceptorState interceptorState) {
        int i = InterceptorState.FAIL == interceptorState ? 201 : 202;
        this.f21845OooO00o.m20311OooO00o().getCallback().OooO0O0(new C8705oo0o0O0o(i, this.f21845OooO00o.m20311OooO00o().getUrl() + "：" + AbstractC8692oo0o000O.class.getName() + " == " + interceptorState, this.f21845OooO00o));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20304OooO00o() {
        C8703oo0o0O00.OooO00o().OooO0O0(null);
        C8703oo0o0O00.OooO00o().OooO00o(this.f21845OooO00o);
        this.f21845OooO00o.m20311OooO00o().getCallback().OooO0O0(new C8705oo0o0O0o(203, this.f21845OooO00o.m20311OooO00o().getUrl() + "：" + AbstractC8692oo0o000O.class.getName() + " cancel", this.f21845OooO00o));
    }
}
