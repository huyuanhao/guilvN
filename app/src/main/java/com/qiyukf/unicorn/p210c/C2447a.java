package com.qiyukf.unicorn.p210c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.unicorn.p212e.C2479n;
import com.qiyukf.unicorn.p212e.C2483r;
import java.util.Locale;

/* renamed from: com.qiyukf.unicorn.c.a */
public final class C2447a {

    /* renamed from: a */
    public static C2448b f4801a;

    /* renamed from: a */
    public static SQLiteDatabase m5338a() {
        C2448b bVar = f4801a;
        if (bVar == null) {
            C1709a.m3016c("UnicornDB", "database is not initialized");
            return null;
        }
        try {
            return bVar.getWritableDatabase();
        } catch (SQLiteException e) {
            C1709a.m3011a("UnicornDB", "getWritableDatabase error" + e);
            return null;
        }
    }

    /* renamed from: a */
    public static C2483r m5339a(String str) {
        SQLiteDatabase a = m5338a();
        C2483r rVar = null;
        if (a == null) {
            return null;
        }
        Cursor rawQuery = a.rawQuery(String.format(Locale.getDefault(), "SELECT %1$s FROM staffInfo WHERE staffNimId='%2$s'", "staffNimId,staffName,staffAvatar", str), null);
        if (rawQuery != null && rawQuery.moveToNext()) {
            try {
                rVar = new C2483r(str, rawQuery.getString(1), rawQuery.getString(2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (rawQuery != null && !rawQuery.isClosed()) {
            rawQuery.close();
        }
        return rVar;
    }

    /* renamed from: a */
    public static void m5340a(Context context) {
        f4801a = new C2448b(context);
    }

    /* renamed from: a */
    public static void m5341a(C2479n nVar) {
        SQLiteDatabase a = m5338a();
        if (a != null) {
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("shopId", nVar.getAccount());
            contentValues.put("shopName", nVar.getName());
            contentValues.put("shopAvatar", nVar.getAvatar());
            if (m5343b(nVar.getAccount()) == null) {
                a.insert("shopInfo", null, contentValues);
            } else {
                a.replace("shopInfo", null, contentValues);
            }
        }
    }

    /* renamed from: a */
    public static void m5342a(C2483r rVar) {
        SQLiteDatabase a = m5338a();
        if (a != null) {
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("staffNimId", rVar.getAccount());
            contentValues.put("staffName", rVar.getName());
            contentValues.put("staffAvatar", rVar.getAvatar());
            if (m5339a(rVar.getAccount()) == null) {
                a.insert("staffInfo", null, contentValues);
            } else {
                a.replace("staffInfo", null, contentValues);
            }
        }
    }

    /* renamed from: b */
    public static C2479n m5343b(String str) {
        SQLiteDatabase a = m5338a();
        C2479n nVar = null;
        if (a == null) {
            return null;
        }
        Cursor rawQuery = a.rawQuery(String.format(Locale.getDefault(), "SELECT %1$s FROM shopInfo WHERE shopId='%2$s'", "shopId,shopName,shopAvatar", str), null);
        if (rawQuery != null && rawQuery.moveToNext()) {
            try {
                nVar = new C2479n(str, rawQuery.getString(1), rawQuery.getString(2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (rawQuery != null && !rawQuery.isClosed()) {
            rawQuery.close();
        }
        return nVar;
    }
}
