package com.google.firebase.iid;

import android.os.Bundle;
import com.taobao.accs.utl.BaseMonitor;

public final class zzaj extends zzak<Void> {
    public zzaj(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // com.google.firebase.iid.zzak
    public final boolean zzab() {
        return true;
    }

    @Override // com.google.firebase.iid.zzak
    public final void zzb(Bundle bundle) {
        if (bundle.getBoolean(BaseMonitor.COUNT_ACK, false)) {
            finish(null);
        } else {
            zza(new zzal(4, "Invalid response to one way request"));
        }
    }
}
