package com.p118pd.sdk;

import java.io.FileInputStream;

/* renamed from: com.pd.sdk.L丨丨iI11  reason: invalid class name */
public class LiI11 {
    public static void OooO00o(String[] strArr) throws Exception {
        C5805Ll1 r2 = new C5805Ll1(new FileInputStream(strArr[0]));
        while (true) {
            AbstractC6122iIlLiL OooO00o = r2.OooO00o();
            if (OooO00o != null) {
                System.out.println(C9878I1.OooO00o(OooO00o));
            } else {
                return;
            }
        }
    }
}
