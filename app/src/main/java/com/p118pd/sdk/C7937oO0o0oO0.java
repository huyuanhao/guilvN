package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.IOException;

/* renamed from: com.pd.sdk.oO0o0oO0  reason: case insensitive filesystem */
public class C7937oO0o0oO0 implements AbstractC7908oO0OooO0 {
    @NotNull
    public final C7935oO0o0o0o OooO00o;

    public C7937oO0o0oO0(@NotNull C7925oO0o0OO0 oo0o0oo0) {
        C7935oO0o0o0o oo0o0o0o = new C7935oO0o0o0o();
        this.OooO00o = oo0o0o0o;
        oo0o0oo0.OooO00o(oo0o0o0o);
    }

    @Override // com.p118pd.sdk.AbstractC7908oO0OooO0
    public boolean OooO00o(@NotNull String str) {
        return str.equals(C7935oO0o0o0o.f21004OooO0Oo) || str.equals(C7935oO0o0o0o.f21006OooO0o0) || str.equals(C7935oO0o0o0o.f21005OooO0o);
    }

    @Override // com.p118pd.sdk.AbstractC7908oO0OooO0
    public boolean OooO0O0(@NotNull String str) {
        return str.equals(C7935oO0o0o0o.f21002OooO0O0) || str.equals(C7935oO0o0o0o.f21003OooO0OO);
    }

    @Override // com.p118pd.sdk.AbstractC7908oO0OooO0
    public boolean OooO0OO(@NotNull String str) {
        return str.equals(C7935oO0o0o0o.f21005OooO0o);
    }

    @Override // com.p118pd.sdk.AbstractC7908oO0OooO0
    public void OooO00o(@NotNull String str, @NotNull byte[] bArr) {
        try {
            if (str.equals(C7935oO0o0o0o.f21002OooO0O0)) {
                oO0Oo0 oo0oo0 = new oO0Oo0(bArr);
                oo0oo0.OooO00o(false);
                String str2 = new String(oo0oo0.m19568OooO00o(0, 4));
                String str3 = new String(oo0oo0.m19568OooO00o(4, 4));
                float OooO00o2 = oo0oo0.m19594OooO00o(20);
                float OooO00o3 = oo0oo0.m19594OooO00o(24);
                int OooO0O0 = oo0oo0.m19604OooO0O0(32);
                if (str2.equals("vids")) {
                    if (!this.OooO00o.m19650OooO00o(1)) {
                        float f = OooO00o3 / OooO00o2;
                        this.OooO00o.OooO00o(1, (double) f);
                        double d = (double) (((float) OooO0O0) / f);
                        int i = (int) d;
                        Integer valueOf = Integer.valueOf(i / ((int) Math.pow(60.0d, 2.0d)));
                        Integer valueOf2 = Integer.valueOf((i / ((int) Math.pow(60.0d, 1.0d))) - (valueOf.intValue() * 60));
                        double pow = Math.pow(60.0d, AbstractC8352oOoOOoO0.OooO0O0);
                        Double.isNaN(d);
                        double d2 = d / pow;
                        double intValue = (double) (valueOf2.intValue() * 60);
                        Double.isNaN(intValue);
                        this.OooO00o.m19648OooO00o(3, String.format("%1$02d:%2$02d:%3$02d", valueOf, valueOf2, Integer.valueOf((int) Math.round(d2 - intValue))));
                        this.OooO00o.m19648OooO00o(4, str3);
                    }
                } else if (str2.equals("auds") && !this.OooO00o.m19650OooO00o(2)) {
                    this.OooO00o.OooO00o(2, (double) (OooO00o3 / OooO00o2));
                }
            } else if (str.equals(C7935oO0o0o0o.f21003OooO0OO)) {
                oO0Oo0 oo0oo02 = new oO0Oo0(bArr);
                oo0oo02.OooO00o(false);
                int OooO0O02 = oo0oo02.m19604OooO0O0(24);
                int OooO0O03 = oo0oo02.m19604OooO0O0(32);
                int OooO0O04 = oo0oo02.m19604OooO0O0(36);
                this.OooO00o.OooO00o(6, OooO0O03);
                this.OooO00o.OooO00o(7, OooO0O04);
                this.OooO00o.OooO00o(8, OooO0O02);
            }
        } catch (IOException e) {
            this.OooO00o.OooO00o(e.getMessage());
        }
    }
}
