package com.gzlex.hui.guoziwei.travel.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C8027oOO00oo;
import com.p118pd.sdk.C8375oOoOoO0o;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.o0OOOOO;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.umeng.commonsdk.proguard.C3587az;
import java.util.Map;
import s.h.e.l.l.C;

public class AliPayActivity extends Activity {
    public String o0ooOOo;

    public class OooO00o implements AbstractC5477Il11<Map<String, String>> {
        public OooO00o() {
        }

        /* renamed from: OooO00o */
        public void onNext(Map<String, String> map) {
            String OooO0OO = new C8375oOoOoO0o(map).OooO0OO();
            if (TextUtils.equals(OooO0OO, o0OOOOO.OooO00o(new byte[]{11, 7, 83, 4}, "27c4ba"))) {
                LogCollectorManager.sharedInstance().recordInfo(o0OOOOO.OooO00o(new byte[]{0, C3587az.f9268l, 90, 102, 3, 77, C8027oOO00oo.OooO00o, 48, 86, 87, 1, 64, 44, 7, C8027oOO00oo.OooO0O0, 94, 13, 80, C8027oOO00oo.OooO00o, 16, 86, 69, 23, 88, 21, 49, C8027oOO00oo.OooO0O0, 87, 22, C8027oOO00oo.OooO00o, 18, 66, 10, 6, 82, 4}, "ab36b4"));
            } else {
                LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
                sharedInstance.recordInfo(o0OOOOO.OooO00o(new byte[]{88, 85, 10, 54, 2, 72, 25, 107, 6, 7, 0, 69, 116, 92, 23, C3587az.f9268l, 12, 85, 25, 75, 6, 21, 22, 93, 77, 106, 23, 7, 23, 68, 74, 25, 94}, "99cfc1") + OooO0OO);
            }
            AliPayActivity.this.finish();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
        }
    }

    public class OooO0O0 implements C9349III.OooO00o<Map<String, String>> {
        public OooO0O0() {
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super Map<String, String>> r4) {
            r4.onNext(new PayTask(AliPayActivity.this).payV2(AliPayActivity.this.o0ooOOo, false));
            r4.onCompleted();
        }
    }

    static {
        C.i(50331724);
    }

    public native void OooO00o();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o0ooOOo = getIntent().getStringExtra(o0OOOOO.OooO00o(new byte[]{11, 23, 0, 85, 64, 126, 10, 3, 11}, "ded027"));
        OooO00o();
    }

    public static boolean OooO00o(Context context) {
        return new Intent(o0OOOOO.OooO00o(new byte[]{89, 11, 6, 22, 87, 13, 92, 75, 11, 10, 76, 1, 86, 17, 76, 5, 91, 16, 81, 10, 12, 74, 110, 45, 125, 50}, "8ebd8d"), Uri.parse(o0OOOOO.OooO00o(new byte[]{3, 95, 88, 73, 0, 74, 17, 9, 30, 22, 17, 95, 3, C8027oOO00oo.OooO0O0, 87, 86, 19, 94, 3, 67, 88, 22, 18, C8027oOO00oo.OooO0O0, 3, C8027oOO00oo.OooO00o, 69, 120, 17, 67}, "b319a3"))).resolveActivity(context.getPackageManager()) != null;
    }

    public static void OooO00o(Context context, String str) {
        Intent intent = new Intent(context, AliPayActivity.class);
        intent.putExtra(o0OOOOO.OooO00o(new byte[]{88, 22, 6, 81, 17, 43, 89, 2, 13}, "7db4cb"), str);
        context.startActivity(intent);
    }
}
