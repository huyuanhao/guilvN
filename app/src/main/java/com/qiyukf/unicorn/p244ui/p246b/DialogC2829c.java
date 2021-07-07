package com.qiyukf.unicorn.p244ui.p246b;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.p118pd.sdk.C7383o0OOO0O;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2553a;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2557e;
import com.qiyukf.unicorn.p244ui.p246b.DialogC2823a;
import com.qiyukf.unicorn.widget.ViewPagerFixed;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.ui.b.c */
public final class DialogC2829c extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    public List<C2557e> f5970a;

    /* renamed from: b */
    public String f5971b;

    /* renamed from: c */
    public String f5972c;

    /* renamed from: d */
    public Context f5973d;

    /* renamed from: e */
    public View f5974e;

    /* renamed from: f */
    public LinearLayout f5975f;

    /* renamed from: g */
    public TextView f5976g;

    /* renamed from: h */
    public ImageView f5977h;

    /* renamed from: i */
    public TextView f5978i;

    /* renamed from: j */
    public TextView f5979j;

    /* renamed from: k */
    public TextView f5980k;

    /* renamed from: l */
    public TextView f5981l;

    /* renamed from: m */
    public ImageView f5982m;

    /* renamed from: n */
    public ViewPagerFixed f5983n;

    /* renamed from: o */
    public TextView f5984o;

    /* renamed from: p */
    public LinearLayout f5985p;

    /* renamed from: q */
    public int f5986q;

    /* renamed from: r */
    public int f5987r = 0;

    /* renamed from: s */
    public C2835e f5988s;

    /* renamed from: t */
    public int f5989t = 0;

    public DialogC2829c(@NonNull Context context, List<C2557e> list, String str, String str2) {
        super(context, C2364R.style.ysf_popup_dialog_style);
        this.f5970a = list;
        this.f5987r = list.size();
        this.f5971b = str;
        this.f5972c = str2;
        this.f5973d = context;
        new C2553a();
        View inflate = LayoutInflater.from(getContext()).inflate(C2364R.layout.ysf_dialog_product_and_order_list, (ViewGroup) null);
        this.f5974e = inflate;
        setContentView(inflate);
        setCancelable(false);
        this.f5975f = (LinearLayout) this.f5974e.findViewById(C2364R.C2367id.ysf_ll_dialog_product_list_content);
        this.f5976g = (TextView) this.f5974e.findViewById(C2364R.C2367id.ysf_tv_dialog_product_list_title);
        this.f5977h = (ImageView) this.f5974e.findViewById(C2364R.C2367id.ysf_iv_dialog_product_list_close);
        this.f5978i = (TextView) this.f5974e.findViewById(C2364R.C2367id.ysf_tv_dialog_product_list_tab1);
        this.f5979j = (TextView) this.f5974e.findViewById(C2364R.C2367id.ysf_tv_dialog_product_list_tab2);
        this.f5980k = (TextView) this.f5974e.findViewById(C2364R.C2367id.ysf_tv_dialog_product_list_tab3);
        this.f5981l = (TextView) this.f5974e.findViewById(C2364R.C2367id.ysf_tv_dialog_product_list_tab4);
        this.f5982m = (ImageView) this.f5974e.findViewById(C2364R.C2367id.ysf_im_dialog_product_list_line);
        this.f5986q = C1862c.m3539a();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5982m.getLayoutParams();
        int i = this.f5987r;
        if (i != 0) {
            layoutParams.width = this.f5986q / i;
        }
        this.f5982m.setLayoutParams(layoutParams);
        this.f5983n = (ViewPagerFixed) this.f5974e.findViewById(C2364R.C2367id.ysf_vp_dialog_product_list);
        this.f5984o = (TextView) this.f5974e.findViewById(C2364R.C2367id.ysf_tv_dialog_product_list_empty);
        this.f5985p = (LinearLayout) this.f5974e.findViewById(C2364R.C2367id.ysf_ll_dialog_product_list_tab_parent);
        this.f5977h.setOnClickListener(this);
        this.f5978i.setOnClickListener(this);
        this.f5979j.setOnClickListener(this);
        this.f5980k.setOnClickListener(this);
        this.f5981l.setOnClickListener(this);
        this.f5983n.addOnPageChangeListener(new ViewPager.OooO() {
            /* class com.qiyukf.unicorn.p244ui.p246b.DialogC2829c.C28301 */

            @Override // androidx.viewpager.widget.ViewPager.OooO
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OooO
            public final void onPageScrolled(int i, float f, int i2) {
                C1709a.m3014b(C7383o0OOO0O.OooOOO0, "position:" + i + "currentIndex:" + DialogC2829c.this.f5989t + "offset" + f);
                DialogC2829c.m6549a(DialogC2829c.this, i, f);
            }

            @Override // androidx.viewpager.widget.ViewPager.OooO
            public final void onPageSelected(int i) {
                TextView textView;
                DialogC2829c.this.m6548a();
                if (i == 0) {
                    textView = DialogC2829c.this.f5978i;
                } else if (i == 1) {
                    textView = DialogC2829c.this.f5979j;
                } else if (i != 2) {
                    if (i == 3) {
                        textView = DialogC2829c.this.f5981l;
                    }
                    DialogC2829c.this.f5989t = i;
                } else {
                    textView = DialogC2829c.this.f5980k;
                }
                textView.setTextColor(DialogC2829c.this.f5973d.getResources().getColor(C2364R.C2365color.ysf_blue_337EFF));
                DialogC2829c.this.f5989t = i;
            }
        });
        this.f5976g.setText(this.f5971b);
        List<C2557e> list2 = this.f5970a;
        if (list2 == null || list2.size() == 0) {
            this.f5984o.setVisibility(0);
            this.f5984o.setText(this.f5972c);
            this.f5982m.setVisibility(8);
            this.f5975f.setVisibility(8);
            return;
        }
        if (this.f5970a.size() <= 0 || TextUtils.isEmpty(this.f5970a.get(0).mo35978c())) {
            this.f5985p.setVisibility(8);
        } else {
            this.f5985p.setVisibility(0);
        }
        if (this.f5970a.size() > 0) {
            this.f5978i.setVisibility(0);
            this.f5978i.setText(this.f5970a.get(0).mo35978c());
        } else {
            this.f5978i.setVisibility(8);
        }
        if (this.f5970a.size() >= 2) {
            this.f5979j.setVisibility(0);
            this.f5979j.setText(this.f5970a.get(1).mo35978c());
        }
        if (this.f5970a.size() >= 3) {
            this.f5980k.setVisibility(0);
            this.f5980k.setText(this.f5970a.get(2).mo35978c());
        }
        if (this.f5970a.size() >= 4) {
            this.f5981l.setVisibility(0);
            this.f5981l.setText(this.f5970a.get(3).mo35978c());
        }
        if (this.f5987r <= 1) {
            this.f5982m.setVisibility(8);
        } else {
            this.f5982m.setVisibility(0);
        }
        C2835e eVar = new C2835e(this.f5973d, this.f5970a, this.f5972c);
        this.f5988s = eVar;
        this.f5983n.setAdapter(eVar);
        m6548a();
        this.f5978i.setTextColor(this.f5973d.getResources().getColor(C2364R.C2365color.ysf_blue_337EFF));
        this.f5983n.setCurrentItem(0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m6548a() {
        this.f5978i.setTextColor(this.f5973d.getResources().getColor(C2364R.C2365color.ysf_black_333333));
        this.f5979j.setTextColor(this.f5973d.getResources().getColor(C2364R.C2365color.ysf_black_333333));
        this.f5980k.setTextColor(this.f5973d.getResources().getColor(C2364R.C2365color.ysf_black_333333));
        this.f5981l.setTextColor(this.f5973d.getResources().getColor(C2364R.C2365color.ysf_black_333333));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r9 == 2) goto L_0x0036;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m6549a(com.qiyukf.unicorn.p244ui.p246b.DialogC2829c r8, int r9, float r10) {
        /*
            android.widget.ImageView r0 = r8.f5982m
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r8.f5989t
            if (r1 != 0) goto L_0x002d
            if (r9 != 0) goto L_0x002d
        L_0x000e:
            double r9 = (double) r10
        L_0x000f:
            int r2 = r8.f5986q
            double r3 = (double) r2
            int r5 = r8.f5987r
            double r6 = (double) r5
            java.lang.Double.isNaN(r3)
            java.lang.Double.isNaN(r6)
            double r3 = r3 / r6
            java.lang.Double.isNaN(r9)
            double r9 = r9 * r3
            int r2 = r2 / r5
            int r1 = r1 * r2
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r9 = r9 + r1
            int r9 = (int) r9
            r0.leftMargin = r9
            goto L_0x0058
        L_0x002d:
            int r1 = r8.f5989t
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 != r3) goto L_0x003a
            if (r9 != 0) goto L_0x003a
        L_0x0036:
            float r2 = r2 - r10
            float r9 = -r2
            double r9 = (double) r9
            goto L_0x000f
        L_0x003a:
            int r1 = r8.f5989t
            if (r1 != r3) goto L_0x0041
            if (r9 != r3) goto L_0x0041
            goto L_0x000e
        L_0x0041:
            int r1 = r8.f5989t
            r4 = 2
            if (r1 != r4) goto L_0x0049
            if (r9 != r3) goto L_0x0049
            goto L_0x0036
        L_0x0049:
            int r1 = r8.f5989t
            if (r1 != r4) goto L_0x0050
            if (r9 != r4) goto L_0x0050
            goto L_0x000e
        L_0x0050:
            int r1 = r8.f5989t
            r3 = 3
            if (r1 != r3) goto L_0x0058
            if (r9 != r4) goto L_0x0058
            goto L_0x0036
        L_0x0058:
            android.widget.ImageView r8 = r8.f5982m
            r8.setLayoutParams(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.p246b.DialogC2829c.m6549a(com.qiyukf.unicorn.ui.b.c, int, float):void");
    }

    /* renamed from: a */
    public final void mo36649a(DialogC2823a.AbstractC2824a aVar) {
        this.f5988s.mo36660a(aVar);
    }

    public final void cancel() {
        C2835e eVar = this.f5988s;
        if (eVar != null) {
            eVar.mo36661a(false);
        }
        dismiss();
    }

    public final void onClick(View view) {
        if (view.getId() == C2364R.C2367id.ysf_iv_dialog_product_list_close) {
            cancel();
        } else if (view.getId() == C2364R.C2367id.ysf_tv_dialog_product_list_tab1) {
            this.f5983n.setCurrentItem(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5982m.getLayoutParams();
            layoutParams.leftMargin = 0;
            this.f5982m.setLayoutParams(layoutParams);
            this.f5989t = 0;
        } else if (view.getId() == C2364R.C2367id.ysf_tv_dialog_product_list_tab2) {
            this.f5983n.setCurrentItem(1);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f5982m.getLayoutParams();
            layoutParams2.leftMargin = this.f5986q / this.f5987r;
            this.f5982m.setLayoutParams(layoutParams2);
            this.f5989t = 1;
        } else if (view.getId() == C2364R.C2367id.ysf_tv_dialog_product_list_tab3) {
            this.f5983n.setCurrentItem(2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f5982m.getLayoutParams();
            layoutParams3.leftMargin = (this.f5986q / this.f5987r) << 1;
            this.f5982m.setLayoutParams(layoutParams3);
            this.f5989t = 2;
        } else if (view.getId() == C2364R.C2367id.ysf_tv_dialog_product_list_tab4) {
            this.f5983n.setCurrentItem(3);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f5982m.getLayoutParams();
            layoutParams4.leftMargin = (this.f5986q / this.f5987r) * 3;
            this.f5982m.setLayoutParams(layoutParams4);
            this.f5989t = 3;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
        getWindow().setWindowAnimations(C2364R.style.ysf_product_dialogWindowAnim);
    }
}
