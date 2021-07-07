package com.tencent.bugly.beta.global;

import android.app.Activity;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.bugly.beta.download.BetaReceiver;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.p267ui.AbstractC3234a;
import com.tencent.bugly.beta.p267ui.C3241e;
import com.tencent.bugly.beta.p267ui.C3244h;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3360p;
import com.tencent.bugly.proguard.C3370w;
import com.tencent.bugly.proguard.C3372y;

/* renamed from: com.tencent.bugly.beta.global.b */
public class View$OnClickListenerC3223b implements View.OnClickListener {

    /* renamed from: a */
    public final int f7351a;

    /* renamed from: b */
    public final Object[] f7352b;

    public View$OnClickListenerC3223b(int i, Object... objArr) {
        this.f7351a = i;
        this.f7352b = objArr;
    }

    public void onClick(View view) {
        try {
            switch (this.f7351a) {
                case 1:
                    if (((ViewGroup) this.f7352b[1]).getChildCount() <= 0) {
                        ((Activity) this.f7352b[0]).finish();
                        C3321an.m8349a("BetaAct closed by empty view", new Object[0]);
                        return;
                    }
                    return;
                case 2:
                    ((AbstractC3234a) this.f7352b[0]).mo38009a();
                    return;
                case 3:
                    if (this.f7352b[1] != null) {
                        ((DownloadTask) this.f7352b[1]).download();
                    }
                    ((AbstractC3234a) this.f7352b[0]).mo38009a();
                    return;
                case 4:
                    C3244h hVar = (C3244h) this.f7352b[0];
                    DownloadTask downloadTask = hVar.f7467q;
                    C3372y yVar = hVar.f7466p;
                    BetaReceiver.addTask(downloadTask);
                    if (hVar.f7468r != null) {
                        hVar.f7468r.run();
                    }
                    if (downloadTask.getStatus() != 1 || !C3222a.m7761a(C3226e.f7357E.f7406s, downloadTask.getSaveFile(), yVar.f8296f.f8255a)) {
                        downloadTask.download();
                    } else {
                        C3360p.f8238a.mo38500a(new C3370w("install", System.currentTimeMillis(), (byte) 0, 0, yVar.f8295e, yVar.f8303m, yVar.f8306p, null));
                    }
                    if (yVar.f8297g != 2) {
                        hVar.mo38009a();
                        return;
                    }
                    return;
                case 5:
                    C3244h hVar2 = (C3244h) this.f7352b[0];
                    DownloadTask downloadTask2 = hVar2.f7467q;
                    BetaReceiver.netListeners.remove(downloadTask2.getDownloadUrl());
                    downloadTask2.stop();
                    hVar2.mo38022a(downloadTask2);
                    return;
                case 6:
                    C3244h hVar3 = (C3244h) this.f7352b[0];
                    if (hVar3.f7469s != null) {
                        hVar3.f7469s.run();
                    }
                    hVar3.mo38009a();
                    return;
                case 7:
                    C3241e eVar = (C3241e) this.f7352b[0];
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                case 8:
                    ((C3241e) this.f7352b[0]).mo38009a();
                    return;
                default:
                    return;
            }
        } catch (Exception e) {
            if (!C3321an.m8353b(e)) {
                e.printStackTrace();
            }
        }
    }
}
