package com.qiyukf.unicorn.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p231j.C2690a;

public class MultipleStatusLayout extends FrameLayout {

    /* renamed from: a */
    public View f6564a;

    /* renamed from: b */
    public View f6565b;

    /* renamed from: c */
    public View f6566c;

    /* renamed from: d */
    public View f6567d;

    /* renamed from: e */
    public View f6568e;

    /* renamed from: f */
    public Button f6569f;

    /* renamed from: g */
    public int f6570g;

    /* renamed from: h */
    public int f6571h;

    /* renamed from: i */
    public int f6572i;

    /* renamed from: j */
    public int f6573j;

    /* renamed from: k */
    public int f6574k;

    /* renamed from: l */
    public int f6575l;

    /* renamed from: m */
    public LayoutInflater f6576m;

    /* renamed from: n */
    public View.OnClickListener f6577n;

    /* renamed from: o */
    public final ViewGroup.LayoutParams f6578o;

    public MultipleStatusLayout(Context context) {
        this(context, null);
    }

    public MultipleStatusLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultipleStatusLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6578o = new ViewGroup.LayoutParams(-1, -1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2364R.styleable.MultipleStatusLayout, i, 0);
        this.f6570g = obtainStyledAttributes.getResourceId(C2364R.styleable.MultipleStatusLayout_emptyView, C2364R.layout.ysf_layout_msl_default_empty);
        this.f6571h = obtainStyledAttributes.getResourceId(C2364R.styleable.MultipleStatusLayout_errorView, C2364R.layout.ysf_layout_msl_default_error);
        this.f6572i = obtainStyledAttributes.getResourceId(C2364R.styleable.MultipleStatusLayout_loadingView, C2364R.layout.ysf_layout_msl_default_loading);
        this.f6573j = obtainStyledAttributes.getResourceId(C2364R.styleable.MultipleStatusLayout_noNetworkView, C2364R.layout.ysf_layout_msl_default_no_network);
        this.f6574k = obtainStyledAttributes.getResourceId(C2364R.styleable.MultipleStatusLayout_customView, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m7025a(int i) {
        View view = this.f6566c;
        int i2 = 0;
        if (view != null) {
            view.setVisibility(i == 1 ? 0 : 8);
        }
        View view2 = this.f6564a;
        if (view2 != null) {
            view2.setVisibility(i == 2 ? 0 : 8);
        }
        View view3 = this.f6565b;
        if (view3 != null) {
            view3.setVisibility(i == 3 ? 0 : 8);
        }
        View view4 = this.f6567d;
        if (view4 != null) {
            view4.setVisibility(i == 4 ? 0 : 8);
        }
        View view5 = this.f6568e;
        if (view5 != null) {
            if (i != 5) {
                i2 = 8;
            }
            view5.setVisibility(i2);
        }
    }

    /* renamed from: a */
    public final void mo36848a() {
        this.f6575l = 0;
        m7025a(0);
    }

    /* renamed from: a */
    public final void mo36849a(FrameLayout.LayoutParams layoutParams) {
        int i;
        this.f6575l = 5;
        if (this.f6568e == null && (i = this.f6574k) != -1) {
            View inflate = this.f6576m.inflate(i, (ViewGroup) null);
            this.f6568e = inflate;
            addView(inflate, layoutParams);
        }
        m7025a(this.f6575l);
    }

    /* renamed from: b */
    public final void mo36850b() {
        Button button;
        this.f6575l = 3;
        if (this.f6565b == null) {
            View inflate = this.f6576m.inflate(this.f6571h, (ViewGroup) null);
            this.f6565b = inflate;
            this.f6569f = (Button) inflate.findViewById(C2364R.C2367id.ysf_btn_msl_fail_reload);
            C2690a.m6219a().mo36459a(this.f6569f);
            View.OnClickListener onClickListener = this.f6577n;
            if (!(onClickListener == null || (button = this.f6569f) == null)) {
                button.setOnClickListener(onClickListener);
            }
            addView(this.f6565b, this.f6578o);
        }
        m7025a(this.f6575l);
    }

    /* renamed from: c */
    public final void mo36851c() {
        this.f6575l = 1;
        if (this.f6566c == null) {
            View inflate = this.f6576m.inflate(this.f6572i, (ViewGroup) null);
            this.f6566c = inflate;
            addView(inflate, this.f6578o);
        }
        m7025a(this.f6575l);
    }

    /* renamed from: d */
    public final View mo36852d() {
        return this.f6568e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f6576m = LayoutInflater.from(getContext());
        mo36848a();
    }
}
