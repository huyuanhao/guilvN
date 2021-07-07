package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.rxhui.httpclient.calladapter.HttpException;
import p293rx.exceptions.CompositeException;
import p293rx.exceptions.OnCompletedFailedException;
import p293rx.exceptions.OnErrorFailedException;
import p293rx.exceptions.OnErrorNotImplementedException;
import retrofit2.Response;

/* renamed from: com.pd.sdk.ooOOooO0  reason: case insensitive filesystem */
public final class C8993ooOOooO0<T> implements C9349III.OooO00o<T> {
    public final C9349III.OooO00o<Response<T>> OooO00o;

    /* renamed from: com.pd.sdk.ooOOooO0$OooO00o */
    public static class OooO00o<R> extends AbstractC9508LiLi<Response<R>> {
        public final AbstractC9508LiLi<? super R> OooO00o;
        public boolean OooO0O0;

        public OooO00o(AbstractC9508LiLi<? super R> r1) {
            super(r1);
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.OooO0O0) {
                this.OooO00o.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a Retrofit bug with the full stacktrace.");
            assertionError.initCause(th);
            ilL1l.OooO00o().m17361OooO00o().OooO00o((Throwable) assertionError);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            onNext((Response) ((Response) obj));
        }

        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.OooO00o.onNext(response.body());
                return;
            }
            this.OooO0O0 = true;
            HttpException httpException = new HttpException(response);
            try {
                this.OooO00o.onError(httpException);
            } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException e) {
                ilL1l.OooO00o().m17361OooO00o().OooO00o(e);
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                ilL1l.OooO00o().m17361OooO00o().OooO00o((Throwable) new CompositeException(httpException, th));
            }
        }
    }

    public C8993ooOOooO0(C9349III.OooO00o<Response<T>> oooO00o) {
        this.OooO00o = oooO00o;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r3) {
        this.OooO00o.call(new OooO00o(r3));
    }
}
