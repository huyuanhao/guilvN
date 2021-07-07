package com.p118pd.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00000OO  reason: case insensitive filesystem */
public class C6943o00000OO extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public static final Interpolator OooO00o = new DecelerateInterpolator();
    public static final int o0OOO0o = 200;
    public static final String o0ooOOo = "ScrollingTabContainerView";

    /* renamed from: OooO00o  reason: collision with other field name */
    public ViewPropertyAnimator f19096OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Spinner f19097OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LinearLayoutCompat f19098OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0OO f19099OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6945OooO0o0 f19100OooO00o = new C6945OooO0o0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f19101OooO00o;
    public boolean OooO0O0;
    public int o00oO0O;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f19102o0ooOOo;
    public int o0ooOoO;

    /* renamed from: com.pd.sdk.o00000OO$OooO00o */
    public class OooO00o implements Runnable {
        public final /* synthetic */ View OooO00o;

        public OooO00o(View view) {
            this.OooO00o = view;
        }

        public void run() {
            C6943o00000OO.this.smoothScrollTo(this.OooO00o.getLeft() - ((C6943o00000OO.this.getWidth() - this.OooO00o.getWidth()) / 2), 0);
            C6943o00000OO.this.f19101OooO00o = null;
        }
    }

    /* renamed from: com.pd.sdk.o00000OO$OooO0O0 */
    public class OooO0O0 extends BaseAdapter {
        public OooO0O0() {
        }

        public int getCount() {
            return C6943o00000OO.this.f19098OooO00o.getChildCount();
        }

        public Object getItem(int i) {
            return ((C6944OooO0Oo) C6943o00000OO.this.f19098OooO00o.getChildAt(i)).OooO00o();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C6943o00000OO.this.OooO00o((ActionBar.AbstractC4991OooO0Oo) getItem(i), true);
            }
            ((C6944OooO0Oo) view).OooO00o((ActionBar.AbstractC4991OooO0Oo) getItem(i));
            return view;
        }
    }

    /* renamed from: com.pd.sdk.o00000OO$OooO0OO */
    public class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        public void onClick(View view) {
            ((C6944OooO0Oo) view).OooO00o().m14343OooO00o();
            int childCount = C6943o00000OO.this.f19098OooO00o.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C6943o00000OO.this.f19098OooO00o.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: com.pd.sdk.o00000OO$OooO0o0  reason: case insensitive filesystem */
    public class C6945OooO0o0 extends AnimatorListenerAdapter {
        public boolean OooO0O0 = false;
        public int o00oO0O;

        public C6945OooO0o0() {
        }

        public C6945OooO0o0 OooO00o(ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.o00oO0O = i;
            C6943o00000OO.this.f19096OooO00o = viewPropertyAnimator;
            return this;
        }

        public void onAnimationCancel(Animator animator) {
            this.OooO0O0 = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.OooO0O0) {
                C6943o00000OO o00000oo = C6943o00000OO.this;
                o00000oo.f19096OooO00o = null;
                o00000oo.setVisibility(this.o00oO0O);
            }
        }

        public void onAnimationStart(Animator animator) {
            C6943o00000OO.this.setVisibility(0);
            this.OooO0O0 = false;
        }
    }

    public C6943o00000OO(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        C5949OooOOoo OooO00o2 = C5949OooOOoo.OooO00o(context);
        setContentHeight(OooO00o2.OooO0Oo());
        this.o0ooOO0 = OooO00o2.OooO0OO();
        LinearLayoutCompat OooO00o3 = m18114OooO00o();
        this.f19098OooO00o = OooO00o3;
        addView(OooO00o3, new ViewGroup.LayoutParams(-2, -1));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m18115OooO00o() {
        Spinner spinner = this.f19097OooO00o;
        return spinner != null && spinner.getParent() == this;
    }

    private void OooO0O0() {
        if (!m18115OooO00o()) {
            if (this.f19097OooO00o == null) {
                this.f19097OooO00o = OooO00o();
            }
            removeView(this.f19098OooO00o);
            addView(this.f19097OooO00o, new ViewGroup.LayoutParams(-2, -1));
            if (this.f19097OooO00o.getAdapter() == null) {
                this.f19097OooO00o.setAdapter((SpinnerAdapter) new OooO0O0());
            }
            Runnable runnable = this.f19101OooO00o;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f19101OooO00o = null;
            }
            this.f19097OooO00o.setSelection(this.o0ooOoO);
        }
    }

    public void OooO0OO(int i) {
        this.f19098OooO00o.removeViewAt(i);
        Spinner spinner = this.f19097OooO00o;
        if (spinner != null) {
            ((OooO0O0) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.OooO0O0) {
            requestLayout();
        }
    }

    public void OooO0Oo(int i) {
        ((C6944OooO0Oo) this.f19098OooO00o.getChildAt(i)).m18119OooO00o();
        Spinner spinner = this.f19097OooO00o;
        if (spinner != null) {
            ((OooO0O0) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.OooO0O0) {
            requestLayout();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f19101OooO00o;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5949OooOOoo OooO00o2 = C5949OooOOoo.OooO00o(getContext());
        setContentHeight(OooO00o2.OooO0Oo());
        this.o0ooOO0 = OooO00o2.OooO0OO();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f19101OooO00o;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C6944OooO0Oo) view).OooO00o().m14343OooO00o();
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f19098OooO00o.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.o00oO0O = -1;
        } else {
            if (childCount > 2) {
                this.o00oO0O = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.o00oO0O = View.MeasureSpec.getSize(i) / 2;
            }
            this.o00oO0O = Math.min(this.o00oO0O, this.o0ooOO0);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f19102o0ooOOo, 1073741824);
        if (z2 || !this.OooO0O0) {
            z = false;
        }
        if (z) {
            this.f19098OooO00o.measure(0, makeMeasureSpec);
            if (this.f19098OooO00o.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                OooO0O0();
            } else {
                m18116OooO0O0();
            }
        } else {
            m18116OooO0O0();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.o0ooOoO);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.OooO0O0 = z;
    }

    public void setContentHeight(int i) {
        this.f19102o0ooOOo = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.o0ooOoO = i;
        int childCount = this.f19098OooO00o.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f19098OooO00o.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                OooO00o(i);
            }
            i2++;
        }
        Spinner spinner = this.f19097OooO00o;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    /* renamed from: com.pd.sdk.o00000OO$OooO0Oo  reason: case insensitive filesystem */
    public class C6944OooO0Oo extends LinearLayout {
        public View OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ImageView f19104OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public TextView f19105OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ActionBar.AbstractC4991OooO0Oo f19106OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final int[] f19108OooO00o;

        public C6944OooO0Oo(Context context, ActionBar.AbstractC4991OooO0Oo oooO0Oo, boolean z) {
            super(context, null, C0033R.attr.actionBarTabStyle);
            int[] iArr = {16842964};
            this.f19108OooO00o = iArr;
            this.f19106OooO00o = oooO0Oo;
            C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(context, null, iArr, C0033R.attr.actionBarTabStyle, 0);
            if (OooO00o2.m18168OooO00o(0)) {
                setBackgroundDrawable(OooO00o2.m18162OooO00o(0));
            }
            OooO00o2.m18167OooO00o();
            if (z) {
                setGravity(8388627);
            }
            m18119OooO00o();
        }

        public void OooO00o(ActionBar.AbstractC4991OooO0Oo oooO0Oo) {
            this.f19106OooO00o = oooO0Oo;
            m18119OooO00o();
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.AbstractC4991OooO0Oo.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.AbstractC4991OooO0Oo.class.getName());
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (C6943o00000OO.this.o00oO0O > 0 && getMeasuredWidth() > (i3 = C6943o00000OO.this.o00oO0O)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18119OooO00o() {
            ActionBar.AbstractC4991OooO0Oo oooO0Oo = this.f19106OooO00o;
            View OooO00o2 = oooO0Oo.m14340OooO00o();
            CharSequence charSequence = null;
            if (OooO00o2 != null) {
                ViewParent parent = OooO00o2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(OooO00o2);
                    }
                    addView(OooO00o2);
                }
                this.OooO00o = OooO00o2;
                TextView textView = this.f19105OooO00o;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f19104OooO00o;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f19104OooO00o.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.OooO00o;
            if (view != null) {
                removeView(view);
                this.OooO00o = null;
            }
            Drawable OooO00o3 = oooO0Oo.m14339OooO00o();
            CharSequence OooO0O0 = oooO0Oo.OooO0O0();
            if (OooO00o3 != null) {
                if (this.f19104OooO00o == null) {
                    C8888ooOO oooo = new C8888ooOO(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oooo.setLayoutParams(layoutParams);
                    addView(oooo, 0);
                    this.f19104OooO00o = oooo;
                }
                this.f19104OooO00o.setImageDrawable(OooO00o3);
                this.f19104OooO00o.setVisibility(0);
            } else {
                ImageView imageView2 = this.f19104OooO00o;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f19104OooO00o.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(OooO0O0);
            if (z) {
                if (this.f19105OooO00o == null) {
                    C7724o0ooOOo o0ooooo = new C7724o0ooOOo(getContext(), null, C0033R.attr.actionBarTabTextStyle);
                    o0ooooo.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    o0ooooo.setLayoutParams(layoutParams2);
                    addView(o0ooooo);
                    this.f19105OooO00o = o0ooooo;
                }
                this.f19105OooO00o.setText(OooO0O0);
                this.f19105OooO00o.setVisibility(0);
            } else {
                TextView textView2 = this.f19105OooO00o;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f19105OooO00o.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f19104OooO00o;
            if (imageView3 != null) {
                imageView3.setContentDescription(oooO0Oo.m14341OooO00o());
            }
            if (!z) {
                charSequence = oooO0Oo.m14341OooO00o();
            }
            C6953o0000O0O.OooO00o(this, charSequence);
        }

        public ActionBar.AbstractC4991OooO0Oo OooO00o() {
            return this.f19106OooO00o;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private LinearLayoutCompat m18114OooO00o() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, C0033R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.OooO00o(-2, -1));
        return linearLayoutCompat;
    }

    private Spinner OooO00o() {
        C7190o00oO0O o00oo0o = new C7190o00oO0O(getContext(), null, C0033R.attr.actionDropDownStyle);
        o00oo0o.setLayoutParams(new LinearLayoutCompat.OooO00o(-2, -1));
        o00oo0o.setOnItemSelectedListener(this);
        return o00oo0o;
    }

    public void OooO00o(int i) {
        View childAt = this.f19098OooO00o.getChildAt(i);
        Runnable runnable = this.f19101OooO00o;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        OooO00o oooO00o = new OooO00o(childAt);
        this.f19101OooO00o = oooO00o;
        post(oooO00o);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private boolean m18116OooO0O0() {
        if (!m18115OooO00o()) {
            return false;
        }
        removeView(this.f19097OooO00o);
        addView(this.f19098OooO00o, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f19097OooO00o.getSelectedItemPosition());
        return false;
    }

    public C6944OooO0Oo OooO00o(ActionBar.AbstractC4991OooO0Oo oooO0Oo, boolean z) {
        C6944OooO0Oo oooO0Oo2 = new C6944OooO0Oo(getContext(), oooO0Oo, z);
        if (z) {
            oooO0Oo2.setBackgroundDrawable(null);
            oooO0Oo2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f19102o0ooOOo));
        } else {
            oooO0Oo2.setFocusable(true);
            if (this.f19099OooO00o == null) {
                this.f19099OooO00o = new OooO0OO();
            }
            oooO0Oo2.setOnClickListener(this.f19099OooO00o);
        }
        return oooO0Oo2;
    }

    public void OooO0O0(int i) {
        ViewPropertyAnimator viewPropertyAnimator = this.f19096OooO00o;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ViewPropertyAnimator alpha = animate().alpha(1.0f);
            alpha.setDuration(200);
            alpha.setInterpolator(OooO00o);
            alpha.setListener(this.f19100OooO00o.OooO00o(alpha, i));
            alpha.start();
            return;
        }
        ViewPropertyAnimator alpha2 = animate().alpha(0.0f);
        alpha2.setDuration(200);
        alpha2.setInterpolator(OooO00o);
        alpha2.setListener(this.f19100OooO00o.OooO00o(alpha2, i));
        alpha2.start();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18118OooO00o(ActionBar.AbstractC4991OooO0Oo oooO0Oo, boolean z) {
        C6944OooO0Oo OooO00o2 = OooO00o(oooO0Oo, false);
        this.f19098OooO00o.addView(OooO00o2, new LinearLayoutCompat.OooO00o(0, -1, 1.0f));
        Spinner spinner = this.f19097OooO00o;
        if (spinner != null) {
            ((OooO0O0) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            OooO00o2.setSelected(true);
        }
        if (this.OooO0O0) {
            requestLayout();
        }
    }

    public void OooO00o(ActionBar.AbstractC4991OooO0Oo oooO0Oo, int i, boolean z) {
        C6944OooO0Oo OooO00o2 = OooO00o(oooO0Oo, false);
        this.f19098OooO00o.addView(OooO00o2, i, new LinearLayoutCompat.OooO00o(0, -1, 1.0f));
        Spinner spinner = this.f19097OooO00o;
        if (spinner != null) {
            ((OooO0O0) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            OooO00o2.setSelected(true);
        }
        if (this.OooO0O0) {
            requestLayout();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18117OooO00o() {
        this.f19098OooO00o.removeAllViews();
        Spinner spinner = this.f19097OooO00o;
        if (spinner != null) {
            ((OooO0O0) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.OooO0O0) {
            requestLayout();
        }
    }
}
