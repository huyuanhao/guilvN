package com.jinhui365.p088rn;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import com.p118pd.sdk.C8658oo0Oo0O0;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;
import s.h.e.l.l.C;

/* renamed from: com.jinhui365.rn.MyReactActivity */
public class MyReactActivity extends XNRNReactActivity {
    public HashMap<String, String> OooO00o = new HashMap<>();

    /* renamed from: com.jinhui365.rn.MyReactActivity$OooO00o */
    public class OooO00o extends C8658oo0Oo0O0 {
        public OooO00o(FragmentActivity fragmentActivity, String str) {
            super(fragmentActivity, str);
        }

        @Override // com.p118pd.sdk.C8658oo0Oo0O0, com.p118pd.sdk.C8658oo0Oo0O0, com.p118pd.sdk.C8658oo0Oo0O0, com.p118pd.sdk.C8658oo0Oo0O0, com.p118pd.sdk.C8658oo0Oo0O0, com.p118pd.sdk.C8658oo0Oo0O0
        public Bundle OooO00o() {
            return MyReactActivity.this.OooO00o();
        }
    }

    static {
        C.i(50331733);
    }

    @Override // com.jinhui365.p088rn.XNRNReactActivity
    public native Bundle OooO00o();

    @Override // com.jinhui365.p088rn.XNRNReactActivity
    /* renamed from: OooO00o  reason: collision with other method in class */
    public native C8658oo0Oo0O0 m15111OooO00o();

    public native void OooO00o(Bundle bundle);

    public native void OooO0O0(Bundle bundle);

    @Override // com.jinhui365.p088rn.XNRNReactActivity
    public native String getMainComponentName();

    @Override // androidx.fragment.app.FragmentActivity
    public native void onConfigurationChanged(Configuration configuration);

    @Override // androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity, com.jinhui365.p088rn.XNRNReactActivity
    @RequiresApi(api = 28)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.OooO00o.put("name", getClass().getSimpleName());
        this.OooO00o.put("desc", "RN实例Activity");
        if ((getIntent().getFlags() & 4194304) != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "MyReactActivity;onCreate:");
            hashMap.put("exception", "MyReactActivity:onCreate;重复启动");
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, com.jinhui365.p088rn.XNRNReactActivity
    public native void onDestroy();

    @Override // androidx.fragment.app.FragmentActivity, com.jinhui365.p088rn.XNRNReactActivity
    public native void onNewIntent(Intent intent);

    @Override // androidx.fragment.app.FragmentActivity, com.jinhui365.p088rn.XNRNReactActivity
    public native void onResume();

    @Override // androidx.fragment.app.FragmentActivity
    public native void onStart();

    @Override // androidx.fragment.app.FragmentActivity
    public native void onStop();
}
