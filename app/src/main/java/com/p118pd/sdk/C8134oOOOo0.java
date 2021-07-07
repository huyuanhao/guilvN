package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.oOOOo0  reason: case insensitive filesystem */
public class C8134oOOOo0 {
    public static boolean OooO00o(OutputStream outputStream, C7925oO0o0OO0 oo0o0oo0) {
        C8137oOOOo00O ooooo00o = (C8137oOOOo00O) oo0o0oo0.OooO00o(C8137oOOOo00O.class);
        if (ooooo00o == null) {
            return false;
        }
        try {
            C7415o0OOo00.OooO00o(ooooo00o.OooO00o(), outputStream, new C7456o0Oo0O00().OooO0o0(true));
            return true;
        } catch (XMPException e) {
            e.printStackTrace();
            return false;
        }
    }
}
