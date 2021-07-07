package com.p118pd.sdk;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.pd.sdk.oo0OoOO  reason: case insensitive filesystem */
public class C8669oo0OoOO {
    public static final String OooO00o = "data1";
    public static final String OooO0O0 = "display_name";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Activity f21825OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Uri f21826OooO00o = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;

    public C8669oo0OoOO(Activity activity) {
        this.f21825OooO00o = activity;
    }

    public WritableArray OooO00o() {
        WritableArray createArray = Arguments.createArray();
        Cursor query = this.f21825OooO00o.getContentResolver().query(this.f21826OooO00o, new String[]{OooO00o, "display_name"}, null, null, null);
        while (query.moveToNext()) {
            WritableMap createMap = Arguments.createMap();
            String string = query.getString(query.getColumnIndex(OooO00o));
            String string2 = query.getString(query.getColumnIndex("display_name"));
            if (string != null) {
                string = string.replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, " ").replaceAll(" ", "");
            }
            createMap.putString("name", string2);
            createMap.putString("phoneNumber", string);
            createArray.pushMap(createMap);
        }
        query.close();
        return createArray;
    }
}
