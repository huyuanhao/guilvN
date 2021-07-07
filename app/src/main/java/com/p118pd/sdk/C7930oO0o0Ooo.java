package com.p118pd.sdk;

import com.drew.lang.annotations.Nullable;
import org.android.agoo.message.MessageService;

/* renamed from: com.pd.sdk.oO0o0Ooo  reason: case insensitive filesystem */
public class C7930oO0o0Ooo extends C7929oO0o0OoO<C7933oO0o0o00> {
    public C7930oO0o0Ooo(C7933oO0o0o00 oo0o0o00) {
        super(oo0o0o00);
    }

    @Nullable
    private String OooO00o() {
        return OooO00o(3, "Unknown (RGB or CMYK)", "YCbCr", "YCCK");
    }

    @Nullable
    private String OooO0O0() {
        Integer OooO00o = ((C7933oO0o0o00) this.f20998OooO00o).m19639OooO00o(0);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.intValue() == 100 ? MessageService.MSG_DB_COMPLETE : Integer.toString(OooO00o.intValue());
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    public String OooO0OO(int i) {
        if (i == 0) {
            return OooO0O0();
        }
        if (i != 3) {
            return super.OooO0OO(i);
        }
        return OooO00o();
    }
}
