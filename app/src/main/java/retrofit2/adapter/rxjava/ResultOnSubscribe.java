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

public final class ResultOnSubscribe<T> implements C9349III.OooO00o<Result<T>> {
    public final C9349III.OooO00o<Response<T>> upstream;

    public static class ResultSubscriber<R> extends AbstractC9508LiLi<Response<R>> {
        public final AbstractC9508LiLi<? super Result<R>> subscriber;

        public ResultSubscriber(AbstractC9508LiLi<? super Result<R>> r1) {
            super(r1);
            this.subscriber = r1;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.subscriber.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            try {
                this.subscriber.onNext(Result.error(th));
                this.subscriber.onCompleted();
            } catch (Throwable th2) {
                try {
                    this.subscriber.onError(th2);
                } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException e) {
                    ilL1l.OooO00o().m17361OooO00o().OooO00o(e);
                } catch (Throwable th3) {
                    IIl11.m15447OooO00o(th3);
                    ilL1l.OooO00o().m17361OooO00o().OooO00o((Throwable) new CompositeException(th2, th3));
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            onNext((Response) ((Response) obj));
        }

        public void onNext(Response<R> response) {
            this.subscriber.onNext(Result.response(response));
        }
    }

    public ResultOnSubscribe(C9349III.OooO00o<Response<T>> oooO00o) {
        this.upstream = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6153iL1l
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
    }

    public void call(AbstractC9508LiLi<? super Result<T>> r3) {
        this.upstream.call(new ResultSubscriber(r3));
    }
}
