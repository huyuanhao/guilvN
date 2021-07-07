package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOOOo000  reason: case insensitive filesystem */
public class C8136oOOOo000 implements AbstractC7908oO0OooO0 {
    @NotNull
    public final C7925oO0o0OO0 OooO00o;

    public C8136oOOOo000(@NotNull C7925oO0o0OO0 oo0o0oo0) {
        this.OooO00o = oo0o0oo0;
    }

    @Override // com.p118pd.sdk.AbstractC7908oO0OooO0
    public void OooO00o(@NotNull String str, @NotNull byte[] bArr) {
        C8132oOOOOooo oooooooo = new C8132oOOOOooo();
        if (str.equals(C8132oOOOOooo.OooO0o0)) {
            new C7946oO0oO0O().OooO00o(new oO0Oo0(bArr), this.OooO00o);
        } else if (str.equals(C8132oOOOOooo.OooO0o)) {
            new C8023oOO00o0o().OooO00o(new oO0Oo0(bArr), this.OooO00o);
        } else if (str.equals(C8132oOOOOooo.OooO0oO)) {
            new C8138oOOOo00o().OooO00o(bArr, this.OooO00o);
        } else if (str.equals("VP8X") && bArr.length == 10) {
            oO0Oo0 oo0oo0 = new oO0Oo0(bArr);
            oo0oo0.OooO00o(false);
            try {
                boolean OooO00o2 = oo0oo0.m19600OooO00o(1);
                boolean OooO00o3 = oo0oo0.m19600OooO00o(4);
                int OooO00o4 = oo0oo0.m19595OooO00o(4);
                int OooO00o5 = oo0oo0.m19595OooO00o(7);
                oooooooo.OooO00o(2, OooO00o4 + 1);
                oooooooo.OooO00o(1, OooO00o5 + 1);
                oooooooo.OooO00o(3, OooO00o3);
                oooooooo.OooO00o(4, OooO00o2);
                this.OooO00o.OooO00o(oooooooo);
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        } else if (str.equals("VP8L") && bArr.length > 4) {
            oO0Oo0 oo0oo02 = new oO0Oo0(bArr);
            oo0oo02.OooO00o(false);
            try {
                if (oo0oo02.OooO0O0(0) == 47) {
                    short OooO0O0 = oo0oo02.m19607OooO0O0(1);
                    short OooO0O02 = oo0oo02.m19607OooO0O0(2);
                    short OooO0O03 = oo0oo02.m19607OooO0O0(3);
                    oooooooo.OooO00o(2, (OooO0O0 | ((OooO0O02 & 63) << 8)) + 1);
                    oooooooo.OooO00o(1, (((oo0oo02.m19607OooO0O0(4) & 15) << 10) | (OooO0O03 << 2) | ((OooO0O02 & 192) >> 6)) + 1);
                    this.OooO00o.OooO00o(oooooooo);
                }
            } catch (IOException e2) {
                e2.printStackTrace(System.err);
            }
        } else if (str.equals("VP8 ") && bArr.length > 9) {
            oO0Oo0 oo0oo03 = new oO0Oo0(bArr);
            oo0oo03.OooO00o(false);
            try {
                if (oo0oo03.m19607OooO0O0(3) != 157 || oo0oo03.m19607OooO0O0(4) != 1) {
                    return;
                }
                if (oo0oo03.m19607OooO0O0(5) == 42) {
                    int OooO0OO = oo0oo03.OooO0OO(6);
                    int OooO0OO2 = oo0oo03.OooO0OO(8);
                    oooooooo.OooO00o(2, OooO0OO);
                    oooooooo.OooO00o(1, OooO0OO2);
                    this.OooO00o.OooO00o(oooooooo);
                }
            } catch (IOException e3) {
                oooooooo.OooO00o(e3.getMessage());
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7908oO0OooO0
    public boolean OooO00o(@NotNull String str) {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7908oO0OooO0
    public boolean OooO0O0(@NotNull String str) {
        return str.equals("VP8X") || str.equals("VP8L") || str.equals("VP8 ") || str.equals(C8132oOOOOooo.OooO0o0) || str.equals(C8132oOOOOooo.OooO0o) || str.equals(C8132oOOOOooo.OooO0oO);
    }

    @Override // com.p118pd.sdk.AbstractC7908oO0OooO0
    public boolean OooO0OO(@NotNull String str) {
        return str.equals(C8132oOOOOooo.OooO0oo);
    }
}
