package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.zac;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class zacp {
    public static final Status zakw = new Status(8, "The connection to Google Play services was lost");
    public static final BasePendingResult<?>[] zakx = new BasePendingResult[0];
    public final Map<Api.AnyClientKey<?>, Api.Client> zagy;
    @VisibleForTesting
    public final Set<BasePendingResult<?>> zaky = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public final zacs zakz = new zacq(this);

    public zacp(Map<Api.AnyClientKey<?>, Api.Client> map) {
        this.zagy = map;
    }

    public final void release() {
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.zaky.toArray(zakx);
        for (BasePendingResult basePendingResult : basePendingResultArr) {
            zac zac = null;
            basePendingResult.zaa((zacs) null);
            if (basePendingResult.zam() != null) {
                basePendingResult.setResultCallback(null);
                IBinder serviceBrokerBinder = this.zagy.get(((BaseImplementation.ApiMethodImpl) basePendingResult).getClientKey()).getServiceBrokerBinder();
                if (basePendingResult.isReady()) {
                    basePendingResult.zaa(new zacr(basePendingResult, null, serviceBrokerBinder, null));
                } else if (serviceBrokerBinder == null || !serviceBrokerBinder.isBinderAlive()) {
                    basePendingResult.zaa((zacs) null);
                    basePendingResult.cancel();
                    zac.remove(basePendingResult.zam().intValue());
                } else {
                    zacr zacr = new zacr(basePendingResult, null, serviceBrokerBinder, null);
                    basePendingResult.zaa(zacr);
                    try {
                        serviceBrokerBinder.linkToDeath(zacr, 0);
                    } catch (RemoteException unused) {
                        basePendingResult.cancel();
                        zac.remove(basePendingResult.zam().intValue());
                    }
                }
                this.zaky.remove(basePendingResult);
            } else if (basePendingResult.zat()) {
                this.zaky.remove(basePendingResult);
            }
        }
    }

    public final void zab(BasePendingResult<? extends Result> basePendingResult) {
        this.zaky.add(basePendingResult);
        basePendingResult.zaa(this.zakz);
    }

    public final void zabx() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zaky.toArray(zakx)) {
            basePendingResult.zab(zakw);
        }
    }
}
