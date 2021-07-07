package com.vivo.push.p281b;

import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4026a;

/* renamed from: com.vivo.push.b.j */
public final class C4044j extends AbstractC4160y {

    /* renamed from: a */
    public String f10924a;

    public C4044j() {
        super(2013);
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        aVar.mo40880a("MsgArriveCommand.MSG_TAG", this.f10924a);
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        this.f10924a = aVar.mo40876a("MsgArriveCommand.MSG_TAG");
    }

    public C4044j(String str) {
        this();
        this.f10924a = str;
    }
}
