package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.metadata.MetadataException;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO0 */
public class oOO0 extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 5;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21039OooO00o;
    public static final int OooO0O0 = 7;
    public static final int OooO0OO = 8;
    public static final int OooO0Oo = 10;
    public static final int OooO0o = 13;
    public static final int OooO0o0 = 12;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21039OooO00o = hashMap;
        hashMap.put(5, AbstractC7726o0ooOOoo.OooO0o0);
        f21039OooO00o.put(7, "Resolution Units");
        f21039OooO00o.put(10, "Y Resolution");
        f21039OooO00o.put(8, "X Resolution");
        f21039OooO00o.put(12, "Thumbnail Width Pixels");
        f21039OooO00o.put(13, "Thumbnail Height Pixels");
    }

    public oOO0() {
        OooO00o(new C8029oOO00ooO(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return C9272ooooOoOO.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19703OooO00o() {
        return f21039OooO00o;
    }

    @Deprecated
    public int OooO0OO() throws MetadataException {
        return m19631OooO00o(8);
    }

    @Deprecated
    public int OooO0Oo() throws MetadataException {
        return m19631OooO00o(10);
    }

    public int OooO0o() throws MetadataException {
        return m19631OooO00o(8);
    }

    public int OooO0o0() throws MetadataException {
        return m19631OooO00o(7);
    }

    public int OooO0oO() throws MetadataException {
        return m19631OooO00o(10);
    }

    public int OooO0oo() throws MetadataException {
        return m19631OooO00o(5);
    }
}
