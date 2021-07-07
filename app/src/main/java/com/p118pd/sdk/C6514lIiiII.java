package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.lIi丨iII  reason: invalid class name and case insensitive filesystem */
public class C6514lIiiII extends lL11L1l1 {
    @Override // com.p118pd.sdk.lL11L1l1
    public AbstractC6122iIlLiL OooO00o(LlLI1 llLI1, String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return (llLI1.equals(C929811Li1.o00o0O0) || llLI1.equals(C929811Li1.o00o0OOO)) ? new L1iI1(str) : llLI1.equals(C929811Li1.oo00oO) ? new C6139iILilI(str) : (llLI1.equals(C929811Li1.o00OoOOo) || llLI1.equals(C929811Li1.o00Ooo0) || llLI1.equals(C929811Li1.o00o000O) || llLI1.equals(C929811Li1.o00o0)) ? new LI11(str) : new LII(str);
        }
        try {
            return OooO00o(str, 1);
        } catch (IOException unused) {
            throw new RuntimeException("can't recode value for oid " + llLI1.m16387OooO0O0());
        }
    }
}
