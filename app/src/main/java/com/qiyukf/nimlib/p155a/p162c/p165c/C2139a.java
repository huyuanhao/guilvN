package com.qiyukf.nimlib.p155a.p162c.p165c;

import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2295b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2297d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.a.c.c.a */
public final class C2139a extends AbstractC2131a {

    /* renamed from: a */
    public List<String> f4298a;

    public C2139a(String str) {
        ArrayList arrayList = new ArrayList(1);
        this.f4298a = arrayList;
        arrayList.add(str);
    }

    @Override // com.qiyukf.nimlib.p155a.p162c.AbstractC2131a
    /* renamed from: b */
    public final C2295b mo34669b() {
        C2295b bVar = new C2295b();
        C2297d.m4894a(bVar, this.f4298a);
        return bVar;
    }

    @Override // com.qiyukf.nimlib.p155a.p162c.AbstractC2131a
    /* renamed from: c */
    public final byte mo34670c() {
        return 2;
    }

    @Override // com.qiyukf.nimlib.p155a.p162c.AbstractC2131a
    /* renamed from: d */
    public final byte mo34671d() {
        return 8;
    }
}
