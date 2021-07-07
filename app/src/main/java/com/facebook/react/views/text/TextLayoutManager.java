package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.yoga.YogaConstants;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.p118pd.sdk.C7265o0O000oo;
import java.util.ArrayList;
import java.util.List;

public class TextLayoutManager {
    public static LruCache<String, Spannable> sSpannableCache = new LruCache<>(100);
    public static final Object sSpannableCacheLock = new Object();
    public static final TextPaint sTextPaintInstance = new TextPaint(1);
    public static final int spannableCacheSize = 100;

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

    public static void buildSpannableFromFragment(Context context, ReadableArray readableArray, SpannableStringBuilder spannableStringBuilder, List<SetSpanOperation> list) {
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            int length = spannableStringBuilder.length();
            TextAttributeProps textAttributeProps = new TextAttributeProps(new ReactStylesDiffMap(map.getMap("textAttributes")));
            spannableStringBuilder.append((CharSequence) TextTransform.apply(map.getString("string"), textAttributeProps.mTextTransform));
            int length2 = spannableStringBuilder.length();
            if (length2 >= length) {
                if (textAttributeProps.mIsColorSet) {
                    list.add(new SetSpanOperation(length, length2, new ReactForegroundColorSpan(textAttributeProps.mColor)));
                }
                if (textAttributeProps.mIsBackgroundColorSet) {
                    list.add(new SetSpanOperation(length, length2, new ReactBackgroundColorSpan(textAttributeProps.mBackgroundColor)));
                }
                if (Build.VERSION.SDK_INT >= 21 && !Float.isNaN(textAttributeProps.mLetterSpacing)) {
                    list.add(new SetSpanOperation(length, length2, new CustomLetterSpacingSpan(textAttributeProps.mLetterSpacing)));
                }
                list.add(new SetSpanOperation(length, length2, new ReactAbsoluteSizeSpan(textAttributeProps.mFontSize)));
                if (!(textAttributeProps.mFontStyle == -1 && textAttributeProps.mFontWeight == -1 && textAttributeProps.mFontFamily == null)) {
                    list.add(new SetSpanOperation(length, length2, new CustomStyleSpan(textAttributeProps.mFontStyle, textAttributeProps.mFontWeight, textAttributeProps.mFontFamily, context.getAssets())));
                }
                if (textAttributeProps.mIsUnderlineTextDecorationSet) {
                    list.add(new SetSpanOperation(length, length2, new ReactUnderlineSpan()));
                }
                if (textAttributeProps.mIsLineThroughTextDecorationSet) {
                    list.add(new SetSpanOperation(length, length2, new ReactStrikethroughSpan()));
                }
                if (!(textAttributeProps.mTextShadowOffsetDx == 0.0f && textAttributeProps.mTextShadowOffsetDy == 0.0f)) {
                    list.add(new SetSpanOperation(length, length2, new ShadowStyleSpan(textAttributeProps.mTextShadowOffsetDx, textAttributeProps.mTextShadowOffsetDy, textAttributeProps.mTextShadowRadius, textAttributeProps.mTextShadowColor)));
                }
                if (!Float.isNaN(textAttributeProps.getEffectiveLineHeight())) {
                    list.add(new SetSpanOperation(length, length2, new CustomLineHeightSpan(textAttributeProps.getEffectiveLineHeight())));
                }
                list.add(new SetSpanOperation(length, length2, new ReactTagSpan(map.getInt("reactTag"))));
            }
        }
    }

    public static Spannable createSpannableFromAttributedString(Context context, ReadableMap readableMap) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<SetSpanOperation> arrayList = new ArrayList();
        buildSpannableFromFragment(context, readableMap.getArray("fragments"), spannableStringBuilder, arrayList);
        int i = 0;
        for (SetSpanOperation setSpanOperation : arrayList) {
            setSpanOperation.execute(spannableStringBuilder, i);
            i++;
        }
        return spannableStringBuilder;
    }

    public static Spannable getOrCreateSpannableForText(Context context, ReadableMap readableMap) {
        String obj = readableMap.toString();
        synchronized (sSpannableCacheLock) {
            Spannable spannable = sSpannableCache.get(obj);
            if (spannable != null) {
                return spannable;
            }
            Spannable createSpannableFromAttributedString = createSpannableFromAttributedString(context, readableMap);
            synchronized (sSpannableCacheLock) {
                sSpannableCache.put(obj, createSpannableFromAttributedString);
            }
            return createSpannableFromAttributedString;
        }
    }

    public static long measureText(ReactContext reactContext, ReadableNativeMap readableNativeMap, ReadableNativeMap readableNativeMap2, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Layout layout;
        int i;
        TextPaint textPaint = sTextPaintInstance;
        Spannable orCreateSpannableForText = getOrCreateSpannableForText(reactContext, readableNativeMap);
        if (orCreateSpannableForText != null) {
            BoringLayout.Metrics isBoring = BoringLayout.isBoring(orCreateSpannableForText, textPaint);
            float desiredWidth = isBoring == null ? Layout.getDesiredWidth(orCreateSpannableForText, textPaint) : Float.NaN;
            boolean z = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f < 0.0f;
            if (isBoring == null && (z || (!YogaConstants.isUndefined(desiredWidth) && desiredWidth <= f))) {
                int ceil = (int) Math.ceil((double) desiredWidth);
                if (Build.VERSION.SDK_INT < 23) {
                    layout = new StaticLayout(orCreateSpannableForText, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                } else {
                    layout = StaticLayout.Builder.obtain(orCreateSpannableForText, 0, orCreateSpannableForText.length(), textPaint, ceil).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(1).setHyphenationFrequency(1).build();
                }
            } else if (isBoring != null && (z || ((float) isBoring.width) <= f)) {
                layout = BoringLayout.make(orCreateSpannableForText, textPaint, isBoring.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, isBoring, true);
            } else if (Build.VERSION.SDK_INT < 23) {
                layout = new StaticLayout(orCreateSpannableForText, textPaint, (int) f, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            } else {
                layout = StaticLayout.Builder.obtain(orCreateSpannableForText, 0, orCreateSpannableForText.length(), textPaint, (int) f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(1).setHyphenationFrequency(1).build();
            }
            int i2 = readableNativeMap2.hasKey("maximumNumberOfLines") ? readableNativeMap2.getInt("maximumNumberOfLines") : -1;
            float width = (float) layout.getWidth();
            if (i2 == -1 || i2 == 0 || i2 >= layout.getLineCount()) {
                i = layout.getHeight();
            } else {
                i = layout.getLineBottom(i2 - 1);
            }
            return YogaMeasureOutput.make(PixelUtil.toSPFromPixel(width), PixelUtil.toSPFromPixel((float) i));
        }
        throw new IllegalStateException("Spannable element has not been prepared in onBeforeLayout");
    }
}
