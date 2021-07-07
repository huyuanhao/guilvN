package com.p118pd.sdk;

import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.DecodeJob;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o0oo0OO  reason: case insensitive filesystem */
public final class C7681o0oo0OO<Transcode> {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Priority f20578OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DecodeJob.AbstractC5098OooO0o0 f20579OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7607o0o0OoOO f20580OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7644o0oOoOO f20581OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7648o0oOoOo f20582OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7684o0oo0OOo f20583OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Class<?> f20584OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f20585OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<AbstractC7770oO00000o.OooO00o<?>> f20586OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<Class<?>, AbstractC7655o0oOoo0O<?>> f20587OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20588OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Class<Transcode> f20589OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final List<AbstractC7644o0oOoOO> f20590OooO0O0 = new ArrayList();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f20591OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.lang.Class<R> */
    /* JADX WARN: Multi-variable type inference failed */
    public <R> void OooO00o(C7607o0o0OoOO o0o0oooo, Object obj, AbstractC7644o0oOoOO o0ooooo, int i, int i2, AbstractC7684o0oo0OOo o0oo0ooo, Class<?> cls, Class<R> cls2, Priority priority, C7648o0oOoOo o0ooooo2, Map<Class<?>, AbstractC7655o0oOoo0O<?>> map, boolean z, boolean z2, DecodeJob.AbstractC5098OooO0o0 oooO0o0) {
        this.f20580OooO00o = o0o0oooo;
        this.f20585OooO00o = obj;
        this.f20581OooO00o = o0ooooo;
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.f20583OooO00o = o0oo0ooo;
        this.f20584OooO00o = cls;
        this.f20579OooO00o = oooO0o0;
        this.f20589OooO0O0 = cls2;
        this.f20578OooO00o = priority;
        this.f20582OooO00o = o0ooooo2;
        this.f20587OooO00o = map;
        this.OooO0OO = z;
        this.OooO0Oo = z2;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    public List<Class<?>> OooO0OO() {
        return this.f20580OooO00o.m19243OooO00o().m14983OooO00o((Class) this.f20585OooO00o.getClass(), (Class) this.f20584OooO00o, (Class) this.f20589OooO0O0);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.lang.Class<Transcode>, java.lang.Class<?> */
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Class<?> m19325OooO0O0() {
        return (Class<Transcode>) this.f20589OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public List<AbstractC7770oO00000o.OooO00o<?>> m19326OooO0O0() {
        if (!this.f20588OooO00o) {
            this.f20588OooO00o = true;
            this.f20586OooO00o.clear();
            List OooO00o2 = this.f20580OooO00o.m19243OooO00o().m14984OooO00o(this.f20585OooO00o);
            int size = OooO00o2.size();
            for (int i = 0; i < size; i++) {
                AbstractC7770oO00000o.OooO00o<?> OooO00o3 = ((AbstractC7770oO00000o) OooO00o2.get(i)).OooO00o(this.f20585OooO00o, this.OooO00o, this.OooO0O0, this.f20582OooO00o);
                if (OooO00o3 != null) {
                    this.f20586OooO00o.add(OooO00o3);
                }
            }
        }
        return this.f20586OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19321OooO00o() {
        this.f20580OooO00o = null;
        this.f20585OooO00o = null;
        this.f20581OooO00o = null;
        this.f20584OooO00o = null;
        this.f20589OooO0O0 = null;
        this.f20582OooO00o = null;
        this.f20578OooO00o = null;
        this.f20587OooO00o = null;
        this.f20583OooO00o = null;
        this.f20586OooO00o.clear();
        this.f20588OooO00o = false;
        this.f20590OooO0O0.clear();
        this.f20591OooO0O0 = false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7734o0ooo00O m19318OooO00o() {
        return this.f20579OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7684o0oo0OOo m19315OooO00o() {
        return this.f20583OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Priority m19312OooO00o() {
        return this.f20578OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7648o0oOoOo m19314OooO00o() {
        return this.f20582OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7644o0oOoOO m19313OooO00o() {
        return this.f20581OooO00o;
    }

    public int OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7707o0ooO00O m19317OooO00o() {
        return this.f20580OooO00o.m19245OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<?> m19319OooO00o() {
        return this.f20585OooO00o.getClass();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19324OooO00o(Class<?> cls) {
        return m19316OooO00o(cls) != null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public <Data> C7696o0oo0oO<Data, ?, Transcode> m19316OooO00o(Class<Data> cls) {
        return this.f20580OooO00o.m19243OooO00o().OooO00o((Class) cls, (Class) this.f20584OooO00o, (Class) this.f20589OooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19322OooO00o() {
        return this.OooO0Oo;
    }

    public <Z> AbstractC7655o0oOoo0O<Z> OooO00o(Class<Z> cls) {
        AbstractC7655o0oOoo0O<Z> o0oooo0o = (AbstractC7655o0oOoo0O<Z>) this.f20587OooO00o.get(cls);
        if (o0oooo0o == null) {
            Iterator<Map.Entry<Class<?>, AbstractC7655o0oOoo0O<?>>> it = this.f20587OooO00o.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, AbstractC7655o0oOoo0O<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    o0oooo0o = (AbstractC7655o0oOoo0O<Z>) next.getValue();
                    break;
                }
            }
        }
        if (o0oooo0o != null) {
            return o0oooo0o;
        }
        if (!this.f20587OooO00o.isEmpty() || !this.OooO0OO) {
            return C7892oO0Oo0oo.OooO00o();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19323OooO00o(AbstractC7700o0oo0oo0<?> o0oo0oo0) {
        return this.f20580OooO00o.m19243OooO00o().m14985OooO00o(o0oo0oo0);
    }

    public <Z> AbstractC7653o0oOoo0<Z> OooO00o(AbstractC7700o0oo0oo0<Z> o0oo0oo0) {
        return this.f20580OooO00o.m19243OooO00o().OooO00o((AbstractC7700o0oo0oo0) o0oo0oo0);
    }

    public List<AbstractC7770oO00000o<File, ?>> OooO00o(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f20580OooO00o.m19243OooO00o().m14984OooO00o((Object) file);
    }

    public boolean OooO00o(AbstractC7644o0oOoOO o0ooooo) {
        List<AbstractC7770oO00000o.OooO00o<?>> OooO0O02 = m19326OooO0O0();
        int size = OooO0O02.size();
        for (int i = 0; i < size; i++) {
            if (OooO0O02.get(i).OooO00o.equals(o0ooooo)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<AbstractC7644o0oOoOO> m19320OooO00o() {
        if (!this.f20591OooO0O0) {
            this.f20591OooO0O0 = true;
            this.f20590OooO0O0.clear();
            List<AbstractC7770oO00000o.OooO00o<?>> OooO0O02 = m19326OooO0O0();
            int size = OooO0O02.size();
            for (int i = 0; i < size; i++) {
                AbstractC7770oO00000o.OooO00o<?> oooO00o = OooO0O02.get(i);
                if (!this.f20590OooO0O0.contains(oooO00o.OooO00o)) {
                    this.f20590OooO0O0.add(oooO00o.OooO00o);
                }
                for (int i2 = 0; i2 < oooO00o.f20802OooO00o.size(); i2++) {
                    if (!this.f20590OooO0O0.contains(oooO00o.f20802OooO00o.get(i2))) {
                        this.f20590OooO0O0.add(oooO00o.f20802OooO00o.get(i2));
                    }
                }
            }
        }
        return this.f20590OooO0O0;
    }

    public <X> AbstractC7641o0oOoO<X> OooO00o(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f20580OooO00o.m19243OooO00o().OooO00o((Object) x);
    }
}
