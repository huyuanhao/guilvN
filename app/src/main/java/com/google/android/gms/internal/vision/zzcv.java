package com.google.android.gms.internal.vision;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class zzcv {
    public final ConcurrentHashMap<zzcw, List<Throwable>> zzlt = new ConcurrentHashMap<>(16, 0.75f, 10);
    public final ReferenceQueue<Throwable> zzlu = new ReferenceQueue<>();

    public final List<Throwable> zza(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.zzlu.poll();
        while (poll != null) {
            this.zzlt.remove(poll);
            poll = this.zzlu.poll();
        }
        return this.zzlt.get(new zzcw(th, null));
    }
}
