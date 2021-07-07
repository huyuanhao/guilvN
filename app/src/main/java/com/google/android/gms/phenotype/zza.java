package com.google.android.gms.phenotype;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class zza {
    public static final ConcurrentHashMap<Uri, zza> zzg = new ConcurrentHashMap<>();
    public static final String[] zzl = {"key", "value"};
    public final Uri uri;
    public final ContentResolver zzh;
    public final ContentObserver zzi;
    public final Object zzj = new Object();
    public volatile Map<String, String> zzk;

    public zza(ContentResolver contentResolver, Uri uri2) {
        this.zzh = contentResolver;
        this.uri = uri2;
        this.zzi = new zzb(this, null);
    }

    public static zza zza(ContentResolver contentResolver, Uri uri2) {
        zza zza = zzg.get(uri2);
        if (zza != null) {
            return zza;
        }
        zza zza2 = new zza(contentResolver, uri2);
        zza putIfAbsent = zzg.putIfAbsent(uri2, zza2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        zza2.zzh.registerContentObserver(zza2.uri, false, zza2.zzi);
        return zza2;
    }

    private final Map<String, String> zzc() {
        HashMap hashMap = new HashMap();
        Cursor query = this.zzh.query(this.uri, zzl, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    hashMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return hashMap;
    }

    public final Map<String, String> zza() {
        Map<String, String> zzc = PhenotypeFlag.zza("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? zzc() : this.zzk;
        if (zzc == null) {
            synchronized (this.zzj) {
                zzc = this.zzk;
                if (zzc == null) {
                    zzc = zzc();
                    this.zzk = zzc;
                }
            }
        }
        return zzc;
    }

    public final void zzb() {
        synchronized (this.zzj) {
            this.zzk = null;
        }
    }
}
