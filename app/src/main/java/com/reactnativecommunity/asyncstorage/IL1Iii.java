package com.reactnativecommunity.asyncstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.common.ModuleDataCleaner;
import com.p118pd.sdk.C8894ooOO00OO;
import com.p118pd.sdk.C8895ooOO00Oo;
import com.p118pd.sdk.C8897ooOO00o0;
import com.p118pd.sdk.C8900ooOO0O00;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@ReactModule(name = "AsyncStorageModule")
public final class IL1Iii extends ReactContextBaseJavaModule implements ModuleDataCleaner.Cleanable {
    public static final int MAX_SQL_KEYS = C8897ooOO00o0.OooO00o().OooO0O0();
    public static final String NAME = "RNC_AsyncSQLiteDBStorage";
    public final ExecutorC9882OooO0oO executor;
    public C8900ooOO0O00 mReactDatabaseSupplier;
    public boolean mShuttingDown;

    public class OooO00o extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableArray f23490OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.OooO00o = callback;
            this.f23490OooO00o = readableArray;
        }

        public void doInBackgroundGuarded(Void... voidArr) {
            if (!IL1Iii.this.ensureDatabase()) {
                this.OooO00o.invoke(C8895ooOO00Oo.OooO00o(null), null);
                return;
            }
            String[] strArr = {"key", "value"};
            HashSet hashSet = new HashSet();
            WritableArray createArray = Arguments.createArray();
            for (int i = 0; i < this.f23490OooO00o.size(); i += IL1Iii.MAX_SQL_KEYS) {
                int min = Math.min(this.f23490OooO00o.size() - i, IL1Iii.MAX_SQL_KEYS);
                Cursor query = IL1Iii.this.mReactDatabaseSupplier.OooO00o().query("catalystLocalStorage", strArr, C8894ooOO00OO.OooO00o(min), C8894ooOO00OO.OooO00o(this.f23490OooO00o, i, min), null, null, null);
                hashSet.clear();
                try {
                    if (query.getCount() != this.f23490OooO00o.size()) {
                        for (int i2 = i; i2 < i + min; i2++) {
                            hashSet.add(this.f23490OooO00o.getString(i2));
                        }
                    }
                    if (query.moveToFirst()) {
                        do {
                            WritableArray createArray2 = Arguments.createArray();
                            createArray2.pushString(query.getString(0));
                            createArray2.pushString(query.getString(1));
                            createArray.pushArray(createArray2);
                            hashSet.remove(query.getString(0));
                        } while (query.moveToNext());
                    }
                    query.close();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        WritableArray createArray3 = Arguments.createArray();
                        createArray3.pushString((String) it.next());
                        createArray3.pushNull();
                        createArray.pushArray(createArray3);
                    }
                    hashSet.clear();
                } catch (Exception e) {
                    FLog.m914w(ReactConstants.TAG, e.getMessage(), e);
                    this.OooO00o.invoke(C8895ooOO00Oo.OooO00o(null, e.getMessage()), null);
                    query.close();
                    return;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            this.OooO00o.invoke(null, createArray);
        }
    }

    public class OooO0O0 extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableArray f23492OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.OooO00o = callback;
            this.f23492OooO00o = readableArray;
        }

        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!IL1Iii.this.ensureDatabase()) {
                this.OooO00o.invoke(C8895ooOO00Oo.OooO00o(null));
                return;
            }
            SQLiteStatement compileStatement = IL1Iii.this.mReactDatabaseSupplier.OooO00o().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                IL1Iii.this.mReactDatabaseSupplier.OooO00o().beginTransaction();
                for (int i = 0; i < this.f23492OooO00o.size(); i++) {
                    if (this.f23492OooO00o.getArray(i).size() != 2) {
                        WritableMap OooO0OO = C8895ooOO00Oo.OooO0OO(null);
                        try {
                            IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                            return;
                        } catch (Exception e) {
                            FLog.m914w(ReactConstants.TAG, e.getMessage(), e);
                            if (OooO0OO == null) {
                                C8895ooOO00Oo.OooO00o(null, e.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f23492OooO00o.getArray(i).getString(0) == null) {
                        WritableMap OooO0O0 = C8895ooOO00Oo.OooO0O0(null);
                        try {
                            IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                            return;
                        } catch (Exception e2) {
                            FLog.m914w(ReactConstants.TAG, e2.getMessage(), e2);
                            if (OooO0O0 == null) {
                                C8895ooOO00Oo.OooO00o(null, e2.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f23492OooO00o.getArray(i).getString(1) == null) {
                        WritableMap OooO0OO2 = C8895ooOO00Oo.OooO0OO(null);
                        try {
                            IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                            return;
                        } catch (Exception e3) {
                            FLog.m914w(ReactConstants.TAG, e3.getMessage(), e3);
                            if (OooO0OO2 == null) {
                                C8895ooOO00Oo.OooO00o(null, e3.getMessage());
                                return;
                            }
                            return;
                        }
                    } else {
                        compileStatement.clearBindings();
                        compileStatement.bindString(1, this.f23492OooO00o.getArray(i).getString(0));
                        compileStatement.bindString(2, this.f23492OooO00o.getArray(i).getString(1));
                        compileStatement.execute();
                    }
                }
                IL1Iii.this.mReactDatabaseSupplier.OooO00o().setTransactionSuccessful();
                try {
                    IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                } catch (Exception e4) {
                    FLog.m914w(ReactConstants.TAG, e4.getMessage(), e4);
                    writableMap = C8895ooOO00Oo.OooO00o(null, e4.getMessage());
                }
            } catch (Exception e5) {
                FLog.m914w(ReactConstants.TAG, e5.getMessage(), e5);
                WritableMap OooO00o2 = C8895ooOO00Oo.OooO00o(null, e5.getMessage());
                try {
                    IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                } catch (Exception e6) {
                    FLog.m914w(ReactConstants.TAG, e6.getMessage(), e6);
                    if (OooO00o2 == null) {
                        writableMap = C8895ooOO00Oo.OooO00o(null, e6.getMessage());
                    }
                }
                writableMap = OooO00o2;
            } catch (Throwable th) {
                try {
                    IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                } catch (Exception e7) {
                    FLog.m914w(ReactConstants.TAG, e7.getMessage(), e7);
                    C8895ooOO00Oo.OooO00o(null, e7.getMessage());
                }
                throw th;
            }
            if (writableMap != null) {
                this.OooO00o.invoke(writableMap);
                return;
            }
            this.OooO00o.invoke(new Object[0]);
        }
    }

    public class OooO0OO extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableArray f23494OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0OO(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.OooO00o = callback;
            this.f23494OooO00o = readableArray;
        }

        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!IL1Iii.this.ensureDatabase()) {
                this.OooO00o.invoke(C8895ooOO00Oo.OooO00o(null));
                return;
            }
            try {
                IL1Iii.this.mReactDatabaseSupplier.OooO00o().beginTransaction();
                for (int i = 0; i < this.f23494OooO00o.size(); i += IL1Iii.MAX_SQL_KEYS) {
                    int min = Math.min(this.f23494OooO00o.size() - i, IL1Iii.MAX_SQL_KEYS);
                    IL1Iii.this.mReactDatabaseSupplier.OooO00o().delete("catalystLocalStorage", C8894ooOO00OO.OooO00o(min), C8894ooOO00OO.OooO00o(this.f23494OooO00o, i, min));
                }
                IL1Iii.this.mReactDatabaseSupplier.OooO00o().setTransactionSuccessful();
                try {
                    IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                } catch (Exception e) {
                    FLog.m914w(ReactConstants.TAG, e.getMessage(), e);
                    writableMap = C8895ooOO00Oo.OooO00o(null, e.getMessage());
                }
            } catch (Exception e2) {
                FLog.m914w(ReactConstants.TAG, e2.getMessage(), e2);
                WritableMap OooO00o2 = C8895ooOO00Oo.OooO00o(null, e2.getMessage());
                try {
                    IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                } catch (Exception e3) {
                    FLog.m914w(ReactConstants.TAG, e3.getMessage(), e3);
                    if (OooO00o2 == null) {
                        writableMap = C8895ooOO00Oo.OooO00o(null, e3.getMessage());
                    }
                }
                writableMap = OooO00o2;
            } catch (Throwable th) {
                try {
                    IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                } catch (Exception e4) {
                    FLog.m914w(ReactConstants.TAG, e4.getMessage(), e4);
                    C8895ooOO00Oo.OooO00o(null, e4.getMessage());
                }
                throw th;
            }
            if (writableMap != null) {
                this.OooO00o.invoke(writableMap);
                return;
            }
            this.OooO00o.invoke(new Object[0]);
        }
    }

    /* renamed from: com.reactnativecommunity.asyncstorage.IL1Iii$OooO0Oo  reason: case insensitive filesystem */
    public class AsyncTaskC9880OooO0Oo extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableArray f23496OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AsyncTaskC9880OooO0Oo(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.OooO00o = callback;
            this.f23496OooO00o = readableArray;
        }

        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!IL1Iii.this.ensureDatabase()) {
                this.OooO00o.invoke(C8895ooOO00Oo.OooO00o(null));
                return;
            }
            try {
                IL1Iii.this.mReactDatabaseSupplier.OooO00o().beginTransaction();
                for (int i = 0; i < this.f23496OooO00o.size(); i++) {
                    if (this.f23496OooO00o.getArray(i).size() != 2) {
                        WritableMap OooO0OO = C8895ooOO00Oo.OooO0OO(null);
                        try {
                            IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                            return;
                        } catch (Exception e) {
                            FLog.m914w(ReactConstants.TAG, e.getMessage(), e);
                            if (OooO0OO == null) {
                                C8895ooOO00Oo.OooO00o(null, e.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f23496OooO00o.getArray(i).getString(0) == null) {
                        WritableMap OooO0O0 = C8895ooOO00Oo.OooO0O0(null);
                        try {
                            IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                            return;
                        } catch (Exception e2) {
                            FLog.m914w(ReactConstants.TAG, e2.getMessage(), e2);
                            if (OooO0O0 == null) {
                                C8895ooOO00Oo.OooO00o(null, e2.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f23496OooO00o.getArray(i).getString(1) == null) {
                        WritableMap OooO0OO2 = C8895ooOO00Oo.OooO0OO(null);
                        try {
                            IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                            return;
                        } catch (Exception e3) {
                            FLog.m914w(ReactConstants.TAG, e3.getMessage(), e3);
                            if (OooO0OO2 == null) {
                                C8895ooOO00Oo.OooO00o(null, e3.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (!C8894ooOO00OO.OooO00o(IL1Iii.this.mReactDatabaseSupplier.OooO00o(), this.f23496OooO00o.getArray(i).getString(0), this.f23496OooO00o.getArray(i).getString(1))) {
                        WritableMap OooO00o2 = C8895ooOO00Oo.OooO00o(null);
                        try {
                            IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                            return;
                        } catch (Exception e4) {
                            FLog.m914w(ReactConstants.TAG, e4.getMessage(), e4);
                            if (OooO00o2 == null) {
                                C8895ooOO00Oo.OooO00o(null, e4.getMessage());
                                return;
                            }
                            return;
                        }
                    }
                }
                IL1Iii.this.mReactDatabaseSupplier.OooO00o().setTransactionSuccessful();
                try {
                    IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                } catch (Exception e5) {
                    FLog.m914w(ReactConstants.TAG, e5.getMessage(), e5);
                    writableMap = C8895ooOO00Oo.OooO00o(null, e5.getMessage());
                }
            } catch (Exception e6) {
                FLog.m914w(ReactConstants.TAG, e6.getMessage(), e6);
                WritableMap OooO00o3 = C8895ooOO00Oo.OooO00o(null, e6.getMessage());
                try {
                    IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                } catch (Exception e7) {
                    FLog.m914w(ReactConstants.TAG, e7.getMessage(), e7);
                    if (OooO00o3 == null) {
                        writableMap = C8895ooOO00Oo.OooO00o(null, e7.getMessage());
                    }
                }
                writableMap = OooO00o3;
            } catch (Throwable th) {
                try {
                    IL1Iii.this.mReactDatabaseSupplier.OooO00o().endTransaction();
                } catch (Exception e8) {
                    FLog.m914w(ReactConstants.TAG, e8.getMessage(), e8);
                    C8895ooOO00Oo.OooO00o(null, e8.getMessage());
                }
                throw th;
            }
            if (writableMap != null) {
                this.OooO00o.invoke(writableMap);
                return;
            }
            this.OooO00o.invoke(new Object[0]);
        }
    }

    public class OooO0o extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0o(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.OooO00o = callback;
        }

        public void doInBackgroundGuarded(Void... voidArr) {
            if (!IL1Iii.this.ensureDatabase()) {
                this.OooO00o.invoke(C8895ooOO00Oo.OooO00o(null), null);
                return;
            }
            WritableArray createArray = Arguments.createArray();
            Cursor query = IL1Iii.this.mReactDatabaseSupplier.OooO00o().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
            try {
                if (query.moveToFirst()) {
                    do {
                        createArray.pushString(query.getString(0));
                    } while (query.moveToNext());
                }
                query.close();
                this.OooO00o.invoke(null, createArray);
            } catch (Exception e) {
                FLog.m914w(ReactConstants.TAG, e.getMessage(), e);
                this.OooO00o.invoke(C8895ooOO00Oo.OooO00o(null, e.getMessage()), null);
                query.close();
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
    }

    /* renamed from: com.reactnativecommunity.asyncstorage.IL1Iii$OooO0o0  reason: case insensitive filesystem */
    public class AsyncTaskC9881OooO0o0 extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AsyncTaskC9881OooO0o0(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.OooO00o = callback;
        }

        public void doInBackgroundGuarded(Void... voidArr) {
            if (!IL1Iii.this.mReactDatabaseSupplier.m20539OooO0O0()) {
                this.OooO00o.invoke(C8895ooOO00Oo.OooO00o(null));
                return;
            }
            try {
                IL1Iii.this.mReactDatabaseSupplier.m20537OooO00o();
                this.OooO00o.invoke(new Object[0]);
            } catch (Exception e) {
                FLog.m914w(ReactConstants.TAG, e.getMessage(), e);
                this.OooO00o.invoke(C8895ooOO00Oo.OooO00o(null, e.getMessage()));
            }
        }
    }

    /* renamed from: com.reactnativecommunity.asyncstorage.IL1Iii$OooO0oO  reason: case insensitive filesystem */
    public class ExecutorC9882OooO0oO implements Executor {

        /* renamed from: OooO00o  reason: collision with other field name */
        public Runnable f23500OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ArrayDeque<Runnable> f23501OooO00o = new ArrayDeque<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Executor f23502OooO00o;

        /* renamed from: com.reactnativecommunity.asyncstorage.IL1Iii$OooO0oO$OooO00o */
        public class OooO00o implements Runnable {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ Runnable f23503OooO00o;

            public OooO00o(Runnable runnable) {
                this.f23503OooO00o = runnable;
            }

            public void run() {
                try {
                    this.f23503OooO00o.run();
                } finally {
                    ExecutorC9882OooO0oO.this.OooO00o();
                }
            }
        }

        public ExecutorC9882OooO0oO(Executor executor) {
            this.f23502OooO00o = executor;
        }

        public synchronized void OooO00o() {
            Runnable poll = this.f23501OooO00o.poll();
            this.f23500OooO00o = poll;
            if (poll != null) {
                this.f23502OooO00o.execute(poll);
            }
        }

        public synchronized void execute(Runnable runnable) {
            this.f23501OooO00o.offer(new OooO00o(runnable));
            if (this.f23500OooO00o == null) {
                OooO00o();
            }
        }
    }

    public IL1Iii(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, Executors.newSingleThreadExecutor());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.m20539OooO0O0();
    }

    @ReactMethod
    public void clear(Callback callback) {
        new AsyncTaskC9881OooO0o0(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.react.modules.common.ModuleDataCleaner.Cleanable
    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.OooO0O0();
    }

    @ReactMethod
    public void getAllKeys(Callback callback) {
        new OooO0o(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(C8895ooOO00Oo.OooO0O0(null), null);
            return;
        }
        new OooO00o(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new AsyncTaskC9880OooO0Oo(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new OooO0OO(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new OooO0O0(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }

    @VisibleForTesting
    public IL1Iii(ReactApplicationContext reactApplicationContext, Executor executor2) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        this.executor = new ExecutorC9882OooO0oO(executor2);
        this.mReactDatabaseSupplier = C8900ooOO0O00.OooO00o(reactApplicationContext);
    }
}
