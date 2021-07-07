package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.net.m */
public class RunnableC3149m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f7058a;

    /* renamed from: b */
    public final /* synthetic */ boolean f7059b;

    /* renamed from: c */
    public final /* synthetic */ C3145j f7060c;

    public RunnableC3149m(C3145j jVar, String str, boolean z) {
        this.f7060c = jVar;
        this.f7058a = str;
        this.f7059b = z;
    }

    public void run() {
        Message a = this.f7060c.f7013e.mo37584a(this.f7058a);
        if (a != null) {
            this.f7060c.f7013e.mo37588a(a, -9);
            this.f7060c.mo37650a(this.f7058a, this.f7059b, "receive data time out");
            String d = this.f7060c.mo37662d();
            ALog.m7599e(d, this.f7058a + "-> receive data time out!", new Object[0]);
        }
    }
}
