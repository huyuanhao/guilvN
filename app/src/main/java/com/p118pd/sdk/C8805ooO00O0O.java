package com.p118pd.sdk;

import android.content.Context;

/* renamed from: com.pd.sdk.ooO00O0O  reason: case insensitive filesystem */
public class C8805ooO00O0O extends AbstractC8821ooO0O0 {
    public C8805ooO00O0O(int i) {
        super(i);
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO00o(Context context) {
        return C8841ooO0OOoO.OooO00o() == 2;
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO0O0() {
        try {
            Class.forName("com.google.firebase.iid.FirebaseInstanceId").getName();
            C8783oo0oooOO.OooOOOO("fcm push sdk find");
            return true;
        } catch (Throwable unused) {
            C8783oo0oooOO.OooOOOO("fcm push sdk not find");
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO0OO(Context context) {
        return true;
    }
}
