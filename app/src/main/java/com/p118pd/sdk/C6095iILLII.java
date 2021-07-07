package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.pd.sdk.iILL丨II  reason: invalid class name and case insensitive filesystem */
public final class C6095iILLII<T> implements C9349III.OooO00o<T> {
    public volatile IIlIIiI1 OooO00o = new IIlIIiI1();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final i11iiILl<? extends T> f17514OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicInteger f17515OooO00o = new AtomicInteger(0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ReentrantLock f17516OooO00o = new ReentrantLock();

    /* renamed from: com.pd.sdk.iILL丨II$OooO00o */
    public class OooO00o implements AbstractC6153iL1l<LlIiLii> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f17517OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicBoolean f17518OooO00o;

        public OooO00o(AbstractC9508LiLi r2, AtomicBoolean atomicBoolean) {
            this.f17517OooO00o = r2;
            this.f17518OooO00o = atomicBoolean;
        }

        /* renamed from: OooO00o */
        public void call(LlIiLii llIiLii) {
            try {
                C6095iILLII.this.OooO00o.OooO00o(llIiLii);
                C6095iILLII.this.OooO00o(this.f17517OooO00o, C6095iILLII.this.OooO00o);
            } finally {
                C6095iILLII.this.f17516OooO00o.unlock();
                this.f17518OooO00o.set(false);
            }
        }
    }

    /* renamed from: com.pd.sdk.iILL丨II$OooO0O0 */
    public class OooO0O0 extends AbstractC9508LiLi<T> {
        public final /* synthetic */ IIlIIiI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f17520OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(AbstractC9508LiLi r2, AbstractC9508LiLi r3, IIlIIiI1 iIlIIiI1) {
            super(r2);
            this.f17520OooO00o = r3;
            this.OooO00o = iIlIIiI1;
        }

        public void OooO0OO() {
            C6095iILLII.this.f17516OooO00o.lock();
            try {
                if (C6095iILLII.this.OooO00o == this.OooO00o) {
                    if (C6095iILLII.this.f17514OooO00o instanceof LlIiLii) {
                        ((LlIiLii) C6095iILLII.this.f17514OooO00o).unsubscribe();
                    }
                    C6095iILLII.this.OooO00o.unsubscribe();
                    C6095iILLII.this.OooO00o = new IIlIIiI1();
                    C6095iILLII.this.f17515OooO00o.set(0);
                }
            } finally {
                C6095iILLII.this.f17516OooO00o.unlock();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            OooO0OO();
            this.f17520OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            OooO0OO();
            this.f17520OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f17520OooO00o.onNext(t);
        }
    }

    /* renamed from: com.pd.sdk.iILL丨II$OooO0OO */
    public class OooO0OO implements liii1l {
        public final /* synthetic */ IIlIIiI1 OooO00o;

        public OooO0OO(IIlIIiI1 iIlIIiI1) {
            this.OooO00o = iIlIIiI1;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            C6095iILLII.this.f17516OooO00o.lock();
            try {
                if (C6095iILLII.this.OooO00o == this.OooO00o && C6095iILLII.this.f17515OooO00o.decrementAndGet() == 0) {
                    if (C6095iILLII.this.f17514OooO00o instanceof LlIiLii) {
                        ((LlIiLii) C6095iILLII.this.f17514OooO00o).unsubscribe();
                    }
                    C6095iILLII.this.OooO00o.unsubscribe();
                    C6095iILLII.this.OooO00o = new IIlIIiI1();
                }
            } finally {
                C6095iILLII.this.f17516OooO00o.unlock();
            }
        }
    }

    public C6095iILLII(i11iiILl<? extends T> i11iiill) {
        this.f17514OooO00o = i11iiill;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r3) {
        this.f17516OooO00o.lock();
        if (this.f17515OooO00o.incrementAndGet() == 1) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.f17514OooO00o.OooO0O0((AbstractC6153iL1l<? super LlIiLii>) OooO00o(r3, atomicBoolean));
            } finally {
                if (atomicBoolean.get()) {
                    this.f17516OooO00o.unlock();
                }
            }
        } else {
            try {
                OooO00o(r3, this.OooO00o);
            } finally {
                this.f17516OooO00o.unlock();
            }
        }
    }

    private AbstractC6153iL1l<LlIiLii> OooO00o(AbstractC9508LiLi<? super T> r2, AtomicBoolean atomicBoolean) {
        return new OooO00o(r2, atomicBoolean);
    }

    public void OooO00o(AbstractC9508LiLi<? super T> r3, IIlIIiI1 iIlIIiI1) {
        r3.add(OooO00o(iIlIIiI1));
        this.f17514OooO00o.OooO0O0((AbstractC9508LiLi<? super Object>) new OooO0O0(r3, r3, iIlIIiI1));
    }

    private LlIiLii OooO00o(IIlIIiI1 iIlIIiI1) {
        return C9638ill.OooO00o(new OooO0OO(iIlIIiI1));
    }
}
