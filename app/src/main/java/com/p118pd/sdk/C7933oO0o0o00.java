package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0o0o00  reason: case insensitive filesystem */
public class C7933oO0o0o00 extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21000OooO00o;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 3;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21000OooO00o = hashMap;
        hashMap.put(0, "DCT Encode Version");
        f21000OooO00o.put(1, "Flags 0");
        f21000OooO00o.put(2, "Flags 1");
        f21000OooO00o.put(3, "Color Transform");
    }

    public C7933oO0o0o00() {
        OooO00o(new C7930oO0o0Ooo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Adobe JPEG";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19668OooO00o() {
        return f21000OooO00o;
    }
}
