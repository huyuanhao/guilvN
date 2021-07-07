package com.taobao.accs.net;

/* renamed from: com.taobao.accs.net.w */
public class RunnableC3160w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f7112a;

    /* renamed from: b */
    public final /* synthetic */ C3156t f7113b;

    public RunnableC3160w(C3156t tVar, String str) {
        this.f7113b = tVar;
        this.f7112a = str;
    }

    public void run() {
        String str = this.f7112a;
        if (str != null && str.equals(this.f7113b.f7091O) && this.f7113b.f7097t == 2) {
            this.f7113b.f7087K = false;
            this.f7113b.f7089M = true;
            this.f7113b.mo37699n();
            this.f7113b.f7085I.setCloseReason("conn timeout");
        }
    }
}
