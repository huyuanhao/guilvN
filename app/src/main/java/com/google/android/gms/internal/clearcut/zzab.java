package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class zzab {
    public static final ConcurrentHashMap<Uri, zzab> zzde = new ConcurrentHashMap<>();
    public static final String[] zzdl = {"key", "value"};
    public final Uri uri;
    public final ContentResolver zzdf;
    public final ContentObserver zzdg;
    public final Object zzdh = new Object();
    public volatile Map<String, String> zzdi;
    public final Object zzdj = new Object();
    @GuardedBy("listenersLock")
    public final List<zzad> zzdk = new ArrayList();

    public zzab(ContentResolver contentResolver, Uri uri2) {
        this.zzdf = contentResolver;
        this.uri = uri2;
        this.zzdg = new zzac(this, null);
    }

    public static zzab zza(ContentResolver contentResolver, Uri uri2) {
        zzab zzab = zzde.get(uri2);
        if (zzab != null) {
            return zzab;
        }
        zzab zzab2 = new zzab(contentResolver, uri2);
        zzab putIfAbsent = zzde.putIfAbsent(uri2, zzab2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        zzab2.zzdf.registerContentObserver(zzab2.uri, false, zzab2.zzdg);
        return zzab2;
    }

    private final Map<String, String> zzi() {
        HashMap hashMap = new HashMap();
        Cursor query = this.zzdf.query(this.uri, zzdl, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    hashMap.put(query.getString(0), query.getString(1));
                } catch (SQLiteException | SecurityException unused) {
                    return null;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public final void zzj() {
        synchronized (this.zzdj) {
            for (zzad zzad : this.zzdk) {
                zzad.zzk();
            }
        }
    }

    public final Map<String, String> zzg() {
        Map<String, String> zzi = zzae.zza("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? zzi() : this.zzdi;
        if (zzi == null) {
            synchronized (this.zzdh) {
                zzi = this.zzdi;
                if (zzi == null) {
                    zzi = zzi();
                    this.zzdi = zzi;
                }
            }
        }
        return zzi != null ? zzi : Collections.emptyMap();
    }

    public final void zzh() {
        synchronized (this.zzdh) {
            this.zzdi = null;
        }
    }
}
