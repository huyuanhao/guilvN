package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oOoo0  reason: case insensitive filesystem */
public class C7976oO0oOoo0 extends AbstractC7922oO0o0O0O {
    public static final int OooO = 24;
    public static final int OooO00o = 0;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21021OooO00o;
    public static final int OooO0O0 = 9;
    public static final int OooO0OO = 10;
    public static final int OooO0Oo = 12;
    public static final int OooO0o = 16;
    public static final int OooO0o0 = 14;
    public static final int OooO0oO = 18;
    public static final int OooO0oo = 20;
    public static final int OooOO0 = 27;
    public static final int OooOO0O = 28;
    public static final int OooOO0o = 29;
    public static final int OooOOO = 32;
    public static final int OooOOO0 = 30;
    public static final int OooOOOO = 36;
    public static final int OooOOOo = 56;
    public static final int OooOOo = 92;
    public static final int OooOOo0 = 64;
    public static final int OooOOoo = 93;
    public static final int OooOo = 102;
    public static final int OooOo0 = 96;
    public static final int OooOo00 = 94;
    public static final int OooOo0O = 98;
    public static final int OooOo0o = 100;
    public static final int OooOoO = 107;
    public static final int OooOoO0 = 104;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21021OooO00o = hashMap;
        hashMap.put(0, "Kodak Model");
        f21021OooO00o.put(9, "Quality");
        f21021OooO00o.put(10, "Burst Mode");
        f21021OooO00o.put(12, "Image Width");
        f21021OooO00o.put(14, "Image Height");
        f21021OooO00o.put(16, "Year Created");
        f21021OooO00o.put(18, "Month/Day Created");
        f21021OooO00o.put(20, "Time Created");
        f21021OooO00o.put(24, "Burst Mode 2");
        f21021OooO00o.put(27, "Shutter Speed");
        f21021OooO00o.put(28, "Metering Mode");
        f21021OooO00o.put(29, "Sequence Number");
        f21021OooO00o.put(30, "F Number");
        f21021OooO00o.put(32, "Exposure Time");
        f21021OooO00o.put(36, "Exposure Compensation");
        f21021OooO00o.put(56, "Focus Mode");
        f21021OooO00o.put(64, "White Balance");
        f21021OooO00o.put(92, "Flash Mode");
        f21021OooO00o.put(93, "Flash Fired");
        f21021OooO00o.put(94, "ISO Setting");
        f21021OooO00o.put(96, ExifInterface.o000OooO);
        f21021OooO00o.put(98, "Total Zoom");
        f21021OooO00o.put(100, "Date/Time Stamp");
        f21021OooO00o.put(102, "Color Mode");
        f21021OooO00o.put(104, "Digital Zoom");
        f21021OooO00o.put(107, ExifInterface.o00000oo);
    }

    public C7976oO0oOoo0() {
        OooO00o(new C7974oO0oOoOo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Kodak Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19687OooO00o() {
        return f21021OooO00o;
    }
}
