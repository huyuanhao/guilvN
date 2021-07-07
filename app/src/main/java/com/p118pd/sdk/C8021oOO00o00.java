package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO00o00  reason: case insensitive filesystem */
public class C8021oOO00o00 extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21051OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 4;
    public static final int OooO0o = 6;
    public static final int OooO0o0 = 5;
    public static final int OooO0oO = 7;
    public static final int OooO0oo = 8;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21051OooO00o = hashMap;
        hashMap.put(1, "Left");
        f21051OooO00o.put(2, "Top");
        f21051OooO00o.put(3, "Width");
        f21051OooO00o.put(4, "Height");
        f21051OooO00o.put(5, "Has Local Colour Table");
        f21051OooO00o.put(6, "Is Interlaced");
        f21051OooO00o.put(7, "Is Local Colour Table Sorted");
        f21051OooO00o.put(8, "Local Colour Table Bits Per Pixel");
    }

    public C8021oOO00o00() {
        OooO00o(new C8018oOO00Ooo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "GIF Image";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19723OooO00o() {
        return f21051OooO00o;
    }
}
