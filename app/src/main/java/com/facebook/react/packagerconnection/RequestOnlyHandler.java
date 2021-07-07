package com.facebook.react.packagerconnection;

import com.facebook.common.logging.FLog;
import javax.annotation.Nullable;

public abstract class RequestOnlyHandler implements RequestHandler {
    public static final String TAG = JSPackagerClient.class.getSimpleName();

    @Override // com.facebook.react.packagerconnection.RequestHandler
    public final void onNotification(@Nullable Object obj) {
        FLog.m873e(TAG, "Notification is not supported");
    }

    @Override // com.facebook.react.packagerconnection.RequestHandler
    public abstract void onRequest(@Nullable Object obj, Responder responder);
}
