package com.taobao.accs.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.taobao.accs.base.IBaseReceiver;
import com.taobao.accs.client.C3103a;
import com.taobao.accs.p259a.C3084a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3178j;
import com.taobao.accs.utl.UtilityImpl;

public class ReceiverImpl implements IBaseReceiver {
    @Override // com.taobao.accs.base.IBaseReceiver
    public void onReceive(Context context, Intent intent) {
        ALog.m7597d("ReceiverImpl", "ReceiverImpl onReceive begin......", new Object[0]);
        if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            intent = new Intent();
        }
        try {
            if (UtilityImpl.m7637e(context)) {
                intent.setClassName(context.getPackageName(), C3178j.channelService);
                C3084a.m7226a(context.getApplicationContext(), intent);
            } else {
                Process.killProcess(Process.myPid());
            }
            if (UtilityImpl.m7638f(context)) {
                intent.setClassName(context, C3103a.m7296a(context.getPackageName()));
                C3084a.m7226a(context.getApplicationContext(), intent);
            }
        } catch (Throwable th) {
            ALog.m7599e("ReceiverImpl", "ReceiverImpl onReceive,exception,e=" + th.getMessage(), new Object[0]);
        }
    }
}
