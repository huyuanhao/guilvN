package com.vivo.push;

import android.text.TextUtils;
import com.vivo.push.LocalAliasTagsManager;
import com.vivo.push.model.SubscribeAppInfo;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.util.C4146p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.vivo.push.j */
public final class RunnableC4113j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UnvarnishedMessage f11018a;

    /* renamed from: b */
    public final /* synthetic */ LocalAliasTagsManager.LocalMessageCallback f11019b;

    /* renamed from: c */
    public final /* synthetic */ LocalAliasTagsManager f11020c;

    public RunnableC4113j(LocalAliasTagsManager localAliasTagsManager, UnvarnishedMessage unvarnishedMessage, LocalAliasTagsManager.LocalMessageCallback localMessageCallback) {
        this.f11020c = localAliasTagsManager;
        this.f11018a = unvarnishedMessage;
        this.f11019b = localMessageCallback;
    }

    public final void run() {
        List<String> subscribeTags;
        int targetType = this.f11018a.getTargetType();
        String tragetContent = this.f11018a.getTragetContent();
        if (!TextUtils.isEmpty(tragetContent) && targetType != 0) {
            if (targetType == 3) {
                SubscribeAppInfo subscribeAppInfo = LocalAliasTagsManager.access$000(this.f11020c).getSubscribeAppInfo();
                if (subscribeAppInfo == null || subscribeAppInfo.getTargetStatus() != 1 || !subscribeAppInfo.getName().equals(tragetContent)) {
                    C4121p.m11080a().mo41111b(LocalAliasTagsManager.DEFAULT_LOCAL_REQUEST_ID, tragetContent);
                    C4146p.m11204a(LocalAliasTagsManager.TAG, tragetContent + " has ignored ; current Alias is " + subscribeAppInfo);
                    return;
                }
            } else if (targetType == 4 && ((subscribeTags = LocalAliasTagsManager.access$100(this.f11020c).getSubscribeTags()) == null || !subscribeTags.contains(tragetContent))) {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(tragetContent);
                C4121p.m11080a().mo41112b(LocalAliasTagsManager.DEFAULT_LOCAL_REQUEST_ID, arrayList);
                C4146p.m11204a(LocalAliasTagsManager.TAG, tragetContent + " has ignored ; current tags is " + subscribeTags);
                return;
            }
        }
        LocalAliasTagsManager.access$300(this.f11020c).post(new RunnableC4114k(this));
    }
}
