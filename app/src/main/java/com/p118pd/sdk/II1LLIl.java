package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.II1LLIl */
public class II1LLIl {
    public short OooO00o;
    public short OooO0O0;

    public II1LLIl(short s, short s2) {
        if (!L1LL1Ii.OooO0O0(s)) {
            throw new IllegalArgumentException("'hash' should be a uint8");
        } else if (!L1LL1Ii.OooO0O0(s2)) {
            throw new IllegalArgumentException("'signature' should be a uint8");
        } else if (s2 != 0) {
            this.OooO00o = s;
            this.OooO0O0 = s2;
        } else {
            throw new IllegalArgumentException("'signature' MUST NOT be \"anonymous\"");
        }
    }

    public static II1LLIl OooO00o(InputStream inputStream) throws IOException {
        return new II1LLIl(L1LL1Ii.m15923OooO00o(inputStream), L1LL1Ii.m15923OooO00o(inputStream));
    }

    public short OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO00o(OooO00o(), outputStream);
        L1LL1Ii.OooO00o(OooO0O0(), outputStream);
    }

    public short OooO0O0() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof II1LLIl)) {
            return false;
        }
        II1LLIl iI1LLIl = (II1LLIl) obj;
        return iI1LLIl.OooO00o() == OooO00o() && iI1LLIl.OooO0O0() == OooO0O0();
    }

    public int hashCode() {
        return (OooO00o() << 16) | OooO0O0();
    }
}
