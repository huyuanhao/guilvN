package com.p118pd.sdk;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: com.pd.sdk.ooOO0oo0  reason: case insensitive filesystem */
public class C8920ooOO0oo0 implements AbstractC8918ooOO0oOo {
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, Long> f22157OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ExecutorService f22158OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Future<?> f22159OooO00o;

    @Override // com.p118pd.sdk.AbstractC8918ooOO0oOo
    public void OooO00o(Context context, String str, Map<String, String> map) {
        OooO00o(new RunnableC8921ooOO0ooO(context, str, map));
    }

    @Override // com.p118pd.sdk.AbstractC8918ooOO0oOo
    public void OooO0O0(Context context, String str) {
        OooO00o(new RunnableC8921ooOO0ooO(context, str));
    }

    @Override // com.p118pd.sdk.AbstractC8918ooOO0oOo
    public void OooO00o(Context context, String str) {
        if (!this.f22157OooO00o.containsKey(str)) {
            this.f22157OooO00o.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.p118pd.sdk.AbstractC8918ooOO0oOo
    public void OooO0O0(Context context, String str, Map<String, String> map) {
        if (this.f22157OooO00o.containsKey(str)) {
            long currentTimeMillis = System.currentTimeMillis() - this.f22157OooO00o.get(str).longValue();
            this.OooO00o = currentTimeMillis;
            OooO00o(new RunnableC8921ooOO0ooO(context, str, currentTimeMillis, map));
            this.f22157OooO00o.remove(str);
        }
    }

    private synchronized void OooO00o(RunnableC8921ooOO0ooO oooo0ooo) {
        if (this.f22159OooO00o == null || this.f22159OooO00o.isDone()) {
            if (this.f22158OooO00o == null) {
                this.f22158OooO00o = Executors.newSingleThreadExecutor();
            }
            this.f22159OooO00o = this.f22158OooO00o.submit(oooo0ooo);
        }
    }
}
