package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO0oOoO  reason: case insensitive filesystem */
public class C8071oOO0oOoO extends oOO0OOOO {
    @NotNull
    public static final HashMap<Integer, String> OooO0O0;
    public static final int OooOOo = 1;
    public static final int OooOOoo = 2;
    public static final int OooOo = 7;
    public static final int OooOo0 = 4;
    public static final int OooOo00 = 3;
    public static final int OooOo0O = 5;
    public static final int OooOo0o = 6;
    public static final int OooOoO0 = 8;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        OooO0O0 = hashMap;
        AbstractC8064oOO0oO0O.OooO00o(hashMap);
        OooO0O0.put(1, "Vertical Placement");
        OooO0O0.put(2, "Some Samples Forced");
        OooO0O0.put(3, "All Samples Forced");
        OooO0O0.put(4, "Default Text Box");
        OooO0O0.put(5, "Font Identifier");
        OooO0O0.put(6, "Font Face");
        OooO0O0.put(7, "Font Size");
        OooO0O0.put(8, "Foreground Color");
    }

    public C8071oOO0oOoO() {
        OooO00o(new C8070oOO0oOo(this));
    }

    @Override // com.p118pd.sdk.oOO0OOOO, com.p118pd.sdk.oOO0OOOO, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "QuickTime Subtitle";
    }

    @Override // com.p118pd.sdk.oOO0OOOO, com.p118pd.sdk.oOO0OOOO, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19743OooO00o() {
        return OooO0O0;
    }
}
