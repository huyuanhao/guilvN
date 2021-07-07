package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

public final class zac extends DialogRedirect {
    public final /* synthetic */ Activity val$activity;
    public final /* synthetic */ int val$requestCode;
    public final /* synthetic */ Intent zaog;

    public zac(Intent intent, Activity activity, int i) {
        this.zaog = intent;
        this.val$activity = activity;
        this.val$requestCode = i;
    }

    @Override // com.google.android.gms.common.internal.DialogRedirect
    public final void redirect() {
        Intent intent = this.zaog;
        if (intent != null) {
            this.val$activity.startActivityForResult(intent, this.val$requestCode);
        }
    }
}
