package com.umeng.socialize.net.dplus.p278db;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;

/* renamed from: com.umeng.socialize.net.dplus.db.StandardDBHelper */
public class StandardDBHelper extends SQLiteOpenHelper {

    /* renamed from: a */
    public static Context f10862a;

    /* renamed from: b */
    public String f10863b = null;

    public StandardDBHelper(Context context) {
        super(context, DBConfig.DB_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    private void m10850a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f10863b = "create table if not exists stats (Id integer primary key,_json TEXT)";
            sQLiteDatabase.execSQL("create table if not exists stats (Id integer primary key,_json TEXT)");
        } catch (SQLException e) {
            SLog.error(UmengText.CACHE.CACHEFILE, e);
        }
    }

    /* renamed from: b */
    private void m10851b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f10863b = "create table if not exists s_e (Id integer primary key,_json TEXT)";
            sQLiteDatabase.execSQL("create table if not exists s_e (Id integer primary key,_json TEXT)");
        } catch (SQLException e) {
            SLog.error(UmengText.CACHE.CACHEFILE, e);
        }
    }

    /* renamed from: c */
    private void m10852c(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f10863b = "create table if not exists auth (Id integer primary key,_json TEXT)";
            sQLiteDatabase.execSQL("create table if not exists auth (Id integer primary key,_json TEXT)");
        } catch (SQLException e) {
            SLog.error(UmengText.CACHE.CACHEFILE, e);
        }
    }

    /* renamed from: d */
    private void m10853d(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f10863b = "create table if not exists userinfo (Id integer primary key,_json TEXT)";
            sQLiteDatabase.execSQL("create table if not exists userinfo (Id integer primary key,_json TEXT)");
        } catch (SQLException e) {
            SLog.error(UmengText.CACHE.CACHEFILE, e);
        }
    }

    /* renamed from: e */
    private void m10854e(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f10863b = "create table if not exists dau (Id integer primary key,_json TEXT)";
            sQLiteDatabase.execSQL("create table if not exists dau (Id integer primary key,_json TEXT)");
        } catch (SQLException e) {
            SLog.error(UmengText.CACHE.CACHEFILE, e);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m10850a(sQLiteDatabase);
        m10851b(sQLiteDatabase);
        m10852c(sQLiteDatabase);
        m10853d(sQLiteDatabase);
        m10854e(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
