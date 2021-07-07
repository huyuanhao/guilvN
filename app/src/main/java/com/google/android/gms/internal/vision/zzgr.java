package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzgr extends zzgp {
    public static final Class<?> zzyp = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public zzgr() {
        super();
    }

    public static <E> List<E> zzc(Object obj, long j) {
        return (List) zziu.zzp(obj, j);
    }

    @Override // com.google.android.gms.internal.vision.zzgp
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.vision.zzgp
    public final void zzb(Object obj, long j) {
        Object obj2;
        List list = (List) zziu.zzp(obj, j);
        if (list instanceof zzgo) {
            obj2 = ((zzgo) list).zzfu();
        } else if (!zzyp.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzhr) || !(list instanceof zzge)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzge zzge = (zzge) list;
                if (zzge.zzch()) {
                    zzge.zzci();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zziu.zza(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    public static <L> List<L> zza(Object obj, long j, int i) {
        zzgn zzgn;
        List<L> list;
        List<L> zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            if (zzc instanceof zzgo) {
                list = new zzgn(i);
            } else if (!(zzc instanceof zzhr) || !(zzc instanceof zzge)) {
                list = new ArrayList<>(i);
            } else {
                list = ((zzge) zzc).zzah(i);
            }
            zziu.zza(obj, j, list);
            return list;
        }
        if (zzyp.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList = new ArrayList(zzc.size() + i);
            arrayList.addAll(zzc);
            zziu.zza(obj, j, arrayList);
            zzgn = arrayList;
        } else if (zzc instanceof zzir) {
            zzgn zzgn2 = new zzgn(zzc.size() + i);
            zzgn2.addAll((zzir) zzc);
            zziu.zza(obj, j, zzgn2);
            zzgn = zzgn2;
        } else if (!(zzc instanceof zzhr) || !(zzc instanceof zzge)) {
            return zzc;
        } else {
            zzge zzge = (zzge) zzc;
            if (zzge.zzch()) {
                return zzc;
            }
            zzge zzah = zzge.zzah(zzc.size() + i);
            zziu.zza(obj, j, zzah);
            return zzah;
        }
        return zzgn;
    }

    @Override // com.google.android.gms.internal.vision.zzgp
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza = zza(obj, j, zzc.size());
        int size = zza.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza;
        }
        zziu.zza(obj, j, zzc);
    }
}
