package com.qiyukf.nimlib.p177c.p178a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.basesdk.p119a.C1709a;
import java.io.File;

/* renamed from: com.qiyukf.nimlib.c.a.a */
public abstract class AbstractC2193a {

    /* renamed from: a */
    public final int f4375a;

    /* renamed from: b */
    public SQLiteDatabase f4376b;

    /* renamed from: c */
    public boolean f4377c;

    /* renamed from: d */
    public Context f4378d;

    /* renamed from: e */
    public String f4379e;

    public AbstractC2193a(Context context, String str) {
        this(context, str, (byte) 0);
    }

    public AbstractC2193a(Context context, String str, byte b) {
        this.f4378d = context;
        this.f4379e = str;
        this.f4375a = 4;
        this.f4377c = true;
        StringBuilder sb = new StringBuilder("open database: ");
        String str2 = this.f4379e;
        sb.append(str2.substring(str2.lastIndexOf(C8932ooOOO0o.OooO0OO) + 1));
        C1709a.m3011a("db", sb.toString());
        if (this.f4377c) {
            String str3 = this.f4379e;
            int i = this.f4375a;
            try {
                this.f4376b = SQLiteDatabase.openOrCreateDatabase(m4526c(str3), (SQLiteDatabase.CursorFactory) null);
            } catch (SQLiteException e) {
                C1709a.m3011a("db", "error=" + e.getLocalizedMessage());
            }
            int version = this.f4376b.getVersion();
            if (version != i) {
                this.f4376b.beginTransaction();
                if (version == 0) {
                    try {
                        C1709a.m3011a("db", "create database " + str3);
                        mo34773a().mo34782a(this.f4376b, this.f4375a);
                    } catch (Exception e2) {
                        C1709a.m3016c("db", "create or upgrade database " + str3 + " error: " + e2);
                        this.f4376b.endTransaction();
                        return;
                    } catch (Throwable th) {
                        this.f4376b.endTransaction();
                        throw th;
                    }
                } else if (version < i) {
                    C1709a.m3011a("db", "upgrade database " + str3 + " from " + version + " to " + i);
                    mo34773a().mo34783a(this.f4376b, version, i);
                }
                this.f4376b.setVersion(i);
                this.f4376b.setTransactionSuccessful();
                this.f4376b.endTransaction();
                return;
            }
            return;
        }
        String str4 = this.f4379e;
        int i2 = this.f4375a;
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(m4526c(str4), null, 0);
            this.f4376b = openDatabase;
            if (openDatabase.getVersion() < i2) {
                this.f4376b.close();
                this.f4376b = null;
            }
        } catch (SQLiteException e3) {
            C1709a.m3011a("db", "open database " + str4 + " only failed: " + e3);
        }
    }

    /* renamed from: c */
    private String m4526c(String str) {
        String str2 = this.f4378d.getApplicationInfo().dataDir + C8932ooOOO0o.OooO0OO + str;
        File file = new File(str2);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        Log.i("db", "ready to open db, path=" + str2);
        return str2;
    }

    /* renamed from: a */
    public final int mo34774a(String str, ContentValues contentValues, String str2, String[] strArr) {
        SQLiteDatabase sQLiteDatabase = this.f4376b;
        if (sQLiteDatabase != null) {
            return C2194b.m4536a(sQLiteDatabase, str, contentValues, str2, strArr);
        }
        return -1;
    }

    /* renamed from: a */
    public final long mo34775a(String str, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabase = this.f4376b;
        if (sQLiteDatabase != null) {
            return C2194b.m4537a(sQLiteDatabase, str, contentValues);
        }
        return -1;
    }

    /* renamed from: a */
    public abstract C2195c mo34773a();

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34776a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "db"
            android.database.sqlite.SQLiteDatabase r1 = r7.f4376b
            if (r1 == 0) goto L_0x0040
            r2 = 0
            r3 = 0
        L_0x0008:
            r4 = 3
            if (r3 >= r4) goto L_0x0040
            r1.execSQL(r8)     // Catch:{ SQLiteException -> 0x0018, Exception -> 0x0012 }
            r4 = 1
            r4 = 0
            r5 = 1
            goto L_0x0032
        L_0x0012:
            r4 = move-exception
            r4.printStackTrace()
            r4 = 0
            goto L_0x0031
        L_0x0018:
            r4 = move-exception
            r4.printStackTrace()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "exec sql exception: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.qiyukf.basesdk.p119a.C1709a.m3011a(r0, r5)
            boolean r4 = com.qiyukf.nimlib.p177c.p178a.C2194b.m4540a(r4)
        L_0x0031:
            r5 = 0
        L_0x0032:
            if (r4 == 0) goto L_0x0039
            java.lang.String r6 = "locked"
            com.qiyukf.basesdk.p119a.C1709a.m3020e(r0, r6)
        L_0x0039:
            if (r5 != 0) goto L_0x0040
            if (r4 == 0) goto L_0x0040
            int r3 = r3 + 1
            goto L_0x0008
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p177c.p178a.AbstractC2193a.mo34776a(java.lang.String):void");
    }

    /* renamed from: b */
    public final long mo34777b(String str, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabase = this.f4376b;
        if (sQLiteDatabase != null) {
            return C2194b.m4541b(sQLiteDatabase, str, contentValues);
        }
        return -1;
    }

    /* renamed from: b */
    public final Cursor mo34778b(String str) {
        SQLiteDatabase sQLiteDatabase = this.f4376b;
        if (sQLiteDatabase != null) {
            return C2194b.m4538a(sQLiteDatabase, str);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo34779b() {
        return this.f4376b != null;
    }

    /* renamed from: c */
    public final void mo34780c() {
        SQLiteDatabase sQLiteDatabase = this.f4376b;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.f4376b = null;
        }
    }

    /* renamed from: d */
    public final SQLiteDatabase mo34781d() {
        return this.f4376b;
    }
}
