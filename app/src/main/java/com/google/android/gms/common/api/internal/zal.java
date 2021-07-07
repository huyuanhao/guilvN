package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zal extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean mStarted;
    public final GoogleApiAvailability zacc;
    public final AtomicReference<zam> zade;
    public final Handler zadf;

    public zal(LifecycleFragment lifecycleFragment) {
        this(lifecycleFragment, GoogleApiAvailability.getInstance());
    }

    public static int zaa(@Nullable zam zam) {
        if (zam == null) {
            return -1;
        }
        return zam.zar();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zal.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCancel(DialogInterface dialogInterface) {
        zaa(new ConnectionResult(13, null), zaa(this.zade.get()));
        zaq();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zade.set(bundle.getBoolean("resolving_error", false) ? new zam(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zam zam = this.zade.get();
        if (zam != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", zam.zar());
            bundle.putInt("failed_status", zam.getConnectionResult().getErrorCode());
            bundle.putParcelable("failed_resolution", zam.getConnectionResult().getResolution());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.mStarted = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.mStarted = false;
    }

    public abstract void zaa(ConnectionResult connectionResult, int i);

    public final void zab(ConnectionResult connectionResult, int i) {
        zam zam = new zam(connectionResult, i);
        if (this.zade.compareAndSet(null, zam)) {
            this.zadf.post(new zan(this, zam));
        }
    }

    public abstract void zao();

    public final void zaq() {
        this.zade.set(null);
        zao();
    }

    @VisibleForTesting
    public zal(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zade = new AtomicReference<>(null);
        this.zadf = new com.google.android.gms.internal.base.zal(Looper.getMainLooper());
        this.zacc = googleApiAvailability;
    }
}
