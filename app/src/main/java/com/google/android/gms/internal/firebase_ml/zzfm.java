package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzfm {
    public String content;
    public String message;
    public int statusCode;
    public zzfe zzuh;
    public String zzvb;

    public zzfm(int i, String str, zzfe zzfe) {
        zzks.checkArgument(i >= 0);
        this.statusCode = i;
        this.zzvb = str;
        this.zzuh = (zzfe) zzks.checkNotNull(zzfe);
    }

    public final zzfm zzah(String str) {
        this.message = str;
        return this;
    }

    public final zzfm zzai(String str) {
        this.content = str;
        return this;
    }

    public zzfm(zzfk zzfk) {
        this(zzfk.getStatusCode(), zzfk.getStatusMessage(), zzfk.zzfe());
        try {
            String zzfl = zzfk.zzfl();
            this.content = zzfl;
            if (zzfl.length() == 0) {
                this.content = null;
            }
        } catch (IOException e) {
            zzlx.zzb(e);
        }
        StringBuilder zzc = zzfl.zzc(zzfk);
        if (this.content != null) {
            zzc.append(zzhz.zzaae);
            zzc.append(this.content);
        }
        this.message = zzc.toString();
    }
}
