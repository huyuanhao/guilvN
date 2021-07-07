package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzei implements zzfd, zzfj {
    public final boolean zzsj;

    public zzei() {
        this(false);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfj
    public final void zza(zzfh zzfh) {
        zzfh.zza(this);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfd
    public final void zzb(zzfh zzfh) throws IOException {
        String requestMethod = zzfh.getRequestMethod();
        boolean z = true;
        if (requestMethod.equals("POST") || ((!requestMethod.equals("GET") || zzfh.zzfa().zzew().length() <= 2048) && zzfh.zzez().zzaj(requestMethod))) {
            z = false;
        }
        if (z) {
            String requestMethod2 = zzfh.getRequestMethod();
            zzfh.zzag("POST");
            zzfh.zzfe().zzb("X-HTTP-Method-Override", requestMethod2);
            if (requestMethod2.equals("GET")) {
                zzfh.zza(new zzft((zzez) zzfh.zzfa().clone()));
                zzfh.zzfa().clear();
            } else if (zzfh.zzfb() == null) {
                zzfh.zza(new zzew());
            }
        }
    }

    public zzei(boolean z) {
        this.zzsj = false;
    }
}
