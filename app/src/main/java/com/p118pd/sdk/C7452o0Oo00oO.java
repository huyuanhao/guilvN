package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0Oo00oO  reason: case insensitive filesystem */
public final class C7452o0Oo00oO extends AbstractC7453o0Oo00oo {
    public static final int OooO0O0 = 256;
    public static final int OooO0OO = 512;
    public static final int OooO0Oo = 1024;
    public static final int OooO0o0 = 4096;

    public C7452o0Oo00oO OooO00o(boolean z) {
        OooO00o(256, z);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    public String OooO00o(int i) {
        if (i == 256) {
            return "JUST_CHILDREN";
        }
        if (i == 512) {
            return "JUST_LEAFNODES";
        }
        if (i == 1024) {
            return "JUST_LEAFNAME";
        }
        if (i != 4096) {
            return null;
        }
        return "OMIT_QUALIFIERS";
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    public boolean OooO00o() {
        return m19080OooO0OO(256);
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo
    public int OooO0O0() {
        return 5888;
    }

    public C7452o0Oo00oO OooO0O0(boolean z) {
        OooO00o(1024, z);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19072OooO0O0() {
        return m19080OooO0OO(1024);
    }

    public C7452o0Oo00oO OooO0OO(boolean z) {
        OooO00o(512, z);
        return this;
    }

    public boolean OooO0OO() {
        return m19080OooO0OO(512);
    }

    public C7452o0Oo00oO OooO0Oo(boolean z) {
        OooO00o(4096, z);
        return this;
    }

    public boolean OooO0Oo() {
        return m19080OooO0OO(4096);
    }
}
