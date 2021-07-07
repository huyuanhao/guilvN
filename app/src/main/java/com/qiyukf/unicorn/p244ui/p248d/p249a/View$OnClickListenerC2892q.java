package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2524n;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.ui.d.a.q */
public class View$OnClickListenerC2892q extends AbstractC2857f implements View.OnClickListener {

    /* renamed from: a */
    public TextView f6204a;

    /* renamed from: b */
    public TextView f6205b;

    /* renamed from: c */
    public LinearLayout f6206c;

    /* renamed from: d */
    public View f6207d;

    /* renamed from: e */
    public View f6208e;

    /* renamed from: f */
    public TextView f6209f;

    /* renamed from: a */
    private void m6737a(List<C2524n.C2526b> list, int i) {
        this.f6206c.removeAllViews();
        int min = Math.min(list.size(), Math.max(0, i));
        int i2 = 0;
        while (i2 < min) {
            C2524n.C2526b bVar = list.get(i2);
            View inflate = LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_logistic_item, (ViewGroup) this.f6206c, false);
            View findViewById = inflate.findViewById(C2364R.C2367id.ysf_iv_logistic_icon);
            View findViewById2 = inflate.findViewById(C2364R.C2367id.ysf_logistic_line);
            TextView textView = (TextView) inflate.findViewById(C2364R.C2367id.ysf_tv_logistic_transport_message);
            TextView textView2 = (TextView) inflate.findViewById(C2364R.C2367id.ysf_tv_logistic_transport_time);
            textView.setText(bVar.mo35865a());
            textView2.setText(bVar.mo35866b());
            boolean z = i2 == 0;
            findViewById.setSelected(z);
            if (i2 == min - 1) {
                findViewById2.setLayoutParams(new FrameLayout.LayoutParams(-2, C1862c.m3540a(20.0f), 1));
            }
            findViewById2.setPadding(0, z ? C1862c.m3540a(16.0f) : 0, 0, 0);
            textView.setSelected(z);
            textView2.setSelected(z);
            this.f6206c.addView(inflate);
            i2++;
        }
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        List<C2524n.C2526b> list;
        final C2524n nVar = (C2524n) this.message.getAttachment();
        this.f6204a.setText(nVar.mo35857c());
        this.f6205b.setText(nVar.mo35858d().mo35867a());
        int i = 3;
        if (nVar.mo35859e().size() <= 3 || nVar.mo35861g()) {
            this.f6207d.setVisibility(8);
            list = nVar.mo35859e();
            i = nVar.mo35859e().size();
        } else {
            this.f6207d.setVisibility(0);
            list = nVar.mo35859e();
        }
        m6737a(list, i);
        if (nVar.mo35860f() != null) {
            this.f6208e.setVisibility(0);
            this.f6209f.setText(nVar.mo35860f().mo35863a());
            this.f6209f.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.View$OnClickListenerC2892q.View$OnClickListenerC28931 */

                public final void onClick(View view) {
                    View$OnClickListenerC2892q.this.mo36699a(nVar.mo35860f().mo35864b());
                }
            });
            return;
        }
        this.f6208e.setVisibility(8);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_logistic;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6204a = (TextView) findViewById(C2364R.C2367id.ysf_tv_logistic_label);
        this.f6205b = (TextView) findViewById(C2364R.C2367id.ysf_tv_logistic_title);
        this.f6206c = (LinearLayout) findViewById(C2364R.C2367id.ysf_logistic_transport_info);
        this.f6207d = findViewById(C2364R.C2367id.ysf_logistic_more_layout);
        this.f6208e = findViewById(C2364R.C2367id.ysf_bot_footer_layout);
        this.f6209f = (TextView) findViewById(C2364R.C2367id.ysf_bot_footer_text);
        this.f6207d.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view != this.f6207d) {
            return;
        }
        if (!mo36704g()) {
            C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
            return;
        }
        C2524n nVar = (C2524n) this.message.getAttachment();
        nVar.mo35862h();
        this.f6207d.setVisibility(8);
        m6737a(nVar.mo35859e(), nVar.mo35859e().size());
    }
}
