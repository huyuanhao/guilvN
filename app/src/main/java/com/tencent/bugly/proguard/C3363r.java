package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import com.tencent.bugly.beta.global.C3222a;
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.beta.interfaces.BetaPatchListener;
import com.tencent.bugly.beta.p267ui.C3241e;
import com.tencent.bugly.beta.p267ui.C3243g;
import com.tencent.bugly.beta.tinker.TinkerManager;
import com.tencent.bugly.beta.upgrade.BetaGrayStrategy;
import java.io.File;
import java.util.Iterator;
import org.android.spdy.SoInstallMgrSdk;

/* renamed from: com.tencent.bugly.proguard.r */
public class C3363r {
    /* renamed from: a */
    public static synchronized void m8608a(Context context) {
        String str;
        File[] listFiles;
        String a;
        synchronized (C3363r.class) {
            final C3226e eVar = C3226e.f7357E;
            String absolutePath = context.getDir(TinkerManager.PATCH_DIR, 0).getAbsolutePath();
            String absolutePath2 = context.getDir("tmpPatch", 32768).getAbsolutePath();
            eVar.f7364G = new File(absolutePath, TinkerManager.PATCH_NAME);
            if (TextUtils.isEmpty(C3222a.m7767b("PatchFile", ""))) {
                C3222a.m7759a("PatchFile", eVar.f7364G.getAbsolutePath());
            }
            eVar.f7365H = new File(absolutePath2, "tmpPatch.apk");
            if (eVar.f7364G != null && TextUtils.isEmpty(C3222a.m7767b("PatchFile", ""))) {
                C3222a.m7759a("PatchFile", eVar.f7364G.getAbsolutePath());
            }
            File dir = context.getDir("tmpPatch", 0);
            eVar.f7366I = dir;
            if (dir != null && TextUtils.isEmpty(C3222a.m7767b("PatchTmpDir", ""))) {
                C3222a.m7759a("PatchTmpDir", eVar.f7364G.getAbsolutePath());
            }
            BetaGrayStrategy betaGrayStrategy = (BetaGrayStrategy) C3222a.m7756a("st.bch", BetaGrayStrategy.CREATOR);
            if (betaGrayStrategy == null || betaGrayStrategy.f7476a == null || betaGrayStrategy.f7476a.f8306p != 3) {
                if (TinkerManager.getInstance().getPatchDirectory(eVar.f7406s) != null && !TinkerManager.getInstance().getPatchDirectory(eVar.f7406s).exists()) {
                    C3222a.m7760a("IS_PATCH_ROLL_BACK", false);
                }
                if (C3222a.m7768b("IS_PATCH_ROLL_BACK", false)) {
                    TinkerManager.getInstance().onPatchRollback(false);
                }
            } else {
                if (betaGrayStrategy.f7476a.f8302l != null) {
                    String str2 = betaGrayStrategy.f7476a.f8302l.get("H2");
                    eVar.f7370M = str2;
                    if (!TextUtils.isEmpty(str2)) {
                        C3325ap.m8420b("G15", eVar.f7370M);
                    }
                }
                eVar.f7371N = C3222a.m7768b("PatchResult", false);
                eVar.f7372O = Integer.valueOf(C3222a.m7767b("PATCH_MAX_TIMES", "0")).intValue();
                if (!eVar.f7371N) {
                    C3321an.m8349a("[patch] inject failure", new Object[0]);
                    if (!C3222a.m7768b("UPLOAD_PATCH_RESULT", false)) {
                        C3222a.m7760a("UPLOAD_PATCH_RESULT", true);
                        if (C3360p.f8238a.mo38500a(new C3370w(AppStateModule.APP_STATE_ACTIVE, System.currentTimeMillis(), (byte) 1, 0, null, betaGrayStrategy.f7476a.f8303m, betaGrayStrategy.f7476a.f8306p, null))) {
                            C3321an.m8349a("save patch failed event success!", new Object[0]);
                        } else {
                            C3321an.m8357e("save patch failed event failed!", new Object[0]);
                        }
                        if (C3226e.f7357E.f7364G != null && C3226e.f7357E.f7364G.exists() && C3226e.f7357E.f7364G.delete()) {
                            C3321an.m8349a("[patch] delete patch.apk success", new Object[0]);
                        }
                    }
                } else {
                    C3321an.m8349a("[patch] inject success", new Object[0]);
                    if (!C3222a.m7768b("UPLOAD_PATCH_RESULT", false)) {
                        C3222a.m7760a("UPLOAD_PATCH_RESULT", true);
                        if (C3360p.f8238a.mo38500a(new C3370w(AppStateModule.APP_STATE_ACTIVE, System.currentTimeMillis(), (byte) 0, 0, null, betaGrayStrategy.f7476a.f8303m, betaGrayStrategy.f7476a.f8306p, null))) {
                            C3321an.m8349a("save patch success event success!", new Object[0]);
                        } else {
                            C3321an.m8357e("save patch success event failed!", new Object[0]);
                        }
                    }
                }
            }
            File file = C3226e.f7357E.f7365H;
            if (file != null && file.exists() && file.delete()) {
                C3321an.m8349a("[patch] delete tmpPatch.apk success", new Object[0]);
            }
            File file2 = C3226e.f7357E.f7364G;
            if (!(file2 == null || !file2.exists() || (a = C3325ap.m8390a(file2, "SHA")) == null)) {
                C3226e.f7357E.f7369L = a;
            }
            if (TinkerManager.isTinkerManagerInstalled()) {
                if (TextUtils.isEmpty(eVar.f7367J)) {
                    eVar.f7367J = TinkerManager.getTinkerId();
                }
                C3321an.m8349a("TINKER_ID:" + eVar.f7367J, new Object[0]);
                eVar.f7368K = TinkerManager.getNewTinkerId();
                C3321an.m8349a("NEW_TINKER_ID:" + eVar.f7368K, new Object[0]);
                TinkerManager.getInstance().setTinkerListener(new TinkerManager.TinkerListener() {
                    /* class com.tencent.bugly.proguard.C3363r.C33641 */

                    @Override // com.tencent.bugly.beta.tinker.TinkerManager.TinkerListener
                    public void onApplyFailure(String str) {
                        eVar.f7371N = false;
                        C3222a.m7760a("PatchResult", false);
                        C3222a.m7760a("IS_PATCHING", false);
                        C3321an.m8349a("Tinker patch failure, result: " + str, new Object[0]);
                        BetaPatchListener betaPatchListener = eVar.f7380W;
                        if (betaPatchListener != null) {
                            betaPatchListener.onApplyFailure(str);
                        }
                    }

                    @Override // com.tencent.bugly.beta.tinker.TinkerManager.TinkerListener
                    public void onApplySuccess(String str) {
                        C3226e eVar = eVar;
                        eVar.f7386ac = false;
                        eVar.f7371N = true;
                        C3222a.m7760a("IS_PATCHING", false);
                        C3222a.m7760a("PatchResult", true);
                        C3321an.m8349a("Tinker patch success, result: " + str, new Object[0]);
                        if (eVar.f7381X) {
                            C3243g.m7793a(new C3241e(), true);
                        }
                        BetaPatchListener betaPatchListener = eVar.f7380W;
                        if (betaPatchListener != null) {
                            betaPatchListener.onApplySuccess(str);
                        }
                    }

                    @Override // com.tencent.bugly.beta.tinker.TinkerManager.TinkerListener
                    public void onDownloadFailure(String str) {
                        BetaPatchListener betaPatchListener = eVar.f7380W;
                        if (betaPatchListener != null) {
                            betaPatchListener.onDownloadFailure(str);
                        }
                    }

                    @Override // com.tencent.bugly.beta.tinker.TinkerManager.TinkerListener
                    public void onDownloadSuccess(String str) {
                        BetaPatchListener betaPatchListener = eVar.f7380W;
                        if (betaPatchListener != null) {
                            betaPatchListener.onDownloadSuccess(str);
                        }
                    }

                    @Override // com.tencent.bugly.beta.tinker.TinkerManager.TinkerListener
                    public void onPatchRollback() {
                        C3321an.m8349a("patch rollback callback.", new Object[0]);
                        BetaPatchListener betaPatchListener = eVar.f7380W;
                        if (betaPatchListener != null) {
                            betaPatchListener.onPatchRollback();
                        }
                        if (TinkerManager.getInstance().getPatchDirectory(eVar.f7406s) != null && !TinkerManager.getInstance().getPatchDirectory(eVar.f7406s).exists()) {
                            C3222a.m7760a("IS_PATCH_ROLL_BACK", false);
                        }
                    }

                    @Override // com.tencent.bugly.beta.tinker.TinkerManager.TinkerListener
                    public void onPatchStart() {
                        eVar.f7386ac = true;
                        C3222a.m7760a("IS_PATCHING", true);
                    }
                });
            }
            if (TextUtils.isEmpty(C3222a.m7767b("BaseArchName", "")) && (str = eVar.f7406s.getApplicationInfo().nativeLibraryDir) != null && (listFiles = new File(str).listFiles()) != null && listFiles.length > 0) {
                boolean z = false;
                for (File file3 : listFiles) {
                    if (file3.getName().endsWith(".so")) {
                        String replace = file3.getName().replace(".so", "");
                        if (replace.startsWith("lib")) {
                            replace = replace.substring(replace.indexOf("lib") + 3);
                        }
                        C3321an.m8349a("libName:" + replace, new Object[0]);
                        String absolutePath3 = file3.getAbsolutePath();
                        C3321an.m8349a("soFilePath:" + absolutePath3, new Object[0]);
                        Iterator<String> it = eVar.f7384aa.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (replace.equals(it.next())) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (!z) {
                            String b = C3222a.m7766b(absolutePath3);
                            C3321an.m8349a("archName:" + b, new Object[0]);
                            if (b != null && b.equals("armeabi-v5te")) {
                                b = SoInstallMgrSdk.ARMEABI;
                            }
                            C3222a.m7759a(replace, b);
                            if (TextUtils.isEmpty(C3222a.m7767b("BaseArchName", ""))) {
                                C3222a.m7759a("BaseArchName", b);
                            }
                            z = false;
                        }
                    }
                }
            }
        }
    }
}
