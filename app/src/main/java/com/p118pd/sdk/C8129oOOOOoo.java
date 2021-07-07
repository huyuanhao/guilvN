package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.metadata.MetadataException;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOOOOoo  reason: case insensitive filesystem */
public class C8129oOOOOoo implements AbstractC7908oO0OooO0 {
    @NotNull
    public final C8130oOOOOoo0 OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21134OooO00o = "";

    public C8129oOOOOoo(@NotNull C7925oO0o0OO0 oo0o0oo0) {
        C8130oOOOOoo0 ooooooo0 = new C8130oOOOOoo0();
        this.OooO00o = ooooooo0;
        oo0o0oo0.OooO00o(ooooooo0);
    }

    @Override // com.p118pd.sdk.AbstractC7908oO0OooO0
    public boolean OooO00o(@NotNull String str) {
        if (str.equals(C8130oOOOOoo0.f21140OooO0Oo)) {
            this.f21134OooO00o = C8130oOOOOoo0.f21140OooO0Oo;
            return true;
        }
        this.f21134OooO00o = "";
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7908oO0OooO0
    public boolean OooO0O0(@NotNull String str) {
        return str.equals(C8130oOOOOoo0.f21136OooO0O0) || (this.f21134OooO00o.equals(C8130oOOOOoo0.f21140OooO0Oo) && C8130oOOOOoo0.f21137OooO0O0.containsKey(str)) || str.equals("data");
    }

    @Override // com.p118pd.sdk.AbstractC7908oO0OooO0
    public boolean OooO0OO(@NotNull String str) {
        return str.equals(C8130oOOOOoo0.f21141OooO0o0);
    }

    @Override // com.p118pd.sdk.AbstractC7908oO0OooO0
    public void OooO00o(@NotNull String str, @NotNull byte[] bArr) {
        try {
            if (str.equals(C8130oOOOOoo0.f21136OooO0O0)) {
                oO0Oo0 oo0oo0 = new oO0Oo0(bArr);
                oo0oo0.OooO00o(false);
                short OooO00o2 = oo0oo0.m19598OooO00o(0);
                short OooO00o3 = oo0oo0.m19598OooO00o(2);
                int OooO0O0 = oo0oo0.m19604OooO0O0(4);
                int OooO0O02 = oo0oo0.m19604OooO0O0(8);
                short OooO00o4 = oo0oo0.m19598OooO00o(12);
                if (OooO00o2 == 1) {
                    this.OooO00o.OooO00o(6, (int) oo0oo0.m19598OooO00o(14));
                    this.OooO00o.m19648OooO00o(1, C8130oOOOOoo0.f21139OooO0OO.get(Integer.valueOf(OooO00o2)));
                } else if (C8130oOOOOoo0.f21139OooO0OO.containsKey(Integer.valueOf(OooO00o2))) {
                    this.OooO00o.m19648OooO00o(1, C8130oOOOOoo0.f21139OooO0OO.get(Integer.valueOf(OooO00o2)));
                } else {
                    this.OooO00o.m19648OooO00o(1, "Unknown");
                }
                this.OooO00o.OooO00o(2, (int) OooO00o3);
                this.OooO00o.OooO00o(3, OooO0O0);
                this.OooO00o.OooO00o(4, OooO0O02);
                this.OooO00o.OooO00o(5, (int) OooO00o4);
            } else if (str.equals("data")) {
                try {
                    if (this.OooO00o.m19650OooO00o(4)) {
                        double length = (double) bArr.length;
                        double OooO00o5 = this.OooO00o.OooO00o(4);
                        Double.isNaN(length);
                        double d = length / OooO00o5;
                        int i = (int) d;
                        Integer valueOf = Integer.valueOf(i / ((int) Math.pow(60.0d, 2.0d)));
                        Integer valueOf2 = Integer.valueOf((i / ((int) Math.pow(60.0d, 1.0d))) - (valueOf.intValue() * 60));
                        double pow = d / Math.pow(60.0d, AbstractC8352oOoOOoO0.OooO0O0);
                        double intValue = (double) (valueOf2.intValue() * 60);
                        Double.isNaN(intValue);
                        this.OooO00o.m19648OooO00o(16, String.format("%1$02d:%2$02d:%3$02d", valueOf, valueOf2, Integer.valueOf((int) Math.round(pow - intValue))));
                    }
                } catch (MetadataException unused) {
                    this.OooO00o.OooO00o("Error calculating duration: bytes per second not found");
                }
            } else if (C8130oOOOOoo0.f21137OooO0O0.containsKey(str)) {
                this.OooO00o.m19648OooO00o(C8130oOOOOoo0.f21137OooO0O0.get(str).intValue(), new String(bArr).substring(0, bArr.length - 1));
            }
        } catch (IOException e) {
            this.OooO00o.OooO00o(e.getMessage());
        }
    }
}
