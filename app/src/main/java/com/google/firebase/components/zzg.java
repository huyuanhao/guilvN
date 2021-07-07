package com.google.firebase.components;

import java.util.HashSet;
import java.util.Set;

public final class zzg {
    public final Component<?> zza;
    public final Set<zzg> zzb = new HashSet();
    public final Set<zzg> zzc = new HashSet();

    public zzg(Component<?> component) {
        this.zza = component;
    }

    public final void zza(zzg zzg) {
        this.zzb.add(zzg);
    }

    public final void zzb(zzg zzg) {
        this.zzc.add(zzg);
    }

    public final void zzc(zzg zzg) {
        this.zzc.remove(zzg);
    }

    public final boolean zzd() {
        return this.zzb.isEmpty();
    }

    public final Set<zzg> zza() {
        return this.zzb;
    }

    public final Component<?> zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzc.isEmpty();
    }
}
