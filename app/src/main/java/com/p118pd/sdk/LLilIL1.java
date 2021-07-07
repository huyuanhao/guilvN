package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.LLilIL1 */
public final class LLilIL1<T, K, V> implements C9349III.OooO00o<Map<K, Collection<V>>>, LiLIll<Map<K, Collection<V>>> {
    public final LiLIll<? extends Map<K, Collection<V>>> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<T> f16491OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, ? extends K> f16492OooO00o;
    public final AbstractC9847l1<? super T, ? extends V> OooO0O0;
    public final AbstractC9847l1<? super K, ? extends Collection<V>> OooO0OO;

    /* renamed from: com.pd.sdk.LLilIL1$OooO00o */
    public static final class OooO00o<K, V> implements AbstractC9847l1<K, Collection<V>> {
        public static final OooO00o<Object, Object> OooO00o = new OooO00o<>();

        public static <K, V> OooO00o<K, V> OooO00o() {
            return (OooO00o<K, V>) OooO00o;
        }

        /* renamed from: OooO00o */
        public Collection<V> call(K k) {
            return new ArrayList();
        }
    }

    /* renamed from: com.pd.sdk.LLilIL1$OooO0O0 */
    public static final class OooO0O0<T, K, V> extends AbstractC5670LLl1<T, Map<K, Collection<V>>> {
        public final AbstractC9847l1<? super T, ? extends K> OooO00o;
        public final AbstractC9847l1<? super T, ? extends V> OooO0O0;
        public final AbstractC9847l1<? super K, ? extends Collection<V>> OooO0OO;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, java.util.Collection<V>> */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(AbstractC9508LiLi<? super Map<K, Collection<V>>> r1, Map<K, Collection<V>> map, AbstractC9847l1<? super T, ? extends K> r3, AbstractC9847l1<? super T, ? extends V> r4, AbstractC9847l1<? super K, ? extends Collection<V>> r5) {
            super(r1);
            ((AbstractC6730ll1Il) this).f18708OooO00o = map;
            super.OooO0O0 = true;
            this.OooO00o = r3;
            this.OooO0O0 = r4;
            this.OooO0OO = r5;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: R */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!super.OooO0OO) {
                try {
                    Object call = this.OooO00o.call(t);
                    Object call2 = this.OooO0O0.call(t);
                    Collection collection = (Collection) ((AbstractC6730ll1Il) this).f18708OooO00o.get(call);
                    if (collection == null) {
                        collection = (Collection) this.OooO0OO.call(call);
                        ((AbstractC6730ll1Il) this).f18708OooO00o.put(call, collection);
                    }
                    collection.add(call2);
                } catch (Throwable th) {
                    IIl11.m15447OooO00o(th);
                    unsubscribe();
                    onError(th);
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public LLilIL1(C9349III<T> r7, AbstractC9847l1<? super T, ? extends K> r8, AbstractC9847l1<? super T, ? extends V> r9) {
        this(r7, r8, r9, null, OooO00o.OooO00o());
    }

    /* renamed from: OooO00o */
    public Map<K, Collection<V>> call() {
        return new HashMap();
    }

    public LLilIL1(C9349III<T> r7, AbstractC9847l1<? super T, ? extends K> r8, AbstractC9847l1<? super T, ? extends V> r9, LiLIll<? extends Map<K, Collection<V>>> r10) {
        this(r7, r8, r9, r10, OooO00o.OooO00o());
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super Map<K, Collection<V>>> r8) {
        try {
            new OooO0O0(r8, (Map) this.OooO00o.call(), this.f16492OooO00o, this.OooO0O0, this.OooO0OO).OooO00o((C9349III) this.f16491OooO00o);
        } catch (Throwable th) {
            IIl11.m15447OooO00o(th);
            r8.onError(th);
        }
    }

    public LLilIL1(C9349III<T> r1, AbstractC9847l1<? super T, ? extends K> r2, AbstractC9847l1<? super T, ? extends V> r3, LiLIll<? extends Map<K, Collection<V>>> r4, AbstractC9847l1<? super K, ? extends Collection<V>> r5) {
        this.f16491OooO00o = r1;
        this.f16492OooO00o = r2;
        this.OooO0O0 = r3;
        if (r4 == null) {
            this.OooO00o = this;
        } else {
            this.OooO00o = r4;
        }
        this.OooO0OO = r5;
    }
}
