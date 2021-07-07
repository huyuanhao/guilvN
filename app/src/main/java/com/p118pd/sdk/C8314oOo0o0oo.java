package com.p118pd.sdk;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oOo0o0oo  reason: case insensitive filesystem */
public class C8314oOo0o0oo extends C8312oOo0o0O0 {
    @InlineOnly
    public static final String OooO00o(O00O0OOO<? super StringBuilder, C9174oooOOooO> o00o0ooo) {
        StringBuilder sb = new StringBuilder();
        o00o0ooo.invoke(sb);
        String sb2 = sb.toString();
        o0O0OO00.OooO00o((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final String OooO00o(int i, O00O0OOO<? super StringBuilder, C9174oooOOooO> o00o0ooo) {
        StringBuilder sb = new StringBuilder(i);
        o00o0ooo.invoke(sb);
        String sb2 = sb.toString();
        o0O0OO00.OooO00o((Object) sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @NotNull
    public static final <T extends Appendable> T OooO00o(@NotNull T t, @NotNull CharSequence... charSequenceArr) {
        o0O0OO00.OooO0o(t, "receiver$0");
        o0O0OO00.OooO0o(charSequenceArr, "value");
        for (CharSequence charSequence : charSequenceArr) {
            t.append(charSequence);
        }
        return t;
    }

    @NotNull
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, @NotNull String... strArr) {
        o0O0OO00.OooO0o(sb, "receiver$0");
        o0O0OO00.OooO0o(strArr, "value");
        for (String str : strArr) {
            sb.append(str);
        }
        return sb;
    }

    @NotNull
    public static final StringBuilder OooO00o(@NotNull StringBuilder sb, @NotNull Object... objArr) {
        o0O0OO00.OooO0o(sb, "receiver$0");
        o0O0OO00.OooO0o(objArr, "value");
        for (Object obj : objArr) {
            sb.append(obj);
        }
        return sb;
    }

    public static final <T> void OooO00o(@NotNull Appendable appendable, T t, @Nullable O00O0OOO<? super T, ? extends CharSequence> o00o0ooo) {
        o0O0OO00.OooO0o(appendable, "receiver$0");
        if (o00o0ooo != null) {
            appendable.append((CharSequence) o00o0ooo.invoke(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append(t);
        } else if (t instanceof Character) {
            appendable.append(t.charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
