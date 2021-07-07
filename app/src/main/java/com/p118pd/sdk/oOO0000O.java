package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO0000O */
public class oOO0000O extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21043OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3584;
    public static final int OooO0Oo = 8193;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21043OooO00o = hashMap;
        hashMap.put(1, "Makernote Data Type");
        f21043OooO00o.put(2, AbstractC7726o0ooOOoo.OooO0o0);
        f21043OooO00o.put(3584, "Print Image Matching (PIM) Info");
        f21043OooO00o.put(8193, "Ricoh Camera Info Makernote Sub-IFD");
    }

    public oOO0000O() {
        OooO00o(new oOO0000(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Ricoh Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19707OooO00o() {
        return f21043OooO00o;
    }
}
