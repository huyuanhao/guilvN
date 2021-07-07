package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO00oO0  reason: case insensitive filesystem */
public class C8024oOO00oO0 extends AbstractC7922oO0o0O0O {
    public static final int OooO = 9;
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21053OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 4;
    public static final int OooO0o = 6;
    public static final int OooO0o0 = 5;
    public static final int OooO0oO = 7;
    public static final int OooO0oo = 8;
    public static final int OooOO0 = 10;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21053OooO00o = hashMap;
        hashMap.put(1, "Image Type");
        f21053OooO00o.put(2, "Image Width");
        f21053OooO00o.put(3, "Image Height");
        f21053OooO00o.put(4, "Colour Palette Size");
        f21053OooO00o.put(5, "Colour Planes");
        f21053OooO00o.put(6, "Hotspot X");
        f21053OooO00o.put(7, "Bits Per Pixel");
        f21053OooO00o.put(8, "Hotspot Y");
        f21053OooO00o.put(9, "Image Size Bytes");
        f21053OooO00o.put(10, "Image Offset Bytes");
    }

    public C8024oOO00oO0() {
        OooO00o(new C8019oOO00o(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "ICO";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19725OooO00o() {
        return f21053OooO00o;
    }
}
