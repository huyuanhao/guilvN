package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oO0OOOO  reason: case insensitive filesystem */
public class C7866oO0OOOO {
    public static final int OooO = 7;
    @NotNull

    /* renamed from: OooO  reason: collision with other field name */
    public static final C7866oO0OOOO f20931OooO = new C7866oO0OOOO("SLONG", 9, 4);
    @NotNull
    public static final C7866oO0OOOO OooO00o = new C7866oO0OOOO("BYTE", 1, 1);
    @NotNull
    public static final C7866oO0OOOO OooO0O0 = new C7866oO0OOOO("STRING", 2, 1);
    public static final int OooO0OO = 1;
    @NotNull

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final C7866oO0OOOO f20932OooO0OO = new C7866oO0OOOO("USHORT", 3, 2);
    public static final int OooO0Oo = 2;
    @NotNull

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final C7866oO0OOOO f20933OooO0Oo = new C7866oO0OOOO("ULONG", 4, 4);
    public static final int OooO0o = 4;
    @NotNull

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final C7866oO0OOOO f20934OooO0o = new C7866oO0OOOO("SBYTE", 6, 1);
    public static final int OooO0o0 = 3;
    @NotNull

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final C7866oO0OOOO f20935OooO0o0 = new C7866oO0OOOO("URATIONAL", 5, 8);
    public static final int OooO0oO = 5;
    @NotNull

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final C7866oO0OOOO f20936OooO0oO = new C7866oO0OOOO("UNDEFINED", 7, 1);
    public static final int OooO0oo = 6;
    @NotNull

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static final C7866oO0OOOO f20937OooO0oo = new C7866oO0OOOO("SSHORT", 8, 2);
    public static final int OooOO0 = 8;
    @NotNull

    /* renamed from: OooOO0  reason: collision with other field name */
    public static final C7866oO0OOOO f20938OooOO0 = new C7866oO0OOOO("SRATIONAL", 10, 8);
    public static final int OooOO0O = 9;
    @NotNull

    /* renamed from: OooOO0O  reason: collision with other field name */
    public static final C7866oO0OOOO f20939OooOO0O = new C7866oO0OOOO("SINGLE", 11, 4);
    public static final int OooOO0o = 10;
    @NotNull

    /* renamed from: OooOO0o  reason: collision with other field name */
    public static final C7866oO0OOOO f20940OooOO0o = new C7866oO0OOOO("DOUBLE", 12, 8);
    public static final int OooOOO = 12;
    public static final int OooOOO0 = 11;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f20941OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f20942OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int f20943OooO0O0;

    public C7866oO0OOOO(@NotNull String str, int i, int i2) {
        this.f20942OooO00o = str;
        this.f20941OooO00o = i;
        this.f20943OooO0O0 = i2;
    }

    @Nullable
    public static C7866oO0OOOO OooO00o(int i) {
        switch (i) {
            case 1:
                return OooO00o;
            case 2:
                return OooO0O0;
            case 3:
                return f20932OooO0OO;
            case 4:
                return f20933OooO0Oo;
            case 5:
                return f20935OooO0o0;
            case 6:
                return f20934OooO0o;
            case 7:
                return f20936OooO0oO;
            case 8:
                return f20937OooO0oo;
            case 9:
                return f20931OooO;
            case 10:
                return f20938OooOO0;
            case 11:
                return f20939OooOO0O;
            case 12:
                return f20940OooOO0o;
            default:
                return null;
        }
    }

    public int OooO0O0() {
        return this.f20941OooO00o;
    }

    @NotNull
    public String toString() {
        return this.f20942OooO00o;
    }

    public int OooO00o() {
        return this.f20943OooO0O0;
    }
}
