package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.pd.sdk.o0ooOoO  reason: case insensitive filesystem */
public class C7727o0ooOoO {
    public static final RectF OooO00o = new RectF();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20703OooO00o = "ACTVAutoSizeHelper";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static ConcurrentHashMap<String, Method> f20704OooO00o = new ConcurrentHashMap<>();
    public static final int OooO0O0 = 12;
    public static final int OooO0OO = 112;
    public static final float OooO0Oo = -1.0f;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final int f20705OooO0Oo = 1;
    public static final int OooO0o0 = 1048576;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f20706OooO00o = -1.0f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f20707OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f20708OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextPaint f20709OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TextView f20710OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20711OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f20712OooO00o = new int[0];

    /* renamed from: OooO0O0  reason: collision with other field name */
    public float f20713OooO0O0 = -1.0f;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f20714OooO0O0 = false;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public float f20715OooO0OO = -1.0f;

    public C7727o0ooOoO(TextView textView) {
        this.f20710OooO00o = textView;
        this.f20708OooO00o = textView.getContext();
    }

    public void OooO00o(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f20708OooO00o.obtainStyledAttributes(attributeSet, C0033R.styleable.OooOOO, i, 0);
        if (obtainStyledAttributes.hasValue(C0033R.styleable.AppCompatTextView_autoSizeTextType)) {
            this.f20707OooO00o = obtainStyledAttributes.getInt(C0033R.styleable.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0033R.styleable.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0033R.styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0033R.styleable.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0033R.styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0033R.styleable.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0033R.styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0033R.styleable.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(C0033R.styleable.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            OooO00o(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!OooO0Oo()) {
            this.f20707OooO00o = 0;
        } else if (this.f20707OooO00o == 1) {
            if (!this.f20714OooO0O0) {
                DisplayMetrics displayMetrics = this.f20708OooO00o.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                OooO00o(dimension2, dimension3, dimension);
            }
            m19372OooO0O0();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m19376OooO0O0() {
        return Math.round(this.f20713OooO0O0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public int m19377OooO0OO() {
        return Math.round(this.f20706OooO00o);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public int m19378OooO0Oo() {
        return this.f20707OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private boolean m19372OooO0O0() {
        if (!OooO0Oo() || this.f20707OooO00o != 1) {
            this.f20711OooO00o = false;
        } else {
            if (!this.f20714OooO0O0 || this.f20712OooO00o.length == 0) {
                float round = (float) Math.round(this.f20713OooO0O0);
                int i = 1;
                while (Math.round(this.f20706OooO00o + round) <= Math.round(this.f20715OooO0OO)) {
                    i++;
                    round += this.f20706OooO00o;
                }
                int[] iArr = new int[i];
                float f = this.f20713OooO0O0;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f20706OooO00o;
                }
                this.f20712OooO00o = OooO00o(iArr);
            }
            this.f20711OooO00o = true;
        }
        return this.f20711OooO00o;
    }

    private boolean OooO0OO() {
        int length = this.f20712OooO00o.length;
        boolean z = length > 0;
        this.f20714OooO0O0 = z;
        if (z) {
            this.f20707OooO00o = 1;
            int[] iArr = this.f20712OooO00o;
            this.f20713OooO0O0 = (float) iArr[0];
            this.f20715OooO0OO = (float) iArr[length - 1];
            this.f20706OooO00o = -1.0f;
        }
        return this.f20714OooO0O0;
    }

    private boolean OooO0Oo() {
        return !(this.f20710OooO00o instanceof C5993Oooooo);
    }

    private void OooO0O0() {
        this.f20707OooO00o = 0;
        this.f20713OooO0O0 = -1.0f;
        this.f20715OooO0OO = -1.0f;
        this.f20706OooO00o = -1.0f;
        this.f20712OooO00o = new int[0];
        this.f20711OooO00o = false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(int i) {
        if (!OooO0Oo()) {
            return;
        }
        if (i == 0) {
            OooO0O0();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f20708OooO00o.getResources().getDisplayMetrics();
            OooO00o(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m19372OooO0O0()) {
                m19373OooO00o();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (OooO0Oo()) {
            DisplayMetrics displayMetrics = this.f20708OooO00o.getResources().getDisplayMetrics();
            OooO00o(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m19372OooO0O0()) {
                m19373OooO00o();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (OooO0Oo()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f20708OooO00o.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f20712OooO00o = OooO00o(iArr2);
                if (!OooO0OO()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f20714OooO0O0 = false;
            }
            if (m19372OooO0O0()) {
                m19373OooO00o();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int OooO00o() {
        return Math.round(this.f20715OooO0OO);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m19375OooO00o() {
        return this.f20712OooO00o;
    }

    private void OooO00o(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f20712OooO00o = OooO00o(iArr);
            OooO0OO();
        }
    }

    private int[] OooO00o(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    private void OooO00o(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size " + "text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f20707OooO00o = 1;
            this.f20713OooO0O0 = f;
            this.f20715OooO0OO = f2;
            this.f20706OooO00o = f3;
            this.f20714OooO0O0 = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19373OooO00o() {
        int i;
        if (m19374OooO00o()) {
            if (this.f20711OooO00o) {
                if (this.f20710OooO00o.getMeasuredHeight() > 0 && this.f20710OooO00o.getMeasuredWidth() > 0) {
                    if (((Boolean) OooO00o((Object) this.f20710OooO00o, "getHorizontallyScrolling", (Object) false)).booleanValue()) {
                        i = 1048576;
                    } else {
                        i = (this.f20710OooO00o.getMeasuredWidth() - this.f20710OooO00o.getTotalPaddingLeft()) - this.f20710OooO00o.getTotalPaddingRight();
                    }
                    int height = (this.f20710OooO00o.getHeight() - this.f20710OooO00o.getCompoundPaddingBottom()) - this.f20710OooO00o.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        synchronized (OooO00o) {
                            OooO00o.setEmpty();
                            OooO00o.right = (float) i;
                            OooO00o.bottom = (float) height;
                            float OooO00o2 = (float) OooO00o(OooO00o);
                            if (OooO00o2 != this.f20710OooO00o.getTextSize()) {
                                OooO00o(0, OooO00o2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f20711OooO00o = true;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(int i, float f) {
        Resources resources;
        Context context = this.f20708OooO00o;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        OooO00o(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    private void OooO00o(float f) {
        if (f != this.f20710OooO00o.getPaint().getTextSize()) {
            this.f20710OooO00o.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f20710OooO00o.isInLayout() : false;
            if (this.f20710OooO00o.getLayout() != null) {
                this.f20711OooO00o = false;
                try {
                    Method OooO00o2 = OooO00o("nullLayouts");
                    if (OooO00o2 != null) {
                        OooO00o2.invoke(this.f20710OooO00o, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.f20710OooO00o.requestLayout();
                } else {
                    this.f20710OooO00o.forceLayout();
                }
                this.f20710OooO00o.invalidate();
            }
        }
    }

    private int OooO00o(RectF rectF) {
        int length = this.f20712OooO00o.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (OooO00o(this.f20712OooO00o[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f20712OooO00o[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private boolean OooO00o(int i, RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        CharSequence text = this.f20710OooO00o.getText();
        TransformationMethod transformationMethod = this.f20710OooO00o.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f20710OooO00o)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f20710OooO00o.getMaxLines() : -1;
        TextPaint textPaint = this.f20709OooO00o;
        if (textPaint == null) {
            this.f20709OooO00o = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f20709OooO00o.set(this.f20710OooO00o.getPaint());
        this.f20709OooO00o.setTextSize((float) i);
        Layout.Alignment alignment = (Layout.Alignment) OooO00o(this.f20710OooO00o, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            staticLayout = OooO00o(text, alignment, Math.round(rectF.right), maxLines);
        } else {
            staticLayout = OooO00o(text, alignment, Math.round(rectF.right));
        }
        return (maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF.bottom;
    }

    @RequiresApi(23)
    private StaticLayout OooO00o(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) OooO00o(this.f20710OooO00o, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f20709OooO00o, i).setAlignment(alignment).setLineSpacing(this.f20710OooO00o.getLineSpacingExtra(), this.f20710OooO00o.getLineSpacingMultiplier()).setIncludePad(this.f20710OooO00o.getIncludeFontPadding()).setBreakStrategy(this.f20710OooO00o.getBreakStrategy()).setHyphenationFrequency(this.f20710OooO00o.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    private StaticLayout OooO00o(CharSequence charSequence, Layout.Alignment alignment, int i) {
        boolean z;
        float f;
        float f2;
        if (Build.VERSION.SDK_INT >= 16) {
            f2 = this.f20710OooO00o.getLineSpacingMultiplier();
            f = this.f20710OooO00o.getLineSpacingExtra();
            z = this.f20710OooO00o.getIncludeFontPadding();
        } else {
            f2 = ((Float) OooO00o(this.f20710OooO00o, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            f = ((Float) OooO00o(this.f20710OooO00o, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            z = ((Boolean) OooO00o((Object) this.f20710OooO00o, "getIncludeFontPadding", (Object) true)).booleanValue();
        }
        return new StaticLayout(charSequence, this.f20709OooO00o, i, alignment, f2, f, z);
    }

    private <T> T OooO00o(@NonNull Object obj, @NonNull String str, @NonNull T t) {
        try {
            return (T) OooO00o(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            String str2 = "Failed to invoke TextView#" + str + "() method";
            return t;
        }
    }

    @Nullable
    private Method OooO00o(@NonNull String str) {
        try {
            Method method = f20704OooO00o.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f20704OooO00o.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            String str2 = "Failed to retrieve TextView#" + str + "() method";
            return null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19374OooO00o() {
        return OooO0Oo() && this.f20707OooO00o != 0;
    }
}
