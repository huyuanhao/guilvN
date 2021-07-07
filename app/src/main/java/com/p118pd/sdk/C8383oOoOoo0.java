package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.pd.sdk.oOoOoo0  reason: case insensitive filesystem */
public final class C8383oOoOoo0 extends AbstractC8471oOooo0oO {
    @Override // com.p118pd.sdk.AbstractC8384oOoOoo00
    public final AbstractC8411oOoo0Oo0 OooO00o(Context context, int i, Intent intent) {
        if (4103 != i) {
            return null;
        }
        AbstractC8411oOoo0Oo0 OooO00o = OooO00o(intent);
        C8379oOoOoOo.OooO00o(context, (C8402oOoo0O) OooO00o, C8379oOoOoOo.f21494OooO0o0);
        return OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8471oOooo0oO
    public final AbstractC8411oOoo0Oo0 OooO00o(Intent intent) {
        try {
            C8402oOoo0O oooo0o = new C8402oOoo0O();
            oooo0o.OooO00o(Integer.parseInt(C8419oOoo0oO.OooO00o(intent.getStringExtra("messageID"))));
            oooo0o.OooO0O0(C8419oOoo0oO.OooO00o(intent.getStringExtra("taskID")));
            oooo0o.OooO00o(C8419oOoo0oO.OooO00o(intent.getStringExtra("appPackage")));
            oooo0o.OooO0Oo(C8419oOoo0oO.OooO00o(intent.getStringExtra("content")));
            oooo0o.OooO0o0(C8419oOoo0oO.OooO00o(intent.getStringExtra("description")));
            oooo0o.OooO0OO(C8419oOoo0oO.OooO00o(intent.getStringExtra(AbstractC8411oOoo0Oo0.OooOo00)));
            oooo0o.OooO0o(C8419oOoo0oO.OooO00o(intent.getStringExtra("globalID")));
            return oooo0o;
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o("OnHandleIntent--" + e.getMessage());
            return null;
        }
    }
}
