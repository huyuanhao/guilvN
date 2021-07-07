package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.session.helper.View$OnTouchListenerC2001a;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2369a;
import com.qiyukf.unicorn.p212e.C2474i;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2537s;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p231j.C2692b;
import com.qiyukf.unicorn.p232k.C2700f;
import com.qiyukf.unicorn.widget.BotActionItemView;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.ui.d.a.x */
public class C2913x extends AbstractC2857f {

    /* renamed from: a */
    public TextView f6279a;

    /* renamed from: b */
    public View$OnTouchListenerC2001a f6280b;

    /* renamed from: c */
    public C2537s f6281c;

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        int i;
        TextView textView;
        this.f6281c = (C2537s) this.message.getAttachment();
        C2700f.m6246a(this.f6279a, this.f6281c.mo35911c(), (int) this.f6279a.getResources().getDimension(C2364R.dimen.ysf_bubble_content_rich_image_max_width), this.message.getSessionId());
        List<C2537s.C2538a> d = this.f6281c.mo35912d();
        LinearLayout quickEntryContainer = getQuickEntryContainer();
        quickEntryContainer.removeAllViews();
        int i2 = 0;
        while (i2 < d.size()) {
            final C2537s.C2538a aVar = d.get(i2);
            BotActionItemView botActionItemView = new BotActionItemView(this.context);
            botActionItemView.mo36841a("", aVar.mo35917a());
            int i3 = i2 + 1;
            botActionItemView.mo36840a(Long.valueOf((long) ((i3 * 100) << 1)));
            botActionItemView.mo36839a(!this.f6281c.mo35913e());
            botActionItemView.mo36838a(this.context.getResources().getDimension(C2364R.dimen.ysf_text_size_14));
            botActionItemView.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2913x.View$OnClickListenerC29141 */

                public final void onClick(View view) {
                    C2474i b = C2452d.m5375g().mo36345b(C2913x.this.message.getSessionId());
                    if (C2452d.m5375g().mo36349c(C2913x.this.message.getSessionId()) == C2913x.this.getMsgSessionId() || (b != null && b.f4891f && b.f4892g == C2913x.this.getMsgSessionId())) {
                        IMMessage createTextMessage = MessageBuilder.createTextMessage(C2913x.this.message.getSessionId(), C2913x.this.message.getSessionType(), aVar.mo35917a());
                        createTextMessage.setStatus(MsgStatusEnum.success);
                        C2913x.this.getAdapter().mo34518e().mo34509c(createTextMessage);
                        return;
                    }
                    C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C1862c.m3540a(36.0f));
            layoutParams.leftMargin = C1862c.m3540a(i2 == 0 ? 0.0f : 4.0f);
            layoutParams.rightMargin = C1862c.m3540a(4.0f);
            botActionItemView.setLayoutParams(layoutParams);
            UICustomization uICustomization = C2452d.m5373e().uiCustomization;
            if (uICustomization == null || uICustomization.inputUpBtnTextColor == 0) {
                textView = botActionItemView.mo36837a();
                i = this.context.getResources().getColor(C2364R.C2365color.ysf_black_333333);
            } else {
                textView = botActionItemView.mo36837a();
                i = uICustomization.inputUpBtnTextColor;
            }
            textView.setTextColor(i);
            if (C2690a.m6219a().mo36462d()) {
                botActionItemView.getRootView().setBackgroundDrawable(C2692b.m6229a(C2690a.m6219a().mo36461c().mo35690b(), "#ffffff"));
            } else if (uICustomization == null || uICustomization.inputUpBtnBack == 0) {
                botActionItemView.getRootView().setBackgroundResource(C2364R.C2366drawable.ysf_message_quick_entry_item_bg);
            } else {
                botActionItemView.getRootView().setBackgroundResource(uICustomization.inputUpBtnBack);
            }
            quickEntryContainer.addView(botActionItemView);
            i2 = i3;
        }
        if (!this.f6281c.mo35913e()) {
            this.f6281c.mo35914f();
            ((C2369a) this.f6281c.mo35275a()).mo35229a("isAlreadyShowAnimation", true);
            ((MsgService) NIMClient.getService(MsgService.class)).updateIMMessageStatus(this.message, false);
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_msg_item_radio_btn;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6279a = (TextView) findViewById(C2364R.C2367id.ysf_tv_radio_btn_title);
        View$OnTouchListenerC2001a a = View$OnTouchListenerC2001a.m3985a();
        this.f6280b = a;
        this.f6279a.setOnTouchListener(a);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean isShowQuickEntry() {
        C2537s sVar = (C2537s) this.message.getAttachment();
        this.f6281c = sVar;
        return !sVar.mo35915g();
    }
}
