package com.p118pd.sdk;

import android.os.RemoteException;
import anet.channel.util.ALog;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.pd.sdk.o0O0oO0  reason: case insensitive filesystem */
public class FutureC7338o0O0oO0 implements Future<AbstractC7327o0O0o000> {
    public AbstractC7327o0O0o000 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7330o0O0o0O f20058OooO00o;

    public FutureC7338o0O0oO0(AbstractC7330o0O0o0O o0o0o0o) {
        this.f20058OooO00o = o0o0o0o;
    }

    /* renamed from: OooO00o */
    public AbstractC7327o0O0o000 get() throws InterruptedException, ExecutionException {
        AbstractC7327o0O0o000 o0o0o000 = this.OooO00o;
        if (o0o0o000 != null) {
            return o0o0o000;
        }
        AbstractC7330o0O0o0O o0o0o0o = this.f20058OooO00o;
        if (o0o0o0o != null) {
            try {
                return o0o0o0o.OooO00o(20000);
            } catch (RemoteException e) {
                ALog.m291w("anet.FutureResponse", "[get]", null, e, new Object[0]);
            }
        }
        return null;
    }

    public boolean cancel(boolean z) {
        AbstractC7330o0O0o0O o0o0o0o = this.f20058OooO00o;
        if (o0o0o0o == null) {
            return false;
        }
        try {
            return o0o0o0o.cancel(z);
        } catch (RemoteException e) {
            ALog.m291w("anet.FutureResponse", "[cancel]", null, e, new Object[0]);
            return false;
        }
    }

    public boolean isCancelled() {
        try {
            return this.f20058OooO00o.isCancelled();
        } catch (RemoteException e) {
            ALog.m291w("anet.FutureResponse", "[isCancelled]", null, e, new Object[0]);
            return false;
        }
    }

    public boolean isDone() {
        try {
            return this.f20058OooO00o.isDone();
        } catch (RemoteException e) {
            ALog.m291w("anet.FutureResponse", "[isDone]", null, e, new Object[0]);
            return true;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Future
    public /* synthetic */ AbstractC7327o0O0o000 get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return OooO00o(j);
    }

    public FutureC7338o0O0oO0(AbstractC7327o0O0o000 o0o0o000) {
        this.OooO00o = o0o0o000;
    }

    public AbstractC7327o0O0o000 OooO00o(long j) throws InterruptedException, ExecutionException, TimeoutException {
        AbstractC7327o0O0o000 o0o0o000 = this.OooO00o;
        if (o0o0o000 != null) {
            return o0o0o000;
        }
        AbstractC7330o0O0o0O o0o0o0o = this.f20058OooO00o;
        if (o0o0o0o != null) {
            try {
                return o0o0o0o.OooO00o(j);
            } catch (RemoteException e) {
                ALog.m291w("anet.FutureResponse", "[get(long timeout, TimeUnit unit)]", null, e, new Object[0]);
            }
        }
        return null;
    }
}
