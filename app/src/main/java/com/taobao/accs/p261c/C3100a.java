package com.taobao.accs.p261c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3178j;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.taobao.accs.c.a */
public class C3100a extends SQLiteOpenHelper {

    /* renamed from: c */
    public static volatile C3100a f6850c;

    /* renamed from: e */
    public static final Lock f6851e = new ReentrantLock();

    /* renamed from: a */
    public int f6852a = 0;

    /* renamed from: b */
    public LinkedList<C3101a> f6853b = new LinkedList<>();

    /* renamed from: d */
    public Context f6854d;

    /* renamed from: com.taobao.accs.c.a$a */
    public class C3101a {

        /* renamed from: a */
        public String f6855a;

        /* renamed from: b */
        public Object[] f6856b;

        public C3101a(String str, Object[] objArr) {
            this.f6855a = str;
            this.f6856b = objArr;
        }
    }

    public C3100a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.f6854d = context;
    }

    /* renamed from: a */
    public static C3100a m7288a(Context context) {
        if (f6850c == null) {
            synchronized (C3100a.class) {
                if (f6850c == null) {
                    f6850c = new C3100a(context, Constants.DB_NAME, null, 3);
                }
            }
        }
        return f6850c;
    }

    public SQLiteDatabase getWritableDatabase() {
        if (!C3178j.m7662a(super.getWritableDatabase().getPath(), 102400)) {
            return null;
        }
        return super.getWritableDatabase();
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            if (f6851e.tryLock()) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS traffic(_id INTEGER PRIMARY KEY AUTOINCREMENT, date TEXT, host TEXT,serviceid TEXT, bid TEXT, isbackground TEXT, size TEXT)");
            }
        } finally {
            f6851e.unlock();
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS service");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS network");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ping");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS msg");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ack");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS election");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bindApp");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bindUser");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS traffic");
            onCreate(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    public void mo37495a(String str, String str2, String str3, boolean z, long j, String str4) {
        if (!m7290a(str, str3, z, str4)) {
            m7289a("INSERT INTO traffic VALUES(null,?,?,?,?,?,?)", new Object[]{str4, str, str2, str3, String.valueOf(z), Long.valueOf(j)}, true);
            return;
        }
        m7289a("UPDATE traffic SET size=? WHERE date=? AND host=? AND bid=? AND isbackground=?", new Object[]{Long.valueOf(j), str4, str, str3, String.valueOf(z)}, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (r2 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (0 == 0) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m7290a(java.lang.String r15, java.lang.String r16, boolean r17, java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.p261c.C3100a.m7290a(java.lang.String, java.lang.String, boolean, java.lang.String):boolean");
    }

    /* renamed from: a */
    public void mo37494a() {
        m7289a("DELETE FROM traffic", null, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.taobao.accs.p263ut.monitor.TrafficsMonitor.C3168a> mo37493a(boolean r21) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.p261c.C3100a.mo37493a(boolean):java.util.List");
    }

    /* renamed from: a */
    private synchronized void m7289a(String str, Object[] objArr, boolean z) {
        try {
            this.f6853b.add(new C3101a(str, objArr));
            if (this.f6853b.size() > 5 || z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (writableDatabase != null) {
                    while (true) {
                        try {
                            if (this.f6853b.size() <= 0) {
                                break;
                            }
                            C3101a removeFirst = this.f6853b.removeFirst();
                            if (removeFirst.f6856b != null) {
                                writableDatabase.execSQL(removeFirst.f6855a, removeFirst.f6856b);
                            } else {
                                writableDatabase.execSQL(removeFirst.f6855a);
                            }
                            if (removeFirst.f6855a.contains("INSERT")) {
                                int i = this.f6852a + 1;
                                this.f6852a = i;
                                if (i > 4000) {
                                    ALog.m7597d("DBHelper", "db is full!", new Object[0]);
                                    onUpgrade(writableDatabase, 0, 1);
                                    this.f6852a = 0;
                                    break;
                                }
                            }
                        } finally {
                            writableDatabase.close();
                        }
                    }
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            ALog.m7597d("DBHelper", e.toString(), new Object[0]);
        }
        return;
    }
}
