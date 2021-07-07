package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.xiaomi.push.service.C4605ah;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.xiaomi.push.cd */
public class C4312cd {

    /* renamed from: a */
    public static volatile C4312cd f11476a;

    /* renamed from: a */
    public Context f11477a;

    /* renamed from: a */
    public AbstractC4311cc f11478a;

    /* renamed from: a */
    public final ArrayList<AbstractRunnableC4313a> f11479a = new ArrayList<>();

    /* renamed from: a */
    public final HashMap<String, AbstractC4310cb> f11480a = new HashMap<>();

    /* renamed from: a */
    public ThreadPoolExecutor f11481a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: com.xiaomi.push.cd$a */
    public static abstract class AbstractRunnableC4313a implements Runnable {

        /* renamed from: a */
        public int f11482a = 0;

        /* renamed from: a */
        public AbstractC4310cb f11483a = null;

        /* renamed from: a */
        public AbstractRunnableC4313a f11484a;

        /* renamed from: a */
        public String f11485a;

        /* renamed from: a */
        public WeakReference<Context> f11486a;

        /* renamed from: a */
        public Random f11487a = new Random();

        /* renamed from: b */
        public String f11488b;

        public AbstractRunnableC4313a(String str) {
            this.f11485a = str;
        }

        /* renamed from: a */
        public SQLiteDatabase mo41545a() {
            return this.f11483a.getWritableDatabase();
        }

        /* renamed from: a */
        public Object m11930a() {
            return null;
        }

        /* renamed from: a */
        public String m11931a() {
            return this.f11485a;
        }

        /* renamed from: a */
        public void mo41579a(Context context) {
            AbstractRunnableC4313a aVar = this.f11484a;
            if (aVar != null) {
                aVar.mo41543a(context, m11930a());
            }
            mo41583b(context);
        }

        /* renamed from: a */
        public abstract void mo41580a(Context context, SQLiteDatabase sQLiteDatabase);

        /* renamed from: a */
        public void mo41543a(Context context, Object obj) {
            C4312cd.m11921a(context).mo41575a(this);
        }

        /* renamed from: a */
        public void mo41581a(AbstractC4310cb cbVar, Context context) {
            this.f11483a = cbVar;
            this.f11488b = cbVar.mo41572a();
            this.f11486a = new WeakReference<>(context);
        }

        /* renamed from: a */
        public void mo41582a(AbstractRunnableC4313a aVar) {
            this.f11484a = aVar;
        }

        /* renamed from: a */
        public boolean m11937a() {
            return this.f11483a == null || TextUtils.isEmpty(this.f11488b) || this.f11486a == null;
        }

        /* renamed from: b */
        public void mo41583b(Context context) {
        }

        public final void run() {
            Context context;
            WeakReference<Context> weakReference = this.f11486a;
            if (weakReference != null && (context = weakReference.get()) != null && context.getFilesDir() != null && this.f11483a != null && !TextUtils.isEmpty(this.f11485a)) {
                File file = new File(this.f11485a);
                AbstractRunnableC4690v.m14231a(context, new File(file.getParentFile(), C4284be.m11798b(file.getAbsolutePath())), new RunnableC4319cf(this, context));
            }
        }
    }

    /* renamed from: com.xiaomi.push.cd$b */
    public static abstract class AbstractC4314b<T> extends AbstractRunnableC4313a {

        /* renamed from: a */
        public int f11489a;

        /* renamed from: a */
        public String f11490a;

        /* renamed from: a */
        public List<String> f11491a;

        /* renamed from: a */
        public String[] f11492a;

        /* renamed from: b */
        public List<T> f11493b = new ArrayList();

        /* renamed from: c */
        public String f11494c;

        /* renamed from: d */
        public String f11495d;

        /* renamed from: e */
        public String f11496e;

        public AbstractC4314b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i) {
            super(str);
            this.f11491a = list;
            this.f11490a = str2;
            this.f11492a = strArr;
            this.f11494c = str3;
            this.f11495d = str4;
            this.f11496e = str5;
            this.f11489a = i;
        }

        @Override // com.xiaomi.push.C4312cd.AbstractRunnableC4313a, com.xiaomi.push.C4312cd.AbstractRunnableC4313a, com.xiaomi.push.C4312cd.AbstractRunnableC4313a, com.xiaomi.push.C4312cd.AbstractRunnableC4313a
        /* renamed from: a */
        public SQLiteDatabase mo41545a() {
            return ((AbstractRunnableC4313a) this).f11483a.getReadableDatabase();
        }

        /* renamed from: a */
        public abstract T mo41544a(Context context, Cursor cursor);

        @Override // com.xiaomi.push.C4312cd.AbstractRunnableC4313a
        /* renamed from: a */
        public void mo41580a(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.f11493b.clear();
            List<String> list = this.f11491a;
            String str = null;
            if (list == null || list.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.f11491a.size()];
                this.f11491a.toArray(strArr2);
                strArr = strArr2;
            }
            int i = this.f11489a;
            if (i > 0) {
                str = String.valueOf(i);
            }
            Cursor query = sQLiteDatabase.query(super.f11488b, strArr, this.f11490a, this.f11492a, this.f11494c, this.f11495d, this.f11496e, str);
            if (query != null && query.moveToFirst()) {
                do {
                    T a = mo41544a(context, query);
                    if (a != null) {
                        this.f11493b.add(a);
                    }
                } while (query.moveToNext());
                query.close();
            }
            mo41546a(context, (List) this.f11493b);
        }

        /* renamed from: a */
        public abstract void mo41546a(Context context, List<T> list);
    }

    /* renamed from: com.xiaomi.push.cd$c */
    public static class C4315c extends AbstractRunnableC4313a {

        /* renamed from: a */
        public ArrayList<AbstractRunnableC4313a> f11497a;

        public C4315c(String str, ArrayList<AbstractRunnableC4313a> arrayList) {
            super(str);
            ArrayList<AbstractRunnableC4313a> arrayList2 = new ArrayList<>();
            this.f11497a = arrayList2;
            arrayList2.addAll(arrayList);
        }

        @Override // com.xiaomi.push.C4312cd.AbstractRunnableC4313a
        /* renamed from: a */
        public final void mo41579a(Context context) {
            super.mo41579a(context);
            Iterator<AbstractRunnableC4313a> it = this.f11497a.iterator();
            while (it.hasNext()) {
                AbstractRunnableC4313a next = it.next();
                if (next != null) {
                    next.mo41579a(context);
                }
            }
        }

        @Override // com.xiaomi.push.C4312cd.AbstractRunnableC4313a
        /* renamed from: a */
        public void mo41580a(Context context, SQLiteDatabase sQLiteDatabase) {
            Iterator<AbstractRunnableC4313a> it = this.f11497a.iterator();
            while (it.hasNext()) {
                AbstractRunnableC4313a next = it.next();
                if (next != null) {
                    next.mo41580a(context, sQLiteDatabase);
                }
            }
        }
    }

    /* renamed from: com.xiaomi.push.cd$d */
    public static class C4316d extends AbstractRunnableC4313a {

        /* renamed from: a */
        public String f11498a;

        /* renamed from: a */
        public String[] f11499a;

        public C4316d(String str, String str2, String[] strArr) {
            super(str);
            this.f11498a = str2;
            this.f11499a = strArr;
        }

        @Override // com.xiaomi.push.C4312cd.AbstractRunnableC4313a
        /* renamed from: a */
        public void mo41580a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.f11488b, this.f11498a, this.f11499a);
        }
    }

    /* renamed from: com.xiaomi.push.cd$e */
    public static class C4317e extends AbstractRunnableC4313a {

        /* renamed from: a */
        public ContentValues f11500a;

        public C4317e(String str, ContentValues contentValues) {
            super(str);
            this.f11500a = contentValues;
        }

        @Override // com.xiaomi.push.C4312cd.AbstractRunnableC4313a
        /* renamed from: a */
        public void mo41580a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.f11488b, null, this.f11500a);
        }
    }

    public C4312cd(Context context) {
        this.f11477a = context;
    }

    /* renamed from: a */
    private AbstractC4310cb mo41574a(String str) {
        AbstractC4310cb cbVar = this.f11480a.get(str);
        if (cbVar == null) {
            synchronized (this.f11480a) {
                if (cbVar == null) {
                    cbVar = this.f11478a.mo41573a(this.f11477a, str);
                    this.f11480a.put(str, cbVar);
                }
            }
        }
        return cbVar;
    }

    /* renamed from: a */
    public static C4312cd m11921a(Context context) {
        if (f11476a == null) {
            synchronized (C4312cd.class) {
                if (f11476a == null) {
                    f11476a = new C4312cd(context);
                }
            }
        }
        return f11476a;
    }

    /* renamed from: a */
    private void m11923a() {
        C4251ai.m11641a(this.f11477a).mo41479b(new C4318ce(this), C4605ah.m13919a(this.f11477a).mo42656a(EnumC4499ht.StatDataProcessFrequency.mo42043a(), 5));
    }

    /* renamed from: a */
    public String m11924a(String str) {
        return mo41574a(str).mo41572a();
    }

    /* renamed from: a */
    public void mo41575a(AbstractRunnableC4313a aVar) {
        AbstractC4310cb cbVar;
        if (aVar != null) {
            if (this.f11478a != null) {
                String a = aVar.m11931a();
                synchronized (this.f11480a) {
                    cbVar = this.f11480a.get(a);
                    if (cbVar == null) {
                        cbVar = this.f11478a.mo41573a(this.f11477a, a);
                        this.f11480a.put(a, cbVar);
                    }
                }
                if (!this.f11481a.isShutdown()) {
                    aVar.mo41581a(cbVar, this.f11477a);
                    synchronized (this.f11479a) {
                        this.f11479a.add(aVar);
                        m11923a();
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("should exec init method first!");
        }
    }

    /* renamed from: a */
    public void mo41576a(Runnable runnable) {
        if (!this.f11481a.isShutdown()) {
            this.f11481a.execute(runnable);
        }
    }

    /* renamed from: a */
    public void mo41577a(ArrayList<AbstractRunnableC4313a> arrayList) {
        if (this.f11478a != null) {
            HashMap hashMap = new HashMap();
            if (!this.f11481a.isShutdown()) {
                Iterator<AbstractRunnableC4313a> it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractRunnableC4313a next = it.next();
                    if (next.m11937a()) {
                        next.mo41581a(mo41574a(next.m11931a()), this.f11477a);
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get(next.m11931a());
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        hashMap.put(next.m11931a(), arrayList2);
                    }
                    arrayList2.add(next);
                }
                for (String str : hashMap.keySet()) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        C4315c cVar = new C4315c(str, arrayList3);
                        cVar.mo41581a(((AbstractRunnableC4313a) arrayList3.get(0)).f11483a, this.f11477a);
                        this.f11481a.execute(cVar);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("should exec setDbHelperFactory method first!");
    }

    /* renamed from: b */
    public void mo41578b(AbstractRunnableC4313a aVar) {
        AbstractC4310cb cbVar;
        if (aVar != null) {
            if (this.f11478a != null) {
                String a = aVar.m11931a();
                synchronized (this.f11480a) {
                    cbVar = this.f11480a.get(a);
                    if (cbVar == null) {
                        cbVar = this.f11478a.mo41573a(this.f11477a, a);
                        this.f11480a.put(a, cbVar);
                    }
                }
                if (!this.f11481a.isShutdown()) {
                    aVar.mo41581a(cbVar, this.f11477a);
                    mo41576a((Runnable) aVar);
                    return;
                }
                return;
            }
            throw new IllegalStateException("should exec init method first!");
        }
    }
}
