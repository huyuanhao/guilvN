package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.Lock;

/* renamed from: com.pd.sdk.oO000o0  reason: case insensitive filesystem */
public final class C7784oO000o0 {
    public static final AbstractC7711o0ooO0OO OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20824OooO00o = "DrawableToBitmap";

    /* renamed from: com.pd.sdk.oO000o0$OooO00o */
    public class OooO00o extends C7712o0ooO0Oo {
        @Override // com.p118pd.sdk.C7712o0ooO0Oo, com.p118pd.sdk.AbstractC7711o0ooO0OO
        public void OooO00o(Bitmap bitmap) {
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC7700o0oo0oo0<Bitmap> m19440OooO00o(AbstractC7711o0ooO0OO o0ooo0oo, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = OooO00o(o0ooo0oo, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            o0ooo0oo = OooO00o;
        }
        return C7875oO0OOo0o.OooO00o(bitmap, o0ooo0oo);
    }

    @Nullable
    public static Bitmap OooO00o(AbstractC7711o0ooO0OO o0ooo0oo, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(f20824OooO00o, 5)) {
                String str = "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock OooO00o2 = C7790oO000oOo.OooO00o();
            OooO00o2.lock();
            Bitmap OooO00o3 = o0ooo0oo.OooO00o(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(OooO00o3);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return OooO00o3;
            } finally {
                OooO00o2.unlock();
            }
        } else {
            if (Log.isLoggable(f20824OooO00o, 5)) {
                String str2 = "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
            }
            return null;
        }
    }
}
