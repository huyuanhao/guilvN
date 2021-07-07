package com.qiyukf.nimlib.p155a.p157b;

import android.util.SparseArray;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2154b;
import com.qiyukf.nimlib.p183g.p191c.C2289a;
import com.qiyukf.unicorn.analytics.C2379a;

/* renamed from: com.qiyukf.nimlib.a.b.c */
public abstract class AbstractC2121c {

    /* renamed from: b */
    public static AbstractC2121c f4269b;

    /* renamed from: c */
    public static AbstractC2121c f4270c;

    /* renamed from: a */
    public boolean f4271a = false;

    /* renamed from: d */
    public SparseArray<Class<? extends AbstractC2148a>> f4272d = new SparseArray<>();

    /* renamed from: e */
    public SparseArray<Integer> f4273e = new SparseArray<>();

    /* renamed from: f */
    public SparseArray<AbstractC2111a> f4274f = new SparseArray<>();

    public AbstractC2121c() {
        m4300c();
    }

    /* renamed from: a */
    public static AbstractC2121c m4299a(boolean z) {
        if ((z ? f4269b : f4270c) == null) {
            synchronized (AbstractC2121c.class) {
                if ((z ? f4269b : f4270c) == null) {
                    if (z) {
                        f4269b = new C2123d();
                    } else {
                        f4270c = new C2127e();
                    }
                }
            }
        }
        AbstractC2121c cVar = z ? f4269b : f4270c;
        cVar.m4300c();
        return cVar;
    }

    /* renamed from: c */
    private void m4300c() {
        if (!this.f4271a) {
            try {
                mo34643a();
                mo34648b();
                this.f4271a = true;
            } catch (Throwable th) {
                C1709a.m3011a("RF", "register handlers error");
                C2379a.m5200a(th);
                th.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public static int m4301e(C2289a aVar) {
        return aVar.mo34947h() | (aVar.mo34946g() << 16);
    }

    /* renamed from: a */
    public abstract void mo34643a();

    /* renamed from: a */
    public final void mo34644a(Class<? extends AbstractC2148a> cls) {
        AbstractC2154b bVar = (AbstractC2154b) cls.getAnnotation(AbstractC2154b.class);
        if (bVar != null) {
            byte a = bVar.mo34696a();
            String[] b = bVar.mo34697b();
            if (!(b == null || b.length == 0)) {
                for (String str : b) {
                    String[] split = str.split("#");
                    if (!(split == null || split.length == 0)) {
                        byte parseByte = Byte.parseByte(split[0]);
                        if (split.length >= 2) {
                            this.f4273e.put((a << 16) | parseByte, Integer.valueOf(Integer.parseInt(split[1])));
                        }
                        this.f4272d.put(parseByte | (a << 16), cls);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34645a(Class<? extends AbstractC2148a> cls, AbstractC2111a aVar) {
        AbstractC2154b bVar = (AbstractC2154b) cls.getAnnotation(AbstractC2154b.class);
        if (bVar != null) {
            byte a = bVar.mo34696a();
            String[] b = bVar.mo34697b();
            if (!(b == null || b.length == 0)) {
                for (String str : b) {
                    String[] split = str.split("#");
                    if (!(split == null || split.length == 0)) {
                        int parseByte = Byte.parseByte(split[0]) | (a << 16);
                        if (split.length >= 2) {
                            this.f4273e.append(parseByte, Integer.valueOf(Integer.parseInt(split[1])));
                        }
                        this.f4272d.append(parseByte, cls);
                        this.f4274f.append(parseByte, aVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo34646a(C2289a aVar) {
        return aVar != null && this.f4272d.indexOfKey(m4301e(aVar)) >= 0;
    }

    /* renamed from: b */
    public final Integer mo34647b(C2289a aVar) {
        SparseArray<Integer> sparseArray;
        if (aVar == null || (sparseArray = this.f4273e) == null) {
            return null;
        }
        return sparseArray.get(m4301e(aVar));
    }

    /* renamed from: b */
    public abstract void mo34648b();

    /* renamed from: c */
    public final AbstractC2111a mo34649c(C2289a aVar) {
        SparseArray<AbstractC2111a> sparseArray;
        if (aVar == null || (sparseArray = this.f4274f) == null) {
            return null;
        }
        return sparseArray.get(m4301e(aVar));
    }

    /* renamed from: d */
    public final AbstractC2148a mo34650d(C2289a aVar) {
        SparseArray<Class<? extends AbstractC2148a>> sparseArray;
        Class<? extends AbstractC2148a> cls = (aVar == null || (sparseArray = this.f4272d) == null) ? null : sparseArray.get(m4301e(aVar));
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC2148a) cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            C1709a.m3015b("ResponseFactory", "newResponse is error", e);
            return null;
        }
    }
}
