package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.p118pd.sdk.C6971o0000oO0;
import java.util.Collections;
import java.util.Map;

public final class zaz implements OnCompleteListener<Map<zai<?>, String>> {
    public final /* synthetic */ zax zafh;

    public zaz(zax zax) {
        this.zafh = zax;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task<Map<zai<?>, String>> task) {
        this.zafh.zaen.lock();
        try {
            if (this.zafh.zafc) {
                if (task.isSuccessful()) {
                    this.zafh.zafd = new C6971o0000oO0(this.zafh.zaet.size());
                    for (zaw zaw : this.zafh.zaet.values()) {
                        this.zafh.zafd.put(zaw.zak(), ConnectionResult.RESULT_SUCCESS);
                    }
                } else if (task.getException() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.getException();
                    if (this.zafh.zafa) {
                        this.zafh.zafd = new C6971o0000oO0(this.zafh.zaet.size());
                        for (zaw zaw2 : this.zafh.zaet.values()) {
                            zai zak = zaw2.zak();
                            ConnectionResult connectionResult = availabilityException.getConnectionResult(zaw2);
                            if (this.zafh.zaa(zaw2, connectionResult)) {
                                this.zafh.zafd.put(zak, new ConnectionResult(16));
                            } else {
                                this.zafh.zafd.put(zak, connectionResult);
                            }
                        }
                    } else {
                        this.zafh.zafd = availabilityException.zaj();
                    }
                    this.zafh.zafg = this.zafh.zaaf();
                } else {
                    task.getException();
                    this.zafh.zafd = Collections.emptyMap();
                    this.zafh.zafg = new ConnectionResult(8);
                }
                if (this.zafh.zafe != null) {
                    this.zafh.zafd.putAll(this.zafh.zafe);
                    this.zafh.zafg = this.zafh.zaaf();
                }
                if (this.zafh.zafg == null) {
                    this.zafh.zaad();
                    this.zafh.zaae();
                } else {
                    this.zafh.zafc = false;
                    this.zafh.zaew.zac(this.zafh.zafg);
                }
                this.zafh.zaey.signalAll();
                this.zafh.zaen.unlock();
            }
        } finally {
            this.zafh.zaen.unlock();
        }
    }
}
