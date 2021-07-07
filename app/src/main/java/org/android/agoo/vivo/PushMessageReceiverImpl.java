package org.android.agoo.vivo;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.sdk.BasePushMessageReceiver;
import com.vivo.push.sdk.OpenClientPushMessageReceiver;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.control.NotifManager;

public class PushMessageReceiverImpl extends OpenClientPushMessageReceiver {
    public static final String VIVO_TOKEN = "VIVO_TOKEN";

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onNotificationMessageClicked(Context context, UPSNotificationMessage uPSNotificationMessage) {
        try {
            long msgId = uPSNotificationMessage.getMsgId();
            ALog.m7597d(BasePushMessageReceiver.TAG, "onNotificationMessageClicked", "customMsgId", Long.valueOf(msgId), "customMsgContent", uPSNotificationMessage.getSkipContent(), "payload", uPSNotificationMessage.getParams().get(AgooConstants.MESSAGE_VIVO_PAYLOAD));
            Intent intent = new Intent();
            intent.setClassName(context, uPSNotificationMessage.getSkipContent());
            intent.setFlags(CommonNetImpl.FLAG_AUTH);
            intent.putExtra(AgooConstants.FLAG_FROM_AGOO_MESSAGE_ID, uPSNotificationMessage.getParams().get(AgooConstants.FLAG_FROM_AGOO_MESSAGE_ID));
            intent.putExtra(AgooConstants.MESSAGE_VIVO_PAYLOAD, uPSNotificationMessage.getParams().get(AgooConstants.MESSAGE_VIVO_PAYLOAD));
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onReceiveRegId(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            ALog.m7597d(BasePushMessageReceiver.TAG, "onReceiveRegId", "token", str);
            NotifManager notifManager = new NotifManager();
            notifManager.init(context.getApplicationContext());
            notifManager.reportThirdPushToken(str, VIVO_TOKEN, "1.0.4", true);
        }
    }
}
