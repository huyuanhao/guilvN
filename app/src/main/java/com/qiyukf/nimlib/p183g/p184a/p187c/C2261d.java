package com.qiyukf.nimlib.p183g.p184a.p187c;

import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2154b;
import com.qiyukf.nimlib.p183g.p191c.C2289a;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2295b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2299f;

@AbstractC2154b(mo34696a = 4, mo34697b = {"1", "2"})
/* renamed from: com.qiyukf.nimlib.g.a.c.d */
public class C2261d extends AbstractC2148a {

    /* renamed from: b */
    public long f4500b;

    /* renamed from: c */
    public C2289a f4501c;

    @Override // com.qiyukf.nimlib.p155a.p168d.AbstractC2148a
    /* renamed from: a */
    public final C2299f mo34642a(C2299f fVar) {
        short s;
        C2289a aVar;
        this.f4500b = fVar.mo34982g();
        C2289a aVar2 = new C2289a();
        this.f4501c = aVar2;
        aVar2.mo34938a(fVar);
        if (this.f4311a.mo34947h() == 2) {
            aVar = this.f4501c;
            s = 0;
        } else {
            aVar = this.f4501c;
            s = 1;
        }
        aVar.mo34939a(s);
        C1709a.m3011a("core", "packet in notify: " + this.f4501c);
        C2295b bVar = new C2295b();
        bVar.mo34963a(this.f4501c);
        bVar.mo34965a(fVar.mo34977b());
        return new C2299f(bVar.mo34972b());
    }

    /* renamed from: f */
    public final long mo34889f() {
        return this.f4500b;
    }

    /* renamed from: g */
    public final C2289a mo34890g() {
        return this.f4501c;
    }
}
