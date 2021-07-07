package com.p118pd.sdk;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.OOO0OO */
public class OOO0OO extends C8314oOo0o0oo {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final String OooO00o(byte b, int i) {
        String num = Integer.toString(b, C8282oOo000oO.OooO00o(C8282oOo000oO.OooO00o(i)));
        o0O0OO00.OooO00o((Object) num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return num;
    }

    @InlineOnly
    public static final int OooO0O0(@NotNull String str) {
        return Integer.parseInt(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final String OooO00o(short s, int i) {
        String num = Integer.toString(s, C8282oOo000oO.OooO00o(C8282oOo000oO.OooO00o(i)));
        o0O0OO00.OooO00o((Object) num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return num;
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final BigInteger m16568OooO0O0(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        return OooO0O0(str, 10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final String OooO00o(int i, int i2) {
        String num = Integer.toString(i, C8282oOo000oO.OooO00o(i2));
        o0O0OO00.OooO00o((Object) num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return num;
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigInteger OooO0O0(@NotNull String str, int i) {
        o0O0OO00.OooO0o(str, "receiver$0");
        C8282oOo000oO.OooO00o(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        if (length != 1) {
            if (str.charAt(0) == '-') {
                i2 = 1;
            }
            while (i2 < length) {
                if (C8282oOo000oO.OooO00o(str.charAt(i2), i) < 0) {
                    return null;
                }
                i2++;
            }
        } else if (C8282oOo000oO.OooO00o(str.charAt(0), i) < 0) {
            return null;
        }
        return new BigInteger(str, C8282oOo000oO.OooO00o(i));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final String OooO00o(long j, int i) {
        String l = Long.toString(j, C8282oOo000oO.OooO00o(i));
        o0O0OO00.OooO00o((Object) l, "java.lang.Long.toString(this, checkRadix(radix))");
        return l;
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m16566OooO00o(@NotNull String str) {
        return Boolean.parseBoolean(str);
    }

    @InlineOnly
    public static final byte OooO00o(@NotNull String str) {
        return Byte.parseByte(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final byte OooO00o(@NotNull String str, int i) {
        return Byte.parseByte(str, C8282oOo000oO.OooO00o(i));
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final short m16564OooO00o(@NotNull String str) {
        return Short.parseShort(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final short m16565OooO00o(@NotNull String str, int i) {
        return Short.parseShort(str, C8282oOo000oO.OooO00o(i));
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final BigDecimal m16567OooO0O0(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        try {
            if (OOO0O00.f16980OooO00o.matches(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final int m16556OooO00o(@NotNull String str, int i) {
        return Integer.parseInt(str, C8282oOo000oO.OooO00o(i));
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m16557OooO00o(@NotNull String str) {
        return Long.parseLong(str);
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigDecimal OooO0O0(@NotNull String str, @NotNull MathContext mathContext) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(mathContext, "mathContext");
        try {
            if (OOO0O00.f16980OooO00o.matches(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m16558OooO00o(@NotNull String str, int i) {
        return Long.parseLong(str, C8282oOo000oO.OooO00o(i));
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final float m16555OooO00o(@NotNull String str) {
        return Float.parseFloat(str);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final double m16554OooO00o(@NotNull String str) {
        return Double.parseDouble(str);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final BigInteger m16562OooO00o(@NotNull String str) {
        return new BigInteger(str);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final BigInteger m16563OooO00o(@NotNull String str, int i) {
        return new BigInteger(str, C8282oOo000oO.OooO00o(i));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final BigDecimal m16561OooO00o(@NotNull String str) {
        return new BigDecimal(str);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigDecimal OooO00o(@NotNull String str, MathContext mathContext) {
        return new BigDecimal(str, mathContext);
    }

    public static final <T> T OooO00o(String str, O00O0OOO<? super String, ? extends T> o00o0ooo) {
        try {
            if (OOO0O00.f16980OooO00o.matches(str)) {
                return (T) o00o0ooo.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Float m16560OooO00o(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        try {
            if (OOO0O00.f16980OooO00o.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Double m16559OooO00o(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        try {
            if (OOO0O00.f16980OooO00o.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
