package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import com.p118pd.sdk.AbstractC7587o0o0O0oO;
import com.p118pd.sdk.C7588o0o0O0oo;
import com.p118pd.sdk.C7883oO0Oo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class InstallReferrerClientImpl extends InstallReferrerClient {
    public static final String OooO00o = "InstallReferrerClient";
    public static final int OooO0O0 = 80837300;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f14773OooO0O0 = "com.android.vending";
    public static final String OooO0OO = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";
    public static final String OooO0Oo = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f14774OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f14775OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ServiceConnection f14776OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IGetInstallReferrerService f14777OooO00o;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    public final class OooO0O0 implements ServiceConnection {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC7587o0o0O0oO f14778OooO00o;

        public OooO0O0(AbstractC7587o0o0O0oO o0o0o0oo) {
            if (o0o0o0oo != null) {
                this.f14778OooO00o = o0o0o0oo;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C7883oO0Oo.OooO00o(InstallReferrerClientImpl.OooO00o, "Install Referrer service connected.");
            InstallReferrerClientImpl.this.f14777OooO00o = IGetInstallReferrerService.Stub.m959a(iBinder);
            InstallReferrerClientImpl.this.f14774OooO00o = 2;
            this.f14778OooO00o.onInstallReferrerSetupFinished(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C7883oO0Oo.OooO0O0(InstallReferrerClientImpl.OooO00o, "Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.f14777OooO00o = null;
            InstallReferrerClientImpl.this.f14774OooO00o = 0;
            this.f14778OooO00o.onInstallReferrerServiceDisconnected();
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.f14775OooO00o = context.getApplicationContext();
    }

    private boolean OooO0O0() {
        try {
            if (this.f14775OooO00o.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient, com.android.installreferrer.api.InstallReferrerClient, com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14980OooO00o() {
        return (this.f14774OooO00o != 2 || this.f14777OooO00o == null || this.f14776OooO00o == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient, com.android.installreferrer.api.InstallReferrerClient, com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14979OooO00o() {
        this.f14774OooO00o = 3;
        if (this.f14776OooO00o != null) {
            C7883oO0Oo.OooO00o(OooO00o, "Unbinding from service.");
            this.f14775OooO00o.unbindService(this.f14776OooO00o);
            this.f14776OooO00o = null;
        }
        this.f14777OooO00o = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient, com.android.installreferrer.api.InstallReferrerClient, com.android.installreferrer.api.InstallReferrerClient
    public C7588o0o0O0oo OooO00o() throws RemoteException {
        if (m14980OooO00o()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f14775OooO00o.getPackageName());
            try {
                return new C7588o0o0O0oo(this.f14777OooO00o.mo9867a(bundle));
            } catch (RemoteException e) {
                C7883oO0Oo.OooO0O0(OooO00o, "RemoteException getting install referrer information");
                this.f14774OooO00o = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void OooO00o(AbstractC7587o0o0O0oO o0o0o0oo) {
        ServiceInfo serviceInfo;
        if (!m14980OooO00o()) {
            int i = this.f14774OooO00o;
            if (i == 1) {
                C7883oO0Oo.OooO0O0(OooO00o, "Client is already in the process of connecting to the service.");
                o0o0o0oo.onInstallReferrerSetupFinished(3);
            } else if (i != 3) {
                C7883oO0Oo.OooO00o(OooO00o, "Starting install referrer service setup.");
                Intent intent = new Intent(OooO0Oo);
                intent.setComponent(new ComponentName("com.android.vending", OooO0OO));
                List<ResolveInfo> queryIntentServices = this.f14775OooO00o.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                    this.f14774OooO00o = 0;
                    C7883oO0Oo.OooO00o(OooO00o, "Install Referrer service unavailable on device.");
                    o0o0o0oo.onInstallReferrerSetupFinished(2);
                    return;
                }
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null && OooO0O0()) {
                    Intent intent2 = new Intent(intent);
                    OooO0O0 oooO0O0 = new OooO0O0(o0o0o0oo);
                    this.f14776OooO00o = oooO0O0;
                    if (this.f14775OooO00o.bindService(intent2, oooO0O0, 1)) {
                        C7883oO0Oo.OooO00o(OooO00o, "Service was bonded successfully.");
                        return;
                    }
                    C7883oO0Oo.OooO0O0(OooO00o, "Connection to service is blocked.");
                    this.f14774OooO00o = 0;
                    o0o0o0oo.onInstallReferrerSetupFinished(1);
                    return;
                }
                C7883oO0Oo.OooO0O0(OooO00o, "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f14774OooO00o = 0;
                o0o0o0oo.onInstallReferrerSetupFinished(2);
            } else {
                C7883oO0Oo.OooO0O0(OooO00o, "Client was already closed and can't be reused. Please create another instance.");
                o0o0o0oo.onInstallReferrerSetupFinished(3);
            }
        } else {
            C7883oO0Oo.OooO00o(OooO00o, "Service connection is valid. No need to re-initialize.");
            o0o0o0oo.onInstallReferrerSetupFinished(0);
        }
    }
}
