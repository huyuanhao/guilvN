package com.umeng.analytics.process;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3436f;
import java.io.File;

/* renamed from: com.umeng.analytics.process.b */
public class C3481b extends SQLiteOpenHelper {
    public C3481b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    /* renamed from: a */
    public static C3481b m8958a(Context context, String str) {
        String b = m8961b(context, str);
        AbstractC3479a.f8836h.equals(str);
        return new C3481b(context, b, null, 1);
    }

    /* renamed from: b */
    public static String m8961b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = AbstractC3479a.f8836h;
        }
        String str2 = C3436f.m8751b(context) + "subprocess/";
        if (AbstractC3479a.f8836h.equals(str)) {
            str2 = C3436f.m8751b(context);
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return String.format(str2 + AbstractC3479a.f8833e, str);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m8960a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: a */
    private void m8960a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("create table if not exists __et_p(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __pn TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: a */
    public static String m8959a(Context context) {
        return C3436f.m8751b(context) + "subprocess/";
    }
}
