package com.facebook.react.views.text;

import android.os.Build;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.yoga.YogaDirection;
import javax.annotation.Nullable;

public class TextAttributeProps {
    public static final int DEFAULT_TEXT_SHADOW_COLOR = 1426063360;
    public static final String INLINE_IMAGE_PLACEHOLDER = "I";
    public static final String PROP_SHADOW_COLOR = "textShadowColor";
    public static final String PROP_SHADOW_OFFSET = "textShadowOffset";
    public static final String PROP_SHADOW_OFFSET_HEIGHT = "height";
    public static final String PROP_SHADOW_OFFSET_WIDTH = "width";
    public static final String PROP_SHADOW_RADIUS = "textShadowRadius";
    public static final String PROP_TEXT_TRANSFORM = "textTransform";
    public static final int UNSET = -1;
    public boolean mAllowFontScaling = true;
    public int mBackgroundColor;
    public int mColor;
    public boolean mContainsImages;
    @Nullable
    public String mFontFamily;
    public int mFontSize = -1;
    public float mFontSizeInput = -1.0f;
    public int mFontStyle;
    public int mFontWeight;
    public float mHeightOfTallestInlineImage;
    public boolean mIncludeFontPadding;
    public boolean mIsBackgroundColorSet = false;
    public boolean mIsColorSet = false;
    public boolean mIsLineThroughTextDecorationSet;
    public boolean mIsUnderlineTextDecorationSet;
    public int mJustificationMode;
    public float mLetterSpacing = Float.NaN;
    public float mLetterSpacingInput = Float.NaN;
    public float mLineHeight = Float.NaN;
    public float mLineHeightInput = -1.0f;
    public int mNumberOfLines = -1;
    public final ReactStylesDiffMap mProps;
    public int mTextAlign = 0;
    public int mTextBreakStrategy;
    public int mTextShadowColor;
    public float mTextShadowOffsetDx;
    public float mTextShadowOffsetDy;
    public float mTextShadowRadius;
    public TextTransform mTextTransform;

    public TextAttributeProps(ReactStylesDiffMap reactStylesDiffMap) {
        this.mTextBreakStrategy = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        int i = Build.VERSION.SDK_INT;
        this.mJustificationMode = 0;
        this.mTextTransform = TextTransform.UNSET;
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        this.mTextShadowRadius = 1.0f;
        this.mTextShadowColor = 1426063360;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        this.mIncludeFontPadding = true;
        this.mFontStyle = -1;
        this.mFontWeight = -1;
        ReadableMap readableMap = null;
        this.mFontFamily = null;
        this.mContainsImages = false;
        this.mHeightOfTallestInlineImage = Float.NaN;
        this.mProps = reactStylesDiffMap;
        setNumberOfLines(getIntProp(ViewProps.NUMBER_OF_LINES, -1));
        setLineHeight(getFloatProp(ViewProps.LINE_HEIGHT, -1.0f));
        setLetterSpacing(getFloatProp(ViewProps.LETTER_SPACING, Float.NaN));
        setAllowFontScaling(getBooleanProp(ViewProps.ALLOW_FONT_SCALING, true));
        setTextAlign(getStringProp(ViewProps.TEXT_ALIGN));
        setFontSize(getFloatProp("fontSize", -1.0f));
        setColor(reactStylesDiffMap.hasKey(ViewProps.COLOR) ? Integer.valueOf(reactStylesDiffMap.getInt(ViewProps.COLOR, 0)) : null);
        setColor(reactStylesDiffMap.hasKey("foregroundColor") ? Integer.valueOf(reactStylesDiffMap.getInt("foregroundColor", 0)) : null);
        setBackgroundColor(reactStylesDiffMap.hasKey("backgroundColor") ? Integer.valueOf(reactStylesDiffMap.getInt("backgroundColor", 0)) : null);
        setFontFamily(getStringProp("fontFamily"));
        setFontWeight(getStringProp("fontWeight"));
        setFontStyle(getStringProp("fontStyle"));
        setIncludeFontPadding(getBooleanProp(ViewProps.INCLUDE_FONT_PADDING, true));
        setTextDecorationLine(getStringProp(ViewProps.TEXT_DECORATION_LINE));
        setTextBreakStrategy(getStringProp(ViewProps.TEXT_BREAK_STRATEGY));
        setTextShadowOffset(reactStylesDiffMap.hasKey("textShadowOffset") ? reactStylesDiffMap.getMap("textShadowOffset") : readableMap);
        setTextShadowRadius((float) getIntProp("textShadowRadius", 1));
        setTextShadowColor(getIntProp("textShadowColor", 1426063360));
        setTextTransform(getStringProp("textTransform"));
    }

    private boolean getBooleanProp(String str, boolean z) {
        return this.mProps.hasKey(str) ? this.mProps.getBoolean(str, z) : z;
    }

    private float getFloatProp(String str, float f) {
        return this.mProps.hasKey(str) ? this.mProps.getFloat(str, f) : f;
    }

    private int getIntProp(String str, int i) {
        return this.mProps.hasKey(str) ? this.mProps.getInt(str, i) : i;
    }

    private YogaDirection getLayoutDirection() {
        return YogaDirection.LTR;
    }

    private float getPaddingProp(String str) {
        if (this.mProps.hasKey(ViewProps.PADDING)) {
            return PixelUtil.toPixelFromDIP(getFloatProp(ViewProps.PADDING, 0.0f));
        }
        return PixelUtil.toPixelFromDIP(getFloatProp(str, 0.0f));
    }

    private String getStringProp(String str) {
        if (this.mProps.hasKey(str)) {
            return this.mProps.getString(str);
        }
        return null;
    }

    public static int parseNumericFontWeight(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    public float getBottomPadding() {
        return getPaddingProp(ViewProps.PADDING_BOTTOM);
    }

    public float getEffectiveLineHeight() {
        return !Float.isNaN(this.mLineHeight) && !Float.isNaN(this.mHeightOfTallestInlineImage) && (this.mHeightOfTallestInlineImage > this.mLineHeight ? 1 : (this.mHeightOfTallestInlineImage == this.mLineHeight ? 0 : -1)) > 0 ? this.mHeightOfTallestInlineImage : this.mLineHeight;
    }

    public float getEndPadding() {
        return getPaddingProp(ViewProps.PADDING_END);
    }

    public float getLeftPadding() {
        return getPaddingProp(ViewProps.PADDING_LEFT);
    }

    public float getRightPadding() {
        return getPaddingProp(ViewProps.PADDING_RIGHT);
    }

    public float getStartPadding() {
        return getPaddingProp(ViewProps.PADDING_START);
    }

    public int getTextAlign() {
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

    public float getTopPadding() {
        return getPaddingProp(ViewProps.PADDING_TOP);
    }

    public void setAllowFontScaling(boolean z) {
        if (z != this.mAllowFontScaling) {
            this.mAllowFontScaling = z;
            setFontSize(this.mFontSizeInput);
            setLineHeight(this.mLineHeightInput);
            setLetterSpacing(this.mLetterSpacingInput);
        }
    }

    public void setBackgroundColor(Integer num) {
        boolean z = num != null;
        this.mIsBackgroundColorSet = z;
        if (z) {
            this.mBackgroundColor = num.intValue();
        }
    }

    public void setColor(@Nullable Integer num) {
        boolean z = num != null;
        this.mIsColorSet = z;
        if (z) {
            this.mColor = num.intValue();
        }
    }

    public void setFontFamily(@Nullable String str) {
        this.mFontFamily = str;
    }

    public void setFontSize(float f) {
        double d;
        this.mFontSizeInput = f;
        if (f != -1.0f) {
            if (this.mAllowFontScaling) {
                d = Math.ceil((double) PixelUtil.toPixelFromSP(f));
            } else {
                d = Math.ceil((double) PixelUtil.toPixelFromDIP(f));
            }
            f = (float) d;
        }
        this.mFontSize = (int) f;
    }

    public void setFontStyle(@Nullable String str) {
        int i;
        if ("italic".equals(str)) {
            i = 2;
        } else {
            i = "normal".equals(str) ? 0 : -1;
        }
        if (i != this.mFontStyle) {
            this.mFontStyle = i;
        }
    }

    public void setFontWeight(@Nullable String str) {
        int i = -1;
        int parseNumericFontWeight = str != null ? parseNumericFontWeight(str) : -1;
        if (parseNumericFontWeight >= 500 || "bold".equals(str)) {
            i = 1;
        } else if ("normal".equals(str) || (parseNumericFontWeight != -1 && parseNumericFontWeight < 500)) {
            i = 0;
        }
        if (i != this.mFontWeight) {
            this.mFontWeight = i;
        }
    }

    public void setIncludeFontPadding(boolean z) {
        this.mIncludeFontPadding = z;
    }

    public void setLetterSpacing(float f) {
        float f2;
        this.mLetterSpacingInput = f;
        if (this.mAllowFontScaling) {
            f2 = PixelUtil.toPixelFromSP(f);
        } else {
            f2 = PixelUtil.toPixelFromDIP(f);
        }
        this.mLetterSpacing = f2;
    }

    public void setLineHeight(float f) {
        float f2;
        this.mLineHeightInput = f;
        if (f == -1.0f) {
            this.mLineHeight = Float.NaN;
            return;
        }
        if (this.mAllowFontScaling) {
            f2 = PixelUtil.toPixelFromSP(f);
        } else {
            f2 = PixelUtil.toPixelFromDIP(f);
        }
        this.mLineHeight = f2;
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.mNumberOfLines = i;
    }

    public void setTextAlign(@Nullable String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mJustificationMode = 1;
            }
            this.mTextAlign = 8388611;
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJustificationMode = 0;
        }
        if (str == null || "auto".equals(str)) {
            this.mTextAlign = 0;
        } else if ("left".equals(str)) {
            this.mTextAlign = 8388611;
        } else if ("right".equals(str)) {
            this.mTextAlign = 8388613;
        } else if ("center".equals(str)) {
            this.mTextAlign = 1;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
        }
    }

    public void setTextBreakStrategy(@Nullable String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (str == null || "highQuality".equals(str)) {
                this.mTextBreakStrategy = 1;
            } else if ("simple".equals(str)) {
                this.mTextBreakStrategy = 0;
            } else if ("balanced".equals(str)) {
                this.mTextBreakStrategy = 2;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
        }
    }

    public void setTextDecorationLine(@Nullable String str) {
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        if (str != null) {
            String[] split = str.split(" ");
            for (String str2 : split) {
                if ("underline".equals(str2)) {
                    this.mIsUnderlineTextDecorationSet = true;
                } else if ("line-through".equals(str2)) {
                    this.mIsLineThroughTextDecorationSet = true;
                }
            }
        }
    }

    public void setTextShadowColor(int i) {
        if (i != this.mTextShadowColor) {
            this.mTextShadowColor = i;
        }
    }

    public void setTextShadowOffset(ReadableMap readableMap) {
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.mTextShadowOffsetDx = PixelUtil.toPixelFromDIP(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.mTextShadowOffsetDy = PixelUtil.toPixelFromDIP(readableMap.getDouble("height"));
            }
        }
    }

    public void setTextShadowRadius(float f) {
        if (f != this.mTextShadowRadius) {
            this.mTextShadowRadius = f;
        }
    }

    public void setTextTransform(@Nullable String str) {
        if (str == null || "none".equals(str)) {
            this.mTextTransform = TextTransform.NONE;
        } else if ("uppercase".equals(str)) {
            this.mTextTransform = TextTransform.UPPERCASE;
        } else if ("lowercase".equals(str)) {
            this.mTextTransform = TextTransform.LOWERCASE;
        } else if ("capitalize".equals(str)) {
            this.mTextTransform = TextTransform.CAPITALIZE;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
        }
    }
}
