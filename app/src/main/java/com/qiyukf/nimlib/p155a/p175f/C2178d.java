package com.qiyukf.nimlib.p155a.p175f;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.p155a.p157b.AbstractC2128f;
import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.qiyukf.nimlib.a.f.d */
public final class C2178d implements AbstractC2128f {

    /* renamed from: a */
    public final SparseArray<RunnableC2179a> f4344a = new SparseArray<>();

    /* renamed from: b */
    public final int f4345b = 0;

    /* renamed from: c */
    public final int f4346c = 1;

    /* renamed from: d */
    public AtomicInteger f4347d = new AtomicInteger(0);

    /* renamed from: e */
    public Handler f4348e = new Handler(Looper.getMainLooper());

    /* renamed from: com.qiyukf.nimlib.a.f.d$a */
    public class RunnableC2179a implements Runnable {

        /* renamed from: a */
        public AbstractC2177c f4349a;

        public RunnableC2179a(AbstractC2177c cVar) {
            this.f4349a = cVar;
        }

        /* renamed from: a */
        public final int mo34763a() {
            return this.f4349a.mo34752b().mo34667a().mo34948i();
        }

        public final void run() {
            C2178d.this.m4457a((C2178d) this, (RunnableC2179a) false);
        }
    }

    /* renamed from: a */
    private RunnableC2179a m4456a(int i) {
        RunnableC2179a aVar;
        synchronized (this.f4344a) {
            aVar = this.f4344a.get(i);
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m4457a(RunnableC2179a aVar, boolean z) {
        int a;
        RunnableC2179a a2;
        if (m4459a("onTimeout") && (a2 = m4456a((a = aVar.mo34763a()))) != null) {
            if (a2.f4349a.mo34754c()) {
                a2 = m4460b(a);
            }
            if (a2 != null) {
                AbstractC2177c cVar = a2.f4349a;
                if (z) {
                    cVar.mo34757f();
                } else {
                    cVar.mo34756e();
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m4459a(String str) {
        boolean z = true;
        if (this.f4347d.get() != 1) {
            z = false;
        }
        if (!z) {
            C1709a.m3011a("TaskMgr", str + " while not running");
        }
        return z;
    }

    /* renamed from: b */
    private RunnableC2179a m4460b(int i) {
        RunnableC2179a aVar;
        synchronized (this.f4344a) {
            aVar = this.f4344a.get(i);
            if (aVar != null) {
                this.f4344a.remove(i);
            }
        }
        if (aVar != null) {
            this.f4348e.removeCallbacks(aVar);
        }
        return aVar;
    }

    /* renamed from: d */
    private RunnableC2179a m4461d(AbstractC2148a aVar) {
        synchronized (this.f4344a) {
            RunnableC2179a aVar2 = this.f4344a.get(aVar.mo34688a().mo34948i());
            if (aVar2 == null || aVar2.f4349a == null || aVar2.f4349a.mo34752b().mo34670c() != aVar.mo34688a().mo34946g() || aVar2.f4349a.mo34752b().mo34671d() != aVar.mo34692d()) {
                return null;
            }
            return aVar2;
        }
    }

    /* renamed from: d */
    private List<RunnableC2179a> m4462d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f4344a) {
            for (int i = 0; i < this.f4344a.size(); i++) {
                arrayList.add(this.f4344a.valueAt(i));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo34758a() {
        this.f4347d.compareAndSet(0, 1);
    }

    @Override // com.qiyukf.nimlib.p155a.p157b.AbstractC2128f
    /* renamed from: a */
    public final void mo34651a(AbstractC2148a aVar) {
        if (m4459a("pre process")) {
            synchronized (this.f4344a) {
                RunnableC2179a d = m4461d(aVar);
                if (d != null) {
                    this.f4348e.removeCallbacks(d);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo34759a(AbstractC2177c cVar) {
        if (!m4459a("pend task")) {
            return false;
        }
        if (!(cVar.mo34752b() != null)) {
            return false;
        }
        RunnableC2179a aVar = new RunnableC2179a(cVar);
        synchronized (this.f4344a) {
            this.f4344a.put(aVar.mo34763a(), aVar);
            this.f4348e.postDelayed(aVar, (long) (aVar.f4349a.mo34755d() * 1000));
        }
        return true;
    }

    /* renamed from: b */
    public final void mo34760b() {
        if (this.f4347d.compareAndSet(1, 0)) {
            this.f4344a.clear();
        }
    }

    @Override // com.qiyukf.nimlib.p155a.p157b.AbstractC2128f
    /* renamed from: b */
    public final void mo34652b(AbstractC2148a aVar) {
        AbstractC2177c cVar;
        if (m4459a("on processed")) {
            RunnableC2179a d = m4461d(aVar);
            if (!(d == null || (cVar = d.f4349a) == null)) {
                cVar.mo34684a(aVar);
            }
            m4460b(aVar.mo34691c());
        }
    }

    /* renamed from: c */
    public final AbstractC2131a mo34761c(AbstractC2148a aVar) {
        RunnableC2179a d;
        if (m4459a("retrieve request") && (d = m4461d(aVar)) != null) {
            return d.f4349a.mo34752b();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo34762c() {
        if (m4459a("onLogin")) {
            for (RunnableC2179a aVar : m4462d()) {
                m4457a(aVar, true);
            }
        }
    }
}
