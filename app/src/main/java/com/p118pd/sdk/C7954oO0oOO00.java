package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oOO00  reason: case insensitive filesystem */
public class C7954oO0oOO00 extends AbstractC7922oO0o0O0O {
    public static final int OooO = 9;
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21011OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 4;
    public static final int OooO0o = 6;
    public static final int OooO0o0 = 5;
    public static final int OooO0oO = 7;
    public static final int OooO0oo = 8;
    public static final int OooOO0 = 10;
    public static final int OooOO0O = 14;
    public static final int OooOO0o = 15;
    public static final int OooOOO = 17;
    public static final int OooOOO0 = 16;
    public static final int OooOOOO = 18;
    public static final int OooOOOo = 19;
    public static final int OooOOo = 24;
    public static final int OooOOo0 = 23;
    public static final int OooOOoo = 25;
    public static final int OooOo = 36;
    public static final int OooOo0 = 28;
    public static final int OooOo00 = 26;
    public static final int OooOo0O = 29;
    public static final int OooOo0o = 30;
    public static final int OooOoO = 38;
    public static final int OooOoO0 = 37;
    public static final int OooOoOO = 39;
    public static final int OooOoo = 47;
    public static final int OooOoo0 = 46;
    public static final int OooOooO = 48;
    public static final int OooOooo = 49;
    public static final int Oooo0 = 273;
    public static final int Oooo000 = 50;
    public static final int Oooo00O = 271;
    public static final int Oooo00o = 272;
    public static final int Oooo0O0 = 274;
    public static final int Oooo0OO = 278;
    public static final int Oooo0o = 280;
    public static final int Oooo0o0 = 279;
    public static final int Oooo0oO = 281;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21011OooO00o = hashMap;
        hashMap.put(1, "Panasonic Raw Version");
        f21011OooO00o.put(2, "Sensor Width");
        f21011OooO00o.put(3, "Sensor Height");
        f21011OooO00o.put(4, "Sensor Top Border");
        f21011OooO00o.put(5, "Sensor Left Border");
        f21011OooO00o.put(6, "Sensor Bottom Border");
        f21011OooO00o.put(7, "Sensor Right Border");
        f21011OooO00o.put(8, "Black Level 1");
        f21011OooO00o.put(9, "Black Level 2");
        f21011OooO00o.put(10, "Black Level 3");
        f21011OooO00o.put(14, "Linearity Limit Red");
        f21011OooO00o.put(15, "Linearity Limit Green");
        f21011OooO00o.put(16, "Linearity Limit Blue");
        f21011OooO00o.put(17, "Red Balance");
        f21011OooO00o.put(18, "Blue Balance");
        f21011OooO00o.put(23, ExifInterface.o000OooO);
        f21011OooO00o.put(24, "High ISO Multiplier Red");
        f21011OooO00o.put(25, "High ISO Multiplier Green");
        f21011OooO00o.put(26, "High ISO Multiplier Blue");
        f21011OooO00o.put(28, "Black Level Red");
        f21011OooO00o.put(29, "Black Level Green");
        f21011OooO00o.put(30, "Black Level Blue");
        f21011OooO00o.put(36, "WB Red Level");
        f21011OooO00o.put(37, "WB Green Level");
        f21011OooO00o.put(38, "WB Blue Level");
        f21011OooO00o.put(46, "Jpg From Raw");
        f21011OooO00o.put(47, "Crop Top");
        f21011OooO00o.put(48, "Crop Left");
        f21011OooO00o.put(49, "Crop Bottom");
        f21011OooO00o.put(50, "Crop Right");
        f21011OooO00o.put(271, ExifInterface.f14199OooOoo0);
        f21011OooO00o.put(272, ExifInterface.f14197OooOoo);
        f21011OooO00o.put(273, "Strip Offsets");
        f21011OooO00o.put(274, ExifInterface.f14146OooO0oo);
        f21011OooO00o.put(278, "Rows Per Strip");
        f21011OooO00o.put(279, "Strip Byte Counts");
        f21011OooO00o.put(280, "Raw Data Offset");
    }

    public C7954oO0oOO00() {
        OooO00o(new C7973oO0oOoOO(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "PanasonicRaw Exif IFD0";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19679OooO00o() {
        return f21011OooO00o;
    }
}
