package com.p118pd.sdk;

import anet.channel.util.ALog;

/* renamed from: com.pd.sdk.o0O0oOO  reason: case insensitive filesystem */
public final class RunnableC7341o0O0oOO implements Runnable {
    public void run() {
        if (C7337o0O0oO.OooO0O0) {
            C7337o0O0oO.OooO0O0 = false;
            ALog.m292w("anet.RemoteGetter", "binding service timeout. reset status!", null, new Object[0]);
        }
    }
}
