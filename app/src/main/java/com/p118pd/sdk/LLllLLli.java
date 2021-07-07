package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.gzlex.hui.guoziwei.travel.view.AliPayActivity;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.umeng.commonsdk.proguard.C3587az;
import javax.annotation.Nonnull;

/* renamed from: com.pd.sdk.LLllLLli */
public class LLllLLli extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = o0OOOOO.OooO00o(new byte[]{97, 93, 89, 82, C8027oOO00oo.OooO0O0, 121, 92, 92, 77, 93, 86}, "388134");
    public ReactApplicationContext mContext;

    /* renamed from: com.pd.sdk.LLllLLli$OooO00o */
    public class OooO00o implements Runnable {
        public final /* synthetic */ String o0ooOOo;

        public OooO00o(String str) {
            this.o0ooOOo = str;
        }

        public void run() {
            if (C9054ooOoOo0.OooO00o(o0OOOOO.OooO00o(new byte[]{85}, "e2eff3"), this.o0ooOOo)) {
                LLllLLli.this.mContext.getCurrentActivity().getWindow().setSoftInputMode(16);
            } else {
                LLllLLli.this.mContext.getCurrentActivity().getWindow().setSoftInputMode(32);
            }
        }
    }

    public LLllLLli(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mContext = reactApplicationContext;
    }

    @ReactMethod
    public void aliPay(ReadableMap readableMap, Promise promise) {
        try {
            if (AliPayActivity.OooO00o(this.mContext.getCurrentActivity())) {
                LogCollectorManager.sharedInstance().recordInfo(o0OOOOO.OooO00o(new byte[]{87, 89, 95, 49, 83, 77, 22, 103, 83, 0, 81, 64, 123, 80, 66, 9, 93, 80, 22, 70, 67, 2, 81, 81, 69, 70}, "656a24"));
                String string = readableMap.getString(o0OOOOO.OooO00o(new byte[]{87, 89, 92, 68, 86, 74, 121, C8027oOO00oo.OooO0O0, 81, 81, 69, 96, 66, C8027oOO00oo.OooO0O0, 92, 90, 80}, "655473"));
                LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
                sharedInstance.recordInfo(o0OOOOO.OooO00o(new byte[]{85, 91, 10, 53, 3, 78, 20, 101, 6, 4, 1, 67, 121, 82, 23, 13, 13, 83, 20, 68, 22, 6, 1, 82, C8027oOO00oo.OooO0O0, 68, 67, 10, 16, 83, 81, 69, ExifInterface.OooO00o, 11, 4, 88, 9}, "47ceb7") + string);
                AliPayActivity.OooO00o(this.mContext.getCurrentActivity(), string);
                WritableMap createMap = Arguments.createMap();
                createMap.putString(o0OOOOO.OooO00o(new byte[]{87, 94, 93, 4}, "419af1"), o0OOOOO.OooO00o(new byte[]{81}, "a9f0ba"));
                promise.resolve(createMap);
                return;
            }
            doOpenAliPayFail(promise, null);
        } catch (Exception e) {
            e.printStackTrace();
            doOpenAliPayFail(promise, e.toString());
        }
    }

    public void doOpenAliPayFail(Promise promise, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(o0OOOOO.OooO00o(new byte[]{7, C3587az.f9268l, 82, 7}, "da6b8a"), o0OOOOO.OooO00o(new byte[]{87}, "f540d1"));
        promise.resolve(createMap);
        LogCollectorManager.sharedInstance().recordWarn(o0OOOOO.OooO00o(new byte[]{83, C3587az.f9268l, 91, 103, 86, 26, 18, 48, 87, 86, 84, 23, O0O00O.OooO0O0, 7, 70, 95, 88, 7, 18, 4, 83, 94, 91, 6, 86}, "2b277c"));
        if (C9054ooOoOo0.OooO0Oo(str)) {
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            sharedInstance.recordWarn(o0OOOOO.OooO00o(new byte[]{82, C3587az.f9268l, 94, 105, 89, 78, 19, 48, 82, 88, 91, 67, 126, 7, 67, 81, 87, 83, 19, 4, 86, 80, 84, 82, 87, 66, 82, 4}, "3b7987") + str);
        }
    }

    public void doOpenWXFail(Promise promise) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(o0OOOOO.OooO00o(new byte[]{7, 90, 80, 85}, "d5406e"), o0OOOOO.OooO00o(new byte[]{1}, "07a949"));
        promise.resolve(createMap);
        LogCollectorManager.sharedInstance().recordInfo(o0OOOOO.OooO00o(new byte[]{19, 26, 22, 80, 64, 16, 54, 7, 7, 82, 77, 125, 1, 22, C3587az.f9268l, 94, 93, 16, 23, 23, 5, 82, 92, 67, 23}, "dbf190"));
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void keyBoardEnable(String str) {
        this.mContext.getCurrentActivity().runOnUiThread(new OooO00o(str));
    }

    @ReactMethod
    public void wxPay(ReadableMap readableMap, Promise promise) {
        try {
            if (C8380oOoOoOo0.OooO00o().m20062OooO00o()) {
                C8377oOoOoOO0 ooooooo0 = new C8377oOoOoOO0();
                ooooooo0.OooO00o(readableMap.getString(o0OOOOO.OooO00o(new byte[]{3, 21, 19, 13, 2}, "becdf4")));
                ooooooo0.OooO0Oo(readableMap.getString(o0OOOOO.OooO00o(new byte[]{22, 80, 20, 64, 86, 3, 20, 88, 2}, "f1f48f")));
                ooooooo0.OooO0o0(readableMap.getString(o0OOOOO.OooO00o(new byte[]{72, 74, 93, 69, 81, 77, 81, 92}, "888504")));
                ooooooo0.OooO0OO(readableMap.getString(o0OOOOO.OooO00o(new byte[]{C8027oOO00oo.OooO0O0, 85, 5, 91, 82, 83, 82}, "74f034")));
                ooooooo0.OooO0O0(readableMap.getString(o0OOOOO.OooO00o(new byte[]{8, 95, 90, 83, 93, 66, 18, 66}, "f04081")));
                ooooooo0.OooO0oO(readableMap.getString(o0OOOOO.OooO00o(new byte[]{68, 88, 92, 6, 74, 64, 81, 92, C8027oOO00oo.OooO00o}, "011c94")));
                ooooooo0.OooO0o(readableMap.getString(o0OOOOO.OooO00o(new byte[]{70, 8, 3, 15}, "5adadc")));
                C8380oOoOoOo0.OooO00o().OooO00o(ooooooo0);
                WritableMap createMap = Arguments.createMap();
                createMap.putString(o0OOOOO.OooO00o(new byte[]{87, 11, 84, 93}, "4d0860"), o0OOOOO.OooO00o(new byte[]{7}, "7df17f"));
                promise.resolve(createMap);
                LogCollectorManager.sharedInstance().recordInfo(o0OOOOO.OooO00o(new byte[]{22, 72, 22, 87, C8027oOO00oo.OooO0Oo, C8027oOO00oo.OooO00o, 51, 85, 7, 85, 22, 44, 4, 68, C3587az.f9268l, 89, 6, C8027oOO00oo.OooO00o, 18, 69, 5, 85, 7, 18, 18}, "a0f6ba"));
                return;
            }
            doOpenWXFail(promise);
        } catch (Exception unused) {
            doOpenWXFail(promise);
        }
    }
}
