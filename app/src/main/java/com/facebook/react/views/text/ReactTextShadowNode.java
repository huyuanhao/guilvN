package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.art.ARTTextShadowNode;
import com.facebook.yoga.YogaConstants;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import javax.annotation.Nullable;

@TargetApi(23)
public class ReactTextShadowNode extends ReactBaseTextShadowNode {
    public static final TextPaint sTextPaintInstance = new TextPaint(1);
    @Nullable
    public Spannable mPreparedSpannableText;
    public boolean mShouldNotifyOnTextLayout;
    public final YogaMeasureFunction mTextMeasureFunction = new YogaMeasureFunction() {
        /* class com.facebook.react.views.text.ReactTextShadowNode.C08801 */

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            Layout layout;
            TextPaint textPaint = ReactTextShadowNode.sTextPaintInstance;
            textPaint.setTextSize((float) ReactTextShadowNode.this.mTextAttributes.getEffectiveFontSize());
            Spanned spanned = (Spanned) Assertions.assertNotNull(ReactTextShadowNode.this.mPreparedSpannableText, "Spannable element has not been prepared in onBeforeLayout");
            BoringLayout.Metrics isBoring = BoringLayout.isBoring(spanned, textPaint);
            float desiredWidth = isBoring == null ? Layout.getDesiredWidth(spanned, textPaint) : Float.NaN;
            boolean z = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f < 0.0f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            int textAlign = ReactTextShadowNode.this.getTextAlign();
            if (textAlign == 1) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (textAlign == 8388611) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (textAlign == 8388613) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            if (isBoring == null && (z || (!YogaConstants.isUndefined(desiredWidth) && desiredWidth <= f))) {
                int ceil = (int) Math.ceil((double) desiredWidth);
                if (Build.VERSION.SDK_INT < 23) {
                    layout = new StaticLayout(spanned, textPaint, ceil, alignment, 1.0f, 0.0f, ReactTextShadowNode.this.mIncludeFontPadding);
                } else {
                    StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, ceil).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(ReactTextShadowNode.this.mIncludeFontPadding).setBreakStrategy(ReactTextShadowNode.this.mTextBreakStrategy).setHyphenationFrequency(1);
                    if (Build.VERSION.SDK_INT >= 26) {
                        hyphenationFrequency.setJustificationMode(ReactTextShadowNode.this.mJustificationMode);
                    }
                    layout = hyphenationFrequency.build();
                }
            } else if (isBoring != null && (z || ((float) isBoring.width) <= f)) {
                layout = BoringLayout.make(spanned, textPaint, isBoring.width, alignment, 1.0f, 0.0f, isBoring, ReactTextShadowNode.this.mIncludeFontPadding);
            } else if (Build.VERSION.SDK_INT < 23) {
                layout = new StaticLayout(spanned, textPaint, (int) f, alignment, 1.0f, 0.0f, ReactTextShadowNode.this.mIncludeFontPadding);
            } else {
                layout = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, (int) f).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(ReactTextShadowNode.this.mIncludeFontPadding).setBreakStrategy(ReactTextShadowNode.this.mTextBreakStrategy).setHyphenationFrequency(1).build();
            }
            if (ReactTextShadowNode.this.mShouldNotifyOnTextLayout) {
                WritableArray fontMetrics = FontMetricsUtil.getFontMetrics(spanned, layout, ReactTextShadowNode.sTextPaintInstance, ReactTextShadowNode.this.getThemedContext());
                WritableMap createMap = Arguments.createMap();
                createMap.putArray(ARTTextShadowNode.PROP_LINES, fontMetrics);
                ((RCTEventEmitter) ReactTextShadowNode.this.getThemedContext().getJSModule(RCTEventEmitter.class)).receiveEvent(ReactTextShadowNode.this.getReactTag(), "topTextLayout", createMap);
            }
            int i = ReactTextShadowNode.this.mNumberOfLines;
            if (i == -1 || i >= layout.getLineCount()) {
                return YogaMeasureOutput.make(layout.getWidth(), layout.getHeight());
            }
            return YogaMeasureOutput.make(layout.getWidth(), layout.getLineBottom(ReactTextShadowNode.this.mNumberOfLines - 1));
        }
    };

    public ReactTextShadowNode() {
        initMeasureFunction();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getTextAlign() {
        int i = this.mTextAlign;
        if (getLayoutDirection() != YogaDirection.RTL) {
            return i;
        }
        if (i == 8388613) {
            return 8388611;
        }
        if (i == 8388611) {
            return 8388613;
        }
        return i;
    }

    private void initMeasureFunction() {
        if (!isVirtual()) {
            setMeasureFunction(this.mTextMeasureFunction);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout() {
        this.mPreparedSpannableText = ReactBaseTextShadowNode.spannedFromShadowNode(this, null);
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        Spannable spannable = this.mPreparedSpannableText;
        if (spannable != null) {
            uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), new ReactTextUpdate(spannable, -1, this.mContainsImages, getPadding(4), getPadding(1), getPadding(5), getPadding(3), getTextAlign(), this.mTextBreakStrategy, this.mJustificationMode));
        }
    }

    @ReactProp(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.mShouldNotifyOnTextLayout = z;
    }
}
