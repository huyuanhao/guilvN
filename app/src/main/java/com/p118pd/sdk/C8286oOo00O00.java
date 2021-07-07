package com.p118pd.sdk;

import java.nio.charset.Charset;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

@JvmName(name = "CharsetsKt")
/* renamed from: com.pd.sdk.oOo00O00  reason: case insensitive filesystem */
public final class C8286oOo00O00 {
    @InlineOnly
    public static final Charset OooO00o(String str) {
        Charset forName = Charset.forName(str);
        o0O0OO00.OooO00o((Object) forName, "Charset.forName(charsetName)");
        return forName;
    }
}
