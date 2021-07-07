package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzc implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.zzb zza(Context context, String str, DynamiteModule.VersionPolicy.zza zza) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zzb zzb = new DynamiteModule.VersionPolicy.zzb();
        int localVersion = zza.getLocalVersion(context, str);
        zzb.zziq = localVersion;
        if (localVersion != 0) {
            zzb.zzis = -1;
        } else {
            int zza2 = zza.zza(context, str, true);
            zzb.zzir = zza2;
            if (zza2 != 0) {
                zzb.zzis = 1;
            }
        }
        return zzb;
    }
}
