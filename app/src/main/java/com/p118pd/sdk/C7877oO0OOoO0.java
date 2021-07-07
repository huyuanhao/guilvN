package com.p118pd.sdk;

import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.oO0OOoO0  reason: case insensitive filesystem */
public class C7877oO0OOoO0<T> implements AbstractC7700o0oo0oo0<T> {
    public final T OooO00o;

    public C7877oO0OOoO0(@NonNull T t) {
        this.OooO00o = (T) C7842oO0O0.OooO00o((Object) t);
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    public final int OooO00o() {
        return 1;
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<T> m19566OooO00o() {
        return (Class<T>) this.OooO00o.getClass();
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    public final T get() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0
    public void recycle() {
    }
}
