package com.qiyukf.nimlib.p179d;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.qiyukf.nimlib.d.i */
public final class C2218i {

    /* renamed from: a */
    public transient C2220b f4416a = new C2220b();

    /* renamed from: b */
    public transient C2221c f4417b = new C2221c();

    /* renamed from: c */
    public int f4418c = C2219a.m4622a();

    /* renamed from: d */
    public boolean f4419d;

    /* renamed from: e */
    public transient boolean f4420e;

    /* renamed from: com.qiyukf.nimlib.d.i$a */
    public static final class C2219a {

        /* renamed from: a */
        public static AtomicInteger f4421a = new AtomicInteger(0);

        /* renamed from: a */
        public static int m4622a() {
            return f4421a.incrementAndGet();
        }
    }

    /* renamed from: com.qiyukf.nimlib.d.i$b */
    public static final class C2220b {

        /* renamed from: a */
        public String f4422a;

        /* renamed from: b */
        public Object[] f4423b;

        public final String toString() {
            return " uri: " + this.f4422a;
        }
    }

    /* renamed from: com.qiyukf.nimlib.d.i$c */
    public static final class C2221c {

        /* renamed from: a */
        public int f4424a;

        /* renamed from: b */
        public Object f4425b;

        public final String toString() {
            if (this.f4424a == 0) {
                return "";
            }
            return ", result: " + this.f4424a;
        }
    }

    /* renamed from: a */
    public final C2218i mo34825a(int i) {
        this.f4417b.f4424a = i;
        return this;
    }

    /* renamed from: a */
    public final C2218i mo34826a(Object obj) {
        this.f4417b.f4425b = obj;
        return this;
    }

    /* renamed from: a */
    public final C2218i mo34827a(boolean z) {
        this.f4419d = z;
        return this;
    }

    /* renamed from: a */
    public final C2218i mo34828a(Object[] objArr) {
        this.f4416a.f4423b = objArr;
        return this;
    }

    /* renamed from: a */
    public final String mo34829a() {
        String str = this.f4416a.f4422a;
        return str.substring(str.indexOf(47) + 1);
    }

    /* renamed from: b */
    public final C2218i mo34830b(Object obj) {
        C2221c cVar = this.f4417b;
        cVar.f4424a = 200;
        cVar.f4425b = obj;
        return this;
    }

    /* renamed from: b */
    public final C2218i mo34831b(boolean z) {
        this.f4420e = z;
        return this;
    }

    /* renamed from: b */
    public final Object[] mo34832b() {
        return this.f4416a.f4423b;
    }

    /* renamed from: c */
    public final int mo34833c() {
        return this.f4418c;
    }

    /* renamed from: d */
    public final boolean mo34834d() {
        return this.f4419d;
    }

    public final String toString() {
        return "Transaction: [id: " + this.f4418c + ", " + this.f4416a + this.f4417b + "]";
    }
}
