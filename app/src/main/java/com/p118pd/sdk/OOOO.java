package com.p118pd.sdk;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(name = "UStringsKt")
/* renamed from: com.pd.sdk.OOOO */
public final class OOOO {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final String OooO00o(byte b, int i) {
        String num = Integer.toString(b & 255, C8282oOo000oO.OooO00o(i));
        o0O0OO00.OooO00o((Object) num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return num;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final String OooO00o(short s, int i) {
        String num = Integer.toString(s & UShort.OooO0OO, C8282oOo000oO.OooO00o(i));
        o0O0OO00.OooO00o((Object) num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return num;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final String OooO00o(int i, int i2) {
        String l = Long.toString(((long) i) & 4294967295L, C8282oOo000oO.OooO00o(i2));
        o0O0OO00.OooO00o((Object) l, "java.lang.Long.toString(this, checkRadix(radix))");
        return l;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final String OooO00o(long j, int i) {
        return C9175oooOOooo.OooO00o(j, C8282oOo000oO.OooO00o(i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final byte OooO00o(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        UByte OooO00o = m16573OooO00o(str);
        if (OooO00o != null) {
            return OooO00o.OooO00o();
        }
        Ooo0Oo0.m16639OooO00o(str);
        throw null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final byte OooO00o(@NotNull String str, int i) {
        o0O0OO00.OooO0o(str, "receiver$0");
        UByte OooO00o = m16574OooO00o(str, i);
        if (OooO00o != null) {
            return OooO00o.OooO00o();
        }
        Ooo0Oo0.m16639OooO00o(str);
        throw null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final short m16581OooO00o(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        UShort OooO00o = m16579OooO00o(str);
        if (OooO00o != null) {
            return OooO00o.OooO00o();
        }
        Ooo0Oo0.m16639OooO00o(str);
        throw null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final short m16582OooO00o(@NotNull String str, int i) {
        o0O0OO00.OooO0o(str, "receiver$0");
        UShort OooO00o = m16580OooO00o(str, i);
        if (OooO00o != null) {
            return OooO00o.OooO00o();
        }
        Ooo0Oo0.m16639OooO00o(str);
        throw null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final int m16569OooO00o(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        UInt OooO00o = m16575OooO00o(str);
        if (OooO00o != null) {
            return OooO00o.OooO00o();
        }
        Ooo0Oo0.m16639OooO00o(str);
        throw null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final int m16570OooO00o(@NotNull String str, int i) {
        o0O0OO00.OooO0o(str, "receiver$0");
        UInt OooO00o = m16576OooO00o(str, i);
        if (OooO00o != null) {
            return OooO00o.OooO00o();
        }
        Ooo0Oo0.m16639OooO00o(str);
        throw null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m16571OooO00o(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        ULong OooO00o = m16577OooO00o(str);
        if (OooO00o != null) {
            return OooO00o.OooO00o();
        }
        Ooo0Oo0.m16639OooO00o(str);
        throw null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m16572OooO00o(@NotNull String str, int i) {
        o0O0OO00.OooO0o(str, "receiver$0");
        ULong OooO00o = m16578OooO00o(str, i);
        if (OooO00o != null) {
            return OooO00o.OooO00o();
        }
        Ooo0Oo0.m16639OooO00o(str);
        throw null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final UByte m16573OooO00o(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        return m16574OooO00o(str, 10);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final UByte m16574OooO00o(@NotNull String str, int i) {
        o0O0OO00.OooO0o(str, "receiver$0");
        UInt OooO00o = m16576OooO00o(str, i);
        if (OooO00o == null) {
            return null;
        }
        int OooO00o2 = OooO00o.OooO00o();
        if (C9175oooOOooo.OooO00o(OooO00o2, UInt.m20934OooO0O0(255)) > 0) {
            return null;
        }
        return UByte.OooO00o(UByte.OooO00o((byte) OooO00o2));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final UShort m16579OooO00o(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        return m16580OooO00o(str, 10);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final UShort m16580OooO00o(@NotNull String str, int i) {
        o0O0OO00.OooO0o(str, "receiver$0");
        UInt OooO00o = m16576OooO00o(str, i);
        if (OooO00o == null) {
            return null;
        }
        int OooO00o2 = OooO00o.OooO00o();
        if (C9175oooOOooo.OooO00o(OooO00o2, UInt.m20934OooO0O0(65535)) > 0) {
            return null;
        }
        return UShort.OooO00o(UShort.m20962OooO00o((short) OooO00o2));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final UInt m16575OooO00o(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        return m16576OooO00o(str, 10);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final UInt m16576OooO00o(@NotNull String str, int i) {
        o0O0OO00.OooO0o(str, "receiver$0");
        C8282oOo000oO.OooO00o(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int i3 = 1;
        if (charAt >= '0') {
            i3 = 0;
        } else if (length == 1 || charAt != '+') {
            return null;
        }
        int OooO0O0 = UInt.m20934OooO0O0(i);
        int OooO0O02 = C9175oooOOooo.OooO0O0(-1, OooO0O0);
        while (i3 < length) {
            int OooO00o = C8282oOo000oO.OooO00o(str.charAt(i3), i);
            if (OooO00o < 0 || C9175oooOOooo.OooO00o(i2, OooO0O02) > 0) {
                return null;
            }
            int OooO0O03 = UInt.m20934OooO0O0(i2 * OooO0O0);
            int OooO0O04 = UInt.m20934OooO0O0(UInt.m20934OooO0O0(OooO00o) + OooO0O03);
            if (C9175oooOOooo.OooO00o(OooO0O04, OooO0O03) < 0) {
                return null;
            }
            i3++;
            i2 = OooO0O04;
        }
        return UInt.OooO00o(i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final ULong m16577OooO00o(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        return m16578OooO00o(str, 10);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final ULong m16578OooO00o(@NotNull String str, int i) {
        o0O0OO00.OooO0o(str, "receiver$0");
        C8282oOo000oO.OooO00o(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (charAt < '0') {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i2 = 1;
        }
        long OooO0O0 = ((long) UInt.m20934OooO0O0(i)) & 4294967295L;
        long OooO00o = C9175oooOOooo.m20977OooO00o(-1L, ULong.m20943OooO00o(OooO0O0));
        long j = 0;
        while (i2 < length) {
            int OooO00o2 = C8282oOo000oO.OooO00o(str.charAt(i2), i);
            if (OooO00o2 < 0 || C9175oooOOooo.OooO00o(j, OooO00o) > 0) {
                return null;
            }
            long OooO00o3 = ULong.m20943OooO00o(j * ULong.m20943OooO00o(OooO0O0));
            long OooO00o4 = ULong.m20943OooO00o(ULong.m20943OooO00o(((long) UInt.m20934OooO0O0(OooO00o2)) & 4294967295L) + OooO00o3);
            if (C9175oooOOooo.OooO00o(OooO00o4, OooO00o3) < 0) {
                return null;
            }
            i2++;
            j = OooO00o4;
        }
        return ULong.OooO00o(j);
    }
}
