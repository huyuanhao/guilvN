package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zztr {
    public static volatile boolean zzble;
    public static final Class<?> zzblf = zzqk();
    public static final zztr zzblg = new zztr(true);
    public final Map<zzts, zzue.zze<?, ?>> zzblh;

    public zztr() {
        this.zzblh = new HashMap();
    }

    public static Class<?> zzqk() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zztr zzql() {
        return zztq.zzqj();
    }

    public final <ContainingType extends zzvo> zzue.zze<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzue.zze<ContainingType, ?>) this.zzblh.get(new zzts(containingtype, i));
    }

    public zztr(boolean z) {
        this.zzblh = Collections.emptyMap();
    }
}
