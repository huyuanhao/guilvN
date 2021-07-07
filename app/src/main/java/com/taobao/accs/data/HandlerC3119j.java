package com.taobao.accs.data;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.data.j */
public class HandlerC3119j extends Handler {

    /* renamed from: a */
    public final /* synthetic */ MsgDistributeService f6971a;

    public HandlerC3119j(MsgDistributeService msgDistributeService) {
        this.f6971a = msgDistributeService;
    }

    public void handleMessage(Message message) {
        if (message != null) {
            ALog.m7600i("MsgDistributeService", "handleMessage on receive msg", "msg", message.toString());
            Intent intent = (Intent) message.getData().getParcelable("intent");
            if (intent != null) {
                ALog.m7600i("MsgDistributeService", "handleMessage get intent success", "intent", intent.toString());
                this.f6971a.onStartCommand(intent, 0, 0);
            }
        }
    }
}
