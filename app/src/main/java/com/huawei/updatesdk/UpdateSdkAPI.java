package com.huawei.updatesdk;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.huawei.updatesdk.sdk.p062a.p069d.p071b.C1282a;
import com.huawei.updatesdk.sdk.p062a.p069d.p073c.C1291b;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.AppUpdateActivity;
import com.huawei.updatesdk.service.otaupdate.AsyncTaskC1358c;
import com.huawei.updatesdk.service.otaupdate.C1357b;
import com.huawei.updatesdk.service.otaupdate.C1362e;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.p078a.C1325a;
import com.huawei.updatesdk.service.p079b.p080a.C1331a;
import com.huawei.updatesdk.support.p085e.C1380d;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.concurrent.Executors;

public final class UpdateSdkAPI {
    public static final String TAG = "UpdateSdk";

    public static void checkAppUpdate(Context context, CheckUpdateCallBack checkUpdateCallBack, boolean z, boolean z2) {
        if (context != null) {
            if (C1291b.m1636a(context)) {
                init(context);
                AsyncTaskC1358c cVar = new AsyncTaskC1358c(context, checkUpdateCallBack, z2);
                cVar.mo16181a(z);
                cVar.executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
                return;
            }
            if (checkUpdateCallBack != null) {
                Intent intent = new Intent();
                intent.putExtra("status", 2);
                checkUpdateCallBack.onUpdateInfo(intent);
            }
            Toast.makeText(context, C1380d.m2081b(context, "upsdk_no_available_network_prompt_toast"), 0).show();
        }
    }

    public static void checkClientOTAUpdate(Context context, CheckUpdateCallBack checkUpdateCallBack, boolean z, int i, boolean z2) {
        if (context != null && C1291b.m1636a(context)) {
            init(context);
            long g = C1325a.m1873a().mo16071g();
            long e = C1325a.m1873a().mo16069e();
            if (i == 0 || Math.abs(g - e) >= ((long) i)) {
                C1325a.m1873a().mo16064b(g);
                AsyncTaskC1358c cVar = new AsyncTaskC1358c(context, checkUpdateCallBack, z2);
                cVar.mo16182b(true);
                cVar.mo16181a(z);
                cVar.executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
            }
        }
    }

    public static void checkTargetAppUpdate(Context context, String str, CheckUpdateCallBack checkUpdateCallBack) {
        if (context == null || TextUtils.isEmpty(str)) {
            if (checkUpdateCallBack != null) {
                Intent intent = new Intent();
                intent.putExtra("status", 1);
                checkUpdateCallBack.onUpdateInfo(intent);
            }
        } else if (C1291b.m1636a(context)) {
            init(context);
            AsyncTaskC1358c cVar = new AsyncTaskC1358c(context, checkUpdateCallBack, false);
            cVar.mo16180a(str);
            cVar.executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
        } else if (checkUpdateCallBack != null) {
            Intent intent2 = new Intent();
            intent2.putExtra("status", 2);
            checkUpdateCallBack.onUpdateInfo(intent2);
        }
    }

    public static void init(Context context) {
        C1294a.m1651a(context);
        C1282a.m1593a(context);
        C1331a.m1901a();
        Log.i("updatesdk", "UpdateSDK version is: 2.0.5.300");
    }

    public static void releaseCallBack() {
        C1357b.m1992a().mo16176a((CheckUpdateCallBack) null);
    }

    public static void setServiceZone(String str) {
        C1362e.m2017a().mo16187a(str);
    }

    public static void showUpdateDialog(Context context, ApkUpgradeInfo apkUpgradeInfo, boolean z) {
        if (context != null && apkUpgradeInfo != null) {
            Intent intent = new Intent(context, AppUpdateActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("app_update_parm", apkUpgradeInfo);
            bundle.putSerializable("app_must_btn", Boolean.valueOf(z));
            intent.putExtras(bundle);
            if (!(context instanceof Activity)) {
                intent.setFlags(CommonNetImpl.FLAG_AUTH);
            }
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                String str = "go AppUpdateActivity error: " + e.toString();
            }
        }
    }
}
