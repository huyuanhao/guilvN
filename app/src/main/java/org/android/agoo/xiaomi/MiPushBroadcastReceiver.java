package org.android.agoo.xiaomi;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.util.List;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

public class MiPushBroadcastReceiver extends PushMessageReceiver {
    public static final String MI_TOKEN = "MI_TOKEN";
    public static final String TAG = "MiPushBroadcastReceiver";
    public AgooFactory agooFactory;

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        try {
            String content = miPushMessage.getContent();
            ALog.m7597d(TAG, "onReceivePassThroughMessage", "msg", content);
            if (this.agooFactory == null) {
                AgooFactory agooFactory2 = new AgooFactory();
                this.agooFactory = agooFactory2;
                agooFactory2.init(context, null, null);
            }
            this.agooFactory.msgRecevie(content.getBytes("UTF-8"), "xiaomi", null);
        } catch (Throwable th) {
            ALog.m7598e(TAG, "onReceivePassThroughMessage", th, new Object[0]);
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        String command = miPushCommandMessage.getCommand();
        List<String> commandArguments = miPushCommandMessage.getCommandArguments();
        String str = null;
        String str2 = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
        if (commandArguments != null && commandArguments.size() > 1) {
            commandArguments.get(1);
        }
        if ("register".equals(command) && miPushCommandMessage.getResultCode() == 0) {
            str = str2;
        }
        ALog.m7597d(TAG, "onReceiveRegisterResult", "regId", str);
        if (!TextUtils.isEmpty(str)) {
            NotifManager notifManager = new NotifManager();
            notifManager.init(context.getApplicationContext());
            notifManager.reportThirdPushToken(str, MI_TOKEN);
            Intent intent = new Intent("com.taobao.android.mipush.token");
            intent.putExtra("token", str);
            context.sendBroadcast(intent);
        }
    }
}
