package com.qiyukf.nimlib.p183g.p184a.p187c;

import com.qiyukf.nimlib.p155a.C2107a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2154b;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2297d;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2299f;
import java.util.ArrayList;

@AbstractC2154b(mo34696a = 2, mo34697b = {"2"})
/* renamed from: com.qiyukf.nimlib.g.a.c.b */
public class C2259b extends AbstractC2148a {

    /* renamed from: b */
    public C2293b f4496b;

    /* renamed from: c */
    public ArrayList<C2107a> f4497c;

    @Override // com.qiyukf.nimlib.p155a.p168d.AbstractC2148a
    /* renamed from: a */
    public final C2299f mo34642a(C2299f fVar) {
        int f;
        this.f4496b = C2297d.m4893a(fVar);
        if (fVar.mo34974a() <= 0 || (f = fVar.mo34981f()) <= 0) {
            return null;
        }
        this.f4497c = new ArrayList<>(f);
        for (int i = 0; i < f; i++) {
            this.f4497c.add(C2107a.m4276a(C2297d.m4893a(fVar)));
        }
        return null;
    }

    /* renamed from: f */
    public final C2293b mo34885f() {
        return this.f4496b;
    }

    /* renamed from: g */
    public final ArrayList<C2107a> mo34886g() {
        return this.f4497c;
    }
}
