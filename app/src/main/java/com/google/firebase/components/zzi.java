package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import java.util.Map;

public final /* synthetic */ class zzi implements Runnable {
    public final Map.Entry zza;
    public final Event zzb;

    public zzi(Map.Entry entry, Event event) {
        this.zza = entry;
        this.zzb = event;
    }

    public static Runnable zza(Map.Entry entry, Event event) {
        return new zzi(entry, event);
    }

    public final void run() {
        ((EventHandler) this.zza.getKey()).handle(this.zzb);
    }
}
