package com.vivo.push;

import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import com.vivo.push.model.SubscribeAppInfo;
import java.util.ArrayList;

/* renamed from: com.vivo.push.g */
public final class RunnableC4110g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocalAliasTagsManager f11013a;

    public RunnableC4110g(LocalAliasTagsManager localAliasTagsManager) {
        this.f11013a = localAliasTagsManager;
    }

    public final void run() {
        boolean z;
        SubscribeAppInfo retrySubscribeAppInfo = LocalAliasTagsManager.access$000(this.f11013a).getRetrySubscribeAppInfo();
        boolean z2 = true;
        if (retrySubscribeAppInfo != null) {
            try {
                Thread.sleep(TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (retrySubscribeAppInfo.getTargetStatus() == 1) {
                C4121p.m11080a().mo41101a(LocalAliasTagsManager.DEFAULT_LOCAL_REQUEST_ID, retrySubscribeAppInfo.getName());
            } else if (retrySubscribeAppInfo.getTargetStatus() == 2) {
                C4121p.m11080a().mo41111b(LocalAliasTagsManager.DEFAULT_LOCAL_REQUEST_ID, retrySubscribeAppInfo.getName());
            }
            z = true;
        } else {
            z = false;
        }
        ArrayList<String> retrySubscribeAppInfo2 = LocalAliasTagsManager.access$100(this.f11013a).getRetrySubscribeAppInfo();
        if (retrySubscribeAppInfo2 != null && retrySubscribeAppInfo2.size() > 0) {
            if (!z) {
                try {
                    Thread.sleep(TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            } else {
                z2 = z;
            }
            C4121p.m11080a().mo41102a(LocalAliasTagsManager.DEFAULT_LOCAL_REQUEST_ID, retrySubscribeAppInfo2);
            z = z2;
        }
        ArrayList<String> retryUnsubscribeAppInfo = LocalAliasTagsManager.access$100(this.f11013a).getRetryUnsubscribeAppInfo();
        if (retryUnsubscribeAppInfo != null && retryUnsubscribeAppInfo.size() > 0) {
            if (!z) {
                try {
                    Thread.sleep(TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
            }
            C4121p.m11080a().mo41112b(LocalAliasTagsManager.DEFAULT_LOCAL_REQUEST_ID, retryUnsubscribeAppInfo);
        }
    }
}
