package com.p118pd.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob;
import com.p118pd.sdk.AbstractC7734o0ooo00O;
import com.p118pd.sdk.AbstractC7745o0oooO0o;
import com.p118pd.sdk.C7694o0oo0o0O;
import com.p118pd.sdk.C8953ooOOOoO0;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.o0oo0Oo  reason: case insensitive filesystem */
public class C7687o0oo0Oo implements AbstractC7690o0oo0Ooo, AbstractC7745o0oooO0o.OooO00o, C7694o0oo0o0O.OooO00o {
    public static final int OooO00o = 150;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20596OooO00o = "Engine";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f20597OooO00o = Log.isLoggable(f20596OooO00o, 2);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7678o0oo0O0O f20598OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f20599OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f20600OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO f20601OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7692o0oo0o0 f20602OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7697o0oo0oO0 f20603OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7702o0oo0ooo f20604OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7745o0oooO0o f20605OooO00o;

    @VisibleForTesting
    /* renamed from: com.pd.sdk.o0oo0Oo$OooO00o */
    public static class OooO00o {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Pools.OooO00o<DecodeJob<?>> f20606OooO00o = C8953ooOOOoO0.OooO00o(150, new C4968OooO00o());

        /* renamed from: OooO00o  reason: collision with other field name */
        public final DecodeJob.AbstractC5098OooO0o0 f20607OooO00o;

        /* renamed from: com.pd.sdk.o0oo0Oo$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4968OooO00o implements C8953ooOOOoO0.AbstractC8954OooO0Oo<DecodeJob<?>> {
            public C4968OooO00o() {
            }

            @Override // com.p118pd.sdk.C8953ooOOOoO0.AbstractC8954OooO0Oo
            public DecodeJob<?> OooO00o() {
                OooO00o oooO00o = OooO00o.this;
                return new DecodeJob<>(oooO00o.f20607OooO00o, oooO00o.f20606OooO00o);
            }
        }

        public OooO00o(DecodeJob.AbstractC5098OooO0o0 oooO0o0) {
            this.f20607OooO00o = oooO0o0;
        }

        public <R> DecodeJob<R> OooO00o(C7607o0o0OoOO o0o0oooo, Object obj, C7693o0oo0o00 o0oo0o00, AbstractC7644o0oOoOO o0ooooo, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, AbstractC7684o0oo0OOo o0oo0ooo, Map<Class<?>, AbstractC7655o0oOoo0O<?>> map, boolean z, boolean z2, boolean z3, C7648o0oOoOo o0ooooo2, DecodeJob.OooO0O0<R> oooO0O0) {
            DecodeJob decodeJob = (DecodeJob) C7842oO0O0.OooO00o(this.f20606OooO00o.acquire());
            int i3 = this.OooO00o;
            this.OooO00o = i3 + 1;
            return decodeJob.OooO00o(o0o0oooo, obj, o0oo0o00, o0ooooo, i, i2, cls, cls2, priority, o0oo0ooo, map, z, z2, z3, o0ooooo2, oooO0O0, i3);
        }
    }

    /* renamed from: com.pd.sdk.o0oo0Oo$OooO0Oo  reason: case insensitive filesystem */
    public static class C7688OooO0Oo {
        public final C7689o0oo0OoO<?> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC7812oO00o f20611OooO00o;

        public C7688OooO0Oo(AbstractC7812oO00o oo00o, C7689o0oo0OoO<?> o0oo0ooo) {
            this.f20611OooO00o = oo00o;
            this.OooO00o = o0oo0ooo;
        }

        public void OooO00o() {
            this.OooO00o.OooO0O0(this.f20611OooO00o);
        }
    }

    public C7687o0oo0Oo(AbstractC7745o0oooO0o o0oooo0o, AbstractC7734o0ooo00O.OooO00o oooO00o, ExecutorServiceC7746o0oooOO o0ooooo, ExecutorServiceC7746o0oooOO o0ooooo2, ExecutorServiceC7746o0oooOO o0ooooo3, ExecutorServiceC7746o0oooOO o0ooooo4, boolean z) {
        this(o0oooo0o, oooO00o, o0ooooo, o0ooooo2, o0ooooo3, o0ooooo4, null, null, null, null, null, null, z);
    }

    private C7694o0oo0o0O<?> OooO0O0(AbstractC7644o0oOoOO o0ooooo, boolean z) {
        if (!z) {
            return null;
        }
        C7694o0oo0o0O<?> OooO00o2 = OooO00o(o0ooooo);
        if (OooO00o2 != null) {
            OooO00o2.m19335OooO00o();
            this.f20598OooO00o.OooO00o(o0ooooo, OooO00o2);
        }
        return OooO00o2;
    }

    public <R> C7688OooO0Oo OooO00o(C7607o0o0OoOO o0o0oooo, Object obj, AbstractC7644o0oOoOO o0ooooo, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, AbstractC7684o0oo0OOo o0oo0ooo, Map<Class<?>, AbstractC7655o0oOoo0O<?>> map, boolean z, boolean z2, C7648o0oOoOo o0ooooo2, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC7812oO00o oo00o) {
        oO0O0O00.OooO0O0();
        long OooO00o2 = f20597OooO00o ? C7843oO0O00o.OooO00o() : 0;
        C7693o0oo0o00 OooO00o3 = this.f20602OooO00o.OooO00o(obj, o0ooooo, i, i2, map, cls, cls2, o0ooooo2);
        C7694o0oo0o0O<?> OooO00o4 = OooO00o(OooO00o3, z3);
        if (OooO00o4 != null) {
            oo00o.OooO00o(OooO00o4, DataSource.MEMORY_CACHE);
            if (f20597OooO00o) {
                OooO00o("Loaded resource from active resources", OooO00o2, OooO00o3);
            }
            return null;
        }
        C7694o0oo0o0O<?> OooO0O02 = OooO0O0(OooO00o3, z3);
        if (OooO0O02 != null) {
            oo00o.OooO00o(OooO0O02, DataSource.MEMORY_CACHE);
            if (f20597OooO00o) {
                OooO00o("Loaded resource from cache", OooO00o2, OooO00o3);
            }
            return null;
        }
        C7689o0oo0OoO<?> OooO00o5 = this.f20603OooO00o.OooO00o(OooO00o3, z6);
        if (OooO00o5 != null) {
            OooO00o5.m19330OooO00o(oo00o);
            if (f20597OooO00o) {
                OooO00o("Added to existing load", OooO00o2, OooO00o3);
            }
            return new C7688OooO0Oo(oo00o, OooO00o5);
        }
        C7689o0oo0OoO<R> OooO00o6 = this.f20600OooO00o.OooO00o(OooO00o3, z3, z4, z5, z6);
        DecodeJob<R> OooO00o7 = this.f20599OooO00o.OooO00o(o0o0oooo, obj, OooO00o3, o0ooooo, i, i2, cls, cls2, priority, o0oo0ooo, map, z, z2, z6, o0ooooo2, OooO00o6);
        this.f20603OooO00o.OooO00o((AbstractC7644o0oOoOO) OooO00o3, (C7689o0oo0OoO<?>) OooO00o6);
        OooO00o6.m19330OooO00o(oo00o);
        OooO00o6.OooO0O0(OooO00o7);
        if (f20597OooO00o) {
            OooO00o("Started new load", OooO00o2, OooO00o3);
        }
        return new C7688OooO0Oo(oo00o, OooO00o6);
    }

    @VisibleForTesting
    public C7687o0oo0Oo(AbstractC7745o0oooO0o o0oooo0o, AbstractC7734o0ooo00O.OooO00o oooO00o, ExecutorServiceC7746o0oooOO o0ooooo, ExecutorServiceC7746o0oooOO o0ooooo2, ExecutorServiceC7746o0oooOO o0ooooo3, ExecutorServiceC7746o0oooOO o0ooooo4, C7697o0oo0oO0 o0oo0oo0, C7692o0oo0o0 o0oo0o0, C7678o0oo0O0O o0oo0o0o, OooO0O0 oooO0O0, OooO00o oooO00o2, C7702o0oo0ooo o0oo0ooo, boolean z) {
        this.f20605OooO00o = o0oooo0o;
        this.f20601OooO00o = new OooO0OO(oooO00o);
        C7678o0oo0O0O o0oo0o0o2 = o0oo0o0o == null ? new C7678o0oo0O0O(z) : o0oo0o0o;
        this.f20598OooO00o = o0oo0o0o2;
        o0oo0o0o2.OooO00o(this);
        this.f20602OooO00o = o0oo0o0 == null ? new C7692o0oo0o0() : o0oo0o0;
        this.f20603OooO00o = o0oo0oo0 == null ? new C7697o0oo0oO0() : o0oo0oo0;
        this.f20600OooO00o = oooO0O0 == null ? new OooO0O0(o0ooooo, o0ooooo2, o0ooooo3, o0ooooo4, this) : oooO0O0;
        this.f20599OooO00o = oooO00o2 == null ? new OooO00o(this.f20601OooO00o) : oooO00o2;
        this.f20604OooO00o = o0oo0ooo == null ? new C7702o0oo0ooo() : o0oo0ooo;
        o0oooo0o.OooO00o(this);
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.o0oo0Oo$OooO0O0 */
    public static class OooO0O0 {
        public final Pools.OooO00o<C7689o0oo0OoO<?>> OooO00o = C8953ooOOOoO0.OooO00o(150, new OooO00o());

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC7690o0oo0Ooo f20608OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ExecutorServiceC7746o0oooOO f20609OooO00o;
        public final ExecutorServiceC7746o0oooOO OooO0O0;
        public final ExecutorServiceC7746o0oooOO OooO0OO;
        public final ExecutorServiceC7746o0oooOO OooO0Oo;

        /* renamed from: com.pd.sdk.o0oo0Oo$OooO0O0$OooO00o */
        public class OooO00o implements C8953ooOOOoO0.AbstractC8954OooO0Oo<C7689o0oo0OoO<?>> {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.C8953ooOOOoO0.AbstractC8954OooO0Oo
            public C7689o0oo0OoO<?> OooO00o() {
                OooO0O0 oooO0O0 = OooO0O0.this;
                return new C7689o0oo0OoO<>(oooO0O0.f20609OooO00o, oooO0O0.OooO0O0, oooO0O0.OooO0OO, oooO0O0.OooO0Oo, oooO0O0.f20608OooO00o, oooO0O0.OooO00o);
            }
        }

        public OooO0O0(ExecutorServiceC7746o0oooOO o0ooooo, ExecutorServiceC7746o0oooOO o0ooooo2, ExecutorServiceC7746o0oooOO o0ooooo3, ExecutorServiceC7746o0oooOO o0ooooo4, AbstractC7690o0oo0Ooo o0oo0ooo) {
            this.f20609OooO00o = o0ooooo;
            this.OooO0O0 = o0ooooo2;
            this.OooO0OO = o0ooooo3;
            this.OooO0Oo = o0ooooo4;
            this.f20608OooO00o = o0oo0ooo;
        }

        @VisibleForTesting
        public void OooO00o() {
            OooO00o(this.f20609OooO00o);
            OooO00o(this.OooO0O0);
            OooO00o(this.OooO0OO);
            OooO00o(this.OooO0Oo);
        }

        public <R> C7689o0oo0OoO<R> OooO00o(AbstractC7644o0oOoOO o0ooooo, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C7689o0oo0OoO) C7842oO0O0.OooO00o(this.OooO00o.acquire())).OooO00o(o0ooooo, z, z2, z3, z4);
        }

        public static void OooO00o(ExecutorService executorService) {
            executorService.shutdown();
            try {
                if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                    executorService.shutdownNow();
                    if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                        throw new RuntimeException("Failed to shutdown");
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.pd.sdk.o0oo0Oo$OooO0OO */
    public static class OooO0OO implements DecodeJob.AbstractC5098OooO0o0 {
        public final AbstractC7734o0ooo00O.OooO00o OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile AbstractC7734o0ooo00O f20610OooO00o;

        public OooO0OO(AbstractC7734o0ooo00O.OooO00o oooO00o) {
            this.OooO00o = oooO00o;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.AbstractC5098OooO0o0
        @VisibleForTesting
        /* renamed from: OooO00o  reason: collision with other method in class */
        public synchronized void m19327OooO00o() {
            if (this.f20610OooO00o != null) {
                this.f20610OooO00o.clear();
            }
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.AbstractC5098OooO0o0
        public AbstractC7734o0ooo00O OooO00o() {
            if (this.f20610OooO00o == null) {
                synchronized (this) {
                    if (this.f20610OooO00o == null) {
                        this.f20610OooO00o = this.OooO00o.OooO00o();
                    }
                    if (this.f20610OooO00o == null) {
                        this.f20610OooO00o = new C7735o0ooo00o();
                    }
                }
            }
            return this.f20610OooO00o;
        }
    }

    public void OooO0O0(AbstractC7700o0oo0oo0<?> o0oo0oo0) {
        oO0O0O00.OooO0O0();
        if (o0oo0oo0 instanceof C7694o0oo0o0O) {
            ((C7694o0oo0o0O) o0oo0oo0).OooO0O0();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @VisibleForTesting
    public void OooO0O0() {
        this.f20600OooO00o.OooO00o();
        this.f20601OooO00o.m19327OooO00o();
        this.f20598OooO00o.OooO0O0();
    }

    public static void OooO00o(String str, long j, AbstractC7644o0oOoOO o0ooooo) {
        String str2 = str + " in " + C7843oO0O00o.OooO00o(j) + "ms, key: " + o0ooooo;
    }

    @Nullable
    private C7694o0oo0o0O<?> OooO00o(AbstractC7644o0oOoOO o0ooooo, boolean z) {
        if (!z) {
            return null;
        }
        C7694o0oo0o0O<?> OooO00o2 = this.f20598OooO00o.OooO00o(o0ooooo);
        if (OooO00o2 != null) {
            OooO00o2.m19335OooO00o();
        }
        return OooO00o2;
    }

    private C7694o0oo0o0O<?> OooO00o(AbstractC7644o0oOoOO o0ooooo) {
        AbstractC7700o0oo0oo0<?> OooO00o2 = this.f20605OooO00o.OooO00o(o0ooooo);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2 instanceof C7694o0oo0o0O) {
            return (C7694o0oo0o0O) OooO00o2;
        }
        return new C7694o0oo0o0O<>(OooO00o2, true, true);
    }

    @Override // com.p118pd.sdk.AbstractC7690o0oo0Ooo
    public void OooO00o(C7689o0oo0OoO<?> o0oo0ooo, AbstractC7644o0oOoOO o0ooooo, C7694o0oo0o0O<?> o0oo0o0o) {
        oO0O0O00.OooO0O0();
        if (o0oo0o0o != null) {
            o0oo0o0o.OooO00o(o0ooooo, this);
            if (o0oo0o0o.m19336OooO00o()) {
                this.f20598OooO00o.OooO00o(o0ooooo, o0oo0o0o);
            }
        }
        this.f20603OooO00o.OooO0O0(o0ooooo, o0oo0ooo);
    }

    @Override // com.p118pd.sdk.AbstractC7690o0oo0Ooo
    public void OooO00o(C7689o0oo0OoO<?> o0oo0ooo, AbstractC7644o0oOoOO o0ooooo) {
        oO0O0O00.OooO0O0();
        this.f20603OooO00o.OooO0O0(o0ooooo, o0oo0ooo);
    }

    @Override // com.p118pd.sdk.AbstractC7745o0oooO0o.OooO00o
    public void OooO00o(@NonNull AbstractC7700o0oo0oo0<?> o0oo0oo0) {
        oO0O0O00.OooO0O0();
        this.f20604OooO00o.OooO00o(o0oo0oo0);
    }

    @Override // com.p118pd.sdk.C7694o0oo0o0O.OooO00o
    public void OooO00o(AbstractC7644o0oOoOO o0ooooo, C7694o0oo0o0O<?> o0oo0o0o) {
        oO0O0O00.OooO0O0();
        this.f20598OooO00o.m19311OooO00o(o0ooooo);
        if (o0oo0o0o.m19336OooO00o()) {
            this.f20605OooO00o.OooO00o(o0ooooo, o0oo0o0o);
        } else {
            this.f20604OooO00o.OooO00o(o0oo0o0o);
        }
    }

    public void OooO00o() {
        this.f20601OooO00o.OooO00o().clear();
    }
}
