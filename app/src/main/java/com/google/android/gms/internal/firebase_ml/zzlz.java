package com.google.android.gms.internal.firebase_ml;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public final class zzlz {
    public final ConcurrentHashMap<zzma, List<Throwable>> zzads = new ConcurrentHashMap<>(16, 0.75f, 10);
    public final ReferenceQueue<Throwable> zzadt = new ReferenceQueue<>();

    public final List<Throwable> zza(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.zzadt.poll();
        while (poll != null) {
            this.zzads.remove(poll);
            poll = this.zzadt.poll();
        }
        List<Throwable> list = this.zzads.get(new zzma(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.zzads.putIfAbsent(new zzma(th, this.zzadt), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
