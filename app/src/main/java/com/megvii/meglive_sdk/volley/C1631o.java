package com.megvii.meglive_sdk.volley;

import com.megvii.meglive_sdk.volley.AbstractC1616b;

/* renamed from: com.megvii.meglive_sdk.volley.o */
public final class C1631o<T> {

    /* renamed from: a */
    public final T f2911a;

    /* renamed from: b */
    public final AbstractC1616b.C1617a f2912b;

    /* renamed from: c */
    public final C1638t f2913c;

    /* renamed from: d */
    public boolean f2914d;

    /* renamed from: com.megvii.meglive_sdk.volley.o$a */
    public interface AbstractC1632a {
        /* renamed from: a */
        void mo16993a(C1638t tVar);
    }

    /* renamed from: com.megvii.meglive_sdk.volley.o$b */
    public interface AbstractC1633b<T> {
        /* renamed from: a */
        void mo16992a(T t);
    }

    public C1631o(T t, AbstractC1616b.C1617a aVar) {
        this.f2914d = false;
        this.f2911a = t;
        this.f2912b = aVar;
        this.f2913c = null;
    }

    /* renamed from: a */
    public static <T> C1631o<T> m2810a(T t, AbstractC1616b.C1617a aVar) {
        return new C1631o<>(t, aVar);
    }

    /* renamed from: a */
    public static <T> C1631o<T> m2809a(C1638t tVar) {
        return new C1631o<>(tVar);
    }

    public C1631o(C1638t tVar) {
        this.f2914d = false;
        this.f2911a = null;
        this.f2912b = null;
        this.f2913c = tVar;
    }
}
