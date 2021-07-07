package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oOoo0oOO  reason: case insensitive filesystem */
public class RunnableC8421oOoo0oOO implements Runnable {
    public AbstractC8437oOooO0oO OooO00o;
    public int o00oO0O;

    public RunnableC8421oOoo0oOO(AbstractC8437oOooO0oO ooooo0oo, int i) {
        this.OooO00o = ooooo0oo;
        this.o00oO0O = i;
    }

    public void run() {
        AbstractC8437oOooO0oO ooooo0oo = this.OooO00o;
        if (ooooo0oo != null) {
            ooooo0oo.onResult(this.o00oO0O);
        }
    }
}
