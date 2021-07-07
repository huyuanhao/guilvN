package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oOo0O  reason: case insensitive filesystem */
public class C7970oO0oOo0O extends AbstractC7922oO0o0O0O {
    public static final int OooO = 9;
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21019OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 4;
    public static final int OooO0o = 6;
    public static final int OooO0o0 = 5;
    public static final int OooO0oO = 7;
    public static final int OooO0oo = 8;
    public static final int OooOO0 = 10;
    public static final int OooOO0O = 11;
    public static final int OooOO0o = 12;
    public static final int OooOOO = 14;
    public static final int OooOOO0 = 13;
    public static final int OooOOOO = 15;
    public static final int OooOOOo = 16;
    public static final int OooOOo = 18;
    public static final int OooOOo0 = 17;
    public static final int OooOOoo = 19;
    public static final int OooOo00 = 20;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21019OooO00o = hashMap;
        hashMap.put(20, "CCD Sensitivity");
        f21019OooO00o.put(12, ExifInterface.o0000Ooo);
        f21019OooO00o.put(10, "Digital Zoom");
        f21019OooO00o.put(5, "Flash Intensity");
        f21019OooO00o.put(4, "Flash Mode");
        f21019OooO00o.put(3, "Focusing Mode");
        f21019OooO00o.put(6, "Object Distance");
        f21019OooO00o.put(2, "Quality");
        f21019OooO00o.put(1, "Recording Mode");
        f21019OooO00o.put(13, ExifInterface.o00000oO);
        f21019OooO00o.put(11, ExifInterface.o00000oo);
        f21019OooO00o.put(8, "Makernote Unknown 1");
        f21019OooO00o.put(9, "Makernote Unknown 2");
        f21019OooO00o.put(14, "Makernote Unknown 3");
        f21019OooO00o.put(15, "Makernote Unknown 4");
        f21019OooO00o.put(16, "Makernote Unknown 5");
        f21019OooO00o.put(17, "Makernote Unknown 6");
        f21019OooO00o.put(18, "Makernote Unknown 7");
        f21019OooO00o.put(19, "Makernote Unknown 8");
        f21019OooO00o.put(7, "White Balance");
    }

    public C7970oO0oOo0O() {
        OooO00o(new C7966oO0oOo0(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Casio Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19685OooO00o() {
        return f21019OooO00o;
    }
}
