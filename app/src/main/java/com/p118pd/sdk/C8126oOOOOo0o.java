package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOOOOo0o  reason: case insensitive filesystem */
public class C8126oOOOOo0o extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21129OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 4;
    public static final int OooO0o = 6;
    public static final int OooO0o0 = 5;
    public static final int OooO0oO = 7;
    public static final int OooO0oo = 8;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21129OooO00o = hashMap;
        hashMap.put(1, "White Point X");
        f21129OooO00o.put(2, "White Point Y");
        f21129OooO00o.put(3, "Red X");
        f21129OooO00o.put(4, "Red Y");
        f21129OooO00o.put(5, "Green X");
        f21129OooO00o.put(6, "Green Y");
        f21129OooO00o.put(7, "Blue X");
        f21129OooO00o.put(8, "Blue Y");
    }

    public C8126oOOOOo0o() {
        OooO00o(new C7929oO0o0OoO(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "PNG Chromaticities";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19785OooO00o() {
        return f21129OooO00o;
    }
}
