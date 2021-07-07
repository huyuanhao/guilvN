package com.p118pd.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* renamed from: com.pd.sdk.o000o0o0  reason: case insensitive filesystem */
public final class C7023o000o0o0 {
    public static final String OooO00o = "ResourcesCompat";

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Drawable m18287OooO00o(@NonNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: com.pd.sdk.o000o0o0$OooO00o */
    public static abstract class OooO00o {

        /* renamed from: com.pd.sdk.o000o0o0$OooO00o$OooO00o  reason: collision with other inner class name */
        public class RunnableC4952OooO00o implements Runnable {
            public final /* synthetic */ Typeface OooO00o;

            public RunnableC4952OooO00o(Typeface typeface) {
                this.OooO00o = typeface;
            }

            public void run() {
                OooO00o.this.OooO00o(this.OooO00o);
            }
        }

        /* renamed from: com.pd.sdk.o000o0o0$OooO00o$OooO0O0 */
        public class OooO0O0 implements Runnable {
            public final /* synthetic */ int o00oO0O;

            public OooO0O0(int i) {
                this.o00oO0O = i;
            }

            public void run() {
                OooO00o.this.OooO00o(this.o00oO0O);
            }
        }

        public abstract void OooO00o(int i);

        public abstract void OooO00o(@NonNull Typeface typeface);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void OooO00o(Typeface typeface, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC4952OooO00o(typeface));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void OooO00o(int i, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new OooO0O0(i));
        }
    }

    @Nullable
    public static Drawable OooO00o(@NonNull Resources resources, @DrawableRes int i, int i2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
        if (i3 >= 15) {
            return resources.getDrawableForDensity(i, i2);
        }
        return resources.getDrawable(i);
    }

    @ColorInt
    public static int OooO00o(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ColorStateList m18286OooO00o(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, theme);
        }
        return resources.getColorStateList(i);
    }

    @Nullable
    public static Typeface OooO00o(@NonNull Context context, @FontRes int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return OooO00o(context, i, new TypedValue(), 0, null, null, false);
    }

    public static void OooO00o(@NonNull Context context, @FontRes int i, @NonNull OooO00o oooO00o, @Nullable Handler handler) throws Resources.NotFoundException {
        C7086o00OO0OO.OooO00o(oooO00o);
        if (context.isRestricted()) {
            oooO00o.OooO00o(-4, handler);
        } else {
            OooO00o(context, i, new TypedValue(), 0, oooO00o, handler, false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Typeface OooO00o(@NonNull Context context, @FontRes int i, TypedValue typedValue, int i2, @Nullable OooO00o oooO00o) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return OooO00o(context, i, typedValue, i2, oooO00o, null, true);
    }

    public static Typeface OooO00o(@NonNull Context context, int i, TypedValue typedValue, int i2, @Nullable OooO00o oooO00o, @Nullable Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface OooO00o2 = OooO00o(context, resources, typedValue, i, i2, oooO00o, handler, z);
        if (OooO00o2 != null || oooO00o != null) {
            return OooO00o2;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface OooO00o(@androidx.annotation.NonNull android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, @androidx.annotation.Nullable com.p118pd.sdk.C7023o000o0o0.OooO00o r18, @androidx.annotation.Nullable android.os.Handler r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7023o000o0o0.OooO00o(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, com.pd.sdk.o000o0o0$OooO00o, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
