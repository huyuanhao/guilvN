package com.alipay.android.phone.mrpc.core;

import android.os.Looper;
import com.alipay.android.phone.mrpc.core.p018a.C0346d;
import com.alipay.android.phone.mrpc.core.p018a.C0347e;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.alipay.android.phone.mrpc.core.z */
public final class C0380z {

    /* renamed from: a */
    public static final ThreadLocal<Object> f859a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<Map<String, Object>> f860b = new ThreadLocal<>();

    /* renamed from: c */
    public byte f861c = 0;

    /* renamed from: d */
    public AtomicInteger f862d;

    /* renamed from: e */
    public C0378x f863e;

    public C0380z(C0378x xVar) {
        this.f863e = xVar;
        this.f862d = new AtomicInteger();
    }

    /* renamed from: a */
    public final Object mo4183a(Method method, Object[] objArr) {
        if (!(Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper())) {
            OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
            boolean z = method.getAnnotation(ResetCookie.class) != null;
            Type genericReturnType = method.getGenericReturnType();
            method.getAnnotations();
            f859a.set(null);
            f860b.set(null);
            if (operationType != null) {
                String value = operationType.value();
                int incrementAndGet = this.f862d.incrementAndGet();
                try {
                    if (this.f861c == 0) {
                        C0347e eVar = new C0347e(incrementAndGet, value, objArr);
                        if (f860b.get() != null) {
                            eVar.mo4116a(f860b.get());
                        }
                        byte[] a = eVar.mo4117a();
                        f860b.set(null);
                        Object a2 = new C0346d(genericReturnType, (byte[]) new C0363j(this.f863e.mo4180a(), method, incrementAndGet, value, a, z).mo4148a()).mo4115a();
                        if (genericReturnType != Void.TYPE) {
                            f859a.set(a2);
                        }
                    }
                    return f859a.get();
                } catch (RpcException e) {
                    e.setOperationType(value);
                    throw e;
                }
            } else {
                throw new IllegalStateException("OperationType must be set.");
            }
        } else {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
    }
}
