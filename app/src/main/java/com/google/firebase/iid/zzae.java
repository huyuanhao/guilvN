package com.google.firebase.iid;

import android.os.Handler;
import android.os.Message;

public final /* synthetic */ class zzae implements Handler.Callback {
    public final zzad zzcc;

    public zzae(zzad zzad) {
        this.zzcc = zzad;
    }

    public final boolean handleMessage(Message message) {
        return this.zzcc.zza(message);
    }
}
