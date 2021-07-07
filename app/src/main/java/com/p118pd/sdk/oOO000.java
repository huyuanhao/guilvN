package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO000 */
public class oOO000 extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21041OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 67;
    public static final int OooO0o = 288;
    public static final int OooO0o0 = 256;
    public static final int OooO0oO = 291;
    public static final int OooO0oo = 40961;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21041OooO00o = hashMap;
        hashMap.put(1, "Maker Note Version");
        f21041OooO00o.put(2, "Device Type");
        f21041OooO00o.put(3, "Model Id");
        f21041OooO00o.put(67, "Camera Temperature");
        f21041OooO00o.put(256, "Face Detect");
        f21041OooO00o.put(288, "Face Recognition");
        f21041OooO00o.put(291, "Face Name");
        f21041OooO00o.put(40961, "Firmware Name");
    }

    public oOO000() {
        OooO00o(new C8006oOO0000o(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Samsung Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19705OooO00o() {
        return f21041OooO00o;
    }
}
