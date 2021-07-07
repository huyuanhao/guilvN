package com.qiyukf.nim.uikit.session.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nim.uikit.session.emoji.C1990f;
import com.qiyukf.nim.uikit.session.helper.C2003b;
import com.qiyukf.nim.uikit.session.helper.C2015e;
import com.qiyukf.nim.uikit.session.helper.View$OnTouchListenerC2001a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p231j.C2690a;
import org.json.JSONObject;

/* renamed from: com.qiyukf.nim.uikit.session.viewholder.h */
public class C2096h extends AbstractC2083b {

    /* renamed from: a */
    public TextView f4216a;

    /* renamed from: b */
    public ImageView f4217b;

    /* renamed from: c */
    public ImageView f4218c;

    /* renamed from: d */
    public View$OnTouchListenerC2001a f4219d = null;

    /* renamed from: e */
    public View.OnClickListener f4220e = new View.OnClickListener() {
        /* class com.qiyukf.nim.uikit.session.viewholder.C2096h.View$OnClickListenerC20971 */

        public final void onClick(View view) {
            C2003b.m3987a(C2096h.this.context, C2096h.this.f4224i, "");
        }
    };

    /* renamed from: f */
    public TextView f4221f;

    /* renamed from: g */
    public LinearLayout f4222g;

    /* renamed from: h */
    public TextView f4223h;

    /* renamed from: i */
    public String f4224i;

    /* renamed from: a */
    public int mo34623a() {
        int i;
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        return (uICustomization == null || (i = uICustomization.msgItemBackgroundLeft) <= 0) ? C2364R.C2366drawable.ysf_msg_back_left_selector : i;
    }

    /* renamed from: a */
    public void mo34624a(TextView textView) {
        textView.setText(C2015e.m4002a(this.context, C2667c.m6114a(this.message) == 2 ? C1990f.m3947a(this.context, this.message.getContent(), this.message.getSessionId()) : C1990f.m3950a(this.message.getContent()) ? C1990f.m3946a(this.context, this.message.getContent(), this.f4216a) : C1990f.m3945a(this.context, this.message.getContent())));
    }

    /* renamed from: b */
    public int mo34625b() {
        int i;
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        return (uICustomization == null || (i = uICustomization.msgItemBackgroundRight) <= 0) ? C2364R.C2366drawable.ysf_msg_blue_back_rigth_selector : i;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        int i;
        TextView textView;
        int i2;
        int i3;
        if (isReceivedMessage()) {
            this.f4222g.setBackgroundResource(mo34623a());
            textView = this.f4216a;
            UICustomization uICustomization = C2452d.m5373e().uiCustomization;
            if (uICustomization == null || (i = uICustomization.textMsgColorLeft) == 0) {
                i = -16777216;
            }
        } else {
            this.f4222g.setBackgroundResource(mo34625b());
            C2690a.m6219a().mo36459a(this.f4222g);
            textView = this.f4216a;
            UICustomization uICustomization2 = C2452d.m5373e().uiCustomization;
            if (uICustomization2 == null || (i = uICustomization2.textMsgColorRight) == 0) {
                i = -1;
            }
        }
        textView.setTextColor(i);
        TextView textView2 = this.f4216a;
        UICustomization uICustomization3 = C2452d.m5373e().uiCustomization;
        if (uICustomization3 == null || ((!isReceivedMessage() || (i2 = uICustomization3.hyperLinkColorLeft) == 0) && (isReceivedMessage() || (i2 = uICustomization3.hyperLinkColorRight) == 0))) {
            i2 = textView2.getCurrentTextColor();
            if ((16777215 & i2) == 0) {
                i2 = textView2.getResources().getColor(C2364R.C2365color.ysf_text_link_color_blue);
            }
        }
        textView2.setLinkTextColor(i2);
        mo34624a(this.f4216a);
        JSONObject f = C1810b.m3433f(this.message.getExtension(), "action");
        if (f != null) {
            this.f4221f.setVisibility(0);
            this.f4223h.setVisibility(0);
            UICustomization uICustomization4 = C2452d.m5373e().uiCustomization;
            if (uICustomization4 == null || (i3 = uICustomization4.msgItemBackgroundLeft) <= 0) {
                this.f4216a.setPadding(35, 35, 35, 35);
                this.f4222g.setBackgroundResource(C2364R.C2366drawable.ysf_msg_back_left_selector);
            } else {
                this.f4222g.setBackgroundResource(i3);
            }
            if (!TextUtils.isEmpty(C1810b.m3432e(f, "label"))) {
                this.f4221f.setText(C1810b.m3432e(f, "label"));
            } else {
                this.f4221f.setText("知道了");
            }
            String e = C1810b.m3432e(f, "url");
            this.f4224i = e;
            if (!TextUtils.isEmpty(e)) {
                this.f4221f.setOnClickListener(this.f4220e);
                return;
            }
            return;
        }
        this.f4221f.setVisibility(8);
        this.f4223h.setVisibility(8);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_text;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f4216a = (TextView) findViewById(C2364R.C2367id.nim_message_item_text_body);
        this.f4221f = (TextView) findViewById(C2364R.C2367id.tv_nim_message_item_url_button);
        this.f4222g = (LinearLayout) findViewById(C2364R.C2367id.ll_nim_message_item_text_parent);
        this.f4223h = (TextView) findViewById(C2364R.C2367id.tv_nim_message_item_url_line);
        this.f4217b = (ImageView) findViewById(C2364R.C2367id.message_item_rich_gif);
        View$OnTouchListenerC2001a a = View$OnTouchListenerC2001a.m3985a();
        this.f4219d = a;
        this.f4216a.setOnTouchListener(a);
        this.f4218c = (ImageView) findViewById(C2364R.C2367id.iv_message_item_rich_pic);
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        if (uICustomization != null && uICustomization.textMsgSize > 0.0f) {
            ((TextView) findViewById(C2364R.C2367id.nim_message_item_text_body)).setTextSize(uICustomization.textMsgSize);
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int leftBackground() {
        return 0;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int rightBackground() {
        return 0;
    }
}
