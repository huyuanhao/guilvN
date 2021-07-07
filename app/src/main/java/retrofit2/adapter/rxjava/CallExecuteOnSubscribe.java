package retrofit2.adapter.rxjava;

import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.IIl11;
import retrofit2.Call;
import retrofit2.Response;

public final class CallExecuteOnSubscribe<T> implements C9349III.OooO00o<Response<T>> {
    public final Call<T> originalCall;

    public CallExecuteOnSubscribe(Call<T> call) {
        this.originalCall = call;
    }

    @Override // com.p118pd.sdk.AbstractC6153iL1l
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
    }

    public void call(AbstractC9508LiLi<? super Response<T>> r3) {
        Call<T> clone = this.originalCall.clone();
        CallArbiter callArbiter = new CallArbiter(clone, r3);
        r3.add(callArbiter);
        r3.setProducer(callArbiter);
        try {
            callArbiter.emitResponse(clone.execute());
        } catch (Throwable th) {
            IIl11.m15447OooO00o(th);
            callArbiter.emitError(th);
        }
    }
}
