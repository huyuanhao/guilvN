package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public final class zzez extends zzex<zzey, zzey> {
    public static void zza(Object obj, zzey zzey) {
        ((zzcg) obj).zzjp = zzey;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, long] */
    @Override // com.google.android.gms.internal.clearcut.zzex
    public final /* synthetic */ void zza(zzey zzey, int i, long j) {
        zzey.zzb(i << 3, Long.valueOf(j));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, com.google.android.gms.internal.clearcut.zzbb] */
    @Override // com.google.android.gms.internal.clearcut.zzex
    public final /* synthetic */ void zza(zzey zzey, int i, zzbb zzbb) {
        zzey.zzb((i << 3) | 2, zzbb);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.google.android.gms.internal.clearcut.zzfr] */
    @Override // com.google.android.gms.internal.clearcut.zzex
    public final /* synthetic */ void zza(zzey zzey, zzfr zzfr) throws IOException {
        zzey.zzb(zzfr);
    }

    @Override // com.google.android.gms.internal.clearcut.zzex
    public final void zzc(Object obj) {
        ((zzcg) obj).zzjp.zzv();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.google.android.gms.internal.clearcut.zzfr] */
    @Override // com.google.android.gms.internal.clearcut.zzex
    public final /* synthetic */ void zzc(zzey zzey, zzfr zzfr) throws IOException {
        zzey.zza(zzfr);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.clearcut.zzex
    public final /* synthetic */ zzey zzdz() {
        return zzey.zzeb();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.zzex
    public final /* synthetic */ void zze(Object obj, zzey zzey) {
        zza(obj, zzey);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.zzex
    public final /* synthetic */ void zzf(Object obj, zzey zzey) {
        zza(obj, zzey);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.zzex
    public final /* synthetic */ zzey zzg(zzey zzey, zzey zzey2) {
        zzey zzey3 = zzey;
        zzey zzey4 = zzey2;
        return zzey4.equals(zzey.zzea()) ? zzey3 : zzey.zza(zzey3, zzey4);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.zzex
    public final /* synthetic */ int zzm(zzey zzey) {
        return zzey.zzas();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.clearcut.zzex
    public final /* synthetic */ zzey zzq(Object obj) {
        return ((zzcg) obj).zzjp;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.zzex
    public final /* synthetic */ int zzr(zzey zzey) {
        return zzey.zzec();
    }
}
