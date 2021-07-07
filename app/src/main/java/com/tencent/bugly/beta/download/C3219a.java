package com.tencent.bugly.beta.download;

import android.os.Build;
import android.os.Parcelable;
import com.tencent.bugly.beta.global.C3222a;
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.beta.global.C3227f;
import com.tencent.bugly.beta.global.ResBean;
import com.tencent.bugly.beta.global.RunnableC3225d;
import com.tencent.bugly.beta.p267ui.C3244h;
import com.tencent.bugly.beta.tinker.TinkerManager;
import com.tencent.bugly.beta.upgrade.BetaGrayStrategy;
import com.tencent.bugly.beta.upgrade.C3247c;
import com.tencent.bugly.beta.utils.C3254e;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3360p;
import com.tencent.bugly.proguard.C3361q;
import com.tencent.bugly.proguard.C3370w;
import java.io.File;
import java.util.Map;

/* renamed from: com.tencent.bugly.beta.download.a */
public class C3219a implements DownloadListener {

    /* renamed from: a */
    public final int f7342a;

    /* renamed from: b */
    public final Object[] f7343b;

    public C3219a(int i, Object... objArr) {
        this.f7342a = i;
        this.f7343b = objArr;
    }

    @Override // com.tencent.bugly.beta.download.DownloadListener
    public void onCompleted(DownloadTask downloadTask) {
        try {
            int i = this.f7342a;
            if (i == 1) {
                synchronized (this.f7343b[0]) {
                    Map map = (Map) this.f7343b[1];
                    if (map.size() != 0) {
                        int i2 = 0;
                        for (DownloadTask downloadTask2 : map.values()) {
                            if (downloadTask2.getStatus() == 1) {
                                i2++;
                            }
                        }
                        C3321an.m8355c(i2 + " has completed", new Object[0]);
                        if (i2 >= map.size()) {
                            for (String str : map.keySet()) {
                                if (((DownloadTask) map.get(str)).getSaveFile() != null && ((DownloadTask) map.get(str)).getSaveFile().exists()) {
                                    ResBean.f7346a.mo37905a(str, ((DownloadTask) map.get(str)).getSaveFile().getAbsolutePath());
                                }
                            }
                            C3222a.m7765a("rb.bch", (Parcelable) ResBean.f7346a);
                            C3227f fVar = (C3227f) this.f7343b[0];
                            fVar.mo37915a();
                            fVar.mo37919b();
                        }
                    }
                }
            } else if (i == 2) {
                ((C3244h) this.f7343b[0]).mo38022a(downloadTask);
            } else if (i == 3) {
                C3247c cVar = (C3247c) this.f7343b[0];
                BetaGrayStrategy betaGrayStrategy = cVar.f7489b;
                if (betaGrayStrategy == null) {
                    return;
                }
                if (betaGrayStrategy.f7476a != null) {
                    if (cVar.f7493f != null) {
                        C3254e.m7893a(new RunnableC3225d(18, cVar.f7493f, 3, Boolean.valueOf(cVar.f7494g)));
                    }
                    C3321an.m8349a("apk download completed", new Object[0]);
                    C3360p.f8238a.mo38500a(new C3370w("download", System.currentTimeMillis(), (byte) 0, downloadTask.getCostTime(), betaGrayStrategy.f7476a.f8295e, betaGrayStrategy.f7476a.f8303m, betaGrayStrategy.f7476a.f8306p, null));
                    if (C3226e.f7357E.f7387ad) {
                        File saveFile = downloadTask.getSaveFile();
                        Integer num = (Integer) this.f7343b[1];
                        if (C3222a.m7761a(C3226e.f7357E.f7406s, saveFile, betaGrayStrategy.f7476a.f8296f.f8255a)) {
                            this.f7343b[1] = 0;
                            C3360p.f8238a.mo38500a(new C3370w("install", System.currentTimeMillis(), (byte) 0, 0, betaGrayStrategy.f7476a.f8295e, betaGrayStrategy.f7476a.f8303m, betaGrayStrategy.f7476a.f8306p, null));
                        } else if (num.intValue() >= 2) {
                            this.f7343b[1] = 0;
                            onFailed(downloadTask, 2080, "file md5 verify fail");
                            downloadTask.delete(true);
                        } else if (Build.VERSION.SDK_INT >= 24) {
                            this.f7343b[1] = 0;
                            onFailed(downloadTask, 2080, "安装失败，请检查您的App是否兼容7.0设备");
                            downloadTask.delete(true);
                        } else {
                            this.f7343b[1] = Integer.valueOf(num.intValue() + 1);
                            downloadTask.delete(true);
                            DownloadTask a = C3226e.f7357E.f7403p.mo37901a(betaGrayStrategy.f7476a.f8296f.f8256b, C3226e.f7357E.f7407t.getAbsolutePath(), null, betaGrayStrategy.f7476a.f8296f.f8256b);
                            cVar.f7490c = a;
                            C3244h.f7461v.mo38023a(betaGrayStrategy.f7476a, a);
                            cVar.f7490c.addListener(this);
                            BetaReceiver.addTask(cVar.f7490c);
                            cVar.f7490c.download();
                        }
                    }
                }
            } else if (i == 4) {
                C3361q qVar = (C3361q) this.f7343b[0];
                Integer num2 = (Integer) this.f7343b[1];
                BetaGrayStrategy betaGrayStrategy2 = qVar.f8240b;
                if (betaGrayStrategy2 == null) {
                    return;
                }
                if (betaGrayStrategy2.f7476a != null) {
                    C3321an.m8349a("patch download success !!!", new Object[0]);
                    File saveFile2 = downloadTask.getSaveFile();
                    if (C3222a.m7763a(saveFile2, betaGrayStrategy2.f7476a.f8296f.f8255a, "SHA")) {
                        this.f7343b[1] = 0;
                        if (C3222a.m7762a(saveFile2, C3226e.f7357E.f7365H)) {
                            C3321an.m8355c("copy " + saveFile2.getAbsolutePath() + " to " + C3226e.f7357E.f7365H.getAbsolutePath() + " success!", new Object[0]);
                            if (qVar.f8241c != null) {
                                C3321an.m8355c("delete temp file", new Object[0]);
                                qVar.f8241c.delete(true);
                            }
                            C3222a.m7760a("UPLOAD_PATCH_RESULT", false);
                            TinkerManager.getInstance().onDownloadSuccess(C3226e.f7357E.f7365H.getAbsolutePath(), C3226e.f7357E.f7379V);
                            return;
                        }
                        C3321an.m8349a("copy file failed", new Object[0]);
                        TinkerManager.getInstance().onDownloadFailure("copy file failure.");
                    } else if (num2.intValue() < 2) {
                        this.f7343b[1] = Integer.valueOf(num2.intValue() + 1);
                        downloadTask.delete(true);
                        DownloadTask a2 = C3226e.f7357E.f7403p.mo37901a(betaGrayStrategy2.f7476a.f8296f.f8256b, C3226e.f7357E.f7407t.getAbsolutePath(), null, betaGrayStrategy2.f7476a.f8296f.f8256b);
                        qVar.f8241c = a2;
                        a2.setNeededNotify(false);
                        qVar.f8241c.addListener(this);
                        BetaReceiver.addTask(qVar.f8241c);
                        qVar.f8241c.download();
                    } else {
                        this.f7343b[1] = 0;
                        onFailed(downloadTask, 2080, "file sha1 verify fail");
                        downloadTask.delete(true);
                        TinkerManager.getInstance().onDownloadFailure("retry download patch too many times.");
                    }
                }
            }
        } catch (Exception e) {
            if (!C3321an.m8353b(e)) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.tencent.bugly.beta.download.DownloadListener
    public void onFailed(DownloadTask downloadTask, int i, String str) {
        try {
            int i2 = this.f7342a;
            if (i2 == 1) {
                synchronized (this.f7343b[0]) {
                    C3227f fVar = (C3227f) this.f7343b[0];
                    fVar.mo37915a();
                    fVar.mo37919b();
                }
            } else if (i2 == 2) {
                ((C3244h) this.f7343b[0]).mo38022a(downloadTask);
            } else if (i2 == 3) {
                C3247c cVar = (C3247c) this.f7343b[0];
                if (downloadTask != null) {
                    C3360p.f8238a.mo38500a(new C3370w("download", System.currentTimeMillis(), (byte) 1, downloadTask.getCostTime(), cVar.f7489b.f7476a.f8295e, cVar.f7489b.f7476a.f8303m, cVar.f7489b.f7476a.f8306p, null));
                }
                C3321an.m8357e("upgrade failed：(%d)%s", Integer.valueOf(i), str);
                String str2 = C3321an.f8051b;
            } else if (i2 == 4) {
                C3361q qVar = (C3361q) this.f7343b[0];
                if (downloadTask != null) {
                    C3360p.f8238a.mo38500a(new C3370w("download", System.currentTimeMillis(), (byte) 1, downloadTask.getCostTime(), qVar.f8240b.f7476a.f8295e, qVar.f8240b.f7476a.f8303m, qVar.f8240b.f7476a.f8306p, null));
                }
                C3321an.m8357e("hotfix download failed：(%d)%s", Integer.valueOf(i), str);
                TinkerManager.getInstance().onDownloadFailure(str);
            }
        } catch (Exception e) {
            if (!C3321an.m8353b(e)) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.tencent.bugly.beta.download.DownloadListener
    public void onReceive(DownloadTask downloadTask) {
        if (this.f7342a == 2) {
            ((C3244h) this.f7343b[0]).mo38022a(downloadTask);
        }
    }
}
