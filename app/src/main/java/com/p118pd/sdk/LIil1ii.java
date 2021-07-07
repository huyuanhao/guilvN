package com.p118pd.sdk;

import java.util.Date;

/* renamed from: com.pd.sdk.LIil1ii */
public class LIil1ii implements AbstractC6294il1LI {
    public LIiLLLiL OooO00o;

    public LIil1ii(LIiLLLiL lIiLLLiL) {
        this.OooO00o = lIiLLLiL;
    }

    public LIil1ii(Date date, int i) {
        this.OooO00o = new LIiLLLiL(new C9623il(date), LLl111.OooO00o(i));
    }

    public int OooO00o() {
        if (this.OooO00o.OooO00o() != null) {
            return this.OooO00o.OooO00o().OooO00o().intValue();
        }
        throw new IllegalStateException("attempt to get a reason where none is available");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m16099OooO00o() {
        return C5787LlL1.OooO00o(this.OooO00o.m16086OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16100OooO00o() {
        return this.OooO00o.OooO00o() != null;
    }
}
