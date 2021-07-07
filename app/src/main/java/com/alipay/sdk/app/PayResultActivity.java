package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.p118pd.sdk.C7477o0OoO0;
import com.p118pd.sdk.C7479o0OoO000;
import com.p118pd.sdk.C7482o0OoO0OO;
import com.p118pd.sdk.C7494o0OoOOOo;
import com.p118pd.sdk.C7620o0oOOOoo;
import com.p118pd.sdk.RunnableC7474o0Oo0ooO;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

public final class PayResultActivity extends Activity {
    public static final HashMap<String, Object> OooO00o = new HashMap<>();
    public static String o000OOo = null;
    public static final String o0O0O00 = "phonecashier.pay.resultOrderHash";
    public static final String o0OO00O = "externalPkgName";
    public static final String o0OOO0o = "phonecashier.pay.hash";
    public static final String o0Oo0oo = "orderSuffix";
    public static final String o0ooOOo = "{\"isLogin\":\"false\"}";
    public static final String o0ooOoO = "hk.alipay.wallet";
    public static final String oo0o0Oo = "phonecashier.pay.result";

    public static final class OooO00o {
        public static volatile String OooO00o;
        public static volatile String OooO0O0;
    }

    public static void OooO00o(Activity activity, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            Intent intent = new Intent();
            try {
                intent.setPackage(o0ooOoO);
                intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=" + URLEncoder.encode(str, "UTF-8") + "&orderSuffix=" + URLEncoder.encode(str2, "UTF-8") + "&packageName=" + URLEncoder.encode(str3, "UTF-8") + "&externalPkgName=" + URLEncoder.encode(str3, "UTF-8")));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                C7620o0oOOOoo.OooO0O0(C7494o0OoOOOo.OooO00o, "PayTask:payReuslt: UnsupportedEncodingException:" + e);
            }
            if (activity != null) {
                try {
                    activity.startActivity(intent);
                } catch (Throwable unused) {
                    activity.finish();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (!TextUtils.isEmpty(intent.getStringExtra(o0Oo0oo))) {
                OooO00o.OooO00o = intent.getStringExtra(o0OOO0o);
                OooO00o(this, OooO00o.OooO00o, intent.getStringExtra(o0Oo0oo), intent.getStringExtra(o0OO00O));
                OooO00o(this, 300);
                return;
            }
            String stringExtra = intent.getStringExtra(oo0o0Oo);
            int intExtra = intent.getIntExtra(o0O0O00, 0);
            if (intExtra != 0) {
                if (TextUtils.equals(OooO00o.OooO00o, String.valueOf(intExtra))) {
                    if (!TextUtils.isEmpty(stringExtra)) {
                        OooO00o(stringExtra, OooO00o.OooO00o);
                    } else {
                        OooO00o(OooO00o.OooO00o);
                    }
                    OooO00o.OooO00o = "";
                    OooO00o(this, 300);
                    return;
                }
            }
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.Ooooo00, "Expected " + OooO00o.OooO00o + ", got " + intExtra);
            OooO00o(OooO00o.OooO00o);
            OooO00o(this, 300);
        } catch (Throwable unused) {
            finish();
        }
    }

    public static void OooO00o(String str) {
        OooO00o.OooO0O0 = C7479o0OoO000.OooO0O0();
        OooO00o(OooO00o, str);
    }

    public static void OooO00o(String str, String str2) {
        OooO00o.OooO0O0 = str;
        OooO00o(OooO00o, str2);
    }

    public static void OooO00o(Activity activity, int i) {
        new Handler().postDelayed(new RunnableC7474o0Oo0ooO(activity), (long) i);
    }

    public static boolean OooO00o(HashMap<String, Object> hashMap, String str) {
        Object obj;
        if (hashMap == null || str == null || (obj = hashMap.get(str)) == null) {
            return false;
        }
        synchronized (obj) {
            obj.notifyAll();
        }
        return true;
    }
}
