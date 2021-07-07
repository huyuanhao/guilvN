package com.tencent.bugly.proguard;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.bugly.AbstractC3215a;
import com.tencent.bugly.crashreport.common.info.C3270b;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.af */
public class C3309af extends SQLiteOpenHelper {

    /* renamed from: a */
    public static String f7981a = "bugly_db";

    /* renamed from: b */
    public static int f7982b = 15;

    /* renamed from: c */
    public Context f7983c;

    /* renamed from: d */
    public List<AbstractC3215a> f7984d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3309af(android.content.Context r4, java.util.List<com.tencent.bugly.AbstractC3215a> r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.tencent.bugly.proguard.C3309af.f7981a
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            com.tencent.bugly.crashreport.common.info.a r1 = com.tencent.bugly.crashreport.common.info.C3269a.m7965a(r4)
            r1.getClass()
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = com.tencent.bugly.proguard.C3309af.f7982b
            r2 = 0
            r3.<init>(r4, r0, r2, r1)
            r3.f7983c = r4
            r3.f7984d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3309af.<init>(android.content.Context, java.util.List):void");
    }

    /* renamed from: a */
    public synchronized boolean mo38361a(SQLiteDatabase sQLiteDatabase) {
        try {
            String[] strArr = {"t_lr", "t_ui", "t_pf"};
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str, new String[0]);
            }
        } catch (Throwable th) {
            if (!C3321an.m8353b(th)) {
                th.printStackTrace();
            }
            return false;
        }
        return true;
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = null;
        int i = 0;
        while (sQLiteDatabase == null && i < 5) {
            i++;
            try {
                sQLiteDatabase = super.getReadableDatabase();
            } catch (Throwable unused) {
                C3321an.m8356d("[Database] Try to get db(count: %d).", Integer.valueOf(i));
                if (i == 5) {
                    C3321an.m8357e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return sQLiteDatabase;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = null;
        int i = 0;
        while (sQLiteDatabase == null && i < 5) {
            i++;
            try {
                sQLiteDatabase = super.getWritableDatabase();
            } catch (Throwable unused) {
                C3321an.m8356d("[Database] Try to get db(count: %d).", Integer.valueOf(i));
                if (i == 5) {
                    C3321an.m8357e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (sQLiteDatabase == null) {
            C3321an.m8356d("[Database] db error delay error record 1min.", new Object[0]);
        }
        return sQLiteDatabase;
    }

    public synchronized void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS ");
            sb.append("t_ui");
            sb.append(" ( ");
            sb.append(C3848l.f10389g);
            sb.append(" ");
            sb.append("INTEGER PRIMARY KEY");
            sb.append(C3848l.f10403u);
            sb.append("_tm");
            sb.append(" ");
            sb.append("int");
            sb.append(C3848l.f10403u);
            sb.append("_ut");
            sb.append(" ");
            sb.append("int");
            sb.append(C3848l.f10403u);
            sb.append("_tp");
            sb.append(" ");
            sb.append("int");
            sb.append(C3848l.f10403u);
            sb.append("_dt");
            sb.append(" ");
            sb.append("blob");
            sb.append(C3848l.f10403u);
            sb.append("_pc");
            sb.append(" ");
            sb.append("text");
            sb.append(" ) ");
            C3321an.m8355c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS ");
            sb.append("t_lr");
            sb.append(" ( ");
            sb.append(C3848l.f10389g);
            sb.append(" ");
            sb.append("INTEGER PRIMARY KEY");
            sb.append(C3848l.f10403u);
            sb.append("_tp");
            sb.append(" ");
            sb.append("int");
            sb.append(C3848l.f10403u);
            sb.append("_tm");
            sb.append(" ");
            sb.append("int");
            sb.append(C3848l.f10403u);
            sb.append("_pc");
            sb.append(" ");
            sb.append("text");
            sb.append(C3848l.f10403u);
            sb.append("_th");
            sb.append(" ");
            sb.append("text");
            sb.append(C3848l.f10403u);
            sb.append("_dt");
            sb.append(" ");
            sb.append("blob");
            sb.append(" ) ");
            C3321an.m8355c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS ");
            sb.append("t_pf");
            sb.append(" ( ");
            sb.append(C3848l.f10389g);
            sb.append(" ");
            sb.append("integer");
            sb.append(C3848l.f10403u);
            sb.append("_tp");
            sb.append(" ");
            sb.append("text");
            sb.append(C3848l.f10403u);
            sb.append("_tm");
            sb.append(" ");
            sb.append("int");
            sb.append(C3848l.f10403u);
            sb.append("_dt");
            sb.append(" ");
            sb.append("blob");
            sb.append(",primary key(");
            sb.append(C3848l.f10389g);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append("_tp");
            sb.append(" )) ");
            C3321an.m8355c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS ");
            sb.append("t_cr");
            sb.append(" ( ");
            sb.append(C3848l.f10389g);
            sb.append(" ");
            sb.append("INTEGER PRIMARY KEY");
            sb.append(C3848l.f10403u);
            sb.append("_tm");
            sb.append(" ");
            sb.append("int");
            sb.append(C3848l.f10403u);
            sb.append("_s1");
            sb.append(" ");
            sb.append("text");
            sb.append(C3848l.f10403u);
            sb.append("_up");
            sb.append(" ");
            sb.append("int");
            sb.append(C3848l.f10403u);
            sb.append("_me");
            sb.append(" ");
            sb.append("int");
            sb.append(C3848l.f10403u);
            sb.append("_uc");
            sb.append(" ");
            sb.append("int");
            sb.append(C3848l.f10403u);
            sb.append("_dt");
            sb.append(" ");
            sb.append("blob");
            sb.append(" ) ");
            C3321an.m8355c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS ");
            sb.append("dl_1002");
            sb.append(" (");
            sb.append(C3848l.f10389g);
            sb.append(" integer primary key autoincrement, ");
            sb.append("_dUrl");
            sb.append(" varchar(100), ");
            sb.append("_sFile");
            sb.append(" varchar(100), ");
            sb.append("_sLen");
            sb.append(" INTEGER, ");
            sb.append("_tLen");
            sb.append(" INTEGER, ");
            sb.append("_MD5");
            sb.append(" varchar(100), ");
            sb.append("_DLTIME");
            sb.append(" INTEGER)");
            C3321an.m8355c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(C3848l.f10397o);
            sb.append("ge_1002");
            sb.append(" (");
            sb.append(C3848l.f10389g);
            sb.append(" integer primary key autoincrement, ");
            sb.append("_time");
            sb.append(" INTEGER, ");
            sb.append("_datas");
            sb.append(" blob)");
            C3321an.m8355c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS ");
            sb.append("st_1002");
            sb.append(" ( ");
            sb.append(C3848l.f10389g);
            sb.append(" ");
            sb.append("integer");
            sb.append(C3848l.f10403u);
            sb.append("_tp");
            sb.append(" ");
            sb.append("text");
            sb.append(C3848l.f10403u);
            sb.append("_tm");
            sb.append(" ");
            sb.append("int");
            sb.append(C3848l.f10403u);
            sb.append("_dt");
            sb.append(" ");
            sb.append("blob");
            sb.append(",primary key(");
            sb.append(C3848l.f10389g);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append("_tp");
            sb.append(" )) ");
            C3321an.m8355c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
        } catch (Throwable th) {
            if (!C3321an.m8353b(th)) {
                th.printStackTrace();
            }
        }
        if (this.f7984d != null) {
            for (AbstractC3215a aVar : this.f7984d) {
                try {
                    aVar.onDbCreate(sQLiteDatabase);
                } catch (Throwable th2) {
                    if (!C3321an.m8353b(th2)) {
                        th2.printStackTrace();
                    }
                }
            }
        }
    }

    @TargetApi(11)
    public synchronized void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (C3270b.m8033c() >= 11) {
            C3321an.m8356d("[Database] Downgrade %d to %d drop tables.", Integer.valueOf(i), Integer.valueOf(i2));
            if (this.f7984d != null) {
                for (AbstractC3215a aVar : this.f7984d) {
                    try {
                        aVar.onDbDowngrade(sQLiteDatabase, i, i2);
                    } catch (Throwable th) {
                        if (!C3321an.m8353b(th)) {
                            th.printStackTrace();
                        }
                    }
                }
            }
            if (mo38361a(sQLiteDatabase)) {
                onCreate(sQLiteDatabase);
            } else {
                C3321an.m8356d("[Database] Failed to drop, delete db.", new Object[0]);
                File databasePath = this.f7983c.getDatabasePath(f7981a);
                if (databasePath != null && databasePath.canWrite()) {
                    databasePath.delete();
                }
            }
        }
    }

    public synchronized void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C3321an.m8356d("[Database] Upgrade %d to %d , drop tables!", Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f7984d != null) {
            for (AbstractC3215a aVar : this.f7984d) {
                try {
                    aVar.onDbUpgrade(sQLiteDatabase, i, i2);
                } catch (Throwable th) {
                    if (!C3321an.m8353b(th)) {
                        th.printStackTrace();
                    }
                }
            }
        }
        if (mo38361a(sQLiteDatabase)) {
            onCreate(sQLiteDatabase);
        } else {
            C3321an.m8356d("[Database] Failed to drop, delete db.", new Object[0]);
            File databasePath = this.f7983c.getDatabasePath(f7981a);
            if (databasePath != null && databasePath.canWrite()) {
                databasePath.delete();
            }
        }
    }
}
