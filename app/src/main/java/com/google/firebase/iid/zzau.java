package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.firebase_messaging.zza;

public final class zzau extends zza {
    public final /* synthetic */ zzat zzcw;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzau(zzat zzat, Looper looper) {
        super(looper);
        this.zzcw = zzat;
    }

    public final void handleMessage(Message message) {
        zzat.zza(this.zzcw, message);
    }
}
