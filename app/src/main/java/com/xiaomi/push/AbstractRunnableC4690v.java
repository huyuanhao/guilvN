package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: com.xiaomi.push.v */
public abstract class AbstractRunnableC4690v implements Runnable {

    /* renamed from: a */
    public Context f13409a;

    /* renamed from: a */
    public File f13410a;

    /* renamed from: a */
    public Runnable f13411a;

    public AbstractRunnableC4690v(Context context, File file) {
        this.f13409a = context;
        this.f13410a = file;
    }

    public /* synthetic */ AbstractRunnableC4690v(Context context, File file, C4691w wVar) {
        this(context, file);
    }

    /* renamed from: a */
    public static void m14231a(Context context, File file, Runnable runnable) {
        new C4691w(context, file, runnable).run();
    }

    /* renamed from: a */
    public abstract void mo42756a(Context context);

    public final void run() {
        C4689u uVar = null;
        try {
            if (this.f13410a == null) {
                this.f13410a = new File(this.f13409a.getFilesDir(), "default_locker");
            }
            uVar = C4689u.m14229a(this.f13409a, this.f13410a);
            if (this.f13411a != null) {
                this.f13411a.run();
            }
            mo42756a(this.f13409a);
            if (uVar == null) {
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (0 == 0) {
                return;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                uVar.mo42755a();
            }
            throw th;
        }
        uVar.mo42755a();
    }
}
