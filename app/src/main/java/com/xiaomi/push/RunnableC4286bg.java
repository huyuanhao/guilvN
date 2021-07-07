package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.clientreport.data.C4164a;
import com.xiaomi.clientreport.processor.AbstractC4174d;

/* renamed from: com.xiaomi.push.bg */
public class RunnableC4286bg implements Runnable {

    /* renamed from: a */
    public Context f11426a;

    /* renamed from: a */
    public C4164a f11427a;

    /* renamed from: a */
    public AbstractC4174d f11428a;

    public RunnableC4286bg(Context context, C4164a aVar, AbstractC4174d dVar) {
        this.f11426a = context;
        this.f11427a = aVar;
        this.f11428a = dVar;
    }

    public void run() {
        AbstractC4174d dVar = this.f11428a;
        if (dVar != null) {
            dVar.mo41269a(this.f11427a);
        }
    }
}
