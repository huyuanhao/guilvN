package com.huawei.updatesdk.support.p087pm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.updatesdk.fileprovider.UpdateSdkFileProvider;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.service.p075b.C1296b;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import s.h.e.l.l.C;

/* renamed from: com.huawei.updatesdk.support.pm.PackageInstallerActivity */
public class PackageInstallerActivity extends Activity {

    /* renamed from: a */
    public String f1696a = "";

    /* renamed from: b */
    public String f1697b = "";

    /* renamed from: c */
    public int f1698c = -1;

    static {
        C.i(50331729);
    }

    /* renamed from: a */
    private Intent m2105a(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.INSTALL_PACKAGE");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.setFlags(1);
            intent.setData(UpdateSdkFileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + UpdateSdkFileProvider.AUTHORITIES_SUFFIX, new File(str)));
        } else {
            intent.setData(Uri.fromFile(new File(str)));
            if (!(context instanceof Activity)) {
                intent.setFlags(CommonNetImpl.FLAG_AUTH);
            }
        }
        return intent;
    }

    public native void onActivityResult(int i, int i2, Intent intent);

    public void onCreate(Bundle bundle) {
        String str;
        requestWindowFeature(1);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            str = "PackageInstallerActivity error intent";
        } else {
            C1296b a = C1296b.m1655a(intent);
            this.f1696a = a.mo15909b("install_path");
            this.f1697b = a.mo15909b("install_packagename");
            if (TextUtils.isEmpty(this.f1696a)) {
                C1399g.m2133a(4, -3);
                finish();
                str = "PackageInstallerActivity can not find filePath.";
            } else {
                this.f1698c = a.mo15904a("install_change_path_times", -1);
                try {
                    Intent a2 = m2105a(this, this.f1696a);
                    a2.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
                    a2.putExtra("android.intent.extra.RETURN_RESULT", true);
                    C1278a.m1583c("PackageInstallerActivity", " onCreate filePath:" + this.f1696a + ",packageName:" + this.f1697b + ",taskId:" + getTaskId());
                    startActivityForResult(a2, 1000);
                    return;
                } catch (Exception unused) {
                    C1278a.m1584d("PackageInstallerActivity", "can not start install action");
                    C1399g.m2133a(4, -2);
                    finish();
                    return;
                }
            }
        }
        C1278a.m1584d("PackageInstallerActivity", str);
    }

    public native void onDestroy();
}
