package com.p118pd.sdk;

import com.adobe.xmp.XMPException;

/* renamed from: com.pd.sdk.o0Oo00o  reason: case insensitive filesystem */
public final class C7450o0Oo00o extends AbstractC7453o0Oo00oo {
    public static final int OooO0O0 = 0;
    public static final int OooO0OO = 512;
    public static final int OooO0Oo = 1024;
    public static final int OooO0o = 4096;
    public static final int OooO0o0 = 2048;

    public C7450o0Oo00o() {
    }

    public C7450o0Oo00o(int i) throws XMPException {
        super(i);
    }

    public C7450o0Oo00o OooO00o(boolean z) {
        OooO00o(512, z);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    public C7710o0ooO0O0 OooO00o() throws XMPException {
        return new C7710o0ooO0O0(m19073OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    public String OooO00o(int i) {
        if (i == 0) {
            return "PROP_DIRECT";
        }
        if (i == 512) {
            return "ARRAY";
        }
        if (i == 1024) {
            return "ARRAY_ORDERED";
        }
        if (i == 2048) {
            return "ARRAY_ALTERNATE";
        }
        if (i != 4096) {
            return null;
        }
        return "ARRAY_ALT_TEXT";
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19068OooO00o() {
        return m19080OooO0OO(512);
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo
    public int OooO0O0() {
        return 7680;
    }

    public C7450o0Oo00o OooO0O0(boolean z) {
        OooO00o(7680, z);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19069OooO0O0() {
        return m19080OooO0OO(4096);
    }

    public C7450o0Oo00o OooO0OO(boolean z) {
        OooO00o(3584, z);
        return this;
    }

    public boolean OooO0OO() {
        return m19080OooO0OO(2048);
    }

    public C7450o0Oo00o OooO0Oo(boolean z) {
        OooO00o(1536, z);
        return this;
    }

    public boolean OooO0Oo() {
        return m19080OooO0OO(1024);
    }

    public boolean OooO0o0() {
        return m19073OooO00o() == 0;
    }
}
