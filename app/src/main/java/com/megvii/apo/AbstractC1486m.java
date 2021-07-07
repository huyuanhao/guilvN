package com.megvii.apo;

import android.content.Context;
import com.megvii.apo.p092a.C1466a;
import com.megvii.apo.util.C1495e;
import com.p118pd.sdk.C9058ooOoOoOO;
import java.util.Map;

/* renamed from: com.megvii.apo.m */
public abstract class AbstractC1486m {

    /* renamed from: a */
    public Context f1983a;

    /* renamed from: b */
    public C1466a f1984b;

    public AbstractC1486m(Context context) {
        this.f1983a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final C1466a mo16959a() {
        return this.f1984b;
    }

    /* renamed from: a */
    public abstract void mo16948a(Map<String, Object> map);

    /* renamed from: a */
    public final void mo16960a(C1466a aVar) {
        this.f1984b = aVar;
    }

    /* renamed from: a */
    public final boolean mo16961a(String str) {
        try {
            if (this.f1983a.getPackageManager().checkPermission(str, this.f1983a.getPackageName()) == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return true;
        }
    }

    /* renamed from: a */
    public static String m2232a(int i) {
        return (i & 255) + C9058ooOoOoOO.OooOO0 + ((i >> 8) & 255) + C9058ooOoOoOO.OooOO0 + ((i >> 16) & 255) + C9058ooOoOoOO.OooOO0 + ((i >> 24) & 255);
    }
}
