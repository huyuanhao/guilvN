package com.p118pd.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.umeng.message.proguard.C3848l;
import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.ooOO00OO  reason: case insensitive filesystem */
public class C8894ooOO00OO {
    public static String OooO00o(int i) {
        String[] strArr = new String[i];
        Arrays.fill(strArr, C8932ooOOO0o.f22176OooO00o);
        return "key IN (" + TextUtils.join(", ", strArr) + C3848l.f10402t;
    }

    public static boolean OooO0O0(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("value", str2);
        return -1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5);
    }

    public static String[] OooO00o(ReadableArray readableArray, int i, int i2) {
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = readableArray.getString(i + i3);
        }
        return strArr;
    }

    @Nullable
    public static String OooO00o(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (!query.moveToFirst()) {
                return null;
            }
            String string = query.getString(0);
            query.close();
            return string;
        } finally {
            query.close();
        }
    }

    public static boolean OooO00o(SQLiteDatabase sQLiteDatabase, String str, String str2) throws JSONException {
        String OooO00o = OooO00o(sQLiteDatabase, str);
        if (OooO00o != null) {
            JSONObject jSONObject = new JSONObject(OooO00o);
            OooO00o(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
        }
        return OooO0O0(sQLiteDatabase, str, str2);
    }

    public static void OooO00o(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject2.optJSONObject(next);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
            if (optJSONObject == null || optJSONObject2 == null) {
                jSONObject.put(next, jSONObject2.get(next));
            } else {
                OooO00o(optJSONObject2, optJSONObject);
                jSONObject.put(next, optJSONObject2);
            }
        }
    }
}
