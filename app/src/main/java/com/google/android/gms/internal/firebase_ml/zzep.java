package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public class zzep implements zzeq {
    public final String key;
    public final String zztk;

    public zzep() {
        this(null);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzeq
    public void zza(zzem<?> zzem) throws IOException {
        String str = this.key;
        if (str != null) {
            zzem.put("key", str);
        }
    }

    public zzep(String str) {
        this(str, null);
    }

    public zzep(String str, String str2) {
        this.key = str;
        this.zztk = null;
    }
}
