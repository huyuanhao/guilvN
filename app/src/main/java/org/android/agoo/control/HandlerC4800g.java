package org.android.agoo.control;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;

/* renamed from: org.android.agoo.control.g */
public class HandlerC4800g extends Handler {

    /* renamed from: a */
    public final /* synthetic */ BaseIntentService f13458a;

    public HandlerC4800g(BaseIntentService baseIntentService) {
        this.f13458a = baseIntentService;
    }

    public void handleMessage(Message message) {
        if (message != null) {
            ALog.m7600i(BaseIntentService.TAG, "handleMessage on receive msg", "msg", message.toString());
            Intent intent = (Intent) message.getData().getParcelable("intent");
            if (intent != null) {
                ALog.m7600i(BaseIntentService.TAG, "handleMessage get intent success", "intent", intent.toString());
                ThreadPoolExecutorFactory.execute(new RunnableC4801h(this, intent));
            }
        }
    }
}
