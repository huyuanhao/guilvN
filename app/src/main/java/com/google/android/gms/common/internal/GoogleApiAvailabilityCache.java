package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

public class GoogleApiAvailabilityCache {
    public final SparseIntArray zaor;
    public GoogleApiAvailabilityLight zaos;

    public GoogleApiAvailabilityCache() {
        this(GoogleApiAvailability.getInstance());
    }

    public void flush() {
        this.zaor.clear();
    }

    public int getClientAvailability(@NonNull Context context, @NonNull Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int i = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int i2 = this.zaor.get(minApkVersion, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.zaor.size()) {
                i = i2;
                break;
            }
            int keyAt = this.zaor.keyAt(i3);
            if (keyAt > minApkVersion && this.zaor.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.zaos.isGooglePlayServicesAvailable(context, minApkVersion);
        }
        this.zaor.put(minApkVersion, i);
        return i;
    }

    public GoogleApiAvailabilityCache(@NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaor = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zaos = googleApiAvailabilityLight;
    }
}
