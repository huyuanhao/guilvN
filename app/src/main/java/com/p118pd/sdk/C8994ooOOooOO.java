package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* renamed from: com.pd.sdk.ooOOooOO  reason: case insensitive filesystem */
public final class C8994ooOOooOO<R> implements CallAdapter<R, Object> {
    @Nullable
    public final LL1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Type f22304OooO00o;

    public C8994ooOOooOO(Type type, @Nullable LL1LL ll1ll) {
        this.f22304OooO00o = type;
        this.OooO00o = ll1ll;
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call<R> call) {
        C9349III OooO00o2 = C9349III.OooO00o((C9349III.OooO00o) new C8993ooOOooO0(new C8992ooOOooO(call)));
        LL1LL ll1ll = this.OooO00o;
        if (ll1ll != null) {
            OooO00o2 = OooO00o2.OooO0OO(ll1ll);
        }
        return OooO00o2.m21402OooO00o(C6342il11.OooO00o());
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.f22304OooO00o;
    }
}
