package com.xiaomi.mipush.sdk.help;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import s.h.e.l.l.C;

public class HelpContentProvider extends ContentProvider {
    static {
        C.i(16777283);
    }

    public native int delete(Uri uri, String str, String[] strArr);

    public native String getType(Uri uri);

    public native Uri insert(Uri uri, ContentValues contentValues);

    public native boolean onCreate();

    public native Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    public native int update(Uri uri, ContentValues contentValues, String str, String[] strArr);
}
