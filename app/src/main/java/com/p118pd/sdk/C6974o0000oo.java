package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* renamed from: com.pd.sdk.o0000oo  reason: case insensitive filesystem */
public class C6974o0000oo extends C6942o00000O0 {
    public final WeakReference<Context> OooO00o;

    public C6974o0000oo(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.OooO00o = new WeakReference<>(context);
    }

    @Override // com.p118pd.sdk.C6942o00000O0, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = this.OooO00o.get();
        if (!(drawable == null || context == null)) {
            C5994Oooooo0.OooO00o();
            C5994Oooooo0.OooO00o(context, i, drawable);
        }
        return drawable;
    }
}
