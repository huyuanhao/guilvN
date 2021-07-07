package p293rx.internal.util;

import com.p118pd.sdk.AbstractC9465L1l1;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.internal.util.BackpressureDrainManager */
public final class BackpressureDrainManager extends AtomicLong implements AbstractC9465L1l1 {
    public static final long serialVersionUID = 2826241102729529449L;
    public final OooO00o actual;
    public boolean emitting;
    public Throwable exception;
    public volatile boolean terminated;

    /* renamed from: rx.internal.util.BackpressureDrainManager$OooO00o */
    public interface OooO00o {
        void OooO00o(Throwable th);

        boolean OooO00o(Object obj);

        Object peek();

        Object poll();
    }

    public BackpressureDrainManager(OooO00o oooO00o) {
        this.actual = oooO00o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r5 = r13.actual;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        if (r2 > 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r1 == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        if (r1 == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        if (r5.peek() != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r5.OooO00o(r13.exception);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002f, code lost:
        if (r2 != 0) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        r9 = r5.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0036, code lost:
        if (r9 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0038, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1 = r13.terminated;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003f, code lost:
        if (r5.peek() == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0041, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0043, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        if (get() != Long.MAX_VALUE) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0051, code lost:
        if (r2 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0053, code lost:
        if (r1 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r13.emitting = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0057, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0059, code lost:
        r2 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005b, code lost:
        r9 = addAndGet((long) (-r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0063, code lost:
        if (r9 == 0) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0065, code lost:
        if (r2 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0067, code lost:
        if (r1 == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0069, code lost:
        if (r2 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006c, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006d, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x006f, code lost:
        r13.emitting = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0071, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0073, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0075, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0076, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0077, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x007d, code lost:
        if (r5.OooO00o(r9) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0080, code lost:
        r2 = r2 - 1;
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0086, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0087, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0088, code lost:
        if (r0 == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008a, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r13.emitting = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0092, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        r2 = get();
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drain() {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.util.BackpressureDrainManager.drain():void");
    }

    public boolean isTerminated() {
        return this.terminated;
    }

    @Override // com.p118pd.sdk.AbstractC9465L1l1
    public void request(long j) {
        boolean z;
        if (j != 0) {
            while (true) {
                long j2 = get();
                boolean z2 = true;
                z = j2 == 0;
                long j3 = Long.MAX_VALUE;
                if (j2 == Long.MAX_VALUE) {
                    break;
                }
                if (j == Long.MAX_VALUE) {
                    j3 = j;
                } else {
                    if (j2 <= Long.MAX_VALUE - j) {
                        j3 = j2 + j;
                    }
                    z2 = z;
                }
                if (compareAndSet(j2, j3)) {
                    z = z2;
                    break;
                }
            }
            if (z) {
                drain();
            }
        }
    }

    public void terminate() {
        this.terminated = true;
    }

    public void terminateAndDrain() {
        this.terminated = true;
        drain();
    }

    public void terminate(Throwable th) {
        if (!this.terminated) {
            this.exception = th;
            this.terminated = true;
        }
    }

    public void terminateAndDrain(Throwable th) {
        if (!this.terminated) {
            this.exception = th;
            this.terminated = true;
            drain();
        }
    }
}
