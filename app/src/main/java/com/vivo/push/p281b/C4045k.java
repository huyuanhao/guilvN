package com.vivo.push.p281b;

import com.vivo.push.C4026a;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.vivo.push.b.k */
public final class C4045k extends C4055u {

    /* renamed from: a */
    public String f10925a;

    /* renamed from: b */
    public String f10926b;

    /* renamed from: c */
    public String f10927c;

    public C4045k(int i) {
        super(i);
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        super.mo40898c(aVar);
        aVar.mo40880a(Constants.APP_ID, this.f10925a);
        aVar.mo40880a("client_id", this.f10926b);
        aVar.mo40880a("client_token", this.f10927c);
    }

    /* renamed from: d */
    public final String mo40912d() {
        return this.f10925a;
    }

    /* renamed from: e */
    public final String mo40913e() {
        return this.f10927c;
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    public final String toString() {
        return "OnBindCommand";
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        super.mo40899d(aVar);
        this.f10925a = aVar.mo40876a(Constants.APP_ID);
        this.f10926b = aVar.mo40876a("client_id");
        this.f10927c = aVar.mo40876a("client_token");
    }
}
