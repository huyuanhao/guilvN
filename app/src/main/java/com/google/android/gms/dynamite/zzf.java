package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzf implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.zzb zza(Context context, String str, DynamiteModule.VersionPolicy.zza zza) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zzb zzb = new DynamiteModule.VersionPolicy.zzb();
        zzb.zziq = zza.getLocalVersion(context, str);
        int zza2 = zza.zza(context, str, true);
        zzb.zzir = zza2;
        if (zzb.zziq == 0 && zza2 == 0) {
            zzb.zzis = 0;
        } else if (zzb.zzir >= zzb.zziq) {
            zzb.zzis = 1;
        } else {
            zzb.zzis = -1;
        }
        return zzb;
    }
}
