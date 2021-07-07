package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.i丨L丨li1  reason: invalid class name and case insensitive filesystem */
public final class C6388iLli1<T> implements C9349III.OooO00o<T> {
    public final Throwable OooO00o;

    public C6388iLli1(Throwable th) {
        this.OooO00o = th;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r2) {
        r2.onError(this.OooO00o);
    }
}
