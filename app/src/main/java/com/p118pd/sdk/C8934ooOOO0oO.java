package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.pd.sdk.ooOOO0oO  reason: case insensitive filesystem */
public final class C8934ooOOO0oO extends AbstractC8471oOooo0oO {
    @Override // com.p118pd.sdk.AbstractC8384oOoOoo00
    public final AbstractC8411oOoo0Oo0 OooO00o(Context context, int i, Intent intent) {
        if (4105 == i) {
            return OooO00o(intent);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC8471oOooo0oO
    public final AbstractC8411oOoo0Oo0 OooO00o(Intent intent) {
        try {
            C8400oOoo00oO oooo00oo = new C8400oOoo00oO();
            oooo00oo.OooO0OO(Integer.parseInt(C8419oOoo0oO.OooO00o(intent.getStringExtra("command"))));
            oooo00oo.OooO0Oo(Integer.parseInt(C8419oOoo0oO.OooO00o(intent.getStringExtra("code"))));
            oooo00oo.OooO0o0(C8419oOoo0oO.OooO00o(intent.getStringExtra("content")));
            oooo00oo.OooO0OO(C8419oOoo0oO.OooO00o(intent.getStringExtra("appKey")));
            oooo00oo.OooO0Oo(C8419oOoo0oO.OooO00o(intent.getStringExtra(C8400oOoo00oO.f21511Oooo00o)));
            oooo00oo.OooO00o(C8419oOoo0oO.OooO00o(intent.getStringExtra("appPackage")));
            C8409oOoo0OOo.OooO00o("OnHandleIntent-message:" + oooo00oo.toString());
            return oooo00oo;
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o("OnHandleIntent--" + e.getMessage());
            return null;
        }
    }
}
