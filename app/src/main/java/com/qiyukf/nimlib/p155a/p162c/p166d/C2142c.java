package com.qiyukf.nimlib.p155a.p162c.p166d;

import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2295b;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;

/* renamed from: com.qiyukf.nimlib.a.c.d.c */
public final class C2142c extends AbstractC2131a {

    /* renamed from: a */
    public SessionTypeEnum f4301a;

    /* renamed from: b */
    public String f4302b;

    /* renamed from: c */
    public long f4303c;

    /* renamed from: d */
    public long f4304d;

    /* renamed from: e */
    public long f4305e;

    /* renamed from: f */
    public int f4306f;

    /* renamed from: g */
    public boolean f4307g;

    /* renamed from: h */
    public boolean f4308h;

    public C2142c(String str, SessionTypeEnum sessionTypeEnum, long j, long j2, long j3, int i, boolean z, boolean z2) {
        this.f4302b = str;
        this.f4301a = sessionTypeEnum;
        this.f4303c = j;
        this.f4304d = j2;
        this.f4305e = j3;
        this.f4306f = i;
        this.f4307g = z;
        this.f4308h = z2;
    }

    @Override // com.qiyukf.nimlib.p155a.p162c.AbstractC2131a
    /* renamed from: b */
    public final C2295b mo34669b() {
        C2295b bVar = new C2295b();
        if (this.f4301a == SessionTypeEnum.Team) {
            bVar.mo34970b(this.f4302b);
        } else {
            bVar.mo34964a(this.f4302b);
        }
        bVar.mo34962a(this.f4303c);
        bVar.mo34962a(this.f4304d);
        bVar.mo34962a(this.f4305e);
        bVar.mo34961a(this.f4306f);
        bVar.mo34967a(this.f4307g);
        return bVar;
    }

    @Override // com.qiyukf.nimlib.p155a.p162c.AbstractC2131a
    /* renamed from: c */
    public final byte mo34670c() {
        return this.f4301a == SessionTypeEnum.Team ? (byte) 8 : 7;
    }

    @Override // com.qiyukf.nimlib.p155a.p162c.AbstractC2131a
    /* renamed from: d */
    public final byte mo34671d() {
        return this.f4301a == SessionTypeEnum.Team ? (byte) 23 : 6;
    }
}
