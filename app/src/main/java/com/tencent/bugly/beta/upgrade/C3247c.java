package com.tencent.bugly.beta.upgrade;

import android.os.Parcelable;
import android.text.TextUtils;
import com.p118pd.sdk.C7982oO0oo00O;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.download.BetaReceiver;
import com.tencent.bugly.beta.download.C3219a;
import com.tencent.bugly.beta.download.DownloadListener;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.global.C3222a;
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.beta.global.C3227f;
import com.tencent.bugly.beta.global.RunnableC3225d;
import com.tencent.bugly.beta.p267ui.C3244h;
import com.tencent.bugly.beta.utils.C3254e;
import com.tencent.bugly.proguard.AbstractC3357m;
import com.tencent.bugly.proguard.C3311ah;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import com.tencent.bugly.proguard.C3342bf;
import com.tencent.bugly.proguard.C3343bg;
import com.tencent.bugly.proguard.C3360p;
import com.tencent.bugly.proguard.C3370w;
import com.tencent.bugly.proguard.C3372y;
import com.tencent.bugly.proguard.C3373z;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.beta.upgrade.c */
public class C3247c {

    /* renamed from: a */
    public static C3247c f7488a = new C3247c();

    /* renamed from: b */
    public BetaGrayStrategy f7489b;

    /* renamed from: c */
    public DownloadTask f7490c;

    /* renamed from: d */
    public DownloadListener f7491d;

    /* renamed from: e */
    public UpgradeListener f7492e;

    /* renamed from: f */
    public UpgradeStateListener f7493f;

    /* renamed from: g */
    public boolean f7494g;

    /* renamed from: h */
    public RunnableC3225d f7495h;

    /* renamed from: i */
    public RunnableC3225d f7496i;

    /* renamed from: j */
    public int f7497j;

    /* renamed from: k */
    public final Object f7498k = new Object();

    /* renamed from: l */
    public final Object f7499l = new Object();

    /* renamed from: m */
    public DownloadListener f7500m = new C3219a(3, this, 0);

    /* renamed from: n */
    public C3245a f7501n = null;

    /* renamed from: o */
    public RunnableC3225d f7502o;

    /* renamed from: p */
    public boolean f7503p;

    /* renamed from: b */
    private DownloadTask m7810b() {
        C3372y a = m7808a();
        if (a == null) {
            return null;
        }
        if (this.f7490c == null) {
            C3226e eVar = C3226e.f7357E;
            this.f7490c = eVar.f7403p.mo37901a(a.f8296f.f8256b, eVar.f7407t.getAbsolutePath(), null, this.f7489b.f7476a.f8296f.f8255a);
        }
        return this.f7490c;
    }

    /* renamed from: c */
    private void m7811c() {
        C3372y a = m7808a();
        if (a != null) {
            if (this.f7490c == null) {
                this.f7490c = m7810b();
            }
            if (this.f7490c != null) {
                C3222a.m7765a("st.bch", (Parcelable) this.f7489b);
                BetaReceiver.addTask(this.f7490c);
                if (this.f7490c.getStatus() != 1) {
                    this.f7490c.download();
                } else if (this.f7494g && C3222a.m7761a(C3226e.f7357E.f7406s, this.f7490c.getSaveFile(), a.f8296f.f8255a)) {
                    C3360p.f8238a.mo38500a(new C3370w("install", System.currentTimeMillis(), (byte) 0, 0, a.f8295e, a.f8303m, a.f8306p, null));
                } else if (C3226e.f7357E.f7391d) {
                    m7809a(this.f7494g);
                }
            }
        }
    }

    /* renamed from: a */
    public BetaGrayStrategy mo38042a(C3372y yVar) {
        BetaGrayStrategy betaGrayStrategy;
        BetaGrayStrategy betaGrayStrategy2;
        C3372y yVar2 = yVar;
        synchronized (this.f7498k) {
            BetaGrayStrategy betaGrayStrategy3 = (BetaGrayStrategy) C3222a.m7756a("st.bch", BetaGrayStrategy.CREATOR);
            betaGrayStrategy = null;
            if (betaGrayStrategy3 != null && betaGrayStrategy3.f7476a == null) {
                C3222a.m7764a("st.bch");
                betaGrayStrategy3 = null;
            }
            if (!(betaGrayStrategy3 == null || betaGrayStrategy3.f7476a == null || (betaGrayStrategy3.f7476a.f8295e.f8263c > C3226e.f7357E.f7410w && betaGrayStrategy3.f7476a.f8304n == 1 && ((betaGrayStrategy3.f7476a.f8296f == null || !TextUtils.equals(C3226e.f7357E.f7409v, betaGrayStrategy3.f7476a.f8296f.f8255a)) && betaGrayStrategy3.f7476a.f8306p != 3)))) {
                C3222a.m7764a("st.bch");
                this.f7490c = null;
                betaGrayStrategy3 = null;
            }
            if (yVar2 != null && yVar2.f8295e.f8263c < C3226e.f7357E.f7410w) {
                C3321an.m8349a("versionCode is too small, discard remote strategy: [new: %d] [current: %d]", Integer.valueOf(yVar2.f8295e.f8263c), Integer.valueOf(C3226e.f7357E.f7410w));
                yVar2 = null;
            }
            if (yVar2 != null) {
                if (yVar2.f8304n == 2 && betaGrayStrategy3 != null && betaGrayStrategy3.f7476a != null && !TextUtils.isEmpty(yVar2.f8303m) && !TextUtils.isEmpty(betaGrayStrategy3.f7476a.f8303m) && TextUtils.equals(yVar2.f8303m, betaGrayStrategy3.f7476a.f8303m)) {
                    C3321an.m8349a("callback strategy: %s", yVar2.f8303m);
                    C3222a.m7764a("st.bch");
                    C3226e.f7357E.f7403p.mo37901a(betaGrayStrategy3.f7476a.f8296f.f8256b, C3226e.f7357E.f7407t.getAbsolutePath(), null, null).delete(true);
                    betaGrayStrategy3 = null;
                }
                if (yVar2.f8304n != 1) {
                    C3321an.m8349a("invalid strategy: %s", yVar2.f8303m);
                    yVar2 = null;
                }
            }
            if (yVar2 != null) {
                if (betaGrayStrategy3 == null || betaGrayStrategy3.f7476a == null || TextUtils.isEmpty(yVar2.f8303m) || TextUtils.isEmpty(betaGrayStrategy3.f7476a.f8303m) || !TextUtils.equals(yVar2.f8303m, betaGrayStrategy3.f7476a.f8303m)) {
                    betaGrayStrategy2 = new BetaGrayStrategy();
                } else {
                    betaGrayStrategy2 = new BetaGrayStrategy(C3325ap.m8431d(C3325ap.m8407a(betaGrayStrategy3)));
                    C3321an.m8349a("same strategyId:[new: %s] [current: %s] keep has popup times: %d, interval: %d", yVar2.f8303m, betaGrayStrategy3.f7476a.f8303m, Integer.valueOf(betaGrayStrategy2.f7477b), Long.valueOf(yVar2.f8299i));
                }
                betaGrayStrategy2.f7476a = yVar2;
                betaGrayStrategy2.f7480e = System.currentTimeMillis();
                if (betaGrayStrategy3 != null) {
                    if (!betaGrayStrategy3.f7476a.f8296f.f8256b.equals(yVar2.f8296f.f8256b)) {
                        if (this.f7490c == null) {
                            C3226e.f7357E.f7403p.mo37901a(betaGrayStrategy3.f7476a.f8296f.f8256b, C3226e.f7357E.f7407t.getAbsolutePath(), null, null).delete(true);
                            File[] listFiles = C3226e.f7357E.f7407t.listFiles();
                            for (File file : listFiles) {
                                if (!file.delete()) {
                                    C3321an.m8357e("cannot deleteCache file:%s", file.getAbsolutePath());
                                }
                            }
                        } else {
                            BetaReceiver.netListeners.remove(this.f7490c.getDownloadUrl());
                            this.f7490c.delete(true);
                            this.f7490c = null;
                        }
                    }
                    if (betaGrayStrategy3.f7476a.f8306p == 3) {
                        File file2 = C3226e.f7357E.f7365H;
                        if (file2 != null && file2.exists() && file2.delete()) {
                            C3321an.m8349a("delete tmpPatchFile", new Object[0]);
                        }
                        File file3 = C3226e.f7357E.f7364G;
                        if (file3 != null && file3.exists() && file3.delete()) {
                            C3226e.f7357E.f7369L = "";
                            C3321an.m8349a("delete patchFile", new Object[0]);
                        }
                    }
                }
                C3222a.m7765a("st.bch", (Parcelable) betaGrayStrategy2);
                C3321an.m8349a("onUpgradeReceived: %s [type: %d]", yVar2, Integer.valueOf(yVar2.f8297g));
                C3360p.f8238a.mo38500a(new C3370w("rcv", System.currentTimeMillis(), (byte) 0, 0, yVar2.f8295e, yVar2.f8303m, yVar2.f8306p, null));
                betaGrayStrategy = betaGrayStrategy2;
            } else if (!(betaGrayStrategy3 == null || betaGrayStrategy3.f7476a == null || betaGrayStrategy3.f7476a.f8306p == 3)) {
                C3222a.m7764a("st.bch");
            }
        }
        return betaGrayStrategy;
    }

    /* renamed from: a */
    public void mo38045a(boolean z, boolean z2, int i, C3372y yVar, String str) {
        synchronized (this.f7498k) {
            this.f7489b = mo38042a(yVar);
            this.f7494g = z;
            if (this.f7492e != null) {
                C3321an.m8349a("你已放弃让SDK来处理策略", new Object[0]);
                this.f7497j = 3;
                if (this.f7489b == null) {
                    C3321an.m8349a("betaStrategy is null", new Object[0]);
                }
                if (this.f7489b != null && this.f7490c == null) {
                    this.f7490c = C3226e.f7357E.f7403p.mo37901a(this.f7489b.f7476a.f8296f.f8256b, C3226e.f7357E.f7407t.getAbsolutePath(), null, this.f7489b.f7476a.f8296f.f8255a);
                }
                if (this.f7490c == null) {
                    C3321an.m8349a("用户自定义activity，创建task失败 [strategy:%s]", this.f7489b);
                    this.f7489b = null;
                    C3222a.m7764a("st.bch");
                } else {
                    this.f7490c.addListener(this.f7500m);
                }
                C3254e.m7893a(new RunnableC3225d(16, this.f7492e, Integer.valueOf(i), this.f7489b, Boolean.valueOf(z), Boolean.valueOf(z2)));
            }
            if (i == 0 || !z || z2 || this.f7489b != null) {
                if (this.f7489b != null && this.f7489b.f7476a != null) {
                    if (this.f7493f != null) {
                        C3254e.m7893a(new RunnableC3225d(18, this.f7493f, 0, Boolean.valueOf(z)));
                    }
                    if (this.f7492e == null) {
                        if (!z && this.f7489b.f7476a.f8297g != 2) {
                            if (!this.f7489b.f7479d || !C3226e.f7357E.f7392e) {
                                if (this.f7489b.f7478c + this.f7489b.f7476a.f8299i > System.currentTimeMillis() || this.f7489b.f7476a.f8298h - this.f7489b.f7477b <= 0 || this.f7489b.f7476a.f8297g == 3) {
                                    return;
                                }
                            } else if ((C3222a.m7751a(C3226e.f7357E.f7406s) != 1 || !C3226e.f7357E.f7376S) && (C3222a.m7751a(C3226e.f7357E.f7406s) != 4 || !C3226e.f7357E.f7377T)) {
                                if (!z2) {
                                    m7809a(z);
                                }
                                return;
                            } else {
                                m7811c();
                                return;
                            }
                        }
                        if (!z2) {
                            if (((C3222a.m7751a(C3226e.f7357E.f7406s) != 1 || !C3226e.f7357E.f7376S) && (C3222a.m7751a(C3226e.f7357E.f7406s) != 4 || !C3226e.f7357E.f7377T)) || z) {
                                m7809a(z);
                            } else {
                                m7811c();
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else if (this.f7493f != null) {
                    C3254e.m7893a(new RunnableC3225d(18, this.f7493f, 1, Boolean.valueOf(z)));
                } else if (z && !z2) {
                    C3254e.m7893a(new RunnableC3225d(5, Beta.strToastYourAreTheLatestVersion));
                }
                return;
            }
            if (this.f7493f != null) {
                C3254e.m7893a(new RunnableC3225d(18, this.f7493f, -1, Boolean.valueOf(z)));
            } else {
                C3254e.m7893a(new RunnableC3225d(5, Beta.strToastCheckUpgradeError));
            }
        }
    }

    /* renamed from: a */
    private C3372y m7808a() {
        BetaGrayStrategy betaGrayStrategy = this.f7489b;
        if (betaGrayStrategy == null) {
            return null;
        }
        return betaGrayStrategy.f7476a;
    }

    /* renamed from: a */
    private void m7809a(boolean z) {
        C3372y a = m7808a();
        if (a != null) {
            boolean z2 = false;
            if (System.currentTimeMillis() <= a.mo38528a() - 86400000) {
                C3321an.m8357e(System.currentTimeMillis() + "ms", new Object[0]);
                return;
            }
            C3227f.f7414a.mo37916a(C3226e.f7357E.f7403p, a.f8302l);
            if (this.f7490c == null) {
                this.f7490c = m7810b();
            }
            DownloadTask downloadTask = this.f7490c;
            if (downloadTask != null) {
                if (z || downloadTask.getStatus() != 2) {
                    this.f7490c.addListener(this.f7500m);
                    DownloadListener downloadListener = this.f7491d;
                    if (downloadListener != null) {
                        this.f7490c.addListener(downloadListener);
                    }
                    C3244h hVar = C3244h.f7461v;
                    hVar.mo38023a(a, this.f7490c);
                    hVar.f7468r = new RunnableC3225d(3, this.f7489b, this.f7490c);
                    hVar.f7469s = new RunnableC3225d(4, this.f7489b, this.f7490c, Boolean.valueOf(z));
                    this.f7489b.f7478c = System.currentTimeMillis();
                    C3222a.m7765a("st.bch", (Parcelable) this.f7489b);
                    if (z) {
                        C3227f.f7414a.mo37918a(new RunnableC3225d(2, hVar, Boolean.valueOf(z)), 3000);
                        return;
                    }
                    C3227f fVar = C3227f.f7414a;
                    Object[] objArr = new Object[2];
                    objArr[0] = hVar;
                    if (z || a.f8297g == 2) {
                        z2 = true;
                    }
                    objArr[1] = Boolean.valueOf(z2);
                    fVar.mo37917a(new RunnableC3225d(2, objArr));
                    return;
                }
                C3321an.m8349a("Task is downloading %s %s", a.f8303m, this.f7490c.getDownloadUrl());
            }
        }
    }

    /* renamed from: a */
    public void mo38044a(boolean z, boolean z2, int i) {
        synchronized (this.f7499l) {
            BetaGrayStrategy betaGrayStrategy = (BetaGrayStrategy) C3222a.m7756a("st.bch", BetaGrayStrategy.CREATOR);
            if (z && betaGrayStrategy != null && betaGrayStrategy.f7476a != null && betaGrayStrategy.f7476a.f8306p == 3) {
                betaGrayStrategy = null;
            }
            if (this.f7501n != null && !this.f7501n.f7486d) {
                if (this.f7503p == z) {
                    synchronized (this.f7501n) {
                        this.f7501n.f7485c[0] = Boolean.valueOf(z);
                        this.f7501n.f7485c[1] = Boolean.valueOf(z2);
                    }
                    this.f7502o.f7356b[0] = false;
                    if ((z && !z2) || !(betaGrayStrategy == null || betaGrayStrategy.f7476a == null || betaGrayStrategy.f7476a.f8306p != 2)) {
                        C3254e.m7895b(this.f7502o);
                        C3254e.m7894a(this.f7502o, 6000);
                    }
                }
            }
            this.f7503p = z;
            if (this.f7501n != null) {
                this.f7501n.f7486d = true;
            }
            this.f7501n = new C3245a(1, C7982oO0oo00O.OooOOO0, Boolean.valueOf(z), Boolean.valueOf(z2), betaGrayStrategy);
            this.f7502o = new RunnableC3225d(12, false, this.f7501n);
            String str = "";
            long j = 0;
            if (betaGrayStrategy != null) {
                try {
                    if (betaGrayStrategy.f7476a != null) {
                        str = betaGrayStrategy.f7476a.f8303m;
                        j = betaGrayStrategy.f7476a.f8305o;
                    }
                } catch (Throwable th) {
                    if (!C3321an.m8353b(th)) {
                        th.printStackTrace();
                    }
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("G16", C3226e.f7357E.f7369L);
            C3246b.f7487a.mo38040a(C7982oO0oo00O.OooOOO0, C3311ah.m8286a((AbstractC3357m) new C3373z(z ? 1 : 0, str, j, hashMap)), this.f7501n, z, C3226e.f7357E.f7363F.f7481a.f8167e);
            C3254e.m7895b(this.f7502o);
            C3254e.m7894a(this.f7502o, 6000);
        }
    }

    /* renamed from: a */
    public void mo38043a(C3343bg bgVar) {
        C3226e eVar = C3226e.f7357E;
        if (eVar.f7363F == null) {
            eVar.f7363F = new BetaUploadStrategy();
        }
        if (bgVar != null) {
            BetaUploadStrategy betaUploadStrategy = C3226e.f7357E.f7363F;
            long j = betaUploadStrategy.f7482b;
            long j2 = bgVar.f8170h;
            if (j != j2) {
                betaUploadStrategy.f7482b = j2;
                C3343bg bgVar2 = betaUploadStrategy.f7481a;
                bgVar2.f8164b = bgVar.f8164b;
                bgVar2.f8165c = bgVar.f8165c;
                bgVar2.f8170h = j2;
                if (C3325ap.m8429c(bgVar.f8166d)) {
                    C3226e.f7357E.f7363F.f7481a.f8166d = bgVar.f8166d;
                }
                if (C3325ap.m8429c(bgVar.f8167e)) {
                    C3226e.f7357E.f7363F.f7481a.f8167e = bgVar.f8167e;
                }
                C3342bf bfVar = bgVar.f8168f;
                if (bfVar != null && !TextUtils.isEmpty(bfVar.f8158a)) {
                    C3226e.f7357E.f7363F.f7481a.f8168f.f8158a = bgVar.f8168f.f8158a;
                }
                Map<String, String> map = bgVar.f8169g;
                if (map != null && map.size() > 0) {
                    C3226e.f7357E.f7363F.f7481a.f8169g = bgVar.f8169g;
                }
                if (C3325ap.m8429c(bgVar.f8171i)) {
                    C3226e.f7357E.f7363F.f7481a.f8171i = bgVar.f8171i;
                }
                if (C3325ap.m8429c(bgVar.f8172j)) {
                    C3226e.f7357E.f7363F.f7481a.f8172j = bgVar.f8172j;
                }
                C3222a.m7765a("us.bch", (Parcelable) C3226e.f7357E.f7363F);
            }
        }
    }
}
