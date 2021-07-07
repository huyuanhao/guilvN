package com.huawei.hms.update.p058e;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.AbstractC1109a;
import com.huawei.hms.support.log.C1202a;
import com.p118pd.sdk.C8413oOoo0o;

/* renamed from: com.huawei.hms.update.e.m */
public class C1248m extends AbstractC1232a {
    /* renamed from: e */
    private boolean m1449e() {
        Activity a = mo15759a();
        if (a == null || a.isFinishing() || TextUtils.isEmpty(this.f1373g)) {
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("com.huawei.appmarket.intent.action.AppDetail");
            intent.putExtra("APP_PACKAGENAME", this.f1373g);
            intent.setPackage(C8413oOoo0o.f21545OooO0O0);
            a.startActivityForResult(intent, mo15789c());
            return true;
        } catch (ActivityNotFoundException unused) {
            C1202a.m1320d("HiappWizard", "can not open hiapp");
            return false;
        }
    }

    @Override // com.huawei.hms.update.p058e.AbstractC1232a
    /* renamed from: a */
    public void mo15761a(AbstractC1233b bVar) {
        C1202a.m1318b("HiappWizard", "Enter onCancel.");
        if (bVar instanceof C1249n) {
            mo15790d();
        }
    }

    @Override // com.huawei.hms.update.p058e.AbstractC1232a
    /* renamed from: b */
    public void mo15767b(AbstractC1233b bVar) {
        C1202a.m1318b("HiappWizard", "Enter onDoWork.");
        if (bVar instanceof C1249n) {
            bVar.mo15771c();
            if (m1449e()) {
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
    public int mo15789c() {
        return 2005;
    }

    /* renamed from: d */
    public void mo15790d() {
        mo15766b(13, this.f1372f);
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        C1262v vVar = this.f1369c;
        if (vVar != null) {
            this.f1372f = 5;
            if (vVar.mo15814g() && !TextUtils.isEmpty(this.f1374h)) {
                mo15762a(C1249n.class);
            } else if (m1449e()) {
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
        if (this.f1372f != 5 || i != mo15789c()) {
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
            C1202a.m1318b("HiappWizard", "In onKeyUp, Call finish.");
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
            C1202a.m1320d("HiappWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }
}
