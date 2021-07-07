package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oOoo0oOo  reason: case insensitive filesystem */
public class RunnableC8422oOoo0oOo<R> implements Runnable {
    public AbstractC8438oOooO0oo<R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public R f21564OooO00o;
    public int o00oO0O;

    public RunnableC8422oOoo0oOo(AbstractC8438oOooO0oo<R> ooooo0oo, int i, R r) {
        this.OooO00o = ooooo0oo;
        this.o00oO0O = i;
        this.f21564OooO00o = r;
    }

    public void run() {
        AbstractC8438oOooO0oo<R> ooooo0oo = this.OooO00o;
        if (ooooo0oo != null) {
            ooooo0oo.OooO00o(this.o00oO0O, this.f21564OooO00o);
        }
    }
}
