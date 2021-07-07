package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oo00O  reason: case insensitive filesystem */
public class C7982oO0oo00O extends AbstractC7922oO0o0O0O {
    public static final int OooO = 800;
    public static final int OooO00o = 768;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21026OooO00o;
    public static final int OooO0O0 = 770;
    public static final int OooO0OO = 771;
    public static final int OooO0Oo = 772;
    public static final int OooO0o = 785;
    public static final int OooO0o0 = 784;
    public static final int OooO0oO = 786;
    public static final int OooO0oo = 787;
    public static final int OooOO0 = 801;
    public static final int OooOO0O = 802;
    public static final int OooOO0o = 803;
    public static final int OooOOO = 816;
    public static final int OooOOO0 = 804;
    public static final int OooOOOO = 817;
    public static final int OooOOOo = 818;
    public static final int OooOOo = 832;
    public static final int OooOOo0 = 819;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21026OooO00o = hashMap;
        hashMap.put(768, "Quality");
        f21026OooO00o.put(770, "User Profile");
        f21026OooO00o.put(771, "Serial Number");
        f21026OooO00o.put(772, "White Balance");
        f21026OooO00o.put(784, "Lens Type");
        f21026OooO00o.put(785, "External Sensor Brightness Value");
        f21026OooO00o.put(Integer.valueOf((int) OooO0oO), "Measured LV");
        f21026OooO00o.put(Integer.valueOf((int) OooO0oo), "Approximate F Number");
        f21026OooO00o.put(800, "Camera Temperature");
        f21026OooO00o.put(Integer.valueOf((int) OooOO0), "Color Temperature");
        f21026OooO00o.put(Integer.valueOf((int) OooOO0O), "WB Red Level");
        f21026OooO00o.put(Integer.valueOf((int) OooOO0o), "WB Green Level");
        f21026OooO00o.put(Integer.valueOf((int) OooOOO0), "WB Blue Level");
        f21026OooO00o.put(Integer.valueOf((int) OooOOO), "CCD Version");
        f21026OooO00o.put(Integer.valueOf((int) OooOOOO), "CCD Board Version");
        f21026OooO00o.put(Integer.valueOf((int) OooOOOo), "Controller Board Version");
        f21026OooO00o.put(Integer.valueOf((int) OooOOo0), "M16 C Version");
        f21026OooO00o.put(Integer.valueOf((int) OooOOo), "Image ID Number");
    }

    public C7982oO0oo00O() {
        OooO00o(new C7981oO0oo000(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Leica Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19692OooO00o() {
        return f21026OooO00o;
    }
}
