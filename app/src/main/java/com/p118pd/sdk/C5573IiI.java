package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.I丨丨丨i丨I  reason: invalid class name and case insensitive filesystem */
public final class C5573IiI<T, K, V> implements C9349III.OooO00o<Map<K, V>>, LiLIll<Map<K, V>> {
    public final LiLIll<? extends Map<K, V>> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<T> f16111OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, ? extends K> f16112OooO00o;
    public final AbstractC9847l1<? super T, ? extends V> OooO0O0;

    /* renamed from: com.pd.sdk.I丨丨丨i丨I$OooO00o */
    public static final class OooO00o<T, K, V> extends AbstractC5670LLl1<T, Map<K, V>> {
        public final AbstractC9847l1<? super T, ? extends K> OooO00o;
        public final AbstractC9847l1<? super T, ? extends V> OooO0O0;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, V> */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(AbstractC9508LiLi<? super Map<K, V>> r1, Map<K, V> map, AbstractC9847l1<? super T, ? extends K> r3, AbstractC9847l1<? super T, ? extends V> r4) {
            super(r1);
            ((AbstractC6730ll1Il) this).f18708OooO00o = map;
            super.OooO0O0 = true;
            this.OooO00o = r3;
            this.OooO0O0 = r4;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: R */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.OooO0OO) {
                try {
                    ((AbstractC6730ll1Il) this).f18708OooO00o.put(this.OooO00o.call(t), this.OooO0O0.call(t));
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

    public C5573IiI(C9349III<T> r2, AbstractC9847l1<? super T, ? extends K> r3, AbstractC9847l1<? super T, ? extends V> r4) {
        this(r2, r3, r4, null);
    }

    /* renamed from: OooO00o */
    public Map<K, V> call() {
        return new HashMap();
    }

    public C5573IiI(C9349III<T> r1, AbstractC9847l1<? super T, ? extends K> r2, AbstractC9847l1<? super T, ? extends V> r3, LiLIll<? extends Map<K, V>> r4) {
        this.f16111OooO00o = r1;
        this.f16112OooO00o = r2;
        this.OooO0O0 = r3;
        if (r4 == null) {
            this.OooO00o = this;
        } else {
            this.OooO00o = r4;
        }
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super Map<K, V>> r5) {
        try {
            new OooO00o(r5, (Map) this.OooO00o.call(), this.f16112OooO00o, this.OooO0O0).OooO00o((C9349III) this.f16111OooO00o);
        } catch (Throwable th) {
            IIl11.OooO00o(th, r5);
        }
    }
}
