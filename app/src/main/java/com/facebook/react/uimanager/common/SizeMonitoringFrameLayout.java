package com.facebook.react.uimanager.common;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import javax.annotation.Nullable;

public class SizeMonitoringFrameLayout extends FrameLayout {
    @Nullable
    public OnSizeChangedListener mOnSizeChangedListener;

    public interface OnSizeChangedListener {
        void onSizeChanged(int i, int i2, int i3, int i4);
    }

    public SizeMonitoringFrameLayout(Context context) {
        super(context);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        OnSizeChangedListener onSizeChangedListener = this.mOnSizeChangedListener;
        if (onSizeChangedListener != null) {
            onSizeChangedListener.onSizeChanged(i, i2, i3, i4);
        }
    }

    public void setOnSizeChangedListener(OnSizeChangedListener onSizeChangedListener) {
        this.mOnSizeChangedListener = onSizeChangedListener;
    }

    public SizeMonitoringFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SizeMonitoringFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
