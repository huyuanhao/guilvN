package com.p118pd.sdk;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.lang.ref.WeakReference;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.o0oOoOoo  reason: case insensitive filesystem */
public final class C7651o0oOoOoo extends SQLiteOpenHelper {
    public static final int o00oO0O = 1;
    public static final String o0ooOOo = "msp.db";
    public WeakReference<Context> OooO00o;

    static {
        C.i(22);
    }

    public C7651o0oOoOoo(Context context) {
        super(context, o0ooOOo, (SQLiteDatabase.CursorFactory) null, 1);
        this.OooO00o = new WeakReference<>(context);
    }

    private native String OooO0OO(String str, String str2);

    public void OooO00o() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.execSQL("drop table if exists tb_tid");
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                return;
            }
        } catch (Exception e) {
            C7620o0oOOOoo.m19257OooO00o((Throwable) e);
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                return;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                sQLiteDatabase.close();
            }
            throw th;
        }
        sQLiteDatabase.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r2.isOpen() != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0058, code lost:
        if (r2.isOpen() != false) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String OooO0O0(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "select key_tid from tb_tid where name=?"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.getReadableDatabase()     // Catch:{ Exception -> 0x004b, all -> 0x0038 }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            java.lang.String r5 = r4.OooO0OO(r5, r6)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            r6 = 0
            r3[r6] = r5     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            android.database.Cursor r5 = r2.rawQuery(r0, r3)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            boolean r0 = r5.moveToFirst()     // Catch:{ Exception -> 0x0033, all -> 0x0030 }
            if (r0 == 0) goto L_0x001f
            java.lang.String r1 = r5.getString(r6)     // Catch:{ Exception -> 0x0033, all -> 0x0030 }
        L_0x001f:
            if (r5 == 0) goto L_0x0024
            r5.close()
        L_0x0024:
            if (r2 == 0) goto L_0x005b
            boolean r5 = r2.isOpen()
            if (r5 == 0) goto L_0x005b
        L_0x002c:
            r2.close()
            goto L_0x005b
        L_0x0030:
            r6 = move-exception
            r1 = r5
            goto L_0x003a
        L_0x0033:
            goto L_0x004d
        L_0x0034:
            r6 = move-exception
            goto L_0x003a
        L_0x0036:
            r5 = r1
            goto L_0x004d
        L_0x0038:
            r6 = move-exception
            r2 = r1
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            r1.close()
        L_0x003f:
            if (r2 == 0) goto L_0x004a
            boolean r5 = r2.isOpen()
            if (r5 == 0) goto L_0x004a
            r2.close()
        L_0x004a:
            throw r6
        L_0x004b:
            r5 = r1
            r2 = r5
        L_0x004d:
            if (r5 == 0) goto L_0x0052
            r5.close()
        L_0x0052:
            if (r2 == 0) goto L_0x005b
            boolean r5 = r2.isOpen()
            if (r5 == 0) goto L_0x005b
            goto L_0x002c
        L_0x005b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7651o0oOoOoo.OooO0O0(java.lang.String, java.lang.String):java.lang.String");
    }

    public native void onCreate(SQLiteDatabase sQLiteDatabase);

    public native void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r2.isOpen() != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0058, code lost:
        if (r2.isOpen() != false) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String OooO00o(java.lang.String r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7651o0oOoOoo.OooO00o(java.lang.String, java.lang.String):java.lang.String");
    }
}
