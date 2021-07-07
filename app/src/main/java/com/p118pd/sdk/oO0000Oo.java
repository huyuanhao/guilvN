package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.oO0000Oo */
public class oO0000Oo {
    public final OooO00o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7772oO0000o f20803OooO00o;

    /* renamed from: com.pd.sdk.oO0000Oo$OooO00o */
    public static class OooO00o {
        public final Map<Class<?>, C4972OooO00o<?>> OooO00o = new HashMap();

        /* renamed from: com.pd.sdk.oO0000Oo$OooO00o$OooO00o  reason: collision with other inner class name */
        public static class C4972OooO00o<Model> {
            public final List<AbstractC7770oO00000o<Model, ?>> OooO00o;

            public C4972OooO00o(List<AbstractC7770oO00000o<Model, ?>> list) {
                this.OooO00o = list;
            }
        }

        public void OooO00o() {
            this.OooO00o.clear();
        }

        public <Model> void OooO00o(Class<Model> cls, List<AbstractC7770oO00000o<Model, ?>> list) {
            if (this.OooO00o.put(cls, new C4972OooO00o<>(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }

        @Nullable
        public <Model> List<AbstractC7770oO00000o<Model, ?>> OooO00o(Class<Model> cls) {
            C4972OooO00o<?> oooO00o = this.OooO00o.get(cls);
            if (oooO00o == null) {
                return null;
            }
            return oooO00o.OooO00o;
        }
    }

    public oO0000Oo(@NonNull Pools.OooO00o<List<Throwable>> oooO00o) {
        this(new C7772oO0000o(oooO00o));
    }

    public synchronized <Model, Data> void OooO00o(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull AbstractC7771oO0000O<? extends Model, ? extends Data> oo0000o) {
        this.f20803OooO00o.m19423OooO00o((Class) cls, (Class) cls2, (AbstractC7771oO0000O) oo0000o);
        this.OooO00o.OooO00o();
    }

    public synchronized <Model, Data> void OooO0O0(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull AbstractC7771oO0000O<? extends Model, ? extends Data> oo0000o) {
        this.f20803OooO00o.OooO0O0(cls, cls2, oo0000o);
        this.OooO00o.OooO00o();
    }

    public synchronized <Model, Data> void OooO0OO(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull AbstractC7771oO0000O<? extends Model, ? extends Data> oo0000o) {
        OooO00o((List) this.f20803OooO00o.OooO00o((Class) cls, (Class) cls2, (AbstractC7771oO0000O) oo0000o));
        this.OooO00o.OooO00o();
    }

    public oO0000Oo(@NonNull C7772oO0000o oo0000o) {
        this.OooO00o = new OooO00o();
        this.f20803OooO00o = oo0000o;
    }

    @NonNull
    private synchronized <A> List<AbstractC7770oO00000o<A, ?>> OooO0O0(@NonNull Class<A> cls) {
        List<AbstractC7770oO00000o<A, ?>> OooO00o2;
        OooO00o2 = this.OooO00o.OooO00o(cls);
        if (OooO00o2 == null) {
            OooO00o2 = Collections.unmodifiableList(this.f20803OooO00o.OooO00o(cls));
            this.OooO00o.OooO00o(cls, OooO00o2);
        }
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized <Model, Data> void m19420OooO00o(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        OooO00o((List) this.f20803OooO00o.m19422OooO00o((Class) cls, (Class) cls2));
        this.OooO00o.OooO00o();
    }

    private <Model, Data> void OooO00o(@NonNull List<AbstractC7771oO0000O<? extends Model, ? extends Data>> list) {
        for (AbstractC7771oO0000O<? extends Model, ? extends Data> oo0000o : list) {
            oo0000o.OooO00o();
        }
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public <A> List<AbstractC7770oO00000o<A, ?>> m19419OooO00o(@NonNull A a) {
        List<AbstractC7770oO00000o<A, ?>> OooO0O0 = OooO0O0(OooO00o((Object) a));
        int size = OooO0O0.size();
        List<AbstractC7770oO00000o<A, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            AbstractC7770oO00000o<A, ?> oo00000o = OooO0O0.get(i);
            if (oo00000o.OooO00o(a)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i);
                    z = false;
                }
                emptyList.add(oo00000o);
            }
        }
        return emptyList;
    }

    public synchronized <Model, Data> AbstractC7770oO00000o<Model, Data> OooO00o(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        return this.f20803OooO00o.OooO00o((Class) cls, (Class) cls2);
    }

    @NonNull
    public synchronized List<Class<?>> OooO00o(@NonNull Class<?> cls) {
        return this.f20803OooO00o.OooO0O0(cls);
    }

    @NonNull
    public static <A> Class<A> OooO00o(@NonNull A a) {
        return (Class<A>) a.getClass();
    }
}
