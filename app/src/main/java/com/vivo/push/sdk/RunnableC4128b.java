package com.vivo.push.sdk;

import com.vivo.push.util.C4146p;
import java.lang.reflect.Method;

/* renamed from: com.vivo.push.sdk.b */
public final class RunnableC4128b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Method f11077a;

    /* renamed from: b */
    public final /* synthetic */ Object f11078b;

    /* renamed from: c */
    public final /* synthetic */ Object[] f11079c;

    /* renamed from: d */
    public final /* synthetic */ C4127a f11080d;

    public RunnableC4128b(C4127a aVar, Method method, Object obj, Object[] objArr) {
        this.f11080d = aVar;
        this.f11077a = method;
        this.f11078b = obj;
        this.f11079c = objArr;
    }

    public final void run() {
        try {
            this.f11077a.invoke(this.f11078b, this.f11079c);
        } catch (Exception e) {
            C4146p.m11212b("CommandWorker", "reflect e: ", e);
        }
    }
}
