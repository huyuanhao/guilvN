package com.google.firebase.iid;

import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;

public interface zzv extends IInterface {
    void send(Message message) throws RemoteException;
}
