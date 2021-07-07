package com.p118pd.sdk;

import com.drew.imaging.png.PngProcessingException;
import com.drew.lang.annotations.NotNull;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.oO0O0ooo  reason: case insensitive filesystem */
public class C7858oO0O0ooo {
    public static final C7858oO0O0ooo OooO;
    public static final C7858oO0O0ooo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Set<String> f20909OooO00o = new HashSet(Arrays.asList("IDAT", "sPLT", "iTXt", "tEXt", "zTXt"));
    public static final C7858oO0O0ooo OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final /* synthetic */ boolean f20910OooO0O0 = false;
    public static final C7858oO0O0ooo OooO0OO;
    public static final C7858oO0O0ooo OooO0Oo;
    public static final C7858oO0O0ooo OooO0o;
    public static final C7858oO0O0ooo OooO0o0;
    public static final C7858oO0O0ooo OooO0oO;
    public static final C7858oO0O0ooo OooO0oo;
    public static final C7858oO0O0ooo OooOO0;
    public static final C7858oO0O0ooo OooOO0O;
    public static final C7858oO0O0ooo OooOO0o;
    public static final C7858oO0O0ooo OooOOO;
    public static final C7858oO0O0ooo OooOOO0;
    public static final C7858oO0O0ooo OooOOOO;
    public static final C7858oO0O0ooo OooOOOo;
    public static final C7858oO0O0ooo OooOOo;
    public static final C7858oO0O0ooo OooOOo0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f20911OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f20912OooO00o;

    static {
        try {
            OooO00o = new C7858oO0O0ooo("IHDR");
            OooO0O0 = new C7858oO0O0ooo("PLTE");
            OooO0OO = new C7858oO0O0ooo("IDAT", true);
            OooO0Oo = new C7858oO0O0ooo("IEND");
            OooO0o0 = new C7858oO0O0ooo("cHRM");
            OooO0o = new C7858oO0O0ooo("gAMA");
            OooO0oO = new C7858oO0O0ooo("iCCP");
            OooO0oo = new C7858oO0O0ooo("sBIT");
            OooO = new C7858oO0O0ooo("sRGB");
            OooOO0 = new C7858oO0O0ooo("bKGD");
            OooOO0O = new C7858oO0O0ooo("hIST");
            OooOO0o = new C7858oO0O0ooo("tRNS");
            OooOOO0 = new C7858oO0O0ooo("pHYs");
            OooOOO = new C7858oO0O0ooo("sPLT", true);
            OooOOOO = new C7858oO0O0ooo("tIME");
            OooOOOo = new C7858oO0O0ooo("iTXt", true);
            OooOOo0 = new C7858oO0O0ooo("tEXt", true);
            OooOOo = new C7858oO0O0ooo("zTXt", true);
        } catch (PngProcessingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public C7858oO0O0ooo(@NotNull String str) throws PngProcessingException {
        this(str, false);
    }

    public static void OooO00o(byte[] bArr) throws PngProcessingException {
        if (bArr.length == 4) {
            for (byte b : bArr) {
                if (!OooO0OO(b)) {
                    throw new PngProcessingException("PNG chunk type identifier may only contain alphabet characters");
                }
            }
            return;
        }
        throw new PngProcessingException("PNG chunk type identifier must be four bytes in length");
    }

    public static boolean OooO00o(byte b) {
        return (b & 32) != 0;
    }

    public static boolean OooO0O0(byte b) {
        return (b & 32) == 0;
    }

    public static boolean OooO0OO(byte b) {
        return (b >= 65 && b <= 90) || (b >= 97 && b <= 122);
    }

    public boolean OooO0O0() {
        return !OooO0OO();
    }

    public boolean OooO0OO() {
        return OooO0O0(this.f20912OooO00o[0]);
    }

    public boolean OooO0Oo() {
        return OooO0O0(this.f20912OooO00o[1]);
    }

    public boolean OooO0o0() {
        return OooO00o(this.f20912OooO00o[3]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7858oO0O0ooo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f20912OooO00o, ((C7858oO0O0ooo) obj).f20912OooO00o);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f20912OooO00o);
    }

    public String toString() {
        return OooO00o();
    }

    public C7858oO0O0ooo(@NotNull String str, boolean z) throws PngProcessingException {
        this.f20911OooO00o = z;
        try {
            byte[] bytes = str.getBytes("ASCII");
            OooO00o(bytes);
            this.f20912OooO00o = bytes;
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalArgumentException("Unable to convert string code to bytes.");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19544OooO00o() {
        return this.f20911OooO00o;
    }

    public String OooO00o() {
        try {
            return new String(this.f20912OooO00o, "ASCII");
        } catch (UnsupportedEncodingException unused) {
            return "Invalid object instance";
        }
    }

    public C7858oO0O0ooo(@NotNull byte[] bArr) throws PngProcessingException {
        OooO00o(bArr);
        this.f20912OooO00o = bArr;
        this.f20911OooO00o = f20909OooO00o.contains(OooO00o());
    }
}
