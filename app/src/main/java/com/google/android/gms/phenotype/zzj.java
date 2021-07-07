package com.google.android.gms.phenotype;

import java.util.Comparator;

public final class zzj implements Comparator<zzi> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzi zzi, zzi zzi2) {
        zzi zzi3 = zzi;
        zzi zzi4 = zzi2;
        int i = zzi3.zzah;
        int i2 = zzi4.zzah;
        return i == i2 ? zzi3.name.compareTo(zzi4.name) : i - i2;
    }
}
