package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO00Oo0  reason: case insensitive filesystem */
public class C8017oOO00Oo0 extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21050OooO00o;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21050OooO00o = hashMap;
        hashMap.put(1, "Comment");
    }

    public C8017oOO00Oo0(C7927oO0o0OOo oo0o0ooo) {
        OooO00o(new C8015oOO00OOo(this));
        OooO00o(1, oo0o0ooo);
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "GIF Comment";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19716OooO00o() {
        return f21050OooO00o;
    }
}
