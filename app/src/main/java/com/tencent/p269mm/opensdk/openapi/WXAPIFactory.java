package com.tencent.p269mm.opensdk.openapi;

import android.content.Context;
import com.tencent.p269mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.openapi.WXAPIFactory */
public class WXAPIFactory {
    public static final String TAG = "MicroMsg.PaySdk.WXFactory";

    public WXAPIFactory() {
        throw new RuntimeException(WXAPIFactory.class.getSimpleName() + " should not be instantiated");
    }

    public static IWXAPI createWXAPI(Context context, String str) {
        return createWXAPI(context, str, true);
    }

    public static IWXAPI createWXAPI(Context context, String str, boolean z) {
        Log.m8650d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z);
        return new WXApiImplV10(context, str, z);
    }
}
