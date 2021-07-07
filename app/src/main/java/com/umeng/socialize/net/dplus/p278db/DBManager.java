package com.umeng.socialize.net.dplus.p278db;

import android.content.Context;
import com.umeng.socialize.utils.ContextUtil;

/* renamed from: com.umeng.socialize.net.dplus.db.DBManager */
public class DBManager {

    /* renamed from: a */
    public static DBManager f10860a;

    /* renamed from: b */
    public static StandardDBHelper f10861b;

    public DBManager() {
        f10861b = new StandardDBHelper(ContextUtil.getContext());
    }

    public static synchronized DBManager get(Context context) {
        DBManager dBManager;
        synchronized (DBManager.class) {
            if (f10860a == null) {
                f10860a = new DBManager();
            }
            dBManager = f10860a;
        }
        return dBManager;
    }

    public synchronized void closeDatabase() {
        f10861b.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (0 == 0) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r0 != null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void delete(java.util.ArrayList<java.lang.Integer> r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            com.umeng.socialize.net.dplus.db.StandardDBHelper r1 = com.umeng.socialize.net.dplus.p278db.DBManager.f10861b     // Catch:{ all -> 0x0043 }
            android.database.sqlite.SQLiteDatabase r0 = r1.getWritableDatabase()     // Catch:{ all -> 0x0043 }
            r0.beginTransaction()     // Catch:{ all -> 0x0043 }
            r1 = 0
        L_0x000c:
            int r2 = r5.size()     // Catch:{ all -> 0x0043 }
            if (r1 >= r2) goto L_0x003a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0043 }
            r2.<init>()     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = "delete from "
            r2.append(r3)     // Catch:{ all -> 0x0043 }
            r2.append(r6)     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = " where Id='"
            r2.append(r3)     // Catch:{ all -> 0x0043 }
            java.lang.Object r3 = r5.get(r1)     // Catch:{ all -> 0x0043 }
            r2.append(r3)     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = "' "
            r2.append(r3)     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0043 }
            r0.execSQL(r2)     // Catch:{ all -> 0x0043 }
            int r1 = r1 + 1
            goto L_0x000c
        L_0x003a:
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0046
        L_0x003f:
            r0.endTransaction()     // Catch:{ all -> 0x0046 }
            goto L_0x0046
        L_0x0043:
            if (r0 == 0) goto L_0x0046
            goto L_0x003f
        L_0x0046:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.dplus.p278db.DBManager.delete(java.util.ArrayList, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        if (r0 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r0 == null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void deleteTable(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            com.umeng.socialize.net.dplus.db.StandardDBHelper r1 = com.umeng.socialize.net.dplus.p278db.DBManager.f10861b     // Catch:{ all -> 0x002d }
            android.database.sqlite.SQLiteDatabase r0 = r1.getWritableDatabase()     // Catch:{ all -> 0x002d }
            r0.beginTransaction()     // Catch:{ all -> 0x002d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r1.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "DELETE FROM "
            r1.append(r2)     // Catch:{ all -> 0x002d }
            r1.append(r4)     // Catch:{ all -> 0x002d }
            java.lang.String r4 = ";"
            r1.append(r4)     // Catch:{ all -> 0x002d }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x002d }
            r0.execSQL(r4)     // Catch:{ all -> 0x002d }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0030
        L_0x0029:
            r0.endTransaction()     // Catch:{ all -> 0x0030 }
            goto L_0x0030
        L_0x002d:
            if (r0 == 0) goto L_0x0030
            goto L_0x0029
        L_0x0030:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.dplus.p278db.DBManager.deleteTable(java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A[Catch:{ all -> 0x002b, all -> 0x0031 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void insertAuth(org.json.JSONObject r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            r0 = 0
            com.umeng.socialize.net.dplus.db.StandardDBHelper r1 = com.umeng.socialize.net.dplus.p278db.DBManager.f10861b     // Catch:{ all -> 0x002c }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ all -> 0x002c }
            r1.beginTransaction()     // Catch:{ all -> 0x002b }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x002b }
            r2.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "_json"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x002b }
            r2.put(r3, r5)     // Catch:{ all -> 0x002b }
            java.lang.String r5 = "auth"
            r1.insert(r5, r0, r2)     // Catch:{ all -> 0x002b }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0031
            r1.endTransaction()     // Catch:{ all -> 0x0031 }
            goto L_0x0031
        L_0x002b:
            r0 = r1
        L_0x002c:
            if (r0 == 0) goto L_0x0031
            r0.endTransaction()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.dplus.p278db.DBManager.insertAuth(org.json.JSONObject):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A[Catch:{ all -> 0x002b, all -> 0x0031 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void insertDau(org.json.JSONObject r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            r0 = 0
            com.umeng.socialize.net.dplus.db.StandardDBHelper r1 = com.umeng.socialize.net.dplus.p278db.DBManager.f10861b     // Catch:{ all -> 0x002c }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ all -> 0x002c }
            r1.beginTransaction()     // Catch:{ all -> 0x002b }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x002b }
            r2.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "_json"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x002b }
            r2.put(r3, r5)     // Catch:{ all -> 0x002b }
            java.lang.String r5 = "dau"
            r1.insert(r5, r0, r2)     // Catch:{ all -> 0x002b }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0031
            r1.endTransaction()     // Catch:{ all -> 0x0031 }
            goto L_0x0031
        L_0x002b:
            r0 = r1
        L_0x002c:
            if (r0 == 0) goto L_0x0031
            r0.endTransaction()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.dplus.p278db.DBManager.insertDau(org.json.JSONObject):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A[Catch:{ all -> 0x002b, all -> 0x0031 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void insertS_E(org.json.JSONObject r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            r0 = 0
            com.umeng.socialize.net.dplus.db.StandardDBHelper r1 = com.umeng.socialize.net.dplus.p278db.DBManager.f10861b     // Catch:{ all -> 0x002c }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ all -> 0x002c }
            r1.beginTransaction()     // Catch:{ all -> 0x002b }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x002b }
            r2.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "_json"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x002b }
            r2.put(r3, r5)     // Catch:{ all -> 0x002b }
            java.lang.String r5 = "s_e"
            r1.insert(r5, r0, r2)     // Catch:{ all -> 0x002b }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0031
            r1.endTransaction()     // Catch:{ all -> 0x0031 }
            goto L_0x0031
        L_0x002b:
            r0 = r1
        L_0x002c:
            if (r0 == 0) goto L_0x0031
            r0.endTransaction()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.dplus.p278db.DBManager.insertS_E(org.json.JSONObject):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A[Catch:{ all -> 0x002b, all -> 0x0031 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void insertStats(org.json.JSONObject r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            r0 = 0
            com.umeng.socialize.net.dplus.db.StandardDBHelper r1 = com.umeng.socialize.net.dplus.p278db.DBManager.f10861b     // Catch:{ all -> 0x002c }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ all -> 0x002c }
            r1.beginTransaction()     // Catch:{ all -> 0x002b }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x002b }
            r2.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "_json"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x002b }
            r2.put(r3, r5)     // Catch:{ all -> 0x002b }
            java.lang.String r5 = "stats"
            r1.insert(r5, r0, r2)     // Catch:{ all -> 0x002b }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0031
            r1.endTransaction()     // Catch:{ all -> 0x0031 }
            goto L_0x0031
        L_0x002b:
            r0 = r1
        L_0x002c:
            if (r0 == 0) goto L_0x0031
            r0.endTransaction()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.dplus.p278db.DBManager.insertStats(org.json.JSONObject):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A[Catch:{ all -> 0x002b, all -> 0x0031 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void insertUserInfo(org.json.JSONObject r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            r0 = 0
            com.umeng.socialize.net.dplus.db.StandardDBHelper r1 = com.umeng.socialize.net.dplus.p278db.DBManager.f10861b     // Catch:{ all -> 0x002c }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ all -> 0x002c }
            r1.beginTransaction()     // Catch:{ all -> 0x002b }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x002b }
            r2.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "_json"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x002b }
            r2.put(r3, r5)     // Catch:{ all -> 0x002b }
            java.lang.String r5 = "userinfo"
            r1.insert(r5, r0, r2)     // Catch:{ all -> 0x002b }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0031
            r1.endTransaction()     // Catch:{ all -> 0x0031 }
            goto L_0x0031
        L_0x002b:
            r0 = r1
        L_0x002c:
            if (r0 == 0) goto L_0x0031
            r0.endTransaction()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.dplus.p278db.DBManager.insertUserInfo(org.json.JSONObject):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (r2 != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r2 == null) goto L_0x007f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ JSONException -> 0x0074, all -> 0x0077, all -> 0x007f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.json.JSONArray select(java.lang.String r8, java.util.ArrayList<java.lang.Integer> r9, double r10, boolean r12) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.dplus.p278db.DBManager.select(java.lang.String, java.util.ArrayList, double, boolean):org.json.JSONArray");
    }
}
