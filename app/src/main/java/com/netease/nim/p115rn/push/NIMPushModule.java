package com.netease.nim.p115rn.push;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.netease.nimlib.mixpush.MixPushState;
import com.p118pd.sdk.AbstractC8861ooO0o00o;
import com.p118pd.sdk.C8799ooO000OO;
import com.p118pd.sdk.C8817ooO00oo0;
import com.p118pd.sdk.C8857ooO0o0;
import com.p118pd.sdk.C8860ooO0o00O;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.netease.nim.rn.push.NIMPushModule */
public class NIMPushModule extends ReactContextBaseJavaModule implements ActivityEventListener {

    /* renamed from: com.netease.nim.rn.push.NIMPushModule$OooO00o */
    public class OooO00o implements AbstractC8861ooO0o00o {
        public final /* synthetic */ Callback OooO00o;

        public OooO00o(Callback callback) {
            this.OooO00o = callback;
        }

        @Override // com.p118pd.sdk.AbstractC8861ooO0o00o
        public void OooO00o(C8817ooO00oo0 ooo00oo0) {
            if (ooo00oo0 != null) {
                this.OooO00o.invoke(Integer.valueOf(ooo00oo0.m20450OooO00o()), ooo00oo0.OooO0O0(), ooo00oo0.m20451OooO00o());
            }
        }
    }

    public NIMPushModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
    }

    public static boolean fromLauncher(Intent intent) {
        return (intent == null || intent.getCategories() == null || !intent.getCategories().contains("android.intent.category.LAUNCHER")) ? false : true;
    }

    private void handleIntent(Intent intent) {
        if (intent != null) {
            C8860ooO0o00O.m20496OooO00o();
        }
    }

    @ReactMethod
    public void clearAllNotification() {
        C8860ooO0o00O.m20496OooO00o();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        return super.getConstants();
    }

    @ReactMethod
    public void getDeviceInfo(Callback callback) {
        callback.invoke(C8860ooO0o00O.OooO00o());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NIMPushModule";
    }

    @ReactMethod
    public void init(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Callback callback) {
        C8857ooO0o0 ooo0o0 = new C8857ooO0o0();
        C8799ooO000OO ooo000oo = new C8799ooO000OO();
        ooo000oo.OooO00o = str;
        ooo000oo.OooO0O0 = str2;
        ooo000oo.OooO0OO = str3;
        ooo000oo.OooO0o0 = str5;
        ooo000oo.OooO0o = str6;
        ooo000oo.OooO0oO = str7;
        ooo000oo.OooO0Oo = str4;
        ooo000oo.OooO0oo = str8;
        ooo000oo.OooO = str9;
        ooo000oo.OooOO0 = str10;
        ooo000oo.OooOO0O = str11;
        ooo000oo.OooOO0o = str12;
        ooo000oo.OooOOO0 = str13;
        ooo0o0.OooO00o = ooo000oo;
        ooo0o0.f22070OooO00o = new OooO00o(callback);
        C8860ooO0o00O.OooO00o(getReactApplicationContext(), ooo0o0);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    @ReactMethod
    public void onLogin(String str, int i, boolean z, String str2) {
        getName();
        String str3 = "onLogin account = " + str + " pushtype = " + i + " haspushed = " + z + " deviceInfo = " + str2;
        C8860ooO0o00O.OooO00o(str, new MixPushState(i, z, str2));
        if (getCurrentActivity() != null) {
            handleIntent(getCurrentActivity().getIntent());
        }
    }

    @ReactMethod
    public void onLogout() {
        C8860ooO0o00O.OooO0O0();
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        if (C8860ooO0o00O.OooO00o(intent) || fromLauncher(intent)) {
            handleIntent(intent);
        }
    }

    @ReactMethod
    public void setDeviceId(String str) {
        getName();
        String str2 = "setDeviceId deviceId = " + str;
        C8860ooO0o00O.OooO00o(str);
    }

    @ReactMethod
    public void showNotification(String str, String str2, String str3, String str4) {
        getName();
        C8860ooO0o00O.OooO00o(str, str2, str3, str4);
    }

    @ReactMethod
    public void toast(String str) {
        Toast.makeText(getReactApplicationContext(), str, 0).show();
    }
}
