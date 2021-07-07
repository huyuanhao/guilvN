package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.net.c */
public class RunnableC3138c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f7025a;

    /* renamed from: b */
    public final /* synthetic */ boolean f7026b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC3137b f7027c;

    public RunnableC3138c(AbstractC3137b bVar, String str, boolean z) {
        this.f7027c = bVar;
        this.f7025a = str;
        this.f7026b = z;
    }

    public void run() {
        Message a = this.f7027c.f7013e.mo37584a(this.f7025a);
        if (a != null) {
            this.f7027c.f7013e.mo37588a(a, -9);
            this.f7027c.mo37650a(this.f7025a, this.f7026b, "receive data time out");
            String d = this.f7027c.mo37662d();
            ALog.m7599e(d, this.f7025a + "-> receive data time out!", new Object[0]);
        }
    }
}
