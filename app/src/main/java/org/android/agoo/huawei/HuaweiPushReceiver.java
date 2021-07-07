package org.android.agoo.huawei;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.api.push.PushReceiver;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3178j;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

public class HuaweiPushReceiver extends PushReceiver {
    public static final String HUAWEI_TOKEN = "HW_TOKEN";
    public static final String TAG = "HuaweiPushReceiver";
    public AgooFactory agooFactory;

    @Override // com.huawei.hms.support.api.push.PushReceiver
    public void onEvent(Context context, PushReceiver.Event event, Bundle bundle) {
    }

    @Override // com.huawei.hms.support.api.push.PushReceiver
    public boolean onPushMsg(Context context, byte[] bArr, Bundle bundle) {
        try {
            if (HuaWeiRegister.isChannelRegister) {
                Intent intent = new Intent();
                intent.setAction("org.agoo.android.intent.action.PING_V4");
                intent.setClassName(AgooConstants.TAOBAO_PACKAGE, C3178j.channelService);
                intent.putExtra("source", "huawei-bundle");
                context.startService(intent);
            }
            ALog.m7600i(TAG, "onPushMsg", "content", new String(bArr, "UTF-8"));
            if (this.agooFactory == null) {
                AgooFactory agooFactory2 = new AgooFactory();
                this.agooFactory = agooFactory2;
                agooFactory2.init(context, null, null);
            }
            this.agooFactory.msgRecevie(bArr, AgooConstants.MESSAGE_SYSTEM_SOURCE_HUAWEI, null);
        } catch (Throwable th) {
            ALog.m7598e(TAG, "onPushMsg", th, new Object[0]);
        }
        return true;
    }

    @Override // com.huawei.hms.support.api.push.PushReceiver
    public void onPushState(Context context, boolean z) {
    }

    @Override // com.huawei.hms.support.api.push.PushReceiver
    public void onToken(Context context, String str, Bundle bundle) {
        try {
            if (!TextUtils.isEmpty(str)) {
                ALog.m7600i(TAG, "onToken", "token", str);
                NotifManager notifManager = new NotifManager();
                notifManager.init(context.getApplicationContext());
                notifManager.reportThirdPushToken(str, HUAWEI_TOKEN);
            }
        } catch (Throwable th) {
            ALog.m7598e(TAG, "onToken", th, new Object[0]);
        }
    }
}
