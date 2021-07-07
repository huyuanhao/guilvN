package com.p118pd.sdk;

import kotlin.PublishedApi;
import kotlin.internal.InlineOnly;
import kotlin.text.CharCategory;
import kotlin.text.CharDirectionality;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oOo000oO  reason: case insensitive filesystem */
public class C8282oOo000oO {
    @InlineOnly
    public static final boolean OooO(char c) {
        return Character.isLetterOrDigit(c);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m19981OooO00o(char c) {
        return Character.isDefined(c);
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final boolean m19982OooO0O0(char c) {
        return Character.isDigit(c);
    }

    @InlineOnly
    public static final char OooO0OO(char c) {
        return Character.toUpperCase(c);
    }

    @InlineOnly
    public static final boolean OooO0Oo(char c) {
        return Character.isISOControl(c);
    }

    @InlineOnly
    public static final boolean OooO0o(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    @InlineOnly
    public static final boolean OooO0o0(char c) {
        return Character.isIdentifierIgnorable(c);
    }

    @InlineOnly
    public static final boolean OooO0oO(char c) {
        return Character.isJavaIdentifierStart(c);
    }

    @InlineOnly
    public static final boolean OooO0oo(char c) {
        return Character.isLetter(c);
    }

    @InlineOnly
    public static final boolean OooOO0(char c) {
        return Character.isLowSurrogate(c);
    }

    @InlineOnly
    public static final boolean OooOO0O(char c) {
        return Character.isLowerCase(c);
    }

    @InlineOnly
    public static final boolean OooOO0o(char c) {
        return Character.isTitleCase(c);
    }

    public static final boolean OooOOO(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    @InlineOnly
    public static final boolean OooOOO0(char c) {
        return Character.isUpperCase(c);
    }

    @InlineOnly
    public static final char OooO00o(char c) {
        return Character.toLowerCase(c);
    }

    @InlineOnly
    public static final char OooO0O0(char c) {
        return Character.toTitleCase(c);
    }

    @InlineOnly
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final boolean m19983OooO0OO(char c) {
        return Character.isHighSurrogate(c);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final CharCategory m19979OooO00o(char c) {
        return CharCategory.Companion.OooO00o(Character.getType(c));
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final CharDirectionality m19980OooO00o(char c) {
        return CharDirectionality.Companion.OooO00o(Character.getDirectionality(c));
    }

    public static final int OooO00o(char c, int i) {
        return Character.digit((int) c, i);
    }

    @PublishedApi
    public static final int OooO00o(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new IntRange(2, 36));
    }
}
