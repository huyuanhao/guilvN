package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ProgressBarShadowNode extends LayoutShadowNode implements YogaMeasureFunction {
    public final SparseIntArray mHeight = new SparseIntArray();
    public final Set<Integer> mMeasured = new HashSet();
    public String mStyle = ReactProgressBarViewManager.DEFAULT_STYLE;
    public final SparseIntArray mWidth = new SparseIntArray();

    public ProgressBarShadowNode() {
        initMeasureFunction();
    }

    private void initMeasureFunction() {
        setMeasureFunction(this);
    }

    @Nullable
    public String getStyle() {
        return this.mStyle;
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(getStyle());
        if (!this.mMeasured.contains(Integer.valueOf(styleFromString))) {
            ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getThemedContext(), styleFromString);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            this.mHeight.put(styleFromString, createProgressBar.getMeasuredHeight());
            this.mWidth.put(styleFromString, createProgressBar.getMeasuredWidth());
            this.mMeasured.add(Integer.valueOf(styleFromString));
        }
        return YogaMeasureOutput.make(this.mWidth.get(styleFromString), this.mHeight.get(styleFromString));
    }

    @ReactProp(name = ReactProgressBarViewManager.PROP_STYLE)
    public void setStyle(@Nullable String str) {
        if (str == null) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        this.mStyle = str;
    }
}
