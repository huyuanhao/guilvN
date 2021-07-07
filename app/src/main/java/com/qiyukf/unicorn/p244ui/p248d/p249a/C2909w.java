package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p195h.C2323f;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.MessageService;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2374b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.C2377c;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2506d;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2519j;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2554b;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2557e;
import com.qiyukf.unicorn.p244ui.p246b.DialogC2823a;
import com.qiyukf.unicorn.p244ui.p246b.DialogC2829c;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.ui.d.a.w */
public class C2909w extends AbstractC2857f {

    /* renamed from: a */
    public TextView f6264a;

    /* renamed from: b */
    public View f6265b;

    /* renamed from: c */
    public C2912a f6266c;

    /* renamed from: d */
    public String f6267d;

    /* renamed from: com.qiyukf.unicorn.ui.d.a.w$a */
    public class C2912a {

        /* renamed from: b */
        public ImageView f6273b;

        /* renamed from: c */
        public TextView f6274c;

        /* renamed from: d */
        public TextView f6275d;

        /* renamed from: e */
        public TextView f6276e;

        /* renamed from: f */
        public TextView f6277f;

        /* renamed from: g */
        public TextView f6278g;

        public C2912a(View view) {
            this.f6273b = (ImageView) view.findViewById(C2364R.C2367id.ysf_iv_bot_product_detail_img);
            this.f6274c = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_title);
            this.f6275d = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_money);
            this.f6276e = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_sku);
            this.f6277f = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_info);
            this.f6278g = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_status);
        }

        /* renamed from: a */
        public final void mo36761a(C2377c cVar) {
            int i;
            ImageView imageView;
            if (!TextUtils.isEmpty(cVar.mo35269l())) {
                C1870a.m3568a(cVar.mo35269l(), C2909w.this.f6266c.f6273b, C2909w.this.f6266c.f6273b.getWidth(), C2909w.this.f6266c.f6273b.getHeight());
                imageView = C2909w.this.f6266c.f6273b;
                i = 0;
            } else {
                imageView = C2909w.this.f6266c.f6273b;
                i = 8;
            }
            imageView.setVisibility(i);
            C2909w.this.f6266c.f6274c.setText(cVar.mo35270m());
            C2909w.this.f6266c.f6275d.setText(cVar.mo35272o());
            C2909w.this.f6266c.f6276e.setText(cVar.mo35273p());
            C2909w.this.f6266c.f6278g.setText(cVar.mo35274q());
            C2909w.this.f6266c.f6277f.setText(cVar.mo35271n());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m6763a(C2909w wVar, C2377c cVar) {
        JSONObject a = C1810b.m3420a(cVar.mo35262e());
        cVar.mo35255a(C1810b.m3432e(a, "MSG_CLIENT_ID_TAG"));
        C2313a a2 = C2323f.m5018a(C1810b.m3432e(a, "MSG_CLIENT_ID_TAG"));
        if (a2 == null) {
            return;
        }
        if (a2.getAttachment() instanceof C2519j) {
            C2519j jVar = (C2519j) a2.getAttachment();
            cVar.mo35259c(jVar.mo35830c());
            cVar.mo35263f().clear();
            cVar.mo35263f().addAll(jVar.mo35833f());
            cVar.mo35261d(jVar.mo35832e());
            wVar.f6267d = "drawer_list";
        } else if (a2.getAttachment() instanceof C2506d) {
            C2506d dVar = (C2506d) a2.getAttachment();
            cVar.mo35259c(dVar.mo35793g());
            cVar.mo35261d(dVar.mo35790d());
            C2557e eVar = new C2557e();
            eVar.mo35975a(dVar.mo35792f());
            eVar.mo35973a(dVar.mo35791e());
            cVar.mo35263f().add(eVar);
            wVar.f6267d = "bubble_list";
        }
    }

    /* renamed from: c */
    public static JSONObject m6767c(String str) {
        JSONObject jSONObject = new JSONObject();
        C1810b.m3425a(jSONObject, "MSG_CLIENT_ID_TAG", str);
        return jSONObject;
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        final C2377c cVar = (C2377c) this.message.getAttachment();
        this.f6266c.mo36761a(cVar);
        if (cVar.mo35266i()) {
            this.f6264a.setVisibility(0);
            this.f6265b.setVisibility(0);
            this.f6264a.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2909w.View$OnClickListenerC29101 */

                public final void onClick(View view) {
                    if (!C2909w.this.mo36704g()) {
                        C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
                        return;
                    }
                    if (TextUtils.isEmpty(cVar.mo35264g())) {
                        C2909w.m6763a(C2909w.this, cVar);
                    }
                    if (cVar.mo35264g() == null) {
                        C1865f.m3557a("重新选择已经超时");
                        return;
                    }
                    for (C2557e eVar : cVar.mo35263f()) {
                        eVar.mo35977b(C2909w.this.f6267d);
                    }
                    final DialogC2829c cVar = new DialogC2829c(C2909w.this.context, cVar.mo35263f(), cVar.mo35264g(), cVar.mo35265h());
                    cVar.mo36649a(new DialogC2823a.AbstractC2824a() {
                        /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2909w.View$OnClickListenerC29101.C29111 */

                        @Override // com.qiyukf.unicorn.p244ui.p246b.DialogC2823a.AbstractC2824a
                        /* renamed from: a */
                        public final void mo36642a(C2554b bVar) {
                            C2377c cVar = new C2377c();
                            cVar.fromJson(bVar.mo35946a());
                            cVar.mo35256a(true);
                            cVar.mo35257b(C2909w.m6767c(cVar.mo35260d()).toString());
                            C2374b bVar2 = new C2374b();
                            bVar2.mo35239a(cVar.mo35267j());
                            bVar2.mo35241b(cVar.mo35268k());
                            bVar2.mo35240a(cVar.mo35258c());
                            cVar.mo35276a(bVar2);
                            MessageService.sendMessage(MessageBuilder.createCustomMessage(C2909w.this.message.getSessionId(), SessionTypeEnum.Ysf, cVar));
                            cVar.cancel();
                        }
                    });
                    if (C2909w.this.context != null) {
                        cVar.show();
                    }
                }
            });
            return;
        }
        this.f6264a.setVisibility(8);
        this.f6265b.setVisibility(8);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_holder_product_item;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6264a = (TextView) this.view.findViewById(C2364R.C2367id.ysf_tv_holder_product_item_reselect);
        this.f6265b = findViewById(C2364R.C2367id.ysf_holder_product_list_line);
        this.f6266c = new C2912a(findViewById(C2364R.C2367id.ysf_holder_product_item_content));
    }
}
