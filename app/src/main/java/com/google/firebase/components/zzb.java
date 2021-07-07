package com.google.firebase.components;

public final /* synthetic */ class zzb implements ComponentFactory {
    public final Object zza;

    public zzb(Object obj) {
        this.zza = obj;
    }

    public static ComponentFactory zza(Object obj) {
        return new zzb(obj);
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return Component.zzb(this.zza);
    }
}
