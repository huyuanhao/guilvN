package anet.channel.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.thread.a */
public class C0212a extends ThreadPoolExecutor {
    public C0212a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C0213a(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C0213a(callable);
    }

    /* renamed from: anet.channel.thread.a$a */
    public class C0213a<V> extends FutureTask<V> implements Comparable<C0213a<V>> {

        /* renamed from: b */
        public Object f463b;

        public C0213a(Callable<V> callable) {
            super(callable);
            this.f463b = callable;
        }

        /* renamed from: a */
        public int compareTo(C0213a<V> aVar) {
            if (this == aVar) {
                return 0;
            }
            if (aVar == null) {
                return -1;
            }
            Object obj = this.f463b;
            if (!(obj == null || aVar.f463b == null || !obj.getClass().equals(aVar.f463b.getClass()))) {
                Object obj2 = this.f463b;
                if (obj2 instanceof Comparable) {
                    return ((Comparable) obj2).compareTo(aVar.f463b);
                }
            }
            return 0;
        }

        public C0213a(Runnable runnable, V v) {
            super(runnable, v);
            this.f463b = runnable;
        }
    }
}
