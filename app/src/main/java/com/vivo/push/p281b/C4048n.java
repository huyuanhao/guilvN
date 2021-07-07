package com.vivo.push.p281b;

import com.vivo.push.C4026a;

/* renamed from: com.vivo.push.b.n */
public final class C4048n extends C4055u {

    /* renamed from: a */
    public int f10930a;

    public C4048n() {
        super(2016);
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        super.mo40898c(aVar);
        aVar.mo40877a("key_dispatch_environment", this.f10930a);
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        super.mo40899d(aVar);
        this.f10930a = aVar.mo40883b("key_dispatch_environment", 0);
    }

    /* renamed from: d */
    public final int mo40916d() {
        return this.f10930a;
    }
}
