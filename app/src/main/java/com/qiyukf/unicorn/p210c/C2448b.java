package com.qiyukf.unicorn.p210c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.qiyukf.unicorn.c.b */
public final class C2448b extends SQLiteOpenHelper {

    /* renamed from: com.qiyukf.unicorn.c.b$a */
    public interface AbstractC2451a {
        /* renamed from: a */
        String[] mo35673a();

        /* renamed from: b */
        String[] mo35674b();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2448b(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.pm.ApplicationInfo r1 = r4.getApplicationInfo()
            java.lang.String r1 = r1.dataDir
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r2 = com.qiyukf.unicorn.C2452d.m5371d()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x002f
            r1.mkdirs()
        L_0x002f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "unicorn.db"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p210c.C2448b.<init>(android.content.Context):void");
    }

    public C2448b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    public static void m5344a(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        for (String str : strArr) {
            sQLiteDatabase.execSQL(str);
        }
    }

    /* renamed from: a */
    private AbstractC2451a[] m5345a() {
        return new AbstractC2451a[]{new AbstractC2451a() {
            /* class com.qiyukf.unicorn.p210c.C2448b.C24491 */

            @Override // com.qiyukf.unicorn.p210c.C2448b.AbstractC2451a
            /* renamed from: a */
            public final String[] mo35673a() {
                return new String[]{"CREATE TABLE IF NOT EXISTS staffInfo(staffNimId Varchar(32) NOT NULL, staffName Varchar(256), staffAvatar Varchar(256))", "CREATE UNIQUE INDEX IF NOT EXISTS staffInfo_staffNimId_index ON staffInfo(staffNimId)"};
            }

            @Override // com.qiyukf.unicorn.p210c.C2448b.AbstractC2451a
            /* renamed from: b */
            public final String[] mo35674b() {
                return new String[0];
            }
        }, new AbstractC2451a() {
            /* class com.qiyukf.unicorn.p210c.C2448b.C24502 */

            @Override // com.qiyukf.unicorn.p210c.C2448b.AbstractC2451a
            /* renamed from: a */
            public final String[] mo35673a() {
                return new String[]{"CREATE TABLE IF NOT EXISTS shopInfo(shopId Varchar(32) NOT NULL, shopName Varchar(256), shopAvatar Varchar(256))", "CREATE UNIQUE INDEX IF NOT EXISTS shopInfo_shopId_index ON shopInfo(shopId)"};
            }

            @Override // com.qiyukf.unicorn.p210c.C2448b.AbstractC2451a
            /* renamed from: b */
            public final String[] mo35674b() {
                return new String[0];
            }
        }};
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC2451a[] a = m5345a();
        for (int i = 0; i < 2; i++) {
            m5344a(sQLiteDatabase, a[i].mo35673a());
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        while (i < i2) {
            AbstractC2451a[] a = m5345a();
            for (int i3 = 0; i3 < 2; i3++) {
                m5344a(sQLiteDatabase, a[i3].mo35674b());
            }
            i++;
        }
    }
}
