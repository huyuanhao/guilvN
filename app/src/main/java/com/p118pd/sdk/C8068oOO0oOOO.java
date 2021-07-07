package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO0oOOO  reason: case insensitive filesystem */
public class C8068oOO0oOOO extends oOO0OOOO {
    @NotNull
    public static final HashMap<Integer, String> OooO0O0;
    public static final int OooOOo = 769;
    public static final int OooOOoo = 770;
    public static final int OooOo0 = 772;
    public static final int OooOo00 = 771;
    public static final int OooOo0O = 773;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        OooO0O0 = hashMap;
        AbstractC8064oOO0oO0O.OooO00o(hashMap);
        OooO0O0.put(769, "Format");
        OooO0O0.put(770, "Number of Channels");
        OooO0O0.put(771, "Sample Size");
        OooO0O0.put(772, "Sample Rate");
        OooO0O0.put(773, "Balance");
    }

    public C8068oOO0oOOO() {
        OooO00o(new C8066oOO0oOO(this));
    }

    @Override // com.p118pd.sdk.oOO0OOOO, com.p118pd.sdk.oOO0OOOO, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "QuickTime Sound";
    }

    @Override // com.p118pd.sdk.oOO0OOOO, com.p118pd.sdk.oOO0OOOO, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19741OooO00o() {
        return OooO0O0;
    }
}
