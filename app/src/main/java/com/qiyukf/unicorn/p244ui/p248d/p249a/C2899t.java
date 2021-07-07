package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p118pd.sdk.C7009o000OoOo;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.OnMessageItemClickListener;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2530p;

/* renamed from: com.qiyukf.unicorn.ui.d.a.t */
public class C2899t extends AbstractC2857f {

    /* renamed from: a */
    public TextView f6221a;

    /* renamed from: b */
    public TextView f6222b;

    /* renamed from: c */
    public TextView f6223c;

    /* renamed from: d */
    public TextView f6224d;

    /* renamed from: e */
    public View f6225e;

    /* renamed from: f */
    public TextView f6226f;

    /* renamed from: g */
    public LinearLayout f6227g;

    /* renamed from: h */
    public LinearLayout f6228h;

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        final C2530p pVar = (C2530p) this.message.getAttachment();
        if (pVar != null) {
            this.f6221a.setText(pVar.mo35879d());
            this.f6222b.setText(pVar.mo35880e());
            this.f6223c.setText(pVar.mo35881f());
            this.f6224d.setText(pVar.mo35882g());
            if (!TextUtils.isEmpty(pVar.mo35883h())) {
                this.f6225e.setVisibility(0);
                this.f6226f.setText(pVar.mo35883h());
                this.f6227g.removeAllViews();
                for (String str : pVar.mo35884i()) {
                    TextView textView = (TextView) LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_bot_text, (ViewGroup) this.f6227g, false);
                    textView.setTextSize(14.0f);
                    textView.setTextColor(C7009o000OoOo.OooO00o(this.context, C2364R.C2365color.ysf_grey_666666));
                    textView.setText(str);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams.topMargin = C1862c.m3540a(2.0f);
                    this.f6227g.addView(textView, layoutParams);
                }
            } else {
                this.f6225e.setVisibility(8);
            }
            this.f6228h.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2899t.View$OnClickListenerC29001 */

                public final void onClick(View view) {
                    OnMessageItemClickListener onMessageItemClickListener;
                    if (!TextUtils.isEmpty(pVar.mo35878c()) && (onMessageItemClickListener = C2452d.m5373e().onMessageItemClickListener) != null) {
                        onMessageItemClickListener.onURLClicked(C2899t.this.context, pVar.mo35878c());
                    }
                }
            });
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_order_detail;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6221a = (TextView) findViewById(C2364R.C2367id.ysf_tv_order_detail_label);
        this.f6222b = (TextView) findViewById(C2364R.C2367id.ysf_tv_order_detail_status);
        this.f6223c = (TextView) findViewById(C2364R.C2367id.ysf_tv_order_detail_person);
        this.f6224d = (TextView) findViewById(C2364R.C2367id.ysf_tv_order_detail_address);
        this.f6225e = findViewById(C2364R.C2367id.ysf_ll_order_detail_order_container);
        this.f6226f = (TextView) findViewById(C2364R.C2367id.ysf_tv_order_detail_order);
        this.f6227g = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_order_detail_order_item_container);
        this.f6228h = (LinearLayout) findViewById(C2364R.C2367id.ll_message_item_detail_parent);
    }
}
