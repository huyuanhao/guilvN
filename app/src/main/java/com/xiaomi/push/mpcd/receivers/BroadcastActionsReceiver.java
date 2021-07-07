package com.xiaomi.push.mpcd.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.push.AbstractC4371dy;

public class BroadcastActionsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public AbstractC4371dy f13049a;

    public BroadcastActionsReceiver(AbstractC4371dy dyVar) {
        this.f13049a = dyVar;
    }

    public void onReceive(Context context, Intent intent) {
        AbstractC4371dy dyVar = this.f13049a;
        if (dyVar != null) {
            dyVar.mo41676a(context, intent);
        }
    }
}
