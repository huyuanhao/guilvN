package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class zzl extends zza {
    public final Set<Class<?>> zza;
    public final Set<Class<?>> zzb;
    public final Set<Class<?>> zzc;
    public final ComponentContainer zzd;

    public static class zza implements Publisher {
        public final Set<Class<?>> zza;
        public final Publisher zzb;

        public zza(Set<Class<?>> set, Publisher publisher) {
            this.zza = set;
            this.zzb = publisher;
        }

        @Override // com.google.firebase.events.Publisher
        public final void publish(Event<?> event) {
            if (this.zza.contains(event.getType())) {
                this.zzb.publish(event);
            } else {
                throw new IllegalArgumentException(String.format("Attempting to publish an undeclared event %s.", event));
            }
        }
    }

    public zzl(Component<?> component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (Dependency dependency : component.zzb()) {
            if (dependency.zzc()) {
                hashSet.add(dependency.zza());
            } else {
                hashSet2.add(dependency.zza());
            }
        }
        if (!component.zzd().isEmpty()) {
            hashSet.add(Publisher.class);
        }
        this.zza = Collections.unmodifiableSet(hashSet);
        this.zzb = Collections.unmodifiableSet(hashSet2);
        this.zzc = component.zzd();
        this.zzd = componentContainer;
    }

    @Override // com.google.firebase.components.zza, com.google.firebase.components.ComponentContainer
    public final <T> T get(Class<T> cls) {
        if (this.zza.contains(cls)) {
            T t = (T) this.zzd.get(cls);
            return !cls.equals(Publisher.class) ? t : (T) new zza(this.zzc, t);
        }
        throw new IllegalArgumentException(String.format("Requesting %s is not allowed.", cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final <T> Provider<T> getProvider(Class<T> cls) {
        if (this.zzb.contains(cls)) {
            return this.zzd.getProvider(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting Provider<%s> is not allowed.", cls));
    }
}
