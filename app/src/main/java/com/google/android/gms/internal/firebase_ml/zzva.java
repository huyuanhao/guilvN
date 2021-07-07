package com.google.android.gms.internal.firebase_ml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzva extends zzuy {
    public static final Class<?> zzbqg = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public zzva() {
        super();
    }

    public static <E> List<E> zzc(Object obj, long j) {
        return (List) zzxc.zzp(obj, j);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzuy
    public final <E> void zza(Object obj, Object obj2, long j) {
        ArrayList arrayList;
        List zzc = zzc(obj2, j);
        int size = zzc.size();
        List zzc2 = zzc(obj, j);
        if (zzc2.isEmpty()) {
            if (zzc2 instanceof zzux) {
                zzc2 = new zzuw(size);
            } else if (!(zzc2 instanceof zzwa) || !(zzc2 instanceof zzun)) {
                zzc2 = new ArrayList(size);
            } else {
                zzc2 = ((zzun) zzc2).zzck(size);
            }
            zzxc.zza(obj, j, zzc2);
        } else {
            if (zzbqg.isAssignableFrom(zzc2.getClass())) {
                ArrayList arrayList2 = new ArrayList(zzc2.size() + size);
                arrayList2.addAll(zzc2);
                zzxc.zza(obj, j, arrayList2);
                arrayList = arrayList2;
            } else if (zzc2 instanceof zzwz) {
                zzuw zzuw = new zzuw(zzc2.size() + size);
                zzuw.addAll((zzwz) zzc2);
                zzxc.zza(obj, j, zzuw);
                arrayList = zzuw;
            } else if ((zzc2 instanceof zzwa) && (zzc2 instanceof zzun)) {
                zzun zzun = (zzun) zzc2;
                if (!zzun.zzps()) {
                    zzc2 = zzun.zzck(zzc2.size() + size);
                    zzxc.zza(obj, j, zzc2);
                }
            }
            zzc2 = arrayList;
        }
        int size2 = zzc2.size();
        int size3 = zzc.size();
        if (size2 > 0 && size3 > 0) {
            zzc2.addAll(zzc);
        }
        if (size2 > 0) {
            zzc = zzc2;
        }
        zzxc.zza(obj, j, zzc);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzuy
    public final void zzb(Object obj, long j) {
        Object obj2;
        List list = (List) zzxc.zzp(obj, j);
        if (list instanceof zzux) {
            obj2 = ((zzux) list).zzrw();
        } else if (!zzbqg.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzwa) || !(list instanceof zzun)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzun zzun = (zzun) list;
                if (zzun.zzps()) {
                    zzun.zzpt();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzxc.zza(obj, j, obj2);
    }
}
