package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oOOoO  reason: case insensitive filesystem */
public class C7963oO0oOOoO extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 3;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21017OooO00o;
    public static final int OooO0O0 = 10;
    public static final int OooO0OO = 11;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21017OooO00o = hashMap;
        hashMap.put(3, "Run Time");
        f21017OooO00o.put(10, "HDR Image Type");
        f21017OooO00o.put(11, "Burst UUID");
    }

    public C7963oO0oOOoO() {
        OooO00o(new C7961oO0oOOo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Apple Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19683OooO00o() {
        return f21017OooO00o;
    }
}
