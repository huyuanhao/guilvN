package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

public final class zze implements Callable<Integer> {
    public final /* synthetic */ SharedPreferences zzo;
    public final /* synthetic */ String zzp;
    public final /* synthetic */ Integer zzr;

    public zze(SharedPreferences sharedPreferences, String str, Integer num) {
        this.zzo = sharedPreferences;
        this.zzp = str;
        this.zzr = num;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() throws Exception {
        return Integer.valueOf(this.zzo.getInt(this.zzp, this.zzr.intValue()));
    }
}
