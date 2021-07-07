package com.google.android.gms.vision.label;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
public class ImageLabel {
    public final String label;
    public final String zzdn;
    public final float zzdo;

    public ImageLabel(String str, String str2, float f) {
        this.zzdn = str;
        this.label = str2;
        this.zzdo = f;
    }

    @KeepForSdk
    public float getConfidence() {
        return this.zzdo;
    }

    @KeepForSdk
    public String getLabel() {
        return this.label;
    }

    @KeepForSdk
    public String getMid() {
        return this.zzdn;
    }
}
