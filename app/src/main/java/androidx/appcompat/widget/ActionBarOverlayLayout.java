package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.core.view.ViewCompat;
import com.p118pd.sdk.AbstractC5961Oooo;
import com.p118pd.sdk.AbstractC7103o00OOooo;
import com.p118pd.sdk.AbstractC7385o0OOO0o;
import com.p118pd.sdk.AbstractC7472o0Oo0oo;
import com.p118pd.sdk.C6954o0000OO;
import com.p118pd.sdk.C7129o00OoOoO;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ActionBarOverlayLayout extends ViewGroup implements AbstractC7385o0OOO0o, AbstractC7103o00OOooo {
    public static final int[] OooO00o = {C0033R.attr.actionBarSize, 16842841};
    public static final int o0OOO0o = 600;
    public static final String o0ooOOo = "ActionBarOverlayLayout";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AnimatorListenerAdapter f13712OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Rect f13713OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f13714OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ViewPropertyAnimator f13715OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OverScroller f13716OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ActionBarContainer f13717OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5005OooO0Oo f13718OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ContentFrameLayout f13719OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7129o00OoOoO f13720OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7472o0Oo0oo f13721OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f13722OooO00o;
    public final Rect OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Runnable f13723OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f13724OooO0O0;
    public final Rect OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f13725OooO0OO;
    public final Rect OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f13726OooO0Oo;
    public final Rect OooO0o;

    /* renamed from: OooO0o  reason: collision with other field name */
    public boolean f13727OooO0o;
    public final Rect OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f13728OooO0o0;
    public final Rect OooO0oO;
    public int o00oO0O;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f13729o0ooOOo;
    public int o0ooOoO;

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13715OooO00o = null;
            actionBarOverlayLayout.f13727OooO0o = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13715OooO00o = null;
            actionBarOverlayLayout.f13727OooO0o = false;
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            ActionBarOverlayLayout.this.OooO0OO();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13715OooO00o = actionBarOverlayLayout.f13717OooO00o.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f13712OooO00o);
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        public void run() {
            ActionBarOverlayLayout.this.OooO0OO();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13715OooO00o = actionBarOverlayLayout.f13717OooO00o.animate().translationY((float) (-ActionBarOverlayLayout.this.f13717OooO00o.getHeight())).setListener(ActionBarOverlayLayout.this.f13712OooO00o);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC5005OooO0Oo {
        void OooO00o();

        void OooO00o(int i);

        void OooO00o(boolean z);

        void OooO0O0();

        void OooO0OO();

        void OooO0Oo();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$OooO0o0  reason: case insensitive filesystem */
    public static class C5006OooO0o0 extends ViewGroup.MarginLayoutParams {
        public C5006OooO0o0(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C5006OooO0o0(int i, int i2) {
            super(i, i2);
        }

        public C5006OooO0o0(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C5006OooO0o0(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private void OooO00o(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(OooO00o);
        boolean z = false;
        this.o00oO0O = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f13714OooO00o = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f13724OooO0O0 = z;
        this.f13716OooO00o = new OverScroller(context);
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    private void OooO0o() {
        OooO0OO();
        postDelayed(this.f13723OooO0O0, 600);
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    private void OooO0o0() {
        OooO0OO();
        this.f13723OooO0O0.run();
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    private void OooO0oO() {
        OooO0OO();
        postDelayed(this.f13722OooO00o, 600);
    }

    public boolean OooO() {
        return this.f13725OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o, com.p118pd.sdk.AbstractC7385o0OOO0o
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m14418OooO0O0() {
        OooO0Oo();
        return this.f13721OooO00o.m19099OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    public void OooO0OO() {
        removeCallbacks(this.f13722OooO00o);
        removeCallbacks(this.f13723OooO0O0);
        ViewPropertyAnimator viewPropertyAnimator = this.f13715OooO00o;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    public void OooO0Oo() {
        if (this.f13719OooO00o == null) {
            this.f13719OooO00o = (ContentFrameLayout) findViewById(C0033R.C0036id.action_bar_activity_content);
            this.f13717OooO00o = (ActionBarContainer) findViewById(C0033R.C0036id.action_bar_container);
            this.f13721OooO00o = OooO00o(findViewById(C0033R.C0036id.action_bar));
        }
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public boolean m14424OooO0oo() {
        return this.f13728OooO0o0;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5006OooO0o0;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f13714OooO00o != null && !this.f13724OooO0O0) {
            int bottom = this.f13717OooO00o.getVisibility() == 0 ? (int) (((float) this.f13717OooO00o.getBottom()) + this.f13717OooO00o.getTranslationY() + 0.5f) : 0;
            this.f13714OooO00o.setBounds(0, bottom, getWidth(), this.f13714OooO00o.getIntrinsicHeight() + bottom);
            this.f13714OooO00o.draw(canvas);
        }
    }

    public boolean fitSystemWindows(Rect rect) {
        OooO0Oo();
        int OooOOo0 = ViewCompat.OooOOo0((View) this) & 256;
        boolean OooO00o2 = OooO00o(this.f13717OooO00o, rect, true, true, false, true);
        this.OooO0Oo.set(rect);
        C6954o0000OO.OooO00o(this, this.OooO0Oo, this.f13713OooO00o);
        if (!this.OooO0o0.equals(this.OooO0Oo)) {
            this.OooO0o0.set(this.OooO0Oo);
            OooO00o2 = true;
        }
        if (!this.OooO0O0.equals(this.f13713OooO00o)) {
            this.OooO0O0.set(this.f13713OooO00o);
            OooO00o2 = true;
        }
        if (OooO00o2) {
            requestLayout();
        }
        return true;
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f13717OooO00o;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public int getNestedScrollAxes() {
        return this.f13720OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    public CharSequence getTitle() {
        OooO0Oo();
        return this.f13721OooO00o.getTitle();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OooO00o(getContext());
        ViewCompat.m14594OooO0o((View) this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO0OO();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C5006OooO0o0 oooO0o0 = (C5006OooO0o0) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        OooO0Oo();
        measureChildWithMargins(this.f13717OooO00o, i, 0, i2, 0);
        C5006OooO0o0 oooO0o0 = (C5006OooO0o0) this.f13717OooO00o.getLayoutParams();
        int max = Math.max(0, this.f13717OooO00o.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o0).rightMargin);
        int max2 = Math.max(0, this.f13717OooO00o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f13717OooO00o.getMeasuredState());
        boolean z = (ViewCompat.OooOOo0(this) & 256) != 0;
        if (z) {
            i3 = this.o00oO0O;
            if (this.f13726OooO0Oo && this.f13717OooO00o.getTabContainer() != null) {
                i3 += this.o00oO0O;
            }
        } else {
            i3 = this.f13717OooO00o.getVisibility() != 8 ? this.f13717OooO00o.getMeasuredHeight() : 0;
        }
        this.OooO0OO.set(this.f13713OooO00o);
        this.OooO0o.set(this.OooO0Oo);
        if (this.f13725OooO0OO || z) {
            Rect rect = this.OooO0o;
            rect.top += i3;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.OooO0OO;
            rect2.top += i3;
            rect2.bottom += 0;
        }
        OooO00o(this.f13719OooO00o, this.OooO0OO, true, true, true, true);
        if (!this.OooO0oO.equals(this.OooO0o)) {
            this.OooO0oO.set(this.OooO0o);
            this.f13719OooO00o.OooO00o(this.OooO0o);
        }
        measureChildWithMargins(this.f13719OooO00o, i, 0, i2, 0);
        C5006OooO0o0 oooO0o02 = (C5006OooO0o0) this.f13719OooO00o.getLayoutParams();
        int max3 = Math.max(max, this.f13719OooO00o.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) oooO0o02).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o02).rightMargin);
        int max4 = Math.max(max2, this.f13719OooO00o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oooO0o02).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o02).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f13719OooO00o.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f13728OooO0o0 || !z) {
            return false;
        }
        if (OooO00o(f, f2)) {
            OooO0o0();
        } else {
            OooO0oo();
        }
        this.f13727OooO0o = true;
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f13729o0ooOOo + i2;
        this.f13729o0ooOOo = i5;
        setActionBarHideOffset(i5);
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f13720OooO00o.OooO00o(view, view2, i);
        this.f13729o0ooOOo = getActionBarHideOffset();
        OooO0OO();
        AbstractC5005OooO0Oo oooO0Oo = this.f13718OooO00o;
        if (oooO0Oo != null) {
            oooO0Oo.OooO0OO();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f13717OooO00o.getVisibility() != 0) {
            return false;
        }
        return this.f13728OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onStopNestedScroll(View view) {
        if (this.f13728OooO0o0 && !this.f13727OooO0o) {
            if (this.f13729o0ooOOo <= this.f13717OooO00o.getHeight()) {
                OooO0oO();
            } else {
                OooO0o();
            }
        }
        AbstractC5005OooO0Oo oooO0Oo = this.f13718OooO00o;
        if (oooO0Oo != null) {
            oooO0Oo.OooO0O0();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        OooO0Oo();
        int i2 = this.o0ooOoO ^ i;
        this.o0ooOoO = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        AbstractC5005OooO0Oo oooO0Oo = this.f13718OooO00o;
        if (oooO0Oo != null) {
            oooO0Oo.OooO00o(!z);
            if (z2 || !z) {
                this.f13718OooO00o.OooO00o();
            } else {
                this.f13718OooO00o.OooO0Oo();
            }
        }
        if ((i2 & 256) != 0 && this.f13718OooO00o != null) {
            ViewCompat.m14594OooO0o((View) this);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.o0ooOO0 = i;
        AbstractC5005OooO0Oo oooO0Oo = this.f13718OooO00o;
        if (oooO0Oo != null) {
            oooO0Oo.OooO00o(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        OooO0OO();
        this.f13717OooO00o.setTranslationY((float) (-Math.max(0, Math.min(i, this.f13717OooO00o.getHeight()))));
    }

    public void setActionBarVisibilityCallback(AbstractC5005OooO0Oo oooO0Oo) {
        this.f13718OooO00o = oooO0Oo;
        if (getWindowToken() != null) {
            this.f13718OooO00o.OooO00o(this.o0ooOO0);
            int i = this.o0ooOoO;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                ViewCompat.m14594OooO0o((View) this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f13726OooO0Oo = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f13728OooO0o0) {
            this.f13728OooO0o0 = z;
            if (!z) {
                OooO0OO();
                setActionBarHideOffset(0);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    public void setIcon(int i) {
        OooO0Oo();
        this.f13721OooO00o.setIcon(i);
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    public void setLogo(int i) {
        OooO0Oo();
        this.f13721OooO00o.setLogo(i);
    }

    public void setOverlayMode(boolean z) {
        this.f13725OooO0OO = z;
        this.f13724OooO0O0 = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    public void setUiOptions(int i) {
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    public void setWindowCallback(Window.Callback callback) {
        OooO0Oo();
        this.f13721OooO00o.setWindowCallback(callback);
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    public void setWindowTitle(CharSequence charSequence) {
        OooO0Oo();
        this.f13721OooO00o.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o0ooOO0 = 0;
        this.f13713OooO00o = new Rect();
        this.OooO0O0 = new Rect();
        this.OooO0OO = new Rect();
        this.OooO0Oo = new Rect();
        this.OooO0o0 = new Rect();
        this.OooO0o = new Rect();
        this.OooO0oO = new Rect();
        this.f13712OooO00o = new OooO00o();
        this.f13722OooO00o = new OooO0O0();
        this.f13723OooO0O0 = new OooO0OO();
        OooO00o(context);
        this.f13720OooO00o = new C7129o00OoOoO(this);
    }

    private void OooO0oo() {
        OooO0OO();
        this.f13722OooO00o.run();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C5006OooO0o0(layoutParams);
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    public void OooO0O0(SparseArray<Parcelable> sparseArray) {
        OooO0Oo();
        this.f13721OooO00o.OooO00o(sparseArray);
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m14421OooO0o() {
        OooO0Oo();
        return this.f13721OooO00o.OooO0o();
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m14422OooO0o0() {
        OooO0Oo();
        return this.f13721OooO00o.m19105OooO0o0();
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public boolean m14423OooO0oO() {
        OooO0Oo();
        return this.f13721OooO00o.OooO0oO();
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    public void setIcon(Drawable drawable) {
        OooO0Oo();
        this.f13721OooO00o.setIcon(drawable);
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o, com.p118pd.sdk.AbstractC7385o0OOO0o
    public void OooO0O0() {
        OooO0Oo();
        this.f13721OooO00o.m19104OooO0o0();
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m14419OooO0OO() {
        OooO0Oo();
        return this.f13721OooO00o.m19101OooO0OO();
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m14420OooO0Oo() {
        OooO0Oo();
        return this.f13721OooO00o.m19103OooO0Oo();
    }

    private boolean OooO00o(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C5006OooO0o0 oooO0o0 = (C5006OooO0o0) view.getLayoutParams();
        if (!z || ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin = i4;
            z5 = true;
        }
        if (z2 && ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin != (i3 = rect.top)) {
            ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin = i3;
            z5 = true;
        }
        if (z4 && ((ViewGroup.MarginLayoutParams) oooO0o0).rightMargin != (i2 = rect.right)) {
            ((ViewGroup.MarginLayoutParams) oooO0o0).rightMargin = i2;
            z5 = true;
        }
        if (!z3 || ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin = i;
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o, com.p118pd.sdk.AbstractC7385o0OOO0o
    /* renamed from: OooO00o */
    public C5006OooO0o0 generateDefaultLayoutParams() {
        return new C5006OooO0o0(-1, -1);
    }

    /* renamed from: OooO00o */
    public C5006OooO0o0 generateLayoutParams(AttributeSet attributeSet) {
        return new C5006OooO0o0(getContext(), attributeSet);
    }

    private AbstractC7472o0Oo0oo OooO00o(View view) {
        if (view instanceof AbstractC7472o0Oo0oo) {
            return (AbstractC7472o0Oo0oo) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private boolean OooO00o(float f, float f2) {
        this.f13716OooO00o.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f13716OooO00o.getFinalY() > this.f13717OooO00o.getHeight();
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    public void OooO00o(int i) {
        OooO0Oo();
        if (i == 2) {
            this.f13721OooO00o.m19102OooO0Oo();
        } else if (i == 5) {
            this.f13721OooO00o.m19100OooO0OO();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o, com.p118pd.sdk.AbstractC7385o0OOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14417OooO00o() {
        OooO0Oo();
        return this.f13721OooO00o.m19097OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o, com.p118pd.sdk.AbstractC7385o0OOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14416OooO00o() {
        OooO0Oo();
        this.f13721OooO00o.m19096OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    public void OooO00o(Menu menu, AbstractC5961Oooo.OooO00o oooO00o) {
        OooO0Oo();
        this.f13721OooO00o.OooO00o(menu, oooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7385o0OOO0o
    public void OooO00o(SparseArray<Parcelable> sparseArray) {
        OooO0Oo();
        this.f13721OooO00o.OooO0O0(sparseArray);
    }
}
