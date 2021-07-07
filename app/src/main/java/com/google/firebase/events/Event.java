package com.google.firebase.events;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public class Event<T> {
    public final Class<T> zza;
    public final T zzb;

    @KeepForSdk
    public Event(Class<T> cls, T t) {
        this.zza = (Class) Preconditions.checkNotNull(cls);
        this.zzb = (T) Preconditions.checkNotNull(t);
    }

    @KeepForSdk
    public T getPayload() {
        return this.zzb;
    }

    @KeepForSdk
    public Class<T> getType() {
        return this.zza;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.zza, this.zzb);
    }
}
