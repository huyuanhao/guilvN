package com.p118pd.sdk;

import com.rxhui.rxbus.EventThread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.pd.sdk.ooOo0o  reason: case insensitive filesystem */
public class C9016ooOo0o {
    public LlIiLii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public EventThread f22315OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Class<?> f22316OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f22317OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Method f22318OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22319OooO00o;

    /* renamed from: com.pd.sdk.ooOo0o$OooO00o */
    public class OooO00o extends AbstractC9508LiLi {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            th.toString();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(Object obj) {
            C9016ooOo0o.this.OooO00o(obj);
            C9019ooOo0o0o.OooO00o().m20682OooO00o((Class) obj.getClass());
        }
    }

    public C9016ooOo0o(Method method, EventThread eventThread, Class<?> cls, Object obj, boolean z) {
        this.f22318OooO00o = method;
        this.f22315OooO00o = eventThread;
        this.f22316OooO00o = cls;
        this.f22317OooO00o = obj;
        this.f22319OooO00o = z;
        OooO00o();
    }

    private void OooO00o() {
        C9349III r0;
        if (m20679OooO00o()) {
            r0 = C9019ooOo0o0o.OooO00o().OooO0O0((Class) m20676OooO00o());
        } else {
            r0 = C9019ooOo0o0o.OooO00o().OooO00o((Class) m20676OooO00o());
        }
        if (r0 != null) {
            this.OooO00o = r0.OooOOO().m21402OooO00o(EventThread.getScheduler(m20675OooO00o())).OooO00o((AbstractC9508LiLi) new OooO00o());
        }
    }

    public void OooO0O0(Object obj) {
        this.f22317OooO00o = obj;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Method m20678OooO00o() {
        return this.f22318OooO00o;
    }

    public void OooO00o(Method method) {
        this.f22318OooO00o = method;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public EventThread m20675OooO00o() {
        return this.f22315OooO00o;
    }

    public void OooO00o(EventThread eventThread) {
        this.f22315OooO00o = eventThread;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<?> m20676OooO00o() {
        return this.f22316OooO00o;
    }

    public void OooO00o(Class<?> cls) {
        this.f22316OooO00o = cls;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m20677OooO00o() {
        return this.f22317OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20679OooO00o() {
        return this.f22319OooO00o;
    }

    public void OooO00o(boolean z) {
        this.f22319OooO00o = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlIiLii m20674OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(LlIiLii llIiLii) {
        this.OooO00o = llIiLii;
    }

    public void OooO00o(Object obj) {
        try {
            this.f22318OooO00o.invoke(this.f22317OooO00o, obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
