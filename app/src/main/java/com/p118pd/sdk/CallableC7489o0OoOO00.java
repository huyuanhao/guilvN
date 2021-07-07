package com.p118pd.sdk;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.pd.sdk.o0OoOO00  reason: case insensitive filesystem */
public class CallableC7489o0OoOO00 implements Callable<String> {
    public final /* synthetic */ Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ C7476o0OoO f20326OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ HashMap f20327OooO00o;

    public CallableC7489o0OoOO00(C7476o0OoO o0ooo, Context context, HashMap hashMap) {
        this.f20326OooO00o = o0ooo;
        this.OooO00o = context;
        this.f20327OooO00o = hashMap;
    }

    /* renamed from: OooO00o */
    public String call() throws Exception {
        return this.f20326OooO00o.OooO00o(this.OooO00o, this.f20327OooO00o);
    }
}
