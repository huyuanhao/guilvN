package com.tencent.bugly.beta.download;

import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.beta.p267ui.C3242f;
import com.tencent.bugly.beta.p267ui.C3243g;
import com.tencent.bugly.beta.upgrade.C3246b;
import com.tencent.bugly.crashreport.common.info.C3270b;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3360p;
import com.tencent.bugly.proguard.C3371x;
import java.util.ArrayList;

/* renamed from: com.tencent.bugly.beta.download.c */
public class C3221c {

    /* renamed from: a */
    public final int f7344a;

    /* renamed from: b */
    public final Object[] f7345b;

    public C3221c(int i, Object... objArr) {
        this.f7344a = i;
        this.f7345b = objArr;
    }

    /* renamed from: a */
    public synchronized void mo37902a(int i, int i2) {
        try {
            int i3 = this.f7344a;
            if (i3 != 1) {
                if (i3 == 2) {
                    DownloadTask downloadTask = (DownloadTask) this.f7345b[0];
                    C3242f fVar = (C3242f) this.f7345b[2];
                    if (i2 == 1) {
                        downloadTask.download();
                        C3321an.m8355c("continue download", new Object[0]);
                        this.f7345b[1] = false;
                        fVar.mo38009a();
                    } else if ((i == 1 || ((Boolean) this.f7345b[1]).booleanValue()) && !C3226e.f7357E.f7376S && !C3226e.f7357E.f7377T) {
                        downloadTask.stop();
                        C3321an.m8355c("wifi network change to mobile network, stop download", new Object[0]);
                        this.f7345b[1] = true;
                        if (C3270b.m8040f(C3226e.f7357E.f7406s) != null) {
                            C3243g.m7793a(fVar, true);
                            this.f7345b[1] = false;
                        }
                    }
                }
            } else if (i2 == 1 || i2 == 3 || i2 == 4) {
                ArrayList arrayList = (ArrayList) C3360p.f8238a.mo38497a();
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        C3246b.f7487a.mo38041a(new C3371x(arrayList), true);
                    }
                }
            }
        } catch (Exception e) {
            if (!C3321an.m8353b(e)) {
                e.printStackTrace();
            }
        }
    }
}
