package com.facebook.react.packagerconnection;

import com.facebook.common.logging.FLog;
import javax.annotation.Nullable;

public abstract class NotificationOnlyHandler implements RequestHandler {
    public static final String TAG = JSPackagerClient.class.getSimpleName();

    @Override // com.facebook.react.packagerconnection.RequestHandler
    public abstract void onNotification(@Nullable Object obj);

    @Override // com.facebook.react.packagerconnection.RequestHandler
    public final void onRequest(@Nullable Object obj, Responder responder) {
        responder.error("Request is not supported");
        FLog.m873e(TAG, "Request is not supported");
    }
}
