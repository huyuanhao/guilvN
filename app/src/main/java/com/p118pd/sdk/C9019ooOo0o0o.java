package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p293rx.subjects.PublishSubject;

/* renamed from: com.pd.sdk.ooOo0o0o  reason: case insensitive filesystem */
public class C9019ooOo0o0o {
    public final AbstractC5635LIi1<Object, Object> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<Class<?>, Object> f22322OooO00o;
    public Map<Object, C9018ooOo0o0O> OooO0O0;

    /* renamed from: com.pd.sdk.ooOo0o0o$OooO00o */
    public class OooO00o implements C9349III.OooO00o<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Class f22323OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f22324OooO00o;

        public OooO00o(Class cls, Object obj) {
            this.f22323OooO00o = cls;
            this.f22324OooO00o = obj;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super T> r3) {
            r3.onNext((Object) this.f22323OooO00o.cast(this.f22324OooO00o));
        }
    }

    /* renamed from: com.pd.sdk.ooOo0o0o$OooO0O0 */
    public static class OooO0O0 {
        public static final C9019ooOo0o0o OooO00o = new C9019ooOo0o0o(null);
    }

    public /* synthetic */ C9019ooOo0o0o(OooO00o oooO00o) {
        this();
    }

    public static C9019ooOo0o0o OooO00o() {
        return OooO0O0.OooO00o;
    }

    public void OooO0O0(Object obj) {
        synchronized (this.f22322OooO00o) {
            this.f22322OooO00o.put(obj.getClass(), obj);
        }
        OooO00o(obj);
    }

    public void OooO0OO(Object obj) {
        if (obj != null) {
            this.OooO0O0.put(obj, C9017ooOo0o00.OooO00o(obj, new IIlIIiI1()));
        }
    }

    public void OooO0Oo(Object obj) {
        if (obj != null) {
            C9018ooOo0o0O oooo0o0o = this.OooO0O0.get(obj);
            if (oooo0o0o != null) {
                oooo0o0o.OooO00o().unsubscribe();
            }
            this.OooO0O0.remove(obj);
        }
    }

    public C9019ooOo0o0o() {
        this.f22322OooO00o = new ConcurrentHashMap();
        this.OooO0O0 = new ConcurrentHashMap();
        this.OooO00o = new C6373iIl(PublishSubject.OooO00o());
    }

    public synchronized void OooO00o(Object obj) {
        this.OooO00o.onNext(obj);
    }

    public <T> C9349III<T> OooO00o(Class<T> cls) {
        return (C9349III<T>) this.OooO00o.OooO0O0((Class<Object>) cls);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public <T> T m20682OooO00o(Class<T> cls) {
        T cast;
        if (this.f22322OooO00o.isEmpty()) {
            return null;
        }
        synchronized (this.f22322OooO00o) {
            cast = cls.cast(this.f22322OooO00o.remove(cls));
        }
        return cast;
    }

    public <T> C9349III<T> OooO0O0(Class<T> cls) {
        if (this.f22322OooO00o.isEmpty()) {
            return null;
        }
        C9349III<T> r0 = (C9349III<T>) this.OooO00o.OooO0O0((Class<Object>) cls);
        Object obj = this.f22322OooO00o.get(cls);
        return obj != null ? r0.OooO0o0((C9349III) C9349III.OooO00o((C9349III.OooO00o) new OooO00o(cls, obj))) : r0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20683OooO00o() {
        if (!this.f22322OooO00o.isEmpty()) {
            synchronized (this.f22322OooO00o) {
                this.f22322OooO00o.clear();
            }
        }
    }
}
