package com.facebook.react.views.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.p118pd.sdk.C7190o00oO0O;
import javax.annotation.Nullable;

public class ReactPicker extends C7190o00oO0O {
    public final AdapterView.OnItemSelectedListener mItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        /* class com.facebook.react.views.picker.ReactPicker.C08711 */

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (ReactPicker.this.mOnSelectListener != null) {
                ReactPicker.this.mOnSelectListener.onItemSelected(i);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (ReactPicker.this.mOnSelectListener != null) {
                ReactPicker.this.mOnSelectListener.onItemSelected(-1);
            }
        }
    };
    public int mMode = 0;
    @Nullable
    public OnSelectListener mOnSelectListener;
    @Nullable
    public Integer mPrimaryColor;
    @Nullable
    public Integer mStagedSelection;
    public final Runnable measureAndLayout = new Runnable() {
        /* class com.facebook.react.views.picker.ReactPicker.RunnableC08722 */

        public void run() {
            ReactPicker reactPicker = ReactPicker.this;
            reactPicker.measure(View.MeasureSpec.makeMeasureSpec(reactPicker.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ReactPicker.this.getHeight(), 1073741824));
            ReactPicker reactPicker2 = ReactPicker.this;
            reactPicker2.layout(reactPicker2.getLeft(), ReactPicker.this.getTop(), ReactPicker.this.getRight(), ReactPicker.this.getBottom());
        }
    };

    public interface OnSelectListener {
        void onItemSelected(int i);
    }

    public ReactPicker(Context context) {
        super(context);
    }

    private void setSelectionWithSuppressEvent(int i) {
        if (i != getSelectedItemPosition()) {
            setOnItemSelectedListener(null);
            setSelection(i, false);
            setOnItemSelectedListener(this.mItemSelectedListener);
        }
    }

    @VisibleForTesting
    public int getMode() {
        return this.mMode;
    }

    @Nullable
    public OnSelectListener getOnSelectListener() {
        return this.mOnSelectListener;
    }

    @Nullable
    public Integer getPrimaryColor() {
        return this.mPrimaryColor;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getOnItemSelectedListener() == null) {
            setOnItemSelectedListener(this.mItemSelectedListener);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        post(this.measureAndLayout);
    }

    public void setOnSelectListener(@Nullable OnSelectListener onSelectListener) {
        this.mOnSelectListener = onSelectListener;
    }

    public void setPrimaryColor(@Nullable Integer num) {
        this.mPrimaryColor = num;
    }

    public void setStagedSelection(int i) {
        this.mStagedSelection = Integer.valueOf(i);
    }

    public void updateStagedSelection() {
        Integer num = this.mStagedSelection;
        if (num != null) {
            setSelectionWithSuppressEvent(num.intValue());
            this.mStagedSelection = null;
        }
    }

    public ReactPicker(Context context, int i) {
        super(context, i);
        this.mMode = i;
    }

    public ReactPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReactPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ReactPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mMode = i2;
    }
}
