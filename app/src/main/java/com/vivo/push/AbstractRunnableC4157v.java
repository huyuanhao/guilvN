package com.vivo.push;

import android.content.Context;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.vivo.push.p281b.C4050p;
import com.vivo.push.util.C4146p;

/* renamed from: com.vivo.push.v */
public abstract class AbstractRunnableC4157v implements Runnable {

    /* renamed from: a */
    public Context f11150a;

    /* renamed from: b */
    public int f11151b = -1;

    /* renamed from: c */
    public AbstractC4160y f11152c;

    public AbstractRunnableC4157v(AbstractC4160y yVar) {
        this.f11152c = yVar;
        int b = yVar.mo41216b();
        this.f11151b = b;
        if (b >= 0) {
            this.f11150a = C4121p.m11080a().mo41123h();
            return;
        }
        throw new IllegalArgumentException("PushTask need a > 0 task id.");
    }

    /* renamed from: a */
    public final int mo41208a() {
        return this.f11151b;
    }

    /* renamed from: a */
    public abstract void mo40942a(AbstractC4160y yVar);

    public final void run() {
        Context context = this.f11150a;
        if (context != null && !(this.f11152c instanceof C4050p)) {
            C4146p.m11208a(context, "[执行指令]" + this.f11152c);
        }
        mo40942a(this.f11152c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        AbstractC4160y yVar = this.f11152c;
        sb.append(yVar == null ? "[null]" : yVar.toString());
        sb.append(C7522o0Ooo0o.OooO0Oo);
        return sb.toString();
    }
}
