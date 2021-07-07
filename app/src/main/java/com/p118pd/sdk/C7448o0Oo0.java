package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0Oo0  reason: case insensitive filesystem */
public final class C7448o0Oo0 extends AbstractC7453o0Oo00oo {
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 4;
    public static final int OooO0Oo = 8;
    public static final int OooO0o = 32;
    public static final int OooO0o0 = 16;
    public static final int OooO0oO = 64;

    public C7448o0Oo0() {
        OooO00o(88, true);
    }

    public C7448o0Oo0 OooO00o(boolean z) {
        OooO00o(16, z);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    public String OooO00o(int i) {
        if (i == 1) {
            return "REQUIRE_XMP_META";
        }
        if (i == 4) {
            return "STRICT_ALIASING";
        }
        if (i == 8) {
            return "FIX_CONTROL_CHARS";
        }
        if (i == 16) {
            return "ACCEPT_LATIN_1";
        }
        if (i == 32) {
            return "OMIT_NORMALIZATION";
        }
        if (i != 64) {
            return null;
        }
        return "DISALLOW_DOCTYPE";
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    public boolean OooO00o() {
        return m19080OooO0OO(16);
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo
    public int OooO0O0() {
        return C7531o0Oooo0o.OooO0O0;
    }

    public C7448o0Oo0 OooO0O0(boolean z) {
        OooO00o(64, z);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19067OooO0O0() {
        return m19080OooO0OO(64);
    }

    public C7448o0Oo0 OooO0OO(boolean z) {
        OooO00o(8, z);
        return this;
    }

    public boolean OooO0OO() {
        return m19080OooO0OO(8);
    }

    public C7448o0Oo0 OooO0Oo(boolean z) {
        OooO00o(32, z);
        return this;
    }

    public boolean OooO0Oo() {
        return m19080OooO0OO(32);
    }

    public C7448o0Oo0 OooO0o(boolean z) {
        OooO00o(4, z);
        return this;
    }

    public boolean OooO0o() {
        return m19080OooO0OO(4);
    }

    public C7448o0Oo0 OooO0o0(boolean z) {
        OooO00o(1, z);
        return this;
    }

    public boolean OooO0o0() {
        return m19080OooO0OO(1);
    }
}
