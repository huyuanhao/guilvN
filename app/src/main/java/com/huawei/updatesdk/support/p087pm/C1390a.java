package com.huawei.updatesdk.support.p087pm;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.support.p087pm.C1392c;
import java.io.File;

/* renamed from: com.huawei.updatesdk.support.pm.a */
public class C1390a {
    /* renamed from: a */
    public static void m2106a() {
        C1399g.m2133a(4, -10002);
    }

    /* renamed from: a */
    public static void m2107a(Context context, C1391b bVar) {
        m2108b(context, bVar);
    }

    /* renamed from: b */
    public static void m2108b(Context context, C1391b bVar) {
        if (bVar == null) {
            C1278a.m1584d("InstallProcess", "system install failed,task is null");
            return;
        }
        C1278a.m1580a("InstallProcess", "systemInstall begin!!!task:" + bVar.toString());
        bVar.mo16231a(C1392c.EnumC1393a.NOT_HANDLER);
        C1399g.m2133a(3, 1);
        File file = new File(bVar.mo16244f());
        if (!file.exists() || !file.isFile() || file.length() <= 0) {
            C1278a.m1584d("InstallProcess", "system install failed,file not existed filePath:" + bVar.mo16244f());
            C1399g.m2133a(4, -10003);
            return;
        }
        Intent intent = new Intent(context, PackageInstallerActivity.class);
        intent.putExtra("install_path", bVar.mo16244f());
        intent.putExtra("install_packagename", bVar.mo16243e());
        intent.putExtra("install_change_path_times", bVar.mo16246h());
        if (!(context instanceof Activity)) {
            intent.setFlags(402653184);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            m2106a();
            C1278a.m1581a("InstallProcess", " can not start install !", e);
        }
    }
}
