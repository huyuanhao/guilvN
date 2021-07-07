package com.huawei.hms.update.p058e;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.AbstractC1109a;
import com.huawei.hms.p037c.AbstractC1139h;
import com.huawei.hms.support.log.C1202a;
import com.huawei.hms.update.p057d.C1231a;
import com.p118pd.sdk.C7486o0OoO0oO;
import com.p118pd.sdk.C8413oOoo0o;
import com.vivo.push.PushClientConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.update.e.t */
public class C1259t extends AbstractC1232a {

    /* renamed from: k */
    public BroadcastReceiver f1390k;

    /* renamed from: l */
    public Handler f1391l = new Handler();

    /* renamed from: m */
    public int f1392m = 0;

    /* renamed from: n */
    public Handler f1393n = new HandlerC1261u(this);

    /* renamed from: com.huawei.hms.update.e.t$a */
    public class RunnableC1260a implements Runnable {
        public RunnableC1260a() {
        }

        public void run() {
            C1259t.this.m1473c((C1259t) 14);
        }

        public /* synthetic */ RunnableC1260a(C1259t tVar, HandlerC1261u uVar) {
            this();
        }
    }

    /* renamed from: e */
    private void m1476e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.appmarket.service.downloadservice.Receiver");
        intentFilter.addAction("com.huawei.appmarket.service.downloadservice.progress.Receiver");
        intentFilter.addAction("com.huawei.appmarket.service.installerservice.Receiver");
        this.f1390k = new C1231a(this.f1393n);
        Activity a = mo15759a();
        if (a != null) {
            a.registerReceiver(this.f1390k, intentFilter);
        }
    }

    /* renamed from: f */
    private void m1477f() {
        BroadcastReceiver broadcastReceiver;
        Activity a = mo15759a();
        if (a != null && (broadcastReceiver = this.f1390k) != null) {
            a.unregisterReceiver(broadcastReceiver);
            this.f1390k = null;
        }
    }

    /* renamed from: c */
    public int mo15797c() {
        return 2000;
    }

    /* renamed from: d */
    public void mo15798d() {
        mo15766b(13, this.f1372f);
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        if (this.f1369c != null) {
            this.f1372f = 0;
            if (m1469a(activity)) {
                return;
            }
            if (!mo15764a(true)) {
                mo15766b(8, this.f1372f);
            } else {
                mo15760a(8, this.f1372f);
            }
        }
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onBridgeActivityDestroy() {
        this.f1391l.removeCallbacksAndMessages(null);
        m1477f();
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.AbstractC1109a
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        AbstractC1109a aVar;
        if (this.f1371e && (aVar = this.f1368b) != null) {
            return aVar.onBridgeActivityResult(i, i2, intent);
        }
        C1202a.m1318b("SilentUpdateWizard", "onBridgeActivityResult requestCode is " + i + "resultCode is " + i2);
        if (i != mo15797c()) {
            return false;
        }
        if (i2 == 0) {
            m1476e();
            m1470b(C7486o0OoO0oO.OooO0o);
            return true;
        } else if (i2 == 4) {
            mo15798d();
            return true;
        } else {
            if (!mo15764a(true)) {
                mo15766b(i2, this.f1372f);
            } else {
                mo15760a(i2, this.f1372f);
            }
            return true;
        }
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onKeyUp(int i, KeyEvent keyEvent) {
        super.onKeyUp(i, keyEvent);
    }

    /* renamed from: b */
    private void m1470b(int i) {
        this.f1391l.removeCallbacksAndMessages(null);
        this.f1391l.postDelayed(new RunnableC1260a(this, null), (long) i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m1473c(int i) {
        this.f1391l.removeCallbacksAndMessages(null);
        m1477f();
        mo15765b();
        if (!mo15764a(false)) {
            mo15766b(i, this.f1372f);
        } else {
            mo15760a(i, this.f1372f);
        }
    }

    /* renamed from: a */
    private boolean m1469a(Activity activity) {
        if (TextUtils.isEmpty(this.f1373g)) {
            return false;
        }
        Intent intent = new Intent("com.huawei.appmarket.intent.action.ThirdUpdateAction");
        intent.setPackage(C8413oOoo0o.f21545OooO0O0);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PushClientConstants.TAG_PKG_NAME, this.f1373g);
            jSONObject.put("versioncode", this.f1375i);
            jSONArray.put(jSONObject);
            intent.putExtra("params", jSONArray.toString());
            intent.putExtra("isHmsOrApkUpgrade", this.f1369c.mo15805a());
            intent.putExtra("buttonDlgY", AbstractC1139h.m1086d("hms_install"));
            intent.putExtra("buttonDlgN", AbstractC1139h.m1086d("hms_cancel"));
            intent.putExtra("upgradeDlgContent", AbstractC1139h.m1082a("hms_update_message_new", "%P"));
            try {
                activity.startActivityForResult(intent, mo15797c());
                return true;
            } catch (ActivityNotFoundException unused) {
                C1202a.m1320d("SilentUpdateWizard", "ActivityNotFoundException");
                return false;
            }
        } catch (JSONException e) {
            C1202a.m1320d("SilentUpdateWizard", "create hmsJsonObject fail" + e.getMessage());
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1471b(Bundle bundle) {
        String string = bundle.containsKey("UpgradePkgName") ? bundle.getString("UpgradePkgName") : null;
        if (string != null && string.equals(this.f1373g) && bundle.containsKey("UpgradeDownloadProgress") && bundle.containsKey("UpgradeAppName")) {
            int i = bundle.getInt("UpgradeDownloadProgress");
            m1470b(C7486o0OoO0oO.OooO0o);
            if (i >= 99) {
                i = 99;
            }
            this.f1392m = i;
            if (this.f1370d == null) {
                mo15762a(C1243i.class);
            }
            AbstractC1233b bVar = this.f1370d;
            if (bVar != null) {
                ((C1243i) bVar).mo15783b(i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m1474c(Bundle bundle) {
        if (bundle.containsKey("packagename") && bundle.containsKey("status")) {
            String string = bundle.getString("packagename");
            int i = bundle.getInt("status");
            C1202a.m1318b("SilentUpdateWizard", "handlerInstallStatus-status is " + i);
            if (string != null && string.equals(this.f1373g)) {
                if (i == 2) {
                    this.f1391l.removeCallbacksAndMessages(null);
                    AbstractC1233b bVar = this.f1370d;
                    if (bVar != null) {
                        ((C1243i) bVar).mo15783b(100);
                    }
                    mo15766b(0, this.f1372f);
                } else if (i == -1 || i == -2) {
                    m1473c(i);
                } else {
                    m1470b(60000);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1466a(Bundle bundle) {
        String string = bundle.containsKey("UpgradePkgName") ? bundle.getString("UpgradePkgName") : null;
        if (string != null && string.equals(this.f1373g) && bundle.containsKey("downloadtask.status")) {
            int i = bundle.getInt("downloadtask.status");
            C1202a.m1318b("SilentUpdateWizard", "handleDownloadStatus-status is " + i);
            if (i == 3 || i == 5 || i == 6 || i == 8) {
                m1473c(i);
            } else if (i == 4) {
                m1470b(60000);
            } else {
                m1470b(C7486o0OoO0oO.OooO0o);
            }
        }
    }

    @Override // com.huawei.hms.update.p058e.AbstractC1232a
    /* renamed from: a */
    public void mo15762a(Class<? extends AbstractC1233b> cls) {
        try {
            AbstractC1233b bVar = (AbstractC1233b) cls.newInstance();
            if (this.f1392m > 0 && (bVar instanceof C1243i)) {
                ((C1243i) bVar).mo15782a(this.f1392m);
            }
            bVar.mo15769a(this);
            this.f1370d = bVar;
        } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
            C1202a.m1320d("SilentUpdateWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }
}
