package com.vivo.push.p281b;

import com.vivo.push.C4026a;

/* renamed from: com.vivo.push.b.p */
public final class C4050p extends C4055u {

    /* renamed from: a */
    public String f10932a;

    /* renamed from: b */
    public int f10933b = 0;

    /* renamed from: c */
    public boolean f10934c = false;

    public C4050p() {
        super(7);
    }

    /* renamed from: a */
    public final void mo40918a(int i) {
        this.f10933b = i;
    }

    /* renamed from: b */
    public final void mo40920b(String str) {
        this.f10932a = str;
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        super.mo40898c(aVar);
        aVar.mo40880a("content", this.f10932a);
        aVar.mo40877a("log_level", this.f10933b);
        aVar.mo40882a("is_server_log", this.f10934c);
    }

    /* renamed from: d */
    public final String mo40921d() {
        return this.f10932a;
    }

    /* renamed from: e */
    public final int mo40922e() {
        return this.f10933b;
    }

    /* renamed from: f */
    public final boolean mo40923f() {
        return this.f10934c;
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    public final String toString() {
        return "OnLogCommand";
    }

    /* renamed from: a */
    public final void mo40919a(boolean z) {
        this.f10934c = z;
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        super.mo40899d(aVar);
        this.f10932a = aVar.mo40876a("content");
        this.f10933b = aVar.mo40883b("log_level", 0);
        this.f10934c = aVar.mo40888d("is_server_log");
    }
}
