package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.pd.sdk.oO0OoooO  reason: case insensitive filesystem */
public class C7913oO0OoooO extends AbstractC7832oO00oOo<Bitmap> {
    public C7913oO0OoooO(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public C7913oO0OoooO(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    public Drawable OooO00o(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) ((oO0OO00O) this).f20916OooO00o).getResources(), bitmap);
    }
}
