package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.p037c.AbstractC1132b;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.C1202a;
import com.huawei.hms.support.p039a.C1154a;
import com.huawei.hms.support.p050b.C1201a;
import com.huawei.hms.update.provider.UpdateProvider;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.umeng.message.common.C3777a;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.huawei.hms.support.api.c */
public abstract class AbstractC1160c<R extends Result, T extends IMessageEntity> extends InnerPendingResult<R> {

    /* renamed from: a */
    public CountDownLatch f1190a;

    /* renamed from: b */
    public R f1191b = null;

    /* renamed from: c */
    public WeakReference<ApiClient> f1192c;

    /* renamed from: d */
    public String f1193d = null;

    /* renamed from: e */
    public long f1194e = 0;
    public DatagramTransport transport = null;

    /* renamed from: com.huawei.hms.support.api.c$a */
    public static class HandlerC1161a<R extends Result> extends Handler {
        public HandlerC1161a() {
            this(Looper.getMainLooper());
        }

        /* renamed from: a */
        public void mo15470a(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        /* renamed from: b */
        public void mo15471b(ResultCallback<? super R> resultCallback, R r) {
            resultCallback.onResult(r);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.huawei.hms.support.api.c$a<R extends com.huawei.hms.support.api.client.Result> */
        /* JADX WARN: Multi-variable type inference failed */
        public void handleMessage(Message message) {
            if (message.what == 1) {
                Pair pair = (Pair) message.obj;
                mo15471b((ResultCallback) pair.first, (Result) pair.second);
            }
        }

        public HandlerC1161a(Looper looper) {
            super(looper);
        }
    }

    public AbstractC1160c(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        this.f1193d = str;
        m1146a(apiClient, str, iMessageEntity, getResponseType());
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        C1202a.m1318b("PendingResultImpl", "await");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return awaitOnAnyThread();
        }
        C1202a.m1320d("PendingResultImpl", "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread() {
        C1202a.m1318b("PendingResultImpl", "awaitOnAnyThread");
        this.f1194e = System.currentTimeMillis();
        ApiClient apiClient = this.f1192c.get();
        if (!checkApiClient(apiClient)) {
            C1202a.m1320d("PendingResultImpl", "client invalid");
            m1144a(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.f1191b;
        }
        this.transport.send(apiClient, new C1163d(this));
        try {
            this.f1190a.await();
        } catch (InterruptedException unused) {
            C1202a.m1320d("PendingResultImpl", "await in anythread InterruptedException");
            m1144a(CommonCode.ErrorCode.INTERNAL_ERROR, null);
        }
        return this.f1191b;
    }

    public boolean checkApiClient(ApiClient apiClient) {
        return apiClient != null && ((InnerApiClient) apiClient).innerIsConnected();
    }

    public Class<T> getResponseType() {
        Type type;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass == null || (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1]) == null) {
            return null;
        }
        return (Class) type;
    }

    public abstract R onComplete(T t);

    public R onError(int i) {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Type type = genericSuperclass != null ? ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0] : null;
        Class<?> a = type != null ? C1154a.m1132a(type) : null;
        if (a != null) {
            try {
                R r = (R) ((Result) a.newInstance());
                this.f1191b = r;
                r.setStatus(new Status(i));
            } catch (Exception e) {
                C1202a.m1320d("PendingResultImpl", "on Error:" + e.getMessage());
                return null;
            }
        }
        return this.f1191b;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(ResultCallback<R> resultCallback) {
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
        C1202a.m1318b("PendingResultImpl", "setResultCallback");
        this.f1194e = System.currentTimeMillis();
        if (looper == null) {
            looper = Looper.myLooper();
        }
        HandlerC1161a aVar = new HandlerC1161a(looper);
        ApiClient apiClient = this.f1192c.get();
        if (!checkApiClient(apiClient)) {
            C1202a.m1320d("PendingResultImpl", "client is invalid");
            m1144a(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            aVar.mo15470a(resultCallback, this.f1191b);
            return;
        }
        this.transport.post(apiClient, new C1165f(this, aVar, resultCallback));
    }

    /* renamed from: a */
    private void m1146a(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls) {
        C1202a.m1318b("PendingResultImpl", "init uri:" + str);
        this.f1193d = str;
        if (apiClient == null) {
            C1202a.m1320d("PendingResultImpl", "client is null");
            return;
        }
        this.f1192c = new WeakReference<>(apiClient);
        this.f1190a = new CountDownLatch(1);
        try {
            this.transport = (DatagramTransport) Class.forName(apiClient.getTransportName()).getConstructor(String.class, IMessageEntity.class, Class.class).newInstance(str, iMessageEntity, cls);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            C1202a.m1320d("PendingResultImpl", "gen transport error:" + e.getMessage());
            throw new IllegalStateException("Instancing transport exception, " + e.getMessage(), e);
        }
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j, TimeUnit timeUnit) {
        C1202a.m1318b("PendingResultImpl", "await timeout:" + j + " unit:" + timeUnit.toString());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return awaitOnAnyThread(j, timeUnit);
        }
        C1202a.m1318b("PendingResultImpl", "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    public AbstractC1160c(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls) {
        m1146a(apiClient, str, iMessageEntity, cls);
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread(long j, TimeUnit timeUnit) {
        C1202a.m1318b("PendingResultImpl", "awaitOnAnyThread timeout:" + j + " unit:" + timeUnit.toString());
        this.f1194e = System.currentTimeMillis();
        ApiClient apiClient = this.f1192c.get();
        if (!checkApiClient(apiClient)) {
            C1202a.m1320d("PendingResultImpl", "client invalid");
            m1144a(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.f1191b;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.transport.post(apiClient, new C1164e(this, atomicBoolean));
        try {
            if (!this.f1190a.await(j, timeUnit)) {
                atomicBoolean.set(true);
                m1144a(CommonCode.ErrorCode.EXECUTE_TIMEOUT, null);
            }
        } catch (InterruptedException unused) {
            C1202a.m1320d("PendingResultImpl", "awaitOnAnyThread InterruptedException");
            m1144a(CommonCode.ErrorCode.INTERNAL_ERROR, null);
        }
        return this.f1191b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.huawei.hms.core.aidl.IMessageEntity */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1144a(int i, IMessageEntity iMessageEntity) {
        Status status;
        m1143a(i);
        C1202a.m1318b("PendingResultImpl", "setResult:" + i);
        Status commonStatus = (iMessageEntity == 0 || !(iMessageEntity instanceof AbstractMessageEntity)) ? null : ((AbstractMessageEntity) iMessageEntity).getCommonStatus();
        if (i == 0) {
            this.f1191b = onComplete(iMessageEntity);
        } else {
            this.f1191b = onError(i);
        }
        R r = this.f1191b;
        if (r != null && (status = r.getStatus()) != null && commonStatus != null) {
            int statusCode = status.getStatusCode();
            String statusMessage = status.getStatusMessage();
            int statusCode2 = commonStatus.getStatusCode();
            String statusMessage2 = commonStatus.getStatusMessage();
            if (statusCode != statusCode2) {
                C1202a.m1320d("PendingResultImpl", "rstStatus code (" + statusCode + ") is not equal commonStatus code (" + statusCode2 + C3848l.f10402t);
                C1202a.m1320d("PendingResultImpl", "rstStatus msg (" + statusMessage + ") is not equal commonStatus msg (" + statusMessage2 + C3848l.f10402t);
            } else if (TextUtils.isEmpty(statusMessage) && !TextUtils.isEmpty(statusMessage2)) {
                C1202a.m1318b("PendingResultImpl", "rstStatus msg (" + statusMessage + ") is not equal commonStatus msg (" + statusMessage2 + C3848l.f10402t);
                this.f1191b.setStatus(new Status(statusCode, statusMessage2, status.getResolution()));
            }
        }
    }

    /* renamed from: a */
    private void m1143a(int i) {
        ApiClient apiClient;
        if (!C1201a.m1307a().mo15709b() && (apiClient = this.f1192c.get()) != null && this.f1193d != null && this.f1194e != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put(C3777a.f10045u, apiClient.getPackageName());
            hashMap.put("sdk_ver", String.valueOf((int) HuaweiApiAvailability.HMS_SDK_VERSION_CODE));
            String str = null;
            SubAppInfo subAppInfo = apiClient.getSubAppInfo();
            if (subAppInfo != null) {
                str = subAppInfo.getSubAppID();
            }
            if (str == null) {
                str = apiClient.getAppID();
            }
            hashMap.put(Constants.APP_ID, str);
            String[] split = this.f1193d.split("\\.");
            if (split.length == 2) {
                hashMap.put("service", split[0]);
                hashMap.put(AbstractC7726o0ooOOoo.OooO, split[1]);
            }
            hashMap.put("result", String.valueOf(i));
            hashMap.put("cost_time", String.valueOf(System.currentTimeMillis() - this.f1194e));
            C1201a.m1307a().mo15707a(apiClient.getContext(), "HMS_SDK_API_CALL", hashMap);
            AbstractC1132b.m1064a(apiClient.getContext(), UpdateProvider.getLocalFile(apiClient.getContext(), "hms/config.txt"), UpdateProvider.getLocalFile(apiClient.getContext(), "hms/HwMobileServiceReport.txt"), this.f1193d, this.f1194e, i);
        }
    }
}
