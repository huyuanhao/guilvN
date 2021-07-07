package com.qiyukf.nimlib.p177c.p178a;

import android.database.sqlite.SQLiteDatabase;
import com.qiyukf.basesdk.p119a.C1709a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.c.a.c */
public class C2195c {

    /* renamed from: a */
    public final C2196a[] f4380a;

    /* renamed from: com.qiyukf.nimlib.c.a.c$a */
    public static final class C2196a {

        /* renamed from: a */
        public final String f4381a;

        /* renamed from: b */
        public final boolean f4382b;

        /* renamed from: c */
        public final List<AbstractC2197b> f4383c;

        public C2196a(String str) {
            this(str, (byte) 0);
        }

        public C2196a(String str, byte b) {
            this.f4383c = new ArrayList();
            this.f4381a = str;
            this.f4382b = true;
        }

        /* renamed from: a */
        private int m4544a(int i) {
            int i2 = -1;
            for (int i3 = 0; i3 < this.f4383c.size(); i3++) {
                if (i >= this.f4383c.get(i3).f4384a) {
                    i2 = i3;
                }
            }
            return i2;
        }

        /* renamed from: a */
        public static void m4545a(SQLiteDatabase sQLiteDatabase, String[] strArr) {
            if (strArr != null) {
                for (String str : strArr) {
                    sQLiteDatabase.execSQL(str);
                }
            }
        }

        /* renamed from: b */
        private void m4546b(SQLiteDatabase sQLiteDatabase, int i) {
            AbstractC2197b bVar = this.f4383c.get(i);
            C1709a.m3018d("db", "create: table " + this + " target " + bVar);
            m4545a(sQLiteDatabase, bVar.mo34788a());
        }

        /* renamed from: b */
        private void m4547b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            AbstractC2197b bVar = this.f4383c.get(i2);
            C1709a.m3018d("db", "upgrade: table " + this + " initial " + this.f4383c.get(i) + " target " + bVar);
            m4545a(sQLiteDatabase, bVar.mo34789b());
        }

        /* renamed from: a */
        public final C2196a mo34784a(AbstractC2197b bVar) {
            this.f4383c.add(bVar);
            return this;
        }

        /* renamed from: a */
        public final void mo34785a(SQLiteDatabase sQLiteDatabase, int i) {
            int a = m4544a(i);
            if (a >= 0) {
                m4546b(sQLiteDatabase, a);
            }
        }

        /* renamed from: a */
        public final void mo34786a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int a = m4544a(i2);
            int a2 = m4544a(i);
            if (a != a2) {
                if (a2 < 0) {
                    m4546b(sQLiteDatabase, a);
                } else if (a2 >= a) {
                } else {
                    if (this.f4382b) {
                        while (a2 < a) {
                            int i3 = a2 + 1;
                            m4547b(sQLiteDatabase, a2, i3);
                            a2 = i3;
                        }
                        return;
                    }
                    m4547b(sQLiteDatabase, a2, a);
                }
            }
        }

        public final String toString() {
            return this.f4381a;
        }
    }

    /* renamed from: com.qiyukf.nimlib.c.a.c$b */
    public static abstract class AbstractC2197b {

        /* renamed from: a */
        public final int f4384a;

        public AbstractC2197b(int i) {
            this.f4384a = i;
        }

        /* renamed from: a */
        public abstract String[] mo34788a();

        /* renamed from: b */
        public abstract String[] mo34789b();

        public String toString() {
            return Integer.toString(this.f4384a);
        }
    }

    public C2195c(C2196a[] aVarArr) {
        this.f4380a = aVarArr;
    }

    /* renamed from: a */
    public final void mo34782a(SQLiteDatabase sQLiteDatabase, int i) {
        for (C2196a aVar : this.f4380a) {
            aVar.mo34785a(sQLiteDatabase, i);
        }
    }

    /* renamed from: a */
    public final void mo34783a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        for (C2196a aVar : this.f4380a) {
            aVar.mo34786a(sQLiteDatabase, i, i2);
        }
    }
}
