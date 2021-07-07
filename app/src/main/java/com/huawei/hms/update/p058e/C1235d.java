package com.huawei.hms.update.p058e;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import com.huawei.hms.p037c.AbstractC1139h;

/* renamed from: com.huawei.hms.update.e.d */
public class C1235d extends AbstractC1233b {
    @Override // com.huawei.hms.update.p058e.AbstractC1233b
    /* renamed from: a */
    public AlertDialog mo15768a() {
        ProgressDialog progressDialog = new ProgressDialog(mo15774f(), mo15775g());
        progressDialog.setMessage(AbstractC1139h.m1086d("hms_checking"));
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }
}
