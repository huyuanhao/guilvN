package com.huawei.hms.update.p058e;

import android.app.AlertDialog;
import com.huawei.hms.p037c.AbstractC1139h;

/* renamed from: com.huawei.hms.update.e.n */
public class C1249n extends AbstractC1233b {

    /* renamed from: a */
    public String f1386a = AbstractC1139h.m1086d("hms_update_title");

    @Override // com.huawei.hms.update.p058e.AbstractC1233b
    /* renamed from: a */
    public AlertDialog mo15768a() {
        int c = AbstractC1139h.m1085c("hms_update_message_new");
        int c2 = AbstractC1139h.m1085c("hms_install");
        AlertDialog.Builder builder = new AlertDialog.Builder(mo15774f(), mo15775g());
        builder.setMessage(mo15774f().getString(c, new Object[]{this.f1386a}));
        builder.setPositiveButton(c2, new DialogInterface$OnClickListenerC1250o(this));
        builder.setNegativeButton(AbstractC1139h.m1085c("hms_cancel"), new DialogInterface$OnClickListenerC1251p(this));
        return builder.create();
    }

    /* renamed from: a */
    public void mo15791a(String str) {
        this.f1386a = str;
    }
}
