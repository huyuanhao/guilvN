package com.qiyukf.nimlib.p177c.p178a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;

/* renamed from: com.qiyukf.nimlib.c.a.b */
public final class C2194b {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m4536a(android.database.sqlite.SQLiteDatabase r7, java.lang.String r8, android.content.ContentValues r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "db"
            r1 = 0
            r2 = -1
            r3 = 0
        L_0x0005:
            r4 = 3
            if (r3 >= r4) goto L_0x003e
            int r2 = r7.update(r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0016, Exception -> 0x0010 }
            r4 = 1
            r4 = 0
            r5 = 1
            goto L_0x0030
        L_0x0010:
            r4 = move-exception
            r4.printStackTrace()
            r4 = 0
            goto L_0x002f
        L_0x0016:
            r4 = move-exception
            r4.printStackTrace()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "exec sql exception: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.qiyukf.basesdk.p119a.C1709a.m3011a(r0, r5)
            boolean r4 = m4540a(r4)
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r4 == 0) goto L_0x0037
            java.lang.String r6 = "locked"
            com.qiyukf.basesdk.p119a.C1709a.m3020e(r0, r6)
        L_0x0037:
            if (r5 != 0) goto L_0x003e
            if (r4 == 0) goto L_0x003e
            int r3 = r3 + 1
            goto L_0x0005
        L_0x003e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p177c.p178a.C2194b.m4536a(android.database.sqlite.SQLiteDatabase, java.lang.String, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m4537a(android.database.sqlite.SQLiteDatabase r8, java.lang.String r9, android.content.ContentValues r10) {
        /*
            java.lang.String r0 = "db"
            r1 = 0
            r2 = -1
            r4 = 0
        L_0x0006:
            r5 = 3
            if (r4 >= r5) goto L_0x0040
            r5 = 0
            long r2 = r8.insert(r9, r5, r10)     // Catch:{ SQLiteException -> 0x0018, Exception -> 0x0012 }
            r5 = 1
            r5 = 0
            r6 = 1
            goto L_0x0032
        L_0x0012:
            r5 = move-exception
            r5.printStackTrace()
            r5 = 0
            goto L_0x0031
        L_0x0018:
            r5 = move-exception
            r5.printStackTrace()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "exec sql exception: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.qiyukf.basesdk.p119a.C1709a.m3011a(r0, r6)
            boolean r5 = m4540a(r5)
        L_0x0031:
            r6 = 0
        L_0x0032:
            if (r5 == 0) goto L_0x0039
            java.lang.String r7 = "locked"
            com.qiyukf.basesdk.p119a.C1709a.m3020e(r0, r7)
        L_0x0039:
            if (r6 != 0) goto L_0x0040
            if (r5 == 0) goto L_0x0040
            int r4 = r4 + 1
            goto L_0x0006
        L_0x0040:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p177c.p178a.C2194b.m4537a(android.database.sqlite.SQLiteDatabase, java.lang.String, android.content.ContentValues):long");
    }

    /* renamed from: a */
    public static final Cursor m4538a(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z;
        Cursor cursor = null;
        for (int i = 0; i < 3; i++) {
            try {
                cursor = sQLiteDatabase.rawQuery(str, null);
            } catch (SQLiteException e) {
                e.printStackTrace();
                C1709a.m3011a("db", "exec sql exception: " + e);
                z = m4540a(e);
            } catch (Exception e2) {
                C1709a.m3015b("DatabaseHelper", "rawQuery is exception", e2);
            }
            z = false;
            if (z) {
                C1709a.m3020e("db", "locked");
            }
            if (!(cursor == null && z)) {
                break;
            }
        }
        return C2198d.m4553a(cursor);
    }

    /* renamed from: a */
    public static String m4539a(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("'", "''");
    }

    /* renamed from: a */
    public static final boolean m4540a(SQLiteException sQLiteException) {
        String message = sQLiteException.getMessage();
        return !TextUtils.isEmpty(message) && message.contains("lock");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m4541b(android.database.sqlite.SQLiteDatabase r8, java.lang.String r9, android.content.ContentValues r10) {
        /*
            java.lang.String r0 = "db"
            r1 = 0
            r2 = -1
            r4 = 0
        L_0x0006:
            r5 = 3
            if (r4 >= r5) goto L_0x0040
            r5 = 0
            long r2 = r8.replace(r9, r5, r10)     // Catch:{ SQLiteException -> 0x0018, Exception -> 0x0012 }
            r5 = 1
            r5 = 0
            r6 = 1
            goto L_0x0032
        L_0x0012:
            r5 = move-exception
            r5.printStackTrace()
            r5 = 0
            goto L_0x0031
        L_0x0018:
            r5 = move-exception
            r5.printStackTrace()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "exec sql exception: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.qiyukf.basesdk.p119a.C1709a.m3011a(r0, r6)
            boolean r5 = m4540a(r5)
        L_0x0031:
            r6 = 0
        L_0x0032:
            if (r5 == 0) goto L_0x0039
            java.lang.String r7 = "locked"
            com.qiyukf.basesdk.p119a.C1709a.m3020e(r0, r7)
        L_0x0039:
            if (r6 != 0) goto L_0x0040
            if (r5 == 0) goto L_0x0040
            int r4 = r4 + 1
            goto L_0x0006
        L_0x0040:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p177c.p178a.C2194b.m4541b(android.database.sqlite.SQLiteDatabase, java.lang.String, android.content.ContentValues):long");
    }
}
