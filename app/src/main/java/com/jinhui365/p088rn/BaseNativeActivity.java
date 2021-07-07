package com.jinhui365.p088rn;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.p118pd.sdk.C8691oo0o0000;
import com.p118pd.sdk.C8701oo0o0O;
import com.p118pd.sdk.C8703oo0o0O00;
import com.p118pd.sdk.C8741oo0oOo0;
import com.p118pd.sdk.C8914ooOO0o0O;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.rxhui.android_log_sdk.LogPageType;
import java.util.HashMap;
import java.util.Map;
import s.h.e.l.l.C;

/* renamed from: com.jinhui365.rn.BaseNativeActivity */
public class BaseNativeActivity extends FragmentActivity {
    public static final int o00oO0O = 1;
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 600;
    public Handler OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public HashMap<String, String> f14964OooO00o = new HashMap<>();

    /* renamed from: com.jinhui365.rn.BaseNativeActivity$OooO00o */
    public class OooO00o extends Handler {
        public OooO00o() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0 || i == 1) {
                LogCollectorManager.sharedInstance().noticeReport();
            }
        }
    }

    static {
        C.i(16777254);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public native void onBackPressed();

    @Override // androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        String OooO00o2 = C8703oo0o0O00.OooO00o().OooO00o((Activity) this);
        Map<String, Object> OooO00o3 = C8701oo0o0O.m20318OooO00o(OooO00o2);
        C8914ooOO0o0O logParamsManager = LogCollectorManager.sharedInstance().getLogParamsManager();
        logParamsManager.OooO0O0(logParamsManager.OooO0oo());
        logParamsManager.OooO00o(logParamsManager.m20562OooO0O0());
        logParamsManager.OooO0oO(C8741oo0oOo0.OooO0Oo(OooO00o2) ? C8701oo0o0O.OooO00o(Uri.parse(OooO00o2)) : getClass().getSimpleName());
        logParamsManager.OooO0O0(C8691oo0o0000.OooO00o(OooO00o3));
        this.f14964OooO00o.put("name", getClass().getSimpleName());
        this.f14964OooO00o.put("desc", "Native页面");
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.PAGE, LogPageType.PAGE_IN.getValue(), this.f14964OooO00o);
        this.OooO00o.sendEmptyMessageDelayed(0, 600);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.PAGE, LogPageType.PAGE_OUT.getValue(), this.f14964OooO00o);
        this.OooO00o.sendEmptyMessageDelayed(1, 600);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public native void onResume();

    @Override // androidx.fragment.app.FragmentActivity
    public native void onStart();

    @Override // androidx.fragment.app.FragmentActivity
    public native void onStop();
}
