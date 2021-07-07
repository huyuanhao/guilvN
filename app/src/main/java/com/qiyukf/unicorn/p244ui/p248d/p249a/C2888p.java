package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2374b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.C2377c;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2523m;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2554b;

/* renamed from: com.qiyukf.unicorn.ui.d.a.p */
public class C2888p extends AbstractC2857f {

    /* renamed from: a */
    public C2523m f6193a;

    /* renamed from: b */
    public LinearLayout f6194b;

    /* renamed from: c */
    public HorizontalScrollView f6195c;

    /* renamed from: com.qiyukf.unicorn.ui.d.a.p$a */
    public class C2891a {

        /* renamed from: b */
        public ImageView f6200b;

        /* renamed from: c */
        public TextView f6201c;

        /* renamed from: d */
        public TextView f6202d;

        /* renamed from: e */
        public TextView f6203e;

        public C2891a(View view) {
            this.f6200b = (ImageView) view.findViewById(C2364R.C2367id.ysf_iv_item_recommend_img);
            this.f6201c = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_item_recommend_title);
            this.f6202d = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_item_recommend_attr1);
            this.f6203e = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_item_recommend_attr2);
        }

        /* renamed from: a */
        public final void mo36738a(C2554b bVar) {
            C1870a.m3568a(bVar.mo35948c(), this.f6200b, C1862c.m3540a(158.0f), C1862c.m3540a(158.0f));
            this.f6201c.setText(bVar.mo35949d());
            this.f6202d.setText(bVar.mo35951f());
            this.f6203e.setText(bVar.mo35952g());
        }
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        this.f6194b.removeAllViews();
        C2523m mVar = (C2523m) this.message.getAttachment();
        this.f6193a = mVar;
        if (Build.VERSION.SDK_INT >= 14 && !mVar.mo35853d()) {
            this.f6195c.setScrollX(0);
            this.f6193a.mo35854e();
        }
        for (final C2554b bVar : this.f6193a.mo35855f()) {
            View inflate = LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_item_recommend_product, (ViewGroup) this.f6194b, false);
            inflate.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2888p.View$OnClickListenerC28891 */

                public final void onClick(View view) {
                    if ("url".equals(bVar.mo35954i())) {
                        C2452d.m5373e().onMessageItemClickListener.onURLClicked(C2888p.this.context, bVar.mo35955j());
                    } else if (!"block".equals(bVar.mo35954i())) {
                    } else {
                        if (!C2888p.this.mo36704g()) {
                            C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
                            return;
                        }
                        C2377c cVar = new C2377c();
                        cVar.fromJson(bVar.mo35946a());
                        cVar.mo35256a(false);
                        C2374b bVar = new C2374b();
                        bVar.mo35239a(cVar.mo35267j());
                        bVar.mo35241b(cVar.mo35268k());
                        bVar.mo35240a(cVar.mo35258c());
                        cVar.mo35276a(bVar);
                        C2888p.this.getAdapter().mo34518e().mo34509c(MessageBuilder.createCustomMessage(C2888p.this.message.getSessionId(), SessionTypeEnum.Ysf, cVar));
                    }
                }
            });
            new C2891a(inflate).mo36738a(bVar);
            this.f6194b.addView(inflate);
        }
        if (this.f6193a.mo35855f().size() >= 5 && this.f6193a.mo35856g() != null) {
            View inflate2 = LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_item_recommend_change, (ViewGroup) this.f6194b, false);
            this.f6194b.addView(inflate2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate2.getLayoutParams();
            layoutParams.width = C1862c.m3540a(158.0f);
            layoutParams.height = C1862c.m3540a(245.0f);
            inflate2.setLayoutParams(layoutParams);
            inflate2.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2888p.View$OnClickListenerC28902 */

                public final void onClick(View view) {
                    if (!C2888p.this.mo36704g()) {
                        C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
                        return;
                    }
                    C2888p pVar = C2888p.this;
                    pVar.mo36701a(pVar.f6193a.mo35856g().mo35945b(), C2888p.this.f6193a.mo35856g().mo35944a(), "换一批");
                }
            });
        }
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: e */
    public final boolean mo36702e() {
        return false;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_msg_view_holder_recommend_product;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6194b = (LinearLayout) findView(C2364R.C2367id.ysf_ll_recommend_parent);
        this.f6195c = (HorizontalScrollView) findViewById(C2364R.C2367id.ysf_hsl_recommend);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean showAvatar() {
        return false;
    }
}
