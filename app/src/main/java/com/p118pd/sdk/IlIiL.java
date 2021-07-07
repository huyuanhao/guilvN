package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.Notification;

/* renamed from: com.pd.sdk.IlIiL */
public final class IlIiL<T> implements C9349III.OooO0O0<Notification<T>, T> {

    /* renamed from: com.pd.sdk.IlIiL$OooO00o */
    public class OooO00o implements AbstractC9465L1l1 {
        public final /* synthetic */ OooO0OO OooO00o;

        public OooO00o(OooO0OO oooO0OO) {
            this.OooO00o = oooO0OO;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (j > 0) {
                this.OooO00o.OooO00o(j);
            }
        }
    }

    /* renamed from: com.pd.sdk.IlIiL$OooO0O0 */
    public static final class OooO0O0 {
        public static final IlIiL<Object> OooO00o = new IlIiL<>();
    }

    /* renamed from: com.pd.sdk.IlIiL$OooO0OO */
    public static class OooO0OO<T> extends AbstractC9508LiLi<T> {
        public final AbstractC9508LiLi<? super Notification<T>> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicLong f15816OooO00o = new AtomicLong();

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile Notification<T> f15817OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO;

        public OooO0OO(AbstractC9508LiLi<? super Notification<T>> r2) {
            this.OooO00o = r2;
        }

        private void OooO0OO() {
            long j;
            AtomicLong atomicLong = this.f15816OooO00o;
            do {
                j = atomicLong.get();
                if (j == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j - 1));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            if (r7.OooO00o.isUnsubscribed() != false) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
            r1 = r7.f15817OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r1 == null) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
            if (r0.get() <= 0) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            r7.f15817OooO00o = null;
            r7.OooO00o.onNext(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
            if (r7.OooO00o.isUnsubscribed() != false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
            r7.OooO00o.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
            if (r7.OooO0OO != false) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
            r7.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0048, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            r0 = r7.f15816OooO00o;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void OooO0Oo() {
            /*
                r7 = this;
                monitor-enter(r7)
                boolean r0 = r7.OooO0O0     // Catch:{ all -> 0x0049 }
                if (r0 == 0) goto L_0x000a
                r0 = 1
                r7.OooO0OO = r0     // Catch:{ all -> 0x0049 }
                monitor-exit(r7)     // Catch:{ all -> 0x0049 }
                return
            L_0x000a:
                monitor-exit(r7)     // Catch:{ all -> 0x0049 }
                java.util.concurrent.atomic.AtomicLong r0 = r7.f15816OooO00o
            L_0x000d:
                com.pd.sdk.丨LiL丨丨i<? super rx.Notification<T>> r1 = r7.OooO00o
                boolean r1 = r1.isUnsubscribed()
                if (r1 != 0) goto L_0x0048
                rx.Notification<T> r1 = r7.f15817OooO00o
                if (r1 == 0) goto L_0x0039
                long r2 = r0.get()
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0039
                r0 = 0
                r7.f15817OooO00o = r0
                com.pd.sdk.丨LiL丨丨i<? super rx.Notification<T>> r0 = r7.OooO00o
                r0.onNext(r1)
                com.pd.sdk.丨LiL丨丨i<? super rx.Notification<T>> r0 = r7.OooO00o
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L_0x0038
                com.pd.sdk.丨LiL丨丨i<? super rx.Notification<T>> r0 = r7.OooO00o
                r0.onCompleted()
            L_0x0038:
                return
            L_0x0039:
                monitor-enter(r7)
                boolean r1 = r7.OooO0OO     // Catch:{ all -> 0x0045 }
                if (r1 != 0) goto L_0x0043
                r0 = 0
                r7.OooO0O0 = r0     // Catch:{ all -> 0x0045 }
                monitor-exit(r7)     // Catch:{ all -> 0x0045 }
                return
            L_0x0043:
                monitor-exit(r7)     // Catch:{ all -> 0x0045 }
                goto L_0x000d
            L_0x0045:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0045 }
                throw r0
            L_0x0048:
                return
            L_0x0049:
                r0 = move-exception
                monitor-exit(r7)
                goto L_0x004d
            L_0x004c:
                throw r0
            L_0x004d:
                goto L_0x004c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.IlIiL.OooO0OO.OooO0Oo():void");
        }

        public void OooO00o(long j) {
            C6211iLli.OooO00o(this.f15816OooO00o, j);
            request(j);
            OooO0Oo();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f15817OooO00o = Notification.OooO00o();
            OooO0Oo();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f15817OooO00o = Notification.OooO00o(th);
            C9714lli.m21756OooO00o(th);
            OooO0Oo();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.OooO00o.onNext(Notification.OooO00o((Object) t));
            OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(0);
        }
    }

    public static <T> IlIiL<T> OooO00o() {
        return (IlIiL<T>) OooO0O0.OooO00o;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super Notification<T>> r3) {
        OooO0OO oooO0OO = new OooO0OO(r3);
        r3.add(oooO0OO);
        r3.setProducer(new OooO00o(oooO0OO));
        return oooO0OO;
    }
}
