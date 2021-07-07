package com.umeng.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.entity.UNotificationItem;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import org.json.JSONObject;

public class NotificationProxyBroadcastReceiver extends BroadcastReceiver {
    public static final int EXTRA_ACTION_CLICK = 10;
    public static final int EXTRA_ACTION_DISMISS = 11;
    public static final int EXTRA_ACTION_NOT_EXIST = -1;
    public static final String EXTRA_KEY_ACTION = "ACTION";
    public static final String EXTRA_KEY_MESSAGE_ID = "MESSAGE_ID";
    public static final String EXTRA_KEY_MSG = "MSG";
    public static final String EXTRA_KEY_NOTIFICATION_ID = "NOTIFICATION_ID";
    public static final String EXTRA_KEY_TASK_ID = "TASK_ID";
    public static final int LOCAL_ACTION_CLICK = 12;

    /* renamed from: a */
    public static final String f9894a = NotificationProxyBroadcastReceiver.class.getName();

    /* renamed from: b */
    public UHandler f9895b;

    /* renamed from: a */
    private void m10234a(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            UMLog uMLog = UMConfigure.umDebugLog;
            String str = f9894a;
            UMLog.mutlInfo(str, 0, "找不到应用: " + context.getPackageName());
            return;
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(CommonNetImpl.FLAG_AUTH);
        context.startActivity(launchIntentForPackage);
        UMLog uMLog2 = UMConfigure.umDebugLog;
        String str2 = f9894a;
        UMLog.mutlInfo(str2, 2, "打开应用: " + context.getPackageName());
    }

    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_KEY_MSG);
        try {
            int intExtra = intent.getIntExtra(EXTRA_KEY_ACTION, -1);
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f9894a, 2, String.format("onReceive[msg=%s, action=%d]", stringExtra, Integer.valueOf(intExtra)));
            if (intExtra == 12) {
                m10234a(context);
                return;
            }
            UMessage uMessage = new UMessage(new JSONObject(stringExtra));
            int intExtra2 = intent.getIntExtra(EXTRA_KEY_NOTIFICATION_ID, -1);
            uMessage.message_id = intent.getStringExtra(EXTRA_KEY_MESSAGE_ID);
            uMessage.task_id = intent.getStringExtra(EXTRA_KEY_TASK_ID);
            if (intExtra == 10) {
                UMLog uMLog2 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f9894a, 2, "点击通知");
                UTrack.getInstance(context).setClearPrevMessage(true);
                UTrack.getInstance(context).trackMsgClick(uMessage);
                UHandler notificationClickHandler = PushAgent.getInstance(context).getNotificationClickHandler();
                this.f9895b = notificationClickHandler;
                if (notificationClickHandler != null) {
                    uMessage.clickOrDismiss = true;
                    notificationClickHandler.handleMessage(context, uMessage);
                }
            } else if (intExtra == 11) {
                UMLog uMLog3 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f9894a, 2, "忽略通知");
                UTrack.getInstance(context).setClearPrevMessage(true);
                UTrack.getInstance(context).trackMsgDismissed(uMessage);
                UHandler notificationClickHandler2 = PushAgent.getInstance(context).getNotificationClickHandler();
                this.f9895b = notificationClickHandler2;
                if (notificationClickHandler2 != null) {
                    uMessage.clickOrDismiss = false;
                    notificationClickHandler2.handleMessage(context, uMessage);
                }
            }
            MessageNotificationQueue.getInstance().remove(new UNotificationItem(intExtra2, uMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
