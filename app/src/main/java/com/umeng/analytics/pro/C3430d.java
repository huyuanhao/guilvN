package com.umeng.analytics.pro;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3417c;

/* renamed from: com.umeng.analytics.pro.d */
public class C3430d extends SQLiteOpenHelper {

    /* renamed from: b */
    public static Context f8567b;

    /* renamed from: a */
    public String f8568a;

    /* renamed from: com.umeng.analytics.pro.d$a */
    public static class C3432a {

        /* renamed from: a */
        public static final C3430d f8569a = new C3430d(C3430d.f8567b, C3436f.m8751b(C3430d.f8567b), C3417c.f8501b, null, 2);
    }

    /* renamed from: a */
    public static C3430d m8730a(Context context) {
        if (f8567b == null) {
            f8567b = context.getApplicationContext();
        }
        return C3432a.f8569a;
    }

    /* renamed from: c */
    private void m8735c(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f8568a = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: d */
    private void m8736d(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f8568a = "create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: e */
    private void m8737e(SQLiteDatabase sQLiteDatabase) {
        if (!C3436f.m8749a(sQLiteDatabase, C3417c.C3427d.f8542a, "__av")) {
            C3436f.m8748a(sQLiteDatabase, C3417c.C3427d.f8542a, "__sp", "TEXT");
            C3436f.m8748a(sQLiteDatabase, C3417c.C3427d.f8542a, "__pp", "TEXT");
            C3436f.m8748a(sQLiteDatabase, C3417c.C3427d.f8542a, "__av", "TEXT");
            C3436f.m8748a(sQLiteDatabase, C3417c.C3427d.f8542a, "__vc", "TEXT");
        }
        if (!C3436f.m8749a(sQLiteDatabase, C3417c.C3421b.f8516a, "__av")) {
            C3436f.m8748a(sQLiteDatabase, C3417c.C3421b.f8516a, "__av", "TEXT");
            C3436f.m8748a(sQLiteDatabase, C3417c.C3421b.f8516a, "__vc", "TEXT");
        }
        if (!C3436f.m8749a(sQLiteDatabase, C3417c.C3418a.f8505a, "__av")) {
            C3436f.m8748a(sQLiteDatabase, C3417c.C3418a.f8505a, "__av", "TEXT");
            C3436f.m8748a(sQLiteDatabase, C3417c.C3418a.f8505a, "__vc", "TEXT");
        }
    }

    /* renamed from: f */
    private void m8738f(SQLiteDatabase sQLiteDatabase) {
        m8732a(sQLiteDatabase, C3417c.C3427d.f8542a);
        m8732a(sQLiteDatabase, C3417c.C3421b.f8516a);
        m8732a(sQLiteDatabase, C3417c.C3418a.f8505a);
        mo38695a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
        /*
            r1 = this;
            r2.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x001b, all -> 0x0018 }
            r1.m8735c(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x001b, all -> 0x0018 }
            r1.m8736d(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x001b, all -> 0x0018 }
            r1.m8734b(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x001b, all -> 0x0018 }
            r1.m8731a(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x001b, all -> 0x0018 }
            r2.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x001b, all -> 0x0018 }
            if (r2 == 0) goto L_0x0023
        L_0x0014:
            r2.endTransaction()     // Catch:{ all -> 0x0023 }
            goto L_0x0023
        L_0x0018:
            if (r2 == 0) goto L_0x0023
            goto L_0x0014
        L_0x001b:
            android.content.Context r0 = com.umeng.analytics.pro.C3430d.f8567b     // Catch:{ all -> 0x0024 }
            com.umeng.analytics.pro.C3436f.m8747a(r0)     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0023
            goto L_0x0014
        L_0x0023:
            return
        L_0x0024:
            r0 = move-exception
            if (r2 == 0) goto L_0x002a
            r2.endTransaction()     // Catch:{ all -> 0x002a }
        L_0x002a:
            goto L_0x002c
        L_0x002b:
            throw r0
        L_0x002c:
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3430d.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|5|6|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        m8738f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
        /*
            r0 = this;
            if (r3 <= r2) goto L_0x0010
            r3 = 1
            if (r2 != r3) goto L_0x0010
            r0.m8737e(r1)     // Catch:{ Exception -> 0x0009 }
            goto L_0x0010
        L_0x0009:
            r0.m8737e(r1)     // Catch:{ Exception -> 0x000d }
            goto L_0x0010
        L_0x000d:
            r0.m8738f(r1)
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3430d.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public C3430d(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(new C3415a(context, str), str2, cursorFactory, i);
    }

    /* renamed from: b */
    private void m8734b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f8568a = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3430d(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, TextUtils.isEmpty(str) ? C3417c.f8501b : str, cursorFactory, i);
        this.f8568a = null;
        mo38695a();
    }

    /* renamed from: a */
    public void mo38695a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!C3436f.m8750a(C3417c.C3427d.f8542a, writableDatabase)) {
                m8735c(writableDatabase);
            }
            if (!C3436f.m8750a(C3417c.C3424c.f8529a, writableDatabase)) {
                m8736d(writableDatabase);
            }
            if (!C3436f.m8750a(C3417c.C3421b.f8516a, writableDatabase)) {
                m8734b(writableDatabase);
            }
            if (!C3436f.m8750a(C3417c.C3418a.f8505a, writableDatabase)) {
                m8731a(writableDatabase);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m8731a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f8568a = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: a */
    private void m8732a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        } catch (SQLException unused) {
        }
    }
}
