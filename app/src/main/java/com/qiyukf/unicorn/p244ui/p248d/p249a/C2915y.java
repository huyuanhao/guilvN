package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p118pd.sdk.C7009o000OoOo;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2539t;

/* renamed from: com.qiyukf.unicorn.ui.d.a.y */
public class C2915y extends AbstractC2857f {

    /* renamed from: a */
    public TextView f6284a;

    /* renamed from: b */
    public ImageView f6285b;

    /* renamed from: c */
    public TextView f6286c;

    /* renamed from: d */
    public LinearLayout f6287d;

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        C2539t tVar = (C2539t) this.message.getAttachment();
        this.f6284a.setText(tVar.mo35918c());
        this.f6286c.setText(tVar.mo35919d().mo35922b());
        this.f6285b.setSelected(TextUtils.equals(tVar.mo35919d().mo35921a(), "success"));
        this.f6287d.removeAllViews();
        for (String str : tVar.mo35920e()) {
            TextView textView = (TextView) LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_bot_text, (ViewGroup) this.f6287d, false);
            textView.setTextSize(14.0f);
            textView.setTextColor(C7009o000OoOo.OooO00o(this.context, C2364R.C2365color.ysf_grey_666666));
            textView.setText(str);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.topMargin = C1862c.m3540a(10.0f);
            this.f6287d.addView(textView, layoutParams);
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_refund;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6284a = (TextView) findViewById(C2364R.C2367id.ysf_tv_refund_label);
        this.f6285b = (ImageView) findViewById(C2364R.C2367id.ysf_iv_refund_state_icon);
        this.f6286c = (TextView) findViewById(C2364R.C2367id.ysf_tv_refund_state);
        this.f6287d = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_refund_item_container);
    }
}
