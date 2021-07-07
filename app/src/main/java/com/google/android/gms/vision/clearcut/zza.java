package com.google.android.gms.vision.clearcut;

import com.google.android.gms.internal.vision.zzdu;

public final class zza implements Runnable {
    public final /* synthetic */ int zzbr;
    public final /* synthetic */ zzdu zzbs;
    public final /* synthetic */ DynamiteClearcutLogger zzbt;

    public zza(DynamiteClearcutLogger dynamiteClearcutLogger, int i, zzdu zzdu) {
        this.zzbt = dynamiteClearcutLogger;
        this.zzbr = i;
        this.zzbs = zzdu;
    }

    public final void run() {
        DynamiteClearcutLogger.zza(this.zzbt).zzb(this.zzbr, this.zzbs);
    }
}
