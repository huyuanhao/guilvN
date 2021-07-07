package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import com.bumptech.glide.load.engine.GlideException;
import com.umeng.message.proguard.C3817f;

/* renamed from: com.pd.sdk.o0Oo0O00  reason: case insensitive filesystem */
public final class C7456o0Oo0O00 extends AbstractC7453o0Oo00oo {
    public static final int OooO = 512;
    public static final int OooO0Oo = 16;
    public static final int OooO0o = 64;
    public static final int OooO0o0 = 32;
    public static final int OooO0oO = 128;
    public static final int OooO0oo = 256;
    public static final int OooOO0 = 4096;
    public static final int OooOO0O = 8192;
    public static final int OooOO0o = 1;
    public static final int OooOOO = 0;
    public static final int OooOOO0 = 2;
    public static final int OooOOOO = 2;
    public static final int OooOOOo = 3;
    public static final int OooOOo0 = 3;
    public String OooO00o = "\n";

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20288OooO00o = false;
    public int OooO0O0 = 2048;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f20289OooO0O0 = GlideException.OooO00o.o0ooOoO;
    public int OooO0OO = 0;

    public C7456o0Oo0O00() {
    }

    public C7456o0Oo0O00(int i) throws XMPException {
        super(i);
    }

    public C7456o0Oo0O00 OooO(boolean z) {
        OooO00o(128, z);
        return this;
    }

    public boolean OooO() {
        return m19080OooO0OO(8192);
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    public C7456o0Oo0O00 OooO00o(int i) {
        this.OooO0OO = i;
        return this;
    }

    public C7456o0Oo0O00 OooO00o(String str) {
        this.f20289OooO0O0 = str;
        return this;
    }

    public C7456o0Oo0O00 OooO00o(boolean z) {
        OooO00o(3, false);
        OooO00o(2, z);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19083OooO00o(int i) {
        if (i == 16) {
            return "OMIT_PACKET_WRAPPER";
        }
        if (i == 32) {
            return "READONLY_PACKET";
        }
        if (i == 64) {
            return "USE_COMPACT_FORMAT";
        }
        if (i == 256) {
            return "INCLUDE_THUMBNAIL_PAD";
        }
        if (i == 512) {
            return "EXACT_PACKET_LENGTH";
        }
        if (i == 4096) {
            return "OMIT_XMPMETA_ELEMENT";
        }
        if (i != 8192) {
            return null;
        }
        return "NORMALIZED";
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    public boolean OooO00o() {
        return (m19073OooO00o() & 3) == 2;
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo
    public int OooO0O0() {
        return 13168;
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo, com.p118pd.sdk.AbstractC7453o0Oo00oo
    public C7456o0Oo0O00 OooO0O0(int i) {
        this.OooO0O0 = i;
        return this;
    }

    public C7456o0Oo0O00 OooO0O0(String str) {
        this.OooO00o = str;
        return this;
    }

    public C7456o0Oo0O00 OooO0O0(boolean z) {
        OooO00o(3, false);
        OooO00o(3, z);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m19084OooO0O0() {
        return OooO00o() ? C3817f.f10342d : m19085OooO0O0() ? C3817f.f10343e : "UTF-8";
    }

    @Override // com.p118pd.sdk.AbstractC7453o0Oo00oo
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19085OooO0O0() {
        return (m19073OooO00o() & 3) == 3;
    }

    public int OooO0OO() {
        return this.OooO0OO;
    }

    public C7456o0Oo0O00 OooO0OO(boolean z) {
        OooO00o(512, z);
        return this;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public String m19086OooO0OO() {
        return this.f20289OooO0O0;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m19087OooO0OO() {
        return m19080OooO0OO(512);
    }

    public int OooO0Oo() {
        return this.OooO0O0;
    }

    public C7456o0Oo0O00 OooO0Oo(boolean z) {
        OooO00o(256, z);
        return this;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public String m19088OooO0Oo() {
        return this.OooO00o;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m19089OooO0Oo() {
        return m19080OooO0OO(256);
    }

    public C7456o0Oo0O00 OooO0o(boolean z) {
        OooO00o(4096, z);
        return this;
    }

    public boolean OooO0o() {
        return this.f20288OooO00o;
    }

    public C7456o0Oo0O00 OooO0o0(boolean z) {
        OooO00o(16, z);
        return this;
    }

    public boolean OooO0o0() {
        return m19080OooO0OO(16);
    }

    public C7456o0Oo0O00 OooO0oO(boolean z) {
        OooO00o(32, z);
        return this;
    }

    public boolean OooO0oO() {
        return m19080OooO0OO(4096);
    }

    public C7456o0Oo0O00 OooO0oo(boolean z) {
        OooO00o(8192, z);
        return this;
    }

    public boolean OooO0oo() {
        return m19080OooO0OO(32);
    }

    public C7456o0Oo0O00 OooOO0(boolean z) {
        OooO00o(64, z);
        return this;
    }

    public boolean OooOO0() {
        return m19080OooO0OO(128);
    }

    public boolean OooOO0O() {
        return m19080OooO0OO(64);
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            C7456o0Oo0O00 o0oo0o00 = new C7456o0Oo0O00(m19073OooO00o());
            o0oo0o00.OooO00o(this.OooO0OO);
            o0oo0o00.OooO00o(this.f20289OooO0O0);
            o0oo0o00.OooO0O0(this.OooO00o);
            o0oo0o00.OooO0O0(this.OooO0O0);
            return o0oo0o00;
        } catch (XMPException unused) {
            return null;
        }
    }
}
