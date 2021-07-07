package com.google.android.gms.internal.firebase_ml;

import java.util.Comparator;

public final class zzsy implements Comparator<zzsw> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzsw zzsw, zzsw zzsw2) {
        zzsw zzsw3 = zzsw;
        zzsw zzsw4 = zzsw2;
        zztd zztd = (zztd) zzsw3.iterator();
        zztd zztd2 = (zztd) zzsw4.iterator();
        while (zztd.hasNext() && zztd2.hasNext()) {
            int compare = Integer.compare(zzsw.zzb(zztd.nextByte()), zzsw.zzb(zztd2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzsw3.size(), zzsw4.size());
    }
}
