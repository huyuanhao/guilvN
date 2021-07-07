package com.qiyukf.unicorn.p244ui.p248d;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.nim.uikit.session.helper.View$OnTouchListenerC2001a;
import com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b;
import com.qiyukf.nim.uikit.session.viewholder.MsgContainerLayout;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;

/* renamed from: com.qiyukf.unicorn.ui.d.c */
public abstract class AbstractC2924c extends AbstractC2083b {

    /* renamed from: a */
    public TextView f6315a;

    /* renamed from: b */
    public LinearLayout f6316b;

    /* renamed from: c */
    public Button f6317c;

    /* renamed from: d */
    public LinearLayout f6318d;

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        int i;
        MsgContainerLayout msgContainerLayout = this.contentContainer;
        if (isReceivedMessage()) {
            UICustomization uICustomization = C2452d.m5373e().uiCustomization;
            if (uICustomization == null || (i = uICustomization.msgItemBackgroundLeft) <= 0) {
                i = C2364R.C2366drawable.ysf_msg_back_left_selector;
            }
        } else {
            UICustomization uICustomization2 = C2452d.m5373e().uiCustomization;
            if (uICustomization2 == null || (i = uICustomization2.msgItemBackgroundRight) <= 0) {
                i = C2364R.C2366drawable.ysf_msg_blue_back_rigth_selector;
            }
        }
        msgContainerLayout.setBackgroundResource(i);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_msg_holder_event_base;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6315a = (TextView) findViewById(C2364R.C2367id.ysf_tv_msg_event_base_title);
        this.f6317c = (Button) findViewById(C2364R.C2367id.ysf_btn_msg_event_base);
        this.f6316b = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_msg_event_base_btn_parent);
        this.f6318d = (LinearLayout) findViewById(C2364R.C2367id.ysf_divider_evaluation_event_line);
        this.f6315a.setOnTouchListener(View$OnTouchListenerC2001a.m3985a());
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int leftBackground() {
        return super.leftBackground();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int rightBackground() {
        return super.rightBackground();
    }
}
