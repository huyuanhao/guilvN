package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

public final class zzi implements Callable<String> {
    public final /* synthetic */ SharedPreferences zzo;
    public final /* synthetic */ String zzp;
    public final /* synthetic */ String zzt;

    public zzi(SharedPreferences sharedPreferences, String str, String str2) {
        this.zzo = sharedPreferences;
        this.zzp = str;
        this.zzt = str2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        return this.zzo.getString(this.zzp, this.zzt);
    }
}
