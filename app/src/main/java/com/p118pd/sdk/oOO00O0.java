package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO00O0 */
public class oOO00O0 extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21047OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21047OooO00o = hashMap;
        hashMap.put(1, "File Name");
        f21047OooO00o.put(2, "File Size");
        f21047OooO00o.put(3, "File Modified Date");
    }

    public oOO00O0() {
        OooO00o(new oOO00O00(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "File";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19713OooO00o() {
        return f21047OooO00o;
    }
}
