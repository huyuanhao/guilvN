package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1i11  reason: case insensitive filesystem */
public class C6030i1i11 extends AbstractC5873LiliL1 {
    public final int OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;

    /* renamed from: com.pd.sdk.i1i11$OooO0O0 */
    public static class OooO0O0 {
        public final int OooO00o;
        public final int OooO0O0;
        public final int OooO0OO;
        public int OooO0Oo = 16;

        public OooO0O0(int i, int i2, int i3) {
            if (i <= 1 || !OooO00o(i)) {
                throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
            }
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.OooO0OO = i3;
        }

        public static boolean OooO00o(int i) {
            return (i & (i + -1)) == 0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooO0O0 m16883OooO00o(int i) {
            this.OooO0Oo = i;
            return this;
        }

        public C6030i1i11 OooO00o() {
            return new C6030i1i11(this);
        }
    }

    public C6030i1i11(OooO0O0 oooO0O0) {
        super(AbstractC5702Li111.Oooo0o0);
        this.OooO00o = oooO0O0.OooO00o;
        this.OooO0O0 = oooO0O0.OooO0O0;
        this.OooO0OO = oooO0O0.OooO0OO;
        this.OooO0Oo = oooO0O0.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC5873LiliL1
    public int OooO00o() {
        return this.OooO0O0;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    public int OooO0OO() {
        return this.OooO0OO;
    }

    public int OooO0Oo() {
        return this.OooO0Oo;
    }
}
