package com.umeng.commonsdk.framework;

import android.content.Context;

public class UMWorkDispatch {
    public static void Quit() {
        C3521c.m9058a();
    }

    public static boolean eventHasExist(int i) {
        return C3521c.m9063a(i);
    }

    public static void registerConnStateObserver(UMSenderStateNotify uMSenderStateNotify) {
        C3521c.m9062a(uMSenderStateNotify);
    }

    public static void sendEvent(Context context, int i, UMLogDataProtocol uMLogDataProtocol, Object obj) {
        C3521c.m9060a(context, i, uMLogDataProtocol, obj);
    }
}
