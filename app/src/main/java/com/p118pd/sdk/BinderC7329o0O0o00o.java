package com.p118pd.sdk;

import android.os.RemoteException;
import anetwork.channel.aidl.NetworkService;
import com.p118pd.sdk.AbstractC7328o0O0o00O;

/* renamed from: com.pd.sdk.o0O0o00o  reason: case insensitive filesystem */
public class BinderC7329o0O0o00o extends AbstractC7328o0O0o00O.OooO00o {
    public final /* synthetic */ NetworkService OooO00o;

    public BinderC7329o0O0o00o(NetworkService networkService) {
        this.OooO00o = networkService;
    }

    @Override // com.p118pd.sdk.AbstractC7328o0O0o00O
    public AbstractC7334o0O0o0o0 OooO00o(int i) throws RemoteException {
        return i == 1 ? NetworkService.OooO00o(this.OooO00o) : NetworkService.OooO0O0(this.OooO00o);
    }
}
