package com.huawei.updatesdk.service.otaupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.huawei.updatesdk.p059a.p060a.p061a.C1268a;
import com.huawei.updatesdk.p059a.p060a.p061a.C1269b;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.p071b.C1282a;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.huawei.updatesdk.sdk.service.p076c.p077a.C1302d;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.appmgr.bean.C1327a;
import com.huawei.updatesdk.service.appmgr.bean.C1330b;
import com.huawei.updatesdk.service.p078a.C1325a;
import com.huawei.updatesdk.service.p079b.p080a.C1332b;
import com.huawei.updatesdk.support.p083c.C1371a;
import com.huawei.updatesdk.support.p085e.C1379c;
import com.huawei.updatesdk.support.p085e.C1380d;
import com.p118pd.sdk.C8413oOoo0o;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.updatesdk.service.otaupdate.c */
public class AsyncTaskC1358c extends AsyncTask<Void, Void, C1302d> {

    /* renamed from: a */
    public Context f1638a;

    /* renamed from: b */
    public CheckUpdateCallBack f1639b;

    /* renamed from: c */
    public boolean f1640c = false;

    /* renamed from: d */
    public boolean f1641d = false;

    /* renamed from: e */
    public String f1642e = null;

    /* renamed from: f */
    public String f1643f = null;

    /* renamed from: g */
    public Toast f1644g;

    /* renamed from: h */
    public boolean f1645h = false;

    public AsyncTaskC1358c(Context context, CheckUpdateCallBack checkUpdateCallBack, boolean z) {
        this.f1639b = checkUpdateCallBack;
        this.f1638a = context;
        this.f1641d = z;
    }

    /* renamed from: a */
    private C1302d m1997a(Context context, String str) {
        PackageInfo a = C1371a.m2047a(str, context);
        if (a == null && this.f1642e == null) {
            C1278a.m1584d("CheckOtaAndUpdataTask", "get app packageInfo failed,packageName:" + str);
            return null;
        }
        if (a == null) {
            a = new PackageInfo();
            a.packageName = str;
            a.versionName = "1.0";
            a.versionCode = 1;
            ApplicationInfo applicationInfo = new ApplicationInfo();
            applicationInfo.targetSdkVersion = 19;
            a.applicationInfo = applicationInfo;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        C1327a a2 = C1327a.m1891a(arrayList);
        a2.mo16129a(0);
        return C1332b.m1902a(a2);
    }

    /* renamed from: a */
    private ApkUpgradeInfo m1998a(String str, List<ApkUpgradeInfo> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return null;
        }
        for (ApkUpgradeInfo apkUpgradeInfo : list) {
            if (str.equals(apkUpgradeInfo.getPackage_()) && apkUpgradeInfo.getOldVersionCode_() < apkUpgradeInfo.getVersionCode_()) {
                return apkUpgradeInfo;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m1999a() {
        Toast toast = this.f1644g;
        if (toast != null) {
            toast.cancel();
        }
    }

    /* renamed from: a */
    private void m2000a(Context context, ApkUpgradeInfo apkUpgradeInfo) {
        if (context != null) {
            Intent intent = new Intent(context, AppUpdateActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("app_update_parm", apkUpgradeInfo);
            bundle.putSerializable("app_must_btn", Boolean.valueOf(this.f1641d));
            intent.putExtras(bundle);
            if (!(context instanceof Activity)) {
                intent.setFlags(CommonNetImpl.FLAG_AUTH);
            }
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                C1278a.m1584d("CheckOtaAndUpdataTask", "go AppUpdateActivity error: " + e.toString());
            }
        }
    }

    /* renamed from: b */
    private void m2001b() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1282a.m1597c());
        sb.append(Build.VERSION.SDK_INT);
        sb.append(Build.MODEL);
        sb.append(C1282a.m1595b());
        sb.append(C1362e.m2017a().mo16190c());
        sb.append(C1379c.m2071a().mo16208b());
        boolean z = !TextUtils.equals(sb.toString(), C1325a.m1873a().mo16066c());
        if (z) {
            C1325a.m1873a().mo16062a(sb.toString());
        }
        long g = C1325a.m1873a().mo16071g();
        long b = C1325a.m1873a().mo16063b();
        if (z || TextUtils.isEmpty(C1362e.m2017a().mo16190c()) || Math.abs(g - b) >= 7 || TextUtils.isEmpty(C1325a.m1873a().mo16068d())) {
            C1302d a = C1332b.m1902a(C1268a.m1540f());
            if ((a instanceof C1269b) && a.mo15930d() == 0 && a.mo15929c() == 0) {
                C1325a.m1873a().mo16065b(((C1269b) a).mo15864a());
            }
        }
    }

    /* renamed from: b */
    private void m2002b(C1302d dVar) {
        if (this.f1639b != null) {
            Intent intent = new Intent();
            intent.putExtra("status", 6);
            if (dVar.mo15931e() != null) {
                intent.putExtra(UpdateKey.FAIL_CODE, dVar.mo15931e().ordinal());
            }
            intent.putExtra(UpdateKey.FAIL_REASON, dVar.mo15932f());
            intent.putExtra(UpdateKey.REQUEST_SIGN, C1325a.m1873a().mo16068d());
            this.f1639b.onUpdateInfo(intent);
            this.f1639b.onUpdateStoreError(dVar.mo15929c());
        }
    }

    /* renamed from: a */
    public C1302d doInBackground(Void... voidArr) {
        C1278a.m1580a("CheckOtaAndUpdataTask", "CheckOtaAndUpdataTask doInBackground");
        if (Build.VERSION.SDK_INT >= 24 || C1282a.m1604g() == 0 || C1371a.m2048a(C1294a.m1650a().mo15900b(), C8413oOoo0o.f21545OooO0O0) != C1371a.EnumC1372a.NOT_INSTALLED || C1371a.m2054c()) {
            if (TextUtils.isEmpty(C1362e.m2017a().mo16188b())) {
                C1362e.m2017a().mo16186a(this.f1638a);
            }
            String str = this.f1642e;
            this.f1643f = str;
            if (TextUtils.isEmpty(str)) {
                this.f1643f = this.f1638a.getPackageName();
            }
            C1325a a = C1325a.m1873a();
            a.mo16067c("updatesdk_" + this.f1643f);
            m2001b();
            return m1997a(this.f1638a, this.f1643f);
        }
        C1278a.m1580a("CheckOtaAndUpdataTask", "api <24,HiApp not installed and no permission");
        return null;
    }

    /* renamed from: a */
    public void onPostExecute(C1302d dVar) {
        m1999a();
        if (dVar != null) {
            ApkUpgradeInfo apkUpgradeInfo = null;
            if (dVar.mo15929c() == 0 && dVar.mo15930d() == 0) {
                apkUpgradeInfo = m1998a(this.f1643f, ((C1330b) dVar).list_);
                if (apkUpgradeInfo == null && this.f1639b != null) {
                    Intent intent = new Intent();
                    intent.putExtra("status", 3);
                    intent.putExtra(UpdateKey.REQUEST_SIGN, C1325a.m1873a().mo16068d());
                    this.f1639b.onUpdateInfo(intent);
                }
            } else {
                m2002b(dVar);
                C1278a.m1584d("CheckOtaAndUpdataTask", "get app update msg failed,responseCode is " + dVar.mo15929c());
            }
            if (apkUpgradeInfo != null && !TextUtils.isEmpty(apkUpgradeInfo.getFullDownUrl_())) {
                apkUpgradeInfo.setDownurl_(apkUpgradeInfo.getFullDownUrl_());
            }
            if (apkUpgradeInfo != null) {
                C1278a.m1580a("CheckOtaAndUpdataTask", "check store client update success!" + apkUpgradeInfo.getVersionCode_() + ",version:" + apkUpgradeInfo.getVersion_());
                if (this.f1639b != null) {
                    Intent intent2 = new Intent();
                    intent2.putExtra(UpdateKey.INFO, apkUpgradeInfo);
                    intent2.putExtra("status", 7);
                    intent2.putExtra(UpdateKey.REQUEST_SIGN, C1325a.m1873a().mo16068d());
                    this.f1639b.onUpdateInfo(intent2);
                }
                if (this.f1640c) {
                    m2000a(this.f1638a, apkUpgradeInfo);
                }
            } else if (!this.f1645h && TextUtils.isEmpty(this.f1642e)) {
                Context context = this.f1638a;
                Toast.makeText(context, C1380d.m2081b(context, "upsdk_update_check_no_new_version"), 0).show();
            }
        }
    }

    /* renamed from: a */
    public void mo16180a(String str) {
        this.f1642e = str;
    }

    /* renamed from: a */
    public void mo16181a(boolean z) {
        this.f1640c = z;
    }

    /* renamed from: b */
    public void mo16182b(boolean z) {
        this.f1645h = z;
    }

    public void onPreExecute() {
        super.onPreExecute();
        C1357b.m1992a().mo16176a(this.f1639b);
        if (!this.f1645h && TextUtils.isEmpty(this.f1642e)) {
            Context context = this.f1638a;
            Toast makeText = Toast.makeText(context, C1380d.m2081b(context, "upsdk_checking_update_prompt"), 1);
            this.f1644g = makeText;
            makeText.show();
        }
    }
}
