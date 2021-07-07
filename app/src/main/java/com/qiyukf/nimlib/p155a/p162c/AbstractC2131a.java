package com.qiyukf.nimlib.p155a.p162c;

import com.qiyukf.nimlib.p183g.p191c.C2289a;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2295b;
import java.nio.ByteBuffer;

/* renamed from: com.qiyukf.nimlib.a.c.a */
public abstract class AbstractC2131a {

    /* renamed from: a */
    public C2289a f4283a;

    /* renamed from: b */
    public Object f4284b;

    /* renamed from: com.qiyukf.nimlib.a.c.a$a */
    public static class C2132a {

        /* renamed from: a */
        public C2289a f4285a;

        /* renamed from: b */
        public ByteBuffer f4286b;

        public C2132a(C2289a aVar, ByteBuffer byteBuffer) {
            this.f4285a = aVar;
            this.f4286b = byteBuffer;
        }
    }

    /* renamed from: a */
    public final C2289a mo34667a() {
        if (this.f4283a == null) {
            this.f4283a = new C2289a(mo34670c(), mo34671d());
        }
        return this.f4283a;
    }

    /* renamed from: a */
    public final void mo34668a(Object obj) {
        this.f4284b = obj;
    }

    /* renamed from: b */
    public abstract C2295b mo34669b();

    /* renamed from: c */
    public abstract byte mo34670c();

    /* renamed from: d */
    public abstract byte mo34671d();

    /* renamed from: e */
    public final Object mo34672e() {
        return this.f4284b;
    }
}
