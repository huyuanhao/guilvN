package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import java.util.ArrayList;
import java.util.Map;

public final class zaan extends zaau {
    public final /* synthetic */ zaak zagi;
    public final Map<Api.Client, zaam> zagk;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaan(zaak zaak, Map<Api.Client, zaam> map) {
        super(zaak, null);
        this.zagi = zaak;
        this.zagk = map;
    }

    @Override // com.google.android.gms.common.api.internal.zaau
    @WorkerThread
    public final void zaan() {
        GoogleApiAvailabilityCache googleApiAvailabilityCache = new GoogleApiAvailabilityCache(zaak.zab(this.zagi));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.zagk.keySet()) {
            if (!client.requiresGooglePlayServices() || (this.zagk.get(client).zaeb)) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        int i = -1;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                i = googleApiAvailabilityCache.getClientAvailability(zaak.zaa(this.zagi), (Api.Client) obj);
                if (i == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                i = googleApiAvailabilityCache.getClientAvailability(zaak.zaa(this.zagi), (Api.Client) obj2);
                if (i != 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            zaak.zad(this.zagi).zaa(new zaao(this, this.zagi, new ConnectionResult(i, null)));
            return;
        }
        if (zaak.zae(this.zagi)) {
            zaak.zaf(this.zagi).connect();
        }
        for (Api.Client client2 : this.zagk.keySet()) {
            zaam zaam = this.zagk.get(client2);
            if (!client2.requiresGooglePlayServices() || googleApiAvailabilityCache.getClientAvailability(zaak.zaa(this.zagi), client2) == 0) {
                client2.connect(zaam);
            } else {
                zaak.zad(this.zagi).zaa(new zaap(this, this.zagi, zaam));
            }
        }
    }
}
