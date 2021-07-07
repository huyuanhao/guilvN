package com.p118pd.sdk;

import java.io.File;

/* renamed from: com.pd.sdk.O000OO0 */
public final class O000OO0 {
    public static final String OooO0O0(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        o0O0OO00.OooO00o((Object) sb2, "sb.toString()");
        return sb2;
    }
}
