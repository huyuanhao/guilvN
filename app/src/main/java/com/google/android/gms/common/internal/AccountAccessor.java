package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.IAccountAccessor;

public class AccountAccessor extends IAccountAccessor.Stub {
    @KeepForSdk
    public static Account getAccountBinderSafe(IAccountAccessor iAccountAccessor) {
        if (iAccountAccessor != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return iAccountAccessor.getAccount();
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account getAccount() {
        throw new NoSuchMethodError();
    }
}
