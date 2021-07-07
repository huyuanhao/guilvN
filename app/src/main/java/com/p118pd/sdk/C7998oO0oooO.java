package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oooO  reason: case insensitive filesystem */
public class C7998oO0oooO extends AbstractC7922oO0o0O0O {
    public static final int OooO = 263;
    public static final int OooO00o = 0;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21036OooO00o;
    public static final int OooO0O0 = 256;
    public static final int OooO0OO = 257;
    public static final int OooO0Oo = 258;
    public static final int OooO0o = 260;
    public static final int OooO0o0 = 259;
    public static final int OooO0oO = 261;
    public static final int OooO0oo = 262;
    public static final int OooOO0 = 264;
    public static final int OooOO0O = 265;
    public static final int OooOO0o = 266;
    public static final int OooOOO = 268;
    public static final int OooOOO0 = 267;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21036OooO00o = hashMap;
        hashMap.put(0, "Raw Dev Version");
        f21036OooO00o.put(256, "Raw Dev Exposure Bias Value");
        f21036OooO00o.put(257, "Raw Dev White Balance Value");
        f21036OooO00o.put(258, "Raw Dev WB Fine Adjustment");
        f21036OooO00o.put(259, "Raw Dev Gray Point");
        f21036OooO00o.put(260, "Raw Dev Saturation Emphasis");
        f21036OooO00o.put(261, "Raw Dev Memory Color Emphasis");
        f21036OooO00o.put(262, "Raw Dev Contrast Value");
        f21036OooO00o.put(263, "Raw Dev Sharpness Value");
        f21036OooO00o.put(264, "Raw Dev Color Space");
        f21036OooO00o.put(265, "Raw Dev Engine");
        f21036OooO00o.put(266, "Raw Dev Noise Reduction");
        f21036OooO00o.put(267, "Raw Dev Edit Status");
        f21036OooO00o.put(268, "Raw Dev Settings");
    }

    public C7998oO0oooO() {
        OooO00o(new C7999oO0oooO0(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Olympus Raw Development";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19699OooO00o() {
        return f21036OooO00o;
    }
}
