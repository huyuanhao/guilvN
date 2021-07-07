package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import javax.annotation.Nullable;

public class ProgressBarContainerView extends FrameLayout {
    public static final int MAX_PROGRESS = 1000;
    public boolean mAnimating = true;
    @Nullable
    public Integer mColor;
    public boolean mIndeterminate = true;
    public double mProgress;
    @Nullable
    public ProgressBar mProgressBar;

    public ProgressBarContainerView(Context context) {
        super(context);
    }

    public void apply() {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            progressBar.setIndeterminate(this.mIndeterminate);
            setColor(this.mProgressBar);
            this.mProgressBar.setProgress((int) (this.mProgress * 1000.0d));
            if (this.mAnimating) {
                this.mProgressBar.setVisibility(0);
            } else {
                this.mProgressBar.setVisibility(8);
            }
        } else {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
    }

    public void setAnimating(boolean z) {
        this.mAnimating = z;
    }

    public void setColor(@Nullable Integer num) {
        this.mColor = num;
    }

    public void setIndeterminate(boolean z) {
        this.mIndeterminate = z;
    }

    public void setProgress(double d) {
        this.mProgress = d;
    }

    public void setStyle(@Nullable String str) {
        ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.mProgressBar = createProgressBar;
        createProgressBar.setMax(1000);
        removeAllViews();
        addView(this.mProgressBar, new ViewGroup.LayoutParams(-1, -1));
    }

    private void setColor(ProgressBar progressBar) {
        Drawable drawable;
        if (progressBar.isIndeterminate()) {
            drawable = progressBar.getIndeterminateDrawable();
        } else {
            drawable = progressBar.getProgressDrawable();
        }
        if (drawable != null) {
            Integer num = this.mColor;
            if (num != null) {
                drawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawable.clearColorFilter();
            }
        }
    }
}
