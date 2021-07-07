package com.qiyukf.unicorn.widget.flowlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class FlowLayout extends ViewGroup {

    /* renamed from: a */
    public List<List<View>> f6613a;

    /* renamed from: b */
    public List<Integer> f6614b;

    /* renamed from: c */
    public List<Integer> f6615c;

    /* renamed from: d */
    public int f6616d;

    /* renamed from: e */
    public List<View> f6617e;

    public FlowLayout(Context context) {
        this(context, null);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6613a = new ArrayList();
        this.f6614b = new ArrayList();
        this.f6615c = new ArrayList();
        this.f6616d = -1;
        this.f6617e = new ArrayList();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        this.f6613a.clear();
        this.f6614b.clear();
        this.f6615c.clear();
        this.f6617e.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth + i7 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (width - getPaddingLeft()) - getPaddingRight()) {
                    this.f6614b.add(Integer.valueOf(i6));
                    this.f6613a.add(this.f6617e);
                    this.f6615c.add(Integer.valueOf(i7));
                    i6 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                    this.f6617e = new ArrayList();
                    i7 = 0;
                }
                i7 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i6 = Math.max(i6, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                this.f6617e.add(childAt);
            }
        }
        this.f6614b.add(Integer.valueOf(i6));
        this.f6615c.add(Integer.valueOf(i7));
        this.f6613a.add(this.f6617e);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f6613a.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.f6617e = this.f6613a.get(i9);
            int intValue = this.f6614b.get(i9).intValue();
            int intValue2 = this.f6615c.get(i9).intValue();
            int i10 = this.f6616d;
            if (i10 != -1) {
                if (i10 == 0) {
                    i5 = (width - intValue2) / 2;
                } else if (i10 == 1) {
                    i5 = width - intValue2;
                }
                paddingLeft = i5 + getPaddingLeft();
            } else {
                paddingLeft = getPaddingLeft();
            }
            for (int i11 = 0; i11 < this.f6617e.size(); i11++) {
                View view = this.f6617e.get(i11);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i12 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i13 = marginLayoutParams2.topMargin + paddingTop;
                    view.layout(i12, i13, view.getMeasuredWidth() + i12, view.getMeasuredHeight() + i13);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
            }
            paddingTop += intValue;
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 8) {
                if (i4 == childCount - 1) {
                    i5 = Math.max(i6, i5);
                    i8 += i7;
                }
                i3 = size2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i3 = size2;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i9 = i6 + measuredWidth;
                if (i9 > (size - getPaddingLeft()) - getPaddingRight()) {
                    i5 = Math.max(i5, i6);
                    i8 += i7;
                } else {
                    measuredHeight = Math.max(i7, measuredHeight);
                    measuredWidth = i9;
                }
                if (i4 == childCount - 1) {
                    i5 = Math.max(measuredWidth, i5);
                    i8 += measuredHeight;
                }
                i7 = measuredHeight;
                i6 = measuredWidth;
            }
            i4++;
            size2 = i3;
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + i5 + getPaddingLeft();
        }
        setMeasuredDimension(size, mode2 == 1073741824 ? size2 : i8 + getPaddingTop() + getPaddingBottom());
    }
}
