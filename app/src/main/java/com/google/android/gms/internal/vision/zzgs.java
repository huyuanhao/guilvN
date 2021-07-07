package com.google.android.gms.internal.vision;

import java.util.List;

public final class zzgs extends zzgp {
    public zzgs() {
        super();
    }

    public static <E> zzge<E> zzd(Object obj, long j) {
        return (zzge) zziu.zzp(obj, j);
    }

    @Override // com.google.android.gms.internal.vision.zzgp
    public final <L> List<L> zza(Object obj, long j) {
        zzge zzd = zzd(obj, j);
        if (zzd.zzch()) {
            return zzd;
        }
        int size = zzd.size();
        zzge zzah = zzd.zzah(size == 0 ? 10 : size << 1);
        zziu.zza(obj, j, zzah);
        return zzah;
    }

    @Override // com.google.android.gms.internal.vision.zzgp
    public final void zzb(Object obj, long j) {
        zzd(obj, j).zzci();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.vision.zzgp
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzge<E> zzd = zzd(obj, j);
        zzge<E> zzd2 = zzd(obj2, j);
        int size = zzd.size();
        int size2 = zzd2.size();
        zzge<E> zzge = zzd;
        zzge = zzd;
        if (size > 0 && size2 > 0) {
            boolean zzch = zzd.zzch();
            zzge<E> zzge2 = zzd;
            if (!zzch) {
                zzge2 = zzd.zzah(size2 + size);
            }
            zzge2.addAll(zzd2);
            zzge = zzge2;
        }
        if (size > 0) {
            zzd2 = zzge;
        }
        zziu.zza(obj, j, zzd2);
    }
}
