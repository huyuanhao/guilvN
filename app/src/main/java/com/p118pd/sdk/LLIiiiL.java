package com.p118pd.sdk;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.jinhui365.p088rn.share.ShareActivity;
import com.jinhui365.p088rn.share.ShareVO;
import com.jinhui365.util.util.gson.GsonUtil;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;

/* renamed from: com.pd.sdk.LLIiiiL */
public class LLIiiiL extends ReactContextBaseJavaModule {
    public static final String LOG_TYPE = "Share";
    public final String MODULE_NAME = "JHShareModule";
    public ReactApplicationContext mContext;

    public LLIiiiL(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mContext = reactApplicationContext;
    }

    private ShareVO getShareVO(ReadableMap readableMap) {
        String str = null;
        String string = readableMap.hasKey("link") ? readableMap.getString("link") : null;
        String string2 = readableMap.hasKey("title") ? readableMap.getString("title") : null;
        String string3 = readableMap.hasKey("text") ? readableMap.getString("text") : null;
        String string4 = readableMap.hasKey("icon") ? readableMap.getString("icon") : null;
        String string5 = readableMap.hasKey("shareImage") ? readableMap.getString("shareImage") : null;
        if (readableMap.hasKey("thumbImage")) {
            str = readableMap.getString("thumbImage");
        }
        return new ShareVO(string, string3, string2, string4, str, string5);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "JHShareModule";
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af  */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void share(java.lang.String r5, com.facebook.react.bridge.ReadableMap r6, com.facebook.react.bridge.ReadableMap r7, com.facebook.react.bridge.Promise r8) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.LLIiiiL.share(java.lang.String, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public void shareDialog(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        ShareVO shareVO = getShareVO(readableMap);
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "弹框类型分享");
        hashMap.put("message", GsonUtil.toJson(shareVO));
        LogCollectorManager.sharedInstance().recordInfo(LOG_TYPE, hashMap);
        C8686oo0OoooO.OooO00o().m20298OooO00o(ShareActivity.o0ooOOo, GsonUtil.toJson(shareVO));
        ShareActivity.OooO00o(getCurrentActivity());
    }
}
