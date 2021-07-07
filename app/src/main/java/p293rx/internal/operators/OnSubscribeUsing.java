package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC6153iL1l;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.AbstractC9847l1;
import com.p118pd.sdk.C6695lilIl;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.LiLIll;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.liii1l;
import java.util.concurrent.atomic.AtomicBoolean;
import p293rx.exceptions.CompositeException;

/* renamed from: rx.internal.operators.OnSubscribeUsing */
public final class OnSubscribeUsing<T, Resource> implements C9349III.OooO00o<T> {
    public final LiLIll<Resource> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6153iL1l<? super Resource> f24062OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super Resource, ? extends C9349III<? extends T>> f24063OooO00o;
    public final boolean OooO0O0;

    /* renamed from: rx.internal.operators.OnSubscribeUsing$DisposeAction */
    public static final class DisposeAction<Resource> extends AtomicBoolean implements liii1l, LlIiLii {
        public static final long serialVersionUID = 4262875056400218316L;
        public AbstractC6153iL1l<? super Resource> dispose;
        public Resource resource;

        public DisposeAction(AbstractC6153iL1l<? super Resource> il1l, Resource resource2) {
            this.dispose = il1l;
            this.resource = resource2;
            lazySet(false);
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            if (compareAndSet(false, true)) {
                try {
                    this.dispose.call(this.resource);
                } finally {
                    this.resource = null;
                    this.dispose = null;
                }
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            call();
        }
    }

    public OnSubscribeUsing(LiLIll<Resource> r1, AbstractC9847l1<? super Resource, ? extends C9349III<? extends T>> r2, AbstractC6153iL1l<? super Resource> il1l, boolean z) {
        this.OooO00o = r1;
        this.f24063OooO00o = r2;
        this.f24062OooO00o = il1l;
        this.OooO0O0 = z;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r7) {
        C9349III<T> r0;
        try {
            Resource call = this.OooO00o.call();
            DisposeAction disposeAction = new DisposeAction(this.f24062OooO00o, call);
            r7.add(disposeAction);
            try {
                C9349III r02 = (C9349III) this.f24063OooO00o.call(call);
                if (this.OooO0O0) {
                    r0 = r02.OooO0Oo((liii1l) disposeAction);
                } else {
                    r0 = r02.OooO00o((liii1l) disposeAction);
                }
                try {
                    r0.OooO0O0((AbstractC9508LiLi) C6695lilIl.OooO00o((AbstractC9508LiLi) r7));
                } catch (Throwable th) {
                    Throwable OooO00o2 = OooO00o(disposeAction);
                    IIl11.m15447OooO00o(th);
                    IIl11.m15447OooO00o(OooO00o2);
                    if (OooO00o2 != null) {
                        r7.onError(new CompositeException(th, OooO00o2));
                        return;
                    }
                    r7.onError(th);
                }
            } catch (Throwable th2) {
                Throwable OooO00o3 = OooO00o(disposeAction);
                IIl11.m15447OooO00o(th2);
                IIl11.m15447OooO00o(OooO00o3);
                if (OooO00o3 != null) {
                    r7.onError(new CompositeException(th2, OooO00o3));
                    return;
                }
                r7.onError(th2);
            }
        } catch (Throwable th3) {
            IIl11.OooO00o(th3, r7);
        }
    }

    private Throwable OooO00o(liii1l r1) {
        try {
            r1.call();
            return null;
        } catch (Throwable th) {
            return th;
        }
    }
}
