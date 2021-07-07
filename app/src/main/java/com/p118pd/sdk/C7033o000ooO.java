package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import com.p118pd.sdk.C7023o000o0o0;
import com.xiaomi.mipush.sdk.Constants;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o000ooO  reason: case insensitive filesystem */
public class C7033o000ooO {
    public static final C6980o000O000<String, Typeface> OooO00o = new C6980o000O000<>(16);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C7039o000oooo f19299OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19300OooO00o = "TypefaceCompat";

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f19299OooO00o = new C7038o000oooO();
        } else if (i >= 26) {
            f19299OooO00o = new C7036o000ooo();
        } else if (i >= 24 && C7037o000ooo0.m18303OooO00o()) {
            f19299OooO00o = new C7037o000ooo0();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f19299OooO00o = new C7035o000ooOO();
        } else {
            f19299OooO00o = new C7039o000oooo();
        }
    }

    @Nullable
    public static Typeface OooO00o(@NonNull Resources resources, int i, int i2) {
        return OooO00o.get(m18297OooO00o(resources, i, i2));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m18297OooO00o(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i2;
    }

    @Nullable
    public static Typeface OooO00o(@NonNull Context context, @NonNull FontResourcesParserCompat.OooO00o oooO00o, @NonNull Resources resources, int i, int i2, @Nullable C7023o000o0o0.OooO00o oooO00o2, @Nullable Handler handler, boolean z) {
        Typeface typeface;
        if (oooO00o instanceof FontResourcesParserCompat.C5032OooO0Oo) {
            FontResourcesParserCompat.C5032OooO0Oo oooO0Oo = (FontResourcesParserCompat.C5032OooO0Oo) oooO00o;
            boolean z2 = false;
            if (!z ? oooO00o2 == null : oooO0Oo.OooO00o() == 0) {
                z2 = true;
            }
            typeface = FontsContractCompat.OooO00o(context, oooO0Oo.m14549OooO00o(), oooO00o2, handler, z2, z ? oooO0Oo.OooO0O0() : -1, i2);
        } else {
            typeface = f19299OooO00o.OooO00o(context, (FontResourcesParserCompat.OooO0O0) oooO00o, resources, i2);
            if (oooO00o2 != null) {
                if (typeface != null) {
                    oooO00o2.OooO00o(typeface, handler);
                } else {
                    oooO00o2.OooO00o(-3, handler);
                }
            }
        }
        if (typeface != null) {
            OooO00o.put(m18297OooO00o(resources, i, i2), typeface);
        }
        return typeface;
    }

    @Nullable
    public static Typeface OooO00o(@NonNull Context context, @NonNull Resources resources, int i, String str, int i2) {
        Typeface OooO00o2 = f19299OooO00o.OooO00o(context, resources, i, str, i2);
        if (OooO00o2 != null) {
            OooO00o.put(m18297OooO00o(resources, i, i2), OooO00o2);
        }
        return OooO00o2;
    }

    @Nullable
    public static Typeface OooO00o(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.C5039OooO0oo[] oooO0ooArr, int i) {
        return f19299OooO00o.OooO00o(context, cancellationSignal, oooO0ooArr, i);
    }
}
