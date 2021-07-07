package com.google.firebase.iid;

import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzn implements Runnable {
    public final FirebaseInstanceId zzat;
    public final String zzau;
    public final String zzav;
    public final TaskCompletionSource zzaw;
    public final String zzax;

    public zzn(FirebaseInstanceId firebaseInstanceId, String str, String str2, TaskCompletionSource taskCompletionSource, String str3) {
        this.zzat = firebaseInstanceId;
        this.zzau = str;
        this.zzav = str2;
        this.zzaw = taskCompletionSource;
        this.zzax = str3;
    }

    public final void run() {
        this.zzat.zza(this.zzau, this.zzav, this.zzaw, this.zzax);
    }
}
