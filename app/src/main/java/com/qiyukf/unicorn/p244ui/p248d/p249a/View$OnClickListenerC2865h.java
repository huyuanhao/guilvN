package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2507e;
import com.qiyukf.unicorn.p231j.C2690a;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.ui.d.a.h */
public class View$OnClickListenerC2865h extends AbstractC2857f implements View.OnClickListener {

    /* renamed from: a */
    public C2507e f6104a;

    /* renamed from: b */
    public TextView f6105b;

    /* renamed from: c */
    public TextView f6106c;

    /* renamed from: d */
    public LinearLayout f6107d;

    /* renamed from: e */
    public TextView f6108e;

    /* renamed from: f */
    public View f6109f;

    /* renamed from: g */
    public View f6110g;

    /* renamed from: a */
    private void m6672a(List<C2507e.C2509b> list, int i) {
        this.f6107d.removeAllViews();
        int min = Math.min(list.size(), Math.max(0, i));
        for (int i2 = 0; i2 < min; i2++) {
            C2507e.C2509b bVar = list.get(i2);
            View inflate = LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_item_bubble_node, (ViewGroup) this.f6107d, false);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2364R.C2367id.ysf_tv_item_node_line);
            TextView textView = (TextView) inflate.findViewById(C2364R.C2367id.ysf_tv_item_node_title);
            TextView textView2 = (TextView) inflate.findViewById(C2364R.C2367id.ysf_tv_item_node_desc);
            textView.setText(bVar.mo35804a());
            textView2.setText(bVar.mo35805b());
            boolean equals = "1".equals(bVar.mo35806c());
            ((ImageView) inflate.findViewById(C2364R.C2367id.ysf_tv_item_node_icon)).setSelected(equals);
            if (i2 == 0) {
                linearLayout.setPadding(0, C1862c.m3540a(22.0f), 0, 0);
            } else if (i2 == min - 1) {
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, C1862c.m3540a(22.0f), 1));
            }
            textView.setSelected(equals);
            textView2.setSelected(equals);
            this.f6107d.addView(inflate);
        }
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        TextView textView;
        String str;
        C2507e eVar = (C2507e) this.message.getAttachment();
        this.f6104a = eVar;
        C2507e.C2508a i = eVar.mo35800i();
        if (i == null) {
            i = new C2507e.C2508a();
        }
        if (!TextUtils.isEmpty(this.f6104a.mo35798g().mo35807a())) {
            this.f6106c.setVisibility(0);
            this.f6106c.setText(this.f6104a.mo35798g().mo35807a());
        } else {
            this.f6106c.setVisibility(8);
        }
        if (this.f6104a.mo35799h() == null || this.f6104a.mo35799h().size() == 0) {
            this.f6108e.setVisibility(8);
            this.f6109f.setVisibility(8);
            this.f6110g.setVisibility(8);
            this.f6106c.setVisibility(8);
            this.f6105b.setText(this.f6104a.mo35797f());
        } else if ((this.f6104a.mo35799h().size() > 4 || "url".equals(i.mo35802b())) && !this.f6104a.mo35794c()) {
            this.f6105b.setText(this.f6104a.mo35796e());
            this.f6109f.setVisibility(0);
            this.f6108e.setVisibility(0);
            this.f6110g.setVisibility(0);
            if (!TextUtils.isEmpty(i.mo35801a())) {
                this.f6108e.setText(i.mo35801a());
            } else {
                this.f6108e.setText(C2364R.string.ysf_see_more);
            }
            m6672a(this.f6104a.mo35799h(), 4);
        } else {
            this.f6108e.setVisibility(8);
            this.f6109f.setVisibility(8);
            this.f6105b.setText(this.f6104a.mo35796e());
            m6672a(this.f6104a.mo35799h(), this.f6104a.mo35799h().size());
        }
        if (C2690a.m6219a().mo36462d()) {
            textView = this.f6108e;
            str = C2690a.m6219a().mo36461c().mo35690b();
        } else {
            textView = this.f6108e;
            str = "#337EFF";
        }
        textView.setTextColor(Color.parseColor(str));
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_view_holder_bubble_node;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6105b = (TextView) findViewById(C2364R.C2367id.ysf_tv_holder_bubble_node_title);
        this.f6106c = (TextView) findViewById(C2364R.C2367id.ysf_tv_holder_bubble_node_desc);
        this.f6107d = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_holder_bubble_node_parent);
        this.f6108e = (TextView) findViewById(C2364R.C2367id.ysf_tv_holder_bubble_node_more);
        this.f6109f = findViewById(C2364R.C2367id.ysf_holder_bubble_node_line);
        this.f6110g = findViewById(C2364R.C2367id.ysf_holder_bubble_node_title_line);
        this.f6108e.setOnClickListener(this);
    }

    public void onClick(View view) {
        C2507e eVar;
        if (view.getId() == C2364R.C2367id.ysf_tv_holder_bubble_node_more && (eVar = this.f6104a) != null) {
            if (eVar.mo35800i() == null || !"url".equals(this.f6104a.mo35800i().mo35802b())) {
                if (!mo36704g()) {
                    C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
                    return;
                }
                C2507e eVar2 = (C2507e) this.message.getAttachment();
                this.f6104a = eVar2;
                eVar2.mo35795d();
                this.f6108e.setVisibility(8);
                m6672a(this.f6104a.mo35799h(), this.f6104a.mo35799h().size());
            } else if (C2452d.m5373e().onBotEventListener != null) {
                C2452d.m5373e().onBotEventListener.onUrlClick(this.context, this.f6104a.mo35800i().mo35803c());
            }
        }
    }
}
