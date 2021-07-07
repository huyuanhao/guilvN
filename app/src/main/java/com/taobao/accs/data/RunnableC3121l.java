package com.taobao.accs.data;

import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.data.l */
public class RunnableC3121l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f6973a;

    /* renamed from: b */
    public final /* synthetic */ MsgDistributeService f6974b;

    public RunnableC3121l(MsgDistributeService msgDistributeService, Intent intent) {
        this.f6974b = msgDistributeService;
        this.f6973a = intent;
    }

    public void run() {
        ALog.m7600i("MsgDistributeService", "onStartCommand send message", new Object[0]);
        ACCSManager.AccsRequest accsRequest = (ACCSManager.AccsRequest) this.f6973a.getSerializableExtra(Constants.KEY_SEND_REQDATA);
        String stringExtra = this.f6973a.getStringExtra(Constants.KEY_PACKAGE_NAME);
        String stringExtra2 = this.f6973a.getStringExtra("appKey");
        String stringExtra3 = this.f6973a.getStringExtra(Constants.KEY_CONFIG_TAG);
        if (TextUtils.isEmpty(stringExtra3)) {
            stringExtra3 = stringExtra2;
        }
        ACCSManager.getAccsInstance(this.f6974b.getApplicationContext(), stringExtra2, stringExtra3).mo37461a(this.f6974b.getApplicationContext(), accsRequest, stringExtra, false);
    }
}
