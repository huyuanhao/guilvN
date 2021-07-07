package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.core.view.ViewCompat;
import com.p118pd.sdk.AbstractC5951OooOo00;
import com.p118pd.sdk.AbstractC5980OoooOOo;
import com.p118pd.sdk.C5965Oooo00o;
import com.p118pd.sdk.C6954o0000OO;
import com.p118pd.sdk.C6970o0000oO;
import com.p118pd.sdk.C7115o00Oo0oo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ActionBarContextView extends AbstractC5980OoooOOo {
    public static final String o0ooOOo = "ActionBarContextView";
    public View OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LinearLayout f13705OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f13706OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f13707OooO00o;
    public View OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public TextView f13708OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public CharSequence f13709OooO0O0;
    public boolean OooO0Oo;
    public int o0OOO0o;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f13710o0ooOOo;
    public int o0ooOoO;

    public class OooO00o implements View.OnClickListener {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC5951OooOo00 f13711OooO00o;

        public OooO00o(AbstractC5951OooOo00 oooOo00) {
            this.f13711OooO00o = oooOo00;
        }

        public void onClick(View view) {
            this.f13711OooO00o.m16745OooO00o();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo
    public /* bridge */ /* synthetic */ void OooO00o(int i) {
        super.OooO00o(i);
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo
    public void OooO0Oo() {
        removeAllViews();
        this.OooO0O0 = null;
        ((AbstractC5980OoooOOo) this).f17260OooO00o = null;
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo
    public boolean OooO0o() {
        ActionMenuPresenter actionMenuPresenter = ((AbstractC5980OoooOOo) this).f17259OooO00o;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.OooO0oo();
        }
        return false;
    }

    public boolean OooO0oO() {
        return this.OooO0Oo;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f13709OooO0O0;
    }

    public CharSequence getTitle() {
        return this.f13707OooO00o;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = ((AbstractC5980OoooOOo) this).f17259OooO00o;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO0OO();
            ((AbstractC5980OoooOOo) this).f17259OooO00o.OooO0Oo();
        }
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f13707OooO00o);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean OooO00o2 = C6954o0000OO.m18147OooO00o((View) this);
        int paddingRight = OooO00o2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.OooO00o;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.OooO00o.getLayoutParams();
            int i5 = OooO00o2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = OooO00o2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int OooO00o3 = AbstractC5980OoooOOo.OooO00o(paddingRight, i5, OooO00o2);
            paddingRight = AbstractC5980OoooOOo.OooO00o(OooO00o3 + OooO00o(this.OooO00o, OooO00o3, paddingTop, paddingTop2, OooO00o2), i6, OooO00o2);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f13705OooO00o;
        if (!(linearLayout == null || this.OooO0O0 != null || linearLayout.getVisibility() == 8)) {
            i7 += OooO00o(this.f13705OooO00o, i7, paddingTop, paddingTop2, OooO00o2);
        }
        View view2 = this.OooO0O0;
        if (view2 != null) {
            OooO00o(view2, i7, paddingTop, paddingTop2, OooO00o2);
        }
        int paddingLeft = OooO00o2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = ((AbstractC5980OoooOOo) this).f17260OooO00o;
        if (actionMenuView != null) {
            OooO00o(actionMenuView, paddingLeft, paddingTop, paddingTop2, !OooO00o2);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.o00oO0O;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.OooO00o;
            if (view != null) {
                int OooO00o2 = OooO00o(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.OooO00o.getLayoutParams();
                paddingLeft = OooO00o2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = ((AbstractC5980OoooOOo) this).f17260OooO00o;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = OooO00o(((AbstractC5980OoooOOo) this).f17260OooO00o, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f13705OooO00o;
            if (linearLayout != null && this.OooO0O0 == null) {
                if (this.OooO0Oo) {
                    this.f13705OooO00o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f13705OooO00o.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f13705OooO00o.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = OooO00o(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.OooO0O0;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.OooO0O0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.o00oO0O <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo
    public void setContentHeight(int i) {
        this.o00oO0O = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.OooO0O0;
        if (view2 != null) {
            removeView(view2);
        }
        this.OooO0O0 = view;
        if (!(view == null || (linearLayout = this.f13705OooO00o) == null)) {
            removeView(linearLayout);
            this.f13705OooO00o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f13709OooO0O0 = charSequence;
        OooO0o0();
    }

    public void setTitle(CharSequence charSequence) {
        this.f13707OooO00o = charSequence;
        OooO0o0();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.OooO0Oo) {
            requestLayout();
        }
        this.OooO0Oo = z;
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0033R.attr.actionModeStyle);
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo
    private void OooO0o0() {
        if (this.f13705OooO00o == null) {
            LayoutInflater.from(getContext()).inflate(C0033R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f13705OooO00o = linearLayout;
            this.f13706OooO00o = (TextView) linearLayout.findViewById(C0033R.C0036id.action_bar_title);
            this.f13708OooO0O0 = (TextView) this.f13705OooO00o.findViewById(C0033R.C0036id.action_bar_subtitle);
            if (this.f13710o0ooOOo != 0) {
                this.f13706OooO00o.setTextAppearance(getContext(), this.f13710o0ooOOo);
            }
            if (this.o0ooOoO != 0) {
                this.f13708OooO0O0.setTextAppearance(getContext(), this.o0ooOoO);
            }
        }
        this.f13706OooO00o.setText(this.f13707OooO00o);
        this.f13708OooO0O0.setText(this.f13709OooO0O0);
        boolean z = !TextUtils.isEmpty(this.f13707OooO00o);
        boolean z2 = !TextUtils.isEmpty(this.f13709OooO0O0);
        int i = 0;
        this.f13708OooO0O0.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f13705OooO00o;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f13705OooO00o.getParent() == null) {
            addView(this.f13705OooO00o);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo, com.p118pd.sdk.AbstractC5980OoooOOo
    public boolean OooO0O0() {
        ActionMenuPresenter actionMenuPresenter = ((AbstractC5980OoooOOo) this).f17259OooO00o;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.OooO0OO();
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo
    public void OooO0OO() {
        if (this.OooO00o == null) {
            OooO0Oo();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(context, attributeSet, C0033R.styleable.OooO0o0, i, 0);
        ViewCompat.OooO00o(this, OooO00o2.m18162OooO00o(C0033R.styleable.ActionMode_background));
        this.f13710o0ooOOo = OooO00o2.OooO0oO(C0033R.styleable.ActionMode_titleTextStyle, 0);
        this.o0ooOoO = OooO00o2.OooO0oO(C0033R.styleable.ActionMode_subtitleTextStyle, 0);
        this.o00oO0O = OooO00o2.OooO0o(C0033R.styleable.ActionMode_height, 0);
        this.o0OOO0o = OooO00o2.OooO0oO(C0033R.styleable.ActionMode_closeItemLayout, C0033R.layout.abc_action_mode_close_item_material);
        OooO00o2.m18167OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo
    public /* bridge */ /* synthetic */ C7115o00Oo0oo OooO00o(int i, long j) {
        return super.OooO00o(i, j);
    }

    @Override // com.p118pd.sdk.AbstractC5980OoooOOo
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m14415OooO0Oo() {
        ActionMenuPresenter actionMenuPresenter = ((AbstractC5980OoooOOo) this).f17259OooO00o;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.OooO0o();
        }
        return false;
    }

    public void OooO00o(AbstractC5951OooOo00 oooOo00) {
        View view = this.OooO00o;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.o0OOO0o, (ViewGroup) this, false);
            this.OooO00o = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.OooO00o);
        }
        this.OooO00o.findViewById(C0033R.C0036id.action_mode_close_button).setOnClickListener(new OooO00o(oooOo00));
        C5965Oooo00o oooo00o = (C5965Oooo00o) oooOo00.OooO00o();
        ActionMenuPresenter actionMenuPresenter = ((AbstractC5980OoooOOo) this).f17259OooO00o;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO0O0();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        ((AbstractC5980OoooOOo) this).f17259OooO00o = actionMenuPresenter2;
        actionMenuPresenter2.OooO0Oo(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        oooo00o.OooO00o(((AbstractC5980OoooOOo) this).f17259OooO00o, ((AbstractC5980OoooOOo) this).OooO00o);
        ActionMenuView actionMenuView = (ActionMenuView) ((AbstractC5980OoooOOo) this).f17259OooO00o.OooO00o((ViewGroup) this);
        ((AbstractC5980OoooOOo) this).f17260OooO00o = actionMenuView;
        ViewCompat.OooO00o(actionMenuView, (Drawable) null);
        addView(((AbstractC5980OoooOOo) this).f17260OooO00o, layoutParams);
    }
}
