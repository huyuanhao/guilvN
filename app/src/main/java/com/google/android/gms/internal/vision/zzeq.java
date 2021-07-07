package com.google.android.gms.internal.vision;

import java.util.Comparator;

public final class zzeq implements Comparator<zzeo> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzeo zzeo, zzeo zzeo2) {
        zzeo zzeo3 = zzeo;
        zzeo zzeo4 = zzeo2;
        zzeu zzeu = (zzeu) zzeo3.iterator();
        zzeu zzeu2 = (zzeu) zzeo4.iterator();
        while (zzeu.hasNext() && zzeu2.hasNext()) {
            int compare = Integer.compare(zzeo.zza(zzeu.nextByte()), zzeo.zza(zzeu2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzeo3.size(), zzeo4.size());
    }
}
