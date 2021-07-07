package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;

public final class zaah implements zabd {
    public final zabe zafs;
    public boolean zaft = false;

    public zaah(zabe zabe) {
        this.zafs = zabe;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void begin() {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void connect() {
        if (this.zaft) {
            this.zaft = false;
            this.zafs.zaa(new zaaj(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final boolean disconnect() {
        if (this.zaft) {
            return false;
        }
        if (this.zafs.zaed.zaax()) {
            this.zaft = true;
            for (zacm zacm : this.zafs.zaed.zahd) {
                zacm.zabv();
            }
            return false;
        }
        this.zafs.zaf(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        return (T) execute(t);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T extends com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.zabd
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t) {
        try {
            this.zafs.zaed.zahe.zab(t);
            zaaw zaaw = this.zafs.zaed;
            Api.Client client = zaaw.zagy.get(t.getClientKey());
            Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !this.zafs.zaho.containsKey(t.getClientKey())) {
                boolean z = client instanceof SimpleClientAdapter;
                Object obj = client;
                if (z) {
                    obj = ((SimpleClientAdapter) client).getClient();
                }
                t.run(obj == 1 ? 1 : 0);
                return t;
            }
            t.setFailedResult(new Status(17));
            return t;
        } catch (DeadObjectException unused) {
            this.zafs.zaa(new zaai(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void onConnected(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void onConnectionSuspended(int i) {
        this.zafs.zaf(null);
        this.zafs.zahs.zab(i, this.zaft);
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    public final void zaam() {
        if (this.zaft) {
            this.zaft = false;
            this.zafs.zaed.zahe.release();
            disconnect();
        }
    }
}
