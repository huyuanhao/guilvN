package com.p118pd.sdk;

import java.util.Arrays;
import p293rx.exceptions.CompositeException;
import p293rx.exceptions.OnErrorFailedException;
import p293rx.exceptions.OnErrorNotImplementedException;
import p293rx.exceptions.UnsubscribeFailedException;

/* renamed from: com.pd.sdk.iLI  reason: case insensitive filesystem */
public class C6158iLI<T> extends AbstractC9508LiLi<T> {
    public final AbstractC9508LiLi<? super T> OooO00o;
    public boolean OooO0O0;

    public C6158iLI(AbstractC9508LiLi<? super T> r1) {
        super(r1);
        this.OooO00o = r1;
    }

    public AbstractC9508LiLi<? super T> OooO00o() {
        return this.OooO00o;
    }

    public void OooO0O0(Throwable th) {
        ilL1l.OooO00o().m17361OooO00o().OooO00o(th);
        try {
            this.OooO00o.onError(th);
            try {
                unsubscribe();
            } catch (Throwable th2) {
                C9714lli.m21756OooO00o(th2);
                throw new OnErrorFailedException(th2);
            }
        } catch (OnErrorNotImplementedException e) {
            unsubscribe();
            throw e;
        } catch (Throwable th3) {
            C9714lli.m21756OooO00o(th3);
            throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(th, th3)));
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        if (!this.OooO0O0) {
            this.OooO0O0 = true;
            try {
                this.OooO00o.onCompleted();
                try {
                    unsubscribe();
                } catch (Throwable th) {
                    C9714lli.m21756OooO00o(th);
                    throw new UnsubscribeFailedException(th.getMessage(), th);
                }
            } catch (Throwable th2) {
                try {
                    unsubscribe();
                    throw th2;
                } catch (Throwable th3) {
                    C9714lli.m21756OooO00o(th3);
                    throw new UnsubscribeFailedException(th3.getMessage(), th3);
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        IIl11.m15447OooO00o(th);
        if (!this.OooO0O0) {
            this.OooO0O0 = true;
            OooO0O0(th);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        try {
            if (!this.OooO0O0) {
                this.OooO00o.onNext(t);
            }
        } catch (Throwable th) {
            IIl11.OooO00o(th, this);
        }
    }
}
