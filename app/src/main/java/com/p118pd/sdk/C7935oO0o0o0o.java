package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0o0o0o  reason: case insensitive filesystem */
public class C7935oO0o0o0o extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21001OooO00o;
    public static final int OooO0O0 = 2;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f21002OooO0O0 = "strh";
    public static final int OooO0OO = 3;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f21003OooO0OO = "avih";
    public static final int OooO0Oo = 4;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f21004OooO0Oo = "hdrl";
    public static final int OooO0o = 6;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final String f21005OooO0o = "AVI ";
    public static final int OooO0o0 = 5;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f21006OooO0o0 = "strl";
    public static final int OooO0oO = 7;
    public static final int OooO0oo = 8;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21001OooO00o = hashMap;
        hashMap.put(1, "Frames Per Second");
        f21001OooO00o.put(2, "Samples Per Second");
        f21001OooO00o.put(3, "Duration");
        f21001OooO00o.put(4, "Video Codec");
        f21001OooO00o.put(5, "Audio Codec");
        f21001OooO00o.put(6, "Width");
        f21001OooO00o.put(7, "Height");
        f21001OooO00o.put(8, "Stream Count");
    }

    public C7935oO0o0o0o() {
        OooO00o(new C7934oO0o0o0O(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "AVI";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19669OooO00o() {
        return f21001OooO00o;
    }
}
