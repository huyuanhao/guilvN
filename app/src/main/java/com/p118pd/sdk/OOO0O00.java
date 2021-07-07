package com.p118pd.sdk;

import kotlin.jvm.JvmField;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.OOO0O00 */
public final class OOO0O00 {
    public static final OOO0O00 OooO00o = new OOO0O00();
    @JvmField
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Regex f16980OooO00o;

    static {
        String str = "[eE][+-]?" + "(\\p{Digit}+)";
        f16980OooO00o = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ('(' + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + str + ")?)|" + "(\\.(" + "(\\p{Digit}+)" + ")(" + str + ")?)|" + "((" + ("(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|" + "(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }
}
