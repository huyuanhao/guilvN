package com.vivo.push.p281b;

import android.text.TextUtils;
import com.vivo.push.C4026a;
import com.vivo.push.model.UnvarnishedMessage;

/* renamed from: com.vivo.push.b.q */
public final class C4051q extends AbstractC4058x {

    /* renamed from: a */
    public UnvarnishedMessage f10935a;

    public C4051q() {
        super(3);
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.p281b.AbstractC4058x, com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        super.mo40898c(aVar);
        aVar.mo40880a("msg_v1", this.f10935a.unpackToJson());
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.p281b.AbstractC4058x, com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        super.mo40899d(aVar);
        String a = aVar.mo40876a("msg_v1");
        if (!TextUtils.isEmpty(a)) {
            UnvarnishedMessage unvarnishedMessage = new UnvarnishedMessage(a);
            this.f10935a = unvarnishedMessage;
            unvarnishedMessage.setMsgId(mo40937f());
        }
    }

    /* renamed from: e */
    public final UnvarnishedMessage mo40925e() {
        return this.f10935a;
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    public final String toString() {
        return "OnMessageCommand";
    }

    /* renamed from: d */
    public final String mo40924d() {
        UnvarnishedMessage unvarnishedMessage = this.f10935a;
        if (unvarnishedMessage == null) {
            return null;
        }
        return unvarnishedMessage.unpackToJson();
    }
}
