package com.google.android.gms.internal.clearcut;

public final class zzdb extends zzcy {
    public zzdb() {
        super();
    }

    public static <E> zzcn<E> zzc(Object obj, long j) {
        return (zzcn) zzfd.zzo(obj, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcy
    public final void zza(Object obj, long j) {
        zzc(obj, j).zzv();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.clearcut.zzcy
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzcn<E> zzc = zzc(obj, j);
        zzcn<E> zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzcn<E> zzcn = zzc;
        zzcn = zzc;
        if (size > 0 && size2 > 0) {
            boolean zzu = zzc.zzu();
            zzcn<E> zzcn2 = zzc;
            if (!zzu) {
                zzcn2 = zzc.zzi(size2 + size);
            }
            zzcn2.addAll(zzc2);
            zzcn = zzcn2;
        }
        if (size > 0) {
            zzc2 = zzcn;
        }
        zzfd.zza(obj, j, zzc2);
    }
}
