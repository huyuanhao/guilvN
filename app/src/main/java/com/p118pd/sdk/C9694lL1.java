package com.p118pd.sdk;

import com.p118pd.sdk.III1lIi;

/* renamed from: com.pd.sdk.丨lL丨1  reason: invalid class name and case insensitive filesystem */
public final class C9694lL1 extends III1lIi {
    public static final int OooO0oO = 1;
    public final int OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;

    /* renamed from: com.pd.sdk.丨lL丨1$OooO0O0 */
    public static class OooO0O0 extends III1lIi.OooO00o<OooO0O0> {
        public int OooO0Oo = 0;
        public int OooO0o = 0;
        public int OooO0o0 = 0;

        public OooO0O0() {
            super(1);
        }

        /* Return type fixed from 'com.pd.sdk.III1lIi' to match base method */
        @Override // com.p118pd.sdk.III1lIi.OooO00o, com.p118pd.sdk.III1lIi.OooO00o
        public OooO0O0 OooO00o() {
            return new C9694lL1(this);
        }

        @Override // com.p118pd.sdk.III1lIi.OooO00o, com.p118pd.sdk.III1lIi.OooO00o
        public OooO0O0 OooO00o() {
            return this;
        }

        @Override // com.p118pd.sdk.III1lIi.OooO00o
        public OooO0O0 OooO00o(int i) {
            this.OooO0Oo = i;
            return this;
        }

        @Override // com.p118pd.sdk.III1lIi.OooO00o
        public OooO0O0 OooO0O0(int i) {
            this.OooO0o0 = i;
            return this;
        }

        public OooO0O0 OooO0OO(int i) {
            this.OooO0o = i;
            return this;
        }
    }

    public C9694lL1(OooO0O0 oooO0O0) {
        super(oooO0O0);
        this.OooO0Oo = oooO0O0.OooO0Oo;
        this.OooO0o0 = oooO0O0.OooO0o0;
        this.OooO0o = oooO0O0.OooO0o;
    }

    @Override // com.p118pd.sdk.III1lIi, com.p118pd.sdk.III1lIi, com.p118pd.sdk.III1lIi
    public byte[] OooO00o() {
        byte[] OooO00o2 = super.m15366OooO00o();
        AbstractC6464l1l.OooO00o(this.OooO0Oo, OooO00o2, 16);
        AbstractC6464l1l.OooO00o(this.OooO0o0, OooO00o2, 20);
        AbstractC6464l1l.OooO00o(this.OooO0o, OooO00o2, 24);
        return OooO00o2;
    }

    public int OooO0Oo() {
        return this.OooO0Oo;
    }

    public int OooO0o() {
        return this.OooO0o;
    }

    public int OooO0o0() {
        return this.OooO0o0;
    }
}
