package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zal;

public final class zaco extends zal {
    public final /* synthetic */ zacm zakv;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaco(zacm zacm, Looper looper) {
        super(looper);
        this.zakv = zacm;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            PendingResult<?> pendingResult = (PendingResult) message.obj;
            synchronized (this.zakv.zadn) {
                if (pendingResult == null) {
                    this.zakv.zako.zad((zacm) new Status(13, "Transform returned null"));
                } else if (pendingResult instanceof zacd) {
                    this.zakv.zako.zad((zacm) ((zacd) pendingResult).getStatus());
                } else {
                    this.zakv.zako.zaa(pendingResult);
                }
            }
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(70);
            sb.append("TransformationResultHandler received unknown message type: ");
            sb.append(i);
            sb.toString();
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String valueOf = String.valueOf(runtimeException.getMessage());
            if (valueOf.length() != 0) {
                "Runtime exception on the transformation worker thread: ".concat(valueOf);
            } else {
                new String("Runtime exception on the transformation worker thread: ");
            }
            throw runtimeException;
        }
    }
}
