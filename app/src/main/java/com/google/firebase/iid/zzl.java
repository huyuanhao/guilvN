package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public class zzl implements Parcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    public Messenger zzag;
    public zzv zzah;

    public static final class zza extends ClassLoader {
        @Override // java.lang.ClassLoader
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            FirebaseInstanceId.zzl();
            return zzl.class;
        }
    }

    public zzl(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.zzag = new Messenger(iBinder);
        } else {
            this.zzah = new zzw(iBinder);
        }
    }

    private final IBinder getBinder() {
        Messenger messenger = this.zzag;
        return messenger != null ? messenger.getBinder() : this.zzah.asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return getBinder().equals(((zzl) obj).getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return getBinder().hashCode();
    }

    public final void send(Message message) throws RemoteException {
        Messenger messenger = this.zzag;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.zzah.send(message);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.zzag;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.zzah.asBinder());
        }
    }
}
