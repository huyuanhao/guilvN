package com.taobao.agoo;

import android.content.Context;
import android.content.Intent;
import org.android.agoo.control.BaseIntentService;

public abstract class TaobaoBaseIntentService extends BaseIntentService {
    @Override // org.android.agoo.control.BaseIntentService
    public abstract void onError(Context context, String str);

    @Override // org.android.agoo.control.BaseIntentService
    public abstract void onMessage(Context context, Intent intent);

    @Override // org.android.agoo.control.BaseIntentService
    public abstract void onRegistered(Context context, String str);

    public abstract void onUnregistered(Context context, String str);

    @Override // org.android.agoo.control.BaseIntentService
    public void onUserCommand(Context context, Intent intent) {
    }
}
