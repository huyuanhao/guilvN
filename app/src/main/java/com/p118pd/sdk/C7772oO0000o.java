package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.pd.sdk.oO0000o  reason: case insensitive filesystem */
public class C7772oO0000o {
    public static final AbstractC7770oO00000o<Object, Object> OooO00o = new OooO00o();
    public static final OooO0OO OooO0O0 = new OooO0OO();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Pools.OooO00o<List<Throwable>> f20804OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO f20805OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<OooO0O0<?, ?>> f20806OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set<OooO0O0<?, ?>> f20807OooO00o;

    /* renamed from: com.pd.sdk.oO0000o$OooO00o */
    public static class OooO00o implements AbstractC7770oO00000o<Object, Object> {
        @Override // com.p118pd.sdk.AbstractC7770oO00000o
        @Nullable
        public AbstractC7770oO00000o.OooO00o<Object> OooO00o(@NonNull Object obj, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
            return null;
        }

        @Override // com.p118pd.sdk.AbstractC7770oO00000o
        public boolean OooO00o(@NonNull Object obj) {
            return false;
        }
    }

    /* renamed from: com.pd.sdk.oO0000o$OooO0O0 */
    public static class OooO0O0<Model, Data> {
        public final AbstractC7771oO0000O<? extends Model, ? extends Data> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Class<Model> f20808OooO00o;
        public final Class<Data> OooO0O0;

        public OooO0O0(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull AbstractC7771oO0000O<? extends Model, ? extends Data> oo0000o) {
            this.f20808OooO00o = cls;
            this.OooO0O0 = cls2;
            this.OooO00o = oo0000o;
        }

        public boolean OooO00o(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return OooO00o(cls) && this.OooO0O0.isAssignableFrom(cls2);
        }

        public boolean OooO00o(@NonNull Class<?> cls) {
            return this.f20808OooO00o.isAssignableFrom(cls);
        }
    }

    /* renamed from: com.pd.sdk.oO0000o$OooO0OO */
    public static class OooO0OO {
        @NonNull
        public <Model, Data> oO0000o0<Model, Data> OooO00o(@NonNull List<AbstractC7770oO00000o<Model, Data>> list, @NonNull Pools.OooO00o<List<Throwable>> oooO00o) {
            return new oO0000o0<>(list, oooO00o);
        }
    }

    public C7772oO0000o(@NonNull Pools.OooO00o<List<Throwable>> oooO00o) {
        this(oooO00o, OooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized <Model, Data> void m19423OooO00o(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull AbstractC7771oO0000O<? extends Model, ? extends Data> oo0000o) {
        OooO00o(cls, cls2, oo0000o, true);
    }

    public synchronized <Model, Data> void OooO0O0(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull AbstractC7771oO0000O<? extends Model, ? extends Data> oo0000o) {
        OooO00o(cls, cls2, oo0000o, false);
    }

    @VisibleForTesting
    public C7772oO0000o(@NonNull Pools.OooO00o<List<Throwable>> oooO00o, @NonNull OooO0OO oooO0OO) {
        this.f20806OooO00o = new ArrayList();
        this.f20807OooO00o = new HashSet();
        this.f20804OooO00o = oooO00o;
        this.f20805OooO00o = oooO0OO;
    }

    private <Model, Data> void OooO00o(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull AbstractC7771oO0000O<? extends Model, ? extends Data> oo0000o, boolean z) {
        OooO0O0<?, ?> oooO0O0 = new OooO0O0<>(cls, cls2, oo0000o);
        List<OooO0O0<?, ?>> list = this.f20806OooO00o;
        list.add(z ? list.size() : 0, oooO0O0);
    }

    @NonNull
    public synchronized List<Class<?>> OooO0O0(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (OooO0O0<?, ?> oooO0O0 : this.f20806OooO00o) {
            if (!arrayList.contains(oooO0O0.OooO0O0) && oooO0O0.OooO00o(cls)) {
                arrayList.add(oooO0O0.OooO0O0);
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <Model, Data> List<AbstractC7771oO0000O<? extends Model, ? extends Data>> OooO00o(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull AbstractC7771oO0000O<? extends Model, ? extends Data> oo0000o) {
        List<AbstractC7771oO0000O<? extends Model, ? extends Data>> OooO00o2;
        OooO00o2 = m19422OooO00o((Class) cls, (Class) cls2);
        m19423OooO00o((Class) cls, (Class) cls2, (AbstractC7771oO0000O) oo0000o);
        return OooO00o2;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized <Model, Data> List<AbstractC7771oO0000O<? extends Model, ? extends Data>> m19422OooO00o(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<OooO0O0<?, ?>> it = this.f20806OooO00o.iterator();
        while (it.hasNext()) {
            OooO0O0<?, ?> next = it.next();
            if (next.OooO00o(cls, cls2)) {
                it.remove();
                arrayList.add(m19421OooO00o(next));
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <Model> List<AbstractC7770oO00000o<Model, ?>> OooO00o(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (OooO0O0<?, ?> oooO0O0 : this.f20806OooO00o) {
                if (!this.f20807OooO00o.contains(oooO0O0)) {
                    if (oooO0O0.OooO00o(cls)) {
                        this.f20807OooO00o.add(oooO0O0);
                        arrayList.add(OooO00o(oooO0O0));
                        this.f20807OooO00o.remove(oooO0O0);
                    }
                }
            }
        } catch (Throwable th) {
            this.f20807OooO00o.clear();
            throw th;
        }
        return arrayList;
    }

    @NonNull
    public synchronized <Model, Data> AbstractC7770oO00000o<Model, Data> OooO00o(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (OooO0O0<?, ?> oooO0O0 : this.f20806OooO00o) {
                if (this.f20807OooO00o.contains(oooO0O0)) {
                    z = true;
                } else if (oooO0O0.OooO00o(cls, cls2)) {
                    this.f20807OooO00o.add(oooO0O0);
                    arrayList.add(OooO00o(oooO0O0));
                    this.f20807OooO00o.remove(oooO0O0);
                }
            }
            if (arrayList.size() > 1) {
                return this.f20805OooO00o.OooO00o(arrayList, this.f20804OooO00o);
            } else if (arrayList.size() == 1) {
                return (AbstractC7770oO00000o) arrayList.get(0);
            } else if (z) {
                return OooO00o();
            } else {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
        } catch (Throwable th) {
            this.f20807OooO00o.clear();
            throw th;
        }
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: com.pd.sdk.oO0000O<? extends Model, ? extends Data>, com.pd.sdk.oO0000O<Model, Data> */
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    private <Model, Data> AbstractC7771oO0000O<Model, Data> m19421OooO00o(@NonNull OooO0O0<?, ?> oooO0O0) {
        return (AbstractC7771oO0000O<? extends Model, ? extends Data>) oooO0O0.OooO00o;
    }

    @NonNull
    private <Model, Data> AbstractC7770oO00000o<Model, Data> OooO00o(@NonNull OooO0O0<?, ?> oooO0O0) {
        return (AbstractC7770oO00000o) C7842oO0O0.OooO00o(oooO0O0.OooO00o.OooO00o(this));
    }

    @NonNull
    public static <Model, Data> AbstractC7770oO00000o<Model, Data> OooO00o() {
        return (AbstractC7770oO00000o<Model, Data>) OooO00o;
    }
}
