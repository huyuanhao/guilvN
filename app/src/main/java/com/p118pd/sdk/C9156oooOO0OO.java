package com.p118pd.sdk;

import kotlin.internal.InlineOnly;

/* renamed from: com.pd.sdk.oooOO0OO  reason: case insensitive filesystem */
public class C9156oooOO0OO extends C9154oooOO0O {
    @InlineOnly
    public static final <T> T OooO00o(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @InlineOnly
    public static final <T> T OooO0O0(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @InlineOnly
    public static final void OooO0OO(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @InlineOnly
    public static final <T> T OooO00o(T t, O00O0000<? extends Object> o00o0000) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(o00o0000.invoke().toString());
    }

    @InlineOnly
    public static final <T> T OooO0O0(T t, O00O0000<? extends Object> o00o0000) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(o00o0000.invoke().toString());
    }

    @InlineOnly
    public static final void OooO0OO(boolean z, O00O0000<? extends Object> o00o0000) {
        if (!z) {
            throw new IllegalArgumentException(o00o0000.invoke().toString());
        }
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Void m20898OooO00o(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    @InlineOnly
    public static final void OooO0O0(boolean z) {
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @InlineOnly
    public static final void OooO0O0(boolean z, O00O0000<? extends Object> o00o0000) {
        if (!z) {
            throw new IllegalStateException(o00o0000.invoke().toString());
        }
    }
}
