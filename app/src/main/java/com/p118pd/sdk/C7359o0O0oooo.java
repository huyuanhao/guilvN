package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0O0oooo  reason: case insensitive filesystem */
public class C7359o0O0oooo implements AbstractC7323o0O0Oooo {
    public final String OooO00o;
    public final String OooO0O0;

    public C7359o0O0oooo(String str, String str2) {
        if (str != null) {
            this.OooO00o = str;
            this.OooO0O0 = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    @Override // com.p118pd.sdk.AbstractC7323o0O0Oooo
    public String getName() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7323o0O0Oooo
    public String getValue() {
        return this.OooO0O0;
    }
}
