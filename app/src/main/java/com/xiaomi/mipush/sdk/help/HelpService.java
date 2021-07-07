package com.xiaomi.mipush.sdk.help;

import android.app.IntentService;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C4227n;

public class HelpService extends IntentService {
    public HelpService() {
        super("intentService");
    }

    public void onHandleIntent(Intent intent) {
        if (!TextUtils.isEmpty(intent.getStringExtra("awake_info"))) {
            C4227n.m11580a(this, intent, null);
        }
    }
}
