package com.p118pd.sdk;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.jinhui365.util.permission.OnBasePermissionGrantedListener;
import com.jinhui365.util.permission.PermissionManager;
import com.jinhui365.util.util.gson.GsonUtil;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.pd.sdk.ILil  reason: case insensitive filesystem */
public class C5310ILil extends ReactContextBaseJavaModule {
    public static String LOG_TYPE = "Contacts";
    public final String MODULE_NAME = "ContactsModule";
    public ReactApplicationContext mContext;

    /* renamed from: com.pd.sdk.ILil$OooO00o */
    public class OooO00o extends OnBasePermissionGrantedListener {
        public final /* synthetic */ Activity OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f15610OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, Activity activity, Promise promise) {
            super(context);
            this.OooO00o = activity;
            this.f15610OooO00o = promise;
        }

        @Override // com.jinhui365.util.permission.OnBasePermissionGrantedListener, com.jinhui365.util.permission.PermissionManager.OooO0O0
        public void onFail(List<String> list) {
            super.onFail(list);
            this.f15610OooO00o.resolve(Arguments.createArray());
        }

        @Override // com.jinhui365.util.permission.OnBasePermissionGrantedListener
        public void onGranted() {
            WritableArray OooO00o2 = new C8669oo0OoOO(this.OooO00o).OooO00o();
            if (OooO00o2 == null) {
                OooO00o2 = Arguments.createArray();
            }
            this.f15610OooO00o.resolve(OooO00o2);
        }
    }

    /* renamed from: com.pd.sdk.ILil$OooO0O0 */
    public class OooO0O0 extends OnBasePermissionGrantedListener {
        public final /* synthetic */ Activity OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f15612OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ HashMap f15614OooO00o;

        /* renamed from: com.pd.sdk.ILil$OooO0O0$OooO00o */
        public class OooO00o implements ActivityEventListener {
            public OooO00o() {
            }

            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
                String str;
                String str2;
                if (i == 11000 && intent != null) {
                    Uri data = intent.getData();
                    ContentResolver contentResolver = C5310ILil.this.mContext.getContentResolver();
                    Cursor cursor = null;
                    if (data != null) {
                        Cursor query = contentResolver.query(data, new String[]{C8669oo0OoOO.OooO00o, "display_name"}, null, null, null);
                        str2 = null;
                        cursor = query;
                        str = null;
                    } else {
                        OooO0O0.this.f15614OooO00o.put(AbstractC7726o0ooOOoo.OooOOo0, "selectContact");
                        OooO0O0.this.f15614OooO00o.put("communication_type", DispatchConstants.OTHER);
                        OooO0O0.this.f15614OooO00o.put("desc", "cursor null");
                        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, "selectContact", OooO0O0.this.f15614OooO00o);
                        str = null;
                        str2 = null;
                    }
                    while (cursor.moveToNext()) {
                        str2 = cursor.getString(cursor.getColumnIndex("display_name"));
                        str = cursor.getString(cursor.getColumnIndex(C8669oo0OoOO.OooO00o));
                    }
                    cursor.close();
                    if (str != null) {
                        str = str.replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, " ").replaceAll(" ", "");
                    }
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("name", str2);
                    createMap.putString("phoneNumber", str);
                    OooO0O0.this.f15612OooO00o.resolve(createMap);
                }
                C5310ILil.this.mContext.removeActivityEventListener(this);
            }

            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onNewIntent(Intent intent) {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context, Activity activity, HashMap hashMap, Promise promise) {
            super(context);
            this.OooO00o = activity;
            this.f15614OooO00o = hashMap;
            this.f15612OooO00o = promise;
        }

        @Override // com.jinhui365.util.permission.OnBasePermissionGrantedListener
        public void onGranted() {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.PICK");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setType("vnd.android.cursor.dir/phone_v2");
            this.OooO00o.startActivityForResult(intent, C8668oo0OoO0o.OooO00o, null);
            C5310ILil.this.mContext.addActivityEventListener(new OooO00o());
        }
    }

    public C5310ILil(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mContext = reactApplicationContext;
    }

    @ReactMethod
    public void getContactList(ReadableMap readableMap, Promise promise) {
        HashMap hashMap = new HashMap();
        hashMap.put("communication_type", "rn-call-native");
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "getContactList");
        hashMap.put("in_params", GsonUtil.toJson(C8691oo0o0000.OooO00o(readableMap)));
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, LOG_TYPE, hashMap);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            PermissionManager.OooO00o(currentActivity).OooO00o(new String[]{"android.permission.READ_CONTACTS"}, new OooO00o(currentActivity, currentActivity, promise));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ContactsModule";
    }

    @ReactMethod
    public void selectContact(ReadableMap readableMap, Promise promise) {
        HashMap hashMap = new HashMap();
        hashMap.put("communication_type", "rn-call-native");
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "selectContact");
        hashMap.put("in_params", GsonUtil.toJson(C8691oo0o0000.OooO00o(readableMap)));
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, LOG_TYPE, hashMap);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            PermissionManager.OooO00o(currentActivity).OooO00o(new String[]{"android.permission.READ_CONTACTS"}, new OooO0O0(currentActivity, currentActivity, hashMap, promise));
        }
    }
}
