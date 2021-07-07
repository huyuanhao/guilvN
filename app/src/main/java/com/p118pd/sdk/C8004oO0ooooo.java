package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0ooooo  reason: case insensitive filesystem */
public class C8004oO0ooooo extends AbstractC7922oO0o0O0O {
    public static final int OooO = 38;
    public static final int OooO00o = 61697;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21038OooO00o;
    public static final int OooO0O0 = 0;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 12;
    public static final int OooO0o = 18;
    public static final int OooO0o0 = 14;
    public static final int OooO0oO = 22;
    public static final int OooO0oo = 36;
    public static final int OooOO0 = 40;
    public static final int OooOO0O = 42;
    public static final int OooOO0o = 72;
    public static final int OooOOO = 76;
    public static final int OooOOO0 = 74;
    public static final int OooOOOO = 78;
    public static final int OooOOOo = 80;
    public static final int OooOOo = 84;
    public static final int OooOOo0 = 82;
    public static final int OooOOoo = 86;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21038OooO00o = hashMap;
        hashMap.put(0, "Makernote Version");
        f21038OooO00o.put(2, "Firmware Version");
        f21038OooO00o.put(12, "Trigger Mode");
        f21038OooO00o.put(14, "Sequence");
        f21038OooO00o.put(18, "Event Number");
        f21038OooO00o.put(22, "Date/Time Original");
        f21038OooO00o.put(36, "Moon Phase");
        f21038OooO00o.put(38, "Ambient Temperature Fahrenheit");
        f21038OooO00o.put(40, "Ambient Temperature");
        f21038OooO00o.put(42, "Serial Number");
        f21038OooO00o.put(72, ExifInterface.o0000Ooo);
        f21038OooO00o.put(74, "Brightness");
        f21038OooO00o.put(76, ExifInterface.o00000oo);
        f21038OooO00o.put(78, ExifInterface.o00000oO);
        f21038OooO00o.put(80, "Infrared Illuminator");
        f21038OooO00o.put(82, "Motion Sensitivity");
        f21038OooO00o.put(84, "Battery Voltage");
        f21038OooO00o.put(86, "User Label");
    }

    public C8004oO0ooooo() {
        OooO00o(new C8297oOo00o00(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Reconyx HyperFire Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19701OooO00o() {
        return f21038OooO00o;
    }
}
