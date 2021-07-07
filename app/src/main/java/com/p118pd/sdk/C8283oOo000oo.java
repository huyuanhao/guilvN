package com.p118pd.sdk;

import android.view.View;
import com.p118pd.sdk.AbstractC7837oO00ooOo;

/* renamed from: com.pd.sdk.oOo000oo  reason: case insensitive filesystem */
public class C8283oOo000oo<R> implements AbstractC7837oO00ooOo<R> {
    public final OooO00o OooO00o;

    /* renamed from: com.pd.sdk.oOo000oo$OooO00o */
    public interface OooO00o {
        void OooO00o(View view);
    }

    public C8283oOo000oo(OooO00o oooO00o) {
        this.OooO00o = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7837oO00ooOo
    public boolean OooO00o(R r, AbstractC7837oO00ooOo.OooO00o oooO00o) {
        if (oooO00o.m19514OooO00o() == null) {
            return false;
        }
        this.OooO00o.OooO00o(oooO00o.m19514OooO00o());
        return false;
    }
}
