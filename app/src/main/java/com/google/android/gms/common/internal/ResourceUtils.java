package com.google.android.gms.common.internal;

import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class ResourceUtils {
    public static final Uri zzet = new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath("drawable").build();
}
