package com.xiaomi.push.providers;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.p118pd.sdk.C8912ooOO0o0;
import com.taobao.accs.common.Constants;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;

/* renamed from: com.xiaomi.push.providers.a */
public class C4568a extends SQLiteOpenHelper {

    /* renamed from: a */
    public static int f13063a = 1;

    /* renamed from: a */
    public static final Object f13064a = new Object();

    /* renamed from: a */
    public static final String[] f13065a = {"package_name", "TEXT", "message_ts", " LONG DEFAULT 0 ", "bytes", " LONG DEFAULT 0 ", C8912ooOO0o0.OooOo00, " INT DEFAULT -1 ", "rcv", " INT DEFAULT -1 ", Constants.KEY_IMSI, "TEXT"};

    public C4568a(Context context) {
        super(context, "traffic.db", (SQLiteDatabase.CursorFactory) null, f13063a);
    }

    /* renamed from: a */
    private void m13743a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("CREATE TABLE traffic(_id INTEGER  PRIMARY KEY ,");
        for (int i = 0; i < f13065a.length - 1; i += 2) {
            if (i != 0) {
                sb.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(f13065a[i]);
            sb.append(" ");
            sb.append(f13065a[i + 1]);
        }
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f13064a) {
            try {
                m13743a(sQLiteDatabase);
            } catch (SQLException e) {
                AbstractC4163b.m11303a(e);
            }
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
