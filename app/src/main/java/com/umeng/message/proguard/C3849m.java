package com.umeng.message.proguard;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.provider.C3857a;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.m */
public class C3849m {

    /* renamed from: A */
    public static final String f10410A = "com.umeng.message.proguard.m";

    /* renamed from: B */
    public static C3849m f10411B = null;

    /* renamed from: D */
    public static final String f10412D = " Asc ";

    /* renamed from: E */
    public static final String f10413E = " Desc ";

    /* renamed from: a */
    public static final String f10414a = " And ";

    /* renamed from: b */
    public static final String f10415b = "MsgLogStore.db";

    /* renamed from: c */
    public static final int f10416c = 7;

    /* renamed from: d */
    public static final String f10417d = "MsgLogStore";

    /* renamed from: e */
    public static final String f10418e = "MsgLogIdTypeStore";

    /* renamed from: f */
    public static final String f10419f = "MsgLogStoreForAgoo";

    /* renamed from: g */
    public static final String f10420g = "MsgLogIdTypeStoreForAgoo";

    /* renamed from: h */
    public static final String f10421h = "MsgConfigInfo";

    /* renamed from: i */
    public static final String f10422i = "InAppLogStore";

    /* renamed from: j */
    public static final String f10423j = "MsgId";

    /* renamed from: k */
    public static final String f10424k = "MsgType";

    /* renamed from: l */
    public static final String f10425l = "ActionType";

    /* renamed from: m */
    public static final String f10426m = "pa";

    /* renamed from: n */
    public static final String f10427n = "Time";

    /* renamed from: o */
    public static final String f10428o = "TaskId";

    /* renamed from: p */
    public static final String f10429p = "MsgStatus";

    /* renamed from: q */
    public static final String f10430q = "SerialNo";

    /* renamed from: r */
    public static final String f10431r = "AppLaunchAt";

    /* renamed from: s */
    public static final String f10432s = "UpdateResponse";

    /* renamed from: t */
    public static final String f10433t = "NumDisplay";

    /* renamed from: u */
    public static final String f10434u = "NumOpenFull";

    /* renamed from: v */
    public static final String f10435v = "NumOpenTop";

    /* renamed from: w */
    public static final String f10436w = "NumOpenBottom";

    /* renamed from: x */
    public static final String f10437x = "NumClose";

    /* renamed from: y */
    public static final String f10438y = "NumDuration";

    /* renamed from: z */
    public static final String f10439z = "NumCustom";

    /* renamed from: C */
    public Context f10440C;

    public C3849m(Context context) {
        this.f10440C = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C3849m m10581a(Context context) {
        if (f10411B == null) {
            C3849m mVar = new C3849m(context);
            f10411B = mVar;
            mVar.m10584h();
        }
        return f10411B;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002d A[SYNTHETIC, Splitter:B:18:0x002d] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m10583b(java.io.File r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x002a }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x002a }
            r2.<init>(r4)     // Catch:{ all -> 0x002a }
            r1.<init>(r2)     // Catch:{ all -> 0x002a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
        L_0x0010:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x001a
            r4.append(r0)     // Catch:{ all -> 0x0027 }
            goto L_0x0010
        L_0x001a:
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r1.close()     // Catch:{ IOException -> 0x0022 }
            goto L_0x0026
        L_0x0022:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0026:
            return r4
        L_0x0027:
            r4 = move-exception
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r4 = move-exception
        L_0x002b:
            if (r0 == 0) goto L_0x0035
            r0.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0035:
            goto L_0x0037
        L_0x0036:
            throw r4
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3849m.m10583b(java.io.File):java.lang.String");
    }

    /* renamed from: h */
    private void m10584h() {
        if (!MessageSharedPrefs.getInstance(this.f10440C).hasTransferedCacheFileDataToSQL()) {
            File[] listFiles = this.f10440C.getCacheDir().listFiles(new FilenameFilter() {
                /* class com.umeng.message.proguard.C3849m.C38501 */

                public boolean accept(File file, String str) {
                    return !TextUtils.isEmpty(str) && str.startsWith(MsgConstant.CACHE_LOG_FILE_PREFIX);
                }
            });
            if (listFiles != null) {
                for (File file : listFiles) {
                    m10582a(file);
                    file.delete();
                }
            }
            MessageSharedPrefs.getInstance(this.f10440C).finishTransferedCacheFileDataToSQL();
        }
    }

    /* renamed from: a */
    public boolean mo39927a(String str, String str2, String str3, long j) {
        return false;
    }

    /* renamed from: c */
    public C3852b mo39932c(String str) {
        C3852b bVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        Cursor query = contentResolver.query(C3857a.f10483h, null, "MsgId=?", new String[]{str}, null);
        if (query.moveToFirst()) {
            bVar = new C3852b(query);
        }
        if (query != null) {
            query.close();
        }
        return bVar;
    }

    /* renamed from: d */
    public boolean mo39937d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = {str};
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        if (contentResolver.delete(C3857a.f10484i, "MsgId=?", strArr) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int mo39938e() {
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        int i = 0;
        Cursor query = contentResolver.query(C3857a.f10485j, new String[]{f10430q}, null, null, null);
        if (query.moveToFirst()) {
            i = query.getInt(query.getColumnIndex(f10430q));
        }
        if (query != null) {
            query.close();
        }
        return i;
    }

    /* renamed from: f */
    public long mo39940f() {
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        Cursor query = contentResolver.query(C3857a.f10485j, new String[]{f10431r}, null, null, null);
        long j = 0;
        if (query == null) {
            return 0;
        }
        if (query.moveToFirst()) {
            j = query.getLong(query.getColumnIndex(f10431r));
        }
        if (query != null) {
            query.close();
        }
        String str = "appLaunchAt=" + j;
        return j;
    }

    /* renamed from: g */
    public Object mo39941g() {
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        Cursor query = contentResolver.query(C3857a.f10485j, new String[]{f10432s}, null, null, null);
        String string = query.moveToFirst() ? query.getString(query.getColumnIndex(f10432s)) : null;
        if (query != null) {
            query.close();
        }
        String str = "updateResponse=" + string;
        return C3819h.m10568f(string);
    }

    /* renamed from: com.umeng.message.proguard.m$c */
    public class C3853c {

        /* renamed from: a */
        public String f10452a;

        /* renamed from: b */
        public String f10453b;

        public C3853c(String str, String str2) {
            this.f10452a = str;
            this.f10453b = str2;
        }

        /* renamed from: a */
        public ContentValues mo39945a() {
            ContentValues contentValues = new ContentValues();
            contentValues.put(C3849m.f10423j, this.f10452a);
            contentValues.put(C3849m.f10424k, this.f10453b);
            return contentValues;
        }

        public C3853c(Cursor cursor) {
            this.f10452a = cursor.getString(cursor.getColumnIndex(C3849m.f10423j));
            this.f10453b = cursor.getString(cursor.getColumnIndex(C3849m.f10424k));
        }
    }

    /* renamed from: d */
    public ArrayList<C3854d> mo39936d(int i) {
        if (i < 1) {
            return null;
        }
        ArrayList<C3854d> arrayList = new ArrayList<>();
        C3857a.m10616a(this.f10440C);
        Uri.Builder buildUpon = C3857a.f10484i.buildUpon();
        Cursor query = this.f10440C.getContentResolver().query(buildUpon.appendQueryParameter("limit", i + "").build(), null, null, null, "MsgId Asc ");
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new C3854d(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    /* renamed from: com.umeng.message.proguard.m$d */
    public class C3854d {

        /* renamed from: a */
        public String f10455a;

        /* renamed from: b */
        public String f10456b;

        /* renamed from: c */
        public String f10457c;

        public C3854d(String str, String str2, String str3) {
            this.f10455a = str;
            this.f10456b = str2;
            this.f10457c = str3;
        }

        /* renamed from: a */
        public ContentValues mo39946a() {
            ContentValues contentValues = new ContentValues();
            contentValues.put(C3849m.f10423j, this.f10455a);
            contentValues.put(C3849m.f10428o, this.f10456b);
            contentValues.put(C3849m.f10429p, this.f10457c);
            return contentValues;
        }

        public C3854d(Cursor cursor) {
            this.f10455a = cursor.getString(cursor.getColumnIndex(C3849m.f10423j));
            this.f10456b = cursor.getString(cursor.getColumnIndex(C3849m.f10428o));
            this.f10457c = cursor.getString(cursor.getColumnIndex(C3849m.f10429p));
        }
    }

    /* renamed from: com.umeng.message.proguard.m$a */
    public class C3851a {

        /* renamed from: a */
        public String f10442a;

        /* renamed from: b */
        public long f10443b;

        /* renamed from: c */
        public int f10444c;

        /* renamed from: d */
        public String f10445d;

        public C3851a(String str, int i, long j, String str2) {
            this.f10442a = str;
            this.f10444c = i;
            this.f10443b = j;
            this.f10445d = str2;
        }

        /* renamed from: a */
        public ContentValues mo39943a() {
            ContentValues contentValues = new ContentValues();
            contentValues.put(C3849m.f10423j, this.f10442a);
            contentValues.put(C3849m.f10427n, Long.valueOf(this.f10443b));
            contentValues.put("ActionType", Integer.valueOf(this.f10444c));
            contentValues.put("pa", this.f10445d);
            return contentValues;
        }

        public C3851a(Cursor cursor) {
            this.f10442a = cursor.getString(cursor.getColumnIndex(C3849m.f10423j));
            this.f10443b = cursor.getLong(cursor.getColumnIndex(C3849m.f10427n));
            this.f10444c = cursor.getInt(cursor.getColumnIndex("ActionType"));
            this.f10445d = cursor.getString(cursor.getColumnIndex("pa"));
        }
    }

    /* renamed from: com.umeng.message.proguard.m$b */
    public class C3852b {

        /* renamed from: a */
        public String f10447a;

        /* renamed from: b */
        public String f10448b;

        /* renamed from: c */
        public String f10449c;

        /* renamed from: d */
        public long f10450d;

        public C3852b(String str, String str2, String str3, long j) {
            this.f10447a = str;
            this.f10448b = str2;
            this.f10449c = str3;
            this.f10450d = j;
        }

        /* renamed from: a */
        public ContentValues mo39944a() {
            ContentValues contentValues = new ContentValues();
            contentValues.put(C3849m.f10423j, this.f10447a);
            contentValues.put(C3849m.f10428o, this.f10448b);
            contentValues.put(C3849m.f10429p, this.f10449c);
            contentValues.put(C3849m.f10427n, Long.valueOf(this.f10450d));
            return contentValues;
        }

        public C3852b(Cursor cursor) {
            this.f10447a = cursor.getString(cursor.getColumnIndex(C3849m.f10423j));
            this.f10448b = cursor.getString(cursor.getColumnIndex(C3849m.f10428o));
            this.f10449c = cursor.getString(cursor.getColumnIndex(C3849m.f10429p));
            this.f10450d = cursor.getLong(cursor.getColumnIndex(C3849m.f10427n));
        }
    }

    /* renamed from: a */
    private void m10582a(File file) {
        try {
            JSONObject jSONObject = new JSONObject(m10583b(file));
            mo39924a(jSONObject.optString("msg_id"), jSONObject.optInt(MsgConstant.KEY_ACTION_TYPE), jSONObject.optLong("ts"), jSONObject.optString("pa"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public void mo39939e(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(f10430q, i + "");
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        contentResolver.update(C3857a.f10485j, contentValues, null, null);
    }

    /* renamed from: c */
    public ArrayList<C3852b> mo39934c(int i) {
        if (i < 1) {
            return null;
        }
        ArrayList<C3852b> arrayList = new ArrayList<>();
        C3857a.m10616a(this.f10440C);
        Uri.Builder buildUpon = C3857a.f10483h.buildUpon();
        Cursor query = this.f10440C.getContentResolver().query(buildUpon.appendQueryParameter("limit", i + "").build(), null, null, null, "Time Asc ");
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new C3852b(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean mo39930b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = {str};
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        if (contentResolver.delete(C3857a.f10482g, "MsgId=?", strArr) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public ArrayList<C3854d> mo39935d() {
        ArrayList<C3854d> arrayList = new ArrayList<>();
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        Cursor query = contentResolver.query(C3857a.f10484i, null, null, null, "MsgId Asc ");
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new C3854d(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo39924a(String str, int i, long j, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str2 == null) {
            str2 = "";
        }
        C3851a aVar = new C3851a(str, i, j, str2);
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        if (contentResolver.insert(C3857a.f10481f, aVar.mo39943a()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public ArrayList<C3853c> mo39929b(int i) {
        if (i < 1) {
            return null;
        }
        ArrayList<C3853c> arrayList = new ArrayList<>();
        C3857a.m10616a(this.f10440C);
        Uri.Builder buildUpon = C3857a.f10482g.buildUpon();
        Cursor query = this.f10440C.getContentResolver().query(buildUpon.appendQueryParameter("limit", i + "").build(), null, null, null, "MsgId Asc ");
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new C3853c(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    /* renamed from: c */
    public ArrayList<C3852b> mo39933c() {
        ArrayList<C3852b> arrayList = new ArrayList<>();
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        Cursor query = contentResolver.query(C3857a.f10483h, null, null, null, "Time Asc ");
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new C3852b(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo39923a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = {str, i + ""};
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        if (contentResolver.delete(C3857a.f10481f, "MsgId=? And ActionType=?", strArr) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C3851a mo39918a(String str) {
        C3851a aVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        Cursor query = contentResolver.query(C3857a.f10481f, null, "MsgId=?", new String[0], null);
        if (query.moveToFirst()) {
            aVar = new C3851a(query);
        }
        if (query != null) {
            query.close();
        }
        return aVar;
    }

    /* renamed from: b */
    public ArrayList<C3853c> mo39928b() {
        ArrayList<C3853c> arrayList = new ArrayList<>();
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        Cursor query = contentResolver.query(C3857a.f10482g, null, null, null, "MsgId Asc ");
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new C3853c(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    /* renamed from: a */
    public ArrayList<C3851a> mo39920a(int i) {
        if (i < 1) {
            return null;
        }
        ArrayList<C3851a> arrayList = new ArrayList<>();
        C3857a.m10616a(this.f10440C);
        Cursor query = this.f10440C.getContentResolver().query(C3857a.f10481f, null, null, null, "Time Asc  limit " + i);
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new C3851a(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean mo39931b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = {str, str2};
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        if (contentResolver.delete(C3857a.f10483h, "MsgId=? And MsgStatus=?", strArr) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public ArrayList<C3851a> mo39919a() {
        ArrayList<C3851a> arrayList = new ArrayList<>();
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        Cursor query = contentResolver.query(C3857a.f10481f, null, null, null, "Time Asc ");
        if (query == null) {
            return arrayList;
        }
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new C3851a(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo39925a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C3853c cVar = new C3853c(str, str2);
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        if (contentResolver.insert(C3857a.f10482g, cVar.mo39945a()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo39926a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C3854d dVar = new C3854d(str, str2, str3);
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        if (contentResolver.insert(C3857a.f10484i, dVar.mo39946a()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo39921a(long j) {
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        Cursor query = contentResolver.query(C3857a.f10485j, new String[]{f10431r}, null, null, null);
        int count = query.getCount();
        if (query != null) {
            query.close();
        }
        if (count > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(f10431r, j + "");
            ContentResolver contentResolver2 = this.f10440C.getContentResolver();
            C3857a.m10616a(this.f10440C);
            contentResolver2.update(C3857a.f10485j, contentValues, null, null);
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(f10431r, j + "");
        ContentResolver contentResolver3 = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        contentResolver3.insert(C3857a.f10485j, contentValues2);
    }

    /* renamed from: a */
    public void mo39922a(Object obj) {
        String a = C3819h.m10541a(obj);
        ContentValues contentValues = new ContentValues();
        contentValues.put(f10432s, a);
        ContentResolver contentResolver = this.f10440C.getContentResolver();
        C3857a.m10616a(this.f10440C);
        contentResolver.update(C3857a.f10485j, contentValues, null, null);
    }
}
