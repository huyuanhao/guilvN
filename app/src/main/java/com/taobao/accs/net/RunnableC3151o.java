package com.taobao.accs.net;

import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3179k;
import java.util.Iterator;

/* renamed from: com.taobao.accs.net.o */
public class RunnableC3151o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7065a;

    /* renamed from: b */
    public final /* synthetic */ boolean f7066b;

    /* renamed from: c */
    public final /* synthetic */ int f7067c;

    /* renamed from: d */
    public final /* synthetic */ C3145j f7068d;

    public RunnableC3151o(C3145j jVar, int i, boolean z, int i2) {
        this.f7068d = jVar;
        this.f7065a = i;
        this.f7066b = z;
        this.f7067c = i2;
    }

    public void run() {
        Message b;
        int i = this.f7065a;
        if (i > 0) {
            Message.C3109Id id = new Message.C3109Id(i, "");
            Message.C3109Id id2 = null;
            Iterator<Message.C3109Id> it = this.f7068d.f7013e.mo37600f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Message.C3109Id next = it.next();
                if (next.equals(id)) {
                    id2 = next;
                    break;
                }
            }
            if (!(id2 == null || (b = this.f7068d.f7013e.mo37594b(id2.getDataId())) == null)) {
                if (this.f7066b) {
                    if (!this.f7068d.mo37652a(b, 2000)) {
                        this.f7068d.f7013e.mo37588a(b, this.f7067c);
                    }
                    if (b.getNetPermanceMonitor() != null) {
                        C3179k.m7667a("accs", BaseMonitor.COUNT_POINT_RESEND, "total_tnet", AbstractC8352oOoOOoO0.OooO0O0);
                    }
                } else {
                    this.f7068d.f7013e.mo37588a(b, this.f7067c);
                }
            }
        }
        int i2 = this.f7065a;
        if (i2 < 0 && this.f7066b) {
            this.f7068d.mo37656b(i2);
        }
    }
}
