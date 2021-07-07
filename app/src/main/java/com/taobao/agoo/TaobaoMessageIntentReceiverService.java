package com.taobao.agoo;

import android.content.Context;
import com.taobao.accs.client.C3103a;
import com.taobao.accs.utl.ALog;
import org.android.agoo.message.MessageReceiverService;

public class TaobaoMessageIntentReceiverService extends MessageReceiverService {
    @Override // org.android.agoo.message.MessageReceiverService
    public String getIntentServiceClassName(Context context) {
        ALog.m7603w("Taobao", "getPackage Name=" + context.getPackageName(), new Object[0]);
        return C3103a.m7296a(context.getPackageName());
    }
}
