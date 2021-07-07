package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2374b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p207a.C2372c;
import com.qiyukf.unicorn.p213f.p214a.p215a.p217b.C2544b;

/* renamed from: com.qiyukf.unicorn.ui.d.a.s */
public class C2897s extends AbstractC2857f {

    /* renamed from: a */
    public TextView f6217a;

    /* renamed from: b */
    public LinearLayout f6218b;

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        C2372c cVar = (C2372c) this.message.getAttachment();
        this.f6217a.setText(cVar.mo35232c());
        this.f6218b.removeAllViews();
        for (final C2372c.C2373a aVar : cVar.mo35233d()) {
            TextView textView = (TextView) LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_tv_mix_reply, (ViewGroup) this.f6218b, false);
            textView.setText(aVar.mo35234a());
            textView.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2897s.View$OnClickListenerC28981 */

                public final void onClick(View view) {
                    if (!C2897s.this.mo36704g()) {
                        C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
                        return;
                    }
                    C2544b bVar = new C2544b();
                    bVar.mo35930a(aVar.mo35234a());
                    bVar.mo35931b(aVar.mo35235b());
                    C2374b bVar2 = new C2374b();
                    String str = "";
                    bVar2.mo35239a(aVar.mo35236c() == null ? str : aVar.mo35236c());
                    if (aVar.mo35237d() != null) {
                        str = aVar.mo35237d();
                    }
                    bVar2.mo35241b(str);
                    bVar2.mo35242c(aVar.mo35234a());
                    bVar2.mo35243d(aVar.mo35235b());
                    bVar2.mo35240a(bVar.mo35933d());
                    bVar.mo35276a(bVar2);
                    C2897s.this.getAdapter().mo34518e().mo34509c(MessageBuilder.createCustomMessage(C2897s.this.message.getSessionId(), SessionTypeEnum.Ysf, bVar));
                }
            });
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.topMargin = C1862c.m3540a(0.0f);
            this.f6218b.addView(textView, layoutParams);
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_mix_reply;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6217a = (TextView) findViewById(C2364R.C2367id.ysf_tv_mix_reply_label);
        this.f6218b = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_mix_reply_question_container);
    }
}
