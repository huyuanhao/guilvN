package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oO  reason: case insensitive filesystem */
public class C7942oO0oO extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 2;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21009OooO00o;
    public static final int OooO0O0 = 4;
    public static final int OooO0OO = 5;
    public static final int OooO0Oo = 7;
    public static final int OooO0o = 9;
    public static final int OooO0o0 = 8;
    public static final int OooO0oO = 11;
    public static final int OooO0oo = 12;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21009OooO00o = hashMap;
        hashMap.put(2, "Distortion Param 2");
        f21009OooO00o.put(4, "Distortion Param 4");
        f21009OooO00o.put(5, "Distortion Scale");
        f21009OooO00o.put(7, "Distortion Correction");
        f21009OooO00o.put(8, "Distortion Param 8");
        f21009OooO00o.put(9, "Distortion Param 9");
        f21009OooO00o.put(11, "Distortion Param 11");
        f21009OooO00o.put(12, "Distortion N");
    }

    public C7942oO0oO() {
        OooO00o(new C8459oOooo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "PanasonicRaw DistortionInfo";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19671OooO00o() {
        return f21009OooO00o;
    }
}
