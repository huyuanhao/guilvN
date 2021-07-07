package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOOOOooo  reason: case insensitive filesystem */
public class C8132oOOOOooo extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21142OooO00o;
    public static final int OooO0O0 = 2;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f21143OooO0O0 = "VP8X";
    public static final int OooO0OO = 3;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f21144OooO0OO = "VP8L";
    public static final int OooO0Oo = 4;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f21145OooO0Oo = "VP8 ";
    public static final String OooO0o = "ICCP";
    public static final String OooO0o0 = "EXIF";
    public static final String OooO0oO = "XMP ";
    public static final String OooO0oo = "WEBP";

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21142OooO00o = hashMap;
        hashMap.put(1, "Image Height");
        f21142OooO00o.put(2, "Image Width");
        f21142OooO00o.put(3, "Has Alpha");
        f21142OooO00o.put(4, "Is Animation");
    }

    public C8132oOOOOooo() {
        OooO00o(new C8131oOOOOooO(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "WebP";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19790OooO00o() {
        return f21142OooO00o;
    }
}
