package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.p118pd.sdk.AbstractC5961Oooo;
import com.p118pd.sdk.AbstractC5976OoooO00;
import com.p118pd.sdk.C5965Oooo00o;
import com.p118pd.sdk.C5967Oooo0OO;
import com.p118pd.sdk.C6954o0000OO;

public class ActionMenuView extends LinearLayoutCompat implements C5965Oooo00o.OooO0O0, AbstractC5976OoooO00 {
    public static final int o0000oO = 4;
    public static final int o0000oo = 56;
    public static final String o0ooOOo = "ActionMenuView";
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ActionMenuPresenter f13741OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5010OooO0o0 f13742OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5961Oooo.OooO00o f13743OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5965Oooo00o.OooO00o f13744OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5965Oooo00o f13745OooO00o;
    public boolean OooO0Oo;
    public boolean OooO0o0;
    public int o0000;
    public int o00000oO;
    public int o00000oo;
    public int o0000O00;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OooO00o {
        boolean OooO0O0();

        boolean OooO0Oo();
    }

    public static class OooO0O0 implements AbstractC5961Oooo.OooO00o {
        @Override // com.p118pd.sdk.AbstractC5961Oooo.OooO00o
        public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo.OooO00o
        public boolean OooO00o(C5965Oooo00o oooo00o) {
            return false;
        }
    }

    public static class OooO0OO extends LinearLayoutCompat.OooO00o {
        @ViewDebug.ExportedProperty
        public boolean OooO00o;
        @ViewDebug.ExportedProperty
        public int OooO0O0;
        @ViewDebug.ExportedProperty

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f13746OooO0O0;
        @ViewDebug.ExportedProperty
        public int OooO0OO;
        @ViewDebug.ExportedProperty

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f13747OooO0OO;
        public boolean OooO0Oo;

        public OooO0OO(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public OooO0OO(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public OooO0OO(OooO0OO oooO0OO) {
            super((ViewGroup.LayoutParams) oooO0OO);
            this.OooO00o = oooO0OO.OooO00o;
        }

        public OooO0OO(int i, int i2) {
            super(i, i2);
            this.OooO00o = false;
        }

        public OooO0OO(int i, int i2, boolean z) {
            super(i, i2);
            this.OooO00o = z;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC5010OooO0o0 {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r14v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0o0(int r30, int r31) {
        /*
        // Method dump skipped, instructions count: 621
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.OooO0o0(int, int):void");
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public OooO0OO OooO0O0() {
        OooO0OO OooO00o2 = generateDefaultLayoutParams();
        OooO00o2.OooO00o = true;
        return OooO00o2;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m14429OooO0OO() {
        ActionMenuPresenter actionMenuPresenter = this.f13741OooO00o;
        return actionMenuPresenter != null && actionMenuPresenter.OooO0OO();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean OooO0Oo() {
        ActionMenuPresenter actionMenuPresenter = this.f13741OooO00o;
        return actionMenuPresenter != null && actionMenuPresenter.OooO0o0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean OooO0o() {
        return this.OooO0Oo;
    }

    public boolean OooO0oO() {
        ActionMenuPresenter actionMenuPresenter = this.f13741OooO00o;
        return actionMenuPresenter != null && actionMenuPresenter.OooO0oo();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof OooO0OO);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f13745OooO00o == null) {
            Context context = getContext();
            C5965Oooo00o oooo00o = new C5965Oooo00o(context);
            this.f13745OooO00o = oooo00o;
            oooo00o.OooO00o(new C5009OooO0Oo());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f13741OooO00o = actionMenuPresenter;
            actionMenuPresenter.OooO0Oo(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f13741OooO00o;
            AbstractC5961Oooo.OooO00o oooO00o = this.f13743OooO00o;
            if (oooO00o == null) {
                oooO00o = new OooO0O0();
            }
            actionMenuPresenter2.OooO00o(oooO00o);
            this.f13745OooO00o.OooO00o(this.f13741OooO00o, this.OooO00o);
            this.f13741OooO00o.OooO00o(this);
        }
        return this.f13745OooO00o;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        return this.f13741OooO00o.OooO00o();
    }

    public int getPopupTheme() {
        return this.o00000oO;
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f13741OooO00o;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO00o(false);
            if (this.f13741OooO00o.OooO0o()) {
                this.f13741OooO00o.OooO0OO();
                this.f13741OooO00o.OooO0oo();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO0OO();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.OooO0o0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean OooO00o2 = C6954o0000OO.m18147OooO00o((View) this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                OooO0OO oooO0OO = (OooO0OO) childAt.getLayoutParams();
                if (oooO0OO.OooO00o) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (OooO0O0(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (OooO00o2) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0OO).leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) oooO0OO).rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) oooO0OO).leftMargin) + ((ViewGroup.MarginLayoutParams) oooO0OO).rightMargin;
                    OooO0O0(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (OooO00o2) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                OooO0OO oooO0OO2 = (OooO0OO) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !oooO0OO2.OooO00o) {
                    int i17 = width - ((ViewGroup.MarginLayoutParams) oooO0OO2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) oooO0OO2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            OooO0OO oooO0OO3 = (OooO0OO) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !oooO0OO3.OooO00o) {
                int i20 = paddingLeft + ((ViewGroup.MarginLayoutParams) oooO0OO3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) oooO0OO3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int i, int i2) {
        C5965Oooo00o oooo00o;
        boolean z = this.OooO0o0;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.OooO0o0 = z2;
        if (z != z2) {
            this.o00000oo = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.OooO0o0 || (oooo00o = this.f13745OooO00o) == null || size == this.o00000oo)) {
            this.o00000oo = size;
            oooo00o.OooO0O0(true);
        }
        int childCount = getChildCount();
        if (!this.OooO0o0 || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                OooO0OO oooO0OO = (OooO0OO) getChildAt(i3).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) oooO0OO).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) oooO0OO).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        OooO0o0(i, i2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.f13741OooO00o.OooO0OO(z);
    }

    public void setOnMenuItemClickListener(AbstractC5010OooO0o0 oooO0o0) {
        this.f13742OooO00o = oooO0o0;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        this.f13741OooO00o.OooO00o(drawable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOverflowReserved(boolean z) {
        this.OooO0Oo = z;
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.o00000oO != i) {
            this.o00000oO = i;
            if (i == 0) {
                this.OooO00o = getContext();
            } else {
                this.OooO00o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f13741OooO00o = actionMenuPresenter;
        actionMenuPresenter.OooO00o(this);
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$OooO0Oo  reason: case insensitive filesystem */
    public class C5009OooO0Oo implements C5965Oooo00o.OooO00o {
        public C5009OooO0Oo() {
        }

        @Override // com.p118pd.sdk.C5965Oooo00o.OooO00o
        public boolean OooO00o(C5965Oooo00o oooo00o, MenuItem menuItem) {
            AbstractC5010OooO0o0 oooO0o0 = ActionMenuView.this.f13742OooO00o;
            return oooO0o0 != null && oooO0o0.onMenuItemClick(menuItem);
        }

        @Override // com.p118pd.sdk.C5965Oooo00o.OooO00o
        public void OooO00o(C5965Oooo00o oooo00o) {
            C5965Oooo00o.OooO00o oooO00o = ActionMenuView.this.f13744OooO00o;
            if (oooO00o != null) {
                oooO00o.OooO00o(oooo00o);
            }
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.o0000 = (int) (56.0f * f);
        this.o0000O00 = (int) (f * 4.0f);
        this.OooO00o = context;
        this.o00000oO = 0;
    }

    public void OooO0OO() {
        ActionMenuPresenter actionMenuPresenter = this.f13741OooO00o;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO0O0();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean OooO0O0(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof OooO00o)) {
            z = false | ((OooO00o) childAt).OooO0Oo();
        }
        return (i <= 0 || !(childAt2 instanceof OooO00o)) ? z : z | ((OooO00o) childAt2).OooO0O0();
    }

    public static int OooO00o(View view, int i, int i2, int i3, int i4) {
        OooO0OO oooO0OO = (OooO0OO) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.OooO0o0();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (oooO0OO.OooO00o || !z2) {
            z = false;
        }
        oooO0OO.f13746OooO0O0 = z;
        oooO0OO.OooO0O0 = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: OooO00o */
    public OooO0OO generateDefaultLayoutParams() {
        OooO0OO oooO0OO = new OooO0OO(-2, -2);
        ((LinearLayoutCompat.OooO00o) oooO0OO).f13766OooO00o = 16;
        return oooO0OO;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: OooO00o */
    public OooO0OO generateLayoutParams(AttributeSet attributeSet) {
        return new OooO0OO(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: OooO00o */
    public OooO0OO generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        OooO0OO oooO0OO = layoutParams instanceof OooO0OO ? new OooO0OO((OooO0OO) layoutParams) : new OooO0OO(layoutParams);
        if (((LinearLayoutCompat.OooO00o) oooO0OO).f13766OooO00o <= 0) {
            ((LinearLayoutCompat.OooO00o) oooO0OO).f13766OooO00o = 16;
        }
        return oooO0OO;
    }

    @Override // com.p118pd.sdk.C5965Oooo00o.OooO0O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean OooO00o(C5967Oooo0OO oooo0OO) {
        return this.f13745OooO00o.OooO00o(oooo0OO, 0);
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(C5965Oooo00o oooo00o) {
        this.f13745OooO00o = oooo00o;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(AbstractC5961Oooo.OooO00o oooO00o, C5965Oooo00o.OooO00o oooO00o2) {
        this.f13743OooO00o = oooO00o;
        this.f13744OooO00o = oooO00o2;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, androidx.appcompat.widget.LinearLayoutCompat
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5965Oooo00o m14428OooO00o() {
        return this.f13745OooO00o;
    }

    public boolean OooO0o0() {
        ActionMenuPresenter actionMenuPresenter = this.f13741OooO00o;
        return actionMenuPresenter != null && actionMenuPresenter.OooO0o();
    }
}
