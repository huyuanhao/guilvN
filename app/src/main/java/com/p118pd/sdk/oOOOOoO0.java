package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOOOOoO0 */
public class oOOOOoO0 extends AbstractC7922oO0o0O0O {
    public static final int OooO = 9;
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21132OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 4;
    public static final int OooO0o = 6;
    public static final int OooO0o0 = 5;
    public static final int OooO0oO = 7;
    public static final int OooO0oo = 8;
    public static final int OooOO0 = 10;
    public static final int OooOO0O = 11;
    public static final int OooOO0o = 12;
    public static final int OooOOO = 14;
    public static final int OooOOO0 = 13;
    public static final int OooOOOO = 15;
    public static final int OooOOOo = 16;
    public static final int OooOOo = 18;
    public static final int OooOOo0 = 17;
    public static final int OooOOoo = 19;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7858oO0O0ooo f21133OooO00o;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21132OooO00o = hashMap;
        hashMap.put(2, "Image Height");
        f21132OooO00o.put(1, "Image Width");
        f21132OooO00o.put(3, "Bits Per Sample");
        f21132OooO00o.put(4, "Color Type");
        f21132OooO00o.put(5, "Compression Type");
        f21132OooO00o.put(6, "Filter Method");
        f21132OooO00o.put(7, "Interlace Method");
        f21132OooO00o.put(8, "Palette Size");
        f21132OooO00o.put(9, "Palette Has Transparency");
        f21132OooO00o.put(10, "sRGB Rendering Intent");
        f21132OooO00o.put(11, "Image Gamma");
        f21132OooO00o.put(12, "ICC Profile Name");
        f21132OooO00o.put(13, "Textual Data");
        f21132OooO00o.put(14, "Last Modification Time");
        f21132OooO00o.put(15, "Background Color");
        f21132OooO00o.put(16, "Pixels Per Unit X");
        f21132OooO00o.put(17, "Pixels Per Unit Y");
        f21132OooO00o.put(18, "Unit Specifier");
        f21132OooO00o.put(19, "Significant Bits");
    }

    public oOOOOoO0(@NotNull C7858oO0O0ooo oo0o0ooo) {
        this.f21133OooO00o = oo0o0ooo;
        OooO00o(new C8124oOOOOo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public C7858oO0O0ooo OooO00o() {
        return this.f21133OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19787OooO00o() {
        return "PNG-" + this.f21133OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19788OooO00o() {
        return f21132OooO00o;
    }
}
