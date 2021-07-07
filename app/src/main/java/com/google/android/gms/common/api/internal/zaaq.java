package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

public final class zaaq extends zaau {
    public final /* synthetic */ zaak zagi;
    public final ArrayList<Api.Client> zago;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaaq(zaak zaak, ArrayList<Api.Client> arrayList) {
        super(zaak, null);
        this.zagi = zaak;
        this.zago = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.zaau
    @WorkerThread
    public final void zaan() {
        zaak.zad(this.zagi).zaed.zagz = zaak.zag(this.zagi);
        ArrayList<Api.Client> arrayList = this.zago;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Api.Client client = arrayList.get(i);
            i++;
            client.getRemoteService(zaak.zah(this.zagi), zaak.zad(this.zagi).zaed.zagz);
        }
    }
}
