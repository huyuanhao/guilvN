package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oo0O  reason: case insensitive filesystem */
public class C7984oO0oo0O extends AbstractC7922oO0o0O0O {
    public static final int OooO = 10;
    public static final int OooO00o = 2;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21027OooO00o;
    public static final int OooO0O0 = 3;
    public static final int OooO0OO = 4;
    public static final int OooO0Oo = 5;
    public static final int OooO0o = 7;
    public static final int OooO0o0 = 6;
    public static final int OooO0oO = 8;
    public static final int OooO0oo = 9;
    public static final int OooOO0 = 11;
    public static final int OooOO0O = 3840;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21027OooO00o = hashMap;
        hashMap.put(6, "CCD Sensitivity");
        f21027OooO00o.put(4, "Color Mode");
        f21027OooO00o.put(10, "Digital Zoom");
        f21027OooO00o.put(11, "Fisheye Converter");
        f21027OooO00o.put(8, "Focus");
        f21027OooO00o.put(5, "Image Adjustment");
        f21027OooO00o.put(3, "Quality");
        f21027OooO00o.put(2, "Makernote Unknown 1");
        f21027OooO00o.put(9, "Makernote Unknown 2");
        f21027OooO00o.put(3840, "Makernote Unknown 3");
        f21027OooO00o.put(7, "White Balance");
    }

    public C7984oO0oo0O() {
        OooO00o(new C7985oO0oo0O0(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Nikon Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19693OooO00o() {
        return f21027OooO00o;
    }
}
