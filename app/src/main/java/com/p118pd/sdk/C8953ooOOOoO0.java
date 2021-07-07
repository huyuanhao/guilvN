package com.p118pd.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.ooOOOoO0  reason: case insensitive filesystem */
public final class C8953ooOOOoO0 {
    public static final int OooO00o = 20;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final AbstractC8956OooO0oO<Object> f22215OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22216OooO00o = "FactoryPools";

    /* renamed from: com.pd.sdk.ooOOOoO0$OooO00o */
    public class OooO00o implements AbstractC8956OooO0oO<Object> {
        @Override // com.p118pd.sdk.C8953ooOOOoO0.AbstractC8956OooO0oO
        public void OooO00o(@NonNull Object obj) {
        }
    }

    /* renamed from: com.pd.sdk.ooOOOoO0$OooO0O0 */
    public class OooO0O0 implements AbstractC8954OooO0Oo<List<T>> {
        @Override // com.p118pd.sdk.C8953ooOOOoO0.AbstractC8954OooO0Oo
        @NonNull
        public List<T> OooO00o() {
            return new ArrayList();
        }
    }

    /* renamed from: com.pd.sdk.ooOOOoO0$OooO0OO */
    public class OooO0OO implements AbstractC8956OooO0oO<List<T>> {
        public void OooO00o(@NonNull List<T> list) {
            list.clear();
        }
    }

    /* renamed from: com.pd.sdk.ooOOOoO0$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC8954OooO0Oo<T> {
        T OooO00o();
    }

    /* renamed from: com.pd.sdk.ooOOOoO0$OooO0o */
    public interface OooO0o {
        @NonNull
        oO0O0O0o OooO00o();
    }

    /* renamed from: com.pd.sdk.ooOOOoO0$OooO0o0  reason: case insensitive filesystem */
    public static final class C8955OooO0o0<T> implements Pools.OooO00o<T> {
        public final Pools.OooO00o<T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC8954OooO0Oo<T> f22217OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC8956OooO0oO<T> f22218OooO00o;

        public C8955OooO0o0(@NonNull Pools.OooO00o<T> oooO00o, @NonNull AbstractC8954OooO0Oo<T> oooO0Oo, @NonNull AbstractC8956OooO0oO<T> oooO0oO) {
            this.OooO00o = oooO00o;
            this.f22217OooO00o = oooO0Oo;
            this.f22218OooO00o = oooO0oO;
        }

        @Override // androidx.core.util.Pools.OooO00o
        public T acquire() {
            T acquire = this.OooO00o.acquire();
            if (acquire == null) {
                acquire = this.f22217OooO00o.OooO00o();
                if (Log.isLoggable(C8953ooOOOoO0.f22216OooO00o, 2)) {
                    String str = "Created new " + acquire.getClass();
                }
            }
            if (acquire instanceof OooO0o) {
                acquire.OooO00o().OooO00o(false);
            }
            return acquire;
        }

        @Override // androidx.core.util.Pools.OooO00o
        public boolean release(@NonNull T t) {
            if (t instanceof OooO0o) {
                t.OooO00o().OooO00o(true);
            }
            this.f22218OooO00o.OooO00o(t);
            return this.OooO00o.release(t);
        }
    }

    /* renamed from: com.pd.sdk.ooOOOoO0$OooO0oO  reason: case insensitive filesystem */
    public interface AbstractC8956OooO0oO<T> {
        void OooO00o(@NonNull T t);
    }

    @NonNull
    public static <T extends OooO0o> Pools.OooO00o<T> OooO00o(int i, @NonNull AbstractC8954OooO0Oo<T> oooO0Oo) {
        return OooO00o(new Pools.SimplePool(i), oooO0Oo);
    }

    @NonNull
    public static <T extends OooO0o> Pools.OooO00o<T> OooO0O0(int i, @NonNull AbstractC8954OooO0Oo<T> oooO0Oo) {
        return OooO00o(new Pools.OooO0O0(i), oooO0Oo);
    }

    @NonNull
    public static <T> Pools.OooO00o<List<T>> OooO00o() {
        return OooO00o(20);
    }

    @NonNull
    public static <T> Pools.OooO00o<List<T>> OooO00o(int i) {
        return OooO00o(new Pools.OooO0O0(i), new OooO0O0(), new OooO0OO());
    }

    @NonNull
    public static <T extends OooO0o> Pools.OooO00o<T> OooO00o(@NonNull Pools.OooO00o<T> oooO00o, @NonNull AbstractC8954OooO0Oo<T> oooO0Oo) {
        return OooO00o(oooO00o, oooO0Oo, m20624OooO00o());
    }

    @NonNull
    public static <T> Pools.OooO00o<T> OooO00o(@NonNull Pools.OooO00o<T> oooO00o, @NonNull AbstractC8954OooO0Oo<T> oooO0Oo, @NonNull AbstractC8956OooO0oO<T> oooO0oO) {
        return new C8955OooO0o0(oooO00o, oooO0Oo, oooO0oO);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static <T> AbstractC8956OooO0oO<T> m20624OooO00o() {
        return (AbstractC8956OooO0oO<T>) f22215OooO00o;
    }
}
