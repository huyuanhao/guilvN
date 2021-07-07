package com.vivo.push.p281b;

import com.netease.nis.captcha.Captcha;
import com.vivo.push.C4026a;
import java.util.ArrayList;

/* renamed from: com.vivo.push.b.a */
public final class C4031a extends C4037c {

    /* renamed from: a */
    public ArrayList<String> f10907a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4031a(boolean z, String str, String str2, ArrayList<String> arrayList) {
        super(z ? 2002 : Captcha.WEB_VIEW_HTTP_ERROR, str, str2);
        this.f10907a = arrayList;
    }

    @Override // com.vivo.push.p281b.C4037c, com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        super.mo40898c(aVar);
        aVar.mo40881a("tags", this.f10907a);
    }

    @Override // com.vivo.push.p281b.C4037c, com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        super.mo40899d(aVar);
        this.f10907a = aVar.mo40886b("tags");
    }

    @Override // com.vivo.push.p281b.C4037c, com.vivo.push.AbstractC4160y
    public final String toString() {
        return "AliasCommand:" + mo41216b();
    }
}
