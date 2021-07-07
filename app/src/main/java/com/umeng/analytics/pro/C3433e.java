package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.analytics.pro.e */
public class C3433e {

    /* renamed from: b */
    public static SQLiteOpenHelper f8570b;

    /* renamed from: d */
    public static Context f8571d;

    /* renamed from: a */
    public AtomicInteger f8572a;

    /* renamed from: c */
    public SQLiteDatabase f8573c;

    /* renamed from: com.umeng.analytics.pro.e$a */
    public static class C3435a {

        /* renamed from: a */
        public static final C3433e f8574a = new C3433e();
    }

    /* renamed from: a */
    public static C3433e m8741a(Context context) {
        if (f8571d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f8571d = applicationContext;
            f8570b = C3430d.m8730a(applicationContext);
        }
        return C3435a.f8574a;
    }

    /* renamed from: b */
    public synchronized void mo38699b() {
        try {
            if (this.f8572a.decrementAndGet() == 0) {
                this.f8573c.close();
            }
        } catch (Throwable unused) {
        }
    }

    public C3433e() {
        this.f8572a = new AtomicInteger();
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase mo38698a() {
        if (this.f8572a.incrementAndGet() == 1) {
            this.f8573c = f8570b.getWritableDatabase();
        }
        return this.f8573c;
    }
}
