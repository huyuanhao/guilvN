package com.rxhui.httpclient.calladapter;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.ilL1l;
import java.util.concurrent.atomic.AtomicInteger;
import p293rx.exceptions.CompositeException;
import p293rx.exceptions.OnCompletedFailedException;
import p293rx.exceptions.OnErrorFailedException;
import p293rx.exceptions.OnErrorNotImplementedException;
import retrofit2.Call;
import retrofit2.Response;

public final class CallArbiter<T> extends AtomicInteger implements LlIiLii, AbstractC9465L1l1 {
    public static final int o00oO0O = 0;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public static final int o0ooOoO = 3;
    public final Call<T> call;
    public volatile Response<T> response;
    public final AbstractC9508LiLi<? super Response<T>> subscriber;

    public CallArbiter(Call<T> call2, AbstractC9508LiLi<? super Response<T>> r3) {
        super(0);
        this.call = call2;
        this.subscriber = r3;
    }

    private void OooO00o(Response<T> response2) {
        try {
            if (!isUnsubscribed()) {
                this.subscriber.onNext(response2);
            }
            try {
                if (!isUnsubscribed()) {
                    this.subscriber.onCompleted();
                }
            } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException e) {
                ilL1l.OooO00o().m17361OooO00o().OooO00o(e);
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                ilL1l.OooO00o().m17361OooO00o().OooO00o(th);
            }
        } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException e2) {
            ilL1l.OooO00o().m17361OooO00o().OooO00o(e2);
        } catch (Throwable th2) {
            IIl11.m15447OooO00o(th2);
            try {
                this.subscriber.onError(th2);
            } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException e3) {
                ilL1l.OooO00o().m17361OooO00o().OooO00o(e3);
            } catch (Throwable th3) {
                IIl11.m15447OooO00o(th3);
                ilL1l.OooO00o().m17361OooO00o().OooO00o((Throwable) new CompositeException(th2, th3));
            }
        }
    }

    public void emitError(Throwable th) {
        set(3);
        if (!isUnsubscribed()) {
            try {
                this.subscriber.onError(th);
            } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException e) {
                ilL1l.OooO00o().m17361OooO00o().OooO00o(e);
            } catch (Throwable th2) {
                IIl11.m15447OooO00o(th2);
                ilL1l.OooO00o().m17361OooO00o().OooO00o((Throwable) new CompositeException(th, th2));
            }
        }
    }

    public void emitResponse(Response<T> response2) {
        while (true) {
            int i = get();
            if (i == 0) {
                this.response = response2;
                if (compareAndSet(0, 2)) {
                    return;
                }
            } else if (i != 1) {
                if (i == 2 || i == 3) {
                    throw new AssertionError();
                }
                throw new IllegalStateException("Unknown state: " + i);
            } else if (compareAndSet(1, 3)) {
                OooO00o(response2);
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return this.call.isCanceled();
    }

    @Override // com.p118pd.sdk.AbstractC9465L1l1
    public void request(long j) {
        if (j != 0) {
            while (true) {
                int i = get();
                if (i != 0) {
                    if (i == 1) {
                        return;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown state: " + i);
                        }
                        return;
                    } else if (compareAndSet(2, 3)) {
                        OooO00o(this.response);
                        return;
                    }
                } else if (compareAndSet(0, 1)) {
                    return;
                }
            }
        }
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        this.call.cancel();
    }
}
