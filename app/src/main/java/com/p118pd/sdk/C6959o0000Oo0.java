package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0000Oo0  reason: case insensitive filesystem */
public class C6959o0000Oo0 extends AbstractC6960o0000OoO {
    public static volatile C6959o0000Oo0 OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Executor f19156OooO00o = new OooO00o();
    @NonNull
    public static final Executor OooO0O0 = new OooO0O0();
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6960o0000OoO f19157OooO00o;
    @NonNull

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AbstractC6960o0000OoO f19158OooO0O0;

    /* renamed from: com.pd.sdk.o0000Oo0$OooO00o */
    public static class OooO00o implements Executor {
        public void execute(Runnable runnable) {
            C6959o0000Oo0.OooO00o().OooO0OO(runnable);
        }
    }

    /* renamed from: com.pd.sdk.o0000Oo0$OooO0O0 */
    public static class OooO0O0 implements Executor {
        public void execute(Runnable runnable) {
            C6959o0000Oo0.OooO00o().OooO00o(runnable);
        }
    }

    public C6959o0000Oo0() {
        C6958o0000Oo o0000oo = new C6958o0000Oo();
        this.f19158OooO0O0 = o0000oo;
        this.f19157OooO00o = o0000oo;
    }

    @NonNull
    public static C6959o0000Oo0 OooO00o() {
        if (OooO00o != null) {
            return OooO00o;
        }
        synchronized (C6959o0000Oo0.class) {
            if (OooO00o == null) {
                OooO00o = new C6959o0000Oo0();
            }
        }
        return OooO00o;
    }

    @NonNull
    public static Executor OooO0O0() {
        return f19156OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6960o0000OoO
    public void OooO0OO(Runnable runnable) {
        this.f19157OooO00o.OooO0OO(runnable);
    }

    public void OooO00o(@Nullable AbstractC6960o0000OoO o0000ooo) {
        if (o0000ooo == null) {
            o0000ooo = this.f19158OooO0O0;
        }
        this.f19157OooO00o = o0000ooo;
    }

    @Override // com.p118pd.sdk.AbstractC6960o0000OoO
    public void OooO00o(Runnable runnable) {
        this.f19157OooO00o.OooO00o(runnable);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Executor m18148OooO00o() {
        return OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6960o0000OoO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18149OooO00o() {
        return this.f19157OooO00o.OooO00o();
    }
}
