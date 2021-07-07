package retrofit2.adapter.rxjava;

import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.ilL1l;
import p293rx.exceptions.CompositeException;
import p293rx.exceptions.OnCompletedFailedException;
import p293rx.exceptions.OnErrorFailedException;
import p293rx.exceptions.OnErrorNotImplementedException;
import retrofit2.Response;

public final class BodyOnSubscribe<T> implements C9349III.OooO00o<T> {
    public final C9349III.OooO00o<Response<T>> upstream;

    public static class BodySubscriber<R> extends AbstractC9508LiLi<Response<R>> {
        public final AbstractC9508LiLi<? super R> subscriber;
        public boolean subscriberTerminated;

        public BodySubscriber(AbstractC9508LiLi<? super R> r1) {
            super(r1);
            this.subscriber = r1;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.subscriberTerminated) {
                this.subscriber.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.subscriberTerminated) {
                this.subscriber.onError(th);
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
                this.subscriber.onNext(response.body());
                return;
            }
            this.subscriberTerminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.subscriber.onError(httpException);
            } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException e) {
                ilL1l.OooO00o().m17361OooO00o().OooO00o(e);
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                ilL1l.OooO00o().m17361OooO00o().OooO00o((Throwable) new CompositeException(httpException, th));
            }
        }
    }

    public BodyOnSubscribe(C9349III.OooO00o<Response<T>> oooO00o) {
        this.upstream = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6153iL1l
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
    }

    public void call(AbstractC9508LiLi<? super T> r3) {
        this.upstream.call(new BodySubscriber(r3));
    }
}
