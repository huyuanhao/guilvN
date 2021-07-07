package com.p118pd.sdk;

import java.io.InputStream;

/* renamed from: com.pd.sdk.LL1L */
public class LL1L {
    public final C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f16399OooO00o;

    public LL1L(AbstractC5475Illli r2) {
        this.OooO00o = r2.OooO00o();
        this.f16399OooO00o = r2;
    }

    public LL1L(AbstractC6296il1il1 il1il1) {
        this.OooO00o = il1il1.m17321OooO00o();
        this.f16399OooO00o = il1il1;
    }

    public InputStream OooO00o(InputStream inputStream) {
        Object obj = this.f16399OooO00o;
        return obj instanceof AbstractC5475Illli ? ((AbstractC5475Illli) obj).OooO00o(inputStream) : new LllI11(inputStream, ((AbstractC6296il1il1) this.f16399OooO00o).m17322OooO00o());
    }

    public boolean OooO00o() {
        return this.f16399OooO00o instanceof AbstractC6296il1il1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16171OooO00o() {
        return ((AbstractC6296il1il1) this.f16399OooO00o).m17323OooO00o();
    }
}
