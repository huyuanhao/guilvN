package com.p118pd.sdk;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.pd.sdk.ooOOOoo  reason: case insensitive filesystem */
public class C8959ooOOOoo implements AbstractC9847l1<C9349III<? extends Throwable>, C9349III<?>> {
    public long OooO00o = 3000;
    public long OooO0O0 = 3000;
    public int o00oO0O = 3;

    /* renamed from: com.pd.sdk.ooOOOoo$OooO00o */
    public class OooO00o implements AbstractC9847l1<OooO0OO, C9349III<?>> {
        public OooO00o() {
        }

        /* renamed from: OooO00o */
        public C9349III<?> call(OooO0OO oooO0OO) {
            if ((oooO0OO.f22220OooO00o instanceof ConnectException) || (oooO0OO.f22220OooO00o instanceof SocketTimeoutException) || ((oooO0OO.f22220OooO00o instanceof TimeoutException) && oooO0OO.OooO00o < C8959ooOOOoo.this.o00oO0O + 1)) {
                return C9349III.OooOOo0(C8959ooOOOoo.this.OooO00o + (((long) (oooO0OO.OooO00o - 1)) * C8959ooOOOoo.this.OooO0O0), TimeUnit.MILLISECONDS);
            }
            return C9349III.OooO00o(oooO0OO.f22220OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.ooOOOoo$OooO0O0 */
    public class OooO0O0 implements AbstractC5189I1l1l<Throwable, Integer, OooO0OO> {
        public OooO0O0() {
        }

        public OooO0OO OooO00o(Throwable th, Integer num) {
            return new OooO0OO(num.intValue(), th);
        }
    }

    /* renamed from: com.pd.sdk.ooOOOoo$OooO0OO */
    public class OooO0OO {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Throwable f22220OooO00o;

        public OooO0OO(int i, Throwable th) {
            this.OooO00o = i;
            this.f22220OooO00o = th;
        }
    }

    public C8959ooOOOoo() {
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<?> */
    /* renamed from: OooO00o */
    public C9349III<?> call(C9349III<? extends Throwable> r3) {
        return (C9349III<R>) r3.OooO0O0((C9349III) C9349III.OooO0OO(1, this.o00oO0O + 1), (AbstractC5189I1l1l<? super Object, ? super T2, ? extends R>) new OooO0O0()).OooOOO0(new OooO00o());
    }

    public C8959ooOOOoo(int i, long j) {
        this.o00oO0O = i;
        this.OooO00o = j;
    }

    public C8959ooOOOoo(int i, long j, long j2) {
        this.o00oO0O = i;
        this.OooO00o = j;
        this.OooO0O0 = j2;
    }
}
