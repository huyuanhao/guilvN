package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.metadata.MetadataException;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO0O00O */
public class oOO0O00O extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 5;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21059OooO00o;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21059OooO00o = hashMap;
        hashMap.put(5, "Extension Code");
    }

    public oOO0O00O() {
        OooO00o(new oOO0O000(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return C8032oOO0O00o.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19732OooO00o() {
        return f21059OooO00o;
    }

    public int OooO0OO() throws MetadataException {
        return m19631OooO00o(5);
    }
}
