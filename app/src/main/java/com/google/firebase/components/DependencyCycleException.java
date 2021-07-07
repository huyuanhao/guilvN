package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
public class DependencyCycleException extends DependencyException {
    public final List<Component<?>> zza;

    @KeepForSdk
    public DependencyCycleException(List<Component<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.zza = list;
    }

    @KeepForSdk
    public List<Component<?>> getComponentsInCycle() {
        return this.zza;
    }
}
