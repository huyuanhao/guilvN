package org.android.agoo.control;

import com.taobao.accs.client.C3103a;
import org.android.agoo.message.MessageService;

/* renamed from: org.android.agoo.control.j */
public class RunnableC4803j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BaseIntentService f13462a;

    public RunnableC4803j(BaseIntentService baseIntentService) {
        this.f13462a = baseIntentService;
    }

    public void run() {
        C3103a.f6877g.incrementAndGet();
        this.f13462a.notifyManager = new NotifManager();
        this.f13462a.notifyManager.init(this.f13462a.getApplicationContext());
        this.f13462a.messageService = new MessageService();
        this.f13462a.messageService.mo44537a(this.f13462a.getApplicationContext());
        this.f13462a.agooFactory = new AgooFactory();
        this.f13462a.agooFactory.init(this.f13462a.getApplicationContext(), this.f13462a.notifyManager, this.f13462a.messageService);
    }
}
