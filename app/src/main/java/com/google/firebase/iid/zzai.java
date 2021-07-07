package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public final class zzai {
    public final Messenger zzag;
    public final zzl zzce;

    public zzai(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.zzag = new Messenger(iBinder);
            this.zzce = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.zzce = new zzl(iBinder);
            this.zzag = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            } else {
                new String("Invalid interface descriptor: ");
            }
            throw new RemoteException();
        }
    }

    public final void send(Message message) throws RemoteException {
        Messenger messenger = this.zzag;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzl zzl = this.zzce;
        if (zzl != null) {
            zzl.send(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
