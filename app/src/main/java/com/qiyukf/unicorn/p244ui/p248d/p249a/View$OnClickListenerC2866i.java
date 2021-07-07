package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.CustomNotification;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p215a.C2542b;
import com.qiyukf.unicorn.p213f.p214a.p215a.C2546c;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2515i;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p232k.C2724p;
import com.qiyukf.unicorn.p244ui.activity.CardPopupActivity;
import com.qiyukf.unicorn.widget.pulltorefresh.PullToRefreshLayout;
import com.qiyukf.unicorn.widget.pulltorefresh.PullableListView;
import java.util.ArrayList;
import java.util.List;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.qiyukf.unicorn.ui.d.a.i */
public class View$OnClickListenerC2866i extends AbstractC2857f implements View.OnClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener, PullToRefreshLayout.AbstractC3031a {

    /* renamed from: a */
    public TextView f6111a;

    /* renamed from: b */
    public ListView f6112b;

    /* renamed from: c */
    public View f6113c;

    /* renamed from: d */
    public TextView f6114d;

    /* renamed from: e */
    public C2515i f6115e;

    /* renamed from: f */
    public C2869a f6116f;

    /* renamed from: g */
    public PopupWindow f6117g;

    /* renamed from: h */
    public View f6118h;

    /* renamed from: i */
    public View f6119i;

    /* renamed from: j */
    public PullToRefreshLayout f6120j;

    /* renamed from: k */
    public PullableListView f6121k;

    /* renamed from: l */
    public C2869a f6122l;

    /* renamed from: m */
    public String f6123m;

    /* renamed from: n */
    public String f6124n;

    /* renamed from: o */
    public boolean f6125o;

    /* renamed from: p */
    public Observer<CustomNotification> f6126p = new Observer<CustomNotification>() {
        /* class com.qiyukf.unicorn.p244ui.p248d.p249a.View$OnClickListenerC2866i.C28682 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(CustomNotification customNotification) {
            CustomNotification customNotification2 = customNotification;
            if (View$OnClickListenerC2866i.this.f6125o && customNotification2.getSessionType() == SessionTypeEnum.Ysf && (customNotification2.getAttachment() instanceof C2542b)) {
                C2542b bVar = (C2542b) customNotification2.getAttachment();
                if (bVar.mo35926a() instanceof C2515i) {
                    View$OnClickListenerC2866i.this.f6125o = false;
                    C2515i iVar = (C2515i) bVar.mo35926a();
                    if (iVar.mo35817e() == null || iVar.mo35816d().isEmpty()) {
                        View$OnClickListenerC2866i.this.f6121k.mo36917a(false);
                        View$OnClickListenerC2866i.this.f6120j.mo36902a(2);
                        return;
                    }
                    View$OnClickListenerC2866i.this.f6123m = iVar.mo35817e().mo35818a();
                    View$OnClickListenerC2866i.this.f6124n = iVar.mo35817e().mo35819b();
                    View$OnClickListenerC2866i.this.f6122l.mo36713b(iVar.mo35816d());
                    View$OnClickListenerC2866i.this.f6122l.notifyDataSetChanged();
                    View$OnClickListenerC2866i.this.f6120j.mo36902a(0);
                }
            }
        }
    };

    /* renamed from: com.qiyukf.unicorn.ui.d.a.i$a */
    public static class C2869a extends BaseAdapter {

        /* renamed from: a */
        public List<C2515i.C2518c> f6129a = new ArrayList();

        /* renamed from: b */
        public boolean f6130b;

        public C2869a(boolean z) {
            this.f6130b = z;
        }

        /* renamed from: a */
        public final C2515i.C2518c getItem(int i) {
            return this.f6129a.get(i);
        }

        /* renamed from: a */
        public final void mo36712a(List<C2515i.C2518c> list) {
            this.f6129a.clear();
            mo36713b(list);
        }

        /* renamed from: b */
        public final void mo36713b(List<C2515i.C2518c> list) {
            this.f6129a.addAll(list);
        }

        public final int getCount() {
            return this.f6129a.size();
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            C2870b bVar;
            boolean z = false;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C2364R.layout.ysf_view_holder_card, viewGroup, false);
                bVar = new C2870b(view, this.f6130b);
                view.setTag(bVar);
            } else {
                bVar = (C2870b) view.getTag();
            }
            bVar.mo36718a(this.f6129a.get(i));
            if (i < this.f6129a.size() - 1) {
                z = true;
            }
            bVar.mo36719a(z);
            return view;
        }
    }

    /* renamed from: com.qiyukf.unicorn.ui.d.a.i$b */
    public static class C2870b {

        /* renamed from: a */
        public LinearLayout f6131a;

        /* renamed from: b */
        public View f6132b;

        /* renamed from: c */
        public boolean f6133c;

        public C2870b(View view, boolean z) {
            this.f6133c = z;
            this.f6131a = (LinearLayout) view.findViewById(C2364R.C2367id.ysf_holder_card_container);
            this.f6132b = view.findViewById(C2364R.C2367id.ysf_holder_card_divider);
        }

        /* renamed from: a */
        public final void mo36718a(C2515i.C2518c cVar) {
            this.f6131a.removeAllViews();
            for (List<C2515i.C2517b> list : cVar.mo35829b()) {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f6131a.getContext()).inflate(C2364R.layout.ysf_message_item_card_layout, (ViewGroup) this.f6131a, false);
                for (C2515i.C2517b bVar : list) {
                    C2848b.m6622a(bVar, linearLayout, list.size(), this.f6133c);
                }
                this.f6131a.addView(linearLayout);
            }
        }

        /* renamed from: a */
        public final void mo36719a(boolean z) {
            this.f6132b.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    private void m6676a(boolean z) {
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeCustomNotification(this.f6126p, z);
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36692a() {
        C2515i iVar = (C2515i) this.message.getAttachment();
        this.f6115e = iVar;
        this.f6111a.setText(iVar.mo35815c());
        this.f6116f.mo36712a(this.f6115e.mo35816d());
        this.f6112b.setAdapter((ListAdapter) this.f6116f);
        this.f6112b.setOnItemClickListener(this);
        if (this.f6115e.mo35817e() != null) {
            this.f6113c.setVisibility(0);
            this.f6114d.setText(this.f6115e.mo35817e().mo35821d());
            this.f6114d.setOnClickListener(this);
            return;
        }
        this.f6113c.setVisibility(8);
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    public final void mo36700a(String str, String str2) {
        if (getAdapter().mo34518e().mo34505a()) {
            CardPopupActivity.start(this.context, this.message.getSessionId(), str, str2);
        }
    }

    @Override // com.qiyukf.unicorn.widget.pulltorefresh.PullToRefreshLayout.AbstractC3031a
    /* renamed from: a_ */
    public final void mo36648a_() {
        if (C2452d.m5375g().mo36349c(this.message.getSessionId()) == 0) {
            this.f6120j.mo36902a(1);
            C1865f.m3555a(C2364R.string.ysf_bot_load_more_disabled);
            return;
        }
        C2546c cVar = new C2546c();
        cVar.mo35938b(this.f6123m);
        cVar.mo35939c(this.f6124n);
        cVar.mo35937a("card_layout");
        C2667c.m6115a((AbstractC2597e) cVar, this.message.getSessionId(), false).setCallback(new RequestCallbackWrapper<Void>() {
            /* class com.qiyukf.unicorn.p244ui.p248d.p249a.View$OnClickListenerC2866i.C28671 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
            @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
            public final /* synthetic */ void onResult(int i, Void r2, Throwable th) {
                if (i == 200) {
                    View$OnClickListenerC2866i.this.f6125o = true;
                    return;
                }
                View$OnClickListenerC2866i.this.f6125o = false;
                View$OnClickListenerC2866i.this.f6120j.mo36902a(1);
            }
        });
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: f */
    public final void mo36703f() {
        if (getAdapter().mo34518e().mo34505a()) {
            PopupWindow popupWindow = new PopupWindow(this.context);
            this.f6117g = popupWindow;
            popupWindow.setWidth(-1);
            PopupWindow popupWindow2 = this.f6117g;
            double b = (double) C1862c.m3542b();
            Double.isNaN(b);
            popupWindow2.setHeight((int) (b * 0.8d));
            this.f6117g.setContentView(LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_popup_window_bot_list, (ViewGroup) null));
            this.f6117g.setBackgroundDrawable(new ColorDrawable(0));
            this.f6117g.setOutsideTouchable(false);
            this.f6117g.setFocusable(true);
            this.f6117g.setOnDismissListener(this);
            this.f6117g.setAnimationStyle(C2364R.style.ysf_dialog_window_animation_style);
            this.f6117g.showAtLocation(((Activity) this.context).getWindow().getDecorView().findViewById(16908290), 81, 0, 0);
            C2724p.m6290a(((Activity) this.context).getWindow(), 0.3f);
            this.f6118h = this.f6117g.getContentView().findViewById(C2364R.C2367id.ysf_bot_list_placeholder);
            this.f6119i = this.f6117g.getContentView().findViewById(C2364R.C2367id.ysf_bot_list_close);
            this.f6120j = (PullToRefreshLayout) this.f6117g.getContentView().findViewById(C2364R.C2367id.ysf_ptr_layout_bot_list);
            this.f6121k = (PullableListView) this.f6117g.getContentView().findViewById(C2364R.C2367id.ysf_lv_bot_list);
            ((TextView) this.f6117g.getContentView().findViewById(C2364R.C2367id.ysf_bot_list_title)).setText(this.f6115e.mo35817e().mo35822e());
            this.f6118h.setOnClickListener(this);
            this.f6119i.setOnClickListener(this);
            this.f6121k.setOnItemClickListener(this);
            this.f6123m = this.f6115e.mo35817e().mo35818a();
            this.f6124n = this.f6115e.mo35817e().mo35819b();
            if (this.f6122l == null) {
                this.f6122l = new C2869a(false);
            }
            C2869a aVar = this.f6122l;
            this.f6122l = aVar;
            aVar.mo36712a(this.f6115e.mo35816d());
            this.f6121k.setAdapter((ListAdapter) this.f6122l);
            this.f6121k.mo36917a(true);
            this.f6120j.mo36903a(this);
            m6676a(true);
            getAdapter().mo34518e().mo34506b();
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_bot_list;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6111a = (TextView) findViewById(C2364R.C2367id.ysf_tv_bot_list_title);
        this.f6112b = (ListView) findViewById(C2364R.C2367id.ysf_lv_bot_list);
        this.f6113c = findViewById(C2364R.C2367id.ysf_bot_footer_layout);
        this.f6114d = (TextView) findViewById(C2364R.C2367id.ysf_bot_footer_text);
        this.f6116f = new C2869a(true);
    }

    public void onClick(View view) {
        if (view == this.f6114d) {
            if (mo36704g() || this.f6115e.mo35817e().mo35820c().equals("url")) {
                C2847a.m6620a(this.f6115e.mo35817e(), this);
            } else {
                C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
            }
        } else if (view == this.f6119i || view == this.f6118h) {
            this.f6117g.dismiss();
        }
    }

    public void onDismiss() {
        C2724p.m6290a(((Activity) this.context).getWindow(), 1.0f);
        m6676a(false);
        this.f6125o = false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C2515i.C2516a a = ((C2869a) adapterView.getAdapter()).getItem(i).mo35828a();
        if (mo36704g() || a.mo35820c().equals("url")) {
            C2847a.m6620a(a, this);
            if (adapterView == this.f6121k && !TextUtils.equals(a.mo35820c(), AgooConstants.MESSAGE_POPUP)) {
                this.f6117g.dismiss();
                return;
            }
            return;
        }
        C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
    }
}
