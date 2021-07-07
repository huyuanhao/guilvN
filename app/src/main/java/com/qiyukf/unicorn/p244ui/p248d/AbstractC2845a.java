package com.qiyukf.unicorn.p244ui.p248d;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.nim.uikit.session.emoji.C1990f;
import com.qiyukf.nim.uikit.session.helper.C2015e;
import com.qiyukf.nim.uikit.session.helper.View$OnTouchListenerC2001a;
import com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.p212e.C2474i;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p232k.C2700f;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.ui.d.a */
public abstract class AbstractC2845a<T> extends AbstractC2083b {

    /* renamed from: a */
    public LinearLayout f6047a;

    /* renamed from: b */
    public View f6048b;

    /* renamed from: c */
    public TextView f6049c;

    /* renamed from: d */
    public View f6050d;

    /* renamed from: e */
    public LinearLayout f6051e;

    /* renamed from: f */
    public View f6052f;

    /* renamed from: g */
    public TextView f6053g;

    /* renamed from: h */
    public View f6054h;

    /* renamed from: a */
    public static int m6607a(Context context) {
        int i;
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        return (uICustomization == null || (i = uICustomization.textMsgColorLeft) == 0) ? context.getResources().getColor(C2364R.C2365color.ysf_black_2b2b2b) : i;
    }

    /* renamed from: a */
    public static void m6608a(TextView textView) {
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        if (uICustomization != null) {
            float f = uICustomization.textMsgSize;
            if (f > 0.0f) {
                textView.setTextSize(f);
            }
        }
    }

    /* renamed from: a */
    private void m6609a(TextView textView, String str, boolean z) {
        m6608a(textView);
        if (z) {
            C2700f.m6246a(textView, str, (int) textView.getResources().getDimension(C2364R.dimen.ysf_bubble_content_rich_image_max_width), this.message.getSessionId());
            return;
        }
        Context context = this.context;
        textView.setText(C2015e.m4002a(context, C1990f.m3947a(context, str, this.message.getSessionId())));
    }

    /* renamed from: b */
    public static int m6610b(Context context) {
        int i;
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        return (uICustomization == null || (i = uICustomization.hyperLinkColorLeft) == 0) ? context.getResources().getColor(C2364R.C2365color.ysf_text_link_color_blue) : i;
    }

    /* renamed from: a */
    public abstract void mo36682a(TextView textView, T t);

    /* renamed from: a */
    public abstract void mo36683a(T t);

    /* renamed from: a */
    public final boolean mo36684a() {
        if (this.message == null) {
            return true;
        }
        C2474i b = C2452d.m5375g().mo36345b(this.message.getSessionId());
        return (b != null && b.f4891f) || C2452d.m5375g().mo36351d(this.message.getSessionId()) == null || C2452d.m5375g().mo36355f(this.message.getSessionId()) != 0 || C2452d.m5375g().mo36349c(this.message.getSessionId()) == getMsgSessionId();
    }

    /* renamed from: b */
    public boolean mo36685b() {
        return true;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        int i;
        int i2;
        LinearLayout linearLayout = this.f6047a;
        if (isReceivedMessage()) {
            UICustomization uICustomization = C2452d.m5373e().uiCustomization;
            if (uICustomization == null || (i = uICustomization.msgRobotItemBackgroundLeft) <= 0) {
                i = C2364R.C2366drawable.ysf_message_left_bg_no_padding_selector;
            }
        } else {
            UICustomization uICustomization2 = C2452d.m5373e().uiCustomization;
            if (uICustomization2 == null || (i = uICustomization2.msgRobotItemBackgroundRight) <= 0) {
                i = C2364R.C2366drawable.ysf_message_right_bg_no_padding_selector;
            }
        }
        linearLayout.setBackgroundResource(i);
        if (!isReceivedMessage()) {
            C2690a.m6219a().mo36459a(this.f6047a);
        }
        String c = mo36686c();
        if (!TextUtils.isEmpty(c)) {
            this.f6048b.setVisibility(0);
            this.f6050d.setVisibility(8);
            m6609a(this.f6049c, c, mo36689f());
        } else {
            this.f6048b.setVisibility(8);
        }
        List<T> e = mo36688e();
        this.f6051e.removeAllViews();
        if (e == null || e.isEmpty()) {
            this.f6051e.setVisibility(8);
        } else {
            this.f6051e.setVisibility(0);
            if (this.f6048b.getVisibility() == 0) {
                this.f6050d.setVisibility(0);
            }
            for (int i3 = 0; i3 < e.size(); i3++) {
                final T t = e.get(i3);
                View inflate = LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_clickable_item, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C2364R.C2367id.ysf_clickable_item_text);
                m6608a(textView);
                mo36682a(textView, t);
                if (mo36685b()) {
                    textView.setEnabled(true);
                    i2 = C2690a.m6219a().mo36462d() ? Color.parseColor(C2690a.m6219a().mo36462d() ? C2690a.m6219a().mo36461c().mo35690b() : "#337EFF") : m6610b(textView.getContext());
                } else {
                    textView.setEnabled(false);
                    i2 = this.context.getResources().getColor(C2364R.C2365color.ysf_grey_999999);
                }
                textView.setTextColor(i2);
                textView.setOnClickListener(new View.OnClickListener() {
                    /* class com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a.View$OnClickListenerC28461 */

                    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.qiyukf.unicorn.ui.d.a */
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void onClick(View view) {
                        AbstractC2845a.this.mo36683a(t);
                    }
                });
                this.f6051e.addView(inflate, -1, -2);
            }
        }
        String d = mo36687d();
        if (!TextUtils.isEmpty(d)) {
            this.f6052f.setVisibility(0);
            m6609a(this.f6053g, C1853d.m3521d(d), mo36690g());
            if (this.f6048b.getVisibility() == 0 || this.f6051e.getVisibility() == 0) {
                this.f6054h.setVisibility(0);
            } else {
                this.f6054h.setVisibility(8);
            }
        } else {
            this.f6052f.setVisibility(8);
        }
    }

    /* renamed from: c */
    public abstract String mo36686c();

    /* renamed from: d */
    public abstract String mo36687d();

    /* renamed from: e */
    public abstract List<T> mo36688e();

    /* renamed from: f */
    public boolean mo36689f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo36690g() {
        return false;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_clickable_list;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6047a = (LinearLayout) findViewById(C2364R.C2367id.ysf_clickable_list_content);
        this.f6048b = findViewById(C2364R.C2367id.ysf_clickable_list_header);
        this.f6049c = (TextView) findViewById(C2364R.C2367id.ysf_clickable_list_header_text);
        this.f6050d = findViewById(C2364R.C2367id.ysf_clickable_list_header_divider);
        this.f6051e = (LinearLayout) findViewById(C2364R.C2367id.ysf_clickable_list_container);
        this.f6052f = findViewById(C2364R.C2367id.ysf_clickable_list_footer);
        this.f6053g = (TextView) findViewById(C2364R.C2367id.ysf_clickable_list_footer_text);
        this.f6054h = findViewById(C2364R.C2367id.ysf_clickable_list_footer_divider);
        TextView textView = this.f6049c;
        textView.setTextColor(m6607a(textView.getContext()));
        TextView textView2 = this.f6049c;
        textView2.setLinkTextColor(m6610b(textView2.getContext()));
        this.f6049c.setOnTouchListener(View$OnTouchListenerC2001a.m3985a());
        TextView textView3 = this.f6053g;
        textView3.setTextColor(m6607a(textView3.getContext()));
        TextView textView4 = this.f6053g;
        textView4.setLinkTextColor(m6610b(textView4.getContext()));
        this.f6053g.setOnTouchListener(View$OnTouchListenerC2001a.m3985a());
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
