package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOo00oo0  reason: case insensitive filesystem */
public class C8303oOo00oo0 extends AbstractC7922oO0o0O0O {
    public static final int OooO = 304;
    public static final int OooO00o = 0;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21392OooO00o;
    public static final int OooO0O0 = 256;
    public static final int OooO0OO = 272;
    public static final int OooO0Oo = 288;
    public static final int OooO0o = 290;
    public static final int OooO0o0 = 289;
    public static final int OooO0oO = 291;
    public static final int OooO0oo = 292;
    public static final int OooOO0 = 305;
    public static final int OooOO0O = 306;
    public static final int OooOO0o = 307;
    public static final int OooOOO = 784;
    public static final int OooOOO0 = 512;
    public static final int OooOOOO = 785;
    public static final int OooOOOo = 1536;
    public static final int OooOOo = 1553;
    public static final int OooOOo0 = 1537;
    public static final int OooOOoo = 1554;
    public static final int OooOo = 4097;
    public static final int OooOo0 = 1556;
    public static final int OooOo00 = 1555;
    public static final int OooOo0O = 1557;
    public static final int OooOo0o = 4096;
    public static final int OooOoO = 4113;
    public static final int OooOoO0 = 4112;
    public static final int OooOoOO = 4114;
    public static final int OooOoo = 8192;
    public static final int OooOoo0 = 4115;
    public static final int OooOooO = 8193;
    public static final int OooOooo = 8194;
    public static final int Oooo0 = 8226;
    public static final int Oooo000 = 8208;
    public static final int Oooo00O = 8224;
    public static final int Oooo00o = 8225;
    public static final int Oooo0O0 = 8227;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21392OooO00o = hashMap;
        hashMap.put(0, "Raw Info Version");
        f21392OooO00o.put(256, "WB RB Levels Used");
        f21392OooO00o.put(272, "WB RB Levels Auto");
        f21392OooO00o.put(288, "WB RB Levels Shade");
        f21392OooO00o.put(289, "WB RB Levels Cloudy");
        f21392OooO00o.put(Integer.valueOf((int) OooO0o), "WB RB Levels Fine Weather");
        f21392OooO00o.put(291, "WB RB Levels Tungsten");
        f21392OooO00o.put(Integer.valueOf((int) OooO0oo), "WB RB Levels Evening Sunlight");
        f21392OooO00o.put(304, "WB RB Levels Daylight Fluor");
        f21392OooO00o.put(305, "WB RB Levels Day White Fluor");
        f21392OooO00o.put(306, "WB RB Levels Cool White Fluor");
        f21392OooO00o.put(307, "WB RB Levels White Fluorescent");
        f21392OooO00o.put(512, "Color Matrix 2");
        f21392OooO00o.put(784, "Coring Filter");
        f21392OooO00o.put(785, "Coring Values");
        f21392OooO00o.put(1536, "Black Level 2");
        f21392OooO00o.put(1537, ExifInterface.f14180OooOo);
        f21392OooO00o.put(1553, "Valid Pixel Depth");
        f21392OooO00o.put(1554, "Crop Left");
        f21392OooO00o.put(1555, "Crop Top");
        f21392OooO00o.put(1556, "Crop Width");
        f21392OooO00o.put(1557, "Crop Height");
        f21392OooO00o.put(4096, "Light Source");
        f21392OooO00o.put(4097, "White Balance Comp");
        f21392OooO00o.put(4112, "Saturation Setting");
        f21392OooO00o.put(4113, "Hue Setting");
        f21392OooO00o.put(4114, "Contrast Setting");
        f21392OooO00o.put(4115, "Sharpness Setting");
        f21392OooO00o.put(8192, "CM Exposure Compensation");
        f21392OooO00o.put(8193, "CM White Balance");
        f21392OooO00o.put(8194, "CM White Balance Comp");
        f21392OooO00o.put(8208, "CM White Balance Gray Point");
        f21392OooO00o.put(8224, "CM Saturation");
        f21392OooO00o.put(Integer.valueOf((int) Oooo00o), "CM Hue");
        f21392OooO00o.put(8226, "CM Contrast");
        f21392OooO00o.put(Integer.valueOf((int) Oooo0O0), "CM Sharpness");
    }

    public C8303oOo00oo0() {
        OooO00o(new C8000oO0oooOO(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Olympus Raw Info";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19995OooO00o() {
        return f21392OooO00o;
    }
}
