package com.p118pd.sdk;

import com.rxhui.rxcache.CacheTarget;
import com.rxhui.rxcache.result.ResultSouce;
import java.lang.reflect.Type;

/* renamed from: com.pd.sdk.ooOoO0  reason: case insensitive filesystem */
public abstract class AbstractC9028ooOoO0 implements AbstractC9034ooOoO0OO {
    public static final String OooO00o = "BaseStrategy";

    /* renamed from: com.pd.sdk.ooOoO0$OooO00o */
    public class OooO00o implements AbstractC9847l1<T, C9031ooOoO00O<T>> {
        public final /* synthetic */ String o0ooOOo;

        public OooO00o(String str) {
            this.o0ooOOo = str;
        }

        /* renamed from: OooO00o */
        public C9031ooOoO00O<T> call(T t) {
            return new C9031ooOoO00O<>(ResultSouce.Cache, this.o0ooOOo, t);
        }
    }

    /* renamed from: com.pd.sdk.ooOoO0$OooO0O0 */
    public class OooO0O0 implements AbstractC9847l1<T, C9031ooOoO00O<T>> {
        public final /* synthetic */ C9021ooOo0oOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CacheTarget f22347OooO00o;
        public final /* synthetic */ String o0ooOOo;

        /* renamed from: com.pd.sdk.ooOoO0$OooO0O0$OooO00o */
        public class OooO00o implements AbstractC6153iL1l<Boolean> {
            public OooO00o() {
            }

            /* renamed from: OooO00o */
            public void call(Boolean bool) {
                String str = "save status => " + bool;
            }
        }

        public OooO0O0(C9021ooOo0oOO oooo0ooo, String str, CacheTarget cacheTarget) {
            this.OooO00o = oooo0ooo;
            this.o0ooOOo = str;
            this.f22347OooO00o = cacheTarget;
        }

        /* renamed from: OooO00o */
        public C9031ooOoO00O<T> call(T t) {
            String str = "loadRemote result=" + ((Object) t);
            this.OooO00o.OooO00o(this.o0ooOOo, t, this.f22347OooO00o).OooO0OO(C6261iii1I1.OooO0OO()).OooO00o((AbstractC6153iL1l<? super Boolean>) new OooO00o());
            return new C9031ooOoO00O<>(ResultSouce.Remote, this.o0ooOOo, t);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9034ooOoO0OO
    public abstract <T> C9349III<C9031ooOoO00O<T>> OooO00o(C9021ooOo0oOO oooo0ooo, String str, C9349III<T> v, Type type);

    public <T> C9349III<C9031ooOoO00O<T>> OooO00o(C9021ooOo0oOO oooo0ooo, String str, Type type) {
        return oooo0ooo.m20685OooO00o(str, type).OooOOoo(new OooO00o(str));
    }

    public <T> C9349III<C9031ooOoO00O<T>> OooO00o(C9021ooOo0oOO oooo0ooo, String str, C9349III<T> r4, CacheTarget cacheTarget) {
        return r4.OooOOoo(new OooO0O0(oooo0ooo, str, cacheTarget));
    }
}
