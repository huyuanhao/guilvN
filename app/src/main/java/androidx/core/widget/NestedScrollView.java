package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.p118pd.sdk.AbstractC7098o00OOOo;
import com.p118pd.sdk.AbstractC7102o00OOooO;
import com.p118pd.sdk.AbstractC7110o00Oo0O0;
import com.p118pd.sdk.C7087o00OO0o;
import com.p118pd.sdk.C7101o00OOoo;
import com.p118pd.sdk.C7120o00OoOO;
import com.p118pd.sdk.C7126o00OoOOo;
import com.p118pd.sdk.C7129o00OoOoO;
import com.p118pd.sdk.C7139o00OooOo;
import com.p118pd.sdk.C7522o0Ooo0o;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements AbstractC7102o00OOooO, AbstractC7098o00OOOo, AbstractC7110o00Oo0O0 {
    public static final OooO00o OooO00o = new OooO00o();
    public static final int[] OooO0OO = {16843130};
    public static final float OooO0o0 = 0.5f;
    public static final int o0O0O00 = -1;
    public static final String o0ooOOo = "NestedScrollView";
    public static final int oo0o0Oo = 250;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f14061OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Rect f14062OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public VelocityTracker f14063OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f14064OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public EdgeEffect f14065OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OverScroller f14066OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f14067OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SavedState f14068OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7101o00OOoo f14069OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7129o00OoOoO f14070OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int[] f14071OooO00o;
    public EdgeEffect OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14072OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int[] f14073OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f14074OooO0OO;
    public float OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f14075OooO0Oo;
    public boolean OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f14076OooO0o0;
    public int o00oO0O;
    public int o0OO00O;
    public int o0OOO0o;
    public int o0Oo0oo;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f14077o0ooOOo;
    public int o0ooOoO;

    public static class OooO00o extends C7087o00OO0o {
        @Override // com.p118pd.sdk.C7087o00OO0o
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C7126o00OoOOo.OooO00o(accessibilityEvent, nestedScrollView.getScrollX());
            C7126o00OoOOo.OooO0O0(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public void onInitializeAccessibilityNodeInfo(View view, C7120o00OoOO o00oooo) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, o00oooo);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            o00oooo.OooO00o((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                o00oooo.OooOOoo(true);
                if (nestedScrollView.getScrollY() > 0) {
                    o00oooo.m18416OooO00o(8192);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    o00oooo.m18416OooO00o(4096);
                }
            }
        }

        @Override // com.p118pd.sdk.C7087o00OO0o
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m14629OooO0O0(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m14629OooO0O0(0, max);
                return true;
            }
        }
    }

    public interface OooO0O0 {
        void OooO00o(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public int o00oO0O;

        public static class OooO00o implements Parcelable.Creator<SavedState> {
            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: OooO00o */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.o00oO0O + C7522o0Ooo0o.OooO0Oo;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.o00oO0O);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.o00oO0O = parcel.readInt();
        }
    }

    public NestedScrollView(@NonNull Context context) {
        this(context, null);
    }

    public static int OooO00o(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    private boolean m14624OooO0OO() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    private void OooO0Oo() {
        this.f14066OooO00o = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o0ooOO0 = viewConfiguration.getScaledTouchSlop();
        this.f14077o0ooOOo = viewConfiguration.getScaledMinimumFlingVelocity();
        this.o0ooOoO = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void OooO0o() {
        VelocityTracker velocityTracker = this.f14063OooO00o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f14063OooO00o = null;
        }
    }

    private void OooO0o0() {
        if (this.f14063OooO00o == null) {
            this.f14063OooO00o = VelocityTracker.obtain();
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.OooO0Oo == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.OooO0Oo = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14627OooO00o(int i, int i2) {
        return this.f14069OooO00o.OooO00o(i, i2);
    }

    @Override // com.p118pd.sdk.AbstractC7102o00OOooO, com.p118pd.sdk.AbstractC7102o00OOooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14628OooO00o(@NonNull View view, @NonNull View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m14630OooO0O0() {
        return this.OooO0o;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // com.p118pd.sdk.AbstractC7110o00Oo0O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // com.p118pd.sdk.AbstractC7110o00Oo0O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // com.p118pd.sdk.AbstractC7110o00Oo0O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (this.f14066OooO00o.computeScrollOffset()) {
            this.f14066OooO00o.getCurrX();
            int currY = this.f14066OooO00o.getCurrY();
            int i = currY - this.o0OO00O;
            if (OooO00o(0, i, this.f14073OooO0O0, (int[]) null, 1)) {
                i -= this.f14073OooO0O0[1];
            }
            if (i != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                OooO00o(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                if (!OooO00o(0, scrollY2, 0, i - scrollY2, (int[]) null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        OooO0O0();
                        if (currY <= 0 && scrollY > 0) {
                            this.f14065OooO00o.onAbsorb((int) this.f14066OooO00o.getCurrVelocity());
                        } else if (currY >= scrollRange && scrollY < scrollRange) {
                            this.OooO0O0.onAbsorb((int) this.f14066OooO00o.getCurrVelocity());
                        }
                    }
                }
            }
            this.o0OO00O = currY;
            ViewCompat.m14597OooO0o0((View) this);
            return;
        }
        if (m14626OooO00o(1)) {
            OooO00o(1);
        }
        this.o0OO00O = 0;
    }

    @Override // com.p118pd.sdk.AbstractC7110o00Oo0O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // com.p118pd.sdk.AbstractC7110o00Oo0O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // com.p118pd.sdk.AbstractC7110o00Oo0O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || OooO00o(keyEvent);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f14069OooO00o.OooO00o(f, f2, z);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f14069OooO00o.OooO00o(f, f2);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return OooO00o(i, i2, iArr, iArr2, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return OooO00o(i, i2, i3, i4, iArr, 0);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f14065OooO00o != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f14065OooO00o.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f14065OooO00o.setSize(width, height);
                if (this.f14065OooO00o.draw(canvas)) {
                    ViewCompat.m14597OooO0o0((View) this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.OooO0O0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.OooO0O0.setSize(width2, height2);
                if (this.OooO0O0.draw(canvas)) {
                    ViewCompat.m14597OooO0o0((View) this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public int getNestedScrollAxes() {
        return this.f14070OooO00o.OooO00o();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean hasNestedScrollingParent() {
        return m14626OooO00o(0);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean isNestedScrollingEnabled() {
        return this.f14069OooO00o.m18379OooO0O0();
    }

    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14074OooO0OO = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f14075OooO0Oo) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f14075OooO0Oo) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.o0OOO0o;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            String str = "Invalid pointerId=" + i2 + " in onInterceptTouchEvent";
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.o00oO0O) > this.o0ooOO0 && (2 & getNestedScrollAxes()) == 0) {
                                this.f14075OooO0Oo = true;
                                this.o00oO0O = y;
                                OooO0o0();
                                this.f14063OooO00o.addMovement(motionEvent);
                                this.o0Oo0oo = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        OooO00o(motionEvent);
                    }
                }
            }
            this.f14075OooO0Oo = false;
            this.o0OOO0o = -1;
            OooO0o();
            if (this.f14066OooO00o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.m14597OooO0o0((View) this);
            }
            OooO00o(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!OooO0O0((int) motionEvent.getX(), y2)) {
                this.f14075OooO0Oo = false;
                OooO0o();
            } else {
                this.o00oO0O = y2;
                this.o0OOO0o = motionEvent.getPointerId(0);
                OooO0OO();
                this.f14063OooO00o.addMovement(motionEvent);
                this.f14066OooO00o.computeScrollOffset();
                this.f14075OooO0Oo = !this.f14066OooO00o.isFinished();
                m14627OooO00o(2, 0);
            }
        }
        return this.f14075OooO0Oo;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f14072OooO0O0 = false;
        View view = this.f14064OooO00o;
        if (view != null && OooO00o(view, this)) {
            OooO00o(this.f14064OooO00o);
        }
        this.f14064OooO00o = null;
        if (!this.f14074OooO0OO) {
            if (this.f14068OooO00o != null) {
                scrollTo(getScrollX(), this.f14068OooO00o.o00oO0O);
                this.f14068OooO00o = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int OooO00o2 = OooO00o(scrollY, paddingTop, i5);
            if (OooO00o2 != scrollY) {
                scrollTo(getScrollX(), OooO00o2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f14074OooO0OO = true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f14076OooO0o0 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        OooO0Oo((int) f2);
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        OooO00o(view, i, i2, iArr, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        OooO00o(view, i, i2, i3, i4, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onNestedScrollAccepted(View view, View view2, int i) {
        OooO00o(view, view2, i, 0);
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m14623OooO00o(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f14068OooO00o = savedState;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.o00oO0O = getScrollY();
        return savedState;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OooO0O0 oooO0O0 = this.f14067OooO00o;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o(this, i, i2, i3, i4);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && OooO00o(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f14062OooO00o);
            offsetDescendantRectToMyCoords(findFocus, this.f14062OooO00o);
            OooO0OO(OooO00o(this.f14062OooO00o));
        }
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return m14628OooO00o(view, view2, i, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onStopNestedScroll(View view) {
        OooO00o(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        OooO0o0();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.o0Oo0oo = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.o0Oo0oo);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f14063OooO00o;
                velocityTracker.computeCurrentVelocity(1000, (float) this.o0ooOoO);
                int yVelocity = (int) velocityTracker.getYVelocity(this.o0OOO0o);
                if (Math.abs(yVelocity) > this.f14077o0ooOOo) {
                    OooO0Oo(-yVelocity);
                } else if (this.f14066OooO00o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.m14597OooO0o0((View) this);
                }
                this.o0OOO0o = -1;
                OooO00o();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.o0OOO0o);
                if (findPointerIndex == -1) {
                    String str = "Invalid pointerId=" + this.o0OOO0o + " in onTouchEvent";
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i = this.o00oO0O - y;
                    if (OooO00o(0, i, this.f14073OooO0O0, this.f14071OooO00o, 0)) {
                        i -= this.f14073OooO0O0[1];
                        obtain.offsetLocation(0.0f, (float) this.f14071OooO00o[1]);
                        this.o0Oo0oo += this.f14071OooO00o[1];
                    }
                    if (!this.f14075OooO0Oo && Math.abs(i) > this.o0ooOO0) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f14075OooO0Oo = true;
                        if (i > 0) {
                            i -= this.o0ooOO0;
                        } else {
                            i += this.o0ooOO0;
                        }
                    }
                    if (this.f14075OooO0Oo) {
                        this.o00oO0O = y - this.f14071OooO00o[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (OooO00o(0, i, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !m14626OooO00o(0)) {
                            this.f14063OooO00o.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (OooO00o(0, scrollY2, 0, i - scrollY2, this.f14071OooO00o, 0)) {
                            int i2 = this.o00oO0O;
                            int[] iArr = this.f14071OooO00o;
                            this.o00oO0O = i2 - iArr[1];
                            obtain.offsetLocation(0.0f, (float) iArr[1]);
                            this.o0Oo0oo += this.f14071OooO00o[1];
                        } else if (z) {
                            OooO0O0();
                            int i3 = scrollY + i;
                            if (i3 < 0) {
                                C7139o00OooOo.OooO00o(this.f14065OooO00o, ((float) i) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.OooO0O0.isFinished()) {
                                    this.OooO0O0.onRelease();
                                }
                            } else if (i3 > scrollRange) {
                                C7139o00OooOo.OooO00o(this.OooO0O0, ((float) i) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f14065OooO00o.isFinished()) {
                                    this.f14065OooO00o.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f14065OooO00o;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.OooO0O0.isFinished())) {
                                ViewCompat.m14597OooO0o0((View) this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f14075OooO0Oo && getChildCount() > 0 && this.f14066OooO00o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.m14597OooO0o0((View) this);
                }
                this.o0OOO0o = -1;
                OooO00o();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.o00oO0O = (int) motionEvent.getY(actionIndex);
                this.o0OOO0o = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                OooO00o(motionEvent);
                this.o00oO0O = (int) motionEvent.getY(motionEvent.findPointerIndex(this.o0OOO0o));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f14066OooO00o.isFinished();
            this.f14075OooO0Oo = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f14066OooO00o.isFinished()) {
                this.f14066OooO00o.abortAnimation();
            }
            this.o00oO0O = (int) motionEvent.getY();
            this.o0OOO0o = motionEvent.getPointerId(0);
            m14627OooO00o(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f14063OooO00o;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f14072OooO0O0) {
            OooO00o(view2);
        } else {
            this.f14064OooO00o = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return OooO00o(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            OooO0o();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f14072OooO0O0 = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int OooO00o2 = OooO00o(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int OooO00o3 = OooO00o(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (OooO00o2 != getScrollX() || OooO00o3 != getScrollY()) {
                super.scrollTo(OooO00o2, OooO00o3);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f14076OooO0o0) {
            this.f14076OooO0o0 = z;
            requestLayout();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public void setNestedScrollingEnabled(boolean z) {
        this.f14069OooO00o.OooO00o(z);
    }

    public void setOnScrollChangeListener(@Nullable OooO0O0 oooO0O0) {
        this.f14067OooO00o = oooO0O0;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.OooO0o = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public boolean startNestedScroll(int i) {
        return m14627OooO00o(i, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7100o00OOOoO
    public void stopNestedScroll() {
        OooO00o(0);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean OooO0O0(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo, com.p118pd.sdk.AbstractC7098o00OOOo
    public void OooO00o(int i) {
        this.f14069OooO00o.m18376OooO00o(i);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14062OooO00o = new Rect();
        this.f14072OooO0O0 = true;
        this.f14074OooO0OO = false;
        this.f14064OooO00o = null;
        this.f14075OooO0Oo = false;
        this.OooO0o = true;
        this.o0OOO0o = -1;
        this.f14071OooO00o = new int[2];
        this.f14073OooO0O0 = new int[2];
        OooO0Oo();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0OO, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f14070OooO00o = new C7129o00OoOoO(this);
        this.f14069OooO00o = new C7101o00OOoo(this);
        setNestedScrollingEnabled(true);
        ViewCompat.OooO00o(this, OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo, com.p118pd.sdk.AbstractC7098o00OOOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14626OooO00o(int i) {
        return this.f14069OooO00o.m18378OooO00o(i);
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo
    public boolean OooO00o(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f14069OooO00o.OooO00o(i, i2, i3, i4, iArr, i5);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo
    public boolean OooO00o(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f14069OooO00o.OooO00o(i, i2, iArr, iArr2, i3);
    }

    private void OooO0OO() {
        VelocityTracker velocityTracker = this.f14063OooO00o;
        if (velocityTracker == null) {
            this.f14063OooO00o = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7102o00OOooO, com.p118pd.sdk.AbstractC7102o00OOooO
    public void OooO00o(@NonNull View view, @NonNull View view2, int i, int i2) {
        this.f14070OooO00o.OooO00o(view, view2, i, i2);
        m14627OooO00o(2, i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // com.p118pd.sdk.AbstractC7102o00OOooO
    public void OooO00o(@NonNull View view, int i) {
        this.f14070OooO00o.OooO00o(view, i);
        OooO00o(i);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m14631OooO0O0(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !OooO00o(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            OooO0OO(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f14062OooO00o);
            offsetDescendantRectToMyCoords(findNextFocus, this.f14062OooO00o);
            OooO0OO(OooO00o(this.f14062OooO00o));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m14623OooO00o(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m14632OooO0OO(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f14062OooO00o;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f14062OooO00o.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f14062OooO00o;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f14062OooO00o;
        return m14622OooO00o(i, rect3.top, rect3.bottom);
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m14633OooO0Oo(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f14062OooO00o.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f14062OooO00o;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f14062OooO00o.top = getScrollY() - height;
            Rect rect2 = this.f14062OooO00o;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f14062OooO00o;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m14622OooO00o(i, i2, i3);
    }

    @Override // com.p118pd.sdk.AbstractC7102o00OOooO
    public void OooO00o(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        OooO00o(0, scrollY2, 0, i4 - scrollY2, (int[]) null, i5);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // com.p118pd.sdk.AbstractC7102o00OOooO
    public void OooO00o(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        OooO00o(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14625OooO00o() {
        return this.f14076OooO0o0;
    }

    public boolean OooO00o(@NonNull KeyEvent keyEvent) {
        this.f14062OooO00o.setEmpty();
        int i = 130;
        if (!m14624OooO0OO()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    m14633OooO0Oo(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return m14631OooO0O0(130);
                } else {
                    return m14632OooO0OO(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return m14631OooO0O0(33);
            } else {
                return m14632OooO0OO(33);
            }
        }
    }

    private void OooO0OO(int i) {
        if (i == 0) {
            return;
        }
        if (this.OooO0o) {
            OooO00o(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private void OooO0Oo(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            OooO0O0(i);
        }
    }

    private void OooO00o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.o0OOO0o) {
            int i = actionIndex == 0 ? 1 : 0;
            this.o00oO0O = (int) motionEvent.getY(i);
            this.o0OOO0o = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f14063OooO00o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final void m14629OooO0O0(int i, int i2) {
        OooO00o(i - getScrollX(), i2 - getScrollY());
    }

    public void OooO0O0(int i) {
        if (getChildCount() > 0) {
            m14627OooO00o(2, 1);
            this.f14066OooO00o.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.o0OO00O = getScrollY();
            ViewCompat.m14597OooO0o0((View) this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean OooO00o(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.OooO00o(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    private void OooO0O0() {
        if (getOverScrollMode() == 2) {
            this.f14065OooO00o = null;
            this.OooO0O0 = null;
        } else if (this.f14065OooO00o == null) {
            Context context = getContext();
            this.f14065OooO00o = new EdgeEffect(context);
            this.OooO0O0 = new EdgeEffect(context);
        }
    }

    private View OooO00o(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m14622OooO00o(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View OooO00o2 = OooO00o(z2, i2, i3);
        if (OooO00o2 == null) {
            OooO00o2 = this;
        }
        if (i2 < scrollY || i3 > i4) {
            OooO0OO(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (OooO00o2 != findFocus()) {
            OooO00o2.requestFocus(i);
        }
        return z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m14623OooO00o(View view) {
        return !OooO00o(view, 0, getHeight());
    }

    private boolean OooO00o(View view, int i, int i2) {
        view.getDrawingRect(this.f14062OooO00o);
        offsetDescendantRectToMyCoords(view, this.f14062OooO00o);
        return this.f14062OooO00o.bottom + i >= getScrollY() && this.f14062OooO00o.top - i <= getScrollY() + i2;
    }

    @Override // com.p118pd.sdk.AbstractC7098o00OOOo
    public final void OooO00o(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f14061OooO00o > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.o0OO00O = getScrollY();
                OverScroller overScroller = this.f14066OooO00o;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY);
                ViewCompat.m14597OooO0o0((View) this);
            } else {
                if (!this.f14066OooO00o.isFinished()) {
                    this.f14066OooO00o.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f14061OooO00o = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private void OooO00o(View view) {
        view.getDrawingRect(this.f14062OooO00o);
        offsetDescendantRectToMyCoords(view, this.f14062OooO00o);
        int OooO00o2 = OooO00o(this.f14062OooO00o);
        if (OooO00o2 != 0) {
            scrollBy(0, OooO00o2);
        }
    }

    private boolean OooO00o(Rect rect, boolean z) {
        int OooO00o2 = OooO00o(rect);
        boolean z2 = OooO00o2 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, OooO00o2);
            } else {
                OooO00o(0, OooO00o2);
            }
        }
        return z2;
    }

    public int OooO00o(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    public static boolean OooO00o(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !OooO00o((View) parent, view2)) {
            return false;
        }
        return true;
    }

    private void OooO00o() {
        this.f14075OooO0Oo = false;
        OooO0o();
        OooO00o(0);
        EdgeEffect edgeEffect = this.f14065OooO00o;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.OooO0O0.onRelease();
        }
    }
}
