package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3524b;
import com.umeng.commonsdk.statistics.common.ULog;

/* renamed from: com.umeng.commonsdk.a */
public class C3493a {

    /* renamed from: a */
    public static boolean f8867a;

    /* renamed from: a */
    public static synchronized void m8983a(final Context context) {
        synchronized (C3493a.class) {
            if (context != null) {
                try {
                    if (!f8867a) {
                        new Thread(new Runnable() {
                            /* class com.umeng.commonsdk.C3493a.RunnableC34941 */

                            public void run() {
                                try {
                                    String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                    String packageName = context.getPackageName();
                                    if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName) && UMEnvelopeBuild.isReadyBuild(context, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                                        UMWorkDispatch.sendEvent(context, 32777, C3524b.m9071a(context).mo38849a(), null);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }).start();
                        f8867a = true;
                    }
                } catch (Throwable th) {
                    ULog.m9826e(UMModuleRegister.INNER, "e is " + th.getMessage());
                }
            }
        }
        return;
    }
}
