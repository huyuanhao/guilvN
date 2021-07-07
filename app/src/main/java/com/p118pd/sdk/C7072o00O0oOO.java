package com.p118pd.sdk;

import android.os.Build;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: com.pd.sdk.o00O0oOO  reason: case insensitive filesystem */
public class C7072o00O0oOO implements Spannable {
    public static final char OooO00o = '\n';

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f19373OooO00o = new Object();
    @NonNull
    @GuardedBy("sLock")

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Executor f19374OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final PrecomputedText f19375OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Spannable f19376OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f19377OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int[] f19378OooO00o;

    /* renamed from: com.pd.sdk.o00O0oOO$OooO00o */
    public static final class OooO00o {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final PrecomputedText.Params f19379OooO00o;
        @Nullable

        /* renamed from: OooO00o  reason: collision with other field name */
        public final TextDirectionHeuristic f19380OooO00o;
        @NonNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final TextPaint f19381OooO00o;
        public final int OooO0O0;

        /* renamed from: com.pd.sdk.o00O0oOO$OooO00o$OooO00o  reason: collision with other inner class name */
        public static class C4953OooO00o {
            public int OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public TextDirectionHeuristic f19382OooO00o;
            @NonNull

            /* renamed from: OooO00o  reason: collision with other field name */
            public final TextPaint f19383OooO00o;
            public int OooO0O0;

            public C4953OooO00o(@NonNull TextPaint textPaint) {
                this.f19383OooO00o = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.OooO00o = 1;
                    this.OooO0O0 = 1;
                } else {
                    this.OooO0O0 = 0;
                    this.OooO00o = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f19382OooO00o = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f19382OooO00o = null;
                }
            }

            @RequiresApi(23)
            public C4953OooO00o OooO00o(int i) {
                this.OooO00o = i;
                return this;
            }

            @RequiresApi(23)
            public C4953OooO00o OooO0O0(int i) {
                this.OooO0O0 = i;
                return this;
            }

            @RequiresApi(18)
            public C4953OooO00o OooO00o(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.f19382OooO00o = textDirectionHeuristic;
                return this;
            }

            @NonNull
            public OooO00o OooO00o() {
                return new OooO00o(this.f19383OooO00o, this.f19382OooO00o, this.OooO00o, this.OooO0O0);
            }
        }

        public OooO00o(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f19379OooO00o = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f19379OooO00o = null;
            }
            this.f19381OooO00o = textPaint;
            this.f19380OooO00o = textDirectionHeuristic;
            this.OooO00o = i;
            this.OooO0O0 = i2;
        }

        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public TextPaint m18362OooO00o() {
            return this.f19381OooO00o;
        }

        @RequiresApi(23)
        public int OooO0O0() {
            return this.OooO0O0;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            PrecomputedText.Params params = this.f19379OooO00o;
            if (params != null) {
                return params.equals(oooO00o.f19379OooO00o);
            }
            if (Build.VERSION.SDK_INT >= 23 && (this.OooO00o != oooO00o.OooO00o() || this.OooO0O0 != oooO00o.OooO0O0())) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 18 && this.f19380OooO00o != oooO00o.m18361OooO00o()) || this.f19381OooO00o.getTextSize() != oooO00o.m18362OooO00o().getTextSize() || this.f19381OooO00o.getTextScaleX() != oooO00o.m18362OooO00o().getTextScaleX() || this.f19381OooO00o.getTextSkewX() != oooO00o.m18362OooO00o().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f19381OooO00o.getLetterSpacing() != oooO00o.m18362OooO00o().getLetterSpacing() || !TextUtils.equals(this.f19381OooO00o.getFontFeatureSettings(), oooO00o.m18362OooO00o().getFontFeatureSettings()))) || this.f19381OooO00o.getFlags() != oooO00o.m18362OooO00o().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f19381OooO00o.getTextLocales().equals(oooO00o.m18362OooO00o().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f19381OooO00o.getTextLocale().equals(oooO00o.m18362OooO00o().getTextLocale())) {
                return false;
            }
            if (this.f19381OooO00o.getTypeface() == null) {
                if (oooO00o.m18362OooO00o().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f19381OooO00o.getTypeface().equals(oooO00o.m18362OooO00o().getTypeface())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C7080o00OO0.OooO00o(Float.valueOf(this.f19381OooO00o.getTextSize()), Float.valueOf(this.f19381OooO00o.getTextScaleX()), Float.valueOf(this.f19381OooO00o.getTextSkewX()), Float.valueOf(this.f19381OooO00o.getLetterSpacing()), Integer.valueOf(this.f19381OooO00o.getFlags()), this.f19381OooO00o.getTextLocales(), this.f19381OooO00o.getTypeface(), Boolean.valueOf(this.f19381OooO00o.isElegantTextHeight()), this.f19380OooO00o, Integer.valueOf(this.OooO00o), Integer.valueOf(this.OooO0O0));
            } else if (i >= 21) {
                return C7080o00OO0.OooO00o(Float.valueOf(this.f19381OooO00o.getTextSize()), Float.valueOf(this.f19381OooO00o.getTextScaleX()), Float.valueOf(this.f19381OooO00o.getTextSkewX()), Float.valueOf(this.f19381OooO00o.getLetterSpacing()), Integer.valueOf(this.f19381OooO00o.getFlags()), this.f19381OooO00o.getTextLocale(), this.f19381OooO00o.getTypeface(), Boolean.valueOf(this.f19381OooO00o.isElegantTextHeight()), this.f19380OooO00o, Integer.valueOf(this.OooO00o), Integer.valueOf(this.OooO0O0));
            } else if (i >= 18) {
                return C7080o00OO0.OooO00o(Float.valueOf(this.f19381OooO00o.getTextSize()), Float.valueOf(this.f19381OooO00o.getTextScaleX()), Float.valueOf(this.f19381OooO00o.getTextSkewX()), Integer.valueOf(this.f19381OooO00o.getFlags()), this.f19381OooO00o.getTextLocale(), this.f19381OooO00o.getTypeface(), this.f19380OooO00o, Integer.valueOf(this.OooO00o), Integer.valueOf(this.OooO0O0));
            } else if (i >= 17) {
                return C7080o00OO0.OooO00o(Float.valueOf(this.f19381OooO00o.getTextSize()), Float.valueOf(this.f19381OooO00o.getTextScaleX()), Float.valueOf(this.f19381OooO00o.getTextSkewX()), Integer.valueOf(this.f19381OooO00o.getFlags()), this.f19381OooO00o.getTextLocale(), this.f19381OooO00o.getTypeface(), this.f19380OooO00o, Integer.valueOf(this.OooO00o), Integer.valueOf(this.OooO0O0));
            } else {
                return C7080o00OO0.OooO00o(Float.valueOf(this.f19381OooO00o.getTextSize()), Float.valueOf(this.f19381OooO00o.getTextScaleX()), Float.valueOf(this.f19381OooO00o.getTextSkewX()), Integer.valueOf(this.f19381OooO00o.getFlags()), this.f19381OooO00o.getTypeface(), this.f19380OooO00o, Integer.valueOf(this.OooO00o), Integer.valueOf(this.OooO0O0));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f19381OooO00o.getTextSize());
            sb.append(", textScaleX=" + this.f19381OooO00o.getTextScaleX());
            sb.append(", textSkewX=" + this.f19381OooO00o.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.f19381OooO00o.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f19381OooO00o.isElegantTextHeight());
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                sb.append(", textLocale=" + this.f19381OooO00o.getTextLocales());
            } else if (i >= 17) {
                sb.append(", textLocale=" + this.f19381OooO00o.getTextLocale());
            }
            sb.append(", typeface=" + this.f19381OooO00o.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f19381OooO00o.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f19380OooO00o);
            sb.append(", breakStrategy=" + this.OooO00o);
            sb.append(", hyphenationFrequency=" + this.OooO0O0);
            sb.append(C7522o0Ooo0o.OooO0Oo);
            return sb.toString();
        }

        @Nullable
        @RequiresApi(18)
        /* renamed from: OooO00o  reason: collision with other method in class */
        public TextDirectionHeuristic m18361OooO00o() {
            return this.f19380OooO00o;
        }

        @RequiresApi(23)
        public int OooO00o() {
            return this.OooO00o;
        }

        @RequiresApi(28)
        public OooO00o(@NonNull PrecomputedText.Params params) {
            this.f19381OooO00o = params.getTextPaint();
            this.f19380OooO00o = params.getTextDirection();
            this.OooO00o = params.getBreakStrategy();
            this.OooO0O0 = params.getHyphenationFrequency();
            this.f19379OooO00o = params;
        }
    }

    /* renamed from: com.pd.sdk.o00O0oOO$OooO0O0 */
    public static class OooO0O0 extends FutureTask<C7072o00O0oOO> {

        /* renamed from: com.pd.sdk.o00O0oOO$OooO0O0$OooO00o */
        public static class OooO00o implements Callable<C7072o00O0oOO> {
            public OooO00o OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public CharSequence f19384OooO00o;

            public OooO00o(@NonNull OooO00o oooO00o, @NonNull CharSequence charSequence) {
                this.OooO00o = oooO00o;
                this.f19384OooO00o = charSequence;
            }

            /* renamed from: OooO00o */
            public C7072o00O0oOO call() throws Exception {
                return C7072o00O0oOO.OooO00o(this.f19384OooO00o, this.OooO00o);
            }
        }

        public OooO0O0(@NonNull OooO00o oooO00o, @NonNull CharSequence charSequence) {
            super(new OooO00o(oooO00o, charSequence));
        }
    }

    public C7072o00O0oOO(@NonNull CharSequence charSequence, @NonNull OooO00o oooO00o, @NonNull int[] iArr) {
        this.f19376OooO00o = new SpannableString(charSequence);
        this.f19377OooO00o = oooO00o;
        this.f19378OooO00o = iArr;
        this.f19375OooO00o = null;
    }

    public static C7072o00O0oOO OooO00o(@NonNull CharSequence charSequence, @NonNull OooO00o oooO00o) {
        C7086o00OO0OO.OooO00o((Object) charSequence);
        C7086o00OO0OO.OooO00o(oooO00o);
        try {
            C7067o00O0o00.OooO00o("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 28 && oooO00o.f19379OooO00o != null) {
                return new C7072o00O0oOO(PrecomputedText.create(charSequence, oooO00o.f19379OooO00o), oooO00o);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int indexOf = TextUtils.indexOf(charSequence, '\n', i, length);
                i = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), oooO00o.m18362OooO00o(), Integer.MAX_VALUE).setBreakStrategy(oooO00o.OooO00o()).setHyphenationFrequency(oooO00o.OooO0O0()).setTextDirection(oooO00o.m18361OooO00o()).build();
            } else if (Build.VERSION.SDK_INT >= 21) {
                new StaticLayout(charSequence, oooO00o.m18362OooO00o(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            C7072o00O0oOO o00o0ooo = new C7072o00O0oOO(charSequence, oooO00o, iArr);
            C7067o00O0o00.OooO00o();
            return o00o0ooo;
        } finally {
            C7067o00O0o00.OooO00o();
        }
    }

    private int OooO0OO(@IntRange(from = 0) int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f19378OooO00o;
            if (i2 >= iArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("pos must be less than ");
                int[] iArr2 = this.f19378OooO00o;
                sb.append(iArr2[iArr2.length - 1]);
                sb.append(", gave ");
                sb.append(i);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i < iArr[i2]) {
                return i2;
            } else {
                i2++;
            }
        }
    }

    @IntRange(from = 0)
    public int OooO0O0(@IntRange(from = 0) int i) {
        C7086o00OO0OO.OooO00o(i, 0, OooO00o(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f19375OooO00o.getParagraphStart(i);
        }
        if (i == 0) {
            return 0;
        }
        return this.f19378OooO00o[i - 1];
    }

    public char charAt(int i) {
        return this.f19376OooO00o.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f19376OooO00o.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f19376OooO00o.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f19376OooO00o.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 28 ? (T[]) this.f19375OooO00o.getSpans(i, i2, cls) : (T[]) this.f19376OooO00o.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f19376OooO00o.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f19376OooO00o.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f19375OooO00o.removeSpan(obj);
        } else {
            this.f19376OooO00o.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f19375OooO00o.setSpan(obj, i, i2, i3);
        } else {
            this.f19376OooO00o.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f19376OooO00o.subSequence(i, i2);
    }

    public String toString() {
        return this.f19376OooO00o.toString();
    }

    @RequiresApi(28)
    public C7072o00O0oOO(@NonNull PrecomputedText precomputedText, @NonNull OooO00o oooO00o) {
        this.f19376OooO00o = precomputedText;
        this.f19377OooO00o = oooO00o;
        this.f19378OooO00o = null;
        this.f19375OooO00o = precomputedText;
    }

    @Nullable
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public PrecomputedText m18359OooO00o() {
        Spannable spannable = this.f19376OooO00o;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO00o m18360OooO00o() {
        return this.f19377OooO00o;
    }

    @IntRange(from = 0)
    public int OooO00o() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f19375OooO00o.getParagraphCount();
        }
        return this.f19378OooO00o.length;
    }

    @IntRange(from = 0)
    public int OooO00o(@IntRange(from = 0) int i) {
        C7086o00OO0OO.OooO00o(i, 0, OooO00o(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f19375OooO00o.getParagraphEnd(i);
        }
        return this.f19378OooO00o[i];
    }

    @UiThread
    public static Future<C7072o00O0oOO> OooO00o(@NonNull CharSequence charSequence, @NonNull OooO00o oooO00o, @Nullable Executor executor) {
        OooO0O0 oooO0O0 = new OooO0O0(oooO00o, charSequence);
        if (executor == null) {
            synchronized (f19373OooO00o) {
                if (f19374OooO00o == null) {
                    f19374OooO00o = Executors.newFixedThreadPool(1);
                }
                executor = f19374OooO00o;
            }
        }
        executor.execute(oooO0O0);
        return oooO0O0;
    }
}
