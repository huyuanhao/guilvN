package com.xiaomi.push;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4312cd;

/* renamed from: com.xiaomi.push.cf */
public class RunnableC4319cf implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f11502a;

    /* renamed from: a */
    public final /* synthetic */ C4312cd.AbstractRunnableC4313a f11503a;

    public RunnableC4319cf(C4312cd.AbstractRunnableC4313a aVar, Context context) {
        this.f11503a = aVar;
        this.f11502a = context;
    }

    public void run() {
        Exception e;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a = this.f11503a.mo41545a();
            if (a != null && a.isOpen()) {
                a.beginTransaction();
                this.f11503a.mo41580a(this.f11502a, a);
                a.setTransactionSuccessful();
            }
            if (a != null) {
                try {
                    a.endTransaction();
                } catch (Exception e2) {
                    e = e2;
                    AbstractC4163b.m11303a(e);
                    this.f11503a.mo41579a(this.f11502a);
                }
            }
            if (this.f11503a.f11483a != null) {
                this.f11503a.f11483a.close();
            }
        } catch (Exception e3) {
            AbstractC4163b.m11303a(e3);
            if (0 != 0) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e4) {
                    e = e4;
                    AbstractC4163b.m11303a(e);
                    this.f11503a.mo41579a(this.f11502a);
                }
            }
            if (this.f11503a.f11483a != null) {
                this.f11503a.f11483a.close();
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e5) {
                    AbstractC4163b.m11303a(e5);
                    this.f11503a.mo41579a(this.f11502a);
                    throw th;
                }
            }
            if (this.f11503a.f11483a != null) {
                this.f11503a.f11483a.close();
            }
            this.f11503a.mo41579a(this.f11502a);
            throw th;
        }
        this.f11503a.mo41579a(this.f11502a);
    }
}
