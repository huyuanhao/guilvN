package com.facebook.react.modules.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import javax.annotation.Nullable;
import s.h.e.l.l.C;

public class ReactDatabaseSupplier extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "RKStorage";
    public static final int DATABASE_VERSION = 1;
    public static final String KEY_COLUMN = "key";
    public static final int SLEEP_TIME_MS = 30;
    public static final String TABLE_CATALYST = "catalystLocalStorage";
    public static final String VALUE_COLUMN = "value";
    public static final String VERSION_TABLE_CREATE = "CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)";
    @Nullable
    public static ReactDatabaseSupplier sReactDatabaseSupplierInstance;
    public Context mContext;
    @Nullable
    public SQLiteDatabase mDb;
    public long mMaximumDatabaseSize = 6291456;

    static {
        C.i(10);
    }

    public ReactDatabaseSupplier(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.mContext = context;
    }

    private synchronized void closeDatabase() {
        if (this.mDb != null && this.mDb.isOpen()) {
            this.mDb.close();
            this.mDb = null;
        }
    }

    private synchronized boolean deleteDatabase() {
        closeDatabase();
        return this.mContext.deleteDatabase("RKStorage");
    }

    public static native void deleteInstance();

    public static native ReactDatabaseSupplier getInstance(Context context);

    public synchronized void clear() {
        get().delete("catalystLocalStorage", null, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        throw new java.lang.RuntimeException("Clearing and deleting database RKStorage failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (deleteDatabase() != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        com.facebook.common.logging.FLog.m861d(com.facebook.react.common.ReactConstants.TAG, "Deleted Local Database RKStorage");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void clearAndCloseDatabase() throws java.lang.RuntimeException {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.clear()     // Catch:{ Exception -> 0x0012 }
            r2.closeDatabase()     // Catch:{ Exception -> 0x0012 }
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Cleaned RKStorage"
            com.facebook.common.logging.FLog.m861d(r0, r1)     // Catch:{ Exception -> 0x0012 }
            monitor-exit(r2)
            return
        L_0x0010:
            r0 = move-exception
            goto L_0x0029
        L_0x0012:
            boolean r0 = r2.deleteDatabase()     // Catch:{ all -> 0x0010 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.ReactDatabaseSupplier.clearAndCloseDatabase():void");
    }

    public synchronized boolean ensureDatabase() {
        if (this.mDb != null && this.mDb.isOpen()) {
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
                    deleteDatabase();
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
        this.mDb = getWritableDatabase();
        if (this.mDb != null) {
            this.mDb.setMaximumSize(this.mMaximumDatabaseSize);
            return true;
        }
        throw e;
    }

    public synchronized SQLiteDatabase get() {
        ensureDatabase();
        return this.mDb;
    }

    public native void onCreate(SQLiteDatabase sQLiteDatabase);

    public native void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public synchronized void setMaximumSize(long j) {
        this.mMaximumDatabaseSize = j;
        if (this.mDb != null) {
            this.mDb.setMaximumSize(j);
        }
    }
}
