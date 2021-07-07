package com.huawei.hms.update.p053a;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.update.p053a.p054a.AbstractC1210b;
import com.huawei.hms.update.p053a.p054a.C1211c;
import java.io.File;

/* renamed from: com.huawei.hms.update.a.d */
public final class C1215d implements AbstractC1210b {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1210b f1334a;

    public C1215d(AbstractC1210b bVar) {
        this.f1334a = bVar;
    }

    @Override // com.huawei.hms.update.p053a.p054a.AbstractC1210b
    /* renamed from: a */
    public void mo15731a(int i, C1211c cVar) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1216e(this, i, cVar));
    }

    @Override // com.huawei.hms.update.p053a.p054a.AbstractC1210b
    /* renamed from: a */
    public void mo15730a(int i, int i2, int i3, File file) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1217f(this, i, i2, i3, file));
    }
}
