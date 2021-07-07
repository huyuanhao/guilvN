package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.pd.sdk.oOoOoOoo  reason: case insensitive filesystem */
public final class C8381oOoOoOoo extends AbstractC8471oOooo0oO {
    @Override // com.p118pd.sdk.AbstractC8384oOoOoo00
    public final AbstractC8411oOoo0Oo0 OooO00o(Context context, int i, Intent intent) {
        if (4098 != i) {
            return null;
        }
        AbstractC8411oOoo0Oo0 OooO00o = OooO00o(intent);
        C8379oOoOoOo.OooO00o(context, (C8399oOoo00o0) OooO00o, C8379oOoOoOo.f21494OooO0o0);
        return OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8471oOooo0oO
    public final AbstractC8411oOoo0Oo0 OooO00o(Intent intent) {
        try {
            C8399oOoo00o0 oooo00o0 = new C8399oOoo00o0();
            oooo00o0.OooO00o(Integer.parseInt(C8419oOoo0oO.OooO00o(intent.getStringExtra("messageID"))));
            oooo00o0.OooO0O0(C8419oOoo0oO.OooO00o(intent.getStringExtra("taskID")));
            oooo00o0.OooO00o(C8419oOoo0oO.OooO00o(intent.getStringExtra("appPackage")));
            oooo00o0.OooO0OO(C8419oOoo0oO.OooO00o(intent.getStringExtra("content")));
            oooo00o0.OooO0OO(Integer.parseInt(C8419oOoo0oO.OooO00o(intent.getStringExtra(AbstractC8411oOoo0Oo0.f21534OooOO0O))));
            oooo00o0.OooO0O0(Long.parseLong(C8419oOoo0oO.OooO00o(intent.getStringExtra(AbstractC8411oOoo0Oo0.f21539OooOOOo))));
            oooo00o0.OooO00o(Long.parseLong(C8419oOoo0oO.OooO00o(intent.getStringExtra(AbstractC8411oOoo0Oo0.OooOOo0))));
            oooo00o0.OooO0o0(C8419oOoo0oO.OooO00o(intent.getStringExtra(AbstractC8411oOoo0Oo0.f21535OooOO0o)));
            oooo00o0.OooO0o(C8419oOoo0oO.OooO00o(intent.getStringExtra("title")));
            oooo00o0.OooO0Oo(C8419oOoo0oO.OooO00o(intent.getStringExtra(AbstractC8411oOoo0Oo0.f21537OooOOO0)));
            oooo00o0.OooO0o0(Integer.parseInt(C8419oOoo0oO.OooO00o(intent.getStringExtra(AbstractC8411oOoo0Oo0.f21536OooOOO))));
            oooo00o0.OooO0Oo(Integer.parseInt(C8419oOoo0oO.OooO00o(intent.getStringExtra(AbstractC8411oOoo0Oo0.f21538OooOOOO))));
            C8409oOoo0OOo.OooO00o("OnHandleIntent-message:" + oooo00o0.toString());
            return oooo00o0;
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o("OnHandleIntent--" + e.getMessage());
            return null;
        }
    }
}
