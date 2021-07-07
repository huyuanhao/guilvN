package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.AbstractC0032Px;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.p118pd.sdk.C7009o000OoOo;
import com.p118pd.sdk.C7087o00OO0o;
import com.p118pd.sdk.C7120o00OoOO;
import com.p118pd.sdk.C7157o00o0O00;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    public static final int o0OO00O = -858993460;
    public static final int o0Oo0oo = 32;
    public static final String o0ooOOo = "SlidingPaneLayout";
    public static final int oo0o0Oo = 400;
    public final Rect OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f14667OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f14668OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5082OooO0o0 f14669OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7157o00o0O00 f14670OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Field f14671OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Method f14672OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ArrayList<OooO0O0> f14673OooO00o;
    public Drawable OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14674OooO0O0;
    public boolean OooO0OO;
    public float OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f14675OooO0Oo;
    public float OooO0o;

    /* renamed from: OooO0o  reason: collision with other field name */
    public boolean f14676OooO0o;
    public float OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f14677OooO0o0;
    public float OooO0oO;
    public int o00oO0O;
    public int o0OOO0o;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public final int f14678o0ooOOo;
    public int o0ooOoO;

    public class OooO00o extends C7087o00OO0o {
        public final Rect OooO00o = new Rect();

        public OooO00o() {
        }

        public boolean OooO00o(View view) {
            return SlidingPaneLayout.this.m14891OooO00o(view);
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public void onInitializeAccessibilityNodeInfo(View view, C7120o00OoOO o00oooo) {
            C7120o00OoOO OooO00o2 = C7120o00OoOO.OooO00o(o00oooo);
            super.onInitializeAccessibilityNodeInfo(view, OooO00o2);
            OooO00o(o00oooo, OooO00o2);
            OooO00o2.m18415OooO00o();
            o00oooo.OooO00o((CharSequence) SlidingPaneLayout.class.getName());
            o00oooo.OooO0o0(view);
            ViewParent OooO00o3 = ViewCompat.m14571OooO00o(view);
            if (OooO00o3 instanceof View) {
                o00oooo.OooO0Oo((View) OooO00o3);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!OooO00o(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.OooO0o(childAt, 1);
                    o00oooo.m18417OooO00o(childAt);
                }
            }
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!OooO00o(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        private void OooO00o(C7120o00OoOO o00oooo, C7120o00OoOO o00oooo2) {
            Rect rect = this.OooO00o;
            o00oooo2.OooO00o(rect);
            o00oooo.OooO0OO(rect);
            o00oooo2.OooO0O0(rect);
            o00oooo.OooO0Oo(rect);
            o00oooo.OooOo0O(o00oooo2.OooOo0O());
            o00oooo.OooO0o0(o00oooo2.m18442OooO0o0());
            o00oooo.OooO00o(o00oooo2.m18411OooO00o());
            o00oooo.OooO0O0(o00oooo2.m18428OooO0O0());
            o00oooo.OooOO0(o00oooo2.m18448OooOO0());
            o00oooo.OooO0o0(o00oooo2.m18443OooO0o0());
            o00oooo.OooOO0O(o00oooo2.OooOO0O());
            o00oooo.OooOO0o(o00oooo2.OooOO0o());
            o00oooo.OooO00o(o00oooo2.m18430OooO0O0());
            o00oooo.OooOo00(o00oooo2.OooOo00());
            o00oooo.OooOOOO(o00oooo2.OooOOOO());
            o00oooo.m18416OooO00o(o00oooo2.OooO00o());
            o00oooo.OooO0o(o00oooo2.OooO0oO());
        }
    }

    public class OooO0O0 implements Runnable {
        public final View OooO00o;

        public OooO0O0(View view) {
            this.OooO00o = view;
        }

        public void run() {
            if (this.OooO00o.getParent() == SlidingPaneLayout.this) {
                this.OooO00o.setLayerType(0, null);
                SlidingPaneLayout.this.OooO0Oo(this.OooO00o);
            }
            SlidingPaneLayout.this.f14673OooO00o.remove(this);
        }
    }

    public static class OooO0o implements AbstractC5082OooO0o0 {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.AbstractC5082OooO0o0
        public void OooO00o(View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.AbstractC5082OooO0o0
        public void OooO00o(View view, float f) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.AbstractC5082OooO0o0
        public void OooO0O0(View view) {
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC5082OooO0o0 {
        void OooO00o(@NonNull View view);

        void OooO00o(@NonNull View view, float f);

        void OooO0O0(@NonNull View view);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public boolean OooO0O0;

        public static class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: OooO00o */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.OooO0O0 ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.OooO0O0 = parcel.readInt() != 0;
        }
    }

    public SlidingPaneLayout(@NonNull Context context) {
        this(context, null);
    }

    public void OooO00o(View view) {
        AbstractC5082OooO0o0 oooO0o0 = this.f14669OooO00o;
        if (oooO0o0 != null) {
            oooO0o0.OooO00o(view);
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m14892OooO0O0(View view) {
        AbstractC5082OooO0o0 oooO0o0 = this.f14669OooO00o;
        if (oooO0o0 != null) {
            oooO0o0.OooO0O0(view);
        }
        sendAccessibilityEvent(32);
    }

    public void OooO0OO(View view) {
        AbstractC5082OooO0o0 oooO0o0 = this.f14669OooO00o;
        if (oooO0o0 != null) {
            oooO0o0.OooO00o(view, this.OooO0Oo);
        }
    }

    public boolean OooO0Oo() {
        return !this.f14674OooO0O0 || this.OooO0Oo == 1.0f;
    }

    public boolean OooO0o() {
        return OooO0O0(this.f14668OooO00o, 0);
    }

    public void OooO0o0(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        boolean z;
        View view2 = view;
        boolean OooO0OO2 = m14894OooO0OO();
        int width = OooO0OO2 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = OooO0OO2 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !OooO0O0(view)) {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount && (childAt = getChildAt(i5)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = OooO0OO2;
            } else {
                z = OooO0OO2;
                childAt.setVisibility((Math.max(OooO0OO2 ? paddingLeft : width, childAt.getLeft()) < i4 || Math.max(paddingTop, childAt.getTop()) < i2 || Math.min(OooO0OO2 ? width : paddingLeft, childAt.getRight()) > i3 || Math.min(height, childAt.getBottom()) > i) ? 0 : 4);
            }
            i5++;
            view2 = view;
            OooO0OO2 = z;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C5081OooO0Oo) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.f14670OooO00o.OooO00o(true)) {
            return;
        }
        if (!this.f14674OooO0O0) {
            this.f14670OooO00o.m18547OooO00o();
        } else {
            ViewCompat.m14597OooO0o0((View) this);
        }
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        int i2;
        super.draw(canvas);
        if (m14894OooO0OO()) {
            drawable = this.OooO0O0;
        } else {
            drawable = this.f14667OooO00o;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (m14894OooO0OO()) {
                i2 = childAt.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = childAt.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        C5081OooO0Oo oooO0Oo = (C5081OooO0Oo) view.getLayoutParams();
        int save = canvas.save();
        if (this.f14674OooO0O0 && !oooO0Oo.f14683OooO00o && this.f14668OooO00o != null) {
            canvas.getClipBounds(this.OooO00o);
            if (m14894OooO0OO()) {
                Rect rect = this.OooO00o;
                rect.left = Math.max(rect.left, this.f14668OooO00o.getRight());
            } else {
                Rect rect2 = this.OooO00o;
                rect2.right = Math.min(rect2.right, this.f14668OooO00o.getLeft());
            }
            canvas.clipRect(this.OooO00o);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C5081OooO0Oo();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C5081OooO0Oo((ViewGroup.MarginLayoutParams) layoutParams) : new C5081OooO0Oo(layoutParams);
    }

    @ColorInt
    public int getCoveredFadeColor() {
        return this.o0ooOO0;
    }

    @AbstractC0032Px
    public int getParallaxDistance() {
        return this.o0OOO0o;
    }

    @ColorInt
    public int getSliderFadeColor() {
        return this.o00oO0O;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14677OooO0o0 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14677OooO0o0 = true;
        int size = this.f14673OooO00o.size();
        for (int i = 0; i < size; i++) {
            this.f14673OooO00o.get(i).run();
        }
        this.f14673OooO00o.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f14674OooO0O0 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f14675OooO0Oo = !this.f14670OooO00o.OooO00o(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f14674OooO0O0 || (this.OooO0OO && actionMasked != 0)) {
            this.f14670OooO00o.m18554OooO0O0();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f14670OooO00o.m18554OooO0O0();
            return false;
        } else {
            if (actionMasked == 0) {
                this.OooO0OO = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.OooO0o = x;
                this.OooO0oO = y;
                if (this.f14670OooO00o.OooO00o(this.f14668OooO00o, (int) x, (int) y) && m14891OooO00o(this.f14668OooO00o)) {
                    z = true;
                    if (this.f14670OooO00o.m18552OooO00o(motionEvent) && !z) {
                        return false;
                    }
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.OooO0o);
                float abs2 = Math.abs(y2 - this.OooO0oO);
                if (abs > ((float) this.f14670OooO00o.m18556OooO0OO()) && abs2 > abs) {
                    this.f14670OooO00o.m18554OooO0O0();
                    this.OooO0OO = true;
                    return false;
                }
            }
            z = false;
            return this.f14670OooO00o.m18552OooO00o(motionEvent) ? true : true;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean OooO0OO2 = m14894OooO0OO();
        if (OooO0OO2) {
            this.f14670OooO00o.OooO0O0(2);
        } else {
            this.f14670OooO00o.OooO0O0(1);
        }
        int i9 = i3 - i;
        int paddingRight = OooO0OO2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = OooO0OO2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f14677OooO0o0) {
            this.OooO0Oo = (!this.f14674OooO0O0 || !this.f14675OooO0Oo) ? 0.0f : 1.0f;
        }
        int i10 = paddingRight;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C5081OooO0Oo oooO0Oo = (C5081OooO0Oo) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (oooO0Oo.f14683OooO00o) {
                    int i12 = i9 - paddingLeft;
                    int min = (Math.min(paddingRight, i12 - this.f14678o0ooOOo) - i10) - (((ViewGroup.MarginLayoutParams) oooO0Oo).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0Oo).rightMargin);
                    this.o0ooOoO = min;
                    int i13 = OooO0OO2 ? ((ViewGroup.MarginLayoutParams) oooO0Oo).rightMargin : ((ViewGroup.MarginLayoutParams) oooO0Oo).leftMargin;
                    oooO0Oo.OooO0O0 = ((i10 + i13) + min) + (measuredWidth / 2) > i12;
                    int i14 = (int) (((float) min) * this.OooO0Oo);
                    i10 += i13 + i14;
                    this.OooO0Oo = ((float) i14) / ((float) this.o0ooOoO);
                    i5 = 0;
                } else if (!this.f14674OooO0O0 || (i8 = this.o0OOO0o) == 0) {
                    i10 = paddingRight;
                    i5 = 0;
                } else {
                    i5 = (int) ((1.0f - this.OooO0Oo) * ((float) i8));
                    i10 = paddingRight;
                }
                if (OooO0OO2) {
                    i6 = (i9 - i10) + i5;
                    i7 = i6 - measuredWidth;
                } else {
                    i7 = i10 - i5;
                    i6 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i6, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.f14677OooO0o0) {
            if (this.f14674OooO0O0) {
                if (this.o0OOO0o != 0) {
                    OooO00o(this.OooO0Oo);
                }
                if (((C5081OooO0Oo) this.f14668OooO00o.getLayoutParams()).OooO0O0) {
                    OooO00o(this.f14668OooO00o, this.OooO0Oo, this.o00oO0O);
                }
            } else {
                for (int i15 = 0; i15 < childCount; i15++) {
                    OooO00o(getChildAt(i15), 0.0f, this.o00oO0O);
                }
            }
            OooO0o0(this.f14668OooO00o);
        }
        this.f14677OooO0o0 = false;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f;
        int i11;
        int i12;
        int i13;
        int i14;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z = false;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = 0;
        } else if (mode2 != 1073741824) {
            i4 = 0;
            i3 = 0;
        } else {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f14668OooO00o = null;
        int i15 = paddingLeft;
        int i16 = 0;
        boolean z2 = false;
        float f2 = 0.0f;
        while (true) {
            i5 = 8;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            C5081OooO0Oo oooO0Oo = (C5081OooO0Oo) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                oooO0Oo.OooO0O0 = z;
            } else {
                float f3 = oooO0Oo.f14681OooO00o;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (((ViewGroup.MarginLayoutParams) oooO0Oo).width == 0) {
                    }
                }
                int i17 = ((ViewGroup.MarginLayoutParams) oooO0Oo).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0Oo).rightMargin;
                int i18 = ((ViewGroup.MarginLayoutParams) oooO0Oo).width;
                if (i18 == -2) {
                    i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i17, Integer.MIN_VALUE);
                    f = f2;
                    i12 = Integer.MIN_VALUE;
                } else {
                    f = f2;
                    i12 = Integer.MIN_VALUE;
                    if (i18 == -1) {
                        i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i17, 1073741824);
                    } else {
                        i11 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                    }
                }
                int i19 = ((ViewGroup.MarginLayoutParams) oooO0Oo).height;
                if (i19 == -2) {
                    i13 = View.MeasureSpec.makeMeasureSpec(i3, i12);
                } else {
                    if (i19 == -1) {
                        i14 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    } else {
                        i14 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                    }
                    i13 = i14;
                }
                childAt.measure(i11, i13);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == i12 && measuredHeight > i4) {
                    i4 = Math.min(measuredHeight, i3);
                }
                i15 -= measuredWidth;
                boolean z3 = i15 < 0;
                oooO0Oo.f14683OooO00o = z3;
                z2 |= z3;
                if (z3) {
                    this.f14668OooO00o = childAt;
                }
                f2 = f;
            }
            i16++;
            z = false;
        }
        if (z2 || f2 > 0.0f) {
            int i20 = paddingLeft - this.f14678o0ooOOo;
            int i21 = 0;
            while (i21 < childCount) {
                View childAt2 = getChildAt(i21);
                if (childAt2.getVisibility() != i5) {
                    C5081OooO0Oo oooO0Oo2 = (C5081OooO0Oo) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        boolean z4 = ((ViewGroup.MarginLayoutParams) oooO0Oo2).width == 0 && oooO0Oo2.f14681OooO00o > 0.0f;
                        if (z4) {
                            i7 = 0;
                        } else {
                            i7 = childAt2.getMeasuredWidth();
                        }
                        if (!z2 || childAt2 == this.f14668OooO00o) {
                            if (oooO0Oo2.f14681OooO00o > 0.0f) {
                                if (((ViewGroup.MarginLayoutParams) oooO0Oo2).width == 0) {
                                    int i22 = ((ViewGroup.MarginLayoutParams) oooO0Oo2).height;
                                    if (i22 == -2) {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    } else if (i22 == -1) {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                    } else {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i22, 1073741824);
                                    }
                                } else {
                                    i8 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z2) {
                                    int i23 = paddingLeft - (((ViewGroup.MarginLayoutParams) oooO0Oo2).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0Oo2).rightMargin);
                                    i6 = i20;
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23, 1073741824);
                                    if (i7 != i23) {
                                        childAt2.measure(makeMeasureSpec, i8);
                                    }
                                    i21++;
                                    i20 = i6;
                                    i5 = 8;
                                } else {
                                    i6 = i20;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7 + ((int) ((oooO0Oo2.f14681OooO00o * ((float) Math.max(0, i15))) / f2)), 1073741824), i8);
                                    i21++;
                                    i20 = i6;
                                    i5 = 8;
                                }
                            }
                        } else if (((ViewGroup.MarginLayoutParams) oooO0Oo2).width < 0 && (i7 > i20 || oooO0Oo2.f14681OooO00o > 0.0f)) {
                            if (z4) {
                                int i24 = ((ViewGroup.MarginLayoutParams) oooO0Oo2).height;
                                if (i24 == -2) {
                                    i10 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    i9 = 1073741824;
                                } else if (i24 == -1) {
                                    i9 = 1073741824;
                                    i10 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i9 = 1073741824;
                                    i10 = View.MeasureSpec.makeMeasureSpec(i24, 1073741824);
                                }
                            } else {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i20, i9), i10);
                        }
                    }
                }
                i6 = i20;
                i21++;
                i20 = i6;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, i4 + getPaddingTop() + getPaddingBottom());
        this.f14674OooO0O0 = z2;
        if (this.f14670OooO00o.m18558OooO0Oo() != 0 && !z2) {
            this.f14670OooO00o.m18547OooO00o();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.OooO00o());
        if (savedState.OooO0O0) {
            OooO0o();
        } else {
            m14893OooO0O0();
        }
        this.f14675OooO0Oo = savedState.OooO0O0;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.OooO0O0 = OooO0o0() ? OooO0Oo() : this.f14675OooO0Oo;
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f14677OooO0o0 = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f14674OooO0O0) {
            return super.onTouchEvent(motionEvent);
        }
        this.f14670OooO00o.OooO00o(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.OooO0o = x;
            this.OooO0oO = y;
        } else if (actionMasked == 1 && m14891OooO00o(this.f14668OooO00o)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.OooO0o;
            float f2 = y2 - this.OooO0oO;
            int OooO0OO2 = this.f14670OooO00o.m18556OooO0OO();
            if ((f * f) + (f2 * f2) < ((float) (OooO0OO2 * OooO0OO2)) && this.f14670OooO00o.OooO00o(this.f14668OooO00o, (int) x2, (int) y2)) {
                OooO00o(this.f14668OooO00o, 0);
            }
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f14674OooO0O0) {
            this.f14675OooO0Oo = view == this.f14668OooO00o;
        }
    }

    public void setCoveredFadeColor(@ColorInt int i) {
        this.o0ooOO0 = i;
    }

    public void setPanelSlideListener(@Nullable AbstractC5082OooO0o0 oooO0o0) {
        this.f14669OooO00o = oooO0o0;
    }

    public void setParallaxDistance(@AbstractC0032Px int i) {
        this.o0OOO0o = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.f14667OooO00o = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.OooO0O0 = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C7009o000OoOo.m18256OooO00o(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C7009o000OoOo.m18256OooO00o(getContext(), i));
    }

    public void setSliderFadeColor(@ColorInt int i) {
        this.o00oO0O = i;
    }

    public class OooO0OO extends C7157o00o0O00.OooO0OO {
        public OooO0OO() {
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO, com.p118pd.sdk.C7157o00o0O00.OooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14895OooO00o(View view, int i) {
            if (SlidingPaneLayout.this.OooO0OO) {
                return false;
            }
            return ((C5081OooO0Oo) view.getLayoutParams()).f14683OooO00o;
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public int OooO0O0(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO, com.p118pd.sdk.C7157o00o0O00.OooO0OO, com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public void OooO00o(int i) {
            if (SlidingPaneLayout.this.f14670OooO00o.m18558OooO0Oo() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.OooO0Oo == 0.0f) {
                    slidingPaneLayout.OooO0o0(slidingPaneLayout.f14668OooO00o);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.OooO00o(slidingPaneLayout2.f14668OooO00o);
                    SlidingPaneLayout.this.f14675OooO0Oo = false;
                    return;
                }
                slidingPaneLayout.m14892OooO0O0(slidingPaneLayout.f14668OooO00o);
                SlidingPaneLayout.this.f14675OooO0Oo = true;
            }
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO, com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public void OooO00o(View view, int i) {
            SlidingPaneLayout.this.OooO00o();
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public void OooO00o(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.OooO00o(i);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public void OooO00o(View view, float f, float f2) {
            int i;
            C5081OooO0Oo oooO0Oo = (C5081OooO0Oo) view.getLayoutParams();
            if (SlidingPaneLayout.this.m14894OooO0OO()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) oooO0Oo).rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.OooO0Oo > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.o0ooOoO;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f14668OooO00o.getWidth();
            } else {
                i = ((ViewGroup.MarginLayoutParams) oooO0Oo).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.OooO0Oo > 0.5f)) {
                    i += SlidingPaneLayout.this.o0ooOoO;
                }
            }
            SlidingPaneLayout.this.f14670OooO00o.OooO0Oo(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public int OooO00o(View view) {
            return SlidingPaneLayout.this.o0ooOoO;
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public int OooO00o(View view, int i, int i2) {
            C5081OooO0Oo oooO0Oo = (C5081OooO0Oo) SlidingPaneLayout.this.f14668OooO00o.getLayoutParams();
            if (SlidingPaneLayout.this.m14894OooO0OO()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) oooO0Oo).rightMargin) + SlidingPaneLayout.this.f14668OooO00o.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.o0ooOoO);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0Oo).leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.o0ooOoO + paddingLeft);
        }

        @Override // com.p118pd.sdk.C7157o00o0O00.OooO0OO
        public void OooO00o(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f14670OooO00o.OooO00o(slidingPaneLayout.f14668OooO00o, i2);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$OooO0Oo  reason: case insensitive filesystem */
    public static class C5081OooO0Oo extends ViewGroup.MarginLayoutParams {
        public static final int[] OooO00o = {16843137};

        /* renamed from: OooO00o  reason: collision with other field name */
        public float f14681OooO00o = 0.0f;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Paint f14682OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14683OooO00o;
        public boolean OooO0O0;

        public C5081OooO0Oo() {
            super(-1, -1);
        }

        public C5081OooO0Oo(int i, int i2) {
            super(i, i2);
        }

        public C5081OooO0Oo(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C5081OooO0Oo(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C5081OooO0Oo(@NonNull C5081OooO0Oo oooO0Oo) {
            super((ViewGroup.MarginLayoutParams) oooO0Oo);
            this.f14681OooO00o = oooO0Oo.f14681OooO00o;
        }

        public C5081OooO0Oo(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO00o);
            this.f14681OooO00o = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void OooO0Oo(View view) {
        Field field;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            ViewCompat.OooO00o(view, ((C5081OooO0Oo) view.getLayoutParams()).f14682OooO00o);
            return;
        }
        if (i >= 16) {
            if (!this.f14676OooO0o) {
                try {
                    this.f14672OooO00o = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException unused) {
                }
                try {
                    Field declaredField = View.class.getDeclaredField("mRecreateDisplayList");
                    this.f14671OooO00o = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                this.f14676OooO0o = true;
            }
            if (this.f14672OooO00o == null || (field = this.f14671OooO00o) == null) {
                view.invalidate();
                return;
            } else {
                try {
                    field.setBoolean(view, true);
                    this.f14672OooO00o.invoke(view, null);
                } catch (Exception unused3) {
                }
            }
        }
        ViewCompat.OooO00o(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5081OooO0Oo(getContext(), attributeSet);
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o00oO0O = o0OO00O;
        this.f14677OooO0o0 = true;
        this.OooO00o = new Rect();
        this.f14673OooO00o = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f14678o0ooOOo = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        ViewCompat.OooO00o(this, new OooO00o());
        ViewCompat.OooO0o((View) this, 1);
        C7157o00o0O00 OooO00o2 = C7157o00o0O00.OooO00o(this, 0.5f, new OooO0OO());
        this.f14670OooO00o = OooO00o2;
        OooO00o2.m18548OooO00o(f * 400.0f);
    }

    @Deprecated
    public void OooO0OO() {
        OooO0o();
    }

    public static boolean OooO0O0(View view) {
        Drawable background;
        if (view.isOpaque()) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1) {
            return true;
        }
        return false;
    }

    public void OooO00o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m14894OooO0OO() {
        return ViewCompat.m14593OooO0o(this) == 1;
    }

    private boolean OooO00o(View view, int i) {
        if (!this.f14677OooO0o0 && !OooO00o(0.0f, i)) {
            return false;
        }
        this.f14675OooO0Oo = false;
        return true;
    }

    private boolean OooO0O0(View view, int i) {
        if (!this.f14677OooO0o0 && !OooO00o(1.0f, i)) {
            return false;
        }
        this.f14675OooO0Oo = true;
        return true;
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14890OooO00o() {
        return this.f14674OooO0O0;
    }

    @Deprecated
    public void OooO0O0() {
        m14893OooO0O0();
    }

    public void OooO00o(int i) {
        if (this.f14668OooO00o == null) {
            this.OooO0Oo = 0.0f;
            return;
        }
        boolean OooO0OO2 = m14894OooO0OO();
        C5081OooO0Oo oooO0Oo = (C5081OooO0Oo) this.f14668OooO00o.getLayoutParams();
        int width = this.f14668OooO00o.getWidth();
        if (OooO0OO2) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = ((float) (i - ((OooO0OO2 ? getPaddingRight() : getPaddingLeft()) + (OooO0OO2 ? ((ViewGroup.MarginLayoutParams) oooO0Oo).rightMargin : ((ViewGroup.MarginLayoutParams) oooO0Oo).leftMargin)))) / ((float) this.o0ooOoO);
        this.OooO0Oo = paddingRight;
        if (this.o0OOO0o != 0) {
            OooO00o(paddingRight);
        }
        if (oooO0Oo.OooO0O0) {
            OooO00o(this.f14668OooO00o, this.OooO0Oo, this.o00oO0O);
        }
        OooO0OO(this.f14668OooO00o);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m14893OooO0O0() {
        return OooO00o(this.f14668OooO00o, 0);
    }

    public boolean OooO0o0() {
        return this.f14674OooO0O0;
    }

    private void OooO00o(View view, float f, int i) {
        C5081OooO0Oo oooO0Oo = (C5081OooO0Oo) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
            if (oooO0Oo.f14682OooO00o == null) {
                oooO0Oo.f14682OooO00o = new Paint();
            }
            oooO0Oo.f14682OooO00o.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, oooO0Oo.f14682OooO00o);
            }
            OooO0Oo(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = oooO0Oo.f14682OooO00o;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            OooO0O0 oooO0O0 = new OooO0O0(view);
            this.f14673OooO00o.add(oooO0O0);
            ViewCompat.OooO00o(this, oooO0O0);
        }
    }

    public boolean OooO00o(float f, int i) {
        int i2;
        if (!this.f14674OooO0O0) {
            return false;
        }
        boolean OooO0OO2 = m14894OooO0OO();
        C5081OooO0Oo oooO0Oo = (C5081OooO0Oo) this.f14668OooO00o.getLayoutParams();
        if (OooO0OO2) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + ((ViewGroup.MarginLayoutParams) oooO0Oo).rightMargin)) + (f * ((float) this.o0ooOoO))) + ((float) this.f14668OooO00o.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0Oo).leftMargin)) + (f * ((float) this.o0ooOoO)));
        }
        C7157o00o0O00 o00o0o00 = this.f14670OooO00o;
        View view = this.f14668OooO00o;
        if (!o00o0o00.OooO0O0(view, i2, view.getTop())) {
            return false;
        }
        OooO00o();
        ViewCompat.m14597OooO0o0((View) this);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.m14894OooO0OO()
            android.view.View r1 = r9.f14668OooO00o
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$OooO0Oo r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.C5081OooO0Oo) r1
            boolean r2 = r1.OooO0O0
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0059
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f14668OooO00o
            if (r4 != r5) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            float r5 = r9.OooO0o0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.o0OOO0o
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.OooO0o0 = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0044
            int r5 = -r5
        L_0x0044:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0056
            float r5 = r9.OooO0o0
            if (r0 == 0) goto L_0x004f
            float r5 = r5 - r6
            goto L_0x0051
        L_0x004f:
            float r5 = r6 - r5
        L_0x0051:
            int r6 = r9.o0ooOO0
            r9.OooO00o(r4, r5, r6)
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.OooO00o(float):void");
    }

    public boolean OooO00o(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && OooO00o(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z) {
            if (view.canScrollHorizontally(m14894OooO0OO() ? i : -i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14891OooO00o(View view) {
        if (view == null) {
            return false;
        }
        C5081OooO0Oo oooO0Oo = (C5081OooO0Oo) view.getLayoutParams();
        if (!this.f14674OooO0O0 || !oooO0Oo.OooO0O0 || this.OooO0Oo <= 0.0f) {
            return false;
        }
        return true;
    }
}
