package com.p118pd.sdk;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import javax.annotation.Nullable;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.ooOO0O00  reason: case insensitive filesystem */
public class C8900ooOO0O00 extends SQLiteOpenHelper {
    @Nullable
    public static C8900ooOO0O00 OooO00o = null;
    public static final int o00oO0O = 1;
    public static final String o0OO00O = "CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)";
    public static final String o0OOO0o = "key";
    public static final String o0Oo0oo = "value";
    public static final int o0ooOO0 = 30;
    public static final String o0ooOOo = "RKStorage";
    public static final String o0ooOoO = "catalystLocalStorage";

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f22102OooO00o = ((((long) C8897ooOO00o0.OooO00o().m20536OooO00o()) * 1024) * 1024);

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f22103OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public SQLiteDatabase f22104OooO00o;

    static {
        C.i(16777263);
    }

    public C8900ooOO0O00(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f22103OooO00o = context;
    }

    public static native C8900ooOO0O00 OooO00o(Context context);

    public static native void OooO0Oo();

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public synchronized boolean m20539OooO0O0() {
        if (this.f22104OooO00o != null && this.f22104OooO00o.isOpen()) {
            return true;
        }
        SQLiteException e = null;
        int i = 0;
        while (true) {
            if (i < 2) {
                if (i <= 0) {
                    break;
                }
                try {
                    m20538OooO00o();
                    break;
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                    i++;
                }
            } else {
                break;
            }
        }
        this.f22104OooO00o = getWritableDatabase();
        if (this.f22104OooO00o != null) {
            this.f22104OooO00o.setMaximumSize(this.f22102OooO00o);
            return true;
        }
        throw e;
    }

    public synchronized void OooO0OO(long j) {
        this.f22102OooO00o = j;
        if (this.f22104OooO00o != null) {
            this.f22104OooO00o.setMaximumSize(j);
        }
    }

    public native void onCreate(SQLiteDatabase sQLiteDatabase);

    public native void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public synchronized SQLiteDatabase OooO00o() {
        m20539OooO0O0();
        return this.f22104OooO00o;
    }

    public synchronized void OooO0OO() {
        if (this.f22104OooO00o != null && this.f22104OooO00o.isOpen()) {
            this.f22104OooO00o.close();
            this.f22104OooO00o = null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized void m20537OooO00o() {
        OooO00o().delete("catalystLocalStorage", null, null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized boolean m20538OooO00o() {
        OooO0OO();
        return this.f22103OooO00o.deleteDatabase("RKStorage");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        throw new java.lang.RuntimeException("Clearing and deleting database RKStorage failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (m20538OooO00o() != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        com.facebook.common.logging.FLog.m861d(com.facebook.react.common.ReactConstants.TAG, "Deleted Local Database RKStorage");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void OooO0O0() throws java.lang.RuntimeException {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.m20537OooO00o()     // Catch:{ Exception -> 0x0012 }
            r2.OooO0OO()     // Catch:{ Exception -> 0x0012 }
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Cleaned RKStorage"
            com.facebook.common.logging.FLog.m861d(r0, r1)     // Catch:{ Exception -> 0x0012 }
            monitor-exit(r2)
            return
        L_0x0010:
            r0 = move-exception
            goto L_0x0029
        L_0x0012:
            boolean r0 = r2.m20538OooO00o()     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Deleted Local Database RKStorage"
            com.facebook.common.logging.FLog.m861d(r0, r1)     // Catch:{ all -> 0x0010 }
            monitor-exit(r2)
            return
        L_0x0021:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Clearing and deleting database RKStorage failed"
            r0.<init>(r1)
            throw r0
        L_0x0029:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8900ooOO0O00.OooO0O0():void");
    }
}
