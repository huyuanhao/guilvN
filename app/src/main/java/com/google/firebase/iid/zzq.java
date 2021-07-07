package com.google.firebase.iid;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.iid.FirebaseInstanceId;

public final /* synthetic */ class zzq implements EventHandler {
    public final FirebaseInstanceId.zza zzbe;

    public zzq(FirebaseInstanceId.zza zza) {
        this.zzbe = zza;
    }

    @Override // com.google.firebase.events.EventHandler
    public final void handle(Event event) {
        FirebaseInstanceId.zza zza = this.zzbe;
        synchronized (zza) {
            if (zza.isEnabled()) {
                FirebaseInstanceId.this.zzg();
            }
        }
    }
}
