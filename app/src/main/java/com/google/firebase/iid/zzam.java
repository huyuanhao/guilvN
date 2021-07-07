package com.google.firebase.iid;

import android.os.Bundle;

public final class zzam extends zzak<Bundle> {
    public zzam(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // com.google.firebase.iid.zzak
    public final boolean zzab() {
        return false;
    }

    @Override // com.google.firebase.iid.zzak
    public final void zzb(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        finish(bundle2);
    }
}
