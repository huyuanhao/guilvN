package com.umeng.analytics.process;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.analytics.process.c */
public class C3482c {

    /* renamed from: a */
    public static C3482c f8845a;

    /* renamed from: b */
    public ConcurrentHashMap<String, C3483a> f8846b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public Context f8847c;

    /* renamed from: a */
    public static C3482c m8962a(Context context) {
        if (f8845a == null) {
            synchronized (C3482c.class) {
                if (f8845a == null) {
                    f8845a = new C3482c();
                }
            }
        }
        C3482c cVar = f8845a;
        cVar.f8847c = context;
        return cVar;
    }

    /* renamed from: c */
    private C3483a m8963c(String str) {
        if (this.f8846b.get(str) != null) {
            return this.f8846b.get(str);
        }
        C3483a a = C3483a.m8966a(this.f8847c, str);
        this.f8846b.put(str, a);
        return a;
    }

    /* renamed from: b */
    public synchronized void mo38824b(String str) {
        m8963c(str).mo38826b();
    }

    /* renamed from: com.umeng.analytics.process.c$a */
    public static class C3483a {

        /* renamed from: a */
        public AtomicInteger f8848a = new AtomicInteger();

        /* renamed from: b */
        public SQLiteOpenHelper f8849b;

        /* renamed from: c */
        public SQLiteDatabase f8850c;

        /* renamed from: a */
        public static C3483a m8966a(Context context, String str) {
            Context appContext = UMGlobalContext.getAppContext(context);
            C3483a aVar = new C3483a();
            aVar.f8849b = C3481b.m8958a(appContext, str);
            return aVar;
        }

        /* renamed from: b */
        public synchronized void mo38826b() {
            try {
                if (this.f8848a.decrementAndGet() == 0) {
                    this.f8850c.close();
                }
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        public synchronized SQLiteDatabase mo38825a() {
            if (this.f8848a.incrementAndGet() == 1) {
                this.f8850c = this.f8849b.getWritableDatabase();
            }
            return this.f8850c;
        }
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase mo38823a(String str) {
        return m8963c(str).mo38825a();
    }
}
