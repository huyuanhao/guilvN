package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oOoO0  reason: case insensitive filesystem */
public class C7972oO0oOoO0 extends AbstractC7922oO0o0O0O {
    public static final int OooO = 29;
    public static final int OooO00o = 2;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21020OooO00o;
    public static final int OooO0O0 = 3;
    public static final int OooO0OO = 4;
    public static final int OooO0Oo = 8;
    public static final int OooO0o = 13;
    public static final int OooO0o0 = 9;
    public static final int OooO0oO = 20;
    public static final int OooO0oo = 25;
    public static final int OooOO0 = 31;
    public static final int OooOO0O = 32;
    public static final int OooOO0o = 33;
    public static final int OooOOO = 8192;
    public static final int OooOOO0 = 3584;
    public static final int OooOOOO = 8209;
    public static final int OooOOOo = 8210;
    public static final int OooOOo = 8244;
    public static final int OooOOo0 = 8226;
    public static final int OooOOoo = 12288;
    public static final int OooOo = 12295;
    public static final int OooOo0 = 12290;
    public static final int OooOo00 = 12289;
    public static final int OooOo0O = 12291;
    public static final int OooOo0o = 12294;
    public static final int OooOoO = 12309;
    public static final int OooOoO0 = 12308;
    public static final int OooOoOO = 12310;
    public static final int OooOoo0 = 12311;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21020OooO00o = hashMap;
        hashMap.put(2, "Thumbnail Dimensions");
        f21020OooO00o.put(3, "Thumbnail Size");
        f21020OooO00o.put(4, "Thumbnail Offset");
        f21020OooO00o.put(8, "Quality Mode");
        f21020OooO00o.put(9, "Image Size");
        f21020OooO00o.put(13, "Focus Mode");
        f21020OooO00o.put(20, "ISO Sensitivity");
        f21020OooO00o.put(25, "White Balance");
        f21020OooO00o.put(29, "Focal Length");
        f21020OooO00o.put(31, ExifInterface.o00000oO);
        f21020OooO00o.put(32, ExifInterface.o0000Ooo);
        f21020OooO00o.put(33, ExifInterface.o00000oo);
        f21020OooO00o.put(3584, "Print Image Matching (PIM) Info");
        f21020OooO00o.put(8192, "Casio Preview Thumbnail");
        f21020OooO00o.put(8209, "White Balance Bias");
        f21020OooO00o.put(8210, "White Balance");
        f21020OooO00o.put(8226, "Object Distance");
        f21020OooO00o.put(Integer.valueOf((int) OooOOo), "Flash Distance");
        f21020OooO00o.put(12288, "Record Mode");
        f21020OooO00o.put(12289, "Self Timer");
        f21020OooO00o.put(12290, "Quality");
        f21020OooO00o.put(12291, "Focus Mode");
        f21020OooO00o.put(12294, "Time Zone");
        f21020OooO00o.put(12295, "BestShot Mode");
        f21020OooO00o.put(12308, "CCD ISO Sensitivity");
        f21020OooO00o.put(12309, "Colour Mode");
        f21020OooO00o.put(12310, "Enhancement");
        f21020OooO00o.put(12311, "Filter");
    }

    public C7972oO0oOoO0() {
        OooO00o(new C7965oO0oOo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Casio Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19686OooO00o() {
        return f21020OooO00o;
    }
}
