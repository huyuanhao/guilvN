package com.p118pd.sdk;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;

/* renamed from: com.pd.sdk.o00O000  reason: case insensitive filesystem */
public final class C7042o00O000 {
    public static final String OooO00o = "RoundedBitmapDrawableFa";

    /* renamed from: com.pd.sdk.o00O000$OooO00o */
    public static class OooO00o extends AbstractC7209o00oOoo {
        public OooO00o(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // com.p118pd.sdk.AbstractC7209o00oOoo
        public void OooO00o(int i, int i2, int i3, Rect rect, Rect rect2) {
            C7092o00OOO0.OooO00o(i, i2, i3, rect, rect2, 0);
        }

        @Override // com.p118pd.sdk.AbstractC7209o00oOoo
        public boolean OooO0O0() {
            Bitmap bitmap = ((AbstractC7209o00oOoo) this).f19698OooO00o;
            return bitmap != null && C7030o000oo00.m18293OooO00o(bitmap);
        }

        @Override // com.p118pd.sdk.AbstractC7209o00oOoo
        public void OooO0OO(boolean z) {
            Bitmap bitmap = ((AbstractC7209o00oOoo) this).f19698OooO00o;
            if (bitmap != null) {
                C7030o000oo00.OooO00o(bitmap, z);
                invalidateSelf();
            }
        }
    }

    @NonNull
    public static AbstractC7209o00oOoo OooO00o(@NonNull Resources resources, @Nullable Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C7353o0O0ooO(resources, bitmap);
        }
        return new OooO00o(resources, bitmap);
    }

    @NonNull
    public static AbstractC7209o00oOoo OooO00o(@NonNull Resources resources, @NonNull String str) {
        AbstractC7209o00oOoo OooO00o2 = OooO00o(resources, BitmapFactory.decodeFile(str));
        if (OooO00o2.m18692OooO00o() == null) {
            String str2 = "RoundedBitmapDrawable cannot decode " + str;
        }
        return OooO00o2;
    }

    @NonNull
    public static AbstractC7209o00oOoo OooO00o(@NonNull Resources resources, @NonNull InputStream inputStream) {
        AbstractC7209o00oOoo OooO00o2 = OooO00o(resources, BitmapFactory.decodeStream(inputStream));
        if (OooO00o2.m18692OooO00o() == null) {
            String str = "RoundedBitmapDrawable cannot decode " + inputStream;
        }
        return OooO00o2;
    }
}
