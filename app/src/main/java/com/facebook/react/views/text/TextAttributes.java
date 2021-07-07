package com.facebook.react.views.text;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.PixelUtil;

public class TextAttributes {
    public static final float DEFAULT_MAX_FONT_SIZE_MULTIPLIER = 0.0f;
    public boolean mAllowFontScaling = true;
    public float mFontSize = Float.NaN;
    public float mHeightOfTallestInlineImage = Float.NaN;
    public float mLetterSpacing = Float.NaN;
    public float mLineHeight = Float.NaN;
    public float mMaxFontSizeMultiplier = Float.NaN;
    public TextTransform mTextTransform = TextTransform.UNSET;

    public TextAttributes applyChild(TextAttributes textAttributes) {
        TextAttributes textAttributes2 = new TextAttributes();
        textAttributes2.mAllowFontScaling = this.mAllowFontScaling;
        textAttributes2.mFontSize = !Float.isNaN(textAttributes.mFontSize) ? textAttributes.mFontSize : this.mFontSize;
        textAttributes2.mLineHeight = !Float.isNaN(textAttributes.mLineHeight) ? textAttributes.mLineHeight : this.mLineHeight;
        textAttributes2.mLetterSpacing = !Float.isNaN(textAttributes.mLetterSpacing) ? textAttributes.mLetterSpacing : this.mLetterSpacing;
        textAttributes2.mMaxFontSizeMultiplier = !Float.isNaN(textAttributes.mMaxFontSizeMultiplier) ? textAttributes.mMaxFontSizeMultiplier : this.mMaxFontSizeMultiplier;
        textAttributes2.mHeightOfTallestInlineImage = !Float.isNaN(textAttributes.mHeightOfTallestInlineImage) ? textAttributes.mHeightOfTallestInlineImage : this.mHeightOfTallestInlineImage;
        TextTransform textTransform = textAttributes.mTextTransform;
        if (textTransform == TextTransform.UNSET) {
            textTransform = this.mTextTransform;
        }
        textAttributes2.mTextTransform = textTransform;
        return textAttributes2;
    }

    public boolean getAllowFontScaling() {
        return this.mAllowFontScaling;
    }

    public int getEffectiveFontSize() {
        double d;
        float f = !Float.isNaN(this.mFontSize) ? this.mFontSize : 14.0f;
        if (this.mAllowFontScaling) {
            d = Math.ceil((double) PixelUtil.toPixelFromSP(f, getEffectiveMaxFontSizeMultiplier()));
        } else {
            d = Math.ceil((double) PixelUtil.toPixelFromDIP(f));
        }
        return (int) d;
    }

    public float getEffectiveLetterSpacing() {
        float f;
        if (Float.isNaN(this.mLetterSpacing)) {
            return Float.NaN;
        }
        if (this.mAllowFontScaling) {
            f = PixelUtil.toPixelFromSP(this.mLetterSpacing, getEffectiveMaxFontSizeMultiplier());
        } else {
            f = PixelUtil.toPixelFromDIP(this.mLetterSpacing);
        }
        return f / ((float) getEffectiveFontSize());
    }

    public float getEffectiveLineHeight() {
        float f;
        if (Float.isNaN(this.mLineHeight)) {
            return Float.NaN;
        }
        if (this.mAllowFontScaling) {
            f = PixelUtil.toPixelFromSP(this.mLineHeight, getEffectiveMaxFontSizeMultiplier());
        } else {
            f = PixelUtil.toPixelFromDIP(this.mLineHeight);
        }
        return !Float.isNaN(this.mHeightOfTallestInlineImage) && (this.mHeightOfTallestInlineImage > f ? 1 : (this.mHeightOfTallestInlineImage == f ? 0 : -1)) > 0 ? this.mHeightOfTallestInlineImage : f;
    }

    public float getEffectiveMaxFontSizeMultiplier() {
        if (!Float.isNaN(this.mMaxFontSizeMultiplier)) {
            return this.mMaxFontSizeMultiplier;
        }
        return 0.0f;
    }

    public float getFontSize() {
        return this.mFontSize;
    }

    public float getHeightOfTallestInlineImage() {
        return this.mHeightOfTallestInlineImage;
    }

    public float getLetterSpacing() {
        return this.mLetterSpacing;
    }

    public float getLineHeight() {
        return this.mLineHeight;
    }

    public float getMaxFontSizeMultiplier() {
        return this.mMaxFontSizeMultiplier;
    }

    public TextTransform getTextTransform() {
        return this.mTextTransform;
    }

    public void setAllowFontScaling(boolean z) {
        this.mAllowFontScaling = z;
    }

    public void setFontSize(float f) {
        this.mFontSize = f;
    }

    public void setHeightOfTallestInlineImage(float f) {
        this.mHeightOfTallestInlineImage = f;
    }

    public void setLetterSpacing(float f) {
        this.mLetterSpacing = f;
    }

    public void setLineHeight(float f) {
        this.mLineHeight = f;
    }

    public void setMaxFontSizeMultiplier(float f) {
        if (f == 0.0f || f >= 1.0f) {
            this.mMaxFontSizeMultiplier = f;
            return;
        }
        throw new JSApplicationIllegalArgumentException("maxFontSizeMultiplier must be NaN, 0, or >= 1");
    }

    public void setTextTransform(TextTransform textTransform) {
        this.mTextTransform = textTransform;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + getAllowFontScaling() + "\n  getFontSize(): " + getFontSize() + "\n  getEffectiveFontSize(): " + getEffectiveFontSize() + "\n  getHeightOfTallestInlineImage(): " + getHeightOfTallestInlineImage() + "\n  getLetterSpacing(): " + getLetterSpacing() + "\n  getEffectiveLetterSpacing(): " + getEffectiveLetterSpacing() + "\n  getLineHeight(): " + getLineHeight() + "\n  getEffectiveLineHeight(): " + getEffectiveLineHeight() + "\n  getTextTransform(): " + getTextTransform() + "\n  getMaxFontSizeMultiplier(): " + getMaxFontSizeMultiplier() + "\n  getEffectiveMaxFontSizeMultiplier(): " + getEffectiveMaxFontSizeMultiplier() + "\n}";
    }
}
