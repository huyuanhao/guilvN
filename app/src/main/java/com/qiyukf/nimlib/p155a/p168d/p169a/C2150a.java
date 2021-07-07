package com.qiyukf.nimlib.p155a.p168d.p169a;

import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2154b;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2297d;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2299f;
import java.util.ArrayList;
import java.util.List;

@AbstractC2154b(mo34696a = 6, mo34697b = {"1"})
/* renamed from: com.qiyukf.nimlib.a.d.a.a */
public class C2150a extends AbstractC2148a {

    /* renamed from: b */
    public List<C2293b> f4314b;

    @Override // com.qiyukf.nimlib.p155a.p168d.AbstractC2148a
    /* renamed from: a */
    public final C2299f mo34642a(C2299f fVar) {
        this.f4314b = new ArrayList();
        int f = fVar.mo34981f();
        for (int i = 0; i < f; i++) {
            this.f4314b.add(C2297d.m4893a(fVar));
        }
        return null;
    }

    /* renamed from: f */
    public final List<C2293b> mo34694f() {
        return this.f4314b;
    }
}
