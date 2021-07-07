package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.o0o0OoO0  reason: case insensitive filesystem */
public final class C7606o0o0OoO0 {
    public static final String OooO00o = "ro.miui.ui.version.code";
    public static final String OooO0O0 = "ro.miui.ui.version.name";
    public static final String OooO0OO = "ro.miui.internal.storage";

    public static boolean OooO00o() {
        try {
            C7576o0o0O OooO00o2 = C7576o0o0O.OooO00o();
            if (OooO00o2.OooO00o("ro.miui.ui.version.code", null) == null && OooO00o2.OooO00o("ro.miui.ui.version.name", null) == null && OooO00o2.OooO00o("ro.miui.internal.storage", null) == null) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
