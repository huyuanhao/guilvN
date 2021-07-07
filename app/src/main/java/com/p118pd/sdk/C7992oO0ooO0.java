package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0ooO0  reason: case insensitive filesystem */
public class C7992oO0ooO0 extends AbstractC7922oO0o0O0O {
    public static final int OooO = 772;
    public static final int OooO00o = 0;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21032OooO00o;
    public static final int OooO0O0 = 521;
    public static final int OooO0OO = 528;
    public static final int OooO0Oo = 529;
    public static final int OooO0o = 768;
    public static final int OooO0o0 = 530;
    public static final int OooO0oO = 769;
    public static final int OooO0oo = 771;
    public static final int OooOO0 = 773;
    public static final int OooOO0O = 776;
    public static final int OooOO0o = 808;
    public static final int OooOOO = 4611;
    public static final int OooOOO0 = 4609;
    public static final int OooOOOO = 4612;
    public static final int OooOOOo = 4613;
    public static final int OooOOo = 4617;
    public static final int OooOOo0 = 4616;
    public static final int OooOOoo = 4618;
    public static final int OooOo0 = 5632;
    public static final int OooOo00 = 5376;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21032OooO00o = hashMap;
        hashMap.put(0, "Focus Info Version");
        f21032OooO00o.put(521, "Auto Focus");
        f21032OooO00o.put(528, "Scene Detect");
        f21032OooO00o.put(529, "Scene Area");
        f21032OooO00o.put(530, "Scene Detect Data");
        f21032OooO00o.put(768, "Zoom Step Count");
        f21032OooO00o.put(769, "Focus Step Count");
        f21032OooO00o.put(771, "Focus Step Infinity");
        f21032OooO00o.put(772, "Focus Step Near");
        f21032OooO00o.put(773, "Focus Distance");
        f21032OooO00o.put(Integer.valueOf((int) OooOO0O), "AF Point");
        f21032OooO00o.put(Integer.valueOf((int) OooOO0o), "AF Info");
        f21032OooO00o.put(4609, "External Flash");
        f21032OooO00o.put(4611, "External Flash Guide Number");
        f21032OooO00o.put(Integer.valueOf((int) OooOOOO), "External Flash Bounce");
        f21032OooO00o.put(Integer.valueOf((int) OooOOOo), "External Flash Zoom");
        f21032OooO00o.put(Integer.valueOf((int) OooOOo0), "Internal Flash");
        f21032OooO00o.put(Integer.valueOf((int) OooOOo), "Manual Flash");
        f21032OooO00o.put(Integer.valueOf((int) OooOOoo), "Macro LED");
        f21032OooO00o.put(Integer.valueOf((int) OooOo00), "Sensor Temperature");
        f21032OooO00o.put(Integer.valueOf((int) OooOo0), "Image Stabilization");
    }

    public C7992oO0ooO0() {
        OooO00o(new C7993oO0ooO00(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Olympus Focus Info";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19696OooO00o() {
        return f21032OooO00o;
    }
}
