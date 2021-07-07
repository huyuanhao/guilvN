package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

public final class zae extends DialogRedirect {
    public final /* synthetic */ int val$requestCode;
    public final /* synthetic */ Intent zaog;
    public final /* synthetic */ LifecycleFragment zaoh;

    public zae(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.zaog = intent;
        this.zaoh = lifecycleFragment;
        this.val$requestCode = i;
    }

    @Override // com.google.android.gms.common.internal.DialogRedirect
    public final void redirect() {
        Intent intent = this.zaog;
        if (intent != null) {
            this.zaoh.startActivityForResult(intent, this.val$requestCode);
        }
    }
}
