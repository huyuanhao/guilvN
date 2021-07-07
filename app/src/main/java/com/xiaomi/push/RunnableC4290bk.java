package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.clientreport.processor.AbstractC4174d;

/* renamed from: com.xiaomi.push.bk */
public class RunnableC4290bk implements Runnable {

    /* renamed from: a */
    public Context f11433a;

    /* renamed from: a */
    public AbstractC4174d f11434a;

    public RunnableC4290bk(Context context, AbstractC4174d dVar) {
        this.f11433a = context;
        this.f11434a = dVar;
    }

    public void run() {
        try {
            if (this.f11434a != null) {
                this.f11434a.mo41272b();
            }
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
    }
}
