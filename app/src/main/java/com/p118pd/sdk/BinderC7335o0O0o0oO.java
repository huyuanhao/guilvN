package com.p118pd.sdk;

import android.os.RemoteException;
import com.p118pd.sdk.AbstractC7325o0O0o0;

/* renamed from: com.pd.sdk.o0O0o0oO  reason: case insensitive filesystem */
public class BinderC7335o0O0o0oO extends AbstractC7325o0O0o0.OooO00o {
    public static final String OooO0O0 = "anet.ParcelableBodyHandlerWrapper";
    public AbstractC7318o0O0OoO0 OooO00o;

    public BinderC7335o0O0o0oO(AbstractC7318o0O0OoO0 o0o0ooo0) {
        this.OooO00o = o0o0ooo0;
    }

    @Override // com.p118pd.sdk.AbstractC7325o0O0o0
    public boolean OooO00o() throws RemoteException {
        AbstractC7318o0O0OoO0 o0o0ooo0 = this.OooO00o;
        if (o0o0ooo0 != null) {
            return o0o0ooo0.OooO00o();
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7325o0O0o0
    public int read(byte[] bArr) throws RemoteException {
        AbstractC7318o0O0OoO0 o0o0ooo0 = this.OooO00o;
        if (o0o0ooo0 != null) {
            return o0o0ooo0.read(bArr);
        }
        return 0;
    }

    public String toString() {
        return super.toString() + " handle:" + this.OooO00o;
    }
}
