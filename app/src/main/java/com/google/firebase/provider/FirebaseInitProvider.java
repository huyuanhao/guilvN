package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.firebase.annotations.PublicApi;
import s.h.e.l.l.C;

@PublicApi
public class FirebaseInitProvider extends ContentProvider {
    static {
        C.i(15);
    }

    public native void attachInfo(Context context, ProviderInfo providerInfo);

    public native int delete(Uri uri, String str, String[] strArr);

    @Nullable
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public native boolean onCreate();

    @Nullable
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public native int update(Uri uri, ContentValues contentValues, String str, String[] strArr);
}
