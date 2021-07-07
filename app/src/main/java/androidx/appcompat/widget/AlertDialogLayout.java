package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(@Nullable Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    private boolean OooO00o(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == C0033R.C0036id.topPanel) {
                    view = childAt;
                } else if (id == C0033R.C0036id.buttonPanel) {
                    view2 = childAt;
                } else if ((id != C0033R.C0036id.contentPanel && id != C0033R.C0036id.customPanel) || view3 != null) {
                    return false;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i5 = OooO0OO(view2);
            i4 = view2.getMeasuredHeight() - i5;
            paddingTop += i5;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                i7 = 0;
            } else {
                i7 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
            }
            view3.measure(i, i7);
            i6 = view3.getMeasuredHeight();
            paddingTop += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i9 = size - paddingTop;
        if (view2 != null) {
            int i10 = paddingTop - i5;
            int min = Math.min(i9, i4);
            if (min > 0) {
                i9 -= min;
                i5 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            paddingTop = i10 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i9 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i6 + i9, mode));
            paddingTop = (paddingTop - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                i11 = Math.max(i11, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i11 + getPaddingLeft() + getPaddingRight(), i, i3), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        OooO0o0(childCount, i2);
        return true;
    }

    private void OooO0O0(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public static int OooO0OO(View view) {
        int OooOO0 = ViewCompat.m14605OooOO0(view);
        if (OooOO0 > 0) {
            return OooOO0;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return OooO0OO(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private void OooO0o0(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.OooO00o oooO00o = (LinearLayoutCompat.OooO00o) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) oooO00o).width == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) oooO00o).height;
                    ((ViewGroup.MarginLayoutParams) oooO00o).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) oooO00o).height = i4;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int i, int i2) {
        if (!OooO00o(i, i2)) {
            super.onMeasure(i, i2);
        }
    }

    public AlertDialogLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
