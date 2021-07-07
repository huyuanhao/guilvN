package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.C4638bd;

/* renamed from: com.xiaomi.push.service.be */
public class RunnableC4640be implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4638bd f13295a;

    public RunnableC4640be(C4638bd bdVar) {
        this.f13295a = bdVar;
    }

    public void run() {
        try {
            for (C4638bd.AbstractRunnableC4639a aVar : C4638bd.m14047a(this.f13295a).values()) {
                aVar.run();
            }
        } catch (Exception e) {
            AbstractC4163b.m11301a("Sync job exception :" + e.getMessage());
        }
        this.f13295a.f13292a = false;
    }
}
