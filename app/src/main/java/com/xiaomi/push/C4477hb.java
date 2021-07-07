package com.xiaomi.push;

import com.xiaomi.push.service.C4611am;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.hb */
public class C4477hb implements C4611am.C4613b.AbstractC4614a {

    /* renamed from: a */
    public int f12136a;

    /* renamed from: a */
    public AbstractC4435fu f12137a;

    /* renamed from: a */
    public XMPushService f12138a;

    /* renamed from: a */
    public C4611am.C4613b f12139a;

    /* renamed from: a */
    public C4611am.EnumC4617c f12140a;

    /* renamed from: a */
    public boolean f12141a = false;

    public C4477hb(XMPushService xMPushService, C4611am.C4613b bVar) {
        this.f12138a = xMPushService;
        this.f12140a = C4611am.EnumC4617c.binding;
        this.f12139a = bVar;
    }

    /* renamed from: b */
    private void m12860b() {
        this.f12139a.mo42684b(this);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m12861c() {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4477hb.m12861c():void");
    }

    /* renamed from: a */
    public void mo41989a() {
        this.f12139a.mo42682a(this);
        this.f12137a = this.f12138a.m13792a();
    }

    @Override // com.xiaomi.push.service.C4611am.C4613b.AbstractC4614a
    /* renamed from: a */
    public void mo41990a(C4611am.EnumC4617c cVar, C4611am.EnumC4617c cVar2, int i) {
        if (!this.f12141a && cVar == C4611am.EnumC4617c.binding) {
            this.f12140a = cVar2;
            this.f12136a = i;
            this.f12141a = true;
        }
        this.f12138a.mo42624a(new C4478hc(this, 4));
    }
}
