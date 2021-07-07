package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p118pd.sdk.C7009o000OoOo;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.OnMessageItemClickListener;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2535r;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p231j.C2692b;

/* renamed from: com.qiyukf.unicorn.ui.d.a.v */
public class C2907v extends AbstractC2857f {

    /* renamed from: a */
    public TextView f6260a;

    /* renamed from: b */
    public LinearLayout f6261b;

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        int i;
        int i2;
        C2535r rVar = (C2535r) this.message.getAttachment();
        this.f6260a.setText(rVar.mo35904c());
        this.f6261b.removeAllViews();
        TextView textView = (TextView) LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_bot_text, (ViewGroup) this.f6261b, false);
        textView.setTextSize(14.0f);
        textView.setTextColor(C7009o000OoOo.OooO00o(this.context, C2364R.C2365color.ysf_grey_666666));
        textView.setText(rVar.mo35905d());
        this.f6261b.addView(textView);
        for (final C2535r.C2536a aVar : rVar.mo35906e()) {
            TextView textView2 = (TextView) LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_bot_button, (ViewGroup) this.f6261b, false);
            UICustomization uICustomization = C2452d.m5373e().uiCustomization;
            if (uICustomization == null || (i = uICustomization.robotBtnTextColor) == 0) {
                i = this.context.getResources().getColor(C2364R.C2365color.ysf_white);
            }
            textView2.setTextColor(i);
            if (!C2690a.m6219a().mo36462d() || textView2.getBackground() == null) {
                if (uICustomization == null || (i2 = uICustomization.robotBtnBack) == 0) {
                    i2 = C2364R.C2366drawable.ysf_evaluator_btn_first_bg;
                }
                textView2.setBackgroundResource(i2);
            } else {
                textView2.setBackgroundDrawable(C2692b.m6228a(C2690a.m6219a().mo36461c().mo35690b()));
            }
            textView2.setText(aVar.mo35910d());
            textView2.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2907v.View$OnClickListenerC29081 */

                public final void onClick(View view) {
                    if ("url".equals(aVar.mo35907a()) && !TextUtils.isEmpty(aVar.mo35908b())) {
                        OnMessageItemClickListener onMessageItemClickListener = C2452d.m5373e().onMessageItemClickListener;
                        if (onMessageItemClickListener != null) {
                            onMessageItemClickListener.onURLClicked(C2907v.this.context, aVar.mo35908b());
                        }
                    } else if (!C2907v.this.mo36704g()) {
                        C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
                    } else {
                        C2907v.this.mo36701a(aVar.mo35908b(), aVar.mo35909c(), aVar.mo35910d());
                    }
                }
            });
            if (mo36704g()) {
                textView2.setEnabled(true);
            } else {
                textView2.setEnabled(false);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams.topMargin = C1862c.m3540a(10.0f);
            this.f6261b.addView(textView2, layoutParams);
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_order_status;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6260a = (TextView) findViewById(C2364R.C2367id.ysf_tv_order_status_label);
        this.f6261b = (LinearLayout) findViewById(C2364R.C2367id.ysf_order_status_action_container);
    }
}
