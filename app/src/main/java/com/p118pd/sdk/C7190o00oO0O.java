package com.p118pd.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.core.view.ViewCompat;

/* renamed from: com.pd.sdk.o00oO0O  reason: case insensitive filesystem */
public class C7190o00oO0O extends Spinner implements AbstractC7109o00Oo0O {
    public static final int[] ATTRS_ANDROID_SPINNERMODE = {16843505};
    public static final int MAX_ITEMS_MEASURED = 15;
    public static final int MODE_DIALOG = 0;
    public static final int MODE_DROPDOWN = 1;
    public static final int MODE_THEME = -1;
    public static final String TAG = "AppCompatSpinner";
    public final C5988Ooooo00 mBackgroundTintHelper;
    public int mDropDownWidth;
    public AbstractView$OnTouchListenerC6995o000OOo mForwardingListener;
    public OooO0OO mPopup;
    public final Context mPopupContext;
    public final boolean mPopupSet;
    public SpinnerAdapter mTempAdapter;
    public final Rect mTempRect;

    /* renamed from: com.pd.sdk.o00oO0O$OooO00o */
    public class OooO00o extends AbstractView$OnTouchListenerC6995o000OOo {
        public final /* synthetic */ OooO0OO OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(View view, OooO0OO oooO0OO) {
            super(view);
            this.OooO00o = oooO0OO;
        }

        @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
        public AbstractC5974OoooO OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo, com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18678OooO00o() {
            if (C7190o00oO0O.this.mPopup.m18109OooO0O0()) {
                return true;
            }
            C7190o00oO0O.this.mPopup.m18679OooO00o();
            return true;
        }
    }

    /* renamed from: com.pd.sdk.o00oO0O$OooO0O0 */
    public static class OooO0O0 implements ListAdapter, SpinnerAdapter {
        public ListAdapter OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public SpinnerAdapter f19663OooO00o;

        public OooO0O0(@Nullable SpinnerAdapter spinnerAdapter, @Nullable Resources.Theme theme) {
            this.f19663OooO00o = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.OooO00o = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof AbstractC6949o00000oo) {
                AbstractC6949o00000oo o00000oo = (AbstractC6949o00000oo) spinnerAdapter;
                if (o00000oo.getDropDownViewTheme() == null) {
                    o00000oo.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.OooO00o;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f19663OooO00o;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f19663OooO00o;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f19663OooO00o;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f19663OooO00o;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f19663OooO00o;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.OooO00o;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f19663OooO00o;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f19663OooO00o;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: com.pd.sdk.o00oO0O$OooO0OO */
    public class OooO0OO extends C6934o000000 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f19664OooO00o;
        public ListAdapter OooO0O0;
        public final Rect OooO0OO = new Rect();

        /* renamed from: com.pd.sdk.o00oO0O$OooO0OO$OooO00o */
        public class OooO00o implements AdapterView.OnItemClickListener {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C7190o00oO0O f19665OooO00o;

            public OooO00o(C7190o00oO0O o00oo0o) {
                this.f19665OooO00o = o00oo0o;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C7190o00oO0O.this.setSelection(i);
                if (C7190o00oO0O.this.getOnItemClickListener() != null) {
                    OooO0OO oooO0OO = OooO0OO.this;
                    C7190o00oO0O.this.performItemClick(view, i, oooO0OO.OooO0O0.getItemId(i));
                }
                OooO0OO.this.dismiss();
            }
        }

        /* renamed from: com.pd.sdk.o00oO0O$OooO0OO$OooO0O0 */
        public class OooO0O0 implements ViewTreeObserver.OnGlobalLayoutListener {
            public OooO0O0() {
            }

            public void onGlobalLayout() {
                OooO0OO oooO0OO = OooO0OO.this;
                if (!oooO0OO.OooO00o((View) C7190o00oO0O.this)) {
                    OooO0OO.this.dismiss();
                    return;
                }
                OooO0OO.this.OooO0o0();
                OooO0OO.super.m18102OooO00o();
            }
        }

        /* renamed from: com.pd.sdk.o00oO0O$OooO0OO$OooO0OO  reason: collision with other inner class name */
        public class C4954OooO0OO implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener OooO00o;

            public C4954OooO0OO(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.OooO00o = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C7190o00oO0O.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.OooO00o);
                }
            }
        }

        public OooO0OO(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            m18103OooO00o((View) C7190o00oO0O.this);
            OooO0OO(true);
            OooO0oo(0);
            OooO00o(new OooO00o(C7190o00oO0O.this));
        }

        @Override // com.p118pd.sdk.C6934o000000
        public void OooO0o0() {
            Drawable OooO00o2 = m18098OooO00o();
            int i = 0;
            if (OooO00o2 != null) {
                OooO00o2.getPadding(C7190o00oO0O.this.mTempRect);
                i = C6954o0000OO.m18147OooO00o(C7190o00oO0O.this) ? C7190o00oO0O.this.mTempRect.right : -C7190o00oO0O.this.mTempRect.left;
            } else {
                Rect rect = C7190o00oO0O.this.mTempRect;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = C7190o00oO0O.this.getPaddingLeft();
            int paddingRight = C7190o00oO0O.this.getPaddingRight();
            int width = C7190o00oO0O.this.getWidth();
            C7190o00oO0O o00oo0o = C7190o00oO0O.this;
            int i2 = o00oo0o.mDropDownWidth;
            if (i2 == -2) {
                int compatMeasureContentWidth = o00oo0o.compatMeasureContentWidth((SpinnerAdapter) this.OooO0O0, m18098OooO00o());
                int i3 = C7190o00oO0O.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C7190o00oO0O.this.mTempRect;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (compatMeasureContentWidth > i4) {
                    compatMeasureContentWidth = i4;
                }
                m18108OooO0O0(Math.max(compatMeasureContentWidth, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                m18108OooO0O0((width - paddingLeft) - paddingRight);
            } else {
                m18108OooO0O0(i2);
            }
            OooO0o0(C6954o0000OO.m18147OooO00o(C7190o00oO0O.this) ? i + ((width - paddingRight) - OooO()) : i + paddingLeft);
        }

        @Override // com.p118pd.sdk.C6934o000000
        public void OooO00o(ListAdapter listAdapter) {
            super.OooO00o(listAdapter);
            this.OooO0O0 = listAdapter;
        }

        @Override // com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO
        public CharSequence OooO00o() {
            return this.f19664OooO00o;
        }

        public void OooO00o(CharSequence charSequence) {
            this.f19664OooO00o = charSequence;
        }

        @Override // com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18679OooO00o() {
            ViewTreeObserver viewTreeObserver;
            boolean OooO0O02 = m18109OooO0O0();
            OooO0o0();
            OooO0o(2);
            super.m18102OooO00o();
            m18100OooO00o().setChoiceMode(1);
            OooO(C7190o00oO0O.this.getSelectedItemPosition());
            if (!OooO0O02 && (viewTreeObserver = C7190o00oO0O.this.getViewTreeObserver()) != null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                viewTreeObserver.addOnGlobalLayoutListener(oooO0O0);
                OooO00o(new C4954OooO0OO(oooO0O0));
            }
        }

        @Override // com.p118pd.sdk.C6934o000000, com.p118pd.sdk.C6934o000000
        public boolean OooO00o(View view) {
            return ViewCompat.m14604OooO0oo(view) && view.getGlobalVisibleRect(this.OooO0OO);
        }
    }

    public C7190o00oO0O(Context context) {
        this(context, (AttributeSet) null);
    }

    public int compatMeasureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.mTempRect);
        Rect rect = this.mTempRect;
        return i2 + rect.left + rect.right;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            ooooo00.m16826OooO00o();
        }
    }

    public int getDropDownHorizontalOffset() {
        OooO0OO oooO0OO = this.mPopup;
        if (oooO0OO != null) {
            return oooO0OO.OooO0OO();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        OooO0OO oooO0OO = this.mPopup;
        if (oooO0OO != null) {
            return oooO0OO.OooO0oo();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.mPopup != null) {
            return this.mDropDownWidth;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        OooO0OO oooO0OO = this.mPopup;
        if (oooO0OO != null) {
            return oooO0OO.m18098OooO00o();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        if (this.mPopup != null) {
            return this.mPopupContext;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public CharSequence getPrompt() {
        OooO0OO oooO0OO = this.mPopup;
        return oooO0OO != null ? oooO0OO.OooO00o() : super.getPrompt();
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            return ooooo00.m16824OooO00o();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            return ooooo00.m16825OooO00o();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO0OO oooO0OO = this.mPopup;
        if (oooO0OO != null && oooO0OO.m18109OooO0O0()) {
            this.mPopup.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mPopup != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC6995o000OOo o000ooo = this.mForwardingListener;
        if (o000ooo == null || !o000ooo.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        OooO0OO oooO0OO = this.mPopup;
        if (oooO0OO == null) {
            return super.performClick();
        }
        if (oooO0OO.m18109OooO0O0()) {
            return true;
        }
        this.mPopup.m18679OooO00o();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            ooooo00.m16827OooO00o(drawable);
        }
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            ooooo00.OooO00o(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        OooO0OO oooO0OO = this.mPopup;
        if (oooO0OO != null) {
            oooO0OO.OooO0o0(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        OooO0OO oooO0OO = this.mPopup;
        if (oooO0OO != null) {
            oooO0OO.OooOO0O(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.mPopup != null) {
            this.mDropDownWidth = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        OooO0OO oooO0OO = this.mPopup;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(@DrawableRes int i) {
        setPopupBackgroundDrawable(C5945OooOOO0.m16716OooO00o(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        OooO0OO oooO0OO = this.mPopup;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            ooooo00.OooO0O0(colorStateList);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            ooooo00.OooO00o(mode);
        }
    }

    public C7190o00oO0O(Context context, int i) {
        this(context, null, C0033R.attr.spinnerStyle, i);
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.mPopupSet) {
            this.mTempAdapter = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.mPopup != null) {
            Context context = this.mPopupContext;
            if (context == null) {
                context = getContext();
            }
            this.mPopup.OooO00o(new OooO0O0(spinnerAdapter, context.getTheme()));
        }
    }

    public C7190o00oO0O(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0033R.attr.spinnerStyle);
    }

    public C7190o00oO0O(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C7190o00oO0O(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r12 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        if (r12 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7190o00oO0O(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7190o00oO0O.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
