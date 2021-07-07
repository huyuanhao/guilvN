package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;
import java.util.Arrays;
import p293rx.exceptions.CompositeException;

/* renamed from: com.pd.sdk.ll丨lLI  reason: invalid class name and case insensitive filesystem */
public final class C6809lllLI<T, Resource> implements LLil11.OooOo00<T> {
    public final LiLIll<Resource> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6153iL1l<? super Resource> f18859OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super Resource, ? extends LLil11<? extends T>> f18860OooO00o;
    public final boolean OooO0O0;

    /* renamed from: com.pd.sdk.ll丨lLI$OooO00o */
    public class OooO00o extends AbstractC93021L<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC93021L f18861OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f18862OooO00o;

        public OooO00o(Object obj, AbstractC93021L r3) {
            this.f18862OooO00o = obj;
            this.f18861OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            C6809lllLI r0 = C6809lllLI.this;
            if (r0.OooO0O0) {
                try {
                    r0.f18859OooO00o.call((Object) this.f18862OooO00o);
                } catch (Throwable th) {
                    IIl11.m15447OooO00o(th);
                    this.f18861OooO00o.onError(th);
                    return;
                }
            }
            this.f18861OooO00o.OooO00o((Object) t);
            C6809lllLI r3 = C6809lllLI.this;
            if (!r3.OooO0O0) {
                try {
                    r3.f18859OooO00o.call((Object) this.f18862OooO00o);
                } catch (Throwable th2) {
                    IIl11.m15447OooO00o(th2);
                    C9714lli.m21756OooO00o(th2);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.ll丨lLI */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            C6809lllLI.this.OooO00o(this.f18861OooO00o, this.f18862OooO00o, th);
        }
    }

    public C6809lllLI(LiLIll<Resource> r1, AbstractC9847l1<? super Resource, ? extends LLil11<? extends T>> r2, AbstractC6153iL1l<? super Resource> il1l, boolean z) {
        this.OooO00o = r1;
        this.f18860OooO00o = r2;
        this.f18859OooO00o = il1l;
        this.OooO0O0 = z;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r4) {
        try {
            Resource call = this.OooO00o.call();
            try {
                LLil11 r1 = (LLil11) this.f18860OooO00o.call(call);
                if (r1 == null) {
                    OooO00o(r4, call, new NullPointerException("The single"));
                    return;
                }
                OooO00o oooO00o = new OooO00o(call, r4);
                r4.OooO00o((LlIiLii) oooO00o);
                r1.OooO00o((AbstractC93021L) oooO00o);
            } catch (Throwable th) {
                OooO00o(r4, call, th);
            }
        } catch (Throwable th2) {
            IIl11.m15447OooO00o(th2);
            r4.onError(th2);
        }
    }

    public void OooO00o(AbstractC93021L<? super T> r5, Resource resource, Throwable th) {
        IIl11.m15447OooO00o(th);
        if (this.OooO0O0) {
            try {
                this.f18859OooO00o.call(resource);
            } catch (Throwable th2) {
                IIl11.m15447OooO00o(th2);
                th = new CompositeException(Arrays.asList(th, th2));
            }
        }
        r5.onError(th);
        if (!this.OooO0O0) {
            try {
                this.f18859OooO00o.call(resource);
            } catch (Throwable th3) {
                IIl11.m15447OooO00o(th3);
                C9714lli.m21756OooO00o(th3);
            }
        }
    }
}
