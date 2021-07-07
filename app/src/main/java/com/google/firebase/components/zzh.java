package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class zzh implements Publisher, Subscriber {
    @GuardedBy("this")
    public final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> zza = new HashMap();
    @GuardedBy("this")
    public Queue<Event<?>> zzb = new ArrayDeque();
    public final Executor zzc;

    public zzh(Executor executor) {
        this.zzc = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = r0.next();
        r1.getValue().execute(com.google.firebase.components.zzi.zza(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = zza(r4).iterator();
     */
    @Override // com.google.firebase.events.Publisher
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void publish(com.google.firebase.events.Event<?> r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            monitor-enter(r3)
            java.util.Queue<com.google.firebase.events.Event<?>> r0 = r3.zzb     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<com.google.firebase.events.Event<?>> r0 = r3.zzb     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.zza(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.zzi.zza(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0037
        L_0x0036:
            throw r4
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.zzh.publish(com.google.firebase.events.Event):void");
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(eventHandler);
        Preconditions.checkNotNull(executor);
        if (!this.zza.containsKey(cls)) {
            this.zza.put(cls, new ConcurrentHashMap<>());
        }
        this.zza.get(cls).put(eventHandler, executor);
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void unsubscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(eventHandler);
        if (this.zza.containsKey(cls)) {
            ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = this.zza.get(cls);
            concurrentHashMap.remove(eventHandler);
            if (concurrentHashMap.isEmpty()) {
                this.zza.remove(cls);
            }
        }
    }

    private synchronized Set<Map.Entry<EventHandler<Object>, Executor>> zza(Event<?> event) {
        ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = this.zza.get(event.getType());
        if (concurrentHashMap == null) {
            return Collections.emptySet();
        }
        return concurrentHashMap.entrySet();
    }

    public final void zza() {
        Queue<Event<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.zzb != null) {
                Queue<Event<?>> queue2 = this.zzb;
                this.zzb = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (Event<?> event : queue) {
                publish(event);
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        subscribe(cls, this.zzc, eventHandler);
    }
}
