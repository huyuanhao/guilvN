package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.rxhui.httpclient.calladapter.CallArbiter;
import retrofit2.Call;
import retrofit2.Response;

/* renamed from: com.pd.sdk.ooOOooO  reason: case insensitive filesystem */
public final class C8992ooOOooO<T> implements C9349III.OooO00o<Response<T>> {
    public final Call<T> OooO00o;

    public C8992ooOOooO(Call<T> call) {
        this.OooO00o = call;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super Response<T>> r3) {
        Call<T> clone = this.OooO00o.clone();
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
