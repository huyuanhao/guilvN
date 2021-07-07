package com.jinhui365.view;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import com.p118pd.sdk.C8914ooOO0o0O;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.rxhui.android_log_sdk.LogPageType;
import java.util.HashMap;
import s.h.e.l.l.C;

public class BaseNativeActivity extends Activity {
    public static final int o00oO0O = 100;
    public static final int o0ooOO0 = 99;
    public Handler OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public HashMap<String, String> f15041OooO00o = new HashMap<>();

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 99 || i == 100) {
                LogCollectorManager.sharedInstance().noticeReport();
            }
        }
    }

    static {
        C.i(16777256);
    }

    public native void onBackPressed();

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        C8914ooOO0o0O logParamsManager = LogCollectorManager.sharedInstance().getLogParamsManager();
        logParamsManager.OooO0O0(logParamsManager.OooO0oo());
        logParamsManager.OooO00o(logParamsManager.m20562OooO0O0());
        logParamsManager.OooO0oO(getClass().getSimpleName());
        logParamsManager.OooO0O0(new HashMap());
        this.f15041OooO00o.put("name", getClass().getSimpleName());
        this.f15041OooO00o.put("desc", "Native页面");
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.PAGE, LogPageType.PAGE_IN.getValue(), this.f15041OooO00o);
        this.OooO00o.sendEmptyMessageDelayed(99, 1000);
    }

    public void onDestroy() {
        super.onDestroy();
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.PAGE, LogPageType.PAGE_OUT.getValue(), this.f15041OooO00o);
        this.OooO00o.sendEmptyMessageDelayed(100, 1000);
    }

    public native void onStart();

    public native void onStop();
}
