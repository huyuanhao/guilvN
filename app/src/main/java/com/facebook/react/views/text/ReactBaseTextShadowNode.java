package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaDirection;
import com.p118pd.sdk.C7265o0O000oo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

@TargetApi(23)
public abstract class ReactBaseTextShadowNode extends LayoutShadowNode {
    public static final int DEFAULT_TEXT_SHADOW_COLOR = 1426063360;
    public static final String INLINE_IMAGE_PLACEHOLDER = "I";
    public static final String PROP_SHADOW_COLOR = "textShadowColor";
    public static final String PROP_SHADOW_OFFSET = "textShadowOffset";
    public static final String PROP_SHADOW_OFFSET_HEIGHT = "height";
    public static final String PROP_SHADOW_OFFSET_WIDTH = "width";
    public static final String PROP_SHADOW_RADIUS = "textShadowRadius";
    public static final String PROP_TEXT_TRANSFORM = "textTransform";
    public static final int UNSET = -1;
    public int mBackgroundColor;
    public int mColor;
    public boolean mContainsImages;
    @Nullable
    public String mFontFamily;
    public int mFontStyle;
    public int mFontWeight;
    public float mHeightOfTallestInlineImage;
    public boolean mIncludeFontPadding;
    public boolean mIsBackgroundColorSet = false;
    public boolean mIsColorSet = false;
    public boolean mIsLineThroughTextDecorationSet;
    public boolean mIsUnderlineTextDecorationSet;
    public int mJustificationMode;
    public int mNumberOfLines = -1;
    public int mTextAlign = 0;
    public TextAttributes mTextAttributes;
    public int mTextBreakStrategy;
    public int mTextShadowColor;
    public float mTextShadowOffsetDx;
    public float mTextShadowOffsetDy;
    public float mTextShadowRadius;
    public TextTransform mTextTransform;

    public static class SetSpanOperation {
        public int end;
        public int start;
        public ReactSpan what;

        public SetSpanOperation(int i, int i2, ReactSpan reactSpan) {
            this.start = i;
            this.end = i2;
            this.what = reactSpan;
        }

        public void execute(SpannableStringBuilder spannableStringBuilder, int i) {
            spannableStringBuilder.setSpan(this.what, this.start, this.end, ((i << 16) & C7265o0O000oo.OooOo0O) | ((this.start == 0 ? 18 : 34) & -16711681));
        }
    }

    public ReactBaseTextShadowNode() {
        this.mTextBreakStrategy = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        int i = Build.VERSION.SDK_INT;
        this.mJustificationMode = 0;
        this.mTextTransform = TextTransform.UNSET;
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        this.mTextShadowRadius = 0.0f;
        this.mTextShadowColor = 1426063360;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        this.mIncludeFontPadding = true;
        this.mFontStyle = -1;
        this.mFontWeight = -1;
        this.mFontFamily = null;
        this.mContainsImages = false;
        this.mHeightOfTallestInlineImage = Float.NaN;
        this.mTextAttributes = new TextAttributes();
    }

    public static void buildSpannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, SpannableStringBuilder spannableStringBuilder, List<SetSpanOperation> list, TextAttributes textAttributes, int i) {
        TextAttributes textAttributes2;
        if (textAttributes != null) {
            textAttributes2 = textAttributes.applyChild(reactBaseTextShadowNode.mTextAttributes);
        } else {
            textAttributes2 = reactBaseTextShadowNode.mTextAttributes;
        }
        int childCount = reactBaseTextShadowNode.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ReactShadowNodeImpl childAt = reactBaseTextShadowNode.getChildAt(i2);
            if (childAt instanceof ReactRawTextShadowNode) {
                spannableStringBuilder.append((CharSequence) TextTransform.apply(((ReactRawTextShadowNode) childAt).getText(), textAttributes2.getTextTransform()));
            } else if (childAt instanceof ReactBaseTextShadowNode) {
                buildSpannedFromShadowNode((ReactBaseTextShadowNode) childAt, spannableStringBuilder, list, textAttributes2, spannableStringBuilder.length());
            } else if (childAt instanceof ReactTextInlineImageShadowNode) {
                spannableStringBuilder.append("I");
                list.add(new SetSpanOperation(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((ReactTextInlineImageShadowNode) childAt).buildInlineImageSpan()));
            } else {
                throw new IllegalViewOperationException("Unexpected view type nested under text node: " + childAt.getClass());
            }
            childAt.markUpdateSeen();
        }
        int length = spannableStringBuilder.length();
        if (length >= i) {
            if (reactBaseTextShadowNode.mIsColorSet) {
                list.add(new SetSpanOperation(i, length, new ReactForegroundColorSpan(reactBaseTextShadowNode.mColor)));
            }
            if (reactBaseTextShadowNode.mIsBackgroundColorSet) {
                list.add(new SetSpanOperation(i, length, new ReactBackgroundColorSpan(reactBaseTextShadowNode.mBackgroundColor)));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                float effectiveLetterSpacing = textAttributes2.getEffectiveLetterSpacing();
                if (!Float.isNaN(effectiveLetterSpacing) && (textAttributes == null || textAttributes.getEffectiveLetterSpacing() != effectiveLetterSpacing)) {
                    list.add(new SetSpanOperation(i, length, new CustomLetterSpacingSpan(effectiveLetterSpacing)));
                }
            }
            int effectiveFontSize = textAttributes2.getEffectiveFontSize();
            if (textAttributes == null || textAttributes.getEffectiveFontSize() != effectiveFontSize) {
                list.add(new SetSpanOperation(i, length, new ReactAbsoluteSizeSpan(effectiveFontSize)));
            }
            if (!(reactBaseTextShadowNode.mFontStyle == -1 && reactBaseTextShadowNode.mFontWeight == -1 && reactBaseTextShadowNode.mFontFamily == null)) {
                list.add(new SetSpanOperation(i, length, new CustomStyleSpan(reactBaseTextShadowNode.mFontStyle, reactBaseTextShadowNode.mFontWeight, reactBaseTextShadowNode.mFontFamily, reactBaseTextShadowNode.getThemedContext().getAssets())));
            }
            if (reactBaseTextShadowNode.mIsUnderlineTextDecorationSet) {
                list.add(new SetSpanOperation(i, length, new ReactUnderlineSpan()));
            }
            if (reactBaseTextShadowNode.mIsLineThroughTextDecorationSet) {
                list.add(new SetSpanOperation(i, length, new ReactStrikethroughSpan()));
            }
            if (!((reactBaseTextShadowNode.mTextShadowOffsetDx == 0.0f && reactBaseTextShadowNode.mTextShadowOffsetDy == 0.0f && reactBaseTextShadowNode.mTextShadowRadius == 0.0f) || Color.alpha(reactBaseTextShadowNode.mTextShadowColor) == 0)) {
                list.add(new SetSpanOperation(i, length, new ShadowStyleSpan(reactBaseTextShadowNode.mTextShadowOffsetDx, reactBaseTextShadowNode.mTextShadowOffsetDy, reactBaseTextShadowNode.mTextShadowRadius, reactBaseTextShadowNode.mTextShadowColor)));
            }
            float effectiveLineHeight = textAttributes2.getEffectiveLineHeight();
            if (!Float.isNaN(effectiveLineHeight) && (textAttributes == null || textAttributes.getEffectiveLineHeight() != effectiveLineHeight)) {
                list.add(new SetSpanOperation(i, length, new CustomLineHeightSpan(effectiveLineHeight)));
            }
            list.add(new SetSpanOperation(i, length, new ReactTagSpan(reactBaseTextShadowNode.getReactTag())));
        }
    }

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

    public static int parseNumericFontWeight(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    public static Spannable spannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<SetSpanOperation> arrayList = new ArrayList();
        if (str != null) {
            spannableStringBuilder.append((CharSequence) TextTransform.apply(str, reactBaseTextShadowNode.mTextAttributes.getTextTransform()));
        }
        int i = 0;
        buildSpannedFromShadowNode(reactBaseTextShadowNode, spannableStringBuilder, arrayList, null, 0);
        reactBaseTextShadowNode.mContainsImages = false;
        float f = Float.NaN;
        for (SetSpanOperation setSpanOperation : arrayList) {
            ReactSpan reactSpan = setSpanOperation.what;
            if (reactSpan instanceof TextInlineImageSpan) {
                int height = ((TextInlineImageSpan) reactSpan).getHeight();
                reactBaseTextShadowNode.mContainsImages = true;
                if (Float.isNaN(f) || ((float) height) > f) {
                    f = (float) height;
                }
            }
            setSpanOperation.execute(spannableStringBuilder, i);
            i++;
        }
        reactBaseTextShadowNode.mTextAttributes.setHeightOfTallestInlineImage(f);
        return spannableStringBuilder;
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.ALLOW_FONT_SCALING)
    public void setAllowFontScaling(boolean z) {
        if (z != this.mTextAttributes.getAllowFontScaling()) {
            this.mTextAttributes.setAllowFontScaling(z);
            markUpdated();
        }
    }

    @ReactProp(name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (!isVirtualAnchor()) {
            boolean z = num != null;
            this.mIsBackgroundColorSet = z;
            if (z) {
                this.mBackgroundColor = num.intValue();
            }
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.COLOR)
    public void setColor(@Nullable Integer num) {
        boolean z = num != null;
        this.mIsColorSet = z;
        if (z) {
            this.mColor = num.intValue();
        }
        markUpdated();
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(@Nullable String str) {
        this.mFontFamily = str;
        markUpdated();
    }

    @ReactProp(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f) {
        this.mTextAttributes.setFontSize(f);
        markUpdated();
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(@Nullable String str) {
        int i;
        if ("italic".equals(str)) {
            i = 2;
        } else {
            i = "normal".equals(str) ? 0 : -1;
        }
        if (i != this.mFontStyle) {
            this.mFontStyle = i;
            markUpdated();
        }
    }

    @ReactProp(name = "fontWeight")
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
            markUpdated();
        }
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public void setIncludeFontPadding(boolean z) {
        this.mIncludeFontPadding = z;
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.LETTER_SPACING)
    public void setLetterSpacing(float f) {
        this.mTextAttributes.setLetterSpacing(f);
        markUpdated();
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.LINE_HEIGHT)
    public void setLineHeight(float f) {
        this.mTextAttributes.setLineHeight(f);
        markUpdated();
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.MAX_FONT_SIZE_MULTIPLIER)
    public void setMaxFontSizeMultiplier(float f) {
        if (f != this.mTextAttributes.getMaxFontSizeMultiplier()) {
            this.mTextAttributes.setMaxFontSizeMultiplier(f);
            markUpdated();
        }
    }

    @ReactProp(defaultInt = -1, name = ViewProps.NUMBER_OF_LINES)
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.mNumberOfLines = i;
        markUpdated();
    }

    @ReactProp(name = ViewProps.TEXT_ALIGN)
    public void setTextAlign(@Nullable String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mJustificationMode = 1;
            }
            this.mTextAlign = 8388611;
        } else {
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
        markUpdated();
    }

    @ReactProp(name = ViewProps.TEXT_BREAK_STRATEGY)
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
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.TEXT_DECORATION_LINE)
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
        markUpdated();
    }

    @ReactProp(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.mTextShadowColor) {
            this.mTextShadowColor = i;
            markUpdated();
        }
    }

    @ReactProp(name = "textShadowOffset")
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
        markUpdated();
    }

    @ReactProp(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.mTextShadowRadius) {
            this.mTextShadowRadius = f;
            markUpdated();
        }
    }

    @ReactProp(name = "textTransform")
    public void setTextTransform(@Nullable String str) {
        if (str == null) {
            this.mTextAttributes.setTextTransform(TextTransform.UNSET);
        } else if ("none".equals(str)) {
            this.mTextAttributes.setTextTransform(TextTransform.NONE);
        } else if ("uppercase".equals(str)) {
            this.mTextAttributes.setTextTransform(TextTransform.UPPERCASE);
        } else if ("lowercase".equals(str)) {
            this.mTextAttributes.setTextTransform(TextTransform.LOWERCASE);
        } else if ("capitalize".equals(str)) {
            this.mTextAttributes.setTextTransform(TextTransform.CAPITALIZE);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
        }
        markUpdated();
    }
}
