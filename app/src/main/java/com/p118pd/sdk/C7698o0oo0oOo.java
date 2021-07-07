package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.p118pd.sdk.C8953ooOOOoO0;

/* renamed from: com.pd.sdk.o0oo0oOo  reason: case insensitive filesystem */
public final class C7698o0oo0oOo<Z> implements AbstractC7700o0oo0oo0<Z>, C8953ooOOOoO0.OooO0o {
    public static final Pools.OooO00o<C7698o0oo0oOo<?>> OooO00o = C8953ooOOOoO0.OooO0O0(20, new OooO00o());

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7700o0oo0oo0<Z> f20640OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final oO0O0O0o f20641OooO00o = oO0O0O0o.OooO00o();
    public boolean OooO0O0;
    public boolean OooO0OO;

    /* renamed from: com.pd.sdk.o0oo0oOo$OooO00o */
    public class OooO00o implements C8953ooOOOoO0.AbstractC8954OooO0Oo<C7698o0oo0oOo<?>> {
        @Override // com.p118pd.sdk.C8953ooOOOoO0.AbstractC8954OooO0Oo
        public C7698o0oo0oOo<?> OooO00o() {
            return new C7698o0oo0oOo<>();
        }
    }

    @NonNull
    public static <Z> C7698o0oo0oOo<Z> OooO00o(AbstractC7700o0oo0oo0<Z> o0oo0oo0) {
        C7698o0oo0oOo<Z> o0oo0ooo = (C7698o0oo0oOo) C7842oO0O0.OooO00o(OooO00o.acquire());
        o0oo0ooo.m19337OooO00o((AbstractC7700o0oo0oo0) o0oo0oo0);
        return o0oo0ooo;
    }

    private void OooO0O0() {
        this.f20640OooO00o = null;
        OooO00o.release(this);
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    public Z get() {
        return this.f20640OooO00o.get();
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0
    public synchronized void recycle() {
        this.f20641OooO00o.m19529OooO00o();
        this.OooO0OO = true;
        if (!this.OooO0O0) {
            this.f20640OooO00o.recycle();
            OooO0O0();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m19337OooO00o(AbstractC7700o0oo0oo0<Z> o0oo0oo0) {
        this.OooO0OO = false;
        this.OooO0O0 = true;
        this.f20640OooO00o = o0oo0oo0;
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o, com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized void m19340OooO00o() {
        this.f20641OooO00o.m19529OooO00o();
        if (this.OooO0O0) {
            this.OooO0O0 = false;
            if (this.OooO0OO) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o, com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<Z> m19339OooO00o() {
        return this.f20640OooO00o.m19341OooO00o();
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o, com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    public int OooO00o() {
        return this.f20640OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.C8953ooOOOoO0.OooO0o, com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public oO0O0O0o m19338OooO00o() {
        return this.f20641OooO00o;
    }
}
