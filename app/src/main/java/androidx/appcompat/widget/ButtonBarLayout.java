package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ButtonBarLayout extends LinearLayout {
    public static final int o0ooOOo = 16;
    public boolean OooO0O0;
    public int o00oO0O = -1;
    public int o0ooOO0 = 0;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0033R.styleable.OooOOOo);
        this.OooO0O0 = obtainStyledAttributes.getBoolean(C0033R.styleable.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    private int OooO00o(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0033R.C0036id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public int getMinimumHeight() {
        return Math.max(this.o0ooOO0, super.getMinimumHeight());
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.OooO0O0) {
            if (size > this.o00oO0O && OooO00o()) {
                setStacked(false);
            }
            this.o00oO0O = size;
        }
        if (OooO00o() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.OooO0O0 && !OooO00o()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int OooO00o = OooO00o(0);
        if (OooO00o >= 0) {
            View childAt = getChildAt(OooO00o);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (OooO00o()) {
                int OooO00o2 = OooO00o(OooO00o + 1);
                if (OooO00o2 >= 0) {
                    paddingTop += getChildAt(OooO00o2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (ViewCompat.m14605OooOO0((View) this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.OooO0O0 != z) {
            this.OooO0O0 = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    private boolean OooO00o() {
        return getOrientation() == 1;
    }
}
