package com.qiyukf.nim.uikit.session.viewholder;

import com.qiyukf.unicorn.api.msg.attachment.MsgAttachment;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2559a;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2592v;

/* renamed from: com.qiyukf.nim.uikit.session.viewholder.j */
public class C2099j extends C2093f {
    @Override // com.qiyukf.nim.uikit.session.viewholder.C2093f
    /* renamed from: a */
    public final String mo34618a() {
        MsgAttachment attachment = this.message.getAttachment();
        return attachment instanceof C2559a ? ((C2559a) attachment).mo35982a().toString() : attachment instanceof C2592v ? ((C2592v) attachment).mo36116b() : this.message.getContent();
    }
}
