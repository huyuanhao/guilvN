package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.msg.MessageService;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2374b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.C2377c;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2506d;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2554b;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2557e;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p244ui.p246b.DialogC2823a;
import com.qiyukf.unicorn.p244ui.p246b.DialogC2829c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.ui.d.a.g */
public class C2859g extends AbstractC2857f {

    /* renamed from: a */
    public C2506d f6079a;

    /* renamed from: b */
    public TextView f6080b;

    /* renamed from: c */
    public LinearLayout f6081c;

    /* renamed from: d */
    public TextView f6082d;

    /* renamed from: e */
    public TextView f6083e;

    /* renamed from: f */
    public View f6084f;

    /* renamed from: com.qiyukf.unicorn.ui.d.a.g$a */
    public class C2864a {

        /* renamed from: b */
        public ImageView f6093b;

        /* renamed from: c */
        public TextView f6094c;

        /* renamed from: d */
        public ImageView f6095d;

        /* renamed from: e */
        public TextView f6096e;

        /* renamed from: f */
        public TextView f6097f;

        /* renamed from: g */
        public TextView f6098g;

        /* renamed from: h */
        public TextView f6099h;

        /* renamed from: i */
        public TextView f6100i;

        /* renamed from: j */
        public RelativeLayout f6101j;

        /* renamed from: k */
        public LinearLayout f6102k;

        /* renamed from: l */
        public TextView f6103l;

        public C2864a(View view) {
            this.f6093b = (ImageView) view.findViewById(C2364R.C2367id.ysf_iv_item_bot_product_shop_img);
            this.f6094c = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_item_bot_product_shop_name);
            this.f6103l = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_item_bot_product_sub_title);
            this.f6095d = (ImageView) view.findViewById(C2364R.C2367id.ysf_iv_bot_product_detail_img);
            this.f6096e = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_title);
            this.f6097f = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_money);
            this.f6098g = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_sku);
            this.f6099h = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_info);
            this.f6100i = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_status);
            this.f6101j = (RelativeLayout) view.findViewById(C2364R.C2367id.ysf_item_bot_product_info_parent);
            this.f6102k = (LinearLayout) view.findViewById(C2364R.C2367id.ysf_ll_bot_product_shop_parent);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m6651a(C2859g gVar, C2554b bVar) {
        C2377c cVar = new C2377c();
        cVar.fromJson(bVar.mo35946a());
        cVar.mo35256a(true);
        cVar.mo35257b(gVar.m6654b().toString());
        C2374b bVar2 = new C2374b();
        bVar2.mo35239a(cVar.mo35267j());
        bVar2.mo35241b(cVar.mo35268k());
        bVar2.mo35240a(cVar.mo35258c());
        cVar.mo35276a(bVar2);
        JSONObject a = C1810b.m3420a(gVar.message.getExt());
        if (a == null) {
            a = new JSONObject();
        }
        C1810b.m3424a(a, "IS_SEND_PRODUCT_TAG", (Object) true);
        gVar.message.setExt(a.toString());
        ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(gVar.message, true);
        MessageService.sendMessage(MessageBuilder.createCustomMessage(gVar.message.getSessionId(), SessionTypeEnum.Ysf, cVar));
    }

    /* renamed from: a */
    private void m6652a(List<C2554b> list, int i) {
        if (list.size() == 0) {
            this.f6083e.setVisibility(0);
            this.f6083e.setText(this.f6079a.mo35790d());
            this.f6081c.setVisibility(8);
            return;
        }
        this.f6083e.setVisibility(8);
        this.f6081c.setVisibility(0);
        this.f6081c.removeAllViews();
        int min = Math.min(list.size(), Math.max(0, i));
        for (int i2 = 0; i2 < min; i2++) {
            final C2554b bVar = list.get(i2);
            View inflate = LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_item_bot_product_list, (ViewGroup) this.f6081c, false);
            C2864a aVar = new C2864a(inflate);
            if ("1".equals(bVar.mo35947b())) {
                aVar.f6102k.setVisibility(0);
                aVar.f6101j.setVisibility(8);
                if (TextUtils.isEmpty(bVar.mo35948c())) {
                    aVar.f6093b.setVisibility(8);
                } else {
                    C1870a.m3568a(bVar.mo35948c(), aVar.f6093b, aVar.f6093b.getWidth(), aVar.f6093b.getHeight());
                    aVar.f6094c.setText(bVar.mo35949d());
                    aVar.f6093b.setVisibility(0);
                    if (!TextUtils.isEmpty(bVar.mo35950e())) {
                        aVar.f6103l.setText(bVar.mo35950e());
                        aVar.f6103l.setVisibility(0);
                    } else {
                        aVar.f6103l.setVisibility(8);
                    }
                }
            } else {
                aVar.f6102k.setVisibility(8);
                aVar.f6101j.setVisibility(0);
                if (!TextUtils.isEmpty(bVar.mo35948c())) {
                    C1870a.m3568a(bVar.mo35948c(), aVar.f6095d, aVar.f6095d.getWidth(), aVar.f6095d.getHeight());
                    aVar.f6095d.setVisibility(0);
                } else {
                    aVar.f6095d.setVisibility(8);
                }
                aVar.f6096e.setText(bVar.mo35949d());
                aVar.f6097f.setText(bVar.mo35951f());
                aVar.f6098g.setText(bVar.mo35952g());
                aVar.f6100i.setText(bVar.mo35953h());
                aVar.f6099h.setText(bVar.mo35950e());
                aVar.f6101j.setOnClickListener(new View.OnClickListener() {
                    /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2859g.View$OnClickListenerC28622 */

                    public final void onClick(View view) {
                        if ("url".equals(bVar.mo35954i())) {
                            C2452d.m5373e().onMessageItemClickListener.onURLClicked(C2859g.this.context, bVar.mo35955j());
                        } else if (!"block".equals(bVar.mo35954i())) {
                        } else {
                            if (!C2859g.this.mo36704g()) {
                                C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
                                return;
                            }
                            final DialogC2823a aVar = new DialogC2823a(C2859g.this.context);
                            aVar.mo36638a(bVar);
                            aVar.mo36639a(new DialogC2823a.AbstractC2824a() {
                                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2859g.View$OnClickListenerC28622.C28631 */

                                @Override // com.qiyukf.unicorn.p244ui.p246b.DialogC2823a.AbstractC2824a
                                /* renamed from: a */
                                public final void mo36642a(C2554b bVar) {
                                    C2859g.m6651a(C2859g.this, bVar);
                                    aVar.dismiss();
                                }
                            });
                            aVar.show();
                        }
                    }
                });
            }
            this.f6081c.addView(inflate);
            if (i2 != min - 1) {
                this.f6081c.addView(LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_include_divider, (ViewGroup) this.f6081c, false));
            }
        }
    }

    /* renamed from: b */
    private JSONObject m6654b() {
        JSONObject jSONObject = new JSONObject();
        C1810b.m3425a(jSONObject, "MSG_CLIENT_ID_TAG", this.message.getUuid());
        return jSONObject;
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        C2506d dVar = (C2506d) this.message.getAttachment();
        this.f6079a = dVar;
        this.f6080b.setText(dVar.mo35789c());
        if (C1810b.m3426a(C1810b.m3420a(this.message.getExt()), "IS_SEND_PRODUCT_TAG")) {
            this.f6082d.setVisibility(8);
            this.f6084f.setVisibility(8);
            this.f6081c.setVisibility(8);
            return;
        }
        this.f6081c.setVisibility(0);
        this.f6082d.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2859g.View$OnClickListenerC28601 */

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                C2557e eVar = new C2557e();
                eVar.mo35975a(C2859g.this.f6079a.mo35792f());
                eVar.mo35974a("bubble_list");
                eVar.mo35973a(C2859g.this.f6079a.mo35791e());
                arrayList.add(eVar);
                final DialogC2829c cVar = new DialogC2829c(C2859g.this.context, arrayList, C2859g.this.f6079a.mo35793g(), C2859g.this.f6079a.mo35790d());
                cVar.mo36649a(new DialogC2823a.AbstractC2824a() {
                    /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2859g.View$OnClickListenerC28601.C28611 */

                    @Override // com.qiyukf.unicorn.p244ui.p246b.DialogC2823a.AbstractC2824a
                    /* renamed from: a */
                    public final void mo36642a(C2554b bVar) {
                        if ("url".equals(bVar.mo35954i())) {
                            C2452d.m5373e().onMessageItemClickListener.onURLClicked(C2859g.this.context, bVar.mo35955j());
                        } else if (!"block".equals(bVar.mo35954i())) {
                        } else {
                            if (!C2859g.this.mo36704g()) {
                                C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
                                return;
                            }
                            C2859g.m6651a(C2859g.this, bVar);
                            cVar.cancel();
                        }
                    }
                });
                cVar.show();
            }
        });
        if (this.f6079a.mo35792f().size() <= 4) {
            this.f6082d.setVisibility(8);
            this.f6084f.setVisibility(8);
            m6652a(this.f6079a.mo35792f(), this.f6079a.mo35792f().size());
            return;
        }
        this.f6084f.setVisibility(0);
        this.f6082d.setVisibility(0);
        m6652a(this.f6079a.mo35792f(), 4);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_holder_bubble_list;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        TextView textView;
        String str;
        this.f6080b = (TextView) findViewById(C2364R.C2367id.ysf_tv_holder_bubble_list_title);
        this.f6081c = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_holder_bubble_list_parent);
        this.f6082d = (TextView) findViewById(C2364R.C2367id.ysf_tv_holder_bubble_list_more);
        this.f6083e = (TextView) findViewById(C2364R.C2367id.ysf_tv_holder_bubble_list_empty);
        this.f6084f = findViewById(C2364R.C2367id.ysf_holder_bubble_list_line);
        if (C2690a.m6219a().mo36462d()) {
            textView = this.f6082d;
            str = C2690a.m6219a().mo36461c().mo35690b();
        } else {
            textView = this.f6082d;
            str = "#337EFF";
        }
        textView.setTextColor(Color.parseColor(str));
    }
}
