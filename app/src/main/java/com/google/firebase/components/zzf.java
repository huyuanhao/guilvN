package com.google.firebase.components;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.components.Component;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzf extends zza {
    public final List<Component<?>> zza;
    public final Map<Class<?>, zzj<?>> zzb = new HashMap();
    public final zzh zzc;

    public zzf(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        this.zzc = new zzh(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.m988of(this.zzc, zzh.class, Subscriber.class, Publisher.class));
        for (ComponentRegistrar componentRegistrar : iterable) {
            arrayList.addAll(componentRegistrar.getComponents());
        }
        Collections.addAll(arrayList, componentArr);
        List<Component<?>> unmodifiableList = Collections.unmodifiableList(Component.C09701.zza(arrayList));
        this.zza = unmodifiableList;
        for (Component<?> component : unmodifiableList) {
            zza(component);
        }
        zza();
    }

    @Override // com.google.firebase.components.zza, com.google.firebase.components.ComponentContainer
    public final /* bridge */ /* synthetic */ Object get(Class cls) {
        return super.get(cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final <T> Provider<T> getProvider(Class<T> cls) {
        Preconditions.checkNotNull(cls, "Null interface requested.");
        return this.zzb.get(cls);
    }

    public final void zza(boolean z) {
        for (Component<?> component : this.zza) {
            if (component.zze() || (component.zzf() && z)) {
                get(component.zza().iterator().next());
            }
        }
        this.zzc.zza();
    }

    private <T> void zza(Component<T> component) {
        zzj<?> zzj = new zzj<>(component.zzc(), new zzl(component, this));
        for (Class<? super T> cls : component.zza()) {
            this.zzb.put(cls, zzj);
        }
    }

    private void zza() {
        for (Component<?> component : this.zza) {
            Iterator<Dependency> it = component.zzb().iterator();
            while (true) {
                if (it.hasNext()) {
                    Dependency next = it.next();
                    if (next.zzb() && !this.zzb.containsKey(next.zza())) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component, next.zza()));
                    }
                }
            }
        }
    }
}
