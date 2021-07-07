package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;

public final class zza extends AsyncTask<Void, Void, Integer> {
    public final /* synthetic */ Context val$context;
    public final /* synthetic */ ProviderInstaller.ProviderInstallListener zziw;

    public zza(Context context, ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.val$context = context;
        this.zziw = providerInstallListener;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final Integer doInBackground(Void... voidArr) {
        try {
            ProviderInstaller.installIfNeeded(this.val$context);
            return 0;
        } catch (GooglePlayServicesRepairableException e) {
            return Integer.valueOf(e.getConnectionStatusCode());
        } catch (GooglePlayServicesNotAvailableException e2) {
            return Integer.valueOf(e2.errorCode);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Integer num) {
        Integer num2 = num;
        if (num2.intValue() == 0) {
            this.zziw.onProviderInstalled();
            return;
        }
        this.zziw.onProviderInstallFailed(num2.intValue(), ProviderInstaller.zzal().getErrorResolutionIntent(this.val$context, num2.intValue(), "pi"));
    }
}
