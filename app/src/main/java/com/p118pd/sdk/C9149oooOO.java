package com.p118pd.sdk;

import kotlin.internal.InlineOnly;

/* renamed from: com.pd.sdk.oooOO  reason: case insensitive filesystem */
public class C9149oooOO extends C9160oooOO0oo {
    @InlineOnly
    public static final <R> R OooO00o(Object obj, O00O0000<? extends R> o00o0000) {
        R r;
        synchronized (obj) {
            try {
                r = (R) o00o0000.invoke();
                o0O0O0OO.OooO0O0(1);
            } catch (Throwable th) {
                o0O0O0OO.OooO0O0(1);
                o0O0O0OO.OooO00o(1);
                throw th;
            }
        }
        o0O0O0OO.OooO00o(1);
        return r;
    }
}
