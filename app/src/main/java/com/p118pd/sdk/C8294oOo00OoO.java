package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* renamed from: com.pd.sdk.oOo00OoO  reason: case insensitive filesystem */
public class C8294oOo00OoO extends oO0oO000 {
    @NotNull
    public static final HashMap<Integer, String> OooO00o;
    public static final int o000o0o0 = 40965;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        OooO00o = hashMap;
        oO0oO000.OooO00o(hashMap);
    }

    public C8294oOo00OoO() {
        OooO00o(new C7948oO0oO0OO(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Exif SubIFD";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19992OooO00o() {
        return OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    public Date OooO0O0() {
        return OooO0O0((TimeZone) null);
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m19991OooO00o() {
        return OooO00o((TimeZone) null);
    }

    @Nullable
    public Date OooO0O0(@Nullable TimeZone timeZone) {
        return OooO00o(oO0oO000.o000000, OooO0O0(oO0oO000.o0000o0o), timeZone);
    }

    @Nullable
    public Date OooO00o(@Nullable TimeZone timeZone) {
        return OooO00o(oO0oO000.o000000O, OooO0O0(oO0oO000.o0000o), timeZone);
    }
}
