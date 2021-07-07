package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

public abstract class zzfo {
    public static final Logger zzve = Logger.getLogger(zzfo.class.getName());
    public static final String[] zzvf;

    static {
        String[] strArr = {"DELETE", "GET", "POST", "PUT"};
        zzvf = strArr;
        Arrays.sort(strArr);
    }

    public final zzfi zza(zzfj zzfj) {
        return new zzfi(this, zzfj);
    }

    public boolean zzaj(String str) throws IOException {
        return Arrays.binarySearch(zzvf, str) >= 0;
    }

    public abstract zzfp zzc(String str, String str2) throws IOException;
}
