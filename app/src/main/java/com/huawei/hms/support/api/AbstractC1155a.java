package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.C1202a;
import com.huawei.hms.support.p039a.C1154a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;

/* renamed from: com.huawei.hms.support.api.a */
public abstract class AbstractC1155a<R extends Result> extends PendingResult<R> {

    /* renamed from: a */
    public R f1186a = null;

    /* renamed from: b */
    public int f1187b;

    public AbstractC1155a(int i) {
        this.f1187b = i;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        return await(0, null);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(ResultCallback<R> resultCallback) {
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j, TimeUnit timeUnit) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return m1134a(this.f1187b);
        }
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
        if (looper == null) {
            looper = Looper.myLooper();
        }
        new Handler(looper).post(new RunnableC1159b(this, resultCallback));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public R m1134a(int i) {
        Type genericSuperclass = AbstractC1155a.class.getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        try {
            R r = (R) ((Result) C1154a.m1132a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]).newInstance());
            this.f1186a = r;
            r.setStatus(new Status(i));
        } catch (InstantiationException unused) {
            C1202a.m1320d("ErrorResultImpl", "InstantiationException");
        } catch (IllegalAccessException unused2) {
            C1202a.m1320d("ErrorResultImpl", "IllegalAccessException");
        }
        return this.f1186a;
    }
}
