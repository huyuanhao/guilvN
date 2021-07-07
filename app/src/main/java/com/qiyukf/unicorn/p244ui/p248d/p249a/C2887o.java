package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.text.TextUtils;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p195h.C2315c;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2374b;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2522l;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2523m;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.ui.d.a.o */
public class C2887o extends AbstractC2857f {

    /* renamed from: a */
    public C2522l f6191a;

    /* renamed from: b */
    public TextView f6192b;

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        C2522l lVar = (C2522l) this.message.getAttachment();
        this.f6191a = lVar;
        this.f6192b.setText(lVar.mo35851d());
        JSONObject a = C1810b.m3420a(this.message.getExt());
        if (a == null ? true : TextUtils.isEmpty(C1810b.m3432e(a, "HORIZONTAL_IS_SEND_MSG_TAG"))) {
            C2523m mVar = new C2523m();
            JSONObject c = this.f6191a.mo35850c();
            C1810b.m3425a(c, "id", "horizontal_sliding_label");
            mVar.fromJson(c);
            C2374b bVar = new C2374b();
            bVar.mo35240a(mVar.mo35852c());
            mVar.mo35276a(bVar);
            C2313a aVar = (C2313a) MessageBuilder.createCustomMessage(this.message.getSessionId(), SessionTypeEnum.Ysf, mVar);
            aVar.setStatus(MsgStatusEnum.success);
            C2315c.m4986a(aVar);
            JSONObject a2 = C1810b.m3420a(this.message.getExt());
            if (a2 == null) {
                a2 = new JSONObject();
            }
            C1810b.m3425a(a2, "HORIZONTAL_IS_SEND_MSG_TAG", "true");
            this.message.setExt(a2.toString());
            ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(this.message, true);
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_action_custom_layout;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6192b = (TextView) findViewById(C2364R.C2367id.ysf_tv_holder_drawer_list);
    }
}
