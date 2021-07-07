package com.qiyukf.basesdk.p120b.p132b.p135c;

import android.os.SystemClock;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p132b.p133a.AbstractRunnableC1781i;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.qiyukf.basesdk.b.b.c.h */
public abstract class AbstractExecutorC1799h implements Executor {

    /* renamed from: a */
    public static final String f3313a = AbstractExecutorC1799h.class.getSimpleName();

    /* renamed from: b */
    public final AtomicInteger f3314b = new AtomicInteger(1);

    /* renamed from: c */
    public final Queue<Runnable> f3315c;

    /* renamed from: d */
    public final Queue<AbstractRunnableC1781i> f3316d;

    /* renamed from: e */
    public final Thread f3317e;

    /* renamed from: f */
    public final Semaphore f3318f = new Semaphore(0);

    public AbstractExecutorC1799h() {
        Thread thread = new Thread(new Runnable() {
            /* class com.qiyukf.basesdk.p120b.p132b.p135c.AbstractExecutorC1799h.RunnableC18001 */

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 200
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
                */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 894
                */
                throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p120b.p132b.p135c.AbstractExecutorC1799h.RunnableC18001.run():void");
            }
        });
        this.f3317e = thread;
        thread.setName("Socket-Thread");
        this.f3317e.setPriority(10);
        this.f3315c = new LinkedBlockingQueue();
        this.f3316d = new PriorityBlockingQueue();
    }

    /* renamed from: a */
    private Runnable mo34044a() {
        return this.f3315c.poll();
    }

    /* renamed from: a */
    private void m3371a(Runnable runnable) {
        if (runnable != null) {
            if (mo34048d()) {
                m3376m();
            }
            this.f3315c.add(runnable);
            return;
        }
        throw new NullPointerException("task");
    }

    /* renamed from: d */
    private boolean mo34048d() {
        return this.f3314b.get() >= 4;
    }

    /* renamed from: m */
    public static void m3376m() {
        throw new RejectedExecutionException("event executor terminated");
    }

    /* renamed from: a */
    public final void mo34050a(AbstractRunnableC1781i iVar) {
        this.f3316d.add(iVar);
        mo34045a(mo34055h());
    }

    /* renamed from: a */
    public abstract void mo34045a(boolean z);

    /* renamed from: b */
    public abstract void mo34046b();

    /* renamed from: c */
    public abstract void mo34047c();

    /* renamed from: e */
    public final boolean mo34051e() {
        return !this.f3315c.isEmpty();
    }

    public void execute(Runnable runnable) {
        if (runnable != null) {
            boolean h = mo34055h();
            if (h) {
                m3371a(runnable);
            } else {
                if (this.f3314b.get() == 1 && this.f3314b.compareAndSet(1, 2)) {
                    this.f3317e.start();
                }
                m3371a(runnable);
                if (mo34048d()) {
                    if (runnable == null) {
                        throw new NullPointerException("task");
                    } else if (this.f3315c.remove(runnable)) {
                        m3376m();
                    }
                }
            }
            mo34045a(h);
            return;
        }
        throw new NullPointerException("task");
    }

    /* renamed from: f */
    public final boolean mo34053f() {
        while (true) {
            AbstractRunnableC1781i peek = this.f3316d.peek();
            if (peek == null) {
                break;
            }
            if (peek.mo34026a() > SystemClock.elapsedRealtime()) {
                break;
            }
            this.f3316d.remove();
            if (!peek.mo34028c()) {
                this.f3315c.add(peek);
            }
        }
        Runnable a = mo34044a();
        if (a == null) {
            return false;
        }
        do {
            try {
                a.run();
            } catch (Throwable th) {
                C1709a.m3019d(f3313a, "A task raised an exception.", th);
            }
            a = mo34044a();
        } while (a != null);
        return true;
    }

    /* renamed from: g */
    public final long mo34054g() {
        AbstractRunnableC1781i iVar;
        loop0:
        while (true) {
            iVar = null;
            while (iVar == null && this.f3316d.size() > 0) {
                iVar = this.f3316d.peek();
                if (iVar.mo34028c()) {
                    this.f3316d.remove();
                }
            }
        }
        if (iVar != null) {
            return iVar.mo34026a() - SystemClock.elapsedRealtime();
        }
        return 15000;
    }

    /* renamed from: h */
    public final boolean mo34055h() {
        return Thread.currentThread() == this.f3317e;
    }

    /* renamed from: i */
    public final void mo34056i() {
        boolean z;
        if (!mo34048d()) {
            boolean h = mo34055h();
            while (!mo34057j()) {
                int i = this.f3314b.get();
                int i2 = 4;
                if (h || i == 1 || i == 2 || i == 3) {
                    z = true;
                } else {
                    i2 = i;
                    z = false;
                }
                if (this.f3314b.compareAndSet(i, i2)) {
                    if (i == 1) {
                        this.f3317e.start();
                    }
                    if (z) {
                        mo34045a(h);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean mo34057j() {
        return this.f3314b.get() >= 3;
    }

    /* renamed from: k */
    public final boolean mo34058k() {
        if (!mo34057j()) {
            return false;
        }
        if (!mo34055h()) {
            throw new IllegalStateException("must be invoked from an event loop");
        } else if (!mo34053f()) {
            mo34048d();
            return true;
        } else if (mo34048d()) {
            return true;
        } else {
            mo34045a(true);
            return false;
        }
    }
}
