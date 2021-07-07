package com.vivo.push.sdk;

import android.content.Context;
import com.vivo.push.LocalAliasTagsManager;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.model.UnvarnishedMessage;
import java.util.List;

public abstract class PushMessageReceiver extends BasePushMessageReceiver implements LocalAliasTagsManager.LocalMessageCallback {
    @Override // com.vivo.push.sdk.BasePushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onDelAlias(Context context, int i, List<String> list, List<String> list2, String str) {
        LocalAliasTagsManager.getInstance(context).onDelAlias(list, str);
    }

    @Override // com.vivo.push.sdk.BasePushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onDelTags(Context context, int i, List<String> list, List<String> list2, String str) {
        LocalAliasTagsManager.getInstance(context).onDelTags(list, str);
    }

    @Override // com.vivo.push.sdk.PushMessageCallback, com.vivo.push.LocalAliasTagsManager.LocalMessageCallback
    public boolean onNotificationMessageArrived(Context context, UPSNotificationMessage uPSNotificationMessage) {
        return LocalAliasTagsManager.getInstance(context).onReceiverNotification(uPSNotificationMessage, this);
    }

    @Override // com.vivo.push.sdk.BasePushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onSetAlias(Context context, int i, List<String> list, List<String> list2, String str) {
        LocalAliasTagsManager.getInstance(context).onSetAlias(list, str);
    }

    @Override // com.vivo.push.sdk.BasePushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onSetTags(Context context, int i, List<String> list, List<String> list2, String str) {
        LocalAliasTagsManager.getInstance(context).onSetTags(list, str);
    }

    @Override // com.vivo.push.sdk.BasePushMessageReceiver, com.vivo.push.sdk.PushMessageCallback, com.vivo.push.LocalAliasTagsManager.LocalMessageCallback
    public void onTransmissionMessage(Context context, UnvarnishedMessage unvarnishedMessage) {
        LocalAliasTagsManager.getInstance(context).onReceiverMsg(unvarnishedMessage, this);
    }
}
