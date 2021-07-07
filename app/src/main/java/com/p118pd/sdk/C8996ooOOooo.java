package com.p118pd.sdk;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* renamed from: com.pd.sdk.ooOOooo  reason: case insensitive filesystem */
public final class C8996ooOOooo extends CallAdapter.Factory {
    @Nullable
    public final LL1LL OooO00o;

    public C8996ooOOooo(@Nullable LL1LL ll1ll) {
        this.OooO00o = ll1ll;
    }

    public static C8996ooOOooo OooO00o() {
        return new C8996ooOOooo(null);
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != C9349III.class) {
            return null;
        }
        return new C8994ooOOooOO(CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type), this.OooO00o);
    }

    public static C8996ooOOooo OooO00o(LL1LL ll1ll) {
        if (ll1ll == null) {
            throw new NullPointerException("scheduler == null");
        } else if (ll1ll != null) {
            return new C8996ooOOooo(ll1ll);
        } else {
            throw new NullPointerException("observeScheduler == null");
        }
    }
}
