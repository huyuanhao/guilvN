package com.vivo.push.p281b;

import com.netease.nis.captcha.Captcha;
import com.vivo.push.C4026a;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.vivo.push.b.ad */
public final class C4035ad extends C4037c {

    /* renamed from: a */
    public ArrayList<String> f10911a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4035ad(boolean z, String str, String str2, ArrayList<String> arrayList) {
        super(z ? Captcha.WEB_VIEW_HTTPS_ERROR : 2005, str, str2);
        this.f10911a = arrayList;
    }

    @Override // com.vivo.push.p281b.C4037c, com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        super.mo40898c(aVar);
        aVar.mo40879a("tags", (Serializable) this.f10911a);
    }

    @Override // com.vivo.push.p281b.C4037c, com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        super.mo40899d(aVar);
        this.f10911a = aVar.mo40886b("tags");
    }

    @Override // com.vivo.push.p281b.C4037c, com.vivo.push.AbstractC4160y
    public final String toString() {
        return "TagCommand";
    }
}
