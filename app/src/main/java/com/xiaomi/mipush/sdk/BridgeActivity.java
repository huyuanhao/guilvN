package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import s.h.e.l.l.C;

public class BridgeActivity extends Activity {
    static {
        C.i(16777279);
    }

    public native void onCreate(Bundle bundle);

    public void onResume() {
        Intent intent;
        super.onResume();
        try {
            Intent intent2 = getIntent();
            if (!(intent2 == null || (intent = (Intent) intent2.getParcelableExtra("mipush_serviceIntent")) == null)) {
                PushMessageHandler.m11386a(getApplicationContext(), intent);
            }
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        } catch (Throwable th) {
            finish();
            throw th;
        }
        finish();
    }
}
