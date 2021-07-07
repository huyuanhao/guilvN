package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.C2376b;

/* renamed from: com.qiyukf.unicorn.ui.d.a.n */
public class C2884n extends AbstractC2857f {

    /* renamed from: a */
    public C2886a f6180a;

    /* renamed from: b */
    public View f6181b;

    /* renamed from: c */
    public TextView f6182c;

    /* renamed from: com.qiyukf.unicorn.ui.d.a.n$a */
    public static class C2886a {

        /* renamed from: a */
        public ImageView f6185a;

        /* renamed from: b */
        public TextView f6186b;

        /* renamed from: c */
        public TextView f6187c;

        /* renamed from: d */
        public TextView f6188d;

        /* renamed from: e */
        public TextView f6189e;

        /* renamed from: f */
        public TextView f6190f;

        public C2886a(View view) {
            this.f6185a = (ImageView) view.findViewById(C2364R.C2367id.ysf_iv_goods_img);
            this.f6186b = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_goods_name);
            this.f6187c = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_goods_sku);
            this.f6188d = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_goods_price);
            this.f6189e = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_goods_count);
            this.f6190f = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_goods_state);
        }

        /* renamed from: a */
        public final void mo36735a(C2376b bVar) {
            int a = C1862c.m3540a(60.0f);
            C1870a.m3568a(bVar.mo35246e(), this.f6185a, a, a);
            this.f6186b.setText(bVar.mo35247f());
            this.f6187c.setText(bVar.mo35250i());
            this.f6188d.setText(bVar.mo35248g());
            this.f6189e.setText(bVar.mo35249h());
            this.f6190f.setText(bVar.mo35245d());
        }
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        final C2376b bVar = (C2376b) this.message.getAttachment();
        this.f6180a.mo36735a(bVar);
        if (bVar.mo35251j()) {
            this.f6181b.setVisibility(0);
            this.f6182c.setVisibility(0);
            this.f6182c.setText(TextUtils.isEmpty(bVar.mo35253l()) ? "重新选择" : bVar.mo35253l());
            this.f6182c.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2884n.View$OnClickListenerC28851 */

                public final void onClick(View view) {
                    if (!C2884n.this.mo36704g()) {
                        C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
                    } else {
                        bVar.mo35254m().onClick(C2884n.this.context, bVar.mo35252k());
                    }
                }
            });
            return;
        }
        this.f6181b.setVisibility(8);
        this.f6182c.setVisibility(8);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_goods;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6181b = findViewById(C2364R.C2367id.ysf_holder_product_list_line);
        this.f6182c = (TextView) findViewById(C2364R.C2367id.tv_ysf_item_message_goods);
        this.f6180a = new C2886a(findViewById(C2364R.C2367id.ysf_goods_content));
    }
}
