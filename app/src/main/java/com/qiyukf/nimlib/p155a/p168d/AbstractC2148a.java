package com.qiyukf.nimlib.p155a.p168d;

import com.qiyukf.basesdk.sdk.ResponseCode;
import com.qiyukf.nimlib.p183g.p191c.C2289a;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2299f;

/* renamed from: com.qiyukf.nimlib.a.d.a */
public abstract class AbstractC2148a {

    /* renamed from: a */
    public C2289a f4311a;

    /* renamed from: com.qiyukf.nimlib.a.d.a$a */
    public static final class C2149a {

        /* renamed from: a */
        public C2289a f4312a;

        /* renamed from: b */
        public C2299f f4313b;

        /* renamed from: a */
        public static C2149a m4409a(C2289a aVar, short s) {
            if (aVar == null) {
                return null;
            }
            C2149a aVar2 = new C2149a();
            C2289a a = aVar.mo34935a();
            aVar2.f4312a = a;
            a.mo34941b(s);
            return aVar2;
        }
    }

    /* renamed from: a */
    public final C2289a mo34688a() {
        return this.f4311a;
    }

    /* renamed from: a */
    public abstract C2299f mo34642a(C2299f fVar);

    /* renamed from: a */
    public final void mo34689a(C2289a aVar) {
        this.f4311a = aVar;
    }

    /* renamed from: b */
    public final boolean mo34690b() {
        C2289a aVar = this.f4311a;
        return aVar != null && aVar.mo34949j() == 200;
    }

    /* renamed from: c */
    public final short mo34691c() {
        C2289a aVar = this.f4311a;
        if (aVar != null) {
            return aVar.mo34948i();
        }
        return 0;
    }

    /* renamed from: d */
    public final byte mo34692d() {
        C2289a aVar = this.f4311a;
        if (aVar != null) {
            return aVar.mo34947h();
        }
        return 0;
    }

    /* renamed from: e */
    public final short mo34693e() {
        C2289a aVar = this.f4311a;
        return aVar != null ? aVar.mo34949j() : ResponseCode.RES_EUNKNOWN;
    }
}
