package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.drew.metadata.MetadataException;
import com.drew.metadata.jpeg.JpegComponent;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO0O0o  reason: case insensitive filesystem */
public class C8035oOO0O0o extends AbstractC7922oO0o0O0O {
    public static final int OooO = 9;
    public static final int OooO00o = -3;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21061OooO00o;
    public static final int OooO0O0 = 0;
    public static final int OooO0OO = 1;
    public static final int OooO0Oo = 3;
    public static final int OooO0o = 6;
    public static final int OooO0o0 = 5;
    public static final int OooO0oO = 7;
    public static final int OooO0oo = 8;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21061OooO00o = hashMap;
        hashMap.put(-3, "Compression Type");
        f21061OooO00o.put(0, "Data Precision");
        f21061OooO00o.put(3, "Image Width");
        f21061OooO00o.put(1, "Image Height");
        f21061OooO00o.put(5, "Number of Components");
        f21061OooO00o.put(6, "Component 1");
        f21061OooO00o.put(7, "Component 2");
        f21061OooO00o.put(8, "Component 3");
        f21061OooO00o.put(9, "Component 4");
    }

    public C8035oOO0O0o() {
        OooO00o(new C8034oOO0O0Oo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "JPEG";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19734OooO00o() {
        return f21061OooO00o;
    }

    public int OooO0OO() throws MetadataException {
        return m19631OooO00o(1);
    }

    public int OooO0Oo() throws MetadataException {
        return m19631OooO00o(3);
    }

    public int OooO0o0() throws MetadataException {
        return m19631OooO00o(5);
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    public JpegComponent OooO00o(int i) {
        return (JpegComponent) m19642OooO00o(i + 6);
    }
}
