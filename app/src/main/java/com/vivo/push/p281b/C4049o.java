package com.vivo.push.p281b;

import com.vivo.push.C4026a;
import java.util.ArrayList;

/* renamed from: com.vivo.push.b.o */
public final class C4049o extends C4055u {

    /* renamed from: a */
    public ArrayList<String> f10931a;

    public C4049o() {
        super(8);
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        super.mo40898c(aVar);
        aVar.mo40881a("tags_list", this.f10931a);
    }

    /* renamed from: d */
    public final ArrayList<String> mo40917d() {
        return this.f10931a;
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    public final String toString() {
        return "OnListTagCommand";
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        super.mo40899d(aVar);
        this.f10931a = aVar.mo40886b("tags_list");
    }
}
