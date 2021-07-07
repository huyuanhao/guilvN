package com.p118pd.sdk;

import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨L丨lIL  reason: invalid class name and case insensitive filesystem */
public class C9558LlIL {
    public static final Set<String> OooO00o;

    static {
        HashSet hashSet = new HashSet();
        OooO00o = hashSet;
        hashSet.add("DES");
        OooO00o.add("DESEDE");
        OooO00o.add(AbstractC9733l.OooO0o0.m16387OooO0O0());
        OooO00o.add(AbstractC5711LiLli.OoooOoo.m16387OooO0O0());
        OooO00o.add(AbstractC5711LiLli.OoooOoo.m16387OooO0O0());
        OooO00o.add(AbstractC5711LiLli.o000oo00.m16387OooO0O0());
    }

    public static void OooO00o(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            bArr[i] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & 254));
        }
    }

    public static boolean OooO00o(String str) {
        return OooO00o.contains(Strings.OooO0O0(str));
    }
}
