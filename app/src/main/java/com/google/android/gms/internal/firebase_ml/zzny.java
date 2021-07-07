package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.GmsLogger;
import com.p118pd.sdk.C7265o0O000oo;
import com.xiaomi.mipush.sdk.Constants;

public final class zzny implements BackgroundDetector.BackgroundStateChangeListener {
    public final /* synthetic */ zznx zzaqd;

    public zzny(zznx zznx) {
        this.zzaqd = zznx;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        GmsLogger gmsLogger = zznx.zzape;
        StringBuilder sb = new StringBuilder(34);
        sb.append("Background state changed to: ");
        sb.append(z);
        gmsLogger.mo10810v("ModelResourceManager", sb.toString());
        this.zzaqd.zzapy.set(z ? C7265o0O000oo.OooO0o.OooO00o : Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL);
        this.zzaqd.zzlq();
    }
}
