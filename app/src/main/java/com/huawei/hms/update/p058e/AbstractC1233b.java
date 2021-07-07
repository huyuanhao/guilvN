package com.huawei.hms.update.p058e;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.update.e.b */
public abstract class AbstractC1233b {

    /* renamed from: a */
    public AlertDialog f1377a;

    /* renamed from: b */
    public AbstractC1232a f1378b;

    /* renamed from: a */
    public static int m1412a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }

    /* renamed from: a */
    public abstract AlertDialog mo15768a();

    /* renamed from: b */
    public void mo15770b() {
        AlertDialog alertDialog = this.f1377a;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    /* renamed from: c */
    public void mo15771c() {
        AlertDialog alertDialog = this.f1377a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* renamed from: d */
    public void mo15772d() {
        AbstractC1232a aVar = this.f1378b;
        if (aVar != null) {
            aVar.mo15761a(this);
        }
    }

    /* renamed from: e */
    public void mo15773e() {
        AbstractC1232a aVar = this.f1378b;
        if (aVar != null) {
            aVar.mo15767b(this);
        }
    }

    /* renamed from: f */
    public Activity mo15774f() {
        AbstractC1232a aVar = this.f1378b;
        if (aVar != null) {
            return aVar.mo15759a();
        }
        return null;
    }

    /* renamed from: g */
    public int mo15775g() {
        return (m1412a(mo15774f()) == 0 || Build.VERSION.SDK_INT < 16) ? 3 : 0;
    }

    /* renamed from: a */
    public void mo15769a(AbstractC1232a aVar) {
        this.f1378b = aVar;
        if (mo15774f() == null || mo15774f().isFinishing()) {
            C1202a.m1320d("AbstractDialog", "In show, The activity is null or finishing.");
            return;
        }
        AlertDialog a = mo15768a();
        this.f1377a = a;
        a.setCanceledOnTouchOutside(false);
        this.f1377a.setOnCancelListener(new DialogInterface$OnCancelListenerC1234c(this));
        this.f1377a.show();
    }
}
