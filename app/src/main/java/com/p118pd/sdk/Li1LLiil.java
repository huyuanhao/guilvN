package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.jinhui365.p088rn.photo.IDCardTakePhotoActivity;
import com.jinhui365.util.permission.OnBasePermissionGrantedListener;
import com.jinhui365.util.permission.PermissionManager;
import com.jinhui365.util.util.gson.GsonUtil;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.xiaomi.mipush.sdk.Constants;
import com.yongchun.library.view.ImagePreviewActivity;
import com.yongchun.library.view.ImageSelectorActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.Li1LLiil */
public class Li1LLiil extends ReactContextBaseJavaModule {
    public static final String LOG_TYPE = "Photo";
    public static final int PROMISE_TAKE_PHOTO = 1;
    public final String MODULE_NAME = "PhotoModule";
    public ReactApplicationContext mContext;
    public int maxSelectNum = 1;
    public int minSelectNum = 1;
    public HashMap<Integer, Promise> promiseTable = new HashMap<>();
    public String takePhotoPath;

    /* renamed from: com.pd.sdk.Li1LLiil$OooO00o */
    public class OooO00o implements ActivityEventListener {
        public OooO00o() {
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            if (i == 61000 && i2 == -1) {
                ((Promise) Li1LLiil.this.promiseTable.get(1)).resolve(C8680oo0Ooo0o.OooO00o(activity, Li1LLiil.this.takePhotoPath, true));
                Li1LLiil.this.promiseTable.remove(1);
                return;
            }
            if (i == 61001 && i2 == -1) {
                ((Promise) Li1LLiil.this.promiseTable.get(1)).resolve(C8680oo0Ooo0o.OooO00o(activity, intent.getStringExtra(IDCardTakePhotoActivity.o0ooOOo), false));
                Li1LLiil.this.promiseTable.remove(1);
            } else if (i == 66 && i2 == -1) {
                ArrayList arrayList = (ArrayList) intent.getSerializableExtra("outputList");
                WritableArray createArray = Arguments.createArray();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    createArray.pushMap(C8680oo0Ooo0o.OooO00o(activity, (String) arrayList.get(i3), true));
                }
                ((Promise) Li1LLiil.this.promiseTable.get(1)).resolve(createArray);
                Li1LLiil.this.promiseTable.remove(1);
            }
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onNewIntent(Intent intent) {
        }
    }

    /* renamed from: com.pd.sdk.Li1LLiil$OooO0O0 */
    public class OooO0O0 extends OnBasePermissionGrantedListener {
        public final /* synthetic */ Activity OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f16561OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableMap f16562OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context, ReadableMap readableMap, Activity activity, Promise promise) {
            super(context);
            this.f16562OooO00o = readableMap;
            this.OooO00o = activity;
            this.f16561OooO00o = promise;
        }

        @Override // com.jinhui365.util.permission.OnBasePermissionGrantedListener
        public void onGranted() {
            ReadableMap readableMap = this.f16562OooO00o;
            int i = (readableMap == null || !readableMap.hasKey("facing")) ? 0 : this.f16562OooO00o.getInt("facing");
            ReadableMap readableMap2 = this.f16562OooO00o;
            if (readableMap2 == null || !readableMap2.hasKey("takePhotoType") || 1 != this.f16562OooO00o.getInt("takePhotoType")) {
                C8680oo0Ooo0o.OooO00o(this.OooO00o, i, false);
            } else {
                C8680oo0Ooo0o.m20295OooO00o(this.OooO00o, i);
            }
            Li1LLiil.this.promiseTable.put(1, this.f16561OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.Li1LLiil$OooO0OO */
    public class OooO0OO extends OnBasePermissionGrantedListener {
        public final /* synthetic */ Activity OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f16564OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0OO(Context context, Activity activity, Promise promise) {
            super(context);
            this.OooO00o = activity;
            this.f16564OooO00o = promise;
        }

        @Override // com.jinhui365.util.permission.OnBasePermissionGrantedListener
        public void onGranted() {
            Activity activity = this.OooO00o;
            Li1LLiil li1LLiil = Li1LLiil.this;
            ImageSelectorActivity.OooO00o(activity, li1LLiil.maxSelectNum, li1LLiil.minSelectNum, 1, true, true, false);
            Li1LLiil.this.promiseTable.put(1, this.f16564OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.Li1LLiil$OooO0Oo  reason: case insensitive filesystem */
    public class C5697OooO0Oo extends OnBasePermissionGrantedListener {
        public final /* synthetic */ Activity OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f16566OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f16568OooO00o;

        /* renamed from: com.pd.sdk.Li1LLiil$OooO0Oo$OooO00o */
        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            public void run() {
                boolean z;
                if (C5697OooO0Oo.this.f16568OooO00o.startsWith("http")) {
                    C5697OooO0Oo oooO0Oo = C5697OooO0Oo.this;
                    Activity activity = oooO0Oo.OooO00o;
                    String OooO00o2 = C8736oo0oOOOo.m20352OooO00o(C8736oo0oOOOo.OooO0O0(oooO0Oo.f16568OooO00o), 100);
                    z = C8736oo0oOOOo.OooO00o(activity, OooO00o2, System.currentTimeMillis() + "");
                } else {
                    String str = C5697OooO0Oo.this.f16568OooO00o;
                    if (str.startsWith(C7758o0ooooO0.OooO00o)) {
                        String str2 = C5697OooO0Oo.this.f16568OooO00o;
                        str = str2.substring(str2.lastIndexOf(Constants.ACCEPT_TIME_SEPARATOR_SP) + 1);
                    }
                    Activity activity2 = C5697OooO0Oo.this.OooO00o;
                    z = C8736oo0oOOOo.OooO00o(activity2, str, System.currentTimeMillis() + "");
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("code", z ? 0 : -1);
                C5697OooO0Oo.this.f16566OooO00o.resolve(createMap);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5697OooO0Oo(Context context, String str, Activity activity, Promise promise) {
            super(context);
            this.f16568OooO00o = str;
            this.OooO00o = activity;
            this.f16566OooO00o = promise;
        }

        @Override // com.jinhui365.util.permission.OnBasePermissionGrantedListener
        public void onGranted() {
            new Thread(new OooO00o()).start();
        }
    }

    public Li1LLiil(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new OooO00o());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PhotoModule";
    }

    @ReactMethod
    public void openPhoto(ReadableMap readableMap, Promise promise) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "openPhoto");
        hashMap.put("communication_type", "rn-call-native");
        hashMap.put("in_params", GsonUtil.toJson(C8691oo0o0000.OooO00o(readableMap)));
        HashMap hashMap2 = new HashMap();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            hashMap2.put("desc", "activity 上下文为空");
            hashMap.put("api_env", GsonUtil.toJson(hashMap2));
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "Photo", hashMap);
            return;
        }
        this.maxSelectNum = 1;
        this.minSelectNum = 1;
        if (readableMap != null) {
            if (readableMap.hasKey(ImagePreviewActivity.f23526o0OOO0o)) {
                this.maxSelectNum = readableMap.getInt(ImagePreviewActivity.f23526o0OOO0o);
            }
            if (readableMap.hasKey("minSelectNum")) {
                this.minSelectNum = readableMap.getInt("minSelectNum");
            }
        }
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, "Photo", hashMap);
        PermissionManager.OooO00o(currentActivity).OooO00o(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, new OooO0OO(currentActivity, currentActivity, promise));
    }

    @ReactMethod
    public void savePhoto(String str, ReadableMap readableMap, Promise promise) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "savePhoto");
        hashMap.put("communication_type", "rn-call-native");
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        if (C8741oo0oOo0.OooO0Oo(str) && !str.startsWith("http")) {
            hashMap3.put("url", new C8906ooOO0Oo(str.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SP) + 10, 10, 4));
        }
        hashMap2.put("url", str);
        hashMap2.putAll(C8691oo0o0000.OooO00o(readableMap));
        hashMap.put("in_params", GsonUtil.toJson(hashMap2));
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, "Photo", false, (Map<String, String>) hashMap, (Map<String, C8906ooOO0Oo>) hashMap3);
        Activity currentActivity = getCurrentActivity();
        boolean z = true;
        if (currentActivity != null || !C8741oo0oOo0.OooO0OO(str)) {
            PermissionManager.OooO00o(currentActivity).OooO00o(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C5697OooO0Oo(currentActivity, str, currentActivity, promise));
            return;
        }
        HashMap hashMap4 = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append("activity 上下文为空 或者url为空;activity==");
        if (currentActivity != null) {
            z = false;
        }
        sb.append(z);
        hashMap4.put("desc", sb.toString());
        hashMap4.put(AbstractC7726o0ooOOoo.OooOOo0, "savePhoto");
        LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "Photo", hashMap4);
    }

    @ReactMethod
    public void takePhoto(ReadableMap readableMap, Promise promise) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "takePhoto");
        hashMap.put("communication_type", "rn-call-native");
        hashMap.put("in_params", GsonUtil.toJson(C8691oo0o0000.OooO00o(readableMap)));
        HashMap hashMap2 = new HashMap();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            hashMap2.put("desc", "activity 上下文为空");
            hashMap.put("api_env", GsonUtil.toJson(hashMap2));
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "Photo", hashMap);
            return;
        }
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, "Photo", hashMap);
        PermissionManager.OooO00o(currentActivity).OooO00o(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, new OooO0O0(currentActivity, readableMap, currentActivity, promise));
    }
}
