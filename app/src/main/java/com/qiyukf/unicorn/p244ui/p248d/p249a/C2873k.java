package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.os.Handler;
import android.text.TextUtils;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.api.msg.MessageService;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2374b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.C2377c;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2519j;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2554b;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2557e;
import com.qiyukf.unicorn.p244ui.p246b.DialogC2823a;
import com.qiyukf.unicorn.p244ui.p246b.DialogC2829c;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.ui.d.a.k */
public class C2873k extends AbstractC2857f {

    /* renamed from: a */
    public C2519j f6142a;

    /* renamed from: b */
    public TextView f6143b;

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private JSONObject m6695b() {
        JSONObject jSONObject = new JSONObject();
        C1810b.m3425a(jSONObject, "MSG_CLIENT_ID_TAG", this.message.getUuid());
        return jSONObject;
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        C2519j jVar = (C2519j) this.message.getAttachment();
        this.f6142a = jVar;
        this.f6143b.setText(jVar.mo35831d());
        JSONObject a = C1810b.m3420a(this.message.getExt());
        if (a == null ? true : TextUtils.isEmpty(C1810b.m3432e(a, "DRAWER_DIALOG_IS_OPEN_TAG"))) {
            JSONObject a2 = C1810b.m3420a(this.message.getExt());
            if (a2 == null) {
                a2 = new JSONObject();
            }
            C1810b.m3425a(a2, "DRAWER_DIALOG_IS_OPEN_TAG", "true");
            this.message.setExt(a2.toString());
            ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(this.message, true);
            for (C2557e eVar : this.f6142a.mo35833f()) {
                eVar.mo35977b("drawer_list");
            }
            final DialogC2829c cVar = new DialogC2829c(this.context, this.f6142a.mo35833f(), this.f6142a.mo35830c(), this.f6142a.mo35832e());
            cVar.mo36649a(new DialogC2823a.AbstractC2824a() {
                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2873k.C28741 */

                @Override // com.qiyukf.unicorn.p244ui.p246b.DialogC2823a.AbstractC2824a
                /* renamed from: a */
                public final void mo36642a(C2554b bVar) {
                    if ("url".equals(bVar.mo35954i())) {
                        C2452d.m5373e().onMessageItemClickListener.onURLClicked(C2873k.this.context, bVar.mo35955j());
                    } else if ("block".equals(bVar.mo35954i())) {
                        C2377c cVar = new C2377c();
                        cVar.fromJson(bVar.mo35946a());
                        cVar.mo35256a(true);
                        cVar.mo35257b(C2873k.this.m6695b().toString());
                        C2374b bVar2 = new C2374b();
                        bVar2.mo35239a(cVar.mo35267j());
                        bVar2.mo35241b(cVar.mo35268k());
                        bVar2.mo35240a(cVar.mo35258c());
                        cVar.mo35276a(bVar2);
                        MessageService.sendMessage(MessageBuilder.createCustomMessage(C2873k.this.message.getSessionId(), SessionTypeEnum.Ysf, cVar));
                        cVar.cancel();
                    }
                }
            });
            new Handler().postDelayed(new Runnable() {
                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2873k.RunnableC28752 */

                public final void run() {
                    if (C2873k.this.context != null) {
                        cVar.show();
                    }
                }
            }, 500);
        }
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: c */
    public final int mo36696c() {
        int i;
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        return (uICustomization == null || (i = uICustomization.msgRobotItemBackgroundLeft) <= 0) ? C2364R.C2366drawable.ysf_msg_back_left_selector : i;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_action_custom_layout;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6143b = (TextView) findViewById(C2364R.C2367id.ysf_tv_holder_drawer_list);
    }
}
