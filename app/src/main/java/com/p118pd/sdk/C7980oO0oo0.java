package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oo0  reason: case insensitive filesystem */
public class C7980oO0oo0 extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 771;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21025OooO00o;
    public static final int OooO0O0 = 1031;
    public static final int OooO0OO = 1032;
    public static final int OooO0Oo = 1037;
    public static final int OooO0o = 1042;
    public static final int OooO0o0 = 1040;
    public static final int OooO0oO = 1043;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21025OooO00o = hashMap;
        hashMap.put(771, "Lens Model");
        f21025OooO00o.put(Integer.valueOf((int) OooO0O0), "Original File Name");
        f21025OooO00o.put(1032, "Original Directory");
        f21025OooO00o.put(1037, "Exposure Mode");
        f21025OooO00o.put(1040, "Shot Info");
        f21025OooO00o.put(1042, "Film Mode");
        f21025OooO00o.put(1043, "WB RGB Levels");
    }

    public C7980oO0oo0() {
        OooO00o(new C7983oO0oo00o(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Leica Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19691OooO00o() {
        return f21025OooO00o;
    }
}
