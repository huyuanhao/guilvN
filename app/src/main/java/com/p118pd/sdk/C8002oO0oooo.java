package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oooo  reason: case insensitive filesystem */
public class C8002oO0oooo extends AbstractC7922oO0o0O0O {
    public static final int OooO = 13;
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21037OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 4;
    public static final int OooO0o = 10;
    public static final int OooO0o0 = 7;
    public static final int OooO0oO = 11;
    public static final int OooO0oo = 12;
    public static final int OooOO0 = 20;
    public static final int OooOO0O = 23;
    public static final int OooOO0o = 3584;
    public static final int OooOOO = 4097;
    public static final int OooOOO0 = 4096;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21037OooO00o = hashMap;
        hashMap.put(1, "Capture Mode");
        f21037OooO00o.put(2, "Quality Level");
        f21037OooO00o.put(3, "Focus Mode");
        f21037OooO00o.put(4, "Flash Mode");
        f21037OooO00o.put(7, "White Balance");
        f21037OooO00o.put(10, "Digital Zoom");
        f21037OooO00o.put(11, ExifInterface.o00000oo);
        f21037OooO00o.put(12, ExifInterface.o0000Ooo);
        f21037OooO00o.put(13, ExifInterface.o00000oO);
        f21037OooO00o.put(20, "ISO Speed");
        f21037OooO00o.put(23, "Colour");
        f21037OooO00o.put(3584, "Print Image Matching (PIM) Info");
        f21037OooO00o.put(4096, "Time Zone");
        f21037OooO00o.put(4097, "Daylight Savings");
    }

    public C8002oO0oooo() {
        OooO00o(new C8003oO0oooo0(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Pentax Makernote";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19700OooO00o() {
        return f21037OooO00o;
    }
}
