package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.AbstractC3553aa;
import com.umeng.commonsdk.proguard.AbstractC3556ad;
import com.xiaomi.mipush.sdk.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.umeng.commonsdk.proguard.ad */
public abstract class AbstractC3556ad<T extends AbstractC3556ad<?, ?>, F extends AbstractC3553aa> implements AbstractC3628t<T, F> {

    /* renamed from: c */
    public static final Map<Class<? extends AbstractC3591ba>, AbstractC3592bb> f9164c;

    /* renamed from: a */
    public Object f9165a;

    /* renamed from: b */
    public F f9166b;

    /* renamed from: com.umeng.commonsdk.proguard.ad$a */
    public static class C3558a extends AbstractC3593bc<AbstractC3556ad> {
        public C3558a() {
        }

        /* renamed from: a */
        public void mo38895b(AbstractC3579as asVar, AbstractC3556ad adVar) throws C3636z {
            adVar.f9166b = null;
            adVar.f9165a = null;
            asVar.mo38933j();
            C3574an l = asVar.mo38935l();
            Object a = adVar.mo38875a(asVar, l);
            adVar.f9165a = a;
            if (a != null) {
                adVar.f9166b = (F) adVar.mo38872a(l.f9231c);
            }
            asVar.mo38936m();
            asVar.mo38935l();
            asVar.mo38934k();
        }

        /* renamed from: b */
        public void mo38893a(AbstractC3579as asVar, AbstractC3556ad adVar) throws C3636z {
            if (adVar.mo38871a() == null || adVar.mo38880b() == null) {
                throw new C3580at("Cannot write a TUnion with no set value!");
            }
            asVar.mo38917a(adVar.mo38888d());
            asVar.mo38912a(adVar.mo38885c(adVar.f9166b));
            adVar.mo38879a(asVar);
            asVar.mo38924c();
            asVar.mo38926d();
            asVar.mo38923b();
        }
    }

    /* renamed from: com.umeng.commonsdk.proguard.ad$b */
    public static class C3559b implements AbstractC3592bb {
        public C3559b() {
        }

        /* renamed from: a */
        public C3558a mo38897b() {
            return new C3558a();
        }
    }

    /* renamed from: com.umeng.commonsdk.proguard.ad$c */
    public static class C3560c extends AbstractC3594bd<AbstractC3556ad> {
        public C3560c() {
        }

        /* renamed from: a */
        public void mo38895b(AbstractC3579as asVar, AbstractC3556ad adVar) throws C3636z {
            adVar.f9166b = null;
            adVar.f9165a = null;
            short v = asVar.mo38945v();
            Object a = adVar.mo38876a(asVar, v);
            adVar.f9165a = a;
            if (a != null) {
                adVar.f9166b = (F) adVar.mo38872a(v);
            }
        }

        /* renamed from: b */
        public void mo38893a(AbstractC3579as asVar, AbstractC3556ad adVar) throws C3636z {
            if (adVar.mo38871a() == null || adVar.mo38880b() == null) {
                throw new C3580at("Cannot write a TUnion with no set value!");
            }
            asVar.mo38920a(adVar.f9166b.mo38866a());
            adVar.mo38882b(asVar);
        }
    }

    /* renamed from: com.umeng.commonsdk.proguard.ad$d */
    public static class C3561d implements AbstractC3592bb {
        public C3561d() {
        }

        /* renamed from: a */
        public C3560c mo38897b() {
            return new C3560c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f9164c = hashMap;
        hashMap.put(AbstractC3593bc.class, new C3559b());
        f9164c.put(AbstractC3594bd.class, new C3561d());
    }

    public AbstractC3556ad() {
        this.f9166b = null;
        this.f9165a = null;
    }

    /* renamed from: a */
    public static Object m9232a(Object obj) {
        if (obj instanceof AbstractC3628t) {
            return ((AbstractC3628t) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return C3629u.m9635d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return m9233a((List) obj);
        }
        if (obj instanceof Set) {
            return m9235a((Set) obj);
        }
        return obj instanceof Map ? m9234a((Map<Object, Object>) ((Map) obj)) : obj;
    }

    /* renamed from: a */
    public abstract F mo38872a(short s);

    /* renamed from: a */
    public abstract Object mo38875a(AbstractC3579as asVar, C3574an anVar) throws C3636z;

    /* renamed from: a */
    public abstract Object mo38876a(AbstractC3579as asVar, short s) throws C3636z;

    /* renamed from: a */
    public abstract void mo38879a(AbstractC3579as asVar) throws C3636z;

    /* renamed from: b */
    public Object mo38880b() {
        return this.f9165a;
    }

    /* renamed from: b */
    public abstract void mo38881b(F f, Object obj) throws ClassCastException;

    /* renamed from: b */
    public abstract void mo38882b(AbstractC3579as asVar) throws C3636z;

    /* renamed from: c */
    public abstract C3574an mo38885c(F f);

    /* renamed from: c */
    public boolean mo38886c() {
        return this.f9166b != null;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public final void clear() {
        this.f9166b = null;
        this.f9165a = null;
    }

    /* renamed from: d */
    public abstract C3584ax mo38888d();

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void read(AbstractC3579as asVar) throws C3636z {
        f9164c.get(asVar.mo38959D()).mo38897b().mo38895b(asVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(AbstractC3556ad.class.getSimpleName());
        sb.append(" ");
        if (mo38871a() != null) {
            Object b = mo38880b();
            sb.append(mo38885c(mo38871a()).f9229a);
            sb.append(Constants.COLON_SEPARATOR);
            if (b instanceof ByteBuffer) {
                C3629u.m9630a((ByteBuffer) b, sb);
            } else {
                sb.append(b.toString());
            }
        }
        sb.append(">");
        return sb.toString();
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void write(AbstractC3579as asVar) throws C3636z {
        f9164c.get(asVar.mo38959D()).mo38897b().mo38893a(asVar, this);
    }

    /* renamed from: b */
    public boolean mo38884b(F f) {
        return this.f9166b == f;
    }

    /* renamed from: b */
    public boolean mo38883b(int i) {
        return mo38884b(mo38872a((short) i));
    }

    public AbstractC3556ad(F f, Object obj) {
        mo38878a(f, obj);
    }

    public AbstractC3556ad(AbstractC3556ad<T, F> adVar) {
        if (adVar.getClass().equals(AbstractC3556ad.class)) {
            this.f9166b = adVar.f9166b;
            this.f9165a = m9232a(adVar.f9165a);
            return;
        }
        throw new ClassCastException();
    }

    /* renamed from: a */
    public static Map m9234a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            hashMap.put(m9232a(entry.getKey()), m9232a(entry.getValue()));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Set m9235a(Set set) {
        HashSet hashSet = new HashSet();
        for (Object obj : set) {
            hashSet.add(m9232a(obj));
        }
        return hashSet;
    }

    /* renamed from: a */
    public static List m9233a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            arrayList.add(m9232a(obj));
        }
        return arrayList;
    }

    /* renamed from: a */
    public F mo38871a() {
        return this.f9166b;
    }

    /* renamed from: a */
    public Object mo38874a(F f) {
        if (f == this.f9166b) {
            return mo38880b();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f + " because union's set field is " + this.f9166b);
    }

    /* renamed from: a */
    public Object mo38873a(int i) {
        return mo38874a((AbstractC3553aa) mo38872a((short) i));
    }

    /* renamed from: a */
    public void mo38878a(F f, Object obj) {
        mo38881b(f, obj);
        this.f9166b = f;
        this.f9165a = obj;
    }

    /* renamed from: a */
    public void mo38877a(int i, Object obj) {
        mo38878a(mo38872a((short) i), obj);
    }
}
