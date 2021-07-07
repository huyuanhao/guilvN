package com.qiyukf.nimlib.p179d;

/* renamed from: com.qiyukf.nimlib.d.h */
public abstract class AbstractC2217h {

    /* renamed from: a */
    public static final ThreadLocal<C2218i> f4415a = new ThreadLocal<>();

    /* renamed from: a */
    public static final void m4609a() {
        f4415a.set(null);
    }

    /* renamed from: a */
    public static final void m4610a(C2218i iVar) {
        f4415a.set(iVar);
    }

    /* renamed from: b */
    public static C2218i m4611b() {
        return f4415a.get();
    }
}
