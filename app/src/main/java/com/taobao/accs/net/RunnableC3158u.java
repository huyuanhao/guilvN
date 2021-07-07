package com.taobao.accs.net;

import com.taobao.accs.data.Message;

/* renamed from: com.taobao.accs.net.u */
public class RunnableC3158u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Message f7108a;

    /* renamed from: b */
    public final /* synthetic */ boolean f7109b;

    /* renamed from: c */
    public final /* synthetic */ C3156t f7110c;

    public RunnableC3158u(C3156t tVar, Message message, boolean z) {
        this.f7110c = tVar;
        this.f7108a = message;
        this.f7109b = z;
    }

    public void run() {
        synchronized (this.f7110c.f7098u) {
            this.f7110c.m7543a((C3156t) this.f7108a);
            if (this.f7110c.f7098u.size() == 0) {
                this.f7110c.f7098u.add(this.f7108a);
            } else {
                Message message = (Message) this.f7110c.f7098u.getFirst();
                if (this.f7108a.getType() != 1) {
                    if (this.f7108a.getType() != 0) {
                        if (this.f7108a.getType() != 2 || message.getType() != 2) {
                            this.f7110c.f7098u.addLast(this.f7108a);
                        } else if (!message.force && this.f7108a.force) {
                            this.f7110c.f7098u.removeFirst();
                            this.f7110c.f7098u.addFirst(this.f7108a);
                        }
                    }
                }
                this.f7110c.f7098u.addLast(this.f7108a);
                if (message.getType() == 2) {
                    this.f7110c.f7098u.removeFirst();
                }
            }
            if (this.f7109b || this.f7110c.f7097t == 3) {
                try {
                    this.f7110c.f7098u.notifyAll();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
