package com.p118pd.sdk;

import android.content.Context;
import android.util.Log;

/* renamed from: com.pd.sdk.oo00OO  reason: case insensitive filesystem */
public final class C8533oo00OO extends AbstractC8534oo00OO0 {
    public static AbstractC8538oo00OOO OooO00o() {
        return new C8533oo00OO();
    }

    @Override // com.p118pd.sdk.AbstractC8538oo00OOO
    public AbstractC8538oo00OOO OooO00o(Context context, String str) {
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC8538oo00OOO
    /* renamed from: a */
    public void mo30728a(String str, int i, String str2, String str3) {
        if (str != null) {
            if (i != 3 && (i == 4 || !(i == 5 || i == 6))) {
                Log.i(str2, str);
            }
            AbstractC8538oo00OOO oo00ooo = this.OooO00o;
            if (oo00ooo != null) {
                oo00ooo.mo30728a(str, i, str2, str3);
            }
        }
    }
}
