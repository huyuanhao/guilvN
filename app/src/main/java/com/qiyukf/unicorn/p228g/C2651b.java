package com.qiyukf.unicorn.p228g;

import android.text.TextUtils;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.auth.AuthService;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2615k;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2624t;
import com.qiyukf.unicorn.p229h.C2667c;

/* renamed from: com.qiyukf.unicorn.g.b */
public final class C2651b {
    /* renamed from: a */
    public static void m6069a() {
        if (!C2437b.m5293n()) {
            String m = C2437b.m5291m();
            if (!TextUtils.isEmpty(m)) {
                C2615k kVar = new C2615k();
                kVar.mo36188a(m);
                C2667c.m6115a((AbstractC2597e) kVar, C2667c.m6116a(), true).setCallback(new RequestCallbackWrapper<Void>() {
                    /* class com.qiyukf.unicorn.p228g.C2651b.C26532 */

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
                    @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                    public final /* synthetic */ void onResult(int i, Void r2, Throwable th) {
                        if (i == 200) {
                            C2437b.m5265c(true);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m6070a(final boolean z) {
        C2624t tVar = new C2624t();
        tVar.mo36222a(z ? 1 : 0);
        C2667c.m6115a((AbstractC2597e) tVar, C2667c.m6116a(), true).setCallback(new RequestCallbackWrapper<Void>() {
            /* class com.qiyukf.unicorn.p228g.C2651b.C26521 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
            @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
            public final /* synthetic */ void onResult(int i, Void r2, Throwable th) {
                if (i == 200 && z) {
                    ((AuthService) NIMClient.getService(AuthService.class)).changeSaverMode(2);
                }
            }
        });
    }
}
