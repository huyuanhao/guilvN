package com.google.android.gms.internal.firebase_ml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzku {
    public final int limit;
    public final zzkc zzabj;
    public final boolean zzabk;
    public final zzky zzabl;

    public zzku(zzky zzky) {
        this(zzky, false, zzkg.zzabc, Integer.MAX_VALUE);
    }

    public static zzku zza(zzkc zzkc) {
        zzks.checkNotNull(zzkc);
        return new zzku(new zzkv(zzkc));
    }

    public zzku(zzky zzky, boolean z, zzkc zzkc, int i) {
        this.zzabl = zzky;
        this.zzabk = false;
        this.zzabj = zzkc;
        this.limit = Integer.MAX_VALUE;
    }

    public final List<String> zza(CharSequence charSequence) {
        zzks.checkNotNull(charSequence);
        Iterator<String> zza = this.zzabl.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add(zza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
