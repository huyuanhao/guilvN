package com.p118pd.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p118pd.sdk.AbstractC7734o0ooo00O;
import com.p118pd.sdk.C7741o0oooO;
import com.p118pd.sdk.C7815oO00o000;
import java.util.Map;

/* renamed from: com.pd.sdk.o0o0OoO  reason: case insensitive filesystem */
public final class C7605o0o0OoO {
    public int OooO00o = 4;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7687o0oo0Oo f20443OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7707o0ooO00O f20444OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7711o0ooO0OO f20445OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7734o0ooo00O.OooO00o f20446OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7745o0oooO0o f20447OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7741o0oooO f20448OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ExecutorServiceC7746o0oooOO f20449OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7807oO00OoOO f20450OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7815oO00o000.OooO0O0 f20451OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7824oO00o0oo f20452OooO00o = new C7824oO00o0oo();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<Class<?>, AbstractC7623o0oOOoOo<?, ?>> f20453OooO00o = new C6971o0000oO0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20454OooO00o;
    public ExecutorServiceC7746o0oooOO OooO0O0;
    public ExecutorServiceC7746o0oooOO OooO0OO;

    @NonNull
    public C7605o0o0OoO OooO00o(@Nullable AbstractC7711o0ooO0OO o0ooo0oo) {
        this.f20445OooO00o = o0ooo0oo;
        return this;
    }

    @NonNull
    public C7605o0o0OoO OooO0O0(@Nullable ExecutorServiceC7746o0oooOO o0ooooo) {
        this.OooO0O0 = o0ooooo;
        return this;
    }

    @Deprecated
    public C7605o0o0OoO OooO0OO(@Nullable ExecutorServiceC7746o0oooOO o0ooooo) {
        return OooO0Oo(o0ooooo);
    }

    @NonNull
    public C7605o0o0OoO OooO0Oo(@Nullable ExecutorServiceC7746o0oooOO o0ooooo) {
        this.f20449OooO00o = o0ooooo;
        return this;
    }

    @NonNull
    public C7605o0o0OoO OooO00o(@Nullable AbstractC7707o0ooO00O o0ooo00o) {
        this.f20444OooO00o = o0ooo00o;
        return this;
    }

    @NonNull
    public C7605o0o0OoO OooO00o(@Nullable AbstractC7745o0oooO0o o0oooo0o) {
        this.f20447OooO00o = o0oooo0o;
        return this;
    }

    @NonNull
    public C7605o0o0OoO OooO00o(@Nullable AbstractC7734o0ooo00O.OooO00o oooO00o) {
        this.f20446OooO00o = oooO00o;
        return this;
    }

    @NonNull
    public C7605o0o0OoO OooO00o(@Nullable ExecutorServiceC7746o0oooOO o0ooooo) {
        this.OooO0OO = o0ooooo;
        return this;
    }

    @NonNull
    public C7605o0o0OoO OooO00o(@Nullable C7824oO00o0oo oo00o0oo) {
        this.f20452OooO00o = oo00o0oo;
        return this;
    }

    @NonNull
    public <T> C7605o0o0OoO OooO00o(@NonNull Class<T> cls, @Nullable AbstractC7623o0oOOoOo<?, T> o0oooooo) {
        this.f20453OooO00o.put(cls, o0oooooo);
        return this;
    }

    @NonNull
    public C7605o0o0OoO OooO00o(@NonNull C7741o0oooO.OooO00o oooO00o) {
        return OooO00o(oooO00o.OooO00o());
    }

    @NonNull
    public C7605o0o0OoO OooO00o(@Nullable C7741o0oooO o0oooo) {
        this.f20448OooO00o = o0oooo;
        return this;
    }

    @NonNull
    public C7605o0o0OoO OooO00o(@Nullable AbstractC7807oO00OoOO oo00oooo) {
        this.f20450OooO00o = oo00oooo;
        return this;
    }

    @NonNull
    public C7605o0o0OoO OooO00o(int i) {
        if (i < 2 || i > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.OooO00o = i;
        return this;
    }

    @NonNull
    public C7605o0o0OoO OooO00o(boolean z) {
        this.f20454OooO00o = z;
        return this;
    }

    public void OooO00o(@Nullable C7815oO00o000.OooO0O0 oooO0O0) {
        this.f20451OooO00o = oooO0O0;
    }

    public C7605o0o0OoO OooO00o(C7687o0oo0Oo o0oo0oo) {
        this.f20443OooO00o = o0oo0oo;
        return this;
    }

    @NonNull
    public ComponentCallbacks2C7604o0o0Oo0o OooO00o(@NonNull Context context) {
        if (this.f20449OooO00o == null) {
            this.f20449OooO00o = ExecutorServiceC7746o0oooOO.OooO0OO();
        }
        if (this.OooO0O0 == null) {
            this.OooO0O0 = ExecutorServiceC7746o0oooOO.OooO0O0();
        }
        if (this.OooO0OO == null) {
            this.OooO0OO = ExecutorServiceC7746o0oooOO.m19393OooO00o();
        }
        if (this.f20448OooO00o == null) {
            this.f20448OooO00o = new C7741o0oooO.OooO00o(context).OooO00o();
        }
        if (this.f20450OooO00o == null) {
            this.f20450OooO00o = new C7808oO00OoOo();
        }
        if (this.f20445OooO00o == null) {
            int OooO0O02 = this.f20448OooO00o.OooO0O0();
            if (OooO0O02 > 0) {
                this.f20445OooO00o = new C7720o0ooOO0O((long) OooO0O02);
            } else {
                this.f20445OooO00o = new C7712o0ooO0Oo();
            }
        }
        if (this.f20444OooO00o == null) {
            this.f20444OooO00o = new C7716o0ooO0oo(this.f20448OooO00o.OooO00o());
        }
        if (this.f20447OooO00o == null) {
            this.f20447OooO00o = new C7742o0oooO0((long) this.f20448OooO00o.OooO0OO());
        }
        if (this.f20446OooO00o == null) {
            this.f20446OooO00o = new C7743o0oooO00(context);
        }
        if (this.f20443OooO00o == null) {
            this.f20443OooO00o = new C7687o0oo0Oo(this.f20447OooO00o, this.f20446OooO00o, this.OooO0O0, this.f20449OooO00o, ExecutorServiceC7746o0oooOO.OooO0Oo(), ExecutorServiceC7746o0oooOO.m19393OooO00o(), this.f20454OooO00o);
        }
        return new ComponentCallbacks2C7604o0o0Oo0o(context, this.f20443OooO00o, this.f20447OooO00o, this.f20445OooO00o, this.f20444OooO00o, new C7815oO00o000(this.f20451OooO00o), this.f20450OooO00o, this.OooO00o, this.f20452OooO00o.lock(), this.f20453OooO00o);
    }
}
