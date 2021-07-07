package com.megvii.meglive_sdk.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.megvii.meglive_sdk.volley.C1630n;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.File;

/* renamed from: com.megvii.meglive_sdk.volley.toolbox.k */
public final class C1653k {
    /* renamed from: a */
    public static C1630n m2871a(Context context, AbstractC1643e eVar) {
        File file = new File(context.getCacheDir(), "volley");
        try {
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(packageName);
            sb.append(C8932ooOOO0o.OooO0OO);
            sb.append(packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT >= 9) {
            eVar = new C1644f();
        }
        C1630n nVar = new C1630n(new C1641c(file, (byte) 0), new C1639a(eVar), (byte) 0);
        nVar.mo17358a();
        return nVar;
    }
}
