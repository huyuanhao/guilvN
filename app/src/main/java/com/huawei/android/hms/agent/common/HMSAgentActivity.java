package com.huawei.android.hms.agent.common;

import android.content.Intent;
import android.os.Bundle;
import s.h.e.l.l.C;

public class HMSAgentActivity extends BaseAgentActivity {
    public static final int o00oO0O = 1000;
    public static final String o0OOO0o = "intent.extra.RESULT";
    public static final String o0ooOoO = "HMSConnectionErrorCode";

    static {
        C.i(50331726);
    }

    public native void onActivityResult(int i, int i2, Intent intent);

    @Override // com.huawei.android.hms.agent.common.BaseAgentActivity
    public native void onCreate(Bundle bundle);
}
