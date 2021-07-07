package com.umeng.message.proguard;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import com.umeng.message.MsgConstant;
import com.umeng.message.entity.UMessage;
import com.umeng.message.provider.C3857a;

/* renamed from: com.umeng.message.proguard.l */
public class C3848l {

    /* renamed from: A */
    public static final String f10379A = "exclusive";

    /* renamed from: B */
    public static final String f10380B = "error";

    /* renamed from: C */
    public static final String f10381C = "message";

    /* renamed from: D */
    public static final String f10382D = "time";

    /* renamed from: a */
    public static C3848l f10383a = null;

    /* renamed from: b */
    public static final String f10384b = "MessageStore.db";

    /* renamed from: c */
    public static final String f10385c = "MessageStore";

    /* renamed from: d */
    public static final String f10386d = "MsgTemp";

    /* renamed from: e */
    public static final String f10387e = "MsgAlias";

    /* renamed from: f */
    public static final int f10388f = 3;

    /* renamed from: g */
    public static final String f10389g = "_id";

    /* renamed from: h */
    public static final String f10390h = "MsdId";

    /* renamed from: i */
    public static final String f10391i = "Json";

    /* renamed from: j */
    public static final String f10392j = "SdkVersion";

    /* renamed from: k */
    public static final String f10393k = "ArrivalTime";

    /* renamed from: l */
    public static final String f10394l = "ActionType";

    /* renamed from: m */
    public static final String f10395m = " PRIMARY KEY ";

    /* renamed from: n */
    public static final String f10396n = " AUTOINCREMENT ";

    /* renamed from: o */
    public static final String f10397o = "CREATE TABLE IF NOT EXISTS ";

    /* renamed from: p */
    public static final String f10398p = " Integer ";

    /* renamed from: q */
    public static final String f10399q = " Long ";

    /* renamed from: r */
    public static final String f10400r = " Varchar ";

    /* renamed from: s */
    public static final String f10401s = "(";

    /* renamed from: t */
    public static final String f10402t = ")";

    /* renamed from: u */
    public static final String f10403u = " , ";

    /* renamed from: v */
    public static final String f10404v = " And ";

    /* renamed from: w */
    public static final String f10405w = " desc ";

    /* renamed from: x */
    public static final String f10406x = " asc ";

    /* renamed from: y */
    public static final String f10407y = "type";

    /* renamed from: z */
    public static final String f10408z = "alias";

    /* renamed from: E */
    public Context f10409E;

    public C3848l(Context context) {
        this.f10409E = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C3848l m10576a(Context context) {
        if (f10383a == null) {
            f10383a = new C3848l(context);
        }
        return f10383a;
    }

    /* renamed from: b */
    public boolean mo39917b(String str) {
        return mo39916a(str, 2);
    }

    /* renamed from: a */
    public boolean mo39914a(UMessage uMessage) {
        boolean z = false;
        if (uMessage == null) {
            return false;
        }
        synchronized (f10383a) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(f10390h, uMessage.msg_id);
            contentValues.put(f10391i, uMessage.getRaw().toString());
            contentValues.put(f10392j, MsgConstant.SDK_VERSION);
            contentValues.put(f10393k, Long.valueOf(System.currentTimeMillis()));
            contentValues.put("ActionType", (Integer) 0);
            ContentResolver contentResolver = this.f10409E.getContentResolver();
            C3857a.m10616a(this.f10409E);
            if (contentResolver.insert(C3857a.f10477b, contentValues) != null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo39915a(String str) {
        return mo39916a(str, 1);
    }

    /* renamed from: a */
    public boolean mo39916a(String str, int i) {
        boolean z;
        synchronized (f10383a) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("ActionType", Integer.valueOf(i));
            z = true;
            String[] strArr = {str};
            ContentResolver contentResolver = this.f10409E.getContentResolver();
            C3857a.m10616a(this.f10409E);
            if (contentResolver.update(C3857a.f10477b, contentValues, "MsdId=?", strArr) != 1) {
                z = false;
            }
        }
        return z;
    }
}
