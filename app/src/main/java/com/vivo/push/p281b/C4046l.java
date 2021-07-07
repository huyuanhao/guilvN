package com.vivo.push.p281b;

import com.vivo.push.C4026a;

/* renamed from: com.vivo.push.b.l */
public final class C4046l extends C4055u {

    /* renamed from: a */
    public int f10928a = -1;

    /* renamed from: b */
    public int f10929b = -1;

    public C4046l() {
        super(12);
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        super.mo40898c(aVar);
        aVar.mo40877a("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f10928a);
        aVar.mo40877a("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.f10929b);
    }

    /* renamed from: d */
    public final int mo40914d() {
        return this.f10928a;
    }

    /* renamed from: e */
    public final int mo40915e() {
        return this.f10929b;
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    public final String toString() {
        return "OnChangePushStatusCommand";
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        super.mo40899d(aVar);
        this.f10928a = aVar.mo40883b("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f10928a);
        this.f10929b = aVar.mo40883b("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.f10929b);
    }
}
