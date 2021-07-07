package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.C9058ooOoOoOO;

public final class zzeh {
    public static final String VERSION;
    public static final Integer zzsg = 1;
    public static final Integer zzsh = 26;
    public static final Integer zzsi = 0;

    static {
        String valueOf = String.valueOf(zzsg);
        String valueOf2 = String.valueOf(zzsh);
        String valueOf3 = String.valueOf(zzsi);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(valueOf);
        sb.append(C9058ooOoOoOO.OooOO0);
        sb.append(valueOf2);
        sb.append(C9058ooOoOoOO.OooOO0);
        sb.append(valueOf3);
        sb.append("-SNAPSHOT");
        VERSION = sb.toString().toString();
    }
}
