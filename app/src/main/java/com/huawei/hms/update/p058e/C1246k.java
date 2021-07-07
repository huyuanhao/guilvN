package com.huawei.hms.update.p058e;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.AbstractC1109a;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.update.e.k */
public class C1246k extends AbstractC1232a {
    /* renamed from: e */
    private boolean m1437e() {
        Activity a = mo15759a();
        if (a == null || a.isFinishing() || TextUtils.isEmpty(this.f1373g)) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.f1373g));
            intent.setPackage("com.android.vending");
            a.startActivityForResult(intent, mo15785c());
            return true;
        } catch (ActivityNotFoundException unused) {
            C1202a.m1320d("GooglePlayWizard", "can not open google play");
            return false;
        }
    }

    @Override // com.huawei.hms.update.p058e.AbstractC1232a
    /* renamed from: a */
    public void mo15761a(AbstractC1233b bVar) {
        C1202a.m1318b("GooglePlayWizard", "Enter onCancel.");
        if (bVar instanceof C1249n) {
            mo15786d();
        }
    }

    @Override // com.huawei.hms.update.p058e.AbstractC1232a
    /* renamed from: b */
    public void mo15767b(AbstractC1233b bVar) {
        C1202a.m1318b("GooglePlayWizard", "Enter onDoWork.");
        if (bVar instanceof C1249n) {
            bVar.mo15771c();
            if (m1437e()) {
                return;
            }
            if (!mo15764a(false)) {
                mo15766b(8, this.f1372f);
            } else {
                mo15760a(8, this.f1372f);
            }
        }
    }

    /* renamed from: c */
    public int mo15785c() {
        return 2002;
    }

    /* renamed from: d */
    public void mo15786d() {
        mo15766b(13, this.f1372f);
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        C1262v vVar = this.f1369c;
        if (vVar != null) {
            this.f1372f = 2;
            if (vVar.mo15814g() && !TextUtils.isEmpty(this.f1374h)) {
                mo15762a(C1249n.class);
            } else if (m1437e()) {
            } else {
                if (!mo15764a(false)) {
                    mo15766b(8, this.f1372f);
                } else {
                    mo15760a(8, this.f1372f);
                }
            }
        }
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onBridgeActivityDestroy() {
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.AbstractC1109a
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        AbstractC1109a aVar;
        if (this.f1371e && (aVar = this.f1368b) != null) {
            return aVar.onBridgeActivityResult(i, i2, intent);
        }
        if (this.f1372f != 2 || i != mo15785c()) {
            return false;
        }
        if (mo15763a(this.f1373g, this.f1375i)) {
            mo15766b(0, this.f1372f);
            return true;
        }
        mo15766b(8, this.f1372f);
        return true;
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onKeyUp(int i, KeyEvent keyEvent) {
        AbstractC1109a aVar;
        if (this.f1371e && (aVar = this.f1368b) != null) {
            aVar.onKeyUp(i, keyEvent);
        } else if (4 == i) {
            C1202a.m1318b("GooglePlayWizard", "In onKeyUp, Call finish.");
            Activity a = mo15759a();
            if (a != null && !a.isFinishing()) {
                a.setResult(0, null);
                a.finish();
            }
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
            bVar.mo15769a(this);
            this.f1370d = bVar;
        } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
            C1202a.m1320d("GooglePlayWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }
}
