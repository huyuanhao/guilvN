package com.qiyukf.nim.uikit.p144a;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.a.b */
public final class C1875b {

    /* renamed from: a */
    public List<AbstractC1876a> f3454a = new ArrayList();

    /* renamed from: b */
    public Handler f3455b;

    /* renamed from: com.qiyukf.nim.uikit.a.b$a */
    public interface AbstractC1876a {
    }

    public C1875b(Context context) {
        this.f3455b = new Handler(context.getMainLooper());
    }

    /* renamed from: a */
    public final synchronized void mo34135a(AbstractC1876a aVar) {
        if (aVar != null) {
            this.f3454a.add(aVar);
        }
    }

    /* renamed from: b */
    public final synchronized void mo34136b(AbstractC1876a aVar) {
        if (aVar != null) {
            this.f3454a.remove(aVar);
        }
    }
}
