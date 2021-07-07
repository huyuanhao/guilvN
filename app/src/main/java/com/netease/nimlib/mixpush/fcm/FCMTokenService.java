package com.netease.nimlib.mixpush.fcm;

import android.text.TextUtils;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.p118pd.sdk.C8783oo0oooOO;
import com.p118pd.sdk.C8827ooO0O0OO;

public class FCMTokenService extends FirebaseInstanceIdService {
    public static String OooO00o() {
        String token = FirebaseInstanceId.getInstance().getToken();
        C8783oo0oooOO.OooOOOO("FCMTokenService onToken " + token);
        if (TextUtils.isEmpty(token)) {
            return null;
        }
        return token;
    }

    @Override // com.google.firebase.iid.FirebaseInstanceIdService
    public void onTokenRefresh() {
        if (C8827ooO0O0OO.m20454OooO00o()) {
            C8827ooO0O0OO.OooO00o(8).OooO00o(OooO00o());
        }
    }
}
