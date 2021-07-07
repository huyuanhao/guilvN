package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.C0033R;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;

/* renamed from: com.pd.sdk.OoooOOo  reason: case insensitive filesystem */
public abstract class AbstractC5980OoooOOo extends ViewGroup {
    public static final int o0ooOO0 = 200;
    public final Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ActionMenuPresenter f17259OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ActionMenuView f17260OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f17261OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7115o00Oo0oo f17262OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;
    public int o00oO0O;

    /* renamed from: com.pd.sdk.OoooOOo$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            AbstractC5980OoooOOo.this.OooO0o();
        }
    }

    public AbstractC5980OoooOOo(Context context) {
        this(context, null);
    }

    public static int OooO00o(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public boolean OooO0OO() {
        ActionMenuPresenter actionMenuPresenter = this.f17259OooO00o;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.OooO0o0();
        }
        return false;
    }

    public boolean OooO0Oo() {
        ActionMenuPresenter actionMenuPresenter = this.f17259OooO00o;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.OooO0o();
        }
        return false;
    }

    public boolean OooO0o() {
        ActionMenuPresenter actionMenuPresenter = this.f17259OooO00o;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.OooO0oo();
        }
        return false;
    }

    public boolean OooO0o0() {
        ActionMenuPresenter actionMenuPresenter = this.f17259OooO00o;
        return actionMenuPresenter != null && actionMenuPresenter.OooO0oO();
    }

    public int getAnimatedVisibility() {
        if (this.f17262OooO00o != null) {
            return this.f17261OooO00o.OooO00o;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.o00oO0O;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0033R.styleable.OooO00o, C0033R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0033R.styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f17259OooO00o;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO00o(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.OooO0OO = false;
        }
        if (!this.OooO0OO) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.OooO0OO = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.OooO0OO = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.OooO0O0 = false;
        }
        if (!this.OooO0O0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.OooO0O0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.OooO0O0 = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.o00oO0O = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C7115o00Oo0oo o00oo0oo = this.f17262OooO00o;
            if (o00oo0oo != null) {
                o00oo0oo.m18388OooO00o();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: com.pd.sdk.OoooOOo$OooO0O0 */
    public class OooO0O0 implements AbstractC7617o0oOO {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f17264OooO00o = false;

        public OooO0O0() {
        }

        public OooO0O0 OooO00o(C7115o00Oo0oo o00oo0oo, int i) {
            AbstractC5980OoooOOo.this.f17262OooO00o = o00oo0oo;
            this.OooO00o = i;
            return this;
        }

        @Override // com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO0O0(View view) {
            this.f17264OooO00o = true;
        }

        @Override // com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO0OO(View view) {
            if (!this.f17264OooO00o) {
                AbstractC5980OoooOOo ooooOOo = AbstractC5980OoooOOo.this;
                ooooOOo.f17262OooO00o = null;
                AbstractC5980OoooOOo.super.setVisibility(this.OooO00o);
            }
        }

        @Override // com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO00o(View view) {
            AbstractC5980OoooOOo.super.setVisibility(0);
            this.f17264OooO00o = false;
        }
    }

    public AbstractC5980OoooOOo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7115o00Oo0oo OooO00o(int i, long j) {
        C7115o00Oo0oo o00oo0oo = this.f17262OooO00o;
        if (o00oo0oo != null) {
            o00oo0oo.m18388OooO00o();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C7115o00Oo0oo OooO00o2 = ViewCompat.m14572OooO00o((View) this).OooO00o(1.0f);
            OooO00o2.OooO00o(j);
            OooO00o2.OooO00o(this.f17261OooO00o.OooO00o(OooO00o2, i));
            return OooO00o2;
        }
        C7115o00Oo0oo OooO00o3 = ViewCompat.m14572OooO00o((View) this).OooO00o(0.0f);
        OooO00o3.OooO00o(j);
        OooO00o3.OooO00o(this.f17261OooO00o.OooO00o(OooO00o3, i));
        return OooO00o3;
    }

    public void OooO0O0() {
        post(new OooO00o());
    }

    public AbstractC5980OoooOOo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17261OooO00o = new OooO0O0();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0033R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.OooO00o = context;
        } else {
            this.OooO00o = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16813OooO0O0() {
        ActionMenuPresenter actionMenuPresenter = this.f17259OooO00o;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.OooO0OO();
        }
        return false;
    }

    public void OooO00o(int i) {
        OooO00o(i, 200).m18389OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16812OooO00o() {
        return OooO0o0() && getVisibility() == 0;
    }

    public void OooO00o() {
        ActionMenuPresenter actionMenuPresenter = this.f17259OooO00o;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO0O0();
        }
    }

    public int OooO00o(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int OooO00o(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
