package com.p118pd.sdk;

import android.text.TextUtils;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.session.C0163b;
import anet.channel.util.StringUtils;

/* renamed from: com.pd.sdk.o0OO0oO0 */
public class o0OO0oO0 implements AbstractRunnableC7374o0OO0o0O {
    public volatile Cancelable OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Request f20131OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7360o0OO f20132OooO00o;
    public volatile boolean OooO0O0 = false;
    public int o00oO0O = 0;
    public int o0ooOO0 = 0;

    public o0OO0oO0(C7360o0OO o0oo) {
        this.f20132OooO00o = o0oo;
        this.f20131OooO00o = o0oo.f20099OooO00o.m19127OooO00o();
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        this.OooO0O0 = true;
        if (this.OooO00o != null) {
            this.OooO00o.cancel();
        }
    }

    public void run() {
        if (!this.OooO0O0) {
            if (this.f20132OooO00o.f20099OooO00o.OooO0Oo()) {
                String OooO00o2 = C7354o0O0ooO0.OooO00o(this.f20132OooO00o.f20099OooO00o.m19129OooO00o());
                if (!TextUtils.isEmpty(OooO00o2)) {
                    Request.Builder newBuilder = this.f20131OooO00o.newBuilder();
                    String str = this.f20131OooO00o.getHeaders().get("Cookie");
                    if (!TextUtils.isEmpty(str)) {
                        OooO00o2 = StringUtils.concatString(str, "; ", OooO00o2);
                    }
                    newBuilder.addHeader("Cookie", OooO00o2);
                    this.f20131OooO00o = newBuilder.build();
                }
            }
            this.f20131OooO00o.f219a.degraded = 2;
            this.f20131OooO00o.f219a.sendBeforeTime = System.currentTimeMillis() - this.f20131OooO00o.f219a.reqStart;
            C0163b.m173a(this.f20131OooO00o, new C7376o0OO0oO(this));
        }
    }
}
