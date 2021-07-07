package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: com.umeng.commonsdk.proguard.h */
public class C3608h implements AbstractC3605e {
    @Override // com.umeng.commonsdk.proguard.AbstractC3605e
    /* renamed from: a */
    public String mo38983a(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
        if (query != null) {
            if (query.moveToNext()) {
                str = query.getString(query.getColumnIndex("value"));
            }
            query.close();
        }
        return str;
    }
}
