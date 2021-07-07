package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import com.p118pd.sdk.C6954o0000OO;
import com.p118pd.sdk.C6970o0000oO;
import com.umeng.message.proguard.C3848l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {
    public static final int o00000 = 2;
    public static final int o000000 = 1;
    public static final int o000000O = 0;
    public static final int o000000o = 1;
    public static final int o00000O = 4;
    public static final int o00000O0 = 4;
    public static final int o00000OO = 0;
    public static final int o00000Oo = 1;
    public static final int o00000o0 = 2;
    public static final int o0000Ooo = 3;
    public static final int o000OOo = 0;
    public Drawable OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f13764OooO00o;
    public boolean OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f13765OooO0O0;
    public boolean OooO0OO;
    public float OooO0Oo;
    public int o00oO0O;
    public int o0O0O00;
    public int o0OO00O;
    public int o0OOO0o;
    public int o0Oo0oo;
    public int o0ooOO0;
    public int o0ooOOo;
    public int o0ooOoO;
    public int oo0o0Oo;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface DividerMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    private void OooO0OO(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View OooO00o2 = m14435OooO00o(i3);
            if (OooO00o2.getVisibility() != 8) {
                OooO00o oooO00o = (OooO00o) OooO00o2.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) oooO00o).height == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) oooO00o).width;
                    ((ViewGroup.MarginLayoutParams) oooO00o).width = OooO00o2.getMeasuredWidth();
                    measureChildWithMargins(OooO00o2, i2, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) oooO00o).width = i4;
                }
            }
        }
    }

    private void OooO0Oo(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View OooO00o2 = m14435OooO00o(i3);
            if (OooO00o2.getVisibility() != 8) {
                OooO00o oooO00o = (OooO00o) OooO00o2.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) oooO00o).width == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) oooO00o).height;
                    ((ViewGroup.MarginLayoutParams) oooO00o).height = OooO00o2.getMeasuredHeight();
                    measureChildWithMargins(OooO00o2, makeMeasureSpec, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) oooO00o).height = i4;
                }
            }
        }
    }

    public int OooO00o(int i) {
        return 0;
    }

    public int OooO00o(View view) {
        return 0;
    }

    public int OooO00o(View view, int i) {
        return 0;
    }

    public void OooO00o(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int virtualChildCount = getVirtualChildCount();
        boolean OooO00o2 = C6954o0000OO.m18147OooO00o((View) this);
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View OooO00o3 = m14435OooO00o(i5);
            if (!(OooO00o3 == null || OooO00o3.getVisibility() == 8 || !m14437OooO00o(i5))) {
                OooO00o oooO00o = (OooO00o) OooO00o3.getLayoutParams();
                if (OooO00o2) {
                    i4 = OooO00o3.getRight() + ((ViewGroup.MarginLayoutParams) oooO00o).rightMargin;
                } else {
                    i4 = (OooO00o3.getLeft() - ((ViewGroup.MarginLayoutParams) oooO00o).leftMargin) - this.o0Oo0oo;
                }
                OooO0O0(canvas, i4);
            }
        }
        if (m14437OooO00o(virtualChildCount)) {
            View OooO00o4 = m14435OooO00o(virtualChildCount - 1);
            if (OooO00o4 != null) {
                OooO00o oooO00o2 = (OooO00o) OooO00o4.getLayoutParams();
                if (OooO00o2) {
                    i3 = OooO00o4.getLeft() - ((ViewGroup.MarginLayoutParams) oooO00o2).leftMargin;
                    i2 = this.o0Oo0oo;
                } else {
                    i = OooO00o4.getRight() + ((ViewGroup.MarginLayoutParams) oooO00o2).rightMargin;
                    OooO0O0(canvas, i);
                }
            } else if (OooO00o2) {
                i = getPaddingLeft();
                OooO0O0(canvas, i);
            } else {
                i3 = getWidth() - getPaddingRight();
                i2 = this.o0Oo0oo;
            }
            i = i3 - i2;
            OooO0O0(canvas, i);
        }
    }

    public int OooO0O0(View view) {
        return 0;
    }

    public void OooO0O0(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View OooO00o2 = m14435OooO00o(i2);
            if (!(OooO00o2 == null || OooO00o2.getVisibility() == 8 || !m14437OooO00o(i2))) {
                OooO00o(canvas, (OooO00o2.getTop() - ((ViewGroup.MarginLayoutParams) ((OooO00o) OooO00o2.getLayoutParams())).topMargin) - this.o0OO00O);
            }
        }
        if (m14437OooO00o(virtualChildCount)) {
            View OooO00o3 = m14435OooO00o(virtualChildCount - 1);
            if (OooO00o3 == null) {
                i = (getHeight() - getPaddingBottom()) - this.o0OO00O;
            } else {
                i = OooO00o3.getBottom() + ((ViewGroup.MarginLayoutParams) ((OooO00o) OooO00o3.getLayoutParams())).bottomMargin;
            }
            OooO00o(canvas, i);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof OooO00o;
    }

    public int getBaseline() {
        int i;
        if (this.o00oO0O < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.o00oO0O;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.o0ooOO0;
                if (this.o0ooOOo == 1 && (i = this.o0ooOoO & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.o0OOO0o) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.o0OOO0o;
                    }
                }
                return i3 + ((ViewGroup.MarginLayoutParams) ((OooO00o) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.o00oO0O == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.o00oO0O;
    }

    public Drawable getDividerDrawable() {
        return this.OooO00o;
    }

    public int getDividerPadding() {
        return this.o0O0O00;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDividerWidth() {
        return this.o0Oo0oo;
    }

    public int getGravity() {
        return this.o0ooOoO;
    }

    public int getOrientation() {
        return this.o0ooOOo;
    }

    public int getShowDividers() {
        return this.oo0o0Oo;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.OooO0Oo;
    }

    public void onDraw(Canvas canvas) {
        if (this.OooO00o != null) {
            if (this.o0ooOOo == 1) {
                OooO0O0(canvas);
            } else {
                OooO00o(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.o0ooOOo == 1) {
            OooO0O0(i, i2, i3, i4);
        } else {
            OooO00o(i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.o0ooOOo == 1) {
            OooO0O0(i, i2);
        } else {
            OooO00o(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.OooO0O0 = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + C3848l.f10402t);
        }
        this.o00oO0O = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.OooO00o) {
            this.OooO00o = drawable;
            boolean z = false;
            if (drawable != null) {
                this.o0Oo0oo = drawable.getIntrinsicWidth();
                this.o0OO00O = drawable.getIntrinsicHeight();
            } else {
                this.o0Oo0oo = 0;
                this.o0OO00O = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.o0O0O00 = i;
    }

    public void setGravity(int i) {
        if (this.o0ooOoO != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.o0ooOoO = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.o0ooOoO;
        if ((8388615 & i3) != i2) {
            this.o0ooOoO = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.OooO0OO = z;
    }

    public void setOrientation(int i) {
        if (this.o0ooOOo != i) {
            this.o0ooOOo = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.oo0o0Oo) {
            requestLayout();
        }
        this.oo0o0Oo = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.o0ooOoO;
        if ((i3 & 112) != i2) {
            this.o0ooOoO = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.OooO0Oo = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OooO0O0 = true;
        this.o00oO0O = -1;
        this.o0ooOO0 = 0;
        this.o0ooOoO = 8388659;
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(context, attributeSet, C0033R.styleable.OooOoO, i, 0);
        int OooO0Oo2 = OooO00o2.OooO0Oo(C0033R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (OooO0Oo2 >= 0) {
            setOrientation(OooO0Oo2);
        }
        int OooO0Oo3 = OooO00o2.OooO0Oo(C0033R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (OooO0Oo3 >= 0) {
            setGravity(OooO0Oo3);
        }
        boolean OooO00o3 = OooO00o2.OooO00o(C0033R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!OooO00o3) {
            setBaselineAligned(OooO00o3);
        }
        this.OooO0Oo = OooO00o2.OooO0O0(C0033R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.o00oO0O = OooO00o2.OooO0Oo(C0033R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.OooO0OO = OooO00o2.OooO00o(C0033R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(OooO00o2.m18162OooO00o(C0033R.styleable.LinearLayoutCompat_divider));
        this.oo0o0Oo = OooO00o2.OooO0Oo(C0033R.styleable.LinearLayoutCompat_showDividers, 0);
        this.o0O0O00 = OooO00o2.OooO0OO(C0033R.styleable.LinearLayoutCompat_dividerPadding, 0);
        OooO00o2.m18167OooO00o();
    }

    public static class OooO00o extends ViewGroup.MarginLayoutParams {
        public float OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f13766OooO00o;

        public OooO00o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13766OooO00o = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0033R.styleable.OooOoOO);
            this.OooO00o = obtainStyledAttributes.getFloat(C0033R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f13766OooO00o = obtainStyledAttributes.getInt(C0033R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public OooO00o(int i, int i2) {
            super(i, i2);
            this.f13766OooO00o = -1;
            this.OooO00o = 0.0f;
        }

        public OooO00o(int i, int i2, float f) {
            super(i, i2);
            this.f13766OooO00o = -1;
            this.OooO00o = f;
        }

        public OooO00o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13766OooO00o = -1;
        }

        public OooO00o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f13766OooO00o = -1;
        }

        public OooO00o(OooO00o oooO00o) {
            super((ViewGroup.MarginLayoutParams) oooO00o);
            this.f13766OooO00o = -1;
            this.OooO00o = oooO00o.OooO00o;
            this.f13766OooO00o = oooO00o.f13766OooO00o;
        }
    }

    public void OooO0O0(Canvas canvas, int i) {
        this.OooO00o.setBounds(i, getPaddingTop() + this.o0O0O00, this.o0Oo0oo + i, (getHeight() - getPaddingBottom()) - this.o0O0O00);
        this.OooO00o.draw(canvas);
    }

    public void OooO00o(Canvas canvas, int i) {
        this.OooO00o.setBounds(getPaddingLeft() + this.o0O0O00, i, (getWidth() - getPaddingRight()) - this.o0O0O00, this.o0OO00O + i);
        this.OooO00o.draw(canvas);
    }

    public boolean OooO0O0() {
        return this.OooO0OO;
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x0325  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO0O0(int r34, int r35) {
        /*
        // Method dump skipped, instructions count: 913
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.OooO0O0(int, int):void");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14436OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m14435OooO00o(int i) {
        return getChildAt(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14437OooO00o(int i) {
        if (i == 0) {
            return (this.oo0o0Oo & 1) != 0;
        }
        if (i == getChildCount()) {
            if ((this.oo0o0Oo & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.oo0o0Oo & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:186:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(int r38, int r39) {
        /*
        // Method dump skipped, instructions count: 1290
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.OooO00o(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO0O0(int r18, int r19, int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.OooO0O0(int, int, int, int):void");
    }

    public void OooO00o(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(int r25, int r26, int r27, int r28) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.OooO00o(int, int, int, int):void");
    }

    private void OooO00o(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: OooO00o */
    public OooO00o generateLayoutParams(AttributeSet attributeSet) {
        return new OooO00o(getContext(), attributeSet);
    }

    /* renamed from: OooO00o */
    public OooO00o generateDefaultLayoutParams() {
        int i = this.o0ooOOo;
        if (i == 0) {
            return new OooO00o(-2, -2);
        }
        if (i == 1) {
            return new OooO00o(-1, -2);
        }
        return null;
    }

    /* renamed from: OooO00o */
    public OooO00o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new OooO00o(layoutParams);
    }
}
