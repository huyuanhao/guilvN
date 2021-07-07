package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

public final class zzg implements Callable<Long> {
    public final /* synthetic */ SharedPreferences zzo;
    public final /* synthetic */ String zzp;
    public final /* synthetic */ Long zzs;

    public zzg(SharedPreferences sharedPreferences, String str, Long l) {
        this.zzo = sharedPreferences;
        this.zzp = str;
        this.zzs = l;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() throws Exception {
        return Long.valueOf(this.zzo.getLong(this.zzp, this.zzs.longValue()));
    }
}
