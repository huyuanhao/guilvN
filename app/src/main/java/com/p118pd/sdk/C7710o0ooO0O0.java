package com.p118pd.sdk;

import com.adobe.xmp.XMPException;

/* renamed from: com.pd.sdk.o0ooO0O0  reason: case insensitive filesystem */
public final class C7710o0ooO0O0 extends AbstractC7453o0Oo00oo {
    public static final int OooO = 512;
    public static final int OooO0O0 = 0;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 16;
    public static final int OooO0o = 64;
    public static final int OooO0o0 = 32;
    public static final int OooO0oO = 128;
    public static final int OooO0oo = 256;
    public static final int OooOO0 = 1024;
    public static final int OooOO0O = 2048;
    public static final int OooOO0o = 4096;
    public static final int OooOOO = 536870912;
    public static final int OooOOO0 = Integer.MIN_VALUE;

    public C7710o0ooO0O0() {
    }

    public C7710o0ooO0O0(int i) throws XMPException {
        super(i);
    }

    public C7710o0ooO0O0 OooO(boolean z) {
        OooO00o(Integer.MIN_VALUE, z);
        return this;
    }

    public boolean OooO() {
        return (m19073OooO00o() & -7681) == 0;
    }

    public C7710o0ooO0O0 OooO00o(boolean z) {
        OooO00o(512, z);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    public String OooO00o(int i) {
        switch (i) {
            case Integer.MIN_VALUE:
                return "SCHEMA_NODE";
            case 2:
                return "URI";
            case 16:
                return "HAS_QUALIFIER";
            case 32:
                return "QUALIFIER";
            case 64:
                return "HAS_LANGUAGE";
            case 128:
                return "HAS_TYPE";
            case 256:
                return "STRUCT";
            case 512:
                return "ARRAY";
            case 1024:
                return "ARRAY_ORDERED";
            case 2048:
                return "ARRAY_ALTERNATE";
            case 4096:
                return "ARRAY_ALT_TEXT";
            default:
                return null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19349OooO00o(int i) throws XMPException {
        if ((i & 256) > 0 && (i & 512) > 0) {
            throw new XMPException("IsStruct and IsArray options are mutually exclusive", 103);
        } else if ((i & 2) > 0 && (i & 768) > 0) {
            throw new XMPException("Structs and arrays can't have \"value\" options", 103);
        }
    }

    public void OooO00o(C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        if (o0ooo0o0 != null) {
            m19078OooO0O0(o0ooo0o0.m19073OooO00o() | m19073OooO00o());
        }
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    public boolean OooO00o() {
        return m19080OooO0OO(64);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19350OooO00o(C7710o0ooO0O0 o0ooo0o0) {
        return OooO0Oo() == o0ooo0o0.OooO0Oo() && OooO0oO() == o0ooo0o0.OooO0oO() && OooO0o() == o0ooo0o0.OooO0o() && OooO0o0() == o0ooo0o0.OooO0o0();
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo
    public int OooO0O0() {
        return -2147475470;
    }

    public C7710o0ooO0O0 OooO0O0(boolean z) {
        OooO00o(4096, z);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19351OooO0O0() {
        return m19080OooO0OO(16);
    }

    public C7710o0ooO0O0 OooO0OO(boolean z) {
        OooO00o(2048, z);
        return this;
    }

    public boolean OooO0OO() {
        return m19080OooO0OO(128);
    }

    public C7710o0ooO0O0 OooO0Oo(boolean z) {
        OooO00o(1024, z);
        return this;
    }

    public boolean OooO0Oo() {
        return m19080OooO0OO(512);
    }

    public C7710o0ooO0O0 OooO0o(boolean z) {
        OooO00o(16, z);
        return this;
    }

    public boolean OooO0o() {
        return m19080OooO0OO(2048);
    }

    public C7710o0ooO0O0 OooO0o0(boolean z) {
        OooO00o(64, z);
        return this;
    }

    public boolean OooO0o0() {
        return m19080OooO0OO(4096);
    }

    public C7710o0ooO0O0 OooO0oO(boolean z) {
        OooO00o(128, z);
        return this;
    }

    public boolean OooO0oO() {
        return m19080OooO0OO(1024);
    }

    public C7710o0ooO0O0 OooO0oo(boolean z) {
        OooO00o(32, z);
        return this;
    }

    public boolean OooO0oo() {
        return (m19073OooO00o() & 768) > 0;
    }

    public C7710o0ooO0O0 OooOO0(boolean z) {
        OooO00o(256, z);
        return this;
    }

    public boolean OooOO0() {
        return m19080OooO0OO(32);
    }

    public C7710o0ooO0O0 OooOO0O(boolean z) {
        OooO00o(2, z);
        return this;
    }

    public boolean OooOO0O() {
        return m19080OooO0OO(Integer.MIN_VALUE);
    }

    public boolean OooOO0o() {
        return (m19073OooO00o() & 768) == 0;
    }

    public boolean OooOOO() {
        return m19080OooO0OO(2);
    }

    public boolean OooOOO0() {
        return m19080OooO0OO(256);
    }
}
