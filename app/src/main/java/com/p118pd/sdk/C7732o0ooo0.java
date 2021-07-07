package com.p118pd.sdk;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.pd.sdk.o0ooo0  reason: case insensitive filesystem */
public final class C7732o0ooo0 {
    public final OooO0O0 OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<String, OooO00o> f20729OooO00o = new HashMap();

    /* renamed from: com.pd.sdk.o0ooo0$OooO00o */
    public static class OooO00o {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Lock f20730OooO00o = new ReentrantLock();
    }

    public void OooO00o(String str) {
        OooO00o oooO00o;
        synchronized (this) {
            oooO00o = this.f20729OooO00o.get(str);
            if (oooO00o == null) {
                oooO00o = this.OooO00o.OooO00o();
                this.f20729OooO00o.put(str, oooO00o);
            }
            oooO00o.OooO00o++;
        }
        oooO00o.f20730OooO00o.lock();
    }

    public void OooO0O0(String str) {
        OooO00o oooO00o;
        synchronized (this) {
            oooO00o = (OooO00o) C7842oO0O0.OooO00o(this.f20729OooO00o.get(str));
            if (oooO00o.OooO00o >= 1) {
                int i = oooO00o.OooO00o - 1;
                oooO00o.OooO00o = i;
                if (i == 0) {
                    OooO00o remove = this.f20729OooO00o.remove(str);
                    if (remove.equals(oooO00o)) {
                        this.OooO00o.OooO00o(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + oooO00o + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + oooO00o.OooO00o);
            }
        }
        oooO00o.f20730OooO00o.unlock();
    }

    /* renamed from: com.pd.sdk.o0ooo0$OooO0O0 */
    public static class OooO0O0 {
        public static final int OooO00o = 10;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Queue<OooO00o> f20731OooO00o = new ArrayDeque();

        public OooO00o OooO00o() {
            OooO00o poll;
            synchronized (this.f20731OooO00o) {
                poll = this.f20731OooO00o.poll();
            }
            return poll == null ? new OooO00o() : poll;
        }

        public void OooO00o(OooO00o oooO00o) {
            synchronized (this.f20731OooO00o) {
                if (this.f20731OooO00o.size() < 10) {
                    this.f20731OooO00o.offer(oooO00o);
                }
            }
        }
    }
}
