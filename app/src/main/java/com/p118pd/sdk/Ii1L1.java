package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ii1L1 */
public class Ii1L1 implements AbstractC6370iIIIl {
    public final C6512lIilLl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9738llL1L f15669OooO00o;
    public final C6512lIilLl OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final AbstractC9738llL1L f15670OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final boolean f15671OooO0O0;

    public Ii1L1(boolean z, C6512lIilLl r4, C6512lIilLl r5) {
        if (r4 == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        } else if (r5 != null) {
            C5600L1iLL OooO00o2 = r4.OooO00o();
            if (OooO00o2.equals(r5.OooO00o())) {
                this.f15671OooO0O0 = z;
                this.OooO00o = r4;
                this.f15669OooO00o = OooO00o2.m16003OooO00o().OooO00o(r4.OooO00o()).OooO0Oo();
                this.OooO0O0 = r5;
                this.f15670OooO0O0 = OooO00o2.m16003OooO00o().OooO00o(r5.OooO00o()).OooO0Oo();
                return;
            }
            throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
        } else {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
    }

    public C6512lIilLl OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m15552OooO00o() {
        return this.f15670OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15553OooO00o() {
        return this.f15671OooO0O0;
    }

    public C6512lIilLl OooO0O0() {
        return this.OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC9738llL1L m15554OooO0O0() {
        return this.f15669OooO00o;
    }
}
