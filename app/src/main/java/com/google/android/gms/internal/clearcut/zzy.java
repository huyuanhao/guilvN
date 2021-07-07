package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class zzy {
    public static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri zzcq = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzcr = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzcs = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean zzct = new AtomicBoolean();
    public static HashMap<String, String> zzcu;
    public static final HashMap<String, Boolean> zzcv = new HashMap<>();
    public static final HashMap<String, Integer> zzcw = new HashMap<>();
    public static final HashMap<String, Long> zzcx = new HashMap<>();
    public static final HashMap<String, Float> zzcy = new HashMap<>();
    public static Object zzcz;
    public static boolean zzda;
    public static String[] zzdb = new String[0];

    public static long getLong(ContentResolver contentResolver, String str, long j) {
        Object zzb = zzb(contentResolver);
        long j2 = 0;
        Long l = (Long) zza((HashMap) zzcx, str, (Object) 0L);
        if (l != null) {
            return l.longValue();
        }
        String zza = zza(contentResolver, str, (String) null);
        if (zza != null) {
            try {
                long parseLong = Long.parseLong(zza);
                l = Long.valueOf(parseLong);
                j2 = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        zza(zzb, zzcx, str, l);
        return j2;
    }

    public static <T> T zza(HashMap<String, T> hashMap, String str, T t) {
        synchronized (zzy.class) {
            if (!hashMap.containsKey(str)) {
                return null;
            }
            T t2 = hashMap.get(str);
            if (t2 != null) {
                t = t2;
            }
            return t;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r13 = r13.query(com.google.android.gms.internal.clearcut.zzy.CONTENT_URI, null, null, new java.lang.String[]{r14}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r13 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r13.moveToFirst() != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r15 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        if (r15.equals(null) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0085, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0086, code lost:
        zza(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r15 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0091, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0092, code lost:
        zza(r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0095, code lost:
        if (r13 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0097, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009c, code lost:
        if (r13 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009e, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a1, code lost:
        throw r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zza(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzy.zza(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    public static Map<String, String> zza(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(zzcq, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    public static void zza(ContentResolver contentResolver) {
        if (zzcu == null) {
            zzct.set(false);
            zzcu = new HashMap<>();
            zzcz = new Object();
            zzda = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new zzz(null));
        } else if (zzct.getAndSet(false)) {
            zzcu.clear();
            zzcv.clear();
            zzcw.clear();
            zzcx.clear();
            zzcy.clear();
            zzcz = new Object();
            zzda = false;
        }
    }

    public static void zza(Object obj, String str, String str2) {
        synchronized (zzy.class) {
            if (obj == zzcz) {
                zzcu.put(str, str2);
            }
        }
    }

    public static <T> void zza(Object obj, HashMap<String, T> hashMap, String str, T t) {
        synchronized (zzy.class) {
            if (obj == zzcz) {
                hashMap.put(str, t);
                zzcu.remove(str);
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver, String str, boolean z) {
        Object zzb = zzb(contentResolver);
        Boolean bool = (Boolean) zza(zzcv, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String zza = zza(contentResolver, str, (String) null);
        if (zza != null && !zza.equals("")) {
            if (zzcr.matcher(zza).matches()) {
                bool = true;
                z = true;
            } else if (zzcs.matcher(zza).matches()) {
                bool = false;
                z = false;
            } else {
                String str2 = "attempt to read gservices key " + str + " (value \"" + zza + "\") as boolean";
            }
        }
        zza(zzb, zzcv, str, bool);
        return z;
    }

    public static Object zzb(ContentResolver contentResolver) {
        Object obj;
        synchronized (zzy.class) {
            zza(contentResolver);
            obj = zzcz;
        }
        return obj;
    }
}
