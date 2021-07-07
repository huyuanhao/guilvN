package com.p118pd.sdk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.alipay.android.app.IRemoteServiceCallback;

/* renamed from: com.pd.sdk.o0Ooo0o0  reason: case insensitive filesystem */
public class BinderC7523o0Ooo0o0 extends IRemoteServiceCallback.Stub {
    public final /* synthetic */ C7533o0OoooO0 OooO00o;

    public BinderC7523o0Ooo0o0(C7533o0OoooO0 o0ooooo0) {
        this.OooO00o = o0ooooo0;
    }

    @Override // com.alipay.android.app.IRemoteServiceCallback
    public boolean isHideLoadingScreen() throws RemoteException {
        return false;
    }

    @Override // com.alipay.android.app.IRemoteServiceCallback
    public void payEnd(boolean z, String str) throws RemoteException {
    }

    @Override // com.alipay.android.app.IRemoteServiceCallback
    public void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException {
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putInt("CallingPid", i);
            intent.putExtras(bundle);
        } catch (Exception unused) {
        }
        intent.setClassName(str, str2);
        if (C7533o0OoooO0.OooO00o(this.OooO00o) != null) {
            C7533o0OoooO0.OooO00o(this.OooO00o).startActivity(intent);
        }
        C7533o0OoooO0.OooO00o(this.OooO00o).mo27272b();
    }
}
