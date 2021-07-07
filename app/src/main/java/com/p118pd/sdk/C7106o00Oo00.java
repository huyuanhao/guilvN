package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
import androidx.annotation.RestrictTo;

/* renamed from: com.pd.sdk.o00Oo00  reason: case insensitive filesystem */
public final class C7106o00Oo00 {
    public static final int OooO = 1008;
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1000;
    public static final int OooO0OO = 1001;
    public static final int OooO0Oo = 1002;
    public static final int OooO0o = 1004;
    public static final int OooO0o0 = 1003;
    public static final int OooO0oO = 1006;
    public static final int OooO0oo = 1007;
    public static final int OooOO0 = 1009;
    public static final int OooOO0O = 1010;
    public static final int OooOO0o = 1011;
    public static final int OooOOO = 1013;
    public static final int OooOOO0 = 1012;
    public static final int OooOOOO = 1014;
    public static final int OooOOOo = 1015;
    public static final int OooOOo = 1017;
    public static final int OooOOo0 = 1016;
    public static final int OooOOoo = 1018;
    public static final int OooOo0 = 1020;
    public static final int OooOo00 = 1019;
    public static final int OooOo0O = 1021;
    public static final int OooOo0o = 1000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f19441OooO00o;

    public C7106o00Oo00(Object obj) {
        this.f19441OooO00o = obj;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Object OooO00o() {
        return this.f19441OooO00o;
    }

    public static C7106o00Oo00 OooO00o(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C7106o00Oo00(PointerIcon.getSystemIcon(context, i));
        }
        return new C7106o00Oo00(null);
    }

    public static C7106o00Oo00 OooO00o(Bitmap bitmap, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C7106o00Oo00(PointerIcon.create(bitmap, f, f2));
        }
        return new C7106o00Oo00(null);
    }

    public static C7106o00Oo00 OooO00o(Resources resources, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C7106o00Oo00(PointerIcon.load(resources, i));
        }
        return new C7106o00Oo00(null);
    }
}
