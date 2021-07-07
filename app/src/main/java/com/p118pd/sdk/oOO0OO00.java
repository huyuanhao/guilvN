package com.p118pd.sdk;

import anet.channel.strategy.dispatch.DispatchConstants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oOO0OO00 */
public class oOO0OO00 extends Ooo0Oo0 {
    @InlineOnly
    public static final int OooO00o(@NotNull String str, char c, int i) {
        if (str != null) {
            return str.indexOf(c, i);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static final int OooO0O0(@NotNull String str, char c, int i) {
        if (str != null) {
            return str.lastIndexOf(c, i);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public static /* synthetic */ boolean OooO0OO(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return OooO0OO(str, str2, z);
    }

    @InlineOnly
    public static final String OooO0Oo(@NotNull String str) {
        if (str != null) {
            String intern = str.intern();
            o0O0OO00.OooO00o((Object) intern, "(this as java.lang.String).intern()");
            return intern;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static final String OooO0o(@NotNull String str) {
        if (str != null) {
            String upperCase = str.toUpperCase();
            o0O0OO00.OooO00o((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            return upperCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static final String OooO0o0(@NotNull String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            o0O0OO00.OooO00o((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static final int OooO00o(@NotNull String str, String str2, int i) {
        if (str != null) {
            return str.indexOf(str2, i);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static final int OooO0O0(@NotNull String str, String str2, int i) {
        if (str != null) {
            return str.lastIndexOf(str2, i);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public static final boolean OooO0OO(@NotNull String str, @NotNull String str2, boolean z) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return OooO00o(str, 0, str2, 0, str2.length(), z);
    }

    @NotNull
    public static /* synthetic */ String OooO00o(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return OooO00o(str, c, c2, z);
    }

    public static /* synthetic */ boolean OooO0O0(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return OooO0O0(str, str2, z);
    }

    @NotNull
    public static final String OooO00o(@NotNull String str, char c, char c2, boolean z) {
        o0O0OO00.OooO0o(str, "receiver$0");
        if (!z) {
            String replace = str.replace(c, c2);
            o0O0OO00.OooO00o((Object) replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return replace;
        }
        return SequencesKt___SequencesKt.OooO00o(StringsKt__StringsKt.OooO00o((CharSequence) str, new char[]{c}, z, 0, 4, (Object) null), String.valueOf(c2), null, null, 0, null, null, 62, null);
    }

    public static final boolean OooO0O0(@Nullable String str, @Nullable String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    @InlineOnly
    public static final int OooO0OO(@NotNull String str, int i) {
        if (str != null) {
            return str.codePointBefore(i);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        if (!(str.length() > 0) || !Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring != null) {
            String lowerCase = substring.toLowerCase();
            o0O0OO00.OooO00o((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            sb.append(lowerCase);
            String substring2 = str.substring(1);
            o0O0OO00.OooO00o((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    public static /* synthetic */ String OooO00o(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return OooO00o(str, str2, str3, z);
    }

    @NotNull
    public static /* synthetic */ String OooO0O0(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return OooO0O0(str, c, c2, z);
    }

    @NotNull
    public static final String OooO00o(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "oldValue");
        o0O0OO00.OooO0o(str3, "newValue");
        return SequencesKt___SequencesKt.OooO00o(StringsKt__StringsKt.OooO00o((CharSequence) str, new String[]{str2}, z, 0, 4, (Object) null), str3, null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, char c, char c2, boolean z) {
        o0O0OO00.OooO0o(str, "receiver$0");
        int OooO00o = StringsKt__StringsKt.OooO00o(str, c, 0, z, 2, (Object) null);
        return OooO00o < 0 ? str : StringsKt__StringsKt.OooO00o((CharSequence) str, OooO00o, OooO00o + 1, (CharSequence) String.valueOf(c2)).toString();
    }

    @InlineOnly
    public static final char[] OooO00o(@NotNull String str) {
        if (str != null) {
            char[] charArray = str.toCharArray();
            o0O0OO00.OooO00o((Object) charArray, "(this as java.lang.String).toCharArray()");
            return charArray;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static /* synthetic */ char[] OooO00o(String str, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        if (str != null) {
            str.getChars(i2, i3, cArr, i);
            return cArr;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    public static /* synthetic */ String OooO0O0(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return OooO0O0(str, str2, str3, z);
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "oldValue");
        o0O0OO00.OooO0o(str3, "newValue");
        int OooO00o = StringsKt__StringsKt.OooO00o((CharSequence) str, str2, 0, z, 2, (Object) null);
        return OooO00o < 0 ? str : StringsKt__StringsKt.OooO00o((CharSequence) str, OooO00o, str2.length() + OooO00o, (CharSequence) str3).toString();
    }

    @InlineOnly
    public static final char[] OooO00o(@NotNull String str, char[] cArr, int i, int i2, int i3) {
        if (str != null) {
            str.getChars(i2, i3, cArr, i);
            return cArr;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static final String OooO00o(@NotNull String str, Object... objArr) {
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        o0O0OO00.OooO00o((Object) format, "java.lang.String.format(this, *args)");
        return format;
    }

    @InlineOnly
    public static final int OooO0O0(@NotNull String str, int i) {
        if (str != null) {
            return str.codePointAt(i);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static final String OooO00o(@NotNull o0OO00O0 o0oo00o0, String str, Object... objArr) {
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        o0O0OO00.OooO00o((Object) format, "java.lang.String.format(format, *args)");
        return format;
    }

    @InlineOnly
    public static final int OooO0O0(@NotNull String str, int i, int i2) {
        if (str != null) {
            return str.offsetByCodePoints(i, i2);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static final String OooO00o(@NotNull String str, Locale locale, Object... objArr) {
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        o0O0OO00.OooO00o((Object) format, "java.lang.String.format(locale, this, *args)");
        return format;
    }

    @InlineOnly
    public static final String OooO0O0(@NotNull String str, Locale locale) {
        if (str != null) {
            String upperCase = str.toUpperCase(locale);
            o0O0OO00.OooO00o((Object) upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static final String OooO00o(@NotNull o0OO00O0 o0oo00o0, Locale locale, String str, Object... objArr) {
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        o0O0OO00.OooO00o((Object) format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str) {
        o0O0OO00.OooO0o(str, "receiver$0");
        if (!(str.length() > 0) || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring != null) {
            String upperCase = substring.toUpperCase();
            o0O0OO00.OooO00o((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            sb.append(upperCase);
            String substring2 = str.substring(1);
            o0O0OO00.OooO00o((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    public static /* synthetic */ List OooO00o(CharSequence charSequence, Pattern pattern, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return OooO00o(charSequence, pattern, i);
    }

    @NotNull
    public static final List<String> OooO00o(@NotNull CharSequence charSequence, @NotNull Pattern pattern, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(pattern, "regex");
        if (i >= 0) {
            if (i == 0) {
                i = -1;
            }
            String[] split = pattern.split(charSequence, i);
            o0O0OO00.OooO00o((Object) split, "regex.split(this, if (limit == 0) -1 else limit)");
            return C9188oooOoOoo.OooO00o((Object[]) split);
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    @InlineOnly
    public static final String OooO00o(@NotNull String str, int i) {
        if (str != null) {
            String substring = str.substring(i);
            o0O0OO00.OooO00o((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final String m19735OooO00o(@NotNull String str, int i, int i2) {
        if (str != null) {
            String substring = str.substring(i, i2);
            o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public static /* synthetic */ boolean OooO00o(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return OooO00o(str, str2, i, z);
    }

    public static final boolean OooO00o(@NotNull String str, @NotNull String str2, int i, boolean z) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return OooO00o(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m19737OooO00o(@NotNull String str, @NotNull String str2, boolean z) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return OooO00o(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    @InlineOnly
    public static final String OooO00o(byte[] bArr, int i, int i2, Charset charset) {
        return new String(bArr, i, i2, charset);
    }

    @InlineOnly
    public static final String OooO00o(byte[] bArr, Charset charset) {
        return new String(bArr, charset);
    }

    @InlineOnly
    public static final String OooO00o(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, C9097ooo00O0.f22450OooO00o);
    }

    @InlineOnly
    public static final String OooO00o(byte[] bArr) {
        return new String(bArr, C9097ooo00O0.f22450OooO00o);
    }

    @InlineOnly
    public static final String OooO00o(char[] cArr) {
        return new String(cArr);
    }

    @InlineOnly
    public static final String OooO00o(char[] cArr, int i, int i2) {
        return new String(cArr, i, i2);
    }

    @InlineOnly
    public static final String OooO00o(int[] iArr, int i, int i2) {
        return new String(iArr, i, i2);
    }

    @InlineOnly
    public static final String OooO00o(StringBuffer stringBuffer) {
        return new String(stringBuffer);
    }

    @InlineOnly
    public static final String OooO00o(StringBuilder sb) {
        return new String(sb);
    }

    @InlineOnly
    public static final int OooO00o(@NotNull String str, int i, int i2) {
        if (str != null) {
            return str.codePointCount(i, i2);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public static final int OooO00o(@NotNull String str, @NotNull String str2, boolean z) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, DispatchConstants.OTHER);
        if (z) {
            return str.compareToIgnoreCase(str2);
        }
        return str.compareTo(str2);
    }

    @InlineOnly
    public static final boolean OooO00o(@NotNull String str, CharSequence charSequence) {
        if (str != null) {
            return str.contentEquals(charSequence);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static final boolean OooO00o(@NotNull String str, StringBuffer stringBuffer) {
        if (str != null) {
            return str.contentEquals(stringBuffer);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean OooO00o(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            com.pd.sdk.oO000o0O r0 = kotlin.text.StringsKt__StringsKt.m22892OooO00o(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            com.pd.sdk.oooo0O r3 = (com.p118pd.sdk.AbstractC9218oooo0O) r3
            int r3 = r3.OooO00o()
            char r3 = r4.charAt(r3)
            boolean r3 = com.p118pd.sdk.C8282oOo000oO.OooOOO(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.oOO0OO00.OooO00o(java.lang.CharSequence):boolean");
    }

    public static /* synthetic */ boolean OooO00o(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z, int i4, Object obj) {
        return OooO00o(charSequence, i, charSequence2, i2, i3, (i4 & 16) != 0 ? false : z);
    }

    public static final boolean OooO00o(@NotNull CharSequence charSequence, int i, @NotNull CharSequence charSequence2, int i2, int i3, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, DispatchConstants.OTHER);
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return StringsKt__StringsKt.OooO0O0(charSequence, i, charSequence2, i2, i3, z);
        }
        return OooO00o((String) charSequence, i, (String) charSequence2, i2, i3, z);
    }

    public static /* synthetic */ boolean OooO00o(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        return OooO00o(str, i, str2, i2, i3, (i4 & 16) != 0 ? false : z);
    }

    public static final boolean OooO00o(@NotNull String str, int i, @NotNull String str2, int i2, int i3, boolean z) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, DispatchConstants.OTHER);
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    @InlineOnly
    public static final String OooO00o(@NotNull String str, Locale locale) {
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            o0O0OO00.OooO00o((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static final byte[] OooO00o(@NotNull String str, Charset charset) {
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            o0O0OO00.OooO00o((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static /* synthetic */ byte[] OooO00o(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C9097ooo00O0.f22450OooO00o;
        }
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            o0O0OO00.OooO00o((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Pattern m19736OooO00o(@NotNull String str, int i) {
        Pattern compile = Pattern.compile(str, i);
        o0O0OO00.OooO00o((Object) compile, "java.util.regex.Pattern.compile(this, flags)");
        return compile;
    }

    @NotNull
    public static final String OooO00o(@NotNull CharSequence charSequence, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        int i2 = 1;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                if (1 <= i) {
                    while (true) {
                        sb.append(charSequence);
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                String sb2 = sb.toString();
                o0O0OO00.OooO00o((Object) sb2, "sb.toString()");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
    }

    @NotNull
    public static final Comparator<String> OooO00o(@NotNull o0OO00O0 o0oo00o0) {
        o0O0OO00.OooO0o(o0oo00o0, "receiver$0");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        o0O0OO00.OooO00o((Object) comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    @InlineOnly
    public static /* synthetic */ Pattern OooO00o(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Pattern compile = Pattern.compile(str, i);
        o0O0OO00.OooO00o((Object) compile, "java.util.regex.Pattern.compile(this, flags)");
        return compile;
    }
}
