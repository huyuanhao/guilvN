package com.megvii.meglive_sdk.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.megvii.meglive_sdk.volley.n */
public final class C1630n {

    /* renamed from: a */
    public final AtomicInteger f2900a;

    /* renamed from: b */
    public final Map<String, Queue<AbstractC1628m<?>>> f2901b;

    /* renamed from: c */
    public final Set<AbstractC1628m<?>> f2902c;

    /* renamed from: d */
    public final PriorityBlockingQueue<AbstractC1628m<?>> f2903d;

    /* renamed from: e */
    public final PriorityBlockingQueue<AbstractC1628m<?>> f2904e;

    /* renamed from: f */
    public final AbstractC1616b f2905f;

    /* renamed from: g */
    public final AbstractC1622g f2906g;

    /* renamed from: h */
    public final AbstractC1634p f2907h;

    /* renamed from: i */
    public final C1623h[] f2908i;

    /* renamed from: j */
    public C1618c f2909j;

    /* renamed from: k */
    public final List<Object> f2910k;

    public C1630n(AbstractC1616b bVar, AbstractC1622g gVar, AbstractC1634p pVar) {
        this.f2900a = new AtomicInteger();
        this.f2901b = new HashMap();
        this.f2902c = new HashSet();
        this.f2903d = new PriorityBlockingQueue<>();
        this.f2904e = new PriorityBlockingQueue<>();
        this.f2910k = new ArrayList();
        this.f2905f = bVar;
        this.f2906g = gVar;
        this.f2908i = new C1623h[4];
        this.f2907h = pVar;
    }

    /* renamed from: a */
    public final void mo17358a() {
        C1618c cVar = this.f2909j;
        if (cVar != null) {
            cVar.f2862a = true;
            cVar.interrupt();
        }
        C1623h[] hVarArr = this.f2908i;
        for (C1623h hVar : hVarArr) {
            if (hVar != null) {
                hVar.f2872a = true;
                hVar.interrupt();
            }
        }
        C1618c cVar2 = new C1618c(this.f2903d, this.f2904e, this.f2905f, this.f2907h);
        this.f2909j = cVar2;
        cVar2.start();
        for (int i = 0; i < this.f2908i.length; i++) {
            C1623h hVar2 = new C1623h(this.f2904e, this.f2906g, this.f2905f, this.f2907h);
            this.f2908i[i] = hVar2;
            hVar2.start();
        }
    }

    /* renamed from: b */
    public final <T> void mo17359b(AbstractC1628m<T> mVar) {
        synchronized (this.f2902c) {
            mVar.f2886g = null;
            this.f2902c.remove(mVar);
        }
        synchronized (this.f2910k) {
            Iterator<Object> it = this.f2910k.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (mVar.f2889j) {
            synchronized (this.f2901b) {
                String str = mVar.f2884e;
                Queue<AbstractC1628m<?>> remove = this.f2901b.remove(str);
                if (remove != null) {
                    if (C1654u.f2957b) {
                        C1654u.m2872a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), str);
                    }
                    this.f2903d.addAll(remove);
                }
            }
        }
    }

    public C1630n(AbstractC1616b bVar, AbstractC1622g gVar) {
        this(bVar, gVar, new C1621f(new Handler(Looper.getMainLooper())));
    }

    /* renamed from: a */
    public final <T> AbstractC1628m<T> mo17357a(AbstractC1628m<T> mVar) {
        mVar.f2888i = this;
        synchronized (this.f2902c) {
            this.f2902c.add(mVar);
        }
        mVar.f2887h = Integer.valueOf(this.f2900a.incrementAndGet());
        mVar.mo17348a("add-to-queue");
        if (!mVar.f2889j) {
            this.f2904e.add(mVar);
            return mVar;
        }
        synchronized (this.f2901b) {
            String str = mVar.f2884e;
            if (this.f2901b.containsKey(str)) {
                Queue<AbstractC1628m<?>> queue = this.f2901b.get(str);
                if (queue == null) {
                    queue = new LinkedList<>();
                }
                queue.add(mVar);
                this.f2901b.put(str, queue);
                if (C1654u.f2957b) {
                    C1654u.m2872a("Request for cacheKey=%s is in flight, putting on hold.", str);
                }
            } else {
                this.f2901b.put(str, null);
                this.f2903d.add(mVar);
            }
        }
        return mVar;
    }

    public C1630n(AbstractC1616b bVar, AbstractC1622g gVar, byte b) {
        this(bVar, gVar);
    }
}
