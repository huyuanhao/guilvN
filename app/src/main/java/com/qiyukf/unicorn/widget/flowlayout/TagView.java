package com.qiyukf.unicorn.widget.flowlayout;

import android.content.Context;
import android.widget.Checkable;
import android.widget.FrameLayout;

public class TagView extends FrameLayout implements Checkable {

    /* renamed from: b */
    public static final int[] f6626b = {16842912};

    /* renamed from: a */
    public boolean f6627a;

    public TagView(Context context) {
        super(context);
    }

    public boolean isChecked() {
        return this.f6627a;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f6626b);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.f6627a != z) {
            this.f6627a = z;
            refreshDrawableState();
        }
    }

    public void toggle() {
        setChecked(!this.f6627a);
    }
}
