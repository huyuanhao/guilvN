package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.widget.TextView;
import com.qiyukf.nim.uikit.session.emoji.C1990f;
import com.qiyukf.nim.uikit.session.helper.C2015e;
import com.qiyukf.nim.uikit.session.viewholder.C2096h;
import com.qiyukf.unicorn.api.msg.attachment.MsgAttachment;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2541u;
import com.qiyukf.unicorn.p213f.p214a.p215a.p217b.C2544b;
import com.qiyukf.unicorn.p213f.p214a.p215a.p217b.C2545c;

/* renamed from: com.qiyukf.unicorn.ui.d.a.z */
public class C2916z extends C2096h {
    @Override // com.qiyukf.nim.uikit.session.viewholder.C2096h
    /* renamed from: a */
    public final void mo34624a(TextView textView) {
        MsgAttachment attachment = this.message.getAttachment();
        textView.setText(C2015e.m4002a(this.context, C1990f.m3947a(this.context, attachment instanceof C2541u ? ((C2541u) attachment).mo35925c() : attachment instanceof C2545c ? ((C2545c) attachment).mo35936d() : attachment instanceof C2544b ? ((C2544b) attachment).mo35932c() : "", this.message.getSessionId())));
    }
}
