package com.qiyukf.unicorn.p244ui.p246b;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p215a.C2546c;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2557e;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p244ui.p246b.DialogC2823a;
import com.qiyukf.unicorn.widget.pulltorefresh.PullToRefreshLayout;
import com.qiyukf.unicorn.widget.pulltorefresh.PullableListView;

/* renamed from: com.qiyukf.unicorn.ui.b.b */
public final class C2825b {

    /* renamed from: a */
    public View f5956a;

    /* renamed from: b */
    public PullToRefreshLayout f5957b;

    /* renamed from: c */
    public PullableListView f5958c;

    /* renamed from: d */
    public C2831d f5959d;

    /* renamed from: e */
    public TextView f5960e;

    /* renamed from: f */
    public C2557e f5961f;

    /* renamed from: g */
    public Context f5962g;

    /* renamed from: h */
    public boolean f5963h = false;

    /* renamed from: i */
    public String f5964i;

    /* renamed from: j */
    public String f5965j;

    /* renamed from: k */
    public String f5966k;

    public C2825b(Context context, C2557e eVar, DialogC2823a.AbstractC2824a aVar, String str) {
        this.f5961f = eVar;
        if (!(eVar == null || eVar.mo35972a() == null)) {
            this.f5965j = eVar.mo35972a().mo35944a();
            this.f5964i = eVar.mo35972a().mo35945b();
        }
        this.f5962g = context;
        this.f5966k = str;
        View inflate = LayoutInflater.from(context).inflate(C2364R.layout.ysf_item_bot_product_list_view, (ViewGroup) null);
        this.f5956a = inflate;
        this.f5957b = (PullToRefreshLayout) inflate.findViewById(C2364R.C2367id.ysf_ptl_bot_product_list_parent);
        this.f5958c = (PullableListView) this.f5956a.findViewById(C2364R.C2367id.ysf_plv_bot_product_list_body);
        TextView textView = (TextView) this.f5956a.findViewById(C2364R.C2367id.ysf_tv_bot_product_list_empty);
        this.f5960e = textView;
        textView.setText(this.f5966k);
        C2831d dVar = new C2831d(this.f5962g, this.f5961f);
        this.f5959d = dVar;
        dVar.mo36653a(aVar);
        this.f5958c.setAdapter((ListAdapter) this.f5959d);
        this.f5958c.mo36917a(true);
        this.f5957b.mo36903a(new PullToRefreshLayout.AbstractC3031a() {
            /* class com.qiyukf.unicorn.p244ui.p246b.C2825b.C28261 */

            @Override // com.qiyukf.unicorn.widget.pulltorefresh.PullToRefreshLayout.AbstractC3031a
            /* renamed from: a_ */
            public final void mo36648a_() {
                C2546c cVar = new C2546c();
                cVar.mo35938b(C2825b.this.f5964i);
                cVar.mo35939c(C2825b.this.f5965j);
                cVar.mo35937a((C2825b.this.f5961f == null || TextUtils.isEmpty(C2825b.this.f5961f.mo35980e())) ? "drawer_list" : C2825b.this.f5961f.mo35980e());
                C2667c.m6115a((AbstractC2597e) cVar, C2667c.m6116a(), false).setCallback(new RequestCallbackWrapper<Void>() {
                    /* class com.qiyukf.unicorn.p244ui.p246b.C2825b.C28261.C28271 */

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
                    @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                    public final /* synthetic */ void onResult(int i, Void r2, Throwable th) {
                        if (i == 200) {
                            C2825b.this.f5963h = true;
                            return;
                        }
                        C2825b.this.f5963h = false;
                        if (C2825b.this.f5957b != null) {
                            C2825b.this.f5957b.mo36902a(1);
                        }
                    }
                });
            }
        });
        if (this.f5961f.mo35979d().isEmpty()) {
            C2546c cVar = new C2546c();
            cVar.mo35938b(this.f5964i);
            cVar.mo35939c(this.f5965j);
            C2667c.m6115a((AbstractC2597e) cVar, C2667c.m6116a(), false).setCallback(new RequestCallbackWrapper<Void>() {
                /* class com.qiyukf.unicorn.p244ui.p246b.C2825b.C28282 */

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
                @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                public final /* synthetic */ void onResult(int i, Void r2, Throwable th) {
                    if (i == 200) {
                        C2825b.this.f5963h = true;
                        return;
                    }
                    C2825b.this.f5963h = false;
                    C2825b.this.f5957b.mo36902a(1);
                }
            });
        }
        C2557e eVar2 = this.f5961f;
        if (eVar2 == null || eVar2.mo35979d().size() == 0) {
            this.f5960e.setVisibility(0);
            this.f5957b.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo36643a() {
        this.f5960e.setVisibility(0);
        this.f5957b.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo36644a(C2557e eVar) {
        if (eVar != null) {
            if (!this.f5961f.mo35979d().isEmpty() || !eVar.mo35979d().isEmpty()) {
                this.f5960e.setVisibility(8);
                this.f5957b.setVisibility(0);
            } else {
                this.f5960e.setVisibility(0);
                this.f5957b.setVisibility(8);
            }
            this.f5963h = false;
            if (eVar.mo35972a() == null || eVar.mo35979d().isEmpty()) {
                this.f5958c.mo36917a(false);
                this.f5957b.mo36904a(false);
                this.f5957b.mo36902a(2);
            } else {
                this.f5958c.mo36917a(true);
                this.f5957b.mo36904a(true);
                try {
                    this.f5957b.mo36902a(0);
                } catch (NullPointerException e) {
                    C1709a.m3015b("BotProductTabEntry", "loadMoreFinish is error", e);
                }
            }
            if (eVar.mo35972a() != null && !eVar.mo35979d().isEmpty()) {
                this.f5964i = eVar.mo35972a().mo35945b();
                this.f5965j = eVar.mo35972a().mo35944a();
                this.f5959d.mo36654a(eVar.mo35979d());
                this.f5959d.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: b */
    public final View mo36645b() {
        return this.f5956a;
    }

    /* renamed from: c */
    public final boolean mo36646c() {
        return this.f5963h;
    }

    /* renamed from: d */
    public final String mo36647d() {
        C2557e eVar = this.f5961f;
        return eVar == null ? "" : eVar.mo35976b();
    }
}
