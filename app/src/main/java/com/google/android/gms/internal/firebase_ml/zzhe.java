package com.google.android.gms.internal.firebase_ml;

import java.util.Comparator;

public final class zzhe implements Comparator<String> {
    public zzhe(zzhd zzhd) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (zzkn.equal(str3, str4)) {
            return 0;
        }
        if (str3 == null) {
            return -1;
        }
        if (str4 == null) {
            return 1;
        }
        return str3.compareTo(str4);
    }
}
