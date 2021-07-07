package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zal;

public final class zabg extends zal {
    public final /* synthetic */ zabe zahu;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zabg(zabe zabe, Looper looper) {
        super(looper);
        this.zahu = zabe;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((zabf) message.obj).zac(this.zahu);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            sb.toString();
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
