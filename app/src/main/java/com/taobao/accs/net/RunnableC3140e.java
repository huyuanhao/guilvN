package com.taobao.accs.net;

import android.content.Intent;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.C3103a;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p259a.C3084a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3178j;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;

/* renamed from: com.taobao.accs.net.e */
public class RunnableC3140e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC3137b f7029a;

    public RunnableC3140e(AbstractC3137b bVar) {
        this.f7029a = bVar;
    }

    public void run() {
        ALog.m7597d(this.f7029a.mo37662d(), "startChannelService", new Object[0]);
        Intent intent = new Intent(Constants.ACTION_START_SERVICE);
        intent.putExtra("appKey", this.f7029a.mo37667i());
        intent.putExtra(Constants.KEY_TTID, this.f7029a.f7009a);
        intent.putExtra(Constants.KEY_PACKAGE_NAME, GlobalClientInfo.getContext().getPackageName());
        intent.putExtra("app_sercet", this.f7029a.f7017i.getAppSecret());
        intent.putExtra("mode", AccsClientConfig.mEnv);
        intent.putExtra(Config.PROPERTY_APP_KEY, Config.m14266a(GlobalClientInfo.getContext()));
        intent.putExtra(Constants.KEY_CONFIG_TAG, this.f7029a.f7021m);
        intent.setClassName(GlobalClientInfo.getContext().getPackageName(), C3178j.channelService);
        C3084a.m7226a(GlobalClientInfo.getContext(), intent);
        Intent intent2 = new Intent();
        intent2.setAction(AgooConstants.INTENT_FROM_AGOO_REPORT);
        intent2.setPackage(GlobalClientInfo.getContext().getPackageName());
        intent2.setClassName(GlobalClientInfo.getContext().getPackageName(), C3103a.m7296a(GlobalClientInfo.getContext().getPackageName()));
        C3084a.m7226a(GlobalClientInfo.getContext(), intent2);
    }
}
