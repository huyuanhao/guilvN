package com.qiyukf.basesdk.p120b.p132b.p135c;

import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p132b.p133a.C1766b;
import com.qiyukf.basesdk.p120b.p132b.p133a.C1783k;
import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.qiyukf.basesdk.b.b.c.f */
public final class C1796f extends AbstractExecutorC1799h {

    /* renamed from: a */
    public static final String f3306a = C1796f.class.getSimpleName();

    /* renamed from: b */
    public Selector f3307b = m3358m();

    /* renamed from: c */
    public final SelectorProvider f3308c = SelectorProvider.provider();

    /* renamed from: d */
    public final AtomicBoolean f3309d = new AtomicBoolean();

    /* renamed from: e */
    public boolean f3310e;

    /* renamed from: f */
    public boolean f3311f;

    /* renamed from: a */
    private void m3357a(Set<SelectionKey> set) {
        if (!set.isEmpty()) {
            do {
                Iterator<SelectionKey> it = set.iterator();
                do {
                    SelectionKey next = it.next();
                    Object attachment = next.attachment();
                    it.remove();
                    if (attachment instanceof C1783k) {
                        C1783k kVar = (C1783k) attachment;
                        if (next.isValid()) {
                            try {
                                int readyOps = next.readyOps();
                                if ((readyOps & 1) != 0 || readyOps == 0) {
                                    kVar.mo34036h();
                                    if (!kVar.mo33986d()) {
                                    }
                                }
                                if ((readyOps & 4) != 0) {
                                    kVar.mo33984b().mo34068d();
                                }
                                if ((readyOps & 8) != 0) {
                                    next.interestOps(next.interestOps() & -9);
                                    kVar.mo33982a().mo34016b();
                                }
                            } catch (CancelledKeyException unused) {
                            }
                        }
                        kVar.mo33987e();
                    }
                    if (!it.hasNext()) {
                        return;
                    }
                } while (!this.f3311f);
                set = this.f3307b.selectedKeys();
            } while (!set.isEmpty());
        }
    }

    /* renamed from: m */
    private Selector m3358m() {
        try {
            return this.f3308c.openSelector();
        } catch (IOException e) {
            throw new C1766b("failed to open a new selector", e);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:7|8|9|10|(6:13|14|15|(1:39)(2:17|(2:19|40)(2:20|(2:22|42)(1:41)))|37|11)|38|27|28|29|30) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026 A[Catch:{ ConcurrentModificationException -> 0x0018 }] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3359n() {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p120b.p132b.p135c.C1796f.m3359n():void");
    }

    /* renamed from: o */
    private void m3360o() {
        Set<SelectionKey> keys = this.f3307b.keys();
        ArrayList<C1783k> arrayList = new ArrayList(keys.size());
        for (SelectionKey selectionKey : keys) {
            Object attachment = selectionKey.attachment();
            if (attachment instanceof C1783k) {
                arrayList.add((C1783k) attachment);
            }
        }
        for (C1783k kVar : arrayList) {
            kVar.mo33987e();
        }
    }

    /* renamed from: a */
    public final Selector mo34044a() {
        return this.f3307b;
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractExecutorC1799h
    /* renamed from: a */
    public final void mo34045a(boolean z) {
        if (!z && this.f3309d.compareAndSet(false, true)) {
            this.f3307b.wakeup();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r6 == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r0.selectNow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r6 = 1;
     */
    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractExecutorC1799h
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34046b() {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p120b.p132b.p135c.C1796f.mo34046b():void");
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractExecutorC1799h
    /* renamed from: c */
    public final void mo34047c() {
        try {
            this.f3307b.close();
        } catch (IOException e) {
            C1709a.m3019d(f3306a, "Failed to close a selector.", e);
        }
    }

    /* renamed from: d */
    public final void mo34048d() {
        try {
            this.f3307b.selectNow();
        } finally {
            if (this.f3309d.get()) {
                this.f3307b.wakeup();
            }
        }
    }
}
