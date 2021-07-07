package com.huawei.android.hms.agent.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.p118pd.sdk.C8425oOoo0ooo;
import s.h.e.l.l.C;

public class BaseAgentActivity extends Activity {
    public static final String o0ooOOo = "should_be_fullscreen";

    static {
        C.i(16777248);
    }

    private void OooO00o() {
        try {
            Intent intent = getIntent();
            if (intent != null && intent.getBooleanExtra(o0ooOOo, false)) {
                getWindow().setFlags(1024, 1024);
            }
            requestWindowFeature(1);
            Window window = getWindow();
            if (window != null) {
                window.addFlags(67108864);
            }
        } catch (Exception e) {
            C8425oOoo0ooo.OooO0o0("requestActivityTransparent exception:" + e.getMessage());
        }
    }

    public native void onCreate(Bundle bundle);
}
