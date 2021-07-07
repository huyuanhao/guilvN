package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzbt {
    public static volatile boolean zzgm;
    public static final Class<?> zzgn = zzam();
    public static final zzbt zzgo = new zzbt(true);
    public final Map<Object, zzcg.zzf<?, ?>> zzgp;

    public zzbt() {
        this.zzgp = new HashMap();
    }

    public zzbt(boolean z) {
        this.zzgp = Collections.emptyMap();
    }

    public static Class<?> zzam() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzbt zzan() {
        return zzbs.zzal();
    }
}
