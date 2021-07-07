package com.umeng.message.inapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.MsgConstant;
import com.umeng.message.common.C3780d;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.provider.C3857a;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class InAppMessageManager {

    /* renamed from: a */
    public static boolean f10168a = false;

    /* renamed from: b */
    public static int f10169b = 1800000;

    /* renamed from: c */
    public static int f10170c = 1000;

    /* renamed from: d */
    public static final String f10171d = "com.umeng.message.inapp.InAppMessageManager";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e */
    public static InAppMessageManager f10172e = null;

    /* renamed from: i */
    public static final String f10173i = "tempkey";

    /* renamed from: j */
    public static final String f10174j = "tempvalue";

    /* renamed from: f */
    public Context f10175f;

    /* renamed from: g */
    public String f10176g;

    /* renamed from: h */
    public UInAppHandler f10177h = new UmengInAppClickHandler();

    public InAppMessageManager(Context context) {
        this.f10175f = context;
    }

    public static InAppMessageManager getInstance(Context context) {
        if (f10172e == null) {
            synchronized (InAppMessageManager.class) {
                if (f10172e == null) {
                    f10172e = new InAppMessageManager(context.getApplicationContext());
                }
            }
        }
        return f10172e;
    }

    /* renamed from: j */
    private int m10356j(String str) {
        return Integer.valueOf(m10354a(str, "0")).intValue();
    }

    /* renamed from: b */
    public String[] mo39791b() {
        String a = m10354a(MsgConstant.KEY_PLAIN_TEXT_SIZE, "");
        if (!TextUtils.isEmpty(a)) {
            return a.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        return null;
    }

    /* renamed from: c */
    public void mo39793c() {
        m10355b(MsgConstant.KEY_SPLASH_TS, System.currentTimeMillis() + "");
    }

    /* renamed from: d */
    public long mo39795d() {
        return Long.valueOf(m10354a(MsgConstant.KEY_SPLASH_TS, "0")).longValue();
    }

    /* renamed from: e */
    public String mo39797e() {
        return m10354a(MsgConstant.KEY_LAST_SPLASH_ID, "");
    }

    /* renamed from: f */
    public String mo39799f() {
        return m10354a(MsgConstant.KEY_CARD_LABEL_LIST, "");
    }

    /* renamed from: g */
    public String mo39802g() {
        return m10354a(MsgConstant.KEY_LAST_VERSION_CODE, "");
    }

    public UInAppHandler getInAppHandler() {
        return this.f10177h;
    }

    /* renamed from: h */
    public void mo39804h() {
        m10355b(MsgConstant.KEY_LAST_SHOW_SPLASH_TS, System.currentTimeMillis() + "");
    }

    /* renamed from: i */
    public long mo39806i() {
        return Long.parseLong(m10354a(MsgConstant.KEY_LAST_SHOW_SPLASH_TS, "0"));
    }

    public void setInAppHandler(UInAppHandler uInAppHandler) {
        this.f10177h = uInAppHandler;
    }

    public void setInAppMsgDebugMode(boolean z) {
        f10168a = z;
    }

    public void setMainActivityPath(String str) {
        this.f10176g = str;
    }

    public void setPlainTextSize(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0 || i3 <= 0) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10171d, 0, "纯文本字体大小不能小于0");
            return;
        }
        m10355b(MsgConstant.KEY_PLAIN_TEXT_SIZE, i + Constants.ACCEPT_TIME_SEPARATOR_SP + i2 + Constants.ACCEPT_TIME_SEPARATOR_SP + i3);
    }

    public void showCardMessage(Activity activity, String str, IUmengInAppMsgCloseCallback iUmengInAppMsgCloseCallback) {
        new C3804b(activity, str, iUmengInAppMsgCloseCallback).mo39856a();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: k */
    private C3803a m10357k(String str) {
        ContentResolver contentResolver = this.f10175f.getContentResolver();
        C3857a.m10616a(this.f10175f);
        Cursor query = contentResolver.query(C3857a.f10486k, null, "MsgId=?", new String[]{str}, null);
        C3803a aVar = query.moveToFirst() ? new C3803a(query) : null;
        if (query != null) {
            query.close();
        }
        return aVar;
    }

    /* renamed from: c */
    public String mo39792c(String str) {
        return m10354a("KEY_LAST_CARD_ID_" + str, "");
    }

    /* renamed from: d */
    public void mo39796d(String str) {
        m10355b(MsgConstant.KEY_CARD_LABEL_LIST, str);
    }

    /* renamed from: e */
    public void mo39798e(String str) {
        m10355b(MsgConstant.KEY_LAST_VERSION_CODE, str);
    }

    /* renamed from: f */
    public void mo39800f(String str) {
        m10355b("KEY_LAST_SHOW_CARD_TS_" + str, System.currentTimeMillis() + "");
    }

    /* renamed from: g */
    public long mo39801g(String str) {
        return Long.parseLong(m10354a("KEY_LAST_SHOW_CARD_TS_" + str, "0"));
    }

    /* renamed from: h */
    public boolean mo39805h(String str) {
        String[] strArr = {str};
        ContentResolver contentResolver = this.f10175f.getContentResolver();
        C3857a.m10616a(this.f10175f);
        if (contentResolver.delete(C3857a.f10486k, "MsgId=?", strArr) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void mo39807i(final String str) {
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.inapp.InAppMessageManager.RunnableC37883 */

            public void run() {
                Cursor cursor = null;
                try {
                    new ContentValues().put("tempkey", str);
                    ContentResolver contentResolver = InAppMessageManager.this.f10175f.getContentResolver();
                    C3857a.m10616a(InAppMessageManager.this.f10175f);
                    cursor = contentResolver.query(C3857a.f10478c, new String[]{"tempvalue"}, null, null, null);
                    if (cursor != null) {
                        String[] strArr = {str};
                        ContentResolver contentResolver2 = InAppMessageManager.this.f10175f.getContentResolver();
                        C3857a.m10616a(InAppMessageManager.this.f10175f);
                        contentResolver2.delete(C3857a.f10478c, "tempkey=?", strArr);
                    }
                    if (cursor == null) {
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (0 == 0) {
                        return;
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
                cursor.close();
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (0 == 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r1 != null) goto L_0x003c;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.umeng.message.inapp.C3803a> mo39808j() {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.content.Context r2 = r9.f10175f     // Catch:{ Exception -> 0x0036 }
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch:{ Exception -> 0x0036 }
            android.content.Context r2 = r9.f10175f     // Catch:{ Exception -> 0x0036 }
            com.umeng.message.provider.C3857a.m10616a(r2)     // Catch:{ Exception -> 0x0036 }
            android.net.Uri r4 = com.umeng.message.provider.C3857a.f10486k     // Catch:{ Exception -> 0x0036 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0036 }
            r2 = 0
            if (r1 == 0) goto L_0x0022
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x0036 }
        L_0x0022:
            if (r2 == 0) goto L_0x0031
            com.umeng.message.inapp.a r2 = new com.umeng.message.inapp.a     // Catch:{ Exception -> 0x0036 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0036 }
            r0.add(r2)     // Catch:{ Exception -> 0x0036 }
            boolean r2 = r1.moveToNext()     // Catch:{ Exception -> 0x0036 }
            goto L_0x0022
        L_0x0031:
            if (r1 == 0) goto L_0x003f
            goto L_0x003c
        L_0x0034:
            r0 = move-exception
            goto L_0x0040
        L_0x0036:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x003f
        L_0x003c:
            r1.close()
        L_0x003f:
            return r0
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            r1.close()
        L_0x0045:
            goto L_0x0047
        L_0x0046:
            throw r0
        L_0x0047:
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.inapp.InAppMessageManager.mo39808j():java.util.ArrayList");
    }

    /* renamed from: a */
    public String mo39782a() {
        return this.f10176g;
    }

    /* renamed from: c */
    public boolean mo39794c(UInAppMessage uInAppMessage) {
        if (uInAppMessage.show_times != 0 && m10356j(uInAppMessage.msg_id) >= uInAppMessage.show_times) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo39786a(String str) {
        m10355b("KEY_CARD_TS_" + str, System.currentTimeMillis() + "");
    }

    /* renamed from: b */
    public long mo39789b(String str) {
        return Long.valueOf(m10354a("KEY_CARD_TS_" + str, "0")).longValue();
    }

    /* renamed from: a */
    public void mo39783a(UInAppMessage uInAppMessage) {
        if (uInAppMessage == null) {
            m10355b(MsgConstant.KEY_LAST_SPLASH_ID, "");
        } else if (uInAppMessage.getRaw() != null) {
            m10355b(MsgConstant.KEY_LAST_SPLASH_ID, uInAppMessage.getRaw().toString());
        }
    }

    /* renamed from: b */
    public boolean mo39790b(UInAppMessage uInAppMessage) {
        try {
            if (System.currentTimeMillis() < new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).parse(uInAppMessage.expire_time).getTime()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public void mo39784a(UInAppMessage uInAppMessage, String str) {
        if (uInAppMessage == null) {
            m10355b("KEY_LAST_CARD_ID_" + str, "");
        } else if (uInAppMessage.getRaw() != null) {
            m10355b("KEY_LAST_CARD_ID_" + str, uInAppMessage.getRaw().toString());
        }
    }

    /* renamed from: b */
    private void m10355b(final String str, final String str2) {
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.inapp.InAppMessageManager.RunnableC37872 */

            public void run() {
                Cursor cursor = null;
                try {
                    String[] strArr = {str};
                    ContentResolver contentResolver = InAppMessageManager.this.f10175f.getContentResolver();
                    C3857a.m10616a(InAppMessageManager.this.f10175f);
                    cursor = contentResolver.query(C3857a.f10478c, new String[]{"tempvalue"}, "tempkey=?", strArr, null);
                    if (cursor == null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("tempkey", str);
                        contentValues.put("tempvalue", str2);
                        ContentResolver contentResolver2 = InAppMessageManager.this.f10175f.getContentResolver();
                        C3857a.m10616a(InAppMessageManager.this.f10175f);
                        contentResolver2.insert(C3857a.f10478c, contentValues);
                    } else if (cursor.moveToFirst()) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("tempvalue", str2);
                        ContentResolver contentResolver3 = InAppMessageManager.this.f10175f.getContentResolver();
                        C3857a.m10616a(InAppMessageManager.this.f10175f);
                        contentResolver3.update(C3857a.f10478c, contentValues2, "tempkey=?", strArr);
                    } else {
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("tempkey", str);
                        contentValues3.put("tempvalue", str2);
                        ContentResolver contentResolver4 = InAppMessageManager.this.f10175f.getContentResolver();
                        C3857a.m10616a(InAppMessageManager.this.f10175f);
                        contentResolver4.insert(C3857a.f10478c, contentValues3);
                    }
                    if (cursor == null) {
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (0 == 0) {
                        return;
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
                cursor.close();
            }
        });
    }

    /* renamed from: a */
    public void mo39787a(String str, int i) {
        if (i == 0) {
            m10355b(str, "0");
        }
        if (i == 1) {
            m10355b(str, (m10356j(str) + 1) + "");
        }
    }

    /* renamed from: a */
    public void mo39788a(final String str, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7, final int i8) {
        if (!TextUtils.isEmpty(str)) {
            C3780d.m10347a(new Runnable() {
                /* class com.umeng.message.inapp.InAppMessageManager.RunnableC37861 */

                public void run() {
                    try {
                        C3803a k = InAppMessageManager.this.m10357k(str);
                        if (k != null) {
                            C3803a aVar = new C3803a(str, i, k.f10259d + i2, k.f10260e + i3, k.f10261f + i4, k.f10262g + i5, k.f10263h + i6, k.f10264i + i7, k.f10265j);
                            String[] strArr = {str};
                            ContentResolver contentResolver = InAppMessageManager.this.f10175f.getContentResolver();
                            C3857a.m10616a(InAppMessageManager.this.f10175f);
                            contentResolver.update(C3857a.f10486k, aVar.mo39855a(), "MsgId=?", strArr);
                        } else {
                            C3803a aVar2 = new C3803a(str, i, i2, i3, i4, i5, i6, i7, i8);
                            ContentResolver contentResolver2 = InAppMessageManager.this.f10175f.getContentResolver();
                            C3857a.m10616a(InAppMessageManager.this.f10175f);
                            contentResolver2.insert(C3857a.f10486k, aVar2.mo39855a());
                        }
                        UMLog uMLog = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(InAppMessageManager.f10171d, 2, "store in app cache log success");
                    } catch (Exception e) {
                        UMLog uMLog2 = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(InAppMessageManager.f10171d, 0, "store in app cache log fail");
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r1 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (0 == 0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return r12;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m10354a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "tempvalue"
            r1 = 0
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Exception -> 0x004a }
            r2.<init>()     // Catch:{ Exception -> 0x004a }
            java.lang.String r3 = "tempkey"
            r2.put(r3, r11)     // Catch:{ Exception -> 0x004a }
            java.lang.String r7 = "tempkey=?"
            r2 = 1
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ Exception -> 0x004a }
            r3 = 0
            r8[r3] = r11     // Catch:{ Exception -> 0x004a }
            android.content.Context r11 = r10.f10175f     // Catch:{ Exception -> 0x004a }
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch:{ Exception -> 0x004a }
            android.content.Context r11 = r10.f10175f     // Catch:{ Exception -> 0x004a }
            com.umeng.message.provider.C3857a.m10616a(r11)     // Catch:{ Exception -> 0x004a }
            android.net.Uri r5 = com.umeng.message.provider.C3857a.f10478c     // Catch:{ Exception -> 0x004a }
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ Exception -> 0x004a }
            r6[r3] = r0     // Catch:{ Exception -> 0x004a }
            r9 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x004a }
            if (r1 != 0) goto L_0x0033
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r12
        L_0x0033:
            boolean r11 = r1.moveToFirst()
            if (r11 == 0) goto L_0x0042
            int r11 = r1.getColumnIndex(r0)
            java.lang.String r11 = r1.getString(r11)
            r12 = r11
        L_0x0042:
            if (r1 == 0) goto L_0x0051
        L_0x0044:
            r1.close()
            goto L_0x0051
        L_0x0048:
            r11 = move-exception
            goto L_0x0052
        L_0x004a:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0051
            goto L_0x0044
        L_0x0051:
            return r12
        L_0x0052:
            if (r1 == 0) goto L_0x0057
            r1.close()
        L_0x0057:
            goto L_0x0059
        L_0x0058:
            throw r11
        L_0x0059:
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.inapp.InAppMessageManager.m10354a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public void mo39785a(final File file) {
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.inapp.InAppMessageManager.RunnableC37894 */

            public void run() {
                File file = file;
                if (file != null && file.exists() && file.canWrite() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    for (File file2 : listFiles) {
                        if (!file2.isDirectory()) {
                            file2.delete();
                        }
                    }
                    file.delete();
                }
            }
        });
    }
}
