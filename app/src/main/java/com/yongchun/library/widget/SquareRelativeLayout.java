package com.yongchun.library.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class SquareRelativeLayout extends RelativeLayout {
    public SquareRelativeLayout(Context context) {
        super(context);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    public SquareRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public SquareRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
