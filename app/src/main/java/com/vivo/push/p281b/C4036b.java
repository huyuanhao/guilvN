package com.vivo.push.p281b;

import com.vivo.push.C4026a;

/* renamed from: com.vivo.push.b.b */
public final class C4036b extends C4037c {

    /* renamed from: a */
    public String f10912a;

    /* renamed from: b */
    public String f10913b;

    /* renamed from: c */
    public String f10914c;

    /* renamed from: d */
    public String f10915d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4036b(boolean z, String str) {
        super(z ? 2006 : 2007, null, str);
    }

    @Override // com.vivo.push.p281b.C4037c, com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        super.mo40898c(aVar);
        aVar.mo40880a("sdk_clients", this.f10912a);
        aVar.mo40878a("sdk_version", 293L);
        aVar.mo40880a("BaseAppCommand.EXTRA_APPID", this.f10914c);
        aVar.mo40880a("BaseAppCommand.EXTRA_APPKEY", this.f10913b);
        aVar.mo40880a("PUSH_REGID", this.f10915d);
    }

    /* renamed from: d */
    public final void mo40903d() {
        this.f10914c = null;
    }

    /* renamed from: e */
    public final void mo40904e() {
        this.f10913b = null;
    }

    @Override // com.vivo.push.p281b.C4037c, com.vivo.push.AbstractC4160y
    public final String toString() {
        return "AppCommand:" + mo41216b();
    }

    @Override // com.vivo.push.p281b.C4037c, com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        super.mo40899d(aVar);
        this.f10912a = aVar.mo40876a("sdk_clients");
        this.f10914c = aVar.mo40876a("BaseAppCommand.EXTRA_APPID");
        this.f10913b = aVar.mo40876a("BaseAppCommand.EXTRA_APPKEY");
        this.f10915d = aVar.mo40876a("PUSH_REGID");
    }
}
