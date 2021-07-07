package com.xiaomi.push.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.umeng.analytics.pro.C3416b;
import s.h.e.l.l.C;

public class TrafficProvider extends ContentProvider {

    /* renamed from: a */
    public static final UriMatcher f13060a;

    /* renamed from: a */
    public static final Uri f13061a = Uri.parse("content://com.xiaomi.push.providers.TrafficProvider/traffic");

    /* renamed from: a */
    public SQLiteOpenHelper f13062a;

    static {
        C.i(16777284);
        UriMatcher uriMatcher = new UriMatcher(-1);
        f13060a = uriMatcher;
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", C3416b.f8421E, 1);
        f13060a.addURI("com.xiaomi.push.providers.TrafficProvider", "update_imsi", 2);
    }

    public native int bulkInsert(Uri uri, ContentValues[] contentValuesArr);

    public native int delete(Uri uri, String str, String[] strArr);

    public native String getType(Uri uri);

    public native Uri insert(Uri uri, ContentValues contentValues);

    public native boolean onCreate();

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query;
        synchronized (C4568a.f13064a) {
            if (f13060a.match(uri) == 1) {
                query = this.f13062a.getReadableDatabase().query(C3416b.f8421E, strArr, str, strArr2, null, null, str2);
            } else {
                throw new IllegalArgumentException("Unknown URI " + uri);
            }
        }
        return query;
    }

    public native int update(Uri uri, ContentValues contentValues, String str, String[] strArr);
}
