package com.xiaomi.push.service;

import com.xiaomi.push.C4486hi;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.xiaomi.push.service.ae */
public final class RunnableC4600ae implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f13155a;

    /* renamed from: a */
    public final /* synthetic */ boolean f13156a;

    public RunnableC4600ae(List list, boolean z) {
        this.f13155a = list;
        this.f13156a = z;
    }

    public void run() {
        int i;
        boolean a = C4599ad.m13908a("www.baidu.com:80");
        Iterator it = this.f13155a.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            a = a || C4599ad.m13908a((String) it.next());
            if (a && !this.f13156a) {
                break;
            }
        }
        if (!a) {
            i = 2;
        }
        C4486hi.m12893a(i);
    }
}
