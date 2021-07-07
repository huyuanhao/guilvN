package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.ooooOoOo  reason: case insensitive filesystem */
public class C9273ooooOoOo extends AbstractC7922oO0o0O0O {
    public static final int OooO = 8;
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f22651OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 4;
    public static final int OooO0o = 6;
    public static final int OooO0o0 = 5;
    public static final int OooO0oO = 7;
    @Deprecated
    public static final int OooO0oo = 8;
    public static final int OooOO0 = 9;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f22651OooO00o = hashMap;
        hashMap.put(1, "GIF Format Version");
        f22651OooO00o.put(3, "Image Height");
        f22651OooO00o.put(2, "Image Width");
        f22651OooO00o.put(4, "Color Table Size");
        f22651OooO00o.put(5, "Is Color Table Sorted");
        f22651OooO00o.put(6, "Bits per Pixel");
        f22651OooO00o.put(7, "Has Global Color Table");
        f22651OooO00o.put(8, "Background Color Index");
        f22651OooO00o.put(9, "Pixel Aspect Ratio");
    }

    public C9273ooooOoOo() {
        OooO00o(new C9242ooooO000(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "GIF Header";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m21164OooO00o() {
        return f22651OooO00o;
    }
}
