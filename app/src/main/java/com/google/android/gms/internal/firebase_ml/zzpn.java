package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public final class zzpn implements zznp {
    public final List<zzjc> features;
    public final zzjf imageContext;
    public final byte[] zzawk;
    public final float zzawl;

    public zzpn(@NonNull byte[] bArr, float f, @NonNull List<zzjc> list, @Nullable zzjf zzjf) {
        this.zzawk = bArr;
        this.zzawl = f;
        this.features = list;
        this.imageContext = zzjf;
    }
}
