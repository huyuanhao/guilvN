package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public final class zzj<T> implements Provider<T> {
    public static final Object zza = new Object();
    public volatile Object zzb = zza;
    public volatile Provider<T> zzc;

    public zzj(ComponentFactory<T> componentFactory, ComponentContainer componentContainer) {
        this.zzc = zzk.zza(componentFactory, componentContainer);
    }

    @Override // com.google.firebase.inject.Provider
    public final T get() {
        T t = (T) this.zzb;
        if (t == zza) {
            synchronized (this) {
                t = this.zzb;
                if (t == zza) {
                    t = this.zzc.get();
                    this.zzb = t;
                    this.zzc = null;
                }
            }
        }
        return t;
    }
}
