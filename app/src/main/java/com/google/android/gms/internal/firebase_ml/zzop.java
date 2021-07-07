package com.google.android.gms.internal.firebase_ml;

import android.net.Uri;
import androidx.annotation.NonNull;

public final class zzop {
    public final String zzaqg;
    public final Uri zzaqy;
    public final String zzaqz;
    public final zzok zzara;

    public zzop(@NonNull String str, @NonNull Uri uri, @NonNull String str2, @NonNull zzok zzok) {
        this.zzaqg = str;
        this.zzaqy = uri;
        this.zzaqz = str2;
        this.zzara = zzok;
    }

    public final String getModelName() {
        return this.zzaqg;
    }

    public final String zzmd() {
        return this.zzaqz;
    }

    public final zzok zzme() {
        return this.zzara;
    }
}
