package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.bugly.beta.download.C3219a;
import com.tencent.bugly.beta.download.DownloadListener;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.global.C3222a;
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.beta.tinker.TinkerManager;
import com.tencent.bugly.beta.upgrade.BetaGrayStrategy;
import java.io.File;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.q */
public class C3361q {

    /* renamed from: a */
    public static C3361q f8239a = new C3361q();

    /* renamed from: b */
    public BetaGrayStrategy f8240b;

    /* renamed from: c */
    public DownloadTask f8241c;

    /* renamed from: d */
    public final Handler f8242d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public DownloadListener f8243e = new C3219a(4, this, 0);

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        r3 = r2.f8240b.f7476a.mo38529b();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo38507a(int r3, com.tencent.bugly.proguard.C3372y r4, boolean r5) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3361q.mo38507a(int, com.tencent.bugly.proguard.y, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v27, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* renamed from: a */
    public BetaGrayStrategy mo38506a(C3372y yVar) {
        C3372y yVar2;
        char c;
        Map<String, String> map;
        int i;
        C3372y yVar3 = yVar;
        BetaGrayStrategy betaGrayStrategy = (BetaGrayStrategy) C3222a.m7756a("st.bch", BetaGrayStrategy.CREATOR);
        if (betaGrayStrategy == null || betaGrayStrategy.f7476a == null) {
            C3222a.m7764a("st.bch");
            betaGrayStrategy = null;
        }
        if (yVar3 != null) {
            if (yVar3.f8304n != 1 && betaGrayStrategy != null && !TextUtils.isEmpty(betaGrayStrategy.f7476a.f8303m) && TextUtils.equals(yVar3.f8303m, betaGrayStrategy.f7476a.f8303m)) {
                C3360p pVar = C3360p.f8238a;
                long currentTimeMillis = System.currentTimeMillis();
                C3372y yVar4 = betaGrayStrategy.f7476a;
                pVar.mo38500a(new C3370w("recall", currentTimeMillis, (byte) 0, 0, null, yVar4.f8303m, yVar4.f8306p, null));
                C3222a.m7764a("st.bch");
                C3226e eVar = C3226e.f7357E;
                eVar.f7403p.mo37901a(betaGrayStrategy.f7476a.f8296f.f8256b, eVar.f7366I.getAbsolutePath(), null, betaGrayStrategy.f7476a.f8296f.f8255a).delete(true);
                File file = C3226e.f7357E.f7365H;
                if (file != null && file.exists() && file.delete()) {
                    C3321an.m8349a("delete tmpPatchFile", new Object[0]);
                }
                File file2 = C3226e.f7357E.f7364G;
                if (file2 == null || !file2.exists() || !file2.delete()) {
                    i = 0;
                } else {
                    i = 0;
                    C3321an.m8349a("delete patchFile", new Object[0]);
                }
                C3222a.m7760a("IS_PATCH_ROLL_BACK", true);
                C3321an.m8349a("patch rollback", new Object[i]);
                if (!C3325ap.m8421b(C3226e.f7357E.f7406s)) {
                    TinkerManager.getInstance().onPatchRollback(true);
                } else {
                    TinkerManager.getInstance().onPatchRollback(i);
                }
                betaGrayStrategy = null;
            }
            if (yVar3.f8304n != 1) {
                yVar3 = null;
            }
        }
        if (yVar3 != null) {
            BetaGrayStrategy betaGrayStrategy2 = new BetaGrayStrategy();
            betaGrayStrategy2.f7476a = yVar3;
            betaGrayStrategy2.f7480e = System.currentTimeMillis();
            if (betaGrayStrategy != null && (!TextUtils.equals(betaGrayStrategy.f7476a.f8296f.f8256b, yVar3.f8296f.f8256b) || ((map = yVar3.f8302l) != null && TextUtils.equals(map.get("H1"), "false")))) {
                C3226e.f7357E.f7370M = yVar3.f8302l.get("H2");
                C3226e eVar2 = C3226e.f7357E;
                eVar2.f7403p.mo37901a(betaGrayStrategy.f7476a.f8296f.f8256b, eVar2.f7366I.getAbsolutePath(), null, null).delete(true);
                if (betaGrayStrategy.f7476a.f8306p == 3) {
                    File file3 = C3226e.f7357E.f7365H;
                    if (file3 != null && file3.exists() && file3.delete()) {
                        C3321an.m8349a("delete tmpPatchFile", new Object[0]);
                    }
                    File file4 = C3226e.f7357E.f7364G;
                    if (file4 != null && file4.exists() && file4.delete()) {
                        C3226e.f7357E.f7369L = "";
                        c = 0;
                        C3321an.m8349a("delete patchFile", new Object[0]);
                        C3222a.m7765a("st.bch", (Parcelable) betaGrayStrategy2);
                        Object[] objArr = new Object[2];
                        objArr[c] = yVar3;
                        objArr[1] = Integer.valueOf(yVar3.f8306p);
                        C3321an.m8349a("onUpgradeReceived: %s [type: %d]", objArr);
                        return betaGrayStrategy2;
                    }
                }
            }
            c = 0;
            C3222a.m7765a("st.bch", (Parcelable) betaGrayStrategy2);
            Object[] objArr2 = new Object[2];
            objArr2[c] = yVar3;
            objArr2[1] = Integer.valueOf(yVar3.f8306p);
            C3321an.m8349a("onUpgradeReceived: %s [type: %d]", objArr2);
            return betaGrayStrategy2;
        } else if (betaGrayStrategy == null || (yVar2 = betaGrayStrategy.f7476a) == null || yVar2.f8306p != 3) {
            return null;
        } else {
            return betaGrayStrategy;
        }
    }

    /* renamed from: a */
    private void m8605a() {
        BetaGrayStrategy betaGrayStrategy = this.f8240b;
        if (betaGrayStrategy != null) {
            if (this.f8241c == null) {
                C3226e eVar = C3226e.f7357E;
                this.f8241c = eVar.f7403p.mo37901a(betaGrayStrategy.f7476a.f8296f.f8256b, eVar.f7366I.getAbsolutePath(), null, this.f8240b.f7476a.f8296f.f8255a);
            }
            DownloadTask downloadTask = this.f8241c;
            if (downloadTask != null) {
                downloadTask.addListener(this.f8243e);
                this.f8241c.setNeededNotify(false);
                this.f8241c.download();
            }
        }
    }
}
