package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import com.taobao.accs.common.Constants;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.push.C4312cd;

/* renamed from: com.xiaomi.push.ca */
public class C4309ca extends C4312cd.C4317e {

    /* renamed from: a */
    public String f11475a = "MessageInsertJob";

    public C4309ca(String str, ContentValues contentValues, String str2) {
        super(str, contentValues);
        this.f11475a = str2;
    }

    /* renamed from: a */
    public static C4309ca m11917a(Context context, String str, C4498hs hsVar) {
        byte[] a = C4531iy.m13590a(hsVar);
        if (a == null || a.length <= 0) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 0);
        contentValues.put(MiPushMessage.KEY_MESSAGE_ID, "");
        contentValues.put("messageItemId", hsVar.mo42029d());
        contentValues.put("messageItem", a);
        contentValues.put("appId", C4298br.m11843a(context).mo41538b());
        contentValues.put(Constants.KEY_PACKAGE_NAME, C4298br.m11843a(context).m11850a());
        contentValues.put("createTimeStamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("uploadTimestamp", (Integer) 0);
        return new C4309ca(str, contentValues, "a job build to insert message to db");
    }
}
