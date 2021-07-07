package com.p118pd.sdk;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.C0116a;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.NetworkResponse;
import anetwork.channel.aidl.ParcelableRequest;
import anetwork.channel.http.NetworkSdkSetting;
import com.p118pd.sdk.AbstractC7334o0O0o0o0;
import java.io.ByteArrayOutputStream;

/* renamed from: com.pd.sdk.o0OO0o0o  reason: case insensitive filesystem */
public abstract class AbstractBinderC7375o0OO0o0o extends AbstractC7334o0O0o0o0.OooO00o {
    public static final String OooO0O0 = "anet.UnifiedNetworkDelegate";
    public static final int OooO0o = 1;
    public static final int OooO0o0 = 0;
    public int OooO0Oo = 1;

    public AbstractBinderC7375o0OO0o0o(Context context) {
        NetworkSdkSetting.init(context);
    }

    private NetworkResponse OooO0O0(ParcelableRequest parcelableRequest) {
        NetworkResponse networkResponse = new NetworkResponse();
        try {
            BinderC7636o0oOo0O0 o0ooo0o0 = (BinderC7636o0oOo0O0) m18909OooO00o(parcelableRequest);
            AbstractC7331o0O0o0OO OooO00o = o0ooo0o0.m19274OooO00o();
            if (OooO00o != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(OooO00o.length() > 0 ? OooO00o.length() : 1024);
                ByteArray a = C0116a.C0117a.f119a.mo3434a(2048);
                while (true) {
                    int read = OooO00o.read(a.getBuffer());
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(a.getBuffer(), 0, read);
                }
                networkResponse.OooO00o(byteArrayOutputStream.toByteArray());
            }
            int OooO00o2 = o0ooo0o0.OooO00o();
            if (OooO00o2 < 0) {
                networkResponse.OooO00o((byte[]) null);
            } else {
                networkResponse.OooO00o(o0ooo0o0.m19276OooO00o());
            }
            networkResponse.OooO00o(OooO00o2);
            networkResponse.OooO00o(o0ooo0o0.m19273OooO00o());
            return networkResponse;
        } catch (RemoteException e) {
            networkResponse.OooO00o(-103);
            String message = e.getMessage();
            if (!TextUtils.isEmpty(message)) {
                networkResponse.OooO00o(StringUtils.concatString(networkResponse.m14967OooO00o(), "|", message));
            }
            return networkResponse;
        } catch (Exception unused) {
            networkResponse.OooO00o(ErrorConstant.ERROR_REQUEST_FAIL);
            return networkResponse;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7334o0O0o0o0, com.p118pd.sdk.AbstractC7334o0O0o0o0
    public NetworkResponse OooO00o(ParcelableRequest parcelableRequest) throws RemoteException {
        return OooO0O0(parcelableRequest);
    }

    @Override // com.p118pd.sdk.AbstractC7334o0O0o0o0
    public AbstractC7330o0O0o0O OooO00o(ParcelableRequest parcelableRequest, AbstractC7332o0O0o0Oo o0o0o0oo) throws RemoteException {
        try {
            return OooO00o(new C7503o0OoOoO(parcelableRequest, this.OooO0Oo, false), o0o0o0oo);
        } catch (Exception e) {
            ALog.m288e(OooO0O0, "asyncSend failed", parcelableRequest.o0OO00O, e, new Object[0]);
            throw new RemoteException(e.getMessage());
        }
    }

    private AbstractC7330o0O0o0O OooO00o(C7503o0OoOoO o0ooooo, AbstractC7332o0O0o0Oo o0o0o0oo) throws RemoteException {
        return new BinderC7336o0O0o0oo(new o0OOO00(o0ooooo, new o0OO00OO(o0o0o0oo, o0ooooo)).OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC7334o0O0o0o0, com.p118pd.sdk.AbstractC7334o0O0o0o0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7326o0O0o00 m18909OooO00o(ParcelableRequest parcelableRequest) throws RemoteException {
        try {
            C7503o0OoOoO o0ooooo = new C7503o0OoOoO(parcelableRequest, this.OooO0Oo, true);
            BinderC7636o0oOo0O0 o0ooo0o0 = new BinderC7636o0oOo0O0(o0ooooo);
            o0ooo0o0.OooO00o(OooO00o(o0ooooo, new BinderC9150oooOO0(o0ooo0o0, null, null)));
            return o0ooo0o0;
        } catch (Exception e) {
            ALog.m288e(OooO0O0, "asyncSend failed", parcelableRequest.o0OO00O, e, new Object[0]);
            throw new RemoteException(e.getMessage());
        }
    }
}
