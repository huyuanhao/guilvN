package com.umeng.message.provider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.message.proguard.C3848l;
import com.umeng.message.proguard.C3849m;
import com.umeng.message.provider.C3857a;

public class MessageProvider extends ContentProvider {

    /* renamed from: a */
    public static final String f10459a = MessageProvider.class.getSimpleName();

    /* renamed from: b */
    public static final UriMatcher f10460b = new UriMatcher(-1);

    /* renamed from: e */
    public static final int f10461e = 1;

    /* renamed from: f */
    public static final int f10462f = 2;

    /* renamed from: g */
    public static final int f10463g = 3;

    /* renamed from: h */
    public static final int f10464h = 4;

    /* renamed from: i */
    public static final int f10465i = 5;

    /* renamed from: j */
    public static final int f10466j = 6;

    /* renamed from: k */
    public static final int f10467k = 7;

    /* renamed from: l */
    public static final int f10468l = 8;

    /* renamed from: m */
    public static final int f10469m = 9;

    /* renamed from: n */
    public static final int f10470n = 10;

    /* renamed from: o */
    public static Context f10471o;

    /* renamed from: c */
    public C3855a f10472c;

    /* renamed from: d */
    public C3856b f10473d;

    /* renamed from: com.umeng.message.provider.MessageProvider$a */
    public class C3855a extends SQLiteOpenHelper {
        public C3855a(Context context) {
            super(context, C3848l.f10384b, (SQLiteDatabase.CursorFactory) null, 3);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            Log.i(MessageProvider.f10459a, "MessageStoreHelper-->onCreate-->start");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS MessageStore(_id Integer  PRIMARY KEY  AUTOINCREMENT  , MsdId Varchar  , Json Varchar  , SdkVersion Varchar  , ArrivalTime Long  , ActionType Integer )");
            sQLiteDatabase.execSQL("create table if not exists MsgTemp(id INTEGER AUTO_INCREMENT,tempkey varchar default NULL, tempvalue varchar default NULL,PRIMARY KEY(id))");
            sQLiteDatabase.execSQL("create table if not exists MsgAlias(time long,type varchar default NULL,alias varchar default NULL,exclusive int,error int,message varchar,PRIMARY KEY(time))");
            Log.i(MessageProvider.f10459a, "MessageStoreHelper-->onCreate-->end");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i <= 2) {
                sQLiteDatabase.execSQL("drop table MsgTemp");
            }
            onCreate(sQLiteDatabase);
            Log.i(MessageProvider.f10459a, "MessageStoreHelper-->onUpgrade");
        }
    }

    /* renamed from: com.umeng.message.provider.MessageProvider$b */
    public class C3856b extends SQLiteOpenHelper {
        public C3856b(Context context) {
            super(context, C3849m.f10415b, (SQLiteDatabase.CursorFactory) null, 7);
        }

        /* renamed from: a */
        private boolean m10615a(SQLiteDatabase sQLiteDatabase, String str) {
            boolean z = false;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("select count(*) as c from sqlite_master where type = 'table' and name = '" + str.trim() + "'", null);
                if (rawQuery.moveToNext() && rawQuery.getInt(0) > 0) {
                    z = true;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (Exception unused) {
            }
            return z;
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("create table if not exists MsgLogStore (MsgId varchar, ActionType Integer, Time long, pa varchar, PRIMARY KEY(MsgId, ActionType))");
            sQLiteDatabase.execSQL("create table if not exists MsgLogIdTypeStore (MsgId varchar, MsgType varchar, PRIMARY KEY(MsgId))");
            sQLiteDatabase.execSQL("create table if not exists MsgLogStoreForAgoo (MsgId varchar, TaskId varchar, MsgStatus varchar, Time long, PRIMARY KEY(MsgId, MsgStatus))");
            sQLiteDatabase.execSQL("create table if not exists MsgLogIdTypeStoreForAgoo (MsgId varchar, TaskId varchar, MsgStatus varchar, PRIMARY KEY(MsgId))");
            sQLiteDatabase.execSQL("create table if not exists MsgConfigInfo (SerialNo integer default 1, AppLaunchAt long default 0, UpdateResponse varchar default NULL)");
            sQLiteDatabase.execSQL("create table if not exists InAppLogStore (Time long, MsgId varchar, MsgType Integer, NumDisplay Integer, NumOpenFull Integer, NumOpenTop Integer, NumOpenBottom Integer, NumClose Integer, NumDuration Integer, NumCustom Integer, PRIMARY KEY(Time))");
            Log.i(MessageProvider.f10459a, "MsgLogStoreHelper-->onCreate");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            String str = MessageProvider.f10459a;
            Log.i(str, "oldVersion:" + i + ",newVersion:" + i2);
            if (i <= 4) {
                Log.i(MessageProvider.f10459a, "MsgLogStoreHelper-->drop delete");
                sQLiteDatabase.execSQL("drop table MsgConfigInfo");
            }
            if (i <= 5) {
                Log.i(MessageProvider.f10459a, "MsgLogStoreHelper-->drop MsgLogStore");
                sQLiteDatabase.execSQL("ALTER TABLE MsgLogStore ADD COLUMN pa varchar");
            }
            if (i <= 6 && m10615a(sQLiteDatabase, C3849m.f10422i)) {
                Log.i(MessageProvider.f10459a, "MsgLogStoreHelper-->alter InAppLogStore");
                sQLiteDatabase.execSQL("ALTER TABLE InAppLogStore ADD COLUMN NumCustom Integer");
            }
            onCreate(sQLiteDatabase);
            Log.i(MessageProvider.f10459a, "MsgLogStoreHelper-->onUpgrade");
        }
    }

    /* renamed from: b */
    private void m10614b() {
        try {
            synchronized (this) {
                this.f10472c = new C3855a(getContext());
                this.f10473d = new C3856b(getContext());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.instructions.IfNode.isSame(IfNode.java:122)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // android.content.ContentProvider
    public android.content.ContentProviderResult[] applyBatch(java.util.ArrayList<android.content.ContentProviderOperation> r8) throws android.content.OperationApplicationException {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.provider.MessageProvider.applyBatch(java.util.ArrayList):android.content.ContentProviderResult[]");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public int delete(Uri uri, String str, String[] strArr) {
        int i;
        switch (f10460b.match(uri)) {
            case 2:
                C3855a aVar = this.f10472c;
                if (!(aVar == null || aVar.getWritableDatabase() == null)) {
                    i = this.f10472c.getWritableDatabase().delete(C3848l.f10386d, str, strArr);
                    break;
                }
                i = 0;
                break;
            case 3:
                C3855a aVar2 = this.f10472c;
                if (!(aVar2 == null || aVar2.getWritableDatabase() == null)) {
                    i = this.f10472c.getWritableDatabase().delete(C3848l.f10387e, str, strArr);
                    break;
                }
                i = 0;
                break;
            case 4:
                C3855a aVar3 = this.f10472c;
                if (!(aVar3 == null || aVar3.getWritableDatabase() == null)) {
                    i = this.f10472c.getWritableDatabase().delete(C3848l.f10387e, null, null);
                    break;
                }
                i = 0;
                break;
            case 5:
                C3856b bVar = this.f10473d;
                if (!(bVar == null || bVar.getWritableDatabase() == null)) {
                    i = this.f10473d.getWritableDatabase().delete(C3849m.f10417d, str, strArr);
                    break;
                }
                i = 0;
                break;
            case 6:
                C3856b bVar2 = this.f10473d;
                if (!(bVar2 == null || bVar2.getWritableDatabase() == null)) {
                    i = this.f10473d.getWritableDatabase().delete(C3849m.f10418e, str, strArr);
                    break;
                }
                i = 0;
                break;
            case 7:
                C3856b bVar3 = this.f10473d;
                if (!(bVar3 == null || bVar3.getWritableDatabase() == null)) {
                    i = this.f10473d.getWritableDatabase().delete(C3849m.f10419f, str, strArr);
                    break;
                }
                i = 0;
                break;
            case 8:
                C3856b bVar4 = this.f10473d;
                if (!(bVar4 == null || bVar4.getWritableDatabase() == null)) {
                    i = this.f10473d.getWritableDatabase().delete(C3849m.f10420g, str, strArr);
                    break;
                }
                i = 0;
                break;
            case 9:
            default:
                i = 0;
                break;
            case 10:
                C3856b bVar5 = this.f10473d;
                if (!(bVar5 == null || bVar5.getWritableDatabase() == null)) {
                    i = this.f10473d.getWritableDatabase().delete(C3849m.f10422i, str, strArr);
                    break;
                }
                i = 0;
                break;
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return i;
    }

    public String getType(Uri uri) {
        int match = f10460b.match(uri);
        if (match == 1 || match == 2 || match == 3 || match == 5 || match == 7 || match == 8 || match == 9) {
            return C3857a.C3858a.f10500k;
        }
        throw new IllegalArgumentException("Unknown URI " + uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        switch (f10460b.match(uri)) {
            case 1:
                C3855a aVar = this.f10472c;
                long insertWithOnConflict = (aVar == null || aVar.getWritableDatabase() == null) ? 0 : this.f10472c.getWritableDatabase().insertWithOnConflict(C3848l.f10385c, null, contentValues, 5);
                if (insertWithOnConflict > 0) {
                    C3857a.m10616a(f10471o);
                    Uri withAppendedId = ContentUris.withAppendedId(C3857a.f10477b, insertWithOnConflict);
                    getContext().getContentResolver().notifyChange(withAppendedId, null);
                    return withAppendedId;
                }
                break;
            case 2:
                C3855a aVar2 = this.f10472c;
                long insertWithOnConflict2 = (aVar2 == null || aVar2.getWritableDatabase() == null) ? 0 : this.f10472c.getWritableDatabase().insertWithOnConflict(C3848l.f10386d, null, contentValues, 5);
                if (insertWithOnConflict2 > 0) {
                    C3857a.m10616a(f10471o);
                    Uri withAppendedId2 = ContentUris.withAppendedId(C3857a.f10477b, insertWithOnConflict2);
                    getContext().getContentResolver().notifyChange(withAppendedId2, null);
                    return withAppendedId2;
                }
                break;
            case 3:
                C3855a aVar3 = this.f10472c;
                long insertWithOnConflict3 = (aVar3 == null || aVar3.getWritableDatabase() == null) ? 0 : this.f10472c.getWritableDatabase().insertWithOnConflict(C3848l.f10387e, null, contentValues, 5);
                if (insertWithOnConflict3 > 0) {
                    C3857a.m10616a(f10471o);
                    Uri withAppendedId3 = ContentUris.withAppendedId(C3857a.f10479d, insertWithOnConflict3);
                    getContext().getContentResolver().notifyChange(withAppendedId3, null);
                    return withAppendedId3;
                }
                break;
            case 5:
                C3856b bVar = this.f10473d;
                long insertWithOnConflict4 = (bVar == null || bVar.getWritableDatabase() == null) ? 0 : this.f10473d.getWritableDatabase().insertWithOnConflict(C3849m.f10417d, null, contentValues, 5);
                if (insertWithOnConflict4 > 0) {
                    C3857a.m10616a(f10471o);
                    Uri withAppendedId4 = ContentUris.withAppendedId(C3857a.f10481f, insertWithOnConflict4);
                    getContext().getContentResolver().notifyChange(withAppendedId4, null);
                    return withAppendedId4;
                }
                break;
            case 6:
                C3856b bVar2 = this.f10473d;
                long insertWithOnConflict5 = (bVar2 == null || bVar2.getWritableDatabase() == null) ? 0 : this.f10473d.getWritableDatabase().insertWithOnConflict(C3849m.f10418e, null, contentValues, 5);
                if (insertWithOnConflict5 > 0) {
                    C3857a.m10616a(f10471o);
                    return ContentUris.withAppendedId(C3857a.f10482g, insertWithOnConflict5);
                }
                break;
            case 7:
                C3856b bVar3 = this.f10473d;
                long insertWithOnConflict6 = (bVar3 == null || bVar3.getWritableDatabase() == null) ? 0 : this.f10473d.getWritableDatabase().insertWithOnConflict(C3849m.f10419f, null, contentValues, 5);
                if (insertWithOnConflict6 > 0) {
                    C3857a.m10616a(f10471o);
                    return ContentUris.withAppendedId(C3857a.f10483h, insertWithOnConflict6);
                }
                break;
            case 8:
                C3856b bVar4 = this.f10473d;
                long insertWithOnConflict7 = (bVar4 == null || bVar4.getWritableDatabase() == null) ? 0 : this.f10473d.getWritableDatabase().insertWithOnConflict(C3849m.f10420g, null, contentValues, 5);
                if (insertWithOnConflict7 > 0) {
                    C3857a.m10616a(f10471o);
                    return ContentUris.withAppendedId(C3857a.f10484i, insertWithOnConflict7);
                }
                break;
            case 9:
                C3856b bVar5 = this.f10473d;
                long insertWithOnConflict8 = (bVar5 == null || bVar5.getWritableDatabase() == null) ? 0 : this.f10473d.getWritableDatabase().insertWithOnConflict(C3849m.f10421h, null, contentValues, 5);
                if (insertWithOnConflict8 > 0) {
                    C3857a.m10616a(f10471o);
                    return ContentUris.withAppendedId(C3857a.f10485j, insertWithOnConflict8);
                }
                break;
            case 10:
                C3856b bVar6 = this.f10473d;
                long insertWithOnConflict9 = (bVar6 == null || bVar6.getWritableDatabase() == null) ? 0 : this.f10473d.getWritableDatabase().insertWithOnConflict(C3849m.f10422i, null, contentValues, 5);
                if (insertWithOnConflict9 > 0) {
                    C3857a.m10616a(f10471o);
                    return ContentUris.withAppendedId(C3857a.f10486k, insertWithOnConflict9);
                }
                break;
        }
        return null;
    }

    public boolean onCreate() {
        f10471o = getContext();
        m10614b();
        UriMatcher uriMatcher = f10460b;
        C3857a.m10616a(f10471o);
        uriMatcher.addURI(C3857a.f10476a, "MessageStores", 1);
        UriMatcher uriMatcher2 = f10460b;
        C3857a.m10616a(f10471o);
        uriMatcher2.addURI(C3857a.f10476a, "MsgTemps", 2);
        UriMatcher uriMatcher3 = f10460b;
        C3857a.m10616a(f10471o);
        uriMatcher3.addURI(C3857a.f10476a, C3848l.f10387e, 3);
        UriMatcher uriMatcher4 = f10460b;
        C3857a.m10616a(f10471o);
        uriMatcher4.addURI(C3857a.f10476a, "MsgAliasDeleteAll", 4);
        UriMatcher uriMatcher5 = f10460b;
        C3857a.m10616a(f10471o);
        uriMatcher5.addURI(C3857a.f10476a, "MsgLogStores", 5);
        UriMatcher uriMatcher6 = f10460b;
        C3857a.m10616a(f10471o);
        uriMatcher6.addURI(C3857a.f10476a, "MsgLogIdTypeStores", 6);
        UriMatcher uriMatcher7 = f10460b;
        C3857a.m10616a(f10471o);
        uriMatcher7.addURI(C3857a.f10476a, "MsgLogStoreForAgoos", 7);
        UriMatcher uriMatcher8 = f10460b;
        C3857a.m10616a(f10471o);
        uriMatcher8.addURI(C3857a.f10476a, "MsgLogIdTypeStoreForAgoos", 8);
        UriMatcher uriMatcher9 = f10460b;
        C3857a.m10616a(f10471o);
        uriMatcher9.addURI(C3857a.f10476a, "MsgConfigInfos", 9);
        UriMatcher uriMatcher10 = f10460b;
        C3857a.m10616a(f10471o);
        uriMatcher10.addURI(C3857a.f10476a, "InAppLogStores", 10);
        return true;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursor;
        switch (f10460b.match(uri)) {
            case 2:
                C3855a aVar = this.f10472c;
                if (!(aVar == null || aVar.getWritableDatabase() == null)) {
                    cursor = this.f10472c.getWritableDatabase().query(C3848l.f10386d, strArr, str, strArr2, null, null, str2);
                    break;
                }
                cursor = null;
                break;
            case 3:
                C3855a aVar2 = this.f10472c;
                if (!(aVar2 == null || aVar2.getWritableDatabase() == null)) {
                    cursor = this.f10472c.getWritableDatabase().query(C3848l.f10387e, strArr, str, strArr2, null, null, str2);
                    break;
                }
                cursor = null;
                break;
            case 4:
            case 6:
            default:
                cursor = null;
                break;
            case 5:
                C3856b bVar = this.f10473d;
                if (!(bVar == null || bVar.getWritableDatabase() == null)) {
                    cursor = this.f10473d.getWritableDatabase().query(C3849m.f10417d, strArr, str, strArr2, null, null, str2);
                    break;
                }
                cursor = null;
                break;
            case 7:
                C3856b bVar2 = this.f10473d;
                if (!(bVar2 == null || bVar2.getWritableDatabase() == null)) {
                    cursor = this.f10473d.getWritableDatabase().query(C3849m.f10419f, strArr, str, strArr2, null, null, str2);
                    break;
                }
                cursor = null;
                break;
            case 8:
                C3856b bVar3 = this.f10473d;
                if (!(bVar3 == null || bVar3.getWritableDatabase() == null)) {
                    cursor = this.f10473d.getWritableDatabase().query(C3849m.f10420g, strArr, str, strArr2, null, null, str2);
                    break;
                }
                cursor = null;
                break;
            case 9:
                C3856b bVar4 = this.f10473d;
                if (!(bVar4 == null || bVar4.getWritableDatabase() == null)) {
                    cursor = this.f10473d.getWritableDatabase().query(C3849m.f10421h, strArr, str, strArr2, null, null, str2);
                    break;
                }
                cursor = null;
                break;
            case 10:
                C3856b bVar5 = this.f10473d;
                if (!(bVar5 == null || bVar5.getWritableDatabase() == null)) {
                    cursor = this.f10473d.getWritableDatabase().query(C3849m.f10422i, strArr, str, strArr2, null, null, str2);
                    break;
                }
                cursor = null;
                break;
        }
        if (cursor != null) {
            cursor.setNotificationUri(getContext().getContentResolver(), uri);
        }
        return cursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i;
        C3856b bVar;
        int match = f10460b.match(uri);
        if (match == 1) {
            C3855a aVar = this.f10472c;
            if (!(aVar == null || aVar.getWritableDatabase() == null)) {
                i = this.f10472c.getWritableDatabase().updateWithOnConflict(C3848l.f10385c, contentValues, str, strArr, 5);
                getContext().getContentResolver().notifyChange(uri, null);
                return i;
            }
        } else if (match == 2) {
            C3855a aVar2 = this.f10472c;
            if (!(aVar2 == null || aVar2.getWritableDatabase() == null)) {
                i = this.f10472c.getWritableDatabase().updateWithOnConflict(C3848l.f10386d, contentValues, str, strArr, 5);
                getContext().getContentResolver().notifyChange(uri, null);
                return i;
            }
        } else if (match == 3) {
            C3855a aVar3 = this.f10472c;
            if (!(aVar3 == null || aVar3.getWritableDatabase() == null)) {
                this.f10472c.getWritableDatabase().updateWithOnConflict(C3848l.f10387e, contentValues, str, strArr, 5);
            }
        } else if (match == 9) {
            C3856b bVar2 = this.f10473d;
            if (!(bVar2 == null || bVar2.getWritableDatabase() == null)) {
                i = this.f10473d.getWritableDatabase().updateWithOnConflict(C3849m.f10421h, contentValues, str, strArr, 5);
                getContext().getContentResolver().notifyChange(uri, null);
                return i;
            }
        } else if (!(match != 10 || (bVar = this.f10473d) == null || bVar.getWritableDatabase() == null)) {
            i = this.f10473d.getWritableDatabase().updateWithOnConflict(C3849m.f10422i, contentValues, str, strArr, 5);
            getContext().getContentResolver().notifyChange(uri, null);
            return i;
        }
        i = 0;
        getContext().getContentResolver().notifyChange(uri, null);
        return i;
    }
}
