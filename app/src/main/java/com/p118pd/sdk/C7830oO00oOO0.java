package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.oO00oOO0  reason: case insensitive filesystem */
public class C7830oO00oOO0 {
    @NonNull
    public <Z> oO0OO00O<ImageView, Z> OooO00o(@NonNull ImageView imageView, @NonNull Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C7825oO00oO0(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C7827oO00oO0O(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
