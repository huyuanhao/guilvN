package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzfk {
    public static volatile boolean zztf;
    public static final Class<?> zztg = zzei();
    public static volatile zzfk zzth;
    public static final zzfk zzti = new zzfk(true);
    public final Map<zza, zzfy.zzf<?, ?>> zztj;

    public static final class zza {
        public final int number;
        public final Object object;

        public zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            if (this.object == zza.object && this.number == zza.number) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }
    }

    public zzfk() {
        this.zztj = new HashMap();
    }

    public static zzfk zzeh() {
        return zzfw.zza(zzfk.class);
    }

    public static Class<?> zzei() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzfk zzej() {
        return zzfj.zzef();
    }

    public static zzfk zzek() {
        return zzfj.zzeg();
    }

    public static zzfk zzel() {
        zzfk zzfk = zzth;
        if (zzfk == null) {
            synchronized (zzfk.class) {
                zzfk = zzth;
                if (zzfk == null) {
                    zzfk = zzfj.zzeh();
                    zzth = zzfk;
                }
            }
        }
        return zzfk;
    }

    public final <ContainingType extends zzhf> zzfy.zzf<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzfy.zzf<ContainingType, ?>) this.zztj.get(new zza(containingtype, i));
    }

    public zzfk(boolean z) {
        this.zztj = Collections.emptyMap();
    }

    public final void zza(zzfy.zzf<?, ?> zzf) {
        this.zztj.put(new zza(zzf.zzwu, zzf.zzww.number), zzf);
    }
}
