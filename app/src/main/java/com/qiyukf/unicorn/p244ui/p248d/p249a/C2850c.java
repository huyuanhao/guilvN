package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2500a;

/* renamed from: com.qiyukf.unicorn.ui.d.a.c */
public class C2850c extends AbstractC2857f {

    /* renamed from: a */
    public TextView f6060a;

    /* renamed from: b */
    public LinearLayout f6061b;

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        int i;
        int i2;
        C2500a aVar = (C2500a) this.message.getAttachment();
        this.f6060a.setText(aVar.mo35762c());
        this.f6061b.removeAllViews();
        for (final C2500a.C2501a aVar2 : aVar.mo35763d()) {
            TextView textView = (TextView) LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_bot_button, (ViewGroup) this.f6061b, false);
            UICustomization uICustomization = C2452d.m5373e().uiCustomization;
            if (uICustomization == null || (i = uICustomization.robotBtnTextColor) == 0) {
                i = this.context.getResources().getColor(C2364R.C2365color.ysf_blue_5092e1);
            }
            textView.setTextColor(i);
            if (uICustomization == null || (i2 = uICustomization.robotBtnBack) == 0) {
                i2 = C2364R.C2366drawable.ysf_btn_white_blue_bg_selector;
            }
            textView.setBackgroundResource(i2);
            textView.setText(aVar2.mo35764a());
            textView.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2850c.View$OnClickListenerC28511 */

                public final void onClick(View view) {
                    if (TextUtils.equals("url", aVar2.mo35765b())) {
                        C2850c.this.mo36699a(aVar2.mo35766c());
                    } else if (!C2850c.this.mo36704g()) {
                        C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
                    } else {
                        C2850c.this.mo36701a(aVar2.mo35766c(), aVar2.mo35767d(), aVar2.mo35764a());
                    }
                }
            });
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.topMargin = C1862c.m3540a(15.0f);
            this.f6061b.addView(textView, layoutParams);
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_action_list;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6060a = (TextView) findViewById(C2364R.C2367id.ysf_tv_action_list_label);
        this.f6061b = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_action_list_action_container);
    }
}
