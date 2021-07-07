package com.p118pd.sdk;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.pd.sdk.o000ooO0  reason: case insensitive filesystem */
public final class C7034o000ooO0 {
    @NonNull
    @RequiresApi(26)
    public static Collection<C7028o000oo> OooO00o(@NonNull Path path) {
        return OooO00o(path, 0.5f);
    }

    @NonNull
    @RequiresApi(26)
    public static Collection<C7028o000oo> OooO00o(@NonNull Path path, @FloatRange(from = 0.0d) float f) {
        float[] approximate = path.approximate(f);
        int length = approximate.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 1; i < length; i++) {
            int i2 = i * 3;
            int i3 = (i - 1) * 3;
            float f2 = approximate[i2];
            float f3 = approximate[i2 + 1];
            float f4 = approximate[i2 + 2];
            float f5 = approximate[i3];
            float f6 = approximate[i3 + 1];
            float f7 = approximate[i3 + 2];
            if (!(f2 == f5 || (f3 == f6 && f4 == f7))) {
                arrayList.add(new C7028o000oo(new PointF(f6, f7), f5, new PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }
}
