package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.C3417c;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.g */
public class C3437g {

    /* renamed from: a */
    public static final int f8575a = 2049;

    /* renamed from: b */
    public static final int f8576b = 2050;

    /* renamed from: c */
    public static final int f8577c = 1000;

    /* renamed from: d */
    public static Context f8578d = null;

    /* renamed from: e */
    public static String f8579e = null;

    /* renamed from: f */
    public static final String f8580f = "umeng+";

    /* renamed from: g */
    public static final String f8581g = "ek__id";

    /* renamed from: h */
    public static final String f8582h = "ek_key";

    /* renamed from: i */
    public List<String> f8583i;

    /* renamed from: j */
    public List<Integer> f8584j;

    /* renamed from: k */
    public String f8585k;

    /* renamed from: l */
    public List<String> f8586l;

    /* renamed from: com.umeng.analytics.pro.g$a */
    public enum EnumC3439a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION,
        INSTANTSESSIONBEGIN
    }

    /* renamed from: com.umeng.analytics.pro.g$b */
    public static class C3440b {

        /* renamed from: a */
        public static final C3437g f8594a = new C3437g();
    }

    /* renamed from: a */
    public static C3437g m8754a(Context context) {
        C3437g gVar = C3440b.f8594a;
        if (f8578d == null && context != null) {
            f8578d = context.getApplicationContext();
            gVar.m8763k();
        }
        return gVar;
    }

    /* renamed from: k */
    private void m8763k() {
        synchronized (this) {
            m8764l();
            this.f8583i.clear();
            this.f8586l.clear();
            this.f8584j.clear();
        }
    }

    /* renamed from: l */
    private void m8764l() {
        try {
            if (TextUtils.isEmpty(f8579e)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(f8578d, "ek__id");
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(f8578d).getString("ek__id", null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = DeviceConfig.getDBencryptID(f8578d);
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(f8578d, "ek__id", multiProcessSP);
                    }
                }
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    String substring = multiProcessSP.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < substring.length(); i++) {
                        char charAt = substring.charAt(i);
                        if (!Character.isDigit(charAt)) {
                            sb.append(charAt);
                        } else if (Integer.parseInt(Character.toString(charAt)) == 0) {
                            sb.append(0);
                        } else {
                            sb.append(10 - Integer.parseInt(Character.toString(charAt)));
                        }
                    }
                    f8579e = sb.toString();
                }
                if (!TextUtils.isEmpty(f8579e)) {
                    f8579e += new StringBuilder(f8579e).reverse().toString();
                    String multiProcessSP2 = UMUtils.getMultiProcessSP(f8578d, "ek_key");
                    if (TextUtils.isEmpty(multiProcessSP2)) {
                        UMUtils.setMultiProcessSP(f8578d, "ek_key", mo38712c("umeng+"));
                    } else if (!"umeng+".equals(mo38714d(multiProcessSP2))) {
                        mo38711b(true, false);
                        mo38705a(true, false);
                        mo38719h();
                        mo38720i();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo38709b() {
        this.f8586l.clear();
    }

    /* renamed from: c */
    public boolean mo38713c() {
        return this.f8586l.isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        if (r0 != null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        if (r0 == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (r0 == null) goto L_0x0075;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007f */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38715d() {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38715d():void");
    }

    /* renamed from: e */
    public boolean mo38716e() {
        return this.f8583i.isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r2 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a6, code lost:
        if (r2 == null) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo38717f() {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38717f():org.json.JSONObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r2 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a6, code lost:
        if (r2 == null) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo38718g() {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38718g():org.json.JSONObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (0 == 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (0 == 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (r0 != null) goto L_0x0049;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0056 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38719h() {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38719h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r0 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r0 != null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (r0 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38720i() {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C3437g.f8578d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0028, all -> 0x0019 }
            com.umeng.analytics.pro.e r1 = com.umeng.analytics.pro.C3433e.m8741a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0028, all -> 0x0019 }
            android.database.sqlite.SQLiteDatabase r0 = r1.mo38698a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0028, all -> 0x0019 }
            r0.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0028, all -> 0x0019 }
            java.lang.String r1 = "delete from __er"
            r0.execSQL(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0028, all -> 0x0019 }
            r0.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0028, all -> 0x0019 }
            if (r0 == 0) goto L_0x001e
            goto L_0x001b
        L_0x0019:
            if (r0 == 0) goto L_0x001e
        L_0x001b:
            r0.endTransaction()     // Catch:{ all -> 0x001e }
        L_0x001e:
            android.content.Context r0 = com.umeng.analytics.pro.C3437g.f8578d
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3433e.m8741a(r0)
            r0.mo38699b()
            goto L_0x0030
        L_0x0028:
            android.content.Context r1 = com.umeng.analytics.pro.C3437g.f8578d     // Catch:{ all -> 0x0031 }
            com.umeng.analytics.pro.C3436f.m8747a(r1)     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x001e
            goto L_0x001b
        L_0x0030:
            return
        L_0x0031:
            r1 = move-exception
            if (r0 == 0) goto L_0x0037
            r0.endTransaction()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            android.content.Context r0 = com.umeng.analytics.pro.C3437g.f8578d
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3433e.m8741a(r0)
            r0.mo38699b()
            goto L_0x0042
        L_0x0041:
            throw r1
        L_0x0042:
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38720i():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (r1 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004d, code lost:
        if (r1 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        if (r1 != null) goto L_0x0053;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0061 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38721j() {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38721j():void");
    }

    public C3437g() {
        this.f8583i = new ArrayList();
        this.f8584j = new ArrayList();
        this.f8585k = null;
        this.f8586l = new ArrayList();
    }

    /* renamed from: b */
    private void m8760b(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long longValue = ((Long) jSONObject.get("__e")).longValue();
            JSONObject optJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("__pp");
            String str2 = "";
            String c = (optJSONObject == null || optJSONObject.length() <= 0) ? str2 : mo38712c(optJSONObject.toString());
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                str2 = mo38712c(optJSONObject2.toString());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("__ii", str);
            contentValues.put("__e", String.valueOf(longValue));
            contentValues.put("__sp", c);
            contentValues.put("__pp", str2);
            contentValues.put("__av", UMGlobalContext.getInstance().getAppVersion());
            contentValues.put("__vc", UMUtils.getAppVersionCode(f8578d));
            sQLiteDatabase.insert(C3417c.C3424c.f8529a, null, contentValues);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8762c(java.lang.String r10, org.json.JSONObject r11, android.database.sqlite.SQLiteDatabase r12) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.m8762c(java.lang.String, org.json.JSONObject, android.database.sqlite.SQLiteDatabase):void");
    }

    /* renamed from: a */
    public void mo38702a() {
        this.f8583i.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        if (r2 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        if (r2 != null) goto L_0x009c;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00a9 */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ExcHandler: all (unused java.lang.Throwable), SYNTHETIC, Splitter:B:3:0x000f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38703a(org.json.JSONArray r11) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38703a(org.json.JSONArray):void");
    }

    /* renamed from: d */
    public String mo38714d(String str) {
        try {
            return TextUtils.isEmpty(f8579e) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f8579e.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public JSONObject mo38708b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        m8759b(jSONObject, z);
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r1 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r1 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        if (r1 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0071 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8761b(org.json.JSONObject r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.m8761b(org.json.JSONObject, java.lang.String):void");
    }

    /* renamed from: c */
    public String mo38712c(String str) {
        try {
            return TextUtils.isEmpty(f8579e) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f8579e.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r0 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (r0 != null) goto L_0x005a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0067 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38706a(java.lang.String r5, java.lang.String r6, int r7) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38706a(java.lang.String, java.lang.String, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r1 != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00dd, code lost:
        if (r1 != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00da  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m8759b(org.json.JSONObject r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.m8759b(org.json.JSONObject, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        if (r2 != null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        if (r2 != null) goto L_0x0089;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0096 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38707a(java.lang.String r7, org.json.JSONObject r8, com.umeng.analytics.pro.C3437g.EnumC3439a r9) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38707a(java.lang.String, org.json.JSONObject, com.umeng.analytics.pro.g$a):boolean");
    }

    /* renamed from: a */
    private void m8756a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long longValue = ((Long) jSONObject.opt(C3417c.C3427d.C3428a.f8549g)).longValue();
            JSONObject optJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("__pp");
            String str2 = "";
            String c = (optJSONObject == null || optJSONObject.length() <= 0) ? str2 : mo38712c(optJSONObject.toString());
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                str2 = mo38712c(optJSONObject2.toString());
            }
            sQLiteDatabase.execSQL("update __sd set __f=\"" + longValue + "\", " + "__sp" + "=\"" + c + "\", " + "__pp" + "=\"" + str2 + "\" where " + "__ii" + "=\"" + str + "\"");
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r0 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        if (0 == 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (0 == 0) goto L_0x0058;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0062 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38711b(boolean r3, boolean r4) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38711b(boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r3 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r3 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        r3.endTransaction();
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047 A[SYNTHETIC, Splitter:B:15:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c A[Catch:{ Exception -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo38700a(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38700a(java.lang.String):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (0 == 0) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        if (r0 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (0 == 0) goto L_0x0038;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0042 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38710b(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C3437g.f8578d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0042, all -> 0x0033 }
            com.umeng.analytics.pro.e r1 = com.umeng.analytics.pro.C3433e.m8741a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0042, all -> 0x0033 }
            android.database.sqlite.SQLiteDatabase r0 = r1.mo38698a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0042, all -> 0x0033 }
            r0.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0042, all -> 0x0033 }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0042, all -> 0x0033 }
            if (r1 != 0) goto L_0x002d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0042, all -> 0x0033 }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0042, all -> 0x0033 }
            java.lang.String r2 = "delete from __is where __ii=\""
            r1.append(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0042, all -> 0x0033 }
            r1.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0042, all -> 0x0033 }
            java.lang.String r4 = "\""
            r1.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0042, all -> 0x0033 }
            java.lang.String r4 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0042, all -> 0x0033 }
            r0.execSQL(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0042, all -> 0x0033 }
        L_0x002d:
            r0.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0042, all -> 0x0033 }
            if (r0 == 0) goto L_0x0038
            goto L_0x0035
        L_0x0033:
            if (r0 == 0) goto L_0x0038
        L_0x0035:
            r0.endTransaction()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            android.content.Context r4 = com.umeng.analytics.pro.C3437g.f8578d
            com.umeng.analytics.pro.e r4 = com.umeng.analytics.pro.C3433e.m8741a(r4)
            r4.mo38699b()
            goto L_0x004a
        L_0x0042:
            android.content.Context r4 = com.umeng.analytics.pro.C3437g.f8578d     // Catch:{ all -> 0x004b }
            com.umeng.analytics.pro.C3436f.m8747a(r4)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0038
            goto L_0x0035
        L_0x004a:
            return
        L_0x004b:
            r4 = move-exception
            if (r0 == 0) goto L_0x0051
            r0.endTransaction()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            android.content.Context r0 = com.umeng.analytics.pro.C3437g.f8578d
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3433e.m8741a(r0)
            r0.mo38699b()
            goto L_0x005c
        L_0x005b:
            throw r4
        L_0x005c:
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38710b(java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8757a(java.lang.String r8, org.json.JSONObject r9, android.database.sqlite.SQLiteDatabase r10, java.lang.String r11) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.m8757a(java.lang.String, org.json.JSONObject, android.database.sqlite.SQLiteDatabase, java.lang.String):void");
    }

    /* renamed from: a */
    public JSONObject mo38701a(boolean z) {
        mo38702a();
        this.f8584j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            m8755a(jSONObject, z);
            m8761b(jSONObject, (String) null);
            m8758a(jSONObject, (String) null);
        } else {
            String a = m8755a(jSONObject, z);
            if (!TextUtils.isEmpty(a)) {
                m8761b(jSONObject, a);
                m8758a(jSONObject, a);
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016b, code lost:
        if (r1 != null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0179, code lost:
        if (r1 != null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0187, code lost:
        if (r1 == null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x016f */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0184  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8758a(org.json.JSONObject r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 429
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.m8758a(org.json.JSONObject, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017b, code lost:
        if (r2 != null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018e, code lost:
        if (r2 != null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019d, code lost:
        if (r2 != null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0184 */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m8755a(org.json.JSONObject r18, boolean r19) {
        /*
        // Method dump skipped, instructions count: 451
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.m8755a(org.json.JSONObject, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r0 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (0 == 0) goto L_0x006b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38705a(boolean r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38705a(boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        if (0 == 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0063, code lost:
        if (r0 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0066, code lost:
        if (0 == 0) goto L_0x006b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0075 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38704a(boolean r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3437g.mo38704a(boolean, java.lang.String):void");
    }
}
