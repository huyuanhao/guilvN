package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oOOO  reason: case insensitive filesystem */
public class C7957oO0oOOO extends AbstractC7922oO0o0O0O {
    public static final int OooO = 11;
    public static final int OooO00o = 0;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21013OooO00o;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 4;
    public static final int OooO0o = 7;
    public static final int OooO0o0 = 5;
    public static final int OooO0oO = 8;
    public static final int OooO0oo = 10;
    public static final int OooOO0 = 13;
    public static final int OooOO0O = 14;
    public static final int OooOO0o = 16;
    public static final int OooOOO = 19;
    public static final int OooOOO0 = 17;
    public static final int OooOOOO = 20;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21013OooO00o = hashMap;
        hashMap.put(0, "Num WB Entries");
        f21013OooO00o.put(1, "WB Type 1");
        f21013OooO00o.put(2, "WB RGB Levels 1");
        f21013OooO00o.put(4, "WB Type 2");
        f21013OooO00o.put(5, "WB RGB Levels 2");
        f21013OooO00o.put(7, "WB Type 3");
        f21013OooO00o.put(8, "WB RGB Levels 3");
        f21013OooO00o.put(10, "WB Type 4");
        f21013OooO00o.put(11, "WB RGB Levels 4");
        f21013OooO00o.put(13, "WB Type 5");
        f21013OooO00o.put(14, "WB RGB Levels 5");
        f21013OooO00o.put(16, "WB Type 6");
        f21013OooO00o.put(17, "WB RGB Levels 6");
        f21013OooO00o.put(19, "WB Type 7");
        f21013OooO00o.put(20, "WB RGB Levels 7");
    }

    public C7957oO0oOOO() {
        OooO00o(new C7956oO0oOO0o(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "PanasonicRaw WbInfo";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19681OooO00o() {
        return f21013OooO00o;
    }
}
