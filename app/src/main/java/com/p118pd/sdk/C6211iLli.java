package com.p118pd.sdk;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.internal.util.UtilityFunctions;

/* renamed from: com.pd.sdk.iL丨li  reason: invalid class name and case insensitive filesystem */
public final class C6211iLli {
    public static final long OooO00o = Long.MIN_VALUE;
    public static final long OooO0O0 = Long.MAX_VALUE;

    public C6211iLli() {
        throw new IllegalStateException("No instances!");
    }

    public static long OooO00o(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static long OooO00o(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, OooO00o(j2, j)));
        return j2;
    }

    public static long OooO0O0(long j, long j2) {
        long j3 = j * j2;
        if (((j | j2) >>> 31) == 0 || j2 == 0 || j3 / j2 == j) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static <T, R> void OooO0O0(AtomicLong atomicLong, Queue<T> queue, AbstractC9508LiLi<? super R> r12, AbstractC9847l1<? super T, ? extends R> r13) {
        long j = atomicLong.get();
        if (j == Long.MAX_VALUE) {
            while (!r12.isUnsubscribed()) {
                T poll = queue.poll();
                if (poll == null) {
                    r12.onCompleted();
                    return;
                }
                r12.onNext((Object) r13.call(poll));
            }
            return;
        }
        do {
            long j2 = Long.MIN_VALUE;
            while (true) {
                if (j2 == j) {
                    if (j2 == j) {
                        if (!r12.isUnsubscribed()) {
                            if (queue.isEmpty()) {
                                r12.onCompleted();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    j = atomicLong.get();
                    if (j == j2) {
                        j = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                    }
                } else if (!r12.isUnsubscribed()) {
                    T poll2 = queue.poll();
                    if (poll2 == null) {
                        r12.onCompleted();
                        return;
                    } else {
                        r12.onNext((Object) r13.call(poll2));
                        j2++;
                    }
                } else {
                    return;
                }
            }
        } while (j != Long.MIN_VALUE);
    }

    public static <T> void OooO00o(AtomicLong atomicLong, Queue<T> queue, AbstractC9508LiLi<? super T> r3) {
        OooO00o(atomicLong, queue, r3, UtilityFunctions.OooO0OO());
    }

    public static <T> boolean OooO00o(AtomicLong atomicLong, long j, Queue<T> queue, AbstractC9508LiLi<? super T> r10) {
        return OooO00o(atomicLong, j, queue, r10, UtilityFunctions.OooO0OO());
    }

    public static <T, R> void OooO00o(AtomicLong atomicLong, Queue<T> queue, AbstractC9508LiLi<? super R> r11, AbstractC9847l1<? super T, ? extends R> r12) {
        long j;
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, Long.MIN_VALUE | j));
        if (j != 0) {
            OooO0O0(atomicLong, queue, r11, r12);
        }
    }

    public static <T, R> boolean OooO00o(AtomicLong atomicLong, long j, Queue<T> queue, AbstractC9508LiLi<? super R> r19, AbstractC9847l1<? super T, ? extends R> r20) {
        long j2;
        long j3;
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        } else if (j == 0) {
            return (atomicLong.get() & Long.MIN_VALUE) == 0;
        } else {
            while (true) {
                j2 = atomicLong.get();
                j3 = j2 & Long.MIN_VALUE;
                if (atomicLong.compareAndSet(j2, OooO00o(Long.MAX_VALUE & j2, j) | j3)) {
                    break;
                }
            }
            if (j2 == Long.MIN_VALUE) {
                OooO0O0(atomicLong, queue, r19, r20);
                return false;
            } else if (j3 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean OooO00o(long j) {
        if (j >= 0) {
            return j != 0;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + j);
    }

    public static long OooO0O0(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                throw new IllegalStateException("More produced than requested: " + j3);
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
