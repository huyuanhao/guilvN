package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.CustomNotification;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.OnMessageItemClickListener;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2374b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.C2376b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p215a.C2542b;
import com.qiyukf.unicorn.p213f.p214a.p215a.C2546c;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2531q;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p232k.C2724p;
import com.qiyukf.unicorn.widget.pulltorefresh.PullToRefreshLayout;
import com.qiyukf.unicorn.widget.pulltorefresh.PullableListView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.ui.d.a.u */
public class View$OnClickListenerC2901u extends AbstractC2857f implements View.OnClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener, PullToRefreshLayout.AbstractC3031a {

    /* renamed from: a */
    public TextView f6231a;

    /* renamed from: b */
    public ListView f6232b;

    /* renamed from: c */
    public View f6233c;

    /* renamed from: d */
    public TextView f6234d;

    /* renamed from: e */
    public C2904a f6235e;

    /* renamed from: f */
    public PopupWindow f6236f;

    /* renamed from: g */
    public View f6237g;

    /* renamed from: h */
    public View f6238h;

    /* renamed from: i */
    public PullToRefreshLayout f6239i;

    /* renamed from: j */
    public PullableListView f6240j;

    /* renamed from: k */
    public C2904a f6241k;

    /* renamed from: l */
    public String f6242l;

    /* renamed from: m */
    public String f6243m;

    /* renamed from: n */
    public boolean f6244n;

    /* renamed from: o */
    public Observer<CustomNotification> f6245o = new Observer<CustomNotification>() {
        /* class com.qiyukf.unicorn.p244ui.p248d.p249a.View$OnClickListenerC2901u.C29032 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(CustomNotification customNotification) {
            CustomNotification customNotification2 = customNotification;
            if (View$OnClickListenerC2901u.this.f6244n && customNotification2.getSessionType() == SessionTypeEnum.Ysf && (customNotification2.getAttachment() instanceof C2542b)) {
                C2542b bVar = (C2542b) customNotification2.getAttachment();
                if (bVar.mo35926a() instanceof C2531q) {
                    View$OnClickListenerC2901u.this.f6244n = false;
                    C2531q qVar = (C2531q) bVar.mo35926a();
                    if (qVar.mo35887e() == null || qVar.mo35886d().isEmpty()) {
                        View$OnClickListenerC2901u.this.f6240j.mo36917a(false);
                        View$OnClickListenerC2901u.this.f6239i.mo36902a(2);
                        return;
                    }
                    View$OnClickListenerC2901u.this.f6242l = qVar.mo35887e().mo35889b();
                    View$OnClickListenerC2901u.this.f6243m = qVar.mo35887e().mo35890c();
                    View$OnClickListenerC2901u.this.f6241k.mo36749b(qVar.mo35886d());
                    View$OnClickListenerC2901u.this.f6241k.notifyDataSetChanged();
                    View$OnClickListenerC2901u.this.f6239i.mo36902a(0);
                }
            }
        }
    };

    /* renamed from: com.qiyukf.unicorn.ui.d.a.u$a */
    public static class C2904a extends BaseAdapter {

        /* renamed from: a */
        public List<Object> f6248a;

        /* renamed from: com.qiyukf.unicorn.ui.d.a.u$a$a */
        public static class C2905a {

            /* renamed from: a */
            public ImageView f6249a;

            /* renamed from: b */
            public TextView f6250b;

            /* renamed from: c */
            public TextView f6251c;

            /* renamed from: d */
            public TextView f6252d;

            /* renamed from: e */
            public TextView f6253e;

            /* renamed from: f */
            public TextView f6254f;

            /* renamed from: g */
            public View f6255g;

            public C2905a(View view) {
                this.f6249a = (ImageView) view.findViewById(C2364R.C2367id.ysf_iv_goods_img);
                this.f6250b = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_goods_name);
                this.f6251c = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_goods_sku);
                this.f6252d = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_goods_price);
                this.f6253e = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_goods_count);
                this.f6254f = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_goods_state);
                this.f6255g = view.findViewById(C2364R.C2367id.ysf_v_order_list_goods_divider);
            }

            /* renamed from: a */
            public final void mo36757a(C2531q.C2533b.C2534a aVar, boolean z, boolean z2) {
                int a = C1862c.m3540a(60.0f);
                C1870a.m3568a(aVar.mo35898e(), this.f6249a, a, a);
                this.f6250b.setText(aVar.mo35899f());
                this.f6251c.setText(aVar.mo35902i());
                this.f6252d.setText(aVar.mo35900g());
                this.f6253e.setText(aVar.mo35901h());
                this.f6254f.setText(aVar.mo35897d());
                this.f6255g.setVisibility(z ? 8 : 0);
                int a2 = z2 ? 0 : C1862c.m3540a(10.0f);
                this.f6255g.setPadding(a2, 0, a2, 0);
            }
        }

        /* renamed from: com.qiyukf.unicorn.ui.d.a.u$a$b */
        public static class C2906b {

            /* renamed from: a */
            public View f6256a;

            /* renamed from: b */
            public View f6257b;

            /* renamed from: c */
            public TextView f6258c;

            /* renamed from: d */
            public TextView f6259d;

            public C2906b(View view) {
                this.f6256a = view.findViewById(C2364R.C2367id.ysf_order_list_order_header_content);
                this.f6257b = view.findViewById(C2364R.C2367id.ysf_order_list_header_divider);
                this.f6258c = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_order_shop_name);
                this.f6259d = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_order_state);
            }

            /* renamed from: a */
            public final void mo36758a(C2531q.C2533b bVar, boolean z) {
                this.f6258c.setText(bVar.mo35891a());
                this.f6259d.setText(bVar.mo35892b());
                int i = 0;
                this.f6256a.setPadding(0, z ? 0 : C1862c.m3540a(10.0f), 0, 0);
                View view = this.f6257b;
                if (z) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }

        public C2904a() {
            this.f6248a = new ArrayList();
        }

        public /* synthetic */ C2904a(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo36748a(List<C2531q.C2533b> list) {
            this.f6248a.clear();
            mo36749b(list);
        }

        /* renamed from: b */
        public final void mo36749b(List<C2531q.C2533b> list) {
            for (int i = 0; i < list.size(); i++) {
                C2531q.C2533b bVar = list.get(i);
                this.f6248a.add(bVar);
                this.f6248a.addAll(bVar.mo35893c());
            }
        }

        public final int getCount() {
            return this.f6248a.size();
        }

        public final Object getItem(int i) {
            return this.f6248a.get(i);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getItemViewType(int i) {
            return this.f6248a.get(i) instanceof C2531q.C2533b ? 0 : 1;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            C2906b bVar;
            C2905a aVar;
            int itemViewType = getItemViewType(i);
            boolean z = false;
            if (itemViewType == 0) {
                if (view == null) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(C2364R.layout.ysf_view_holder_order_list_order_header, (ViewGroup) null);
                    bVar = new C2906b(view);
                    view.setTag(bVar);
                } else {
                    bVar = (C2906b) view.getTag();
                }
                C2531q.C2533b bVar2 = (C2531q.C2533b) this.f6248a.get(i);
                if (i == 0) {
                    z = true;
                }
                bVar.mo36758a(bVar2, z);
            } else if (itemViewType == 1) {
                if (view == null) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(C2364R.layout.ysf_view_holder_order_list_goods, (ViewGroup) null);
                    aVar = new C2905a(view);
                    view.setTag(aVar);
                } else {
                    aVar = (C2905a) view.getTag();
                }
                boolean z2 = i < this.f6248a.size() - 1 && (this.f6248a.get(i + 1) instanceof C2531q.C2533b);
                C2531q.C2533b.C2534a aVar2 = (C2531q.C2533b.C2534a) this.f6248a.get(i);
                if (i == this.f6248a.size() - 1) {
                    z = true;
                }
                aVar.mo36757a(aVar2, z, z2);
            }
            return view;
        }

        public final int getViewTypeCount() {
            return 2;
        }

        public final boolean isEnabled(int i) {
            return this.f6248a.get(i) instanceof C2531q.C2533b.C2534a;
        }
    }

    /* renamed from: a */
    private void m6748a(boolean z) {
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeCustomNotification(this.f6245o, z);
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        C2531q qVar = (C2531q) this.message.getAttachment();
        this.f6231a.setText(qVar.mo35885c());
        this.f6235e.mo36748a(qVar.mo35886d());
        this.f6232b.setAdapter((ListAdapter) this.f6235e);
        this.f6232b.setOnItemClickListener(this);
        if (qVar.mo35887e() == null || qVar.mo35886d().size() < 3) {
            new C2531q.C2532a();
            this.f6233c.setVisibility(8);
            return;
        }
        this.f6233c.setVisibility(0);
        this.f6234d.setText(qVar.mo35887e().mo35888a());
        this.f6234d.setOnClickListener(this);
    }

    @Override // com.qiyukf.unicorn.widget.pulltorefresh.PullToRefreshLayout.AbstractC3031a
    /* renamed from: a_ */
    public final void mo36648a_() {
        if (C2452d.m5375g().mo36349c(this.message.getSessionId()) == 0) {
            this.f6239i.mo36902a(1);
            C1865f.m3555a(C2364R.string.ysf_bot_load_more_disabled);
            return;
        }
        C2546c cVar = new C2546c();
        cVar.mo35938b(this.f6242l);
        cVar.mo35939c(this.f6243m);
        cVar.mo35937a("order_list");
        C2667c.m6115a((AbstractC2597e) cVar, this.message.getSessionId(), false).setCallback(new RequestCallbackWrapper<Void>() {
            /* class com.qiyukf.unicorn.p244ui.p248d.p249a.View$OnClickListenerC2901u.C29021 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
            @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
            public final /* synthetic */ void onResult(int i, Void r2, Throwable th) {
                if (i == 200) {
                    View$OnClickListenerC2901u.this.f6244n = true;
                    return;
                }
                View$OnClickListenerC2901u.this.f6244n = false;
                View$OnClickListenerC2901u.this.f6239i.mo36902a(1);
            }
        });
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_bot_list;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6231a = (TextView) findViewById(C2364R.C2367id.ysf_tv_bot_list_title);
        this.f6232b = (ListView) findViewById(C2364R.C2367id.ysf_lv_bot_list);
        this.f6233c = findViewById(C2364R.C2367id.ysf_bot_footer_layout);
        this.f6234d = (TextView) findViewById(C2364R.C2367id.ysf_bot_footer_text);
        this.f6235e = new C2904a((byte) 0);
    }

    public void onClick(View view) {
        if (view == this.f6234d) {
            if (!mo36704g()) {
                C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
            } else if (getAdapter().mo34518e().mo34505a()) {
                PopupWindow popupWindow = new PopupWindow(this.context);
                this.f6236f = popupWindow;
                popupWindow.setWidth(-1);
                PopupWindow popupWindow2 = this.f6236f;
                double b = (double) C1862c.m3542b();
                Double.isNaN(b);
                popupWindow2.setHeight((int) (b * 0.8d));
                this.f6236f.setContentView(LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_popup_window_bot_list, (ViewGroup) null));
                this.f6236f.setBackgroundDrawable(new ColorDrawable(0));
                this.f6236f.setOutsideTouchable(false);
                this.f6236f.setFocusable(true);
                this.f6236f.setOnDismissListener(this);
                this.f6236f.setAnimationStyle(C2364R.style.ysf_dialog_window_animation_style);
                this.f6236f.showAtLocation(((Activity) this.context).getWindow().getDecorView().findViewById(16908290), 81, 0, 0);
                C2724p.m6290a(((Activity) this.context).getWindow(), 0.3f);
                this.f6237g = this.f6236f.getContentView().findViewById(C2364R.C2367id.ysf_bot_list_placeholder);
                this.f6238h = this.f6236f.getContentView().findViewById(C2364R.C2367id.ysf_bot_list_close);
                this.f6239i = (PullToRefreshLayout) this.f6236f.getContentView().findViewById(C2364R.C2367id.ysf_ptr_layout_bot_list);
                this.f6240j = (PullableListView) this.f6236f.getContentView().findViewById(C2364R.C2367id.ysf_lv_bot_list);
                ((TextView) this.f6236f.getContentView().findViewById(C2364R.C2367id.ysf_bot_list_title)).setText(C2364R.string.ysf_bot_order_list_title);
                this.f6237g.setOnClickListener(this);
                this.f6238h.setOnClickListener(this);
                this.f6240j.setOnItemClickListener(this);
                C2531q qVar = (C2531q) this.message.getAttachment();
                this.f6242l = qVar.mo35887e().mo35889b();
                this.f6243m = qVar.mo35887e().mo35890c();
                if (this.f6241k == null) {
                    this.f6241k = new C2904a((byte) 0);
                }
                C2904a aVar = this.f6241k;
                this.f6241k = aVar;
                aVar.mo36748a(qVar.mo35886d());
                this.f6240j.setAdapter((ListAdapter) this.f6241k);
                this.f6240j.mo36917a(true);
                this.f6239i.mo36903a(this);
                m6748a(true);
                getAdapter().mo34518e().mo34506b();
            }
        } else if (view == this.f6238h || view == this.f6237g) {
            this.f6236f.dismiss();
        }
    }

    public void onDismiss() {
        C2724p.m6290a(((Activity) this.context).getWindow(), 1.0f);
        m6748a(false);
        this.f6244n = false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C2531q.C2533b.C2534a aVar = (C2531q.C2533b.C2534a) adapterView.getAdapter().getItem(i);
        if (aVar.mo35903j() != null) {
            OnMessageItemClickListener onMessageItemClickListener = C2452d.m5373e().onMessageItemClickListener;
            if (onMessageItemClickListener != null) {
                onMessageItemClickListener.onURLClicked(this.context, aVar.mo35903j());
            }
        } else if (!mo36704g()) {
            C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
            return;
        } else {
            C2376b bVar = new C2376b();
            bVar.fromJson(aVar.mo35894a());
            C2374b bVar2 = new C2374b();
            bVar2.mo35239a(aVar.mo35895b());
            bVar2.mo35241b(aVar.mo35896c());
            bVar2.mo35240a(bVar.mo35244c());
            bVar.mo35276a(bVar2);
            getAdapter().mo34518e().mo34509c(MessageBuilder.createCustomMessage(this.message.getSessionId(), SessionTypeEnum.Ysf, bVar));
        }
        if (adapterView == this.f6240j) {
            this.f6236f.dismiss();
        }
    }
}
