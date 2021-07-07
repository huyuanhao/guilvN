package com.p118pd.sdk;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oO00oOo  reason: case insensitive filesystem */
public abstract class AbstractC7832oO00oOo<T> extends AbstractC7828oO00oO0o<T> {
    public AbstractC7832oO00oOo(ImageView imageView) {
        super(imageView);
    }

    public abstract Drawable OooO00o(T t);

    @Override // com.p118pd.sdk.AbstractC7828oO00oO0o
    public void OooO0O0(@Nullable T t) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) ((oO0OO00O) this).f20916OooO00o).getLayoutParams();
        Drawable OooO00o = OooO00o((Object) t);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            OooO00o = new C8305oOo00ooo(OooO00o, layoutParams.width, layoutParams.height);
        }
        ((ImageView) ((oO0OO00O) this).f20916OooO00o).setImageDrawable(OooO00o);
    }

    @Deprecated
    public AbstractC7832oO00oOo(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
