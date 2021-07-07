package com.p118pd.sdk;

import android.content.Context;
import android.os.Build;

/* renamed from: com.pd.sdk.iLiL1L  reason: case insensitive filesystem */
public abstract class AbstractC6180iLiL1L {
    public static AbstractC6180iLiL1L OooO00o(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 9) {
            return new C11ILl1(context);
        }
        if (i < 14) {
            return new C9483LIIi(context);
        }
        return new LiLI1Li(context);
    }

    public abstract int OooO00o();

    public abstract void OooO00o(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    public abstract void OooO00o(boolean z);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m17139OooO00o();

    public abstract int OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public abstract boolean m17140OooO0O0();
}
