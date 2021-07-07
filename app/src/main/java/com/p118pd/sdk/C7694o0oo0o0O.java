package com.p118pd.sdk;

import android.os.Looper;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o0oo0o0O  reason: case insensitive filesystem */
public class C7694o0oo0o0O<Z> implements AbstractC7700o0oo0oo0<Z> {
    public AbstractC7644o0oOoOO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f20635OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7700o0oo0oo0<Z> f20636OooO00o;
    public final boolean OooO0O0;
    public final boolean OooO0OO;
    public boolean OooO0Oo;
    public int o00oO0O;

    /* renamed from: com.pd.sdk.o0oo0o0O$OooO00o */
    public interface OooO00o {
        void OooO00o(AbstractC7644o0oOoOO o0ooooo, C7694o0oo0o0O<?> o0oo0o0o);
    }

    public C7694o0oo0o0O(AbstractC7700o0oo0oo0<Z> o0oo0oo0, boolean z, boolean z2) {
        this.f20636OooO00o = (AbstractC7700o0oo0oo0) C7842oO0O0.OooO00o(o0oo0oo0);
        this.OooO0O0 = z;
        this.OooO0OO = z2;
    }

    public void OooO00o(AbstractC7644o0oOoOO o0ooooo, OooO00o oooO00o) {
        this.OooO00o = o0ooooo;
        this.f20635OooO00o = oooO00o;
    }

    public void OooO0O0() {
        if (this.o00oO0O <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.o00oO0O - 1;
            this.o00oO0O = i;
            if (i == 0) {
                this.f20635OooO00o.OooO00o(this.OooO00o, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    public Z get() {
        return this.f20636OooO00o.get();
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0
    public void recycle() {
        if (this.o00oO0O > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.OooO0Oo) {
            this.OooO0Oo = true;
            if (this.OooO0OO) {
                this.f20636OooO00o.recycle();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public String toString() {
        return "EngineResource{isCacheable=" + this.OooO0O0 + ", listener=" + this.f20635OooO00o + ", key=" + this.OooO00o + ", acquired=" + this.o00oO0O + ", isRecycled=" + this.OooO0Oo + ", resource=" + this.f20636OooO00o + '}';
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7700o0oo0oo0<Z> m19333OooO00o() {
        return this.f20636OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19336OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<Z> m19334OooO00o() {
        return this.f20636OooO00o.m19341OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    public int OooO00o() {
        return this.f20636OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19335OooO00o() {
        if (this.OooO0Oo) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.o00oO0O++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }
}
