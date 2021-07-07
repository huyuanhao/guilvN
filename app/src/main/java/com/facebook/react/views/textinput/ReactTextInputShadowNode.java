package com.facebook.react.views.textinput;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.view.MeasureUtil;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import javax.annotation.Nullable;

@TargetApi(23)
@VisibleForTesting
public class ReactTextInputShadowNode extends ReactBaseTextShadowNode implements YogaMeasureFunction {
    @VisibleForTesting
    public static final String PROP_PLACEHOLDER = "placeholder";
    @VisibleForTesting
    public static final String PROP_TEXT = "text";
    @Nullable
    public EditText mDummyEditText;
    @Nullable
    public ReactTextInputLocalData mLocalData;
    public int mMostRecentEventCount = -1;
    @Nullable
    public String mPlaceholder = null;
    @Nullable
    public String mText = null;

    public ReactTextInputShadowNode() {
        this.mTextBreakStrategy = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        initMeasureFunction();
    }

    private void initMeasureFunction() {
        setMeasureFunction(this);
    }

    @Nullable
    public String getPlaceholder() {
        return this.mPlaceholder;
    }

    @Nullable
    public String getText() {
        return this.mText;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isYogaLeafNode() {
        return true;
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int i;
        EditText editText = (EditText) Assertions.assertNotNull(this.mDummyEditText);
        ReactTextInputLocalData reactTextInputLocalData = this.mLocalData;
        if (reactTextInputLocalData != null) {
            reactTextInputLocalData.apply(editText);
        } else {
            editText.setTextSize(0, (float) this.mTextAttributes.getEffectiveFontSize());
            int i2 = this.mNumberOfLines;
            if (i2 != -1) {
                editText.setLines(i2);
            }
            if (Build.VERSION.SDK_INT >= 23 && editText.getBreakStrategy() != (i = this.mTextBreakStrategy)) {
                editText.setBreakStrategy(i);
            }
        }
        editText.setHint(getPlaceholder());
        editText.measure(MeasureUtil.getMeasureSpec(f, yogaMeasureMode), MeasureUtil.getMeasureSpec(f2, yogaMeasureMode2));
        return YogaMeasureOutput.make(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        if (this.mMostRecentEventCount != -1) {
            uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), new ReactTextUpdate(ReactBaseTextShadowNode.spannedFromShadowNode(this, getText()), this.mMostRecentEventCount, this.mContainsImages, getPadding(0), getPadding(1), getPadding(2), getPadding(3), this.mTextAlign, this.mTextBreakStrategy, this.mJustificationMode));
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object obj) {
        Assertions.assertCondition(obj instanceof ReactTextInputLocalData);
        this.mLocalData = (ReactTextInputLocalData) obj;
        dirty();
    }

    @ReactProp(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.mMostRecentEventCount = i;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setPadding(int i, float f) {
        super.setPadding(i, f);
        markUpdated();
    }

    @ReactProp(name = PROP_PLACEHOLDER)
    public void setPlaceholder(@Nullable String str) {
        this.mPlaceholder = str;
        markUpdated();
    }

    @ReactProp(name = "text")
    public void setText(@Nullable String str) {
        this.mText = str;
        markUpdated();
    }

    @Override // com.facebook.react.views.text.ReactBaseTextShadowNode
    public void setTextBreakStrategy(@Nullable String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (str == null || "simple".equals(str)) {
                this.mTextBreakStrategy = 0;
            } else if ("highQuality".equals(str)) {
                this.mTextBreakStrategy = 1;
            } else if ("balanced".equals(str)) {
                this.mTextBreakStrategy = 2;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setThemedContext(ThemedReactContext themedReactContext) {
        super.setThemedContext(themedReactContext);
        EditText editText = new EditText(getThemedContext());
        setDefaultPadding(4, (float) ViewCompat.m14615OooOOOO((View) editText));
        setDefaultPadding(1, (float) editText.getPaddingTop());
        setDefaultPadding(5, (float) ViewCompat.m14611OooOOO((View) editText));
        setDefaultPadding(3, (float) editText.getPaddingBottom());
        this.mDummyEditText = editText;
        editText.setPadding(0, 0, 0, 0);
        this.mDummyEditText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }
}
