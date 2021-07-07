package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.C7505o0OoOoOO;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.pd.sdk.o0O0000O */
public final class o0O0000O<T> {
    @NonNull
    public final C7505o0OoOoOO.AbstractC7506OooO0Oo<T> OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Executor f19831OooO00o;
    @NonNull
    public final Executor OooO0O0;

    /* renamed from: com.pd.sdk.o0O0000O$OooO00o */
    public static final class OooO00o<T> {
        public static final Object OooO00o = new Object();
        public static Executor OooO0OO;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C7505o0OoOoOO.AbstractC7506OooO0Oo<T> f19832OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Executor f19833OooO00o;
        public Executor OooO0O0;

        public OooO00o(@NonNull C7505o0OoOoOO.AbstractC7506OooO0Oo<T> oooO0Oo) {
            this.f19832OooO00o = oooO0Oo;
        }

        @NonNull
        public OooO00o<T> OooO00o(Executor executor) {
            this.OooO0O0 = executor;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OooO00o<T> OooO0O0(Executor executor) {
            this.f19833OooO00o = executor;
            return this;
        }

        @NonNull
        public o0O0000O<T> OooO00o() {
            if (this.OooO0O0 == null) {
                synchronized (OooO00o) {
                    if (OooO0OO == null) {
                        OooO0OO = Executors.newFixedThreadPool(2);
                    }
                }
                this.OooO0O0 = OooO0OO;
            }
            return new o0O0000O<>(this.f19833OooO00o, this.OooO0O0, this.f19832OooO00o);
        }
    }

    public o0O0000O(@NonNull Executor executor, @NonNull Executor executor2, @NonNull C7505o0OoOoOO.AbstractC7506OooO0Oo<T> oooO0Oo) {
        this.f19831OooO00o = executor;
        this.OooO0O0 = executor2;
        this.OooO00o = oooO0Oo;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Executor m18731OooO00o() {
        return this.OooO0O0;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Executor OooO0O0() {
        return this.f19831OooO00o;
    }

    @NonNull
    public C7505o0OoOoOO.AbstractC7506OooO0Oo<T> OooO00o() {
        return this.OooO00o;
    }
}
