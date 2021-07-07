package com.qiyukf.nimlib.p155a.p162c.p164b;

import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2295b;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.a.c.b.a */
public final class C2137a extends AbstractC2131a {

    /* renamed from: a */
    public byte f4293a;

    /* renamed from: b */
    public byte f4294b;

    /* renamed from: c */
    public List<Long> f4295c;

    /* renamed from: a */
    public final void mo34677a(byte b) {
        this.f4293a = b;
    }

    /* renamed from: a */
    public final void mo34678a(List<Long> list) {
        this.f4295c = list;
    }

    @Override // com.qiyukf.nimlib.p155a.p162c.AbstractC2131a
    /* renamed from: b */
    public final C2295b mo34669b() {
        C2295b bVar = new C2295b();
        bVar.mo34960a(this.f4293a);
        bVar.mo34960a(this.f4294b);
        bVar.mo34969b(this.f4295c.size());
        for (Long l : this.f4295c) {
            bVar.mo34962a(l.longValue());
        }
        return bVar;
    }

    /* renamed from: b */
    public final void mo34679b(byte b) {
        this.f4294b = b;
    }

    @Override // com.qiyukf.nimlib.p155a.p162c.AbstractC2131a
    /* renamed from: c */
    public final byte mo34670c() {
        return 4;
    }

    @Override // com.qiyukf.nimlib.p155a.p162c.AbstractC2131a
    /* renamed from: d */
    public final byte mo34671d() {
        return 5;
    }
}
