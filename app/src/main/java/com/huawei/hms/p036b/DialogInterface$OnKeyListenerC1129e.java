package com.huawei.hms.p036b;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: com.huawei.hms.b.e */
public class DialogInterface$OnKeyListenerC1129e implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1124a f1164a;

    public DialogInterface$OnKeyListenerC1129e(AbstractC1124a aVar) {
        this.f1164a = aVar;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (4 != i || keyEvent.getAction() != 1) {
            return false;
        }
        this.f1164a.mo15402a();
        return true;
    }
}
