package com.taobao.accs.antibrush;

import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.antibrush.a */
public class RunnableC3086a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AntiBrush f6825a;

    public RunnableC3086a(AntiBrush antiBrush) {
        this.f6825a = antiBrush;
    }

    public void run() {
        ALog.m7599e(AntiBrush.TAG, "anti bursh timeout", new Object[0]);
        AntiBrush.onResult(AntiBrush.access$000(this.f6825a), false);
    }
}
