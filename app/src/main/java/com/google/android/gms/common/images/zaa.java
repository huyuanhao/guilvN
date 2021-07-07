package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;

public abstract class zaa {
    public final zab zamu;
    public int zamv = 0;
    public int zamw = 0;
    public boolean zamx = false;
    public boolean zamy = true;
    public boolean zamz = false;
    public boolean zana = true;

    public zaa(Uri uri, int i) {
        this.zamu = new zab(uri);
        this.zamw = i;
    }

    public final void zaa(Context context, Bitmap bitmap, boolean z) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    public abstract void zaa(Drawable drawable, boolean z, boolean z2, boolean z3);

    public final void zaa(Context context, zak zak) {
        if (this.zana) {
            zaa(null, false, true, false);
        }
    }

    public final void zaa(Context context, zak zak, boolean z) {
        int i = this.zamw;
        zaa(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    public final boolean zaa(boolean z, boolean z2) {
        return this.zamy && !z2 && !z;
    }
}
