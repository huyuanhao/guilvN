package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.umeng.analytics.pro.f */
public class C3436f {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r1 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (0 == 0) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m8750a(java.lang.String r4, android.database.sqlite.SQLiteDatabase r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            r2.<init>()     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r3 = "select count(*) as c from sqlite_master where type ='table' and name ='"
            r2.append(r3)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r4 = r4.trim()     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            r2.append(r4)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r4 = "' "
            r2.append(r4)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r4 = r2.toString()     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            android.database.Cursor r1 = r5.rawQuery(r4, r1)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            boolean r4 = r1.moveToNext()     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            if (r4 == 0) goto L_0x0031
            int r4 = r1.getInt(r0)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            if (r4 <= 0) goto L_0x0031
            r4 = 1
            r0 = 1
        L_0x0031:
            if (r1 == 0) goto L_0x0042
        L_0x0033:
            r1.close()
            goto L_0x0042
        L_0x0037:
            r4 = move-exception
            if (r1 == 0) goto L_0x003d
            r1.close()
        L_0x003d:
            throw r4
        L_0x003e:
            if (r1 == 0) goto L_0x0042
            goto L_0x0033
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3436f.m8750a(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
    }

    /* renamed from: b */
    public static String m8751b(Context context) {
        File databasePath = context.getDatabasePath(C3417c.f8501b);
        return databasePath.getParent() + File.separator;
    }

    /* renamed from: c */
    public static String m8753c(Context context) {
        return m8751b(context) + "subprocess/";
    }

    /* renamed from: b */
    public static List<String> m8752b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : list) {
                if (Collections.frequency(arrayList, str) < 1) {
                    arrayList.add(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m8747a(Context context) {
        if (context != null) {
            try {
                File databasePath = context.getDatabasePath(C3417c.f8501b);
                if (databasePath != null && databasePath.exists()) {
                    databasePath.delete();
                }
                C3430d.m8730a(context).mo38695a();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m8745a(List<String> list) {
        return TextUtils.join("!", list);
    }

    /* renamed from: a */
    public static List<String> m8746a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r0.isClosed() == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r0.isClosed() == false) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m8749a(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            r2.<init>()     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            java.lang.String r3 = "SELECT * FROM "
            r2.append(r3)     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            r2.append(r5)     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            java.lang.String r5 = " LIMIT 0"
            r2.append(r5)     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            android.database.Cursor r0 = r4.rawQuery(r5, r0)     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            if (r0 == 0) goto L_0x0027
            int r4 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            r5 = -1
            if (r4 == r5) goto L_0x0027
            r4 = 1
            r1 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x004a
            boolean r4 = r0.isClosed()
            if (r4 != 0) goto L_0x004a
        L_0x002f:
            r0.close()
            goto L_0x004a
        L_0x0033:
            r4 = move-exception
            if (r0 == 0) goto L_0x003f
            boolean r5 = r0.isClosed()
            if (r5 != 0) goto L_0x003f
            r0.close()
        L_0x003f:
            throw r4
        L_0x0040:
            if (r0 == 0) goto L_0x004a
            boolean r4 = r0.isClosed()
            if (r4 != 0) goto L_0x004a
            goto L_0x002f
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3436f.m8749a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static void m8748a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.execSQL("alter table " + str + " add " + str2 + " " + str3);
    }
}
