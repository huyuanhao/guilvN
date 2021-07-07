package com.taobao.accs.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;

public class InAppConnection$1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C3145j f7005a;

    public InAppConnection$1(C3145j jVar) {
        this.f7005a = jVar;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            TaoBaseService.ConnectInfo connectInfo = (TaoBaseService.ConnectInfo) intent.getExtras().get(Constants.KEY_CONNECT_INFO);
            if (this.f7005a.mo37654b((String) null).equals(connectInfo.host)) {
                this.f7005a.f7046s.set(connectInfo.connected);
            }
        } catch (Throwable th) {
            ALog.m7598e(this.f7005a.mo37662d(), "receive connect info error", th, new Object[0]);
        }
    }
}
