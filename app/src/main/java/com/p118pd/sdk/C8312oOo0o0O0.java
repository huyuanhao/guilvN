package com.p118pd.sdk;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oOo0o0O0  reason: case insensitive filesystem */
public class C8312oOo0o0O0 extends Ooo0o0O {
    @InlineOnly
    public static final void OooO00o(@NotNull StringBuilder sb, int i, char c) {
        o0O0OO00.OooO0o(sb, "receiver$0");
        sb.setCharAt(i, c);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final StringBuilder OooO0O0(@NotNull StringBuilder sb) {
        o0O0OO00.OooO0o(sb, "receiver$0");
        sb.setLength(0);
        return sb;
    }

    @NotNull
    public static final Appendable OooO00o(@NotNull Appendable appendable) {
        o0O0OO00.OooO0o(appendable, "receiver$0");
        Appendable append = appendable.append(C9104ooo0ooo.f22462OooO00o);
        o0O0OO00.OooO00o((Object) append, "append(SystemProperties.LINE_SEPARATOR)");
        return append;
    }

    @InlineOnly
    public static final Appendable OooO00o(@NotNull Appendable appendable, CharSequence charSequence) {
        Appendable append = appendable.append(charSequence);
        o0O0OO00.OooO00o((Object) append, "append(value)");
        return OooO00o(append);
    }

    @InlineOnly
    public static final Appendable OooO00o(@NotNull Appendable appendable, char c) {
        Appendable append = appendable.append(c);
        o0O0OO00.OooO00o((Object) append, "append(value)");
        return OooO00o(append);
    }

    @NotNull
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb) {
        o0O0OO00.OooO0o(sb, "receiver$0");
        sb.append(C9104ooo0ooo.f22462OooO00o);
        o0O0OO00.OooO00o((Object) sb, "append(SystemProperties.LINE_SEPARATOR)");
        return sb;
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, StringBuffer stringBuffer) {
        sb.append(stringBuffer);
        o0O0OO00.OooO00o((Object) sb, "append(value)");
        return OooO00o(sb);
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, CharSequence charSequence) {
        sb.append(charSequence);
        o0O0OO00.OooO00o((Object) sb, "append(value)");
        return OooO00o(sb);
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, String str) {
        sb.append(str);
        o0O0OO00.OooO00o((Object) sb, "append(value)");
        return OooO00o(sb);
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, Object obj) {
        sb.append(obj);
        o0O0OO00.OooO00o((Object) sb, "append(value)");
        return OooO00o(sb);
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, StringBuilder sb2) {
        sb.append((CharSequence) sb2);
        o0O0OO00.OooO00o((Object) sb, "append(value)");
        return OooO00o(sb);
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, char[] cArr) {
        sb.append(cArr);
        o0O0OO00.OooO00o((Object) sb, "append(value)");
        return OooO00o(sb);
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, char c) {
        sb.append(c);
        o0O0OO00.OooO00o((Object) sb, "append(value)");
        return OooO00o(sb);
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, boolean z) {
        sb.append(z);
        o0O0OO00.OooO00o((Object) sb, "append(value)");
        return OooO00o(sb);
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, int i) {
        sb.append(i);
        o0O0OO00.OooO00o((Object) sb, "append(value)");
        return OooO00o(sb);
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, short s) {
        sb.append((int) s);
        o0O0OO00.OooO00o((Object) sb, "append(value.toInt())");
        return OooO00o(sb);
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, byte b) {
        sb.append((int) b);
        o0O0OO00.OooO00o((Object) sb, "append(value.toInt())");
        return OooO00o(sb);
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, long j) {
        sb.append(j);
        o0O0OO00.OooO00o((Object) sb, "append(value)");
        return OooO00o(sb);
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, float f) {
        sb.append(f);
        o0O0OO00.OooO00o((Object) sb, "append(value)");
        return OooO00o(sb);
    }

    @InlineOnly
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, double d) {
        sb.append(d);
        o0O0OO00.OooO00o((Object) sb, "append(value)");
        return OooO00o(sb);
    }
}
