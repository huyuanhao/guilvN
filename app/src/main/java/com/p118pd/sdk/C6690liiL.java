package com.p118pd.sdk;

import java.security.spec.KeySpec;

/* renamed from: com.pd.sdk.liiL  reason: case insensitive filesystem */
public class C6690liiL implements KeySpec {
    public static final String o0OOO0o = "key expansion";
    public static final String o0ooOoO = "master secret";
    public final byte[] OooO00o;
    public final byte[] OooO0O0;
    public final int o00oO0O;
    public final String o0ooOOo;

    public C6690liiL(byte[] bArr, String str, int i, byte[]... bArr2) {
        this.OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.o0ooOOo = str;
        this.o00oO0O = i;
        this.OooO0O0 = C9586iIILl.OooO00o(bArr2);
    }

    public int OooO00o() {
        return this.o00oO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17772OooO00o() {
        return this.o0ooOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17773OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO00o);
    }

    public byte[] OooO0O0() {
        return C9586iIILl.m21630OooO00o(this.OooO0O0);
    }
}
