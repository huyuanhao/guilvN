package com.google.android.gms.internal.firebase_ml;

public final class zzvb extends zzuy {
    public zzvb() {
        super();
    }

    public static <E> zzun<E> zzd(Object obj, long j) {
        return (zzun) zzxc.zzp(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.firebase_ml.zzuy
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzun<E> zzd = zzd(obj, j);
        zzun<E> zzd2 = zzd(obj2, j);
        int size = zzd.size();
        int size2 = zzd2.size();
        zzun<E> zzun = zzd;
        zzun = zzd;
        if (size > 0 && size2 > 0) {
            boolean zzps = zzd.zzps();
            zzun<E> zzun2 = zzd;
            if (!zzps) {
                zzun2 = zzd.zzck(size2 + size);
            }
            zzun2.addAll(zzd2);
            zzun = zzun2;
        }
        if (size > 0) {
            zzd2 = zzun;
        }
        zzxc.zza(obj, j, zzd2);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzuy
    public final void zzb(Object obj, long j) {
        zzd(obj, j).zzpt();
    }
}
