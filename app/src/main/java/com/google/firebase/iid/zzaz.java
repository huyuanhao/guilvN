package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.Nullable;

@VisibleForTesting
public final class zzaz extends BroadcastReceiver {
    @Nullable
    public zzay zzdk;

    public zzaz(zzay zzay) {
        this.zzdk = zzay;
    }

    public final void onReceive(Context context, Intent intent) {
        zzay zzay = this.zzdk;
        if (zzay != null && zzay.zzao()) {
            FirebaseInstanceId.zzl();
            FirebaseInstanceId.zza(this.zzdk, 0);
            this.zzdk.getContext().unregisterReceiver(this);
            this.zzdk = null;
        }
    }

    public final void zzap() {
        FirebaseInstanceId.zzl();
        this.zzdk.getContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
}
