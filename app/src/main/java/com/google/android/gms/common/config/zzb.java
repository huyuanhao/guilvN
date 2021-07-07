package com.google.android.gms.common.config;

import com.google.android.gms.common.config.GservicesValue;

public final class zzb extends GservicesValue<Long> {
    public zzb(String str, Long l) {
        super(str, l);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.common.config.GservicesValue
    public final /* synthetic */ Long zzd(String str) {
        GservicesValue.zza zza = null;
        return zza.getLong(this.mKey, this.zzbq);
    }
}
