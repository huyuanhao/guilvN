package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.bugly.AbstractC3215a;
import com.umeng.message.proguard.C3848l;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ae */
public class C3307ae {

    /* renamed from: a */
    public static boolean f7960a;

    /* renamed from: b */
    public static C3307ae f7961b;

    /* renamed from: c */
    public static C3309af f7962c;

    public C3307ae(Context context, List<AbstractC3215a> list) {
        f7962c = new C3309af(context, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        if (r1 != null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cb, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e6, code lost:
        if (r1 != null) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da A[Catch:{ all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e6  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.util.List<com.tencent.bugly.proguard.C3310ag> m8257c(int r12) {
        /*
        // Method dump skipped, instructions count: 255
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3307ae.m8257c(int):java.util.List");
    }

    /* renamed from: d */
    private synchronized boolean m8258d(C3310ag agVar) {
        ContentValues c;
        if (agVar == null) {
            return false;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = f7962c.getWritableDatabase();
            if (writableDatabase == null || (c = mo38353c(agVar)) == null) {
                if (f7960a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            }
            long replace = writableDatabase.replace("t_pf", C3848l.f10389g, c);
            if (replace >= 0) {
                C3321an.m8355c("[Database] insert %s success.", "t_pf");
                agVar.f7985a = replace;
                if (f7960a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return true;
            }
            if (f7960a && writableDatabase != null) {
                writableDatabase.close();
            }
            return false;
        } catch (Throwable th) {
            if (f7960a && 0 != 0) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo38352b(int r6) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3307ae.mo38352b(int):void");
    }

    /* renamed from: com.tencent.bugly.proguard.ae$a */
    public class C3308a extends Thread {

        /* renamed from: b */
        public int f7964b;

        /* renamed from: c */
        public AbstractC3306ad f7965c;

        /* renamed from: d */
        public String f7966d;

        /* renamed from: e */
        public ContentValues f7967e;

        /* renamed from: f */
        public boolean f7968f;

        /* renamed from: g */
        public String[] f7969g;

        /* renamed from: h */
        public String f7970h;

        /* renamed from: i */
        public String[] f7971i;

        /* renamed from: j */
        public String f7972j;

        /* renamed from: k */
        public String f7973k;

        /* renamed from: l */
        public String f7974l;

        /* renamed from: m */
        public String f7975m;

        /* renamed from: n */
        public String f7976n;

        /* renamed from: o */
        public String[] f7977o;

        /* renamed from: p */
        public int f7978p;

        /* renamed from: q */
        public String f7979q;

        /* renamed from: r */
        public byte[] f7980r;

        public C3308a(int i, AbstractC3306ad adVar) {
            this.f7964b = i;
            this.f7965c = adVar;
        }

        /* renamed from: a */
        public void mo38357a(String str, ContentValues contentValues) {
            this.f7966d = str;
            this.f7967e = contentValues;
        }

        public void run() {
            switch (this.f7964b) {
                case 1:
                    C3307ae.this.m8246a((C3307ae) this.f7966d, (String) this.f7967e, (ContentValues) this.f7965c);
                    return;
                case 2:
                    C3307ae.this.m8244a((C3307ae) this.f7966d, this.f7976n, (String) this.f7977o, (String[]) this.f7965c);
                    return;
                case 3:
                    Cursor a = C3307ae.this.m8248a(this.f7968f, this.f7966d, this.f7969g, this.f7970h, this.f7971i, this.f7972j, this.f7973k, this.f7974l, this.f7975m, this.f7965c);
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                case 4:
                    C3307ae.this.m8254a((C3307ae) this.f7978p, (int) this.f7979q, (String) this.f7980r, (byte[]) this.f7965c);
                    return;
                case 5:
                    C3307ae.this.m8251a((C3307ae) this.f7978p, (int) this.f7965c);
                    return;
                case 6:
                    C3307ae.this.m8253a((C3307ae) this.f7978p, (int) this.f7979q, (String) this.f7965c);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        public void mo38359a(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
            this.f7968f = z;
            this.f7966d = str;
            this.f7969g = strArr;
            this.f7970h = str2;
            this.f7971i = strArr2;
            this.f7972j = str3;
            this.f7973k = str4;
            this.f7974l = str5;
            this.f7975m = str6;
        }

        /* renamed from: a */
        public void mo38358a(String str, String str2, String[] strArr) {
            this.f7966d = str;
            this.f7976n = str2;
            this.f7977o = strArr;
        }

        /* renamed from: a */
        public void mo38356a(int i, String str, byte[] bArr) {
            this.f7978p = i;
            this.f7979q = str;
            this.f7980r = bArr;
        }

        /* renamed from: a */
        public void mo38354a(int i) {
            this.f7978p = i;
        }

        /* renamed from: a */
        public void mo38355a(int i, String str) {
            this.f7978p = i;
            this.f7979q = str;
        }
    }

    /* renamed from: a */
    public static synchronized C3307ae m8250a(Context context, List<AbstractC3215a> list) {
        C3307ae aeVar;
        synchronized (C3307ae.class) {
            if (f7961b == null) {
                f7961b = new C3307ae(context, list);
            }
            aeVar = f7961b;
        }
        return aeVar;
    }

    /* renamed from: a */
    public static synchronized C3307ae m8249a() {
        C3307ae aeVar;
        synchronized (C3307ae.class) {
            aeVar = f7961b;
        }
        return aeVar;
    }

    /* renamed from: a */
    public long mo38340a(String str, ContentValues contentValues, AbstractC3306ad adVar, boolean z) {
        if (z) {
            return m8246a(str, contentValues, adVar);
        }
        C3308a aVar = new C3308a(1, adVar);
        aVar.mo38357a(str, contentValues);
        C3319am.m8340a().mo38398a(aVar);
        return 0;
    }

    /* renamed from: b */
    public ContentValues mo38350b(C3310ag agVar) {
        if (agVar == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            if (agVar.f7985a > 0) {
                contentValues.put(C3848l.f10389g, Long.valueOf(agVar.f7985a));
            }
            contentValues.put("_tp", Integer.valueOf(agVar.f7986b));
            contentValues.put("_pc", agVar.f7987c);
            contentValues.put("_th", agVar.f7988d);
            contentValues.put("_tm", Long.valueOf(agVar.f7989e));
            if (agVar.f7991g != null) {
                contentValues.put("_dt", agVar.f7991g);
            }
            return contentValues;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public Cursor mo38341a(String str, String[] strArr, String str2, String[] strArr2, AbstractC3306ad adVar, boolean z) {
        return mo38342a(false, str, strArr, str2, strArr2, (String) null, (String) null, (String) null, (String) null, adVar, z);
    }

    /* renamed from: a */
    public Cursor mo38342a(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, AbstractC3306ad adVar, boolean z2) {
        if (z2) {
            return m8248a(z, str, strArr, str2, strArr2, str3, str4, str5, str6, adVar);
        }
        C3308a aVar = new C3308a(3, adVar);
        aVar.mo38359a(z, str, strArr, str2, strArr2, str3, str4, str5, str6);
        C3319am.m8340a().mo38398a(aVar);
        return null;
    }

    /* renamed from: a */
    public int mo38339a(String str, String str2, String[] strArr, AbstractC3306ad adVar, boolean z) {
        if (z) {
            return m8244a(str, str2, strArr, adVar);
        }
        C3308a aVar = new C3308a(2, adVar);
        aVar.mo38358a(str, str2, strArr);
        C3319am.m8340a().mo38398a(aVar);
        return 0;
    }

    /* renamed from: b */
    public C3310ag mo38351b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C3310ag agVar = new C3310ag();
            agVar.f7985a = cursor.getLong(cursor.getColumnIndex(C3848l.f10389g));
            agVar.f7989e = cursor.getLong(cursor.getColumnIndex("_tm"));
            agVar.f7990f = cursor.getString(cursor.getColumnIndex("_tp"));
            agVar.f7991g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return agVar;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (0 != 0) goto L_0x003d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long m8246a(java.lang.String r8, android.content.ContentValues r9, com.tencent.bugly.proguard.AbstractC3306ad r10) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3307ae.m8246a(java.lang.String, android.content.ContentValues, com.tencent.bugly.proguard.ad):long");
    }

    /* renamed from: c */
    public ContentValues mo38353c(C3310ag agVar) {
        if (agVar != null && !C3325ap.m8404a(agVar.f7990f)) {
            try {
                ContentValues contentValues = new ContentValues();
                if (agVar.f7985a > 0) {
                    contentValues.put(C3848l.f10389g, Long.valueOf(agVar.f7985a));
                }
                contentValues.put("_tp", agVar.f7990f);
                contentValues.put("_tm", Long.valueOf(agVar.f7989e));
                if (agVar.f7991g != null) {
                    contentValues.put("_dt", agVar.f7991g);
                }
                return contentValues;
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r23 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r23 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r23.mo38338a(r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.database.Cursor m8248a(boolean r14, java.lang.String r15, java.lang.String[] r16, java.lang.String r17, java.lang.String[] r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.tencent.bugly.proguard.AbstractC3306ad r23) {
        /*
            r13 = this;
            r1 = r23
            monitor-enter(r13)
            r2 = 0
            com.tencent.bugly.proguard.af r0 = com.tencent.bugly.proguard.C3307ae.f7962c     // Catch:{ all -> 0x0028 }
            android.database.sqlite.SQLiteDatabase r3 = r0.getWritableDatabase()     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0020
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = r22
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0028 }
        L_0x0020:
            if (r1 == 0) goto L_0x0035
        L_0x0022:
            r1.mo38338a(r2)     // Catch:{ all -> 0x0026 }
            goto L_0x0035
        L_0x0026:
            r0 = move-exception
            goto L_0x003e
        L_0x0028:
            r0 = move-exception
            boolean r3 = com.tencent.bugly.proguard.C3321an.m8350a(r0)     // Catch:{ all -> 0x0037 }
            if (r3 != 0) goto L_0x0032
            r0.printStackTrace()     // Catch:{ all -> 0x0037 }
        L_0x0032:
            if (r1 == 0) goto L_0x0035
            goto L_0x0022
        L_0x0035:
            monitor-exit(r13)
            return r2
        L_0x0037:
            r0 = move-exception
            if (r1 == 0) goto L_0x003d
            r1.mo38338a(r2)
        L_0x003d:
            throw r0
        L_0x003e:
            monitor-exit(r13)
            goto L_0x0041
        L_0x0040:
            throw r0
        L_0x0041:
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3307ae.m8248a(boolean, java.lang.String, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.tencent.bugly.proguard.ad):android.database.Cursor");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r1 != null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (0 != 0) goto L_0x001e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int m8244a(java.lang.String r4, java.lang.String r5, java.lang.String[] r6, com.tencent.bugly.proguard.AbstractC3306ad r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            r1 = 0
            com.tencent.bugly.proguard.af r2 = com.tencent.bugly.proguard.C3307ae.f7962c     // Catch:{ all -> 0x0024 }
            android.database.sqlite.SQLiteDatabase r1 = r2.getWritableDatabase()     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x000f
            int r0 = r1.delete(r4, r5, r6)     // Catch:{ all -> 0x0024 }
        L_0x000f:
            if (r7 == 0) goto L_0x0018
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0022 }
            r7.mo38338a(r4)     // Catch:{ all -> 0x0022 }
        L_0x0018:
            boolean r4 = com.tencent.bugly.proguard.C3307ae.f7960a     // Catch:{ all -> 0x0022 }
            if (r4 == 0) goto L_0x003e
            if (r1 == 0) goto L_0x003e
        L_0x001e:
            r1.close()     // Catch:{ all -> 0x0022 }
            goto L_0x003e
        L_0x0022:
            r4 = move-exception
            goto L_0x0054
        L_0x0024:
            r4 = move-exception
            boolean r5 = com.tencent.bugly.proguard.C3321an.m8350a(r4)     // Catch:{ all -> 0x0040 }
            if (r5 != 0) goto L_0x002e
            r4.printStackTrace()     // Catch:{ all -> 0x0040 }
        L_0x002e:
            if (r7 == 0) goto L_0x0037
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r7.mo38338a(r4)
        L_0x0037:
            boolean r4 = com.tencent.bugly.proguard.C3307ae.f7960a
            if (r4 == 0) goto L_0x003e
            if (r1 == 0) goto L_0x003e
            goto L_0x001e
        L_0x003e:
            monitor-exit(r3)
            return r0
        L_0x0040:
            r4 = move-exception
            if (r7 == 0) goto L_0x004a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r7.mo38338a(r5)
        L_0x004a:
            boolean r5 = com.tencent.bugly.proguard.C3307ae.f7960a
            if (r5 == 0) goto L_0x0053
            if (r1 == 0) goto L_0x0053
            r1.close()
        L_0x0053:
            throw r4
        L_0x0054:
            monitor-exit(r3)
            goto L_0x0057
        L_0x0056:
            throw r4
        L_0x0057:
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3307ae.m8244a(java.lang.String, java.lang.String, java.lang.String[], com.tencent.bugly.proguard.ad):int");
    }

    /* renamed from: a */
    public boolean mo38348a(int i, String str, byte[] bArr, AbstractC3306ad adVar, boolean z) {
        if (z) {
            return m8254a(i, str, bArr, adVar);
        }
        C3308a aVar = new C3308a(4, adVar);
        aVar.mo38356a(i, str, bArr);
        C3319am.m8340a().mo38398a(aVar);
        return true;
    }

    /* renamed from: a */
    public Map<String, byte[]> mo38345a(int i, AbstractC3306ad adVar, boolean z) {
        if (z) {
            return m8251a(i, adVar);
        }
        C3308a aVar = new C3308a(5, adVar);
        aVar.mo38354a(i);
        C3319am.m8340a().mo38398a(aVar);
        return null;
    }

    /* renamed from: a */
    public boolean mo38347a(int i, String str, AbstractC3306ad adVar, boolean z) {
        if (z) {
            return m8253a(i, str, adVar);
        }
        C3308a aVar = new C3308a(6, adVar);
        aVar.mo38355a(i, str);
        C3319am.m8340a().mo38398a(aVar);
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r8 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r8 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        r8.mo38338a(java.lang.Boolean.valueOf(r0));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8254a(int r5, java.lang.String r6, byte[] r7, com.tencent.bugly.proguard.AbstractC3306ad r8) {
        /*
            r4 = this;
            r0 = 0
            com.tencent.bugly.proguard.ag r1 = new com.tencent.bugly.proguard.ag     // Catch:{ all -> 0x0021 }
            r1.<init>()     // Catch:{ all -> 0x0021 }
            long r2 = (long) r5     // Catch:{ all -> 0x0021 }
            r1.f7985a = r2     // Catch:{ all -> 0x0021 }
            r1.f7990f = r6     // Catch:{ all -> 0x0021 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0021 }
            r1.f7989e = r5     // Catch:{ all -> 0x0021 }
            r1.f7991g = r7     // Catch:{ all -> 0x0021 }
            boolean r0 = r4.m8258d(r1)     // Catch:{ all -> 0x0021 }
            if (r8 == 0) goto L_0x002e
        L_0x0019:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r8.mo38338a(r5)
            goto L_0x002e
        L_0x0021:
            r5 = move-exception
            boolean r6 = com.tencent.bugly.proguard.C3321an.m8350a(r5)     // Catch:{ all -> 0x002f }
            if (r6 != 0) goto L_0x002b
            r5.printStackTrace()     // Catch:{ all -> 0x002f }
        L_0x002b:
            if (r8 == 0) goto L_0x002e
            goto L_0x0019
        L_0x002e:
            return r0
        L_0x002f:
            r5 = move-exception
            if (r8 == 0) goto L_0x0039
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r8.mo38338a(r6)
        L_0x0039:
            goto L_0x003b
        L_0x003a:
            throw r5
        L_0x003b:
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3307ae.m8254a(int, java.lang.String, byte[], com.tencent.bugly.proguard.ad):boolean");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r5 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r5.mo38338a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r5 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[Catch:{ all -> 0x003f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, byte[]> m8251a(int r4, com.tencent.bugly.proguard.AbstractC3306ad r5) {
        /*
            r3 = this;
            r0 = 0
            java.util.List r4 = r3.m8257c(r4)     // Catch:{ all -> 0x0031 }
            if (r4 == 0) goto L_0x002b
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0031 }
            r1.<init>()     // Catch:{ all -> 0x0031 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0028 }
        L_0x0010:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0028 }
            com.tencent.bugly.proguard.ag r0 = (com.tencent.bugly.proguard.C3310ag) r0     // Catch:{ all -> 0x0028 }
            byte[] r2 = r0.f7991g     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0010
            java.lang.String r0 = r0.f7990f     // Catch:{ all -> 0x0028 }
            r1.put(r0, r2)     // Catch:{ all -> 0x0028 }
            goto L_0x0010
        L_0x0026:
            r0 = r1
            goto L_0x002b
        L_0x0028:
            r4 = move-exception
            r0 = r1
            goto L_0x0032
        L_0x002b:
            if (r5 == 0) goto L_0x003e
        L_0x002d:
            r5.mo38338a(r0)
            goto L_0x003e
        L_0x0031:
            r4 = move-exception
        L_0x0032:
            boolean r1 = com.tencent.bugly.proguard.C3321an.m8350a(r4)     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003b
            r4.printStackTrace()     // Catch:{ all -> 0x003f }
        L_0x003b:
            if (r5 == 0) goto L_0x003e
            goto L_0x002d
        L_0x003e:
            return r0
        L_0x003f:
            r4 = move-exception
            if (r5 == 0) goto L_0x0045
            r5.mo38338a(r0)
        L_0x0045:
            goto L_0x0047
        L_0x0046:
            throw r4
        L_0x0047:
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3307ae.m8251a(int, com.tencent.bugly.proguard.ad):java.util.Map");
    }

    /* renamed from: a */
    public synchronized boolean mo38349a(C3310ag agVar) {
        ContentValues b;
        if (agVar == null) {
            return false;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = f7962c.getWritableDatabase();
            if (writableDatabase == null || (b = mo38350b(agVar)) == null) {
                if (f7960a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            }
            long replace = writableDatabase.replace("t_lr", C3848l.f10389g, b);
            if (replace >= 0) {
                C3321an.m8355c("[Database] insert %s success.", "t_lr");
                agVar.f7985a = replace;
                if (f7960a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return true;
            }
            if (f7960a && writableDatabase != null) {
                writableDatabase.close();
            }
            return false;
        } catch (Throwable th) {
            if (f7960a && 0 != 0) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4 A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c9 A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<com.tencent.bugly.proguard.C3310ag> mo38344a(int r12) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3307ae.mo38344a(int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (com.tencent.bugly.proguard.C3307ae.f7960a != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (com.tencent.bugly.proguard.C3307ae.f7960a == false) goto L_0x008a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo38346a(java.util.List<com.tencent.bugly.proguard.C3310ag> r6) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3307ae.mo38346a(java.util.List):void");
    }

    /* renamed from: a */
    public C3310ag mo38343a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C3310ag agVar = new C3310ag();
            agVar.f7985a = cursor.getLong(cursor.getColumnIndex(C3848l.f10389g));
            agVar.f7986b = cursor.getInt(cursor.getColumnIndex("_tp"));
            agVar.f7987c = cursor.getString(cursor.getColumnIndex("_pc"));
            agVar.f7988d = cursor.getString(cursor.getColumnIndex("_th"));
            agVar.f7989e = cursor.getLong(cursor.getColumnIndex("_tm"));
            agVar.f7991g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return agVar;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.database.sqlite.SQLiteDatabase */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087 A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m8253a(int r6, java.lang.String r7, com.tencent.bugly.proguard.AbstractC3306ad r8) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3307ae.m8253a(int, java.lang.String, com.tencent.bugly.proguard.ad):boolean");
    }
}
