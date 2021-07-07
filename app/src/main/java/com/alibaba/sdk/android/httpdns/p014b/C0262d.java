package com.alibaba.sdk.android.httpdns.p014b;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.httpdns.b.d */
public class C0262d extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final Object f578a = new Object();

    public C0262d(Context context) {
        super(context, "aliclound_httpdns.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    private long m448a(SQLiteDatabase sQLiteDatabase, C0265g gVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("host_id", Long.valueOf(gVar.f585h));
        contentValues.put("ip", gVar.f587k);
        contentValues.put("ttl", gVar.f588l);
        try {
            return sQLiteDatabase.insert("ip", null, contentValues);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0086, code lost:
        if (r5 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        if (r5 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.alibaba.sdk.android.httpdns.p014b.C0265g> m449a(long r9) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.p014b.C0262d.m449a(long):java.util.List");
    }

    /* renamed from: a */
    private List<C0265g> mo3960a(C0263e eVar) {
        return m449a(eVar.f583id);
    }

    /* renamed from: a */
    private void m451a(long j) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.delete("host", "id = ?", new String[]{String.valueOf(j)});
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Exception unused) {
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
        sQLiteDatabase.close();
    }

    /* renamed from: a */
    private void m452a(C0265g gVar) {
        m456b(gVar.f586id);
    }

    /* renamed from: b */
    private long m453b(SQLiteDatabase sQLiteDatabase, C0265g gVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("host_id", Long.valueOf(gVar.f585h));
        contentValues.put("ip", gVar.f587k);
        contentValues.put("ttl", gVar.f588l);
        try {
            return sQLiteDatabase.insert("ipv6", null, contentValues);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0088, code lost:
        if (r4 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if (r4 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.alibaba.sdk.android.httpdns.p014b.C0265g> m454b(long r8) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.p014b.C0262d.m454b(long):java.util.List");
    }

    /* renamed from: b */
    private List<C0265g> m455b(C0263e eVar) {
        return m454b(eVar.f583id);
    }

    /* renamed from: b */
    private void m456b(long j) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.delete("ip", "id = ?", new String[]{String.valueOf(j)});
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Exception unused) {
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
        sQLiteDatabase.close();
    }

    /* renamed from: b */
    private void m457b(C0265g gVar) {
        m458c(gVar.f586id);
    }

    /* renamed from: c */
    private void m458c(long j) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.delete("ipv6", "id = ?", new String[]{String.valueOf(j)});
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Exception unused) {
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
        sQLiteDatabase.close();
    }

    /* renamed from: c */
    private void m459c(C0263e eVar) {
        m451a(eVar.f583id);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m460a(com.alibaba.sdk.android.httpdns.p014b.C0263e r9) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.p014b.C0262d.m460a(com.alibaba.sdk.android.httpdns.b.e):long");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x00a8 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: com.alibaba.sdk.android.httpdns.b.e */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: com.alibaba.sdk.android.httpdns.b.e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009d, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009e, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c3, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c8, code lost:
        r3.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.sdk.android.httpdns.p014b.C0263e mo3961a(java.lang.String r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.p014b.C0262d.mo3961a(java.lang.String, java.lang.String):com.alibaba.sdk.android.httpdns.b.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008c, code lost:
        if (r4 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        if (r4 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.alibaba.sdk.android.httpdns.p014b.C0263e> mo3962b() {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.p014b.C0262d.mo3962b():java.util.List");
    }

    /* renamed from: b */
    public void mo3963b(String str, String str2) {
        synchronized (f578a) {
            C0263e a = mo3961a(str, str2);
            if (a != null) {
                m459c(a);
                if (a.f579a != null) {
                    Iterator<C0265g> it = a.f579a.iterator();
                    while (it.hasNext()) {
                        m452a(it.next());
                    }
                }
                if (a.f580b != null) {
                    Iterator<C0265g> it2 = a.f580b.iterator();
                    while (it2.hasNext()) {
                        m457b(it2.next());
                    }
                }
            }
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE host (id INTEGER PRIMARY KEY,host TEXT,sp TEXT,time TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE ip (id INTEGER PRIMARY KEY,host_id INTEGER,ip TEXT,ttl TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE ipv6 (id INTEGER PRIMARY KEY,host_id INTEGER,ip TEXT,ttl TEXT);");
        } catch (Exception unused) {
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS host;");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ip;");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ipv6;");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                onCreate(sQLiteDatabase);
            } catch (Exception unused) {
            }
        }
    }
}
