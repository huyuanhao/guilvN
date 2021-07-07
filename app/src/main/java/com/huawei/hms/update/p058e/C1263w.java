package com.huawei.hms.update.p058e;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.AbstractC1109a;
import com.huawei.hms.p037c.C1137g;
import com.huawei.hms.support.log.C1202a;
import com.huawei.hms.update.p053a.C1214c;
import com.huawei.hms.update.p053a.C1219h;
import com.huawei.hms.update.p053a.p054a.AbstractC1209a;
import com.huawei.hms.update.p053a.p054a.AbstractC1210b;
import com.huawei.hms.update.p053a.p054a.C1211c;
import com.huawei.hms.update.p053a.p054a.C1212d;
import com.huawei.hms.update.p058e.C1236e;
import com.huawei.hms.update.p058e.C1252q;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.File;
import java.io.Serializable;

/* renamed from: com.huawei.hms.update.e.w */
public class C1263w extends AbstractC1232a implements AbstractC1210b {

    /* renamed from: k */
    public AbstractC1209a f1403k;

    /* renamed from: l */
    public C1211c f1404l;

    /* renamed from: m */
    public int f1405m = 0;

    /* renamed from: e */
    private void m1502e() {
        if (!mo15764a(false)) {
            mo15766b(8, this.f1372f);
        } else {
            mo15760a(8, this.f1372f);
        }
    }

    /* renamed from: f */
    private void m1503f() {
        Activity a = mo15759a();
        if (a == null || a.isFinishing()) {
            mo15762a(C1252q.C1255c.class);
            return;
        }
        m1504g();
        C1214c cVar = new C1214c(new C1219h(a));
        this.f1403k = cVar;
        cVar.mo15729a(this, this.f1404l);
    }

    /* renamed from: g */
    private void m1504g() {
        AbstractC1209a aVar = this.f1403k;
        if (aVar != null) {
            aVar.mo15728a();
            this.f1403k = null;
        }
    }

    @Override // com.huawei.hms.update.p058e.AbstractC1232a
    /* renamed from: b */
    public void mo15767b(AbstractC1233b bVar) {
        C1202a.m1318b("UpdateWizard", "Enter onDoWork.");
        if (bVar instanceof C1249n) {
            bVar.mo15771c();
            mo15762a(C1235d.class);
            m1498a(this);
        } else if (bVar instanceof C1236e.C1239c) {
            bVar.mo15771c();
            mo15816d();
        } else if (bVar instanceof C1236e.C1238b) {
            mo15762a(C1243i.class);
            m1503f();
        } else if (bVar instanceof C1252q.C1254b) {
            m1502e();
        } else if (bVar instanceof C1252q.C1255c) {
            m1502e();
        } else if (bVar instanceof C1252q.C1256d) {
            m1502e();
        }
    }

    /* renamed from: c */
    public int mo15815c() {
        return 2006;
    }

    /* renamed from: d */
    public void mo15816d() {
        mo15766b(13, this.f1372f);
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        C1262v vVar = this.f1369c;
        if (vVar != null) {
            this.f1372f = 6;
            if (!vVar.mo15814g() || TextUtils.isEmpty(this.f1374h)) {
                mo15762a(C1235d.class);
                m1498a(this);
                return;
            }
            mo15762a(C1249n.class);
        }
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onBridgeActivityDestroy() {
        m1504g();
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.AbstractC1109a
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        AbstractC1109a aVar;
        if (this.f1371e && (aVar = this.f1368b) != null) {
            return aVar.onBridgeActivityResult(i, i2, intent);
        }
        if (this.f1372f != 6 || i != mo15815c()) {
            return false;
        }
        if (mo15763a(this.f1373g, this.f1375i)) {
            mo15766b(0, this.f1372f);
            return true;
        }
        m1502e();
        return true;
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onKeyUp(int i, KeyEvent keyEvent) {
        AbstractC1109a aVar;
        if (this.f1371e && (aVar = this.f1368b) != null) {
            aVar.onKeyUp(i, keyEvent);
        } else if (4 == i) {
            C1202a.m1318b("UpdateWizard", "In onKeyUp, Call finish.");
            Activity a = mo15759a();
            if (a != null && !a.isFinishing()) {
                a.setResult(0, null);
                a.finish();
            }
        }
    }

    /* renamed from: a */
    public static Uri m1496a(Context context, File file) {
        C1137g gVar = new C1137g(context);
        String packageName = context.getPackageName();
        String str = packageName + UpdateProvider.AUTHORITIES_SUFFIX;
        boolean z = true;
        if (Build.VERSION.SDK_INT <= 23 || (context.getApplicationInfo().targetSdkVersion <= 23 && !gVar.mo15417a(packageName, str))) {
            z = false;
        }
        if (z) {
            return UpdateProvider.getUriForFile(context, str, file);
        }
        return Uri.fromFile(file);
    }

    /* renamed from: a */
    public static void m1499a(AbstractC1210b bVar, int i, C1211c cVar) {
        if (bVar != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1264x(bVar, i, cVar));
        }
    }

    @Override // com.huawei.hms.update.p053a.p054a.AbstractC1210b
    /* renamed from: a */
    public void mo15731a(int i, C1211c cVar) {
        C1202a.m1318b("UpdateWizard", "Enter onCheckUpdate, status: " + C1212d.m1355a(i));
        if (i != 1000) {
            switch (i) {
                case 1201:
                case 1202:
                case 1203:
                    mo15762a(C1252q.C1254b.class);
                    return;
                default:
                    mo15762a(C1252q.C1254b.class);
                    return;
            }
        } else {
            this.f1404l = cVar;
            mo15762a(C1243i.class);
            m1503f();
        }
    }

    @Override // com.huawei.hms.update.p053a.p054a.AbstractC1210b
    /* renamed from: a */
    public void mo15730a(int i, int i2, int i3, File file) {
        C1202a.m1318b("UpdateWizard", "Enter onDownloadPackage, status: " + C1212d.m1355a(i) + ", reveived: " + i2 + ", total: " + i3);
        if (i == 2000) {
            mo15765b();
            if (file == null) {
                m1502e();
            } else {
                m1501a(file);
            }
        } else if (i != 2100) {
            switch (i) {
                case 2201:
                    mo15762a(C1252q.C1255c.class);
                    return;
                case 2202:
                    mo15762a(C1236e.C1238b.class);
                    return;
                case 2203:
                case 2204:
                    mo15762a(C1252q.C1256d.class);
                    return;
                default:
                    return;
            }
        } else {
            AbstractC1233b bVar = this.f1370d;
            if (bVar != null && (bVar instanceof C1243i)) {
                int i4 = 0;
                if (i2 >= 0 && i3 > 0) {
                    i4 = (int) ((((long) i2) * 100) / ((long) i3));
                }
                this.f1405m = i4;
                ((C1243i) this.f1370d).mo15783b(i4);
            }
        }
    }

    /* renamed from: a */
    private void m1501a(File file) {
        Activity a = mo15759a();
        if (a != null && !a.isFinishing()) {
            Uri a2 = m1496a(a, file);
            if (a2 == null) {
                C1202a.m1320d("UpdateWizard", "In startInstaller, Failed to creates a Uri from a file.");
                m1502e();
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(a2, "application/vnd.android.package-archive");
            intent.setFlags(3);
            intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
            try {
                a.startActivityForResult(intent, mo15815c());
            } catch (ActivityNotFoundException e) {
                C1202a.m1320d("UpdateWizard", "In startInstaller, Failed to start package installer." + e.getMessage());
                m1502e();
            }
        }
    }

    @Override // com.huawei.hms.update.p058e.AbstractC1232a
    /* renamed from: a */
    public void mo15761a(AbstractC1233b bVar) {
        C1202a.m1318b("UpdateWizard", "Enter onCancel.");
        if (bVar instanceof C1249n) {
            mo15816d();
        } else if (bVar instanceof C1235d) {
            m1504g();
            mo15816d();
        } else if (bVar instanceof C1243i) {
            m1504g();
            mo15762a(C1236e.C1239c.class);
        } else if (bVar instanceof C1236e.C1239c) {
            mo15762a(C1243i.class);
            m1503f();
        } else if (bVar instanceof C1236e.C1238b) {
            mo15816d();
        } else {
            m1502e();
        }
    }

    @Override // com.huawei.hms.update.p058e.AbstractC1232a
    /* renamed from: a */
    public void mo15762a(Class<? extends AbstractC1233b> cls) {
        mo15765b();
        try {
            AbstractC1233b bVar = (AbstractC1233b) cls.newInstance();
            if (!TextUtils.isEmpty(this.f1374h) && (bVar instanceof C1249n)) {
                ((C1249n) bVar).mo15791a(this.f1374h);
            }
            if (this.f1405m > 0 && (bVar instanceof C1243i)) {
                ((C1243i) bVar).mo15782a(this.f1405m);
            }
            bVar.mo15769a(this);
            this.f1370d = bVar;
        } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
            C1202a.m1320d("UpdateWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }

    /* renamed from: a */
    private void m1498a(AbstractC1210b bVar) {
        if (bVar != null) {
            Activity a = mo15759a();
            if (a == null || a.isFinishing()) {
                m1499a(bVar, 1201, (C1211c) null);
            } else {
                UpdateSdkAPI.checkTargetAppUpdate(a, this.f1369c.mo15806b(), new C1265y(this, bVar));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1497a(Intent intent, AbstractC1210b bVar) {
        try {
            int intExtra = intent.getIntExtra("status", -99);
            C1202a.m1318b("UpdateWizard", "CheckUpdateCallBack status is " + intExtra);
            String stringExtra = intent.getStringExtra(UpdateKey.FAIL_REASON);
            if (!TextUtils.isEmpty(stringExtra)) {
                C1202a.m1320d("UpdateWizard", "checkTargetAppUpdate reason is " + stringExtra);
            }
            if (intExtra == 7) {
                Serializable serializableExtra = intent.getSerializableExtra(UpdateKey.INFO);
                if (serializableExtra != null && (serializableExtra instanceof ApkUpgradeInfo)) {
                    ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) serializableExtra;
                    String package_ = apkUpgradeInfo.getPackage_();
                    int versionCode_ = apkUpgradeInfo.getVersionCode_();
                    String downurl_ = apkUpgradeInfo.getDownurl_();
                    int size_ = apkUpgradeInfo.getSize_();
                    String sha256_ = apkUpgradeInfo.getSha256_();
                    if (TextUtils.isEmpty(package_) || !package_.equals(this.f1369c.mo15806b())) {
                        m1499a(bVar, 1201, (C1211c) null);
                    } else if (versionCode_ < this.f1369c.mo15809c()) {
                        C1202a.m1320d("UpdateWizard", "CheckUpdateCallBack versionCode is " + versionCode_ + "bean.getClientVersionCode() is " + this.f1369c.mo15809c());
                        m1499a(bVar, 1203, (C1211c) null);
                    } else if (TextUtils.isEmpty(downurl_) || TextUtils.isEmpty(sha256_)) {
                        m1499a(bVar, 1201, (C1211c) null);
                    } else {
                        m1499a(bVar, 1000, new C1211c(package_, versionCode_, downurl_, size_, sha256_));
                    }
                }
            } else if (intExtra == 3) {
                m1499a(bVar, 1202, (C1211c) null);
            } else {
                m1499a(bVar, 1201, (C1211c) null);
            }
        } catch (Exception e) {
            C1202a.m1320d("UpdateWizard", "intent has some error" + e.getMessage());
            m1499a(bVar, 1201, (C1211c) null);
        }
    }
}
