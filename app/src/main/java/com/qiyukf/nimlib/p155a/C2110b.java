package com.qiyukf.nimlib.p155a;

import com.qiyukf.basesdk.sdk.ResponseCode;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.qiyukf.nimlib.a.b */
public final class C2110b {

    /* renamed from: a */
    public static AtomicInteger f4259a = new AtomicInteger(1);

    /* renamed from: a */
    public static short m4280a(short s, short s2, boolean z) {
        return f4259a.compareAndSet(s, s2) ? s2 : m4281a(z);
    }

    /* renamed from: a */
    public static short m4281a(boolean z) {
        short addAndGet = (short) f4259a.addAndGet(1);
        return (addAndGet < 1000 || !z) ? (addAndGet >= 1000 || z) ? addAndGet : m4280a(addAndGet, ResponseCode.RES_EXCEPTION, false) : m4280a(addAndGet, 2, true);
    }
}
