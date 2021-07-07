package com.netease.nimlib.mixpush.p117mi;

import android.content.Context;
import com.netease.nimlib.sdk.mixpush.MiPushMessageReceiver;
import com.p118pd.sdk.C8803ooO000oo;
import com.p118pd.sdk.C8827ooO0O0OO;
import com.p118pd.sdk.C9004ooOo000o;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.util.List;

/* renamed from: com.netease.nimlib.mixpush.mi.MiPushReceiver */
public final class MiPushReceiver extends PushMessageReceiver {
    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        MiPushMessageReceiver OooO00o = C9004ooOo000o.m20669OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO00o(context, miPushCommandMessage);
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
        MiPushMessageReceiver OooO00o = C9004ooOo000o.m20669OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO00o(context, miPushMessage);
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
        if (C8803ooO000oo.OooO00o(miPushMessage.getExtra())) {
            C8827ooO0O0OO.OooO00o(5).OooO00o(context, miPushMessage);
            return;
        }
        MiPushMessageReceiver OooO00o = C9004ooOo000o.m20669OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO0O0(context, miPushMessage);
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        MiPushMessageReceiver OooO00o = C9004ooOo000o.m20669OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO0OO(context, miPushMessage);
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        String command = miPushCommandMessage.getCommand();
        List<String> commandArguments = miPushCommandMessage.getCommandArguments();
        String str = null;
        String str2 = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
        long resultCode = miPushCommandMessage.getResultCode();
        if ("register".equals(command)) {
            if (resultCode == 0) {
                str = str2;
            }
            C8827ooO0O0OO.OooO00o(5).OooO00o(str);
            MiPushMessageReceiver OooO00o = C9004ooOo000o.m20669OooO00o(context);
            if (OooO00o != null) {
                OooO00o.OooO0O0(context, miPushCommandMessage);
            }
        }
    }
}
