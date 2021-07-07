package com.qiyukf.nimlib.p183g;

import com.qiyukf.nimlib.p155a.C2107a;
import com.qiyukf.nimlib.p180e.C2238d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.g.g */
public final class C2312g {

    /* renamed from: a */
    public static ArrayList<C2107a> f4616a;

    /* renamed from: a */
    public static synchronized void m4953a() {
        synchronized (C2312g.class) {
            boolean z = f4616a != null && f4616a.size() > 0;
            f4616a = null;
            if (z) {
                C2238d.m4679a();
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m4954a(ArrayList<C2107a> arrayList) {
        synchronized (C2312g.class) {
            f4616a = arrayList;
            C2238d.m4679a();
        }
    }

    /* renamed from: a */
    public static synchronized void m4955a(List<C2107a> list) {
        synchronized (C2312g.class) {
            m4958c(list);
            C2238d.m4679a();
        }
    }

    /* renamed from: b */
    public static ArrayList<C2107a> m4956b() {
        return f4616a;
    }

    /* renamed from: b */
    public static synchronized void m4957b(List<C2107a> list) {
        synchronized (C2312g.class) {
            m4958c(list);
            if (f4616a == null) {
                f4616a = new ArrayList<>();
            }
            for (C2107a aVar : list) {
                f4616a.add(aVar);
            }
            C2238d.m4679a();
        }
    }

    /* renamed from: c */
    public static synchronized void m4958c(List<C2107a> list) {
        synchronized (C2312g.class) {
            if (f4616a != null) {
                for (C2107a aVar : list) {
                    f4616a.remove(aVar);
                }
                if (f4616a.size() == 0) {
                    f4616a = null;
                }
            }
        }
    }
}
