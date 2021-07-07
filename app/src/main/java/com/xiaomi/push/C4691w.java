package com.xiaomi.push;

import android.content.Context;
import java.io.File;

/* renamed from: com.xiaomi.push.w */
public final class C4691w extends AbstractRunnableC4690v {

    /* renamed from: a */
    public final /* synthetic */ Runnable f13412a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4691w(Context context, File file, Runnable runnable) {
        super(context, file, null);
        this.f13412a = runnable;
    }

    @Override // com.xiaomi.push.AbstractRunnableC4690v
    /* renamed from: a */
    public void mo42756a(Context context) {
        Runnable runnable = this.f13412a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
