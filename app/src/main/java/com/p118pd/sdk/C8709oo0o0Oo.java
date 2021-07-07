package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.appcompat.C0033R;
import java.lang.reflect.Field;

/* renamed from: com.pd.sdk.oo0o0Oo  reason: case insensitive filesystem */
public class C8709oo0o0Oo extends ListView {
    public static final int o0OO00O = -1;
    public static final int o0Oo0oo = -1;
    public final Rect OooO00o = new Rect();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7115o00Oo0oo f21872OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7141o00Ooooo f21873OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f21874OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f21875OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Field f21876OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public int o00oO0O = 0;
    public int o0OOO0o;
    public int o0ooOO0 = 0;
    public int o0ooOOo = 0;
    public int o0ooOoO = 0;

    /* renamed from: com.pd.sdk.oo0o0Oo$OooO00o */
    public static class OooO00o extends C5946OooOOOo {
        public boolean OooO0O0 = true;

        public OooO00o(Drawable drawable) {
            super(drawable);
        }

        public void OooO00o(boolean z) {
            this.OooO0O0 = z;
        }

        @Override // com.p118pd.sdk.C5946OooOOOo
        public void draw(Canvas canvas) {
            if (this.OooO0O0) {
                super.draw(canvas);
            }
        }

        @Override // com.p118pd.sdk.C5946OooOOOo
        public void setHotspot(float f, float f2) {
            if (this.OooO0O0) {
                super.setHotspot(f, f2);
            }
        }

        @Override // com.p118pd.sdk.C5946OooOOOo
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.OooO0O0) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // com.p118pd.sdk.C5946OooOOOo
        public boolean setState(int[] iArr) {
            if (this.OooO0O0) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // com.p118pd.sdk.C5946OooOOOo
        public boolean setVisible(boolean z, boolean z2) {
            if (this.OooO0O0) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: com.pd.sdk.oo0o0Oo$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void OooO00o() {
            C8709oo0o0Oo oo0o0oo = C8709oo0o0Oo.this;
            oo0o0oo.f21875OooO00o = null;
            oo0o0oo.removeCallbacks(this);
        }

        public void OooO0O0() {
            C8709oo0o0Oo.this.post(this);
        }

        public void run() {
            C8709oo0o0Oo oo0o0oo = C8709oo0o0Oo.this;
            oo0o0oo.f21875OooO00o = null;
            oo0o0oo.drawableStateChanged();
        }
    }

    public C8709oo0o0Oo(Context context, boolean z) {
        super(context, null, C0033R.attr.dropDownListViewStyle);
        this.OooO0OO = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f21876OooO00o = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void OooO0O0() {
        Drawable selector = getSelector();
        if (selector != null && m20334OooO00o() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        OooO00o oooO00o = this.f21874OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o(z);
        }
    }

    public int OooO00o(int i, boolean z) {
        int i2;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    i2 = Math.max(0, i);
                    while (i2 < count && !adapter.isEnabled(i2)) {
                        i2++;
                    }
                } else {
                    i2 = Math.min(i, count - 1);
                    while (i2 >= 0 && !adapter.isEnabled(i2)) {
                        i2--;
                    }
                }
                if (i2 < 0 || i2 >= count) {
                    return -1;
                }
                return i2;
            } else if (i < 0 || i >= count) {
                return -1;
            } else {
                return i;
            }
        }
        return -1;
    }

    public void dispatchDraw(Canvas canvas) {
        OooO00o(canvas);
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.f21875OooO00o == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            OooO0O0();
        }
    }

    public boolean hasFocus() {
        return this.OooO0OO || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.OooO0OO || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.OooO0OO || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.OooO0OO && this.OooO0O0) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.f21875OooO00o = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f21875OooO00o == null) {
            OooO0O0 oooO0O0 = new OooO0O0();
            this.f21875OooO00o = oooO0O0;
            oooO0O0.OooO0O0();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                OooO0O0();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.o0OOO0o = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        OooO0O0 oooO0O0 = this.f21875OooO00o;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.OooO0O0 = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        OooO00o oooO00o = drawable != null ? new OooO00o(drawable) : null;
        this.f21874OooO00o = oooO00o;
        super.setSelector(oooO00o);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.o00oO0O = rect.left;
        this.o0ooOO0 = rect.top;
        this.o0ooOOo = rect.right;
        this.o0ooOoO = rect.bottom;
    }

    private void OooO0O0(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        OooO00o(i, view);
        if (z2) {
            Rect rect = this.OooO00o;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C7043o00O0000.OooO00o(selector, exactCenterX, exactCenterY);
        }
    }

    public int OooO00o(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            if (i11 > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean OooO00o(android.view.MotionEvent r8, int r9) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8709oo0o0Oo.OooO00o(android.view.MotionEvent, int):boolean");
    }

    private void OooO00o(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    private void OooO00o(Canvas canvas) {
        Drawable selector;
        if (!this.OooO00o.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.OooO00o);
            selector.draw(canvas);
        }
    }

    private void OooO00o(int i, View view, float f, float f2) {
        OooO0O0(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C7043o00O0000.OooO00o(selector, f, f2);
        }
    }

    private void OooO00o(int i, View view) {
        Rect rect = this.OooO00o;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.o00oO0O;
        rect.top -= this.o0ooOO0;
        rect.right += this.o0ooOOo;
        rect.bottom += this.o0ooOoO;
        try {
            boolean z = this.f21876OooO00o.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f21876OooO00o.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private void OooO00o() {
        this.OooO0Oo = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.o0OOO0o - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C7115o00Oo0oo o00oo0oo = this.f21872OooO00o;
        if (o00oo0oo != null) {
            o00oo0oo.m18388OooO00o();
            this.f21872OooO00o = null;
        }
    }

    private void OooO00o(View view, int i, float f, float f2) {
        View childAt;
        this.OooO0Oo = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.o0OOO0o;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.o0OOO0o = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        OooO00o(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20334OooO00o() {
        return this.OooO0Oo;
    }
}
