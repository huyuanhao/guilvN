package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2511g;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2515i;
import com.qiyukf.unicorn.p232k.C2724p;
import com.qiyukf.unicorn.p244ui.p248d.p249a.View$OnClickListenerC2866i;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.ui.d.a.j */
public class View$OnClickListenerC2871j extends AbstractC2857f implements View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a */
    public View f6134a;

    /* renamed from: b */
    public TextView f6135b;

    /* renamed from: c */
    public C2511g f6136c;

    /* renamed from: d */
    public View$OnClickListenerC2866i.C2870b f6137d;

    /* renamed from: e */
    public PopupWindow f6138e;

    /* renamed from: f */
    public View f6139f;

    /* renamed from: g */
    public View f6140g;

    /* renamed from: com.qiyukf.unicorn.ui.d.a.j$a */
    public static class C2872a {

        /* renamed from: a */
        public LinearLayout f6141a;

        public C2872a(LinearLayout linearLayout) {
            this.f6141a = linearLayout;
        }

        /* renamed from: a */
        public final void mo36722a(List<List<C2511g.C2512a.C2513a>> list) {
            for (int i = 0; i < list.size(); i++) {
                List<C2511g.C2512a.C2513a> list2 = list.get(i);
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f6141a.getContext()).inflate(C2364R.layout.ysf_popup_window_card_detail_group, (ViewGroup) this.f6141a, false);
                LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(C2364R.C2367id.ysf_card_detail_group);
                View findViewById = linearLayout.findViewById(C2364R.C2367id.ysf_card_detail_space);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    C2511g.C2512a.C2513a aVar = list2.get(i2);
                    LinearLayout linearLayout3 = (LinearLayout) LayoutInflater.from(linearLayout.getContext()).inflate(C2364R.layout.ysf_popup_window_card_detail_item, (ViewGroup) linearLayout, false);
                    LinearLayout linearLayout4 = (LinearLayout) linearLayout3.findViewById(C2364R.C2367id.ysf_card_detail_item);
                    View findViewById2 = linearLayout3.findViewById(C2364R.C2367id.ysf_card_detail_divider);
                    C2515i.C2517b[] a = aVar.mo35812a();
                    for (int i3 = 0; i3 < 2; i3++) {
                        C2515i.C2517b bVar = a[i3];
                        aVar.mo35812a();
                        C2848b.m6622a(bVar, linearLayout4, 2, false);
                    }
                    if (i2 == list2.size() - 1) {
                        findViewById2.setVisibility(8);
                    }
                    linearLayout2.addView(linearLayout3);
                }
                if (i == list.size() - 1) {
                    findViewById.setVisibility(8);
                }
                this.f6141a.addView(linearLayout);
            }
        }
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        C2511g gVar = (C2511g) this.message.getAttachment();
        this.f6136c = gVar;
        this.f6137d.mo36718a(gVar.mo35808c());
        if (this.f6136c.mo35808c().mo35828a() != null) {
            this.f6134a.setVisibility(0);
            this.f6135b.setText(this.f6136c.mo35808c().mo35828a().mo35821d());
            this.f6135b.setOnClickListener(this);
            return;
        }
        this.f6134a.setVisibility(8);
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: f */
    public final void mo36703f() {
        PopupWindow popupWindow = new PopupWindow(this.context);
        this.f6138e = popupWindow;
        popupWindow.setWidth(-1);
        PopupWindow popupWindow2 = this.f6138e;
        double b = (double) C1862c.m3542b();
        Double.isNaN(b);
        popupWindow2.setHeight((int) (b * 0.8d));
        this.f6138e.setContentView(LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_popup_window_card_detail, (ViewGroup) null));
        this.f6138e.setBackgroundDrawable(new ColorDrawable(0));
        this.f6138e.setOutsideTouchable(false);
        this.f6138e.setFocusable(true);
        this.f6138e.setOnDismissListener(this);
        this.f6138e.setAnimationStyle(C2364R.style.ysf_dialog_window_animation_style);
        this.f6138e.showAtLocation(((Activity) this.context).getWindow().getDecorView().findViewById(16908290), 81, 0, 0);
        C2724p.m6290a(((Activity) this.context).getWindow(), 0.3f);
        this.f6139f = this.f6138e.getContentView().findViewById(C2364R.C2367id.ysf_card_detail_placeholder);
        this.f6140g = this.f6138e.getContentView().findViewById(C2364R.C2367id.ysf_bot_list_close);
        ((TextView) this.f6138e.getContentView().findViewById(C2364R.C2367id.ysf_bot_list_title)).setText(this.f6136c.mo35809d().mo35810a());
        this.f6139f.setOnClickListener(this);
        this.f6140g.setOnClickListener(this);
        new C2872a((LinearLayout) this.f6138e.getContentView().findViewById(C2364R.C2367id.ysf_card_detail_container)).mo36722a(this.f6136c.mo35809d().mo35811b());
        getAdapter().mo34518e().mo34506b();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_card_detail;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6134a = findViewById(C2364R.C2367id.ysf_bot_footer_layout);
        this.f6135b = (TextView) findViewById(C2364R.C2367id.ysf_bot_footer_text);
        this.f6137d = new View$OnClickListenerC2866i.C2870b((LinearLayout) findViewById(C2364R.C2367id.ysf_holder_card_layout), true);
    }

    public void onClick(View view) {
        if (view == this.f6135b) {
            if (mo36704g() || this.f6136c.mo35808c().mo35828a().mo35820c().equals("url")) {
                C2847a.m6620a(this.f6136c.mo35808c().mo35828a(), this);
            } else {
                C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
            }
        } else if (view == this.f6140g || view == this.f6139f) {
            this.f6138e.dismiss();
        }
    }

    public void onDismiss() {
        C2724p.m6290a(((Activity) this.context).getWindow(), 1.0f);
    }
}
