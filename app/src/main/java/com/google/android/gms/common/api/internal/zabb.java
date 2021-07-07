package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zal;

public final class zabb extends zal {
    public final /* synthetic */ zaaw zahg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zabb(zaaw zaaw, Looper looper) {
        super(looper);
        this.zahg = zaaw;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.zahg.zaav();
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            sb.toString();
        } else {
            this.zahg.resume();
        }
    }
}
