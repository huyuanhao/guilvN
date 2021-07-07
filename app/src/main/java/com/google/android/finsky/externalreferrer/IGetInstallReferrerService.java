package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p026a.BinderC0915b;
import com.google.android.p026a.C0914a;
import com.google.android.p026a.C0916c;

public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Stub extends BinderC0915b implements IGetInstallReferrerService {

        public static class Proxy extends C0914a implements IGetInstallReferrerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            /* renamed from: a */
            public final Bundle mo9867a(Bundle bundle) throws RemoteException {
                Parcel a = mo9625a();
                C0916c.m956a(a, bundle);
                Parcel a2 = mo9626a(a);
                Bundle bundle2 = (Bundle) C0916c.m955a(a2, Bundle.CREATOR);
                a2.recycle();
                return bundle2;
            }
        }

        public Stub() {
            super("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        }

        /* renamed from: a */
        public static IGetInstallReferrerService m959a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (!(queryLocalInterface instanceof IGetInstallReferrerService)) {
                return new Proxy(iBinder);
            }
            return (IGetInstallReferrerService) queryLocalInterface;
        }
    }

    /* renamed from: a */
    Bundle mo9867a(Bundle bundle) throws RemoteException;
}
