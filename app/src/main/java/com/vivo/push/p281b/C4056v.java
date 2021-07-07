package com.vivo.push.p281b;

import com.vivo.push.C4026a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.vivo.push.b.v */
public final class C4056v extends C4055u {

    /* renamed from: a */
    public ArrayList<String> f10943a = null;

    /* renamed from: b */
    public ArrayList<String> f10944b = null;

    public C4056v(int i) {
        super(i);
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        super.mo40898c(aVar);
        aVar.mo40881a("content", this.f10943a);
        aVar.mo40881a("error_msg", this.f10944b);
    }

    /* renamed from: d */
    public final ArrayList<String> mo40933d() {
        return this.f10943a;
    }

    /* renamed from: e */
    public final List<String> mo40934e() {
        return this.f10944b;
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    public final String toString() {
        return "OnSetTagsCommand";
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        super.mo40899d(aVar);
        this.f10943a = aVar.mo40886b("content");
        this.f10944b = aVar.mo40886b("error_msg");
    }
}
