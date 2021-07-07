package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOOO0o0o  reason: case insensitive filesystem */
public class C8107oOOO0o0o extends AbstractC8104oOOO0o {
    @NotNull
    public static final HashMap<Integer, String> OooO0O0;
    public static final int OooOo = 102;
    public static final int OooOo0o = 101;
    public static final int OooOoO = 104;
    public static final int OooOoO0 = 103;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        OooO0O0 = hashMap;
        AbstractC8104oOOO0o.OooO00o(hashMap);
        OooO0O0.put(101, "Max PDU Size");
        OooO0O0.put(102, "Average PDU Size");
        OooO0O0.put(103, "Max Bitrate");
        OooO0O0.put(104, "Average Bitrate");
    }

    public C8107oOOO0o0o() {
        OooO00o(new C8106oOOO0o0O(this));
    }

    @Override // com.p118pd.sdk.C8091oOOO00Oo, com.p118pd.sdk.C8091oOOO00Oo, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "MP4 Hint";
    }

    @Override // com.p118pd.sdk.C8091oOOO00Oo, com.p118pd.sdk.C8091oOOO00Oo, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19769OooO00o() {
        return OooO0O0;
    }
}
