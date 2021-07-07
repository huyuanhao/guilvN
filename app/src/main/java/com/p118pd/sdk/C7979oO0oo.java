package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oo  reason: case insensitive filesystem */
public class C7979oO0oo extends AbstractC7922oO0o0O0O {
    public static final int OooO = 515;
    public static final int OooO00o = 0;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21024OooO00o;
    public static final int OooO0O0 = 256;
    public static final int OooO0OO = 257;
    public static final int OooO0Oo = 258;
    public static final int OooO0o = 260;
    public static final int OooO0o0 = 259;
    public static final int OooO0oO = 513;
    public static final int OooO0oo = 514;
    public static final int OooOO0 = 516;
    public static final int OooOO0O = 517;
    public static final int OooOO0o = 518;
    public static final int OooOOO = 520;
    public static final int OooOOO0 = 519;
    public static final int OooOOOO = 522;
    public static final int OooOOOo = 523;
    public static final int OooOOo = 770;
    public static final int OooOOo0 = 769;
    public static final int OooOOoo = 771;
    public static final int OooOo = 4098;
    public static final int OooOo0 = 1027;
    public static final int OooOo00 = 772;
    public static final int OooOo0O = 4096;
    public static final int OooOo0o = 4097;
    public static final int OooOoO0 = 4099;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21024OooO00o = hashMap;
        hashMap.put(0, "Equipment Version");
        f21024OooO00o.put(256, "Camera Type 2");
        f21024OooO00o.put(257, "Serial Number");
        f21024OooO00o.put(258, "Internal Serial Number");
        f21024OooO00o.put(259, "Focal Plane Diagonal");
        f21024OooO00o.put(260, "Body Firmware Version");
        f21024OooO00o.put(513, "Lens Type");
        f21024OooO00o.put(514, "Lens Serial Number");
        f21024OooO00o.put(515, "Lens Model");
        f21024OooO00o.put(516, "Lens Firmware Version");
        f21024OooO00o.put(517, "Max Aperture At Min Focal");
        f21024OooO00o.put(518, "Max Aperture At Max Focal");
        f21024OooO00o.put(519, "Min Focal Length");
        f21024OooO00o.put(520, "Max Focal Length");
        f21024OooO00o.put(522, "Max Aperture");
        f21024OooO00o.put(523, "Lens Properties");
        f21024OooO00o.put(769, "Extender");
        f21024OooO00o.put(770, "Extender Serial Number");
        f21024OooO00o.put(771, "Extender Model");
        f21024OooO00o.put(772, "Extender Firmware Version");
        f21024OooO00o.put(1027, "Conversion Lens");
        f21024OooO00o.put(4096, "Flash Type");
        f21024OooO00o.put(4097, "Flash Model");
        f21024OooO00o.put(4098, "Flash Firmware Version");
        f21024OooO00o.put(4099, "Flash Serial Number");
    }

    public C7979oO0oo() {
        OooO00o(new C7990oO0oo0oo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Olympus Equipment";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19690OooO00o() {
        return f21024OooO00o;
    }
}
