package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.core.view.ViewCompat;
import com.p118pd.sdk.C5981OoooOo0;
import com.p118pd.sdk.C6943o00000OO;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ActionBarContainer extends FrameLayout {
    public Drawable OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f13700OooO00o;
    public Drawable OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public View f13701OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f13702OooO0O0;
    public Drawable OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public View f13703OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f13704OooO0OO;
    public boolean OooO0Oo;
    public int o00oO0O;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m14414OooO00o(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.OooO00o;
        if (drawable != null && drawable.isStateful()) {
            this.OooO00o.setState(getDrawableState());
        }
        Drawable drawable2 = this.OooO0O0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.OooO0O0.setState(getDrawableState());
        }
        Drawable drawable3 = this.OooO0OO;
        if (drawable3 != null && drawable3.isStateful()) {
            this.OooO0OO.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f13700OooO00o;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.OooO0O0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.OooO0OO;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f13701OooO0O0 = findViewById(C0033R.C0036id.action_bar);
        this.f13703OooO0OO = findViewById(C0033R.C0036id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f13702OooO0O0 || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f13700OooO00o;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f13704OooO0OO) {
            Drawable drawable2 = this.OooO0OO;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.OooO00o != null) {
                if (this.f13701OooO0O0.getVisibility() == 0) {
                    this.OooO00o.setBounds(this.f13701OooO0O0.getLeft(), this.f13701OooO0O0.getTop(), this.f13701OooO0O0.getRight(), this.f13701OooO0O0.getBottom());
                } else {
                    View view2 = this.f13703OooO0OO;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.OooO00o.setBounds(0, 0, 0, 0);
                    } else {
                        this.OooO00o.setBounds(this.f13703OooO0OO.getLeft(), this.f13703OooO0OO.getTop(), this.f13703OooO0OO.getRight(), this.f13703OooO0OO.getBottom());
                    }
                }
                z3 = true;
            }
            this.OooO0Oo = z4;
            if (!z4 || (drawable = this.OooO0O0) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f13701OooO0O0 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.o00oO0O) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f13701OooO0O0 != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f13700OooO00o;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!m14414OooO00o(this.f13701OooO0O0)) {
                    i3 = OooO00o(this.f13701OooO0O0);
                } else {
                    i3 = !m14414OooO00o(this.f13703OooO0OO) ? OooO00o(this.f13703OooO0OO) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + OooO00o(this.f13700OooO00o), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.OooO00o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.OooO00o);
        }
        this.OooO00o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f13701OooO0O0;
            if (view != null) {
                this.OooO00o.setBounds(view.getLeft(), this.f13701OooO0O0.getTop(), this.f13701OooO0O0.getRight(), this.f13701OooO0O0.getBottom());
            }
        }
        boolean z = true;
        if (!this.f13704OooO0OO ? !(this.OooO00o == null && this.OooO0O0 == null) : this.OooO0OO != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.OooO0OO;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.OooO0OO);
        }
        this.OooO0OO = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f13704OooO0OO && (drawable2 = this.OooO0OO) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f13704OooO0OO ? this.OooO00o == null && this.OooO0O0 == null : this.OooO0OO == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.OooO0O0;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.OooO0O0);
        }
        this.OooO0O0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.OooO0Oo && (drawable2 = this.OooO0O0) != null) {
                drawable2.setBounds(this.f13700OooO00o.getLeft(), this.f13700OooO00o.getTop(), this.f13700OooO00o.getRight(), this.f13700OooO00o.getBottom());
            }
        }
        boolean z = true;
        if (!this.f13704OooO0OO ? !(this.OooO00o == null && this.OooO0O0 == null) : this.OooO0OO != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C6943o00000OO o00000oo) {
        View view = this.f13700OooO00o;
        if (view != null) {
            removeView(view);
        }
        this.f13700OooO00o = o00000oo;
        if (o00000oo != null) {
            addView(o00000oo);
            ViewGroup.LayoutParams layoutParams = o00000oo.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            o00000oo.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f13702OooO0O0 = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.OooO0O0;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.OooO0OO;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.OooO00o && !this.f13704OooO0OO) || (drawable == this.OooO0O0 && this.OooO0Oo) || ((drawable == this.OooO0OO && this.f13704OooO0OO) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.OooO00o(this, new C5981OoooOo0(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0033R.styleable.OooO00o);
        this.OooO00o = obtainStyledAttributes.getDrawable(C0033R.styleable.ActionBar_background);
        this.OooO0O0 = obtainStyledAttributes.getDrawable(C0033R.styleable.ActionBar_backgroundStacked);
        this.o00oO0O = obtainStyledAttributes.getDimensionPixelSize(C0033R.styleable.ActionBar_height, -1);
        boolean z = true;
        if (getId() == C0033R.C0036id.split_action_bar) {
            this.f13704OooO0OO = true;
            this.OooO0OO = obtainStyledAttributes.getDrawable(C0033R.styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f13704OooO0OO ? !(this.OooO00o == null && this.OooO0O0 == null) : this.OooO0OO != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    private int OooO00o(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }
}
