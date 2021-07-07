package org.android.agoo.message;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.taobao.accs.utl.ALog;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.control.BaseIntentService;
import org.android.agoo.service.SendMessage;

public abstract class MessageReceiverService extends Service {

    /* renamed from: a */
    public SendMessage.Stub f13474a = new SendMessage.Stub() {
        /* class org.android.agoo.message.MessageReceiverService.BinderC48141 */

        @Override // org.android.agoo.service.SendMessage
        public int doSend(Intent intent) throws RemoteException {
            Context applicationContext = MessageReceiverService.this.getApplicationContext();
            MessageReceiverService messageReceiverService = MessageReceiverService.this;
            BaseIntentService.runIntentInService(applicationContext, intent, messageReceiverService.getIntentServiceClassName(messageReceiverService.getApplicationContext()));
            return 0;
        }
    };

    public abstract String getIntentServiceClassName(Context context);

    public IBinder onBind(Intent intent) {
        ALog.m7597d("MessageReceiverService", "Message receiver aidl was binded {}", intent.getAction());
        if (AgooConstants.BINDER_MSGRECEIVER_ACTION.equals(intent.getAction())) {
            return this.f13474a;
        }
        return this.f13474a;
    }

    public void onCreate() {
        super.onCreate();
    }
}
