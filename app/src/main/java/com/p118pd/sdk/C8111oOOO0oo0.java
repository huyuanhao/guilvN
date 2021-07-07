package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOOO0oo0  reason: case insensitive filesystem */
public class C8111oOOO0oo0 extends AbstractC8104oOOO0o {
    @NotNull
    public static final HashMap<Integer, String> OooO0O0;
    public static final int OooOo = 102;
    public static final int OooOo0o = 101;
    public static final int OooOoO = 104;
    public static final int OooOoO0 = 103;
    public static final int OooOoOO = 105;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        OooO0O0 = hashMap;
        AbstractC8104oOOO0o.OooO00o(hashMap);
        OooO0O0.put(101, "Format");
        OooO0O0.put(102, "Number of Channels");
        OooO0O0.put(103, "Sample Size");
        OooO0O0.put(104, "Sample Rate");
        OooO0O0.put(105, "Balance");
    }

    public C8111oOOO0oo0() {
        OooO00o(new C8112oOOO0ooO(this));
    }

    @Override // com.p118pd.sdk.C8091oOOO00Oo, com.p118pd.sdk.C8091oOOO00Oo, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "MP4 Sound";
    }

    @Override // com.p118pd.sdk.C8091oOOO00Oo, com.p118pd.sdk.C8091oOOO00Oo, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19772OooO00o() {
        return OooO0O0;
    }
}
