package com.p118pd.sdk;

import android.os.RemoteException;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.aidl.NetworkResponse;
import com.p118pd.sdk.AbstractC7330o0O0o0O;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.o0O0o0oo  reason: case insensitive filesystem */
public class BinderC7336o0O0o0oo extends AbstractC7330o0O0o0O.OooO00o {
    public static final String OooO0O0 = "anet.ParcelableFutureResponse";
    public NetworkResponse OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Future<AbstractC7327o0O0o000> f20053OooO00o;

    public BinderC7336o0O0o0oo(Future<AbstractC7327o0O0o000> future) {
        this.f20053OooO00o = future;
    }

    @Override // com.p118pd.sdk.AbstractC7330o0O0o0O
    public NetworkResponse OooO00o(long j) throws RemoteException {
        Future<AbstractC7327o0O0o000> future = this.f20053OooO00o;
        if (future == null) {
            NetworkResponse networkResponse = this.OooO00o;
            if (networkResponse != null) {
                return networkResponse;
            }
            return new NetworkResponse(ErrorConstant.ERROR_REQUEST_FAIL);
        }
        try {
            return (NetworkResponse) future.get(j, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            if ("NO SUPPORT".equalsIgnoreCase(e.getMessage())) {
                ALog.m288e(OooO0O0, "[get]有listener将不支持future.get()方法，如有需要请listener传入null", null, e, new Object[0]);
            }
            return new NetworkResponse(ErrorConstant.ERROR_REQUEST_FAIL);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7330o0O0o0O
    public boolean cancel(boolean z) throws RemoteException {
        Future<AbstractC7327o0O0o000> future = this.f20053OooO00o;
        if (future == null) {
            return true;
        }
        return future.cancel(z);
    }

    @Override // com.p118pd.sdk.AbstractC7330o0O0o0O
    public boolean isCancelled() throws RemoteException {
        Future<AbstractC7327o0O0o000> future = this.f20053OooO00o;
        if (future == null) {
            return true;
        }
        return future.isCancelled();
    }

    @Override // com.p118pd.sdk.AbstractC7330o0O0o0O
    public boolean isDone() throws RemoteException {
        Future<AbstractC7327o0O0o000> future = this.f20053OooO00o;
        if (future == null) {
            return true;
        }
        return future.isDone();
    }
}
