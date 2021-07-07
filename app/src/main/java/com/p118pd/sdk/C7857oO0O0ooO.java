package com.p118pd.sdk;

import com.drew.imaging.png.PngProcessingException;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.oO0O0ooO  reason: case insensitive filesystem */
public class C7857oO0O0ooO {
    public static final byte[] OooO00o = {-119, 80, 78, C8027oOO00oo.OooO0O0, 13, 10, 26, 10};

    public Iterable<C8926ooOOO00O> OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @Nullable Set<C7858oO0O0ooo> set) throws PngProcessingException, IOException {
        oo0o000o.OooO00o(true);
        byte[] bArr = OooO00o;
        if (Arrays.equals(bArr, oo0o000o.m19620OooO00o(bArr.length))) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                int OooO0O0 = oo0o000o.m19622OooO0O0();
                if (OooO0O0 >= 0) {
                    C7858oO0O0ooo oo0o0ooo = new C7858oO0O0ooo(oo0o000o.m19620OooO00o(4));
                    boolean z3 = set == null || set.contains(oo0o0ooo);
                    byte[] OooO00o2 = oo0o000o.m19620OooO00o(OooO0O0);
                    oo0o000o.OooO00o(4L);
                    if (!z3 || !hashSet.contains(oo0o0ooo) || oo0o0ooo.m19544OooO00o()) {
                        if (oo0o0ooo.equals(C7858oO0O0ooo.OooO00o)) {
                            z2 = true;
                        } else if (!z2) {
                            throw new PngProcessingException(String.format("First chunk should be '%s', but '%s' was observed", C7858oO0O0ooo.OooO00o, oo0o0ooo));
                        }
                        if (oo0o0ooo.equals(C7858oO0O0ooo.OooO0Oo)) {
                            z = true;
                        }
                        if (z3) {
                            arrayList.add(new C8926ooOOO00O(oo0o0ooo, OooO00o2));
                        }
                        hashSet.add(oo0o0ooo);
                    } else {
                        throw new PngProcessingException(String.format("Observed multiple instances of PNG chunk '%s', for which multiples are not allowed", oo0o0ooo));
                    }
                } else {
                    throw new PngProcessingException("PNG chunk length exceeds maximum");
                }
            }
            return arrayList;
        }
        throw new PngProcessingException("PNG signature mismatch");
    }
}
