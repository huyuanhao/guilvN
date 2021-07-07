package com.p118pd.sdk;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.app.EnvUtils;

/* renamed from: com.pd.sdk.o0Oooo0  reason: case insensitive filesystem */
public class C7530o0Oooo0 {
    public static final String OooO00o = "content://com.alipay.android.app.settings.data.ServerProvider/current_server";

    public static String OooO00o(Context context) {
        if (EnvUtils.m14975OooO00o()) {
            return C7722o0ooOOO0.OooO0O0;
        }
        if (context == null) {
            return C7722o0ooOOO0.OooO00o;
        }
        String str = C7722o0ooOOO0.OooO00o;
        return TextUtils.isEmpty(str) ? C7722o0ooOOO0.OooO00o : str;
    }

    public static String OooO0O0(Context context) {
        Cursor query = context.getContentResolver().query(Uri.parse(OooO00o), null, null, null, null);
        String str = null;
        if (query != null && query.getCount() > 0) {
            if (query.moveToFirst()) {
                str = query.getString(query.getColumnIndex("url"));
            }
            query.close();
        }
        return str;
    }
}
