package p293rx.subscriptions;

import com.p118pd.sdk.C9638ill;
import com.p118pd.sdk.LlIiLii;
import com.umeng.commonsdk.proguard.C3617o;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.subscriptions.RefCountSubscription */
public final class RefCountSubscription implements LlIiLii {
    public static final OooO00o OooO00o = new OooO00o(false, 0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LlIiLii f24197OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicReference<OooO00o> f24198OooO00o = new AtomicReference<>(OooO00o);

    /* renamed from: rx.subscriptions.RefCountSubscription$InnerSubscription */
    public static final class InnerSubscription extends AtomicInteger implements LlIiLii {
        public static final long serialVersionUID = 7005765588239987643L;
        public final RefCountSubscription parent;

        public InnerSubscription(RefCountSubscription refCountSubscription) {
            this.parent = refCountSubscription;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return get() != 0;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (compareAndSet(0, 1)) {
                this.parent.m23028OooO00o();
            }
        }
    }

    /* renamed from: rx.subscriptions.RefCountSubscription$OooO00o */
    public static final class OooO00o {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final boolean f24199OooO00o;

        public OooO00o(boolean z, int i) {
            this.f24199OooO00o = z;
            this.OooO00o = i;
        }

        public OooO00o OooO00o() {
            return new OooO00o(this.f24199OooO00o, this.OooO00o + 1);
        }

        public OooO00o OooO0O0() {
            return new OooO00o(this.f24199OooO00o, this.OooO00o - 1);
        }

        public OooO00o OooO0OO() {
            return new OooO00o(true, this.OooO00o);
        }
    }

    public RefCountSubscription(LlIiLii llIiLii) {
        if (llIiLii != null) {
            this.f24197OooO00o = llIiLii;
            return;
        }
        throw new IllegalArgumentException(C3617o.f9366at);
    }

    public LlIiLii OooO00o() {
        OooO00o oooO00o;
        AtomicReference<OooO00o> atomicReference = this.f24198OooO00o;
        do {
            oooO00o = atomicReference.get();
            if (oooO00o.f24199OooO00o) {
                return C9638ill.OooO0O0();
            }
        } while (!atomicReference.compareAndSet(oooO00o, oooO00o.OooO00o()));
        return new InnerSubscription(this);
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return this.f24198OooO00o.get().f24199OooO00o;
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        OooO00o oooO00o;
        OooO00o OooO0OO;
        AtomicReference<OooO00o> atomicReference = this.f24198OooO00o;
        do {
            oooO00o = atomicReference.get();
            if (!oooO00o.f24199OooO00o) {
                OooO0OO = oooO00o.OooO0OO();
            } else {
                return;
            }
        } while (!atomicReference.compareAndSet(oooO00o, OooO0OO));
        OooO00o(OooO0OO);
    }

    private void OooO00o(OooO00o oooO00o) {
        if (oooO00o.f24199OooO00o && oooO00o.OooO00o == 0) {
            this.f24197OooO00o.unsubscribe();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m23028OooO00o() {
        OooO00o oooO00o;
        OooO00o OooO0O0;
        AtomicReference<OooO00o> atomicReference = this.f24198OooO00o;
        do {
            oooO00o = atomicReference.get();
            OooO0O0 = oooO00o.OooO0O0();
        } while (!atomicReference.compareAndSet(oooO00o, OooO0O0));
        OooO00o(OooO0O0);
    }
}
