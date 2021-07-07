package com.p118pd.sdk;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

@JvmName(name = "ProcessKt")
/* renamed from: com.pd.sdk.oOo0000o  reason: case insensitive filesystem */
public final class C8275oOo0000o {
    @InlineOnly
    public static final Void OooO00o(int i) {
        System.exit(i);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
