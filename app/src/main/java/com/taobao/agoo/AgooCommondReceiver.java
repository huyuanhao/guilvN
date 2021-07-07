package com.taobao.agoo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.taobao.accs.client.C3103a;
import com.taobao.accs.p259a.C3084a;

public class AgooCommondReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            intent.setClassName(context, C3103a.m7296a(context.getPackageName()));
            C3084a.m7226a(context, intent);
        } catch (Throwable unused) {
        }
    }
}
