package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOOOO0Oo  reason: case insensitive filesystem */
public class C8118oOOOO0Oo extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21124OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21124OooO00o = hashMap;
        hashMap.put(1, "Quality");
        f21124OooO00o.put(2, "Comment");
        f21124OooO00o.put(3, ExifInterface.f14209Oooo000);
    }

    public C8118oOOOO0Oo() {
        OooO00o(new C7929oO0o0OoO(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return C8120oOOOO0o0.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19778OooO00o() {
        return f21124OooO00o;
    }
}
