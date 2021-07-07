package com.jinhui365.captcha;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.p118pd.sdk.C9100ooo0OoO;
import s.h.e.l.l.C;

public class CaptchaActivity extends Activity {
    public static Activity OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Promise f14961OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C9100ooo0OoO f14962OooO00o;

    static {
        C.i(50331730);
    }

    public static native void OooO00o();

    public static native void OooO00o(Activity activity, C9100ooo0OoO ooo0ooo, String str, Promise promise);

    public native void onBackPressed();

    public void onCreate(@Nullable Bundle bundle) {
        C9100ooo0OoO ooo0ooo;
        super.onCreate(bundle);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.flags = 1024;
        getWindow().setAttributes(attributes);
        getWindow().clearFlags(512);
        String stringExtra = getIntent().getStringExtra("captchaId");
        if (TextUtils.isEmpty(stringExtra) || (ooo0ooo = f14962OooO00o) == null) {
            finish();
        } else {
            ooo0ooo.OooO00o(this, f14961OooO00o);
            f14962OooO00o.OooO00o(stringExtra);
        }
        OooO00o = this;
    }

    public native void onDestroy();

    public native void onRestoreInstanceState(Bundle bundle);

    public native void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle);
}
