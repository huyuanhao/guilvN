package anet.channel.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;

public final class NetworkStatusMonitor$2 extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (ALog.isPrintLog(1)) {
            ALog.m287d("awcn.NetworkStatusMonitor", "receiver:" + intent.getAction(), null, new Object[0]);
        }
        ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0176d(this));
    }
}
