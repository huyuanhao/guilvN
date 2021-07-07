package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO000o0  reason: case insensitive filesystem */
public class C8009oOO000o0 extends AbstractC7922oO0o0O0O {
    public static final int OooO = 10;
    public static final int OooO00o = 2;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21045OooO00o;
    public static final int OooO0O0 = 3;
    public static final int OooO0OO = 4;
    public static final int OooO0Oo = 5;
    public static final int OooO0o = 7;
    public static final int OooO0o0 = 6;
    public static final int OooO0oO = 8;
    public static final int OooO0oo = 9;
    public static final int OooOO0 = 11;
    public static final int OooOO0O = 12;
    public static final int OooOO0o = 13;
    public static final int OooOOO = 15;
    public static final int OooOOO0 = 14;
    public static final int OooOOOO = 16;
    public static final int OooOOOo = 17;
    public static final int OooOOo = 20;
    public static final int OooOOo0 = 18;
    public static final int OooOOoo = 21;
    public static final int OooOo0 = 23;
    public static final int OooOo00 = 22;
    public static final int OooOo0O = 24;
    public static final int OooOo0o = 25;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21045OooO00o = hashMap;
        hashMap.put(2, "Serial Number");
        f21045OooO00o.put(3, "Drive Mode");
        f21045OooO00o.put(4, "Resolution Mode");
        f21045OooO00o.put(5, "Auto Focus Mode");
        f21045OooO00o.put(6, "Focus Setting");
        f21045OooO00o.put(7, "White Balance");
        f21045OooO00o.put(8, "Exposure Mode");
        f21045OooO00o.put(9, "Metering Mode");
        f21045OooO00o.put(10, "Lens Range");
        f21045OooO00o.put(11, "Color Space");
        f21045OooO00o.put(12, "Exposure");
        f21045OooO00o.put(13, ExifInterface.o0000Ooo);
        f21045OooO00o.put(14, "Shadow");
        f21045OooO00o.put(15, "Highlight");
        f21045OooO00o.put(16, ExifInterface.o00000oO);
        f21045OooO00o.put(17, ExifInterface.o00000oo);
        f21045OooO00o.put(18, "Fill Light");
        f21045OooO00o.put(20, "Color Adjustment");
        f21045OooO00o.put(21, "Adjustment Mode");
        f21045OooO00o.put(22, "Quality");
        f21045OooO00o.put(23, "Firmware");
        f21045OooO00o.put(24, ExifInterface.f14201OooOooO);
        f21045OooO00o.put(25, "Auto Bracket");
    }

    public C8009oOO000o0() {
        OooO00o(new C8007oOO000Oo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Sigma Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19709OooO00o() {
        return f21045OooO00o;
    }
}
