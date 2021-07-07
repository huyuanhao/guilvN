package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

public final class zzc implements Callable<Boolean> {
    public final /* synthetic */ SharedPreferences zzo;
    public final /* synthetic */ String zzp;
    public final /* synthetic */ Boolean zzq;

    public zzc(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.zzo = sharedPreferences;
        this.zzp = str;
        this.zzq = bool;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() throws Exception {
        return Boolean.valueOf(this.zzo.getBoolean(this.zzp, this.zzq.booleanValue()));
    }
}
