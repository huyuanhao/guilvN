package com.huawei.hms.update.p058e;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.support.log.C1202a;
import com.netease.nis.captcha.Captcha;
import com.umeng.socialize.net.dplus.CommonNetImpl;

/* renamed from: com.huawei.hms.update.e.l */
public class C1247l extends AbstractC1232a {
    /* renamed from: e */
    private boolean m1443e() {
        Activity a = mo15759a();
        if (a == null || a.isFinishing() || this.f1369c == null || TextUtils.isEmpty(this.f1376j)) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://a.vmall.com/app/" + this.f1376j));
            intent.setFlags(CommonNetImpl.FLAG_AUTH);
            a.startActivityForResult(intent, mo15787c());
            mo15760a(0, this.f1372f);
            return true;
        } catch (ActivityNotFoundException unused) {
            C1202a.m1320d("HiappWebWizard", "can not find web to hold update hms apk");
            return false;
        }
    }

    @Override // com.huawei.hms.update.p058e.AbstractC1232a
    /* renamed from: a */
    public void mo15761a(AbstractC1233b bVar) {
        C1202a.m1316a("HiappWebWizard", "Enter onCancel.");
        if (bVar instanceof C1249n) {
            mo15788d();
        }
    }

    @Override // com.huawei.hms.update.p058e.AbstractC1232a
    /* renamed from: b */
    public void mo15767b(AbstractC1233b bVar) {
        C1202a.m1316a("HiappWebWizard", "Enter onDoWork.");
        if (bVar instanceof C1249n) {
            bVar.mo15771c();
            if (!m1443e()) {
                mo15766b(8, this.f1372f);
            }
        }
    }

    /* renamed from: c */
    public int mo15787c() {
        return Captcha.WEB_VIEW_HTTPS_ERROR;
    }

    /* renamed from: d */
    public void mo15788d() {
        mo15766b(13, this.f1372f);
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        C1262v vVar = this.f1369c;
        if (vVar != null) {
            this.f1372f = 4;
            if (vVar.mo15814g() && !TextUtils.isEmpty(this.f1374h)) {
                mo15762a(C1249n.class);
            } else if (!m1443e()) {
                mo15766b(8, this.f1372f);
            }
        }
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onBridgeActivityDestroy() {
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.AbstractC1109a
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.activity.AbstractC1109a, com.huawei.hms.update.p058e.AbstractC1232a
    public void onKeyUp(int i, KeyEvent keyEvent) {
        if (4 == i) {
            C1202a.m1318b("HiappWebWizard", "In onKeyUp, Call finish.");
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
            C1202a.m1320d("HiappWebWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }
}
