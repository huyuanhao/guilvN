package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4524ir;
import java.util.List;

public class PushMessageHelper {
    public static final String ERROR_MESSAGE = "error_message";
    public static final String ERROR_TYPE = "error_type";
    public static final String ERROR_TYPE_NEED_PERMISSION = "error_lack_of_permission";
    public static final String KEY_COMMAND = "key_command";
    public static final String KEY_MESSAGE = "key_message";
    public static final int MESSAGE_COMMAND = 3;
    public static final int MESSAGE_ERROR = 5;
    public static final int MESSAGE_QUIT = 4;
    public static final int MESSAGE_RAW = 1;
    public static final int MESSAGE_SENDMESSAGE = 2;
    public static final String MESSAGE_TYPE = "message_type";
    public static final int PUSH_MODE_BROADCAST = 2;
    public static final int PUSH_MODE_CALLBACK = 1;
    public static int pushMode;

    public static MiPushCommandMessage generateCommandMessage(String str, List<String> list, long j, String str2, String str3) {
        MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
        miPushCommandMessage.setCommand(str);
        miPushCommandMessage.setCommandArguments(list);
        miPushCommandMessage.setResultCode(j);
        miPushCommandMessage.setReason(str2);
        miPushCommandMessage.setCategory(str3);
        return miPushCommandMessage;
    }

    public static MiPushMessage generateMessage(C4524ir irVar, C4508ib ibVar, boolean z) {
        MiPushMessage miPushMessage = new MiPushMessage();
        miPushMessage.setMessageId(irVar.m13453a());
        if (!TextUtils.isEmpty(irVar.mo42440d())) {
            miPushMessage.setMessageType(1);
            miPushMessage.setAlias(irVar.mo42440d());
        } else if (!TextUtils.isEmpty(irVar.mo42438c())) {
            miPushMessage.setMessageType(2);
            miPushMessage.setTopic(irVar.mo42438c());
        } else if (!TextUtils.isEmpty(irVar.mo42443f())) {
            miPushMessage.setMessageType(3);
            miPushMessage.setUserAccount(irVar.mo42443f());
        } else {
            miPushMessage.setMessageType(0);
        }
        miPushMessage.setCategory(irVar.mo42441e());
        if (irVar.mo42435a() != null) {
            miPushMessage.setContent(irVar.mo42435a().mo42091c());
        }
        if (ibVar != null) {
            if (TextUtils.isEmpty(miPushMessage.getMessageId())) {
                miPushMessage.setMessageId(ibVar.m13097a());
            }
            if (TextUtils.isEmpty(miPushMessage.getTopic())) {
                miPushMessage.setTopic(ibVar.m13108b());
            }
            miPushMessage.setDescription(ibVar.mo42131d());
            miPushMessage.setTitle(ibVar.m13117c());
            miPushMessage.setNotifyType(ibVar.mo42113a());
            miPushMessage.setNotifyId(ibVar.mo42125c());
            miPushMessage.setPassThrough(ibVar.mo42120b());
            miPushMessage.setExtra(ibVar.m13098a());
        }
        miPushMessage.setNotified(z);
        return miPushMessage;
    }

    public static C4508ib generateMessage(MiPushMessage miPushMessage) {
        C4508ib ibVar = new C4508ib();
        ibVar.mo42116a(miPushMessage.getMessageId());
        ibVar.mo42122b(miPushMessage.getTopic());
        ibVar.mo42130d(miPushMessage.getDescription());
        ibVar.mo42127c(miPushMessage.getTitle());
        ibVar.mo42126c(miPushMessage.getNotifyId());
        ibVar.mo42115a(miPushMessage.getNotifyType());
        ibVar.mo42121b(miPushMessage.getPassThrough());
        ibVar.mo42117a(miPushMessage.getExtra());
        return ibVar;
    }

    public static int getPushMode(Context context) {
        if (pushMode == 0) {
            setPushMode(isUseCallbackPushMode(context) ? 1 : 2);
        }
        return pushMode;
    }

    public static boolean isIntentAvailable(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty();
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isUseCallbackPushMode(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setClassName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushServiceReceiver");
        return isIntentAvailable(context, intent);
    }

    public static void sendCommandMessageBroadcast(Context context, MiPushCommandMessage miPushCommandMessage) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(MESSAGE_TYPE, 3);
        intent.putExtra(KEY_COMMAND, miPushCommandMessage);
        new PushServiceReceiver().onReceive(context, intent);
    }

    public static void sendQuitMessageBroadcast(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(MESSAGE_TYPE, 4);
        new PushServiceReceiver().onReceive(context, intent);
    }

    public static void setPushMode(int i) {
        pushMode = i;
    }
}
