package com.p118pd.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p118pd.sdk.C7236o00ooOoo;

@RequiresApi(21)
/* renamed from: com.pd.sdk.o00ooo00  reason: case insensitive filesystem */
public class C7239o00ooo00 extends C7240o00ooo0O {
    public C7239o00ooo00(Context context) {
        super(context);
        ((C7240o00ooo0O) this).f19771OooO00o = context;
    }

    private boolean OooO0OO(@NonNull C7236o00ooOoo.OooO0OO oooO0OO) {
        return getContext().checkPermission(C7240o00ooo0O.OooO0OO, oooO0OO.OooO0O0(), oooO0OO.OooO00o()) == 0;
    }

    @Override // com.p118pd.sdk.C7240o00ooo0O, com.p118pd.sdk.C7236o00ooOoo.OooO00o
    public boolean OooO00o(@NonNull C7236o00ooOoo.OooO0OO oooO0OO) {
        return OooO0OO(oooO0OO) || super.OooO00o(oooO0OO);
    }
}
