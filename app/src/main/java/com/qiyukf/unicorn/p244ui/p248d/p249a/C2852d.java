package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2502b;

/* renamed from: com.qiyukf.unicorn.ui.d.a.d */
public class C2852d extends AbstractC2857f {

    /* renamed from: a */
    public ImageView f6064a;

    /* renamed from: b */
    public TextView f6065b;

    /* renamed from: c */
    public TextView f6066c;

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        final C2502b bVar = (C2502b) this.message.getAttachment();
        if (!TextUtils.isEmpty(bVar.mo35768c())) {
            this.f6064a.setVisibility(0);
            int a = C1862c.m3540a(92.0f);
            C1870a.m3568a(bVar.mo35768c(), this.f6064a, (int) this.context.getResources().getDimension(C2364R.dimen.ysf_bubble_max_width), a);
        } else {
            this.f6064a.setVisibility(8);
        }
        this.f6065b.setText(bVar.mo35769d());
        this.f6066c.setText(bVar.mo35770e().mo35771a());
        this.f6066c.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2852d.View$OnClickListenerC28531 */

            public final void onClick(View view) {
                C2852d.this.mo36699a(bVar.mo35770e().mo35772b());
            }
        });
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_activity;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6064a = (ImageView) findViewById(C2364R.C2367id.ysf_iv_activity_img);
        this.f6065b = (TextView) findViewById(C2364R.C2367id.ysf_tv_activity_label);
        this.f6066c = (TextView) findViewById(C2364R.C2367id.ysf_btn_activity_action);
    }
}
