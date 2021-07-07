package com.google.firebase.iid;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.iid.Registrar;

public final /* synthetic */ class zzap implements ComponentFactory {
    public static final ComponentFactory zzcm = new zzap();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return new Registrar.zza((FirebaseInstanceId) componentContainer.get(FirebaseInstanceId.class));
    }
}
