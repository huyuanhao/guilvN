package com.google.firebase.components;

public final /* synthetic */ class zzc implements ComponentFactory {
    public final Object zza;

    public zzc(Object obj) {
        this.zza = obj;
    }

    public static ComponentFactory zza(Object obj) {
        return new zzc(obj);
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return Component.zza(this.zza);
    }
}
