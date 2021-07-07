package com.p118pd.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* renamed from: com.pd.sdk.OooOOO0  reason: case insensitive filesystem */
public final class C5945OooOOO0 {
    public static final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f17088OooO00o = "AppCompatResources";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ThreadLocal<TypedValue> f17089OooO00o = new ThreadLocal<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final WeakHashMap<Context, SparseArray<OooO00o>> f17090OooO00o = new WeakHashMap<>(0);

    /* renamed from: com.pd.sdk.OooOOO0$OooO00o */
    public static class OooO00o {
        public final ColorStateList OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Configuration f17091OooO00o;

        public OooO00o(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration) {
            this.OooO00o = colorStateList;
            this.f17091OooO00o = configuration;
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Drawable m16716OooO00o(@NonNull Context context, @DrawableRes int i) {
        return C5994Oooooo0.OooO00o().m16833OooO00o(context, i);
    }

    public static ColorStateList OooO0O0(@NonNull Context context, @ColorRes int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList OooO00o2 = OooO00o(context, i);
        if (OooO00o2 != null) {
            return OooO00o2;
        }
        ColorStateList OooO0OO = OooO0OO(context, i);
        if (OooO0OO == null) {
            return C7009o000OoOo.m18255OooO00o(context, i);
        }
        OooO00o(context, i, OooO0OO);
        return OooO0OO;
    }

    @Nullable
    public static ColorStateList OooO0OO(Context context, int i) {
        if (m16717OooO00o(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C9215oooo00o.OooO00o(resources, resources.getXml(i), context.getTheme());
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static ColorStateList OooO00o(@NonNull Context context, @ColorRes int i) {
        OooO00o oooO00o;
        synchronized (OooO00o) {
            SparseArray<OooO00o> sparseArray = f17090OooO00o.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (oooO00o = sparseArray.get(i)) == null)) {
                if (oooO00o.f17091OooO00o.equals(context.getResources().getConfiguration())) {
                    return oooO00o.OooO00o;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static void OooO00o(@NonNull Context context, @ColorRes int i, @NonNull ColorStateList colorStateList) {
        synchronized (OooO00o) {
            SparseArray<OooO00o> sparseArray = f17090OooO00o.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f17090OooO00o.put(context, sparseArray);
            }
            sparseArray.append(i, new OooO00o(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m16717OooO00o(@NonNull Context context, @ColorRes int i) {
        Resources resources = context.getResources();
        TypedValue OooO00o2 = OooO00o();
        resources.getValue(i, OooO00o2, true);
        int i2 = OooO00o2.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    @NonNull
    public static TypedValue OooO00o() {
        TypedValue typedValue = f17089OooO00o.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f17089OooO00o.set(typedValue2);
        return typedValue2;
    }
}
