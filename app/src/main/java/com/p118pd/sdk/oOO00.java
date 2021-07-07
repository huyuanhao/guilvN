package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO00 */
public class oOO00 extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 1299;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21040OooO00o;
    public static final int OooO0O0 = 1300;
    public static final int OooO0OO = 8192;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21040OooO00o = hashMap;
        hashMap.put(Integer.valueOf((int) OooO00o), "Makernote Thumb Offset");
        f21040OooO00o.put(Integer.valueOf((int) OooO0O0), "Makernote Thumb Length");
        f21040OooO00o.put(8192, "Makernote Thumb Version");
    }

    public oOO00() {
        OooO00o(new C8011oOO000oo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Sony Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19704OooO00o() {
        return f21040OooO00o;
    }
}
