package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oO0Oo  reason: case insensitive filesystem */
public class C7949oO0oO0Oo extends oO0oO000 {
    @NotNull
    public static final HashMap<Integer, String> OooO00o;
    public static final int o000o0o = 514;
    public static final int o000o0o0 = 513;
    @Deprecated
    public static final int o000o0oO = 259;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        OooO00o = hashMap;
        oO0oO000.OooO00o(hashMap);
        OooO00o.put(513, "Thumbnail Offset");
        OooO00o.put(514, "Thumbnail Length");
    }

    public C7949oO0oO0Oo() {
        OooO00o(new C8980ooOOoOOO(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Exif Thumbnail";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19674OooO00o() {
        return OooO00o;
    }
}
