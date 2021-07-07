package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public final /* synthetic */ class zzk implements Provider {
    public final ComponentFactory zza;
    public final ComponentContainer zzb;

    public zzk(ComponentFactory componentFactory, ComponentContainer componentContainer) {
        this.zza = componentFactory;
        this.zzb = componentContainer;
    }

    public static Provider zza(ComponentFactory componentFactory, ComponentContainer componentContainer) {
        return new zzk(componentFactory, componentContainer);
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        return this.zza.create(this.zzb);
    }
}
