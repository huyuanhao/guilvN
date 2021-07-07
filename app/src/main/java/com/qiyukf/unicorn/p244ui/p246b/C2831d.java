package com.qiyukf.unicorn.p244ui.p246b;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2554b;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2557e;
import com.qiyukf.unicorn.p244ui.p246b.DialogC2823a;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.ui.b.d */
public final class C2831d extends BaseAdapter {

    /* renamed from: a */
    public List<C2554b> f5991a;

    /* renamed from: b */
    public Context f5992b;

    /* renamed from: c */
    public DialogC2823a.AbstractC2824a f5993c;

    /* renamed from: com.qiyukf.unicorn.ui.b.d$a */
    public class C2834a {

        /* renamed from: b */
        public ImageView f5999b;

        /* renamed from: c */
        public TextView f6000c;

        /* renamed from: d */
        public ImageView f6001d;

        /* renamed from: e */
        public TextView f6002e;

        /* renamed from: f */
        public TextView f6003f;

        /* renamed from: g */
        public TextView f6004g;

        /* renamed from: h */
        public TextView f6005h;

        /* renamed from: i */
        public TextView f6006i;

        /* renamed from: j */
        public RelativeLayout f6007j;

        /* renamed from: k */
        public LinearLayout f6008k;

        /* renamed from: l */
        public TextView f6009l;

        public C2834a(View view) {
            this.f5999b = (ImageView) view.findViewById(C2364R.C2367id.ysf_iv_item_bot_product_shop_img);
            this.f6000c = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_item_bot_product_shop_name);
            this.f6009l = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_item_bot_product_sub_title);
            this.f6001d = (ImageView) view.findViewById(C2364R.C2367id.ysf_iv_bot_product_detail_img);
            this.f6002e = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_title);
            this.f6003f = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_money);
            this.f6004g = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_sku);
            this.f6005h = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_info);
            this.f6006i = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_status);
            this.f6007j = (RelativeLayout) view.findViewById(C2364R.C2367id.ysf_item_bot_product_info_parent);
            this.f6008k = (LinearLayout) view.findViewById(C2364R.C2367id.ysf_ll_bot_product_shop_parent);
        }
    }

    public C2831d(Context context, C2557e eVar) {
        this.f5991a = eVar.mo35979d();
        this.f5992b = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C2554b getItem(int i) {
        return this.f5991a.get(i);
    }

    /* renamed from: a */
    public final void mo36653a(DialogC2823a.AbstractC2824a aVar) {
        this.f5993c = aVar;
    }

    /* renamed from: a */
    public final void mo36654a(List<C2554b> list) {
        this.f5991a.addAll(list);
    }

    public final int getCount() {
        return this.f5991a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f5992b).inflate(C2364R.layout.ysf_item_bot_product_list, (ViewGroup) null);
            view.setTag(new C2834a(view));
        }
        final C2554b a = getItem(i);
        C2834a aVar = (C2834a) view.getTag();
        if ("1".equals(a.mo35947b())) {
            aVar.f6008k.setVisibility(0);
            aVar.f6007j.setVisibility(8);
            aVar.f6000c.setText(a.mo35949d());
            if (TextUtils.isEmpty(a.mo35948c())) {
                aVar.f5999b.setVisibility(8);
            } else {
                C1870a.m3568a(a.mo35948c(), aVar.f5999b, aVar.f5999b.getWidth(), aVar.f5999b.getHeight());
                aVar.f5999b.setVisibility(0);
            }
            if (!TextUtils.isEmpty(a.mo35950e())) {
                aVar.f6009l.setText(a.mo35950e());
                aVar.f6009l.setVisibility(0);
            } else {
                aVar.f6009l.setVisibility(8);
            }
        } else if ("0".equals(a.mo35947b())) {
            aVar.f6008k.setVisibility(8);
            aVar.f6007j.setVisibility(0);
            if (!TextUtils.isEmpty(a.mo35948c())) {
                C1870a.m3568a(a.mo35948c(), aVar.f6001d, aVar.f6001d.getWidth(), aVar.f6001d.getHeight());
                aVar.f6001d.setVisibility(0);
            } else {
                aVar.f6001d.setVisibility(8);
            }
            aVar.f6002e.setText(a.mo35949d());
            aVar.f6003f.setText(a.mo35951f());
            aVar.f6004g.setText(a.mo35952g());
            aVar.f6006i.setText(a.mo35953h());
            aVar.f6005h.setText(a.mo35950e());
            aVar.f6007j.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.p246b.C2831d.View$OnClickListenerC28321 */

                public final void onClick(View view) {
                    if ("url".equals(a.mo35954i()) && C2452d.m5373e().onMessageItemClickListener != null) {
                        C2452d.m5373e().onMessageItemClickListener.onURLClicked(C2831d.this.f5992b, a.mo35955j());
                    } else if ("block".equals(a.mo35954i())) {
                        final DialogC2823a aVar = new DialogC2823a(C2831d.this.f5992b);
                        aVar.mo36638a(a);
                        aVar.mo36639a(new DialogC2823a.AbstractC2824a() {
                            /* class com.qiyukf.unicorn.p244ui.p246b.C2831d.View$OnClickListenerC28321.C28331 */

                            @Override // com.qiyukf.unicorn.p244ui.p246b.DialogC2823a.AbstractC2824a
                            /* renamed from: a */
                            public final void mo36642a(C2554b bVar) {
                                if (C2831d.this.f5993c != null) {
                                    C2831d.this.f5993c.mo36642a(bVar);
                                }
                                aVar.dismiss();
                            }
                        });
                        aVar.show();
                    }
                }
            });
        }
        return view;
    }
}
