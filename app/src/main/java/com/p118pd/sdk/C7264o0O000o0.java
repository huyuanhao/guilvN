package com.p118pd.sdk;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.pd.sdk.o0O000o0  reason: case insensitive filesystem */
public class C7264o0O000o0 extends RecyclerView.AbstractC5067OooOO0o {
    public static final String OooO00o = "DividerItem";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f19880OooO00o = {16843284};
    public static final int OooO0O0 = 0;
    public static final int OooO0OO = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f19881OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Rect f19882OooO00o = new Rect();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f19883OooO00o;

    public C7264o0O000o0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f19880OooO00o);
        this.f19883OooO00o = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        OooO00o(i);
    }

    private void OooO0OO(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().OooO0O0(childAt, this.f19882OooO00o);
            int round = this.f19882OooO00o.right + Math.round(childAt.getTranslationX());
            this.f19883OooO00o.setBounds(round - this.f19883OooO00o.getIntrinsicWidth(), i2, round, i);
            this.f19883OooO00o.draw(canvas);
        }
        canvas.restore();
    }

    private void OooO0Oo(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.OooO00o(childAt, this.f19882OooO00o);
            int round = this.f19882OooO00o.bottom + Math.round(childAt.getTranslationY());
            this.f19883OooO00o.setBounds(i2, round - this.f19883OooO00o.getIntrinsicHeight(), i, round);
            this.f19883OooO00o.draw(canvas);
        }
        canvas.restore();
    }

    public void OooO00o(int i) {
        if (i == 0 || i == 1) {
            this.f19881OooO00o = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    public void OooO00o(@NonNull Drawable drawable) {
        if (drawable != null) {
            this.f19883OooO00o = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5067OooOO0o
    public void OooO00o(Canvas canvas, RecyclerView recyclerView, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (recyclerView.getLayoutManager() != null && this.f19883OooO00o != null) {
            if (this.f19881OooO00o == 1) {
                OooO0Oo(canvas, recyclerView);
            } else {
                OooO0OO(canvas, recyclerView);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5067OooOO0o
    public void OooO00o(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C5077OooOoO0 oooOoO0) {
        Drawable drawable = this.f19883OooO00o;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f19881OooO00o == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
