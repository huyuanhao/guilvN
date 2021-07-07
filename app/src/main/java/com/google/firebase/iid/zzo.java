package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;

public final /* synthetic */ class zzo implements zzas {
    public final FirebaseInstanceId zzat;
    public final String zzau;
    public final String zzav;
    public final String zzax;
    public final String zzay;

    public zzo(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3, String str4) {
        this.zzat = firebaseInstanceId;
        this.zzau = str;
        this.zzav = str2;
        this.zzay = str3;
        this.zzax = str4;
    }

    @Override // com.google.firebase.iid.zzas
    public final Task zzs() {
        return this.zzat.zza(this.zzau, this.zzav, this.zzay, this.zzax);
    }
}
